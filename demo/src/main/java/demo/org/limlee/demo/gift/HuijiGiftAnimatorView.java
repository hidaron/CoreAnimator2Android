package demo.org.limlee.demo.gift;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.renderscript.Float2;
import android.util.AttributeSet;

import org.limlee.coreanimator2androidlib.AnimatorImageView;
import org.limlee.coreanimator2androidlib.AnimatorLayout;
import org.limlee.coreanimator2androidlib.AnimatorTextView;
import org.limlee.coreanimator2androidlib.KeyFrameAnimation;


public class HuijiGiftAnimatorView extends AnimatorLayout {

    public HuijiGiftAnimatorView(Context context) {
        super(context);
    }

    public HuijiGiftAnimatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HuijiGiftAnimatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected RectF initFrame() {
        return new RectF(0, 0, 750f, 680f);
    }

    protected String name() {
        return "huiji";
    }

    @Override
    protected boolean isDebug() {
        return false;
    }

    @Override
    protected long duration() {
        return 5700;
    }

    @Override
    protected boolean setupHierarchy() {

        //core animator自动生成的oc代码
//        UIImageView *花瓣粉2 = [UIImageView new];
//        花瓣粉2.bounds = CGRectMake(0, 0, 62.0, 60.0);
//        UIImage *img花瓣粉2 = [UIImage imageWithContentsOfFile:[bundle pathForResource:@"花瓣粉_2.png" ofType:nil]];
//        if ( img花瓣粉2 == nil ) { NSLog(@"** Warning: Could not create image from '花瓣粉_2.png'. Please make sure that it is added to the project directly (not in a folder reference)."); }
//        花瓣粉2.image = img花瓣粉2;
//        花瓣粉2.contentMode = UIViewContentModeCenter;
//        花瓣粉2.layer.position = CGPointMake(375.000, 340.000);
//        [__scaling__ addSubview:花瓣粉2];
//        viewsByName[@"花瓣粉_2"] = 花瓣粉2;

        AnimatorImageView huabanfen_2 = mUIViewHelper.newImageView();
        huabanfen_2.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanfen_2.position = new PointF(375.000f, 340.000f);
        huabanfen_2.alpha = 0.0f;
        huabanfen_2.image = "huabanfen_2";
        addViewWithName(huabanfen_2, "huabanfen_2");

        AnimatorImageView huabanlv_1 = mUIViewHelper.newImageView();
        huabanlv_1.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanlv_1.position = new PointF(449.370f, 367.589f);
        huabanlv_1.scale = new Float2(0.58f, 0.58f);
        huabanlv_1.alpha = 0.0f;
        huabanlv_1.image = "huabanlv_1";
        addViewWithName(huabanlv_1, "huabanlv_1");

        AnimatorImageView huabanfen_3 = mUIViewHelper.newImageView();
        huabanfen_3.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanfen_3.position = new PointF(232.844f, 249.307f);
        huabanfen_3.scale = new Float2(0.58f, 0.58f);
        huabanfen_3.alpha = 0.0f;
        huabanfen_3.image = "huabanfen_3";
        addViewWithName(huabanfen_3, "huabanfen_3");

        AnimatorImageView huabanfen_4 = mUIViewHelper.newImageView();
        huabanfen_4.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanfen_4.position = new PointF(612.812f, 193.818f);
        huabanfen_4.scale = new Float2(0.58f, 0.58f);
        huabanfen_4.alpha = 0.0f;
        huabanfen_4.image = "huabanfen_4";
        addViewWithName(huabanfen_4, "huabanfen_4");

        AnimatorImageView huabanlv_2 = mUIViewHelper.newImageView();
        huabanlv_2.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanlv_2.position = new PointF(552.167f, 249.896f);
        huabanlv_2.scale = new Float2(0.58f, 0.58f);
        huabanlv_2.alpha = 0.0f;
        huabanlv_2.image = "huabanlv_2";
        addViewWithName(huabanlv_2, "huabanlv_2");

        AnimatorImageView huabanzi_1 = mUIViewHelper.newImageView();
        huabanzi_1.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanzi_1.position = new PointF(127.286f, 276.745f);
        huabanzi_1.scale = new Float2(0.58f, 0.58f);
        huabanzi_1.alpha = 0.0f;
        huabanzi_1.image = "huabanzi_1";
        addViewWithName(huabanzi_1, "huabanzi_1");

        AnimatorImageView huabanzi = mUIViewHelper.newImageView();
        huabanzi.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanzi.position = new PointF(645.896f, 283.349f);
        huabanzi.scale = new Float2(0.58f, 0.58f);
        huabanzi.alpha = 0.0f;
        huabanzi.image = "huabanzi";
        addViewWithName(huabanzi, "huabanzi");

        AnimatorImageView huabanlv = mUIViewHelper.newImageView();
        huabanlv.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanlv.position = new PointF(645.896f, 283.349f);
        huabanlv.scale = new Float2(0.58f, 0.58f);
        huabanlv.alpha = 0.0f;
        huabanlv.image = "huabanlv";
        addViewWithName(huabanlv, "huabanlv");

        AnimatorImageView huabanfen = mUIViewHelper.newImageView();
        huabanfen.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanfen.position = new PointF(645.896f, 283.349f);
        huabanfen.scale = new Float2(0.58f, 0.58f);
        huabanfen.alpha = 0.0f;
        huabanfen.image = "huabanfen";
        addViewWithName(huabanfen, "huabanfen");

        AnimatorImageView huabanfen_1 = mUIViewHelper.newImageView();
        huabanfen_1.bounds = new RectF(0, 0, 62.0f, 60.0f);
        huabanfen_1.position = new PointF(326.115f, 273.443f);
        huabanfen_1.scale = new Float2(0.58f, 0.58f);
        huabanfen_1.alpha = 0.0f;
        huabanfen_1.image = "huabanfen_1";
        addViewWithName(huabanfen_1, "huabanfen_1");

        AnimatorImageView huiji = mUIViewHelper.newImageView();
        huiji.bounds = new RectF(0, 0, 850.0f, 600.0f);
        huiji.position = new PointF(976.027f, 149.898f);
        huiji.scale = new Float2(0.48f, 0.48f);
        huiji.image = "huiji";
        addViewWithName(huiji, "huiji");

        AnimatorImageView luoxuanjiang_2 = mUIViewHelper.newImageView();
        luoxuanjiang_2.bounds = new RectF(0, 0, 850.0f, 600.0f);
        luoxuanjiang_2.position = new PointF(976.027f, 149.898f);
        luoxuanjiang_2.scale = new Float2(0.48f, 0.48f);
        luoxuanjiang_2.image = "luoxuanjiang_2";
        addViewWithName(luoxuanjiang_2, "luoxuanjiang_2");

        AnimatorImageView luoxuanjiang_1 = mUIViewHelper.newImageView();
        luoxuanjiang_1.bounds = new RectF(0, 0, 850.0f, 600.0f);
        luoxuanjiang_1.position = new PointF(976.027f, 149.898f);
        luoxuanjiang_1.scale = new Float2(0.48f, 0.48f);
        luoxuanjiang_1.image = "luoxuanjiang_1";
        addViewWithName(luoxuanjiang_1, "luoxuanjiang_1");

        AnimatorTextView afont = getTitleView();
        afont.bounds = new RectF(0, 0, 803.0f, 140.0f);
        afont.position = new PointF(-220.685f, 39.945f);
        afont.scale = new Float2(0.93f, 0.93f);
        addViewWithName(afont, "afont");
        return true;
    }

