package org.limlee.coreanimator2androidlib;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.renderscript.Float2;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public class AnimatorViewGroup extends FrameLayout implements AnimatorUIGroup {
    private static final String TAG = AnimatorViewGroup.class.getSimpleName();

    public RectF bounds;
    public PointF position;
    public Float2 scale;
    public float rotation;
    public PointF anchorPoint;
    public float alpha = 1.0f;

    public AnimatorViewGroup(Context context) {
        super(context);
    }

    public AnimatorViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimatorViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public RectF getUIBounds() {
        return bounds;
    }

    @Override
    public Float2 getUIScale() {
        return scale;
    }

    @Override
    public PointF getUIPosition() {
        return position;
    }

    @Override
    public float getUIRotation() {
        return rotation;
    }

    @Override
    public PointF getUIAnchorPoint() {
        return anchorPoint;
    }

    @Override
    public float getUIAlpha() {
        return alpha;
    }

    @Override
    public void addViewWithName(View view, String name) {
        setViewsByName(view, name);
        addAnimatorUIView(view);
    }

    @Override
    public View findViewsByName(String name) {
        return findViewWithTag(name);
    }

    @Override
    public void setViewsByName(View view, String name) {
        view.setTag(name);
    }

    protected void addAnimatorUIView(final View view) {
        if (!(view instanceof AnimatorUIView)) return;
        final RectF bounds = ((AnimatorUIView) view).getUIBounds();
        if (null != bounds) {
            float viewWidth = bounds.width();
            float viewHeight = bounds.height();
            if ((int) viewWidth >= 0
                    && (int) viewHeight >= 0) {
                final ViewGroup.LayoutParams layoutParams = generateDefaultLayoutParams();
                layoutParams.width = (int) viewWidth;
                layoutParams.height = (int) viewHeight;
                final PointF position = ((AnimatorUIView) view).getUIPosition(); //centerPoint
                PointF correctPointF = null;
                float positionX;
                float positionY;
                if (null != position) {
                    positionX = position.x;
                    positionY = position.y;
                    //修正后的坐标
                    correctPointF = new PointF(positionX - layoutParams.width / 2.0f
                            , positionY - layoutParams.height / 2.0f);
                }
                final float correctLeft = null != correctPointF ? correctPointF.x : 0f;
                final float correctTop = null != correctPointF ? correctPointF.y : 0f;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        //修正位置
                        if (view.getLeft() != correctLeft
                                || view.getTop() != correctTop) {
                            final float offsetX = correctLeft - view.getLeft();
                            final float offsetY = correctTop - view.getTop();
                            view.layout((int) correctLeft, (int) correctTop, view.getRight() + (int) offsetX
                                    , view.getBottom() + (int) offsetY);
                        }
                    }
                });
                final float rotationF = ((AnimatorUIView) view).getUIRotation();
                if (rotationF > 0) {
                    ViewCompat.setRotation(view, (float) (rotationF / Math.PI * 180d));
                }
                final PointF anchorPoint = ((AnimatorUIView) view).getUIAnchorPoint();
                if (null != anchorPoint) {
                    view.setPivotX(anchorPoint.x);
                    view.setPivotY(anchorPoint.y);
                }
                if (view instanceof AnimatorUIGroup
                        && view instanceof ViewGroup) {
                    ((ViewGroup) view).setClipChildren(false);
                }
                view.setAlpha(((AnimatorUIView) view).getUIAlpha());
                Float2 scale = ((AnimatorUIView) view).getUIScale();
                if (null != scale) {
                    view.setScaleX(scale.x);
                    view.setScaleY(scale.y);
                }
                addView(view, layoutParams);
            }
        }
    }
}
