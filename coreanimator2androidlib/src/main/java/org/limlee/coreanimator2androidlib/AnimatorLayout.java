package org.limlee.coreanimator2androidlib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.renderscript.Float2;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public abstract class AnimatorLayout extends FrameLayout implements AnimatorUIGroup {
    private static final String TAG = AnimatorLayout.class.getSimpleName();
    @ContentMode.Type
    private int contentMode;
    private AnimatorViewGroup mScalingView;
    protected UIViewHelper mUIViewHelper;
    protected BitmapLoader mBitmapLoader;
    protected boolean mIsSetupFinished;
    protected boolean mIsAddedAnimator;
    protected boolean mIsPlayingAnim;
    private List<Animator> mViewAnimators = new ArrayList<>();
    private AnimatorSet mAnimatorSet = new AnimatorSet();
    private Runnable mPostAnimRunnable = new Runnable() {
        @Override
        public void run() {
            mAnimatorSet.start();
        }
    };
    private Subscription mLoadUIResSubscription;
    private AnimatorTextView mTitleView;

    /**
     * abstract
     */
    /**
     * 动画播放区域
     *
     * @return
     */
    protected abstract RectF initFrame();

    /**
     * 动画名字
     *
     * @return
     */
    protected abstract String name();

    /**
     * 在这里添加动画所需要的视图
     *
     * @return
     */
    protected abstract boolean setupHierarchy();

    /**
     * 为已经添加的视图添加动画
     *
     * @return
     */
    protected abstract boolean addAnimation();

    /**
     * 动画的时长
     *
     * @return
     */
    protected abstract long duration();


    /**
     * do not implement
     */
    @Override
    public RectF getUIBounds() {
        return null;
    }

    @Override
    public Float2 getUIScale() {
        return null;
    }

    @Override
    public PointF getUIPosition() {
        return null;
    }

    @Override
    public float getUIRotation() {
        return 0;
    }

    @Override
    public PointF getUIAnchorPoint() {
        return null;
    }

    @Override
    public float getUIAlpha() {
        return 0;
    }

    /**
     * timing funs
     */
    protected final Interpolator linearTiming = new LinearInterpolator();
    protected final Interpolator defaultTiming = PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1f);
    protected final Interpolator easeInOutTiming = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f);
    protected final Interpolator easeInTiming = PathInterpolatorCompat.create(0.42f, 0f, 1f, 1f);
    protected final Interpolator easeOutTiming = PathInterpolatorCompat.create(0f, 0f, 0.58f, 1.0f);
    protected final Interpolator instantTiming = PathInterpolatorCompat.create(0.25f, 0.10f, 0.25f, 1.0f);
    protected final Interpolator anticipateTiming = PathInterpolatorCompat.create(0.42f, 0f, 1.00f, 1.00f);
    protected final Interpolator accelerateTiming = new DecelerateInterpolator();

    public AnimatorLayout(Context context) {
        this(context, null);
    }

    public AnimatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AnimatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (isInEditMode()) return;
        if (isDebug()) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        mUIViewHelper = new UIViewHelper(context);
        mBitmapLoader = new BitmapLoader(context, name(), DisplayMetrics.DENSITY_XHIGH); //默认是2倍图资源
        mScalingView = new AnimatorViewGroup(getContext());
        mIsSetupFinished = setupHierarchy();
        if (mIsSetupFinished) {
            addScalingView();
            mIsAddedAnimator = addAnimation() && !mViewAnimators.isEmpty();
            initAnimator();
        }
    }

    protected int contentMode() {
        return contentMode;
    }

    protected boolean isDebug() {
        return true;
    }

    /**
     * 动画播放速率
     *
     * @return
     */
    protected int rate() {
        return 1;
    }

    public void setTitle(CharSequence title) {
        if (mTitleView != null) {
            mTitleView.setText(title);
        }
    }

    private void initAnimator() {
        mAnimatorSet.playTogether(mViewAnimators);
        mAnimatorSet.addListener(new AnimatorListenerAdapter() {
            private TimeAnimator mTimeAnimator = new TimeAnimator();

            @Override
            public void onAnimationStart(Animator animation) {
                final long duration = duration() * rate();
                mTimeAnimator.setTimeListener(new TimeAnimator.TimeListener() {
                    @Override
                    public void onTimeUpdate(TimeAnimator animation, long totalTime, long deltaTime) {
                        if (totalTime >= duration) {
                            mAnimatorSet.cancel();
                        }
                    }
                });
                mTimeAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        mTimeAnimator.setTimeListener(null);
                        mTimeAnimator.removeAllListeners();
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        mTimeAnimator.setTimeListener(null);
                        mTimeAnimator.removeAllListeners();
                    }
                });
                mTimeAnimator.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                clearUIImageBitmap();
                mTimeAnimator.cancel();
                mIsPlayingAnim = false;
                mLoadUIResSubscription = null;
            }
        });
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
        mAnimatorSet.removeAllListeners();
        mViewAnimators.clear();
    }

    protected void addScalingView() {
        if (isDebug()) {
            mScalingView.setBackgroundColor(Color.parseColor("#0D000000"));
        }
        setViewsByName(mScalingView, "__scaling__");
        mScalingView.setClipChildren(false);
        mScalingView.setClipToPadding(false);
        LayoutParams scalingViewLp = generateDefaultLayoutParams();
        RectF scalingRect = initFrame();
        if (null != scalingRect) {
            scalingViewLp = new LayoutParams((int) scalingRect.width(),
                    (int) scalingRect.height());
        }
        scalingViewLp.gravity = Gravity.CENTER;
        mScalingView.getViewTreeObserver().addOnGlobalLayoutListener(
                new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        if (!mIsSetupFinished) return;
                        mScalingView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        final int parentWidth = getWidth();
                        final int parentHeight = getHeight();
                        float xScale = (float) parentWidth / mScalingView.getWidth();
                        float yScale = (float) parentHeight / mScalingView.getHeight();
                        float scale;
                        switch (contentMode) {
                            case ContentMode.CONTENT_MODE_SCALETOFILL:
                                break;
                            case ContentMode.CONTENT_MODE_SCALEASPECTFILL:
                                scale = Math.max(xScale, yScale);
                                xScale = scale;
                                yScale = scale;
                                break;
                            default:
                                scale = Math.min(xScale, yScale);
                                xScale = scale;
                                yScale = scale;
                                break;
                        }
                        if (isDebug()) {
                            xScale = 1.0f;
                            yScale = 1.0f;
                        }
                        mScalingView.setScaleX(xScale);
                        mScalingView.setScaleY(yScale);
                        final float titleScaleX = 1.0f / xScale;
                        final float titleScaleY = 1.0f / yScale;
                        if (null != mTitleView) {
                            mTitleView.setScaleX(titleScaleX);
                            mTitleView.setScaleY(titleScaleY);
                        }
                    }
                });
        addView(mScalingView, scalingViewLp);
    }

    public void play() {
        if (!mIsSetupFinished
                || !mIsAddedAnimator
                || mIsPlayingAnim
                || mAnimatorSet.isStarted()
                || mAnimatorSet.isRunning()) {
            return;
        }
        mIsPlayingAnim = true;
        mLoadUIResSubscription = loadUIImageBitmap()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean aBoolean) {
                        if (aBoolean) {
                            postOnAnimation(mPostAnimRunnable);
                        } else {
                            mIsPlayingAnim = false;
                        }
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        mIsPlayingAnim = false;
                    }
                });
    }

    public void stop() {
        if (null != mLoadUIResSubscription
                && !mLoadUIResSubscription.isUnsubscribed()) {
            mLoadUIResSubscription.unsubscribe();
        }
        removeCallbacks(mPostAnimRunnable);
        mAnimatorSet.cancel();
    }

    public boolean isRunning() {
        return (mAnimatorSet.isStarted()
                || mAnimatorSet.isRunning())
                && mIsPlayingAnim;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void pause() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mAnimatorSet.pause();
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void resume() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mAnimatorSet.resume();
        }
    }

    @Override
    public View findViewsByName(@NonNull String name) {
        return findViewWithTag(name);
    }

    @Override
    public void setViewsByName(@NonNull View view, @NonNull String name) {
        view.setTag(name);
    }

    @Override
    public void addViewWithName(@NonNull View view, @NonNull String name) {
        setViewsByName(view, name);
        addViewToScalingView(view);
    }

    private Map<View, Bitmap> loadChildUIImageBitmap(ViewGroup viewGroup) {
        final int childCount = viewGroup.getChildCount();
        final Map<View, Bitmap> viewBitmapMap = new HashMap<>();
        for (int i = 0; i < childCount; i++) {
            View view = viewGroup.getChildAt(i);
            if (view instanceof ViewGroup
                    && view instanceof AnimatorUIGroup) {
                Map<View, Bitmap> viewGroupBitmapMap = loadChildUIImageBitmap((ViewGroup) view);
                if (!viewGroupBitmapMap.isEmpty()) {
                    viewBitmapMap.putAll(viewGroupBitmapMap);
                }
            } else {
                if (view instanceof ImageView
                        && view instanceof AnimatorUIImage) {
                    final String imageName = ((AnimatorUIImage) view).getImage();
                    if (!TextUtils.isEmpty(imageName)) {
                        Bitmap imageBitmap = mBitmapLoader.load(imageName);
                        if (null != imageBitmap) {
                            viewBitmapMap.put(view, imageBitmap);
                        } else {
                            Log.w(TAG, "** Warning: Could not create image from  " + imageName +
                                    ". Please make sure that it is added to the project directly (not in a folder reference).");
                        }
                    }
                }
            }
        }
        return viewBitmapMap;
    }

    private Observable<Boolean> loadUIImageBitmap() {
        return Observable.just((Void) null)
                .observeOn(Schedulers.io())
                .map(new Func1<Void, Map<View, Bitmap>>() {
                    @Override
                    public Map<View, Bitmap> call(Void aVoid) {
                        return loadChildUIImageBitmap(mScalingView);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<Map<View, Bitmap>, Boolean>() {
                    @Override
                    public Boolean call(Map<View, Bitmap> viewBitmapMap) {
                        for (Map.Entry<View, Bitmap> entry : viewBitmapMap.entrySet()) {
                            ((ImageView) entry.getKey()).setImageBitmap(entry.getValue());
                        }
                        return !viewBitmapMap.isEmpty();
                    }
                });
    }

    protected void clearUIImageBitmap() {
        clearChildUIImageBitmap(mScalingView);
    }

    protected void clearChildUIImageBitmap(ViewGroup viewGroup) {
        final int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = viewGroup.getChildAt(i);
            if (view instanceof ViewGroup
                    && view instanceof AnimatorUIGroup) {
                clearChildUIImageBitmap((ViewGroup) view);
            } else {
                if (view instanceof ImageView
                        && view instanceof AnimatorUIImage) {
                    ((ImageView) view).setImageBitmap(null);
                }
            }
        }
    }

    private void addViewToScalingView(View view) {
        mScalingView.addAnimatorUIView(view);
    }

    public void addAnimation(View view, @NonNull KeyFrameAnimation keyFrameAnimation) {
        if (null != view) {
            PropertyValuesHolder propertyValuesHolder = keyFrameAnimation.toPropertValuesHolder();
            if (null != propertyValuesHolder) {
                ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolder);
                objectAnimator.setStartDelay((long) (keyFrameAnimation.beginTime * 1000f) * rate());
                objectAnimator.setDuration((long) (keyFrameAnimation.duration * 1000f) * rate());
                objectAnimator.setRepeatCount(keyFrameAnimation.repeatCount);
                if (keyFrameAnimation.repeatCount == ValueAnimator.INFINITE) {
                    objectAnimator.setRepeatMode(ValueAnimator.RESTART);
                }
                if (keyFrameAnimation.autoreverses) {
                    objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
                }
                objectAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {
                        super.onAnimationCancel(animation);
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                    }
                });
                mViewAnimators.add(objectAnimator);
            }
        }
    }

    protected AnimatorTextView getTitleView() {
        mTitleView = mUIViewHelper.newTextView();
        mTitleView.setLines(2);
        mTitleView.setEllipsize(TextUtils.TruncateAt.END);
        mTitleView.setTextSize(14);
        mTitleView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP);
        mTitleView.setTextColor(getResources().getColor(android.R.color.white));
        return mTitleView;
    }

    public static class ContentMode {
        public static final int CONTENT_MODE_SCALETOFILL = 1;
        public static final int CONTENT_MODE_SCALEASPECTFILL = 2;

        @IntDef({CONTENT_MODE_SCALETOFILL, CONTENT_MODE_SCALEASPECTFILL})
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }
    }

}