    @Override
    protected boolean addAnimation() {

        //core animator自动生成的oc代码
//        CAKeyframeAnimation *花瓣绿1RotationAnimation = [CAKeyframeAnimation animationWithKeyPath:@"transform.rotation.z"];
//        花瓣绿1RotationAnimation.duration = 0.750;
//        花瓣绿1RotationAnimation.values = @[@(0.000), @(6.283)];
//        花瓣绿1RotationAnimation.keyTimes = @[@(0.000), @(1.000)];
//        花瓣绿1RotationAnimation.timingFunctions = @[linearTiming];
//        花瓣绿1RotationAnimation.repeatCount = HUGE_VALF;
//        花瓣绿1RotationAnimation.beginTime = beginTime;
//        花瓣绿1RotationAnimation.fillMode = fillMode;
//        花瓣绿1RotationAnimation.removedOnCompletion = removedOnCompletion;
//        [[self.viewsByName[@"花瓣绿_1"] layer] addAnimation:花瓣绿1RotationAnimation forKey:@"Untitled Animation_Rotation"];

        KeyFrameAnimation 花瓣绿1RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣绿1RotationAnimation.duration = 0.750f;
        花瓣绿1RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣绿1RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣绿1RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣绿1RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanlv_1"), 花瓣绿1RotationAnimation);

        KeyFrameAnimation 花瓣绿1OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣绿1OpacityAnimation.duration = 5.700f;
        花瓣绿1OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣绿1OpacityAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.368f, 0.368f, 1.000f};
        花瓣绿1OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv_1"), 花瓣绿1OpacityAnimation);

