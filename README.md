# CoreAnimator2Android
直播大礼物实现方案，使用core aminator制作动画，把导出的oc代码翻译为android这边的动画实现

![image](https://github.com/hidaron/CoreAnimator2Android/blob/master/demo.gif)

## 飞机大礼物实现解析

````
public class HuijiGiftAnimatorView extends AnimatorLayout { //所有的大动画礼物都需要继承AnimatorLayout

    ....
    @Override
    protected RectF initFrame() { //初始化动画画布
        return new RectF(0, 0, 750f, 680f);
    }
    
    @Override
    protected long duration() { //动画时长
        return 5700;
    }
    
    @Override
    protected boolean setupHierarchy() { //添加动画视图，这些参数都是由core aminator生成(导出OC代码)的，在这里就直接搬过来用就行了
    	AnimatorImageView huabanfen_2 = mUIViewHelper.newImageView();
    	huabanfen_2.bounds = new RectF(0, 0, 62.0f, 60.0f);
    	huabanfen_2.position = new PointF(375.000f, 340.000f);
    	huabanfen_2.alpha = 0.0f;
    	huabanfen_2.image = "huabanfen_2";
    	addViewWithName(huabanfen_2, "huabanfen_2");
    	
    	/**
    	**这部分是core aminator导出的代码，上面的是翻译使用Android api实现的代码
    	**/
    	//UIImageView *花瓣粉2 = [UIImageView new];
	//花瓣粉2.bounds = CGRectMake(0, 0, 62.0, 60.0);
	//UIImage *img花瓣粉2 = [UIImage imageWithContentsOfFile:[bundle pathForResource:@"花瓣粉_2.png" ofType:nil]];
	//if ( img花瓣粉2 == nil ) { NSLog(@"** Warning: Could not create image from '花瓣粉_2.png'. Please make sure that it 	//is added to the project directly (not in a folder reference)."); }
	//花瓣粉2.image = img花瓣粉2;
	//花瓣粉2.contentMode = UIViewContentModeCenter;
	//花瓣粉2.layer.position = CGPointMake(375.000, 340.000);
	//[__scaling__ addSubview:花瓣粉2];
	//viewsByName[@"花瓣粉_2"] = 花瓣粉2;
    	
    	....
    	return true;
    }
    
    @Override
    protected boolean addAnimation() { //为每一个动画视图添加动画属性
    	KeyFrameAnimation 花瓣绿1RotationAnimation = KeyFrameAnimation.newKeyFrameAnimationWithIOSKeyPath("transform.rotation.z");
    	花瓣绿1RotationAnimation.duration = 0.750f;
    	花瓣绿1RotationAnimation.values = new float[]{0.000f, 6.283f};
    	花瓣绿1RotationAnimation.keyTimes = new float[]{0.000f, 1.000f};
    	花瓣绿1RotationAnimation.timingFunctions = new TimeInterpolator[]{null, linearTiming};
    	花瓣绿1RotationAnimation.repeatCount = KeyFrameAnimation.HUGE_VALF;
    	addAnimation(findViewsByName("huabanlv_1"), 花瓣绿1RotationAnimation);
    	
    	/**
    	**这部分是core aminator导出的代码，上面的是翻译使用Android api实现的代码
    	**/
	//CAKeyframeAnimation *花瓣绿1RotationAnimation = [CAKeyframeAnimation animationWithKeyPath:@"transform.rotation.z"];
	//花瓣绿1RotationAnimation.duration = 0.750;
	//花瓣绿1RotationAnimation.values = @[@(0.000), @(6.283)];
	//花瓣绿1RotationAnimation.keyTimes = @[@(0.000), @(1.000)];
	//花瓣绿1RotationAnimation.timingFunctions = @[linearTiming];
	//花瓣绿1RotationAnimation.repeatCount = HUGE_VALF;
	//花瓣绿1RotationAnimation.beginTime = beginTime;
	//花瓣绿1RotationAnimation.fillMode = fillMode;
	//花瓣绿1RotationAnimation.removedOnCompletion = removedOnCompletion;
	//[[self.viewsByName[@"花瓣绿_1"] layer] addAnimation:花瓣绿1RotationAnimation forKey:@"Untitled Animation_Rotation"];
		
	....
	return true;
    }
}
````