        KeyFrameAnimation 花瓣绿1TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣绿1TranslationXAnimation.duration = 5.700f;
        花瓣绿1TranslationXAnimation.values = new float[]{0.000f, -59.708f, -59.708f, -91.953f, -153.516f, -153.516f};
        花瓣绿1TranslationXAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.368f, 0.368f, 0.860f, 1.000f};
        花瓣绿1TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv_1"), 花瓣绿1TranslationXAnimation);

        KeyFrameAnimation 花瓣绿1TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣绿1TranslationYAnimation.duration = 5.700f;
        花瓣绿1TranslationYAnimation.values = new float[]{0.000f, -104.729f, -104.729f, -142.823f, 376.740f, 376.740f};
        花瓣绿1TranslationYAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.368f, 0.368f, 0.860f, 1.000f};
        花瓣绿1TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv_1"), 花瓣绿1TranslationYAnimation);

        KeyFrameAnimation 花瓣粉1RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣粉1RotationAnimation.duration = 0.750f;
        花瓣粉1RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣粉1RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣粉1RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣粉1RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanfen_1"), 花瓣粉1RotationAnimation);

        KeyFrameAnimation 花瓣粉1OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣粉1OpacityAnimation.duration = 5.700f;
        花瓣粉1OpacityAnimation.values = new float[]{0.000f, 0.000f, 1.000f, 1.000f};
        花瓣粉1OpacityAnimation.keyTimes = new float[]{0.000f, 0.254f, 0.254f, 1.000f};
        花瓣粉1OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_1"), 花瓣粉1OpacityAnimation);

        KeyFrameAnimation 花瓣粉1TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣粉1TranslationXAnimation.duration = 5.700f;
        花瓣粉1TranslationXAnimation.values = new float[]{0.000f, 0.000f, -1.589f, -12.927f, -12.927f};
        花瓣粉1TranslationXAnimation.keyTimes = new float[]{0.000f, 0.254f, 0.254f, 0.860f, 1.000f};
        花瓣粉1TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_1"), 花瓣粉1TranslationXAnimation);

        KeyFrameAnimation 花瓣粉1TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣粉1TranslationYAnimation.duration = 5.700f;
        花瓣粉1TranslationYAnimation.values = new float[]{0.000f, 0.000f, -54.123f, 424.547f, 424.547f};
        花瓣粉1TranslationYAnimation.keyTimes = new float[]{0.000f, 0.254f, 0.254f, 0.860f, 1.000f};
        花瓣粉1TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_1"), 花瓣粉1TranslationYAnimation);

        KeyFrameAnimation 花瓣绿2RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣绿2RotationAnimation.duration = 0.750f;
        花瓣绿2RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣绿2RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣绿2RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣绿2RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanlv_2"), 花瓣绿2RotationAnimation);

        KeyFrameAnimation 花瓣绿2OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣绿2OpacityAnimation.duration = 5.700f;
        花瓣绿2OpacityAnimation.values = new float[]{0.000f, 0.000f, 1.000f, 1.000f};
        花瓣绿2OpacityAnimation.keyTimes = new float[]{0.000f, 0.131f, 0.132f, 1.000f};
        花瓣绿2OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv_2"), 花瓣绿2OpacityAnimation);

        KeyFrameAnimation 花瓣绿2TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣绿2TranslationXAnimation.duration = 5.700f;
        花瓣绿2TranslationXAnimation.values = new float[]{0.000f, -8.031f, -8.031f, -5.167f, -36.542f, -36.542f};
        花瓣绿2TranslationXAnimation.keyTimes = new float[]{0.000f, 0.001f, 0.088f, 0.088f, 0.500f, 1.000f};
        花瓣绿2TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv_2"), 花瓣绿2TranslationXAnimation);

        KeyFrameAnimation 花瓣绿2TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣绿2TranslationYAnimation.duration = 5.700f;
        花瓣绿2TranslationYAnimation.values = new float[]{0.000f, -21.957f, -21.957f, -48.469f, 452.474f, 452.474f};
        花瓣绿2TranslationYAnimation.keyTimes = new float[]{0.000f, 0.001f, 0.088f, 0.088f, 0.500f, 1.000f};
        花瓣绿2TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv_2"), 花瓣绿2TranslationYAnimation);

        KeyFrameAnimation 花瓣粉2RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣粉2RotationAnimation.duration = 0.750f;
        花瓣粉2RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣粉2RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣粉2RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣粉2RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanfen_2"), 花瓣粉2RotationAnimation);

        KeyFrameAnimation 花瓣粉2OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣粉2OpacityAnimation.duration = 5.700f;
        花瓣粉2OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣粉2OpacityAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.000f, 0.342f, 0.342f, 1.000f};
        花瓣粉2OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_2"), 花瓣粉2OpacityAnimation);

        KeyFrameAnimation 花瓣粉2ScaleXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.x");
        花瓣粉2ScaleXAnimation.duration = 5.700f;
        花瓣粉2ScaleXAnimation.values = new float[]{1.000f, 0.580f, 0.580f};
        花瓣粉2ScaleXAnimation.keyTimes = new float[]{0.000f, 0.000f, 1.000f};
        花瓣粉2ScaleXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_2"), 花瓣粉2ScaleXAnimation);

        KeyFrameAnimation 花瓣粉2ScaleYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.y");
        花瓣粉2ScaleYAnimation.duration = 5.700f;
        花瓣粉2ScaleYAnimation.values = new float[]{1.000f, 0.580f, 0.580f};
        花瓣粉2ScaleYAnimation.keyTimes = new float[]{0.000f, 0.000f, 1.000f};
        花瓣粉2ScaleYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_2"), 花瓣粉2ScaleYAnimation);

        KeyFrameAnimation 花瓣粉2TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣粉2TranslationXAnimation.duration = 5.700f;
        花瓣粉2TranslationXAnimation.values = new float[]{0.000f, -110.911f, -110.911f, -130.693f, -205.073f, -205.073f};
        花瓣粉2TranslationXAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.342f, 0.342f, 0.851f, 1.000f};
        花瓣粉2TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_2"), 花瓣粉2TranslationXAnimation);

        KeyFrameAnimation 花瓣粉2TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣粉2TranslationYAnimation.duration = 5.700f;
        花瓣粉2TranslationYAnimation.values = new float[]{0.000f, -61.948f, -61.948f, -104.063f, 367.359f, 367.359f};
        花瓣粉2TranslationYAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.342f, 0.342f, 0.851f, 1.000f};
        花瓣粉2TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_2"), 花瓣粉2TranslationYAnimation);

        KeyFrameAnimation 花瓣紫RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣紫RotationAnimation.duration = 0.750f;
        花瓣紫RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣紫RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣紫RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣紫RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanzi"), 花瓣紫RotationAnimation);

        KeyFrameAnimation 花瓣紫OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣紫OpacityAnimation.duration = 5.700f;
        花瓣紫OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣紫OpacityAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.162f, 0.162f, 1.000f};
        花瓣紫OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanzi"), 花瓣紫OpacityAnimation);

        KeyFrameAnimation 花瓣紫TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣紫TranslationXAnimation.duration = 5.700f;
        花瓣紫TranslationXAnimation.values = new float[]{0.000f, -181.000f, -181.000f, -257.184f, -251.969f, -251.969f};
        花瓣紫TranslationXAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.162f, 0.162f, 0.789f, 1.000f};
        花瓣紫TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanzi"), 花瓣紫TranslationXAnimation);

        KeyFrameAnimation 花瓣紫TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣紫TranslationYAnimation.duration = 5.700f;
        花瓣紫TranslationYAnimation.values = new float[]{0.000f, -43.005f, -43.005f, -75.281f, 431.255f, 431.255f};
        花瓣紫TranslationYAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.162f, 0.162f, 0.789f, 1.000f};
        花瓣紫TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, easeOutTiming, linearTiming};
        addAnimation(findViewsByName("huabanzi"), 花瓣紫TranslationYAnimation);

        KeyFrameAnimation 花瓣紫1OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣紫1OpacityAnimation.duration = 5.700f;
        花瓣紫1OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣紫1OpacityAnimation.keyTimes = new float[]{0.000f, 0.001f, 0.342f, 0.342f, 1.000f};
        花瓣紫1OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanzi_1"), 花瓣紫1OpacityAnimation);

        KeyFrameAnimation 花瓣紫1TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣紫1TranslationXAnimation.duration = 5.700f;
        花瓣紫1TranslationXAnimation.values = new float[]{0.000f, 0.000f, 189.776f, 131.849f, 131.849f};
        花瓣紫1TranslationXAnimation.keyTimes = new float[]{0.000f, 0.342f, 0.342f, 0.833f, 1.000f};
        花瓣紫1TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanzi_1"), 花瓣紫1TranslationXAnimation);

        KeyFrameAnimation 花瓣紫1TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣紫1TranslationYAnimation.duration = 5.700f;
        花瓣紫1TranslationYAnimation.values = new float[]{0.000f, 0.000f, -38.620f, 436.750f, 436.750f};
        花瓣紫1TranslationYAnimation.keyTimes = new float[]{0.000f, 0.342f, 0.342f, 0.833f, 1.000f};
        花瓣紫1TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanzi_1"), 花瓣紫1TranslationYAnimation);

        KeyFrameAnimation 飞机动画素材ScaleXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.x");
        飞机动画素材ScaleXAnimation.duration = 5.700f;
        飞机动画素材ScaleXAnimation.values = new float[]{0.483f, 0.542f, 0.636f, 0.636f};
        飞机动画素材ScaleXAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 1.000f};
        飞机动画素材ScaleXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huiji"), 飞机动画素材ScaleXAnimation);

        KeyFrameAnimation 飞机动画素材ScaleYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.y");
        飞机动画素材ScaleYAnimation.duration = 5.700f;
        飞机动画素材ScaleYAnimation.values = new float[]{0.483f, 0.542f, 0.636f, 0.636f};
        飞机动画素材ScaleYAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 1.000f};
        飞机动画素材ScaleYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huiji"), 飞机动画素材ScaleYAnimation);

        KeyFrameAnimation 飞机动画素材TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        飞机动画素材TranslationXAnimation.duration = 5.700f;
        飞机动画素材TranslationXAnimation.values = new float[]{0.000f, -435.579f, -654.424f, -1533.303f, -1533.303f};
        飞机动画素材TranslationXAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        飞机动画素材TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huiji"), 飞机动画素材TranslationXAnimation);

        KeyFrameAnimation 飞机动画素材TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        飞机动画素材TranslationYAnimation.duration = 5.700f;
        飞机动画素材TranslationYAnimation.values = new float[]{0.000f, 48.051f, 89.648f, 118.563f, 118.563f};
        飞机动画素材TranslationYAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        飞机动画素材TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huiji"), 飞机动画素材TranslationYAnimation);

        KeyFrameAnimation 花瓣粉3RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣粉3RotationAnimation.duration = 0.750f;
        花瓣粉3RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣粉3RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣粉3RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣粉3RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanfen_3"), 花瓣粉3RotationAnimation);

        KeyFrameAnimation 花瓣粉3OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣粉3OpacityAnimation.duration = 5.700f;
        花瓣粉3OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣粉3OpacityAnimation.keyTimes = new float[]{0.000f, 0.001f, 0.658f, 0.658f, 1.000f};
        花瓣粉3OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_3"), 花瓣粉3OpacityAnimation);

        KeyFrameAnimation 花瓣粉3TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣粉3TranslationXAnimation.duration = 5.700f;
        花瓣粉3TranslationXAnimation.values = new float[]{0.000f, 0.000f, -22.229f, -16.193f};
        花瓣粉3TranslationXAnimation.keyTimes = new float[]{0.000f, 0.526f, 0.526f, 1.000f};
        花瓣粉3TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_3"), 花瓣粉3TranslationXAnimation);

        KeyFrameAnimation 花瓣粉3TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣粉3TranslationYAnimation.duration = 5.700f;
        花瓣粉3TranslationYAnimation.values = new float[]{0.000f, 0.000f, -7.589f, 453.589f};
        花瓣粉3TranslationYAnimation.keyTimes = new float[]{0.000f, 0.526f, 0.526f, 1.000f};
        花瓣粉3TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_3"), 花瓣粉3TranslationYAnimation);

        KeyFrameAnimation 花瓣粉4RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣粉4RotationAnimation.duration = 0.750f;
        花瓣粉4RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣粉4RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣粉4RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣粉4RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanfen_4"), 花瓣粉4RotationAnimation);

        KeyFrameAnimation 花瓣粉4OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣粉4OpacityAnimation.duration = 5.700f;
        花瓣粉4OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣粉4OpacityAnimation.keyTimes = new float[]{0.000f, 0.001f, 0.079f, 0.079f, 1.000f};
        花瓣粉4OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_4"), 花瓣粉4OpacityAnimation);

        KeyFrameAnimation 花瓣粉4TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣粉4TranslationXAnimation.duration = 5.700f;
        花瓣粉4TranslationXAnimation.values = new float[]{0.000f, 0.000f, 6.318f, 11.875f, 11.875f};
        花瓣粉4TranslationXAnimation.keyTimes = new float[]{0.000f, 0.053f, 0.053f, 0.482f, 1.000f};
        花瓣粉4TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_4"), 花瓣粉4TranslationXAnimation);

        KeyFrameAnimation 花瓣粉4TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣粉4TranslationYAnimation.duration = 5.700f;
        花瓣粉4TranslationYAnimation.values = new float[]{0.000f, 0.000f, -11.464f, 510.870f, 510.870f};
        花瓣粉4TranslationYAnimation.keyTimes = new float[]{0.000f, 0.053f, 0.053f, 0.482f, 1.000f};
        花瓣粉4TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen_4"), 花瓣粉4TranslationYAnimation);

        KeyFrameAnimation 螺旋桨02OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        螺旋桨02OpacityAnimation.duration = 5.700f;
        螺旋桨02OpacityAnimation.values = new float[]{0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 0.000f};
        螺旋桨02OpacityAnimation.keyTimes = new float[]{0.000f, 0.044f, 0.088f, 0.132f, 0.175f, 0.219f, 0.263f, 0.307f, 0.351f, 0.395f, 0.439f, 0.482f, 0.526f, 0.570f, 0.614f, 0.658f, 0.702f, 0.746f, 0.789f, 0.833f, 0.877f, 1.000f};
        螺旋桨02OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_2"), 螺旋桨02OpacityAnimation);

        KeyFrameAnimation 螺旋桨02ScaleXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.x");
        螺旋桨02ScaleXAnimation.duration = 5.700f;
        螺旋桨02ScaleXAnimation.values = new float[]{0.483f, 0.542f, 0.636f, 0.636f};
        螺旋桨02ScaleXAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 1.000f};
        螺旋桨02ScaleXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_2"), 螺旋桨02ScaleXAnimation);

        KeyFrameAnimation 螺旋桨02ScaleYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.y");
        螺旋桨02ScaleYAnimation.duration = 5.700f;
        螺旋桨02ScaleYAnimation.values = new float[]{0.483f, 0.542f, 0.636f, 0.636f};
        螺旋桨02ScaleYAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 1.000f};
        螺旋桨02ScaleYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_2"), 螺旋桨02ScaleYAnimation);

        KeyFrameAnimation 螺旋桨02TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        螺旋桨02TranslationXAnimation.duration = 5.700f;
        螺旋桨02TranslationXAnimation.values = new float[]{0.000f, -435.579f, -654.424f, -1533.303f, -1533.303f};
        螺旋桨02TranslationXAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        螺旋桨02TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_2"), 螺旋桨02TranslationXAnimation);

        KeyFrameAnimation 螺旋桨02TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        螺旋桨02TranslationYAnimation.duration = 5.700f;
        螺旋桨02TranslationYAnimation.values = new float[]{0.000f, 48.051f, 89.648f, 118.563f, 118.563f};
        螺旋桨02TranslationYAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        螺旋桨02TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_2"), 螺旋桨02TranslationYAnimation);

        KeyFrameAnimation 花瓣粉RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣粉RotationAnimation.duration = 0.750f;
        花瓣粉RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣粉RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣粉RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣粉RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanfen"), 花瓣粉RotationAnimation);

        KeyFrameAnimation 花瓣粉OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣粉OpacityAnimation.duration = 5.700f;
        花瓣粉OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣粉OpacityAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.131f, 0.132f, 1.000f};
        花瓣粉OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen"), 花瓣粉OpacityAnimation);

        KeyFrameAnimation 花瓣粉TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣粉TranslationXAnimation.duration = 5.700f;
        花瓣粉TranslationXAnimation.values = new float[]{0.000f, -225.026f, -225.026f, -205.260f, -205.260f};
        花瓣粉TranslationXAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.131f, 0.132f, 1.000f};
        花瓣粉TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen"), 花瓣粉TranslationXAnimation);

        KeyFrameAnimation 花瓣粉TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣粉TranslationYAnimation.duration = 5.700f;
        花瓣粉TranslationYAnimation.values = new float[]{0.000f, -13.484f, -13.484f, -75.281f, 418.104f, 418.104f};
        花瓣粉TranslationYAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.131f, 0.132f, 0.789f, 1.000f};
        花瓣粉TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, easeInOutTiming, linearTiming};
        addAnimation(findViewsByName("huabanfen"), 花瓣粉TranslationYAnimation);

        KeyFrameAnimation 花瓣绿RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
        花瓣绿RotationAnimation.duration = 0.750f;
        花瓣绿RotationAnimation.values = new float[]{0.000f, 6.283f};
        花瓣绿RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
        花瓣绿RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
        花瓣绿RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
        addAnimation(findViewsByName("huabanlv"), 花瓣绿RotationAnimation);

        KeyFrameAnimation 花瓣绿OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        花瓣绿OpacityAnimation.duration = 5.700f;
        花瓣绿OpacityAnimation.values = new float[]{0.000f, 0.000f, 0.000f, 1.000f, 1.000f};
        花瓣绿OpacityAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.180f, 0.180f, 1.000f};
        花瓣绿OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv"), 花瓣绿OpacityAnimation);

        KeyFrameAnimation 花瓣绿TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        花瓣绿TranslationXAnimation.duration = 5.700f;
        花瓣绿TranslationXAnimation.values = new float[]{0.000f, -120.677f, -120.677f, -205.260f, -279.750f, -279.750f};
        花瓣绿TranslationXAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.180f, 0.180f, 0.789f, 1.000f};
        花瓣绿TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv"), 花瓣绿TranslationXAnimation);

        KeyFrameAnimation 花瓣绿TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        花瓣绿TranslationYAnimation.duration = 5.700f;
        花瓣绿TranslationYAnimation.values = new float[]{0.000f, -27.318f, -27.318f, -75.281f, 419.312f, 419.312f};
        花瓣绿TranslationYAnimation.keyTimes = new float[]{0.000f, 0.000f, 0.180f, 0.180f, 0.789f, 1.000f};
        花瓣绿TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, instantTiming, instantTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("huabanlv"), 花瓣绿TranslationYAnimation);

        KeyFrameAnimation 螺旋桨01OpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        螺旋桨01OpacityAnimation.duration = 5.700f;
        螺旋桨01OpacityAnimation.values = new float[]{0.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 0.000f, 1.000f, 1.000f};
        螺旋桨01OpacityAnimation.keyTimes = new float[]{0.000f, 0.044f, 0.088f, 0.132f, 0.175f, 0.219f, 0.263f, 0.307f, 0.351f, 0.395f, 0.439f, 0.482f, 0.526f, 0.570f, 0.614f, 0.658f, 0.702f, 0.746f, 0.789f, 0.833f, 0.877f, 1.000f};
        螺旋桨01OpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_1"), 螺旋桨01OpacityAnimation);

        KeyFrameAnimation 螺旋桨01ScaleXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.x");
        螺旋桨01ScaleXAnimation.duration = 5.700f;
        螺旋桨01ScaleXAnimation.values = new float[]{0.483f, 0.542f, 0.636f, 0.636f};
        螺旋桨01ScaleXAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 1.000f};
        螺旋桨01ScaleXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_1"), 螺旋桨01ScaleXAnimation);

        KeyFrameAnimation 螺旋桨01ScaleYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.scale.y");
        螺旋桨01ScaleYAnimation.duration = 5.700f;
        螺旋桨01ScaleYAnimation.values = new float[]{0.483f, 0.542f, 0.636f, 0.636f};
        螺旋桨01ScaleYAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 1.000f};
        螺旋桨01ScaleYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_1"), 螺旋桨01ScaleYAnimation);

        KeyFrameAnimation 螺旋桨01TranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        螺旋桨01TranslationXAnimation.duration = 5.700f;
        螺旋桨01TranslationXAnimation.values = new float[]{0.000f, -435.579f, -654.424f, -1533.303f, -1533.303f};
        螺旋桨01TranslationXAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        螺旋桨01TranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_1"), 螺旋桨01TranslationXAnimation);

        KeyFrameAnimation 螺旋桨01TranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        螺旋桨01TranslationYAnimation.duration = 5.700f;
        螺旋桨01TranslationYAnimation.values = new float[]{0.000f, 48.051f, 89.648f, 118.563f, 118.563f};
        螺旋桨01TranslationYAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        螺旋桨01TranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("luoxuanjiang_1"), 螺旋桨01TranslationYAnimation);

        KeyFrameAnimation afontOpacityAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("opacity");
        afontOpacityAnimation.duration = 5.700f;
        afontOpacityAnimation.values = new float[]{1f, 1f, 0f, 0f};
        afontOpacityAnimation.keyTimes = new float[]{0.000f, 0.658f, 0.877f, 1.000f};
        afontOpacityAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("afont"), afontOpacityAnimation);

        KeyFrameAnimation afontTranslationXAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.x");
        afontTranslationXAnimation.duration = 5.700f;
        afontTranslationXAnimation.values = new float[]{1490.000f, 1060.000f, 740.000f, -60.000f, -60.000f};
        afontTranslationXAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        afontTranslationXAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("afont"), afontTranslationXAnimation);

        KeyFrameAnimation afontTranslationYAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.translation.y");
        afontTranslationYAnimation.duration = 5.700f;
        afontTranslationYAnimation.values = new float[]{40.000f, 80f, 100f, 120f, 120f};
        afontTranslationYAnimation.keyTimes = new float[]{0.000f, 0.132f, 0.658f, 0.877f, 1.000f};
        afontTranslationYAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming, linearTiming, linearTiming, linearTiming};
        addAnimation(findViewsByName("afont"), afontTranslationYAnimation);
        return true;
    }

}
