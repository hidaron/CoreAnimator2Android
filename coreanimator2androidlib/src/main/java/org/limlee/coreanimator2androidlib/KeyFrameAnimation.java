package org.limlee.coreanimator2androidlib;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class KeyFrameAnimation {
    private static final String TAG = KeyFrameAnimation.class.getSimpleName();
    public static final int HUGE_VALF = ValueAnimator.INFINITE;
    private Property mProperty;
    public float duration;
    public float[] values;
    public float[] keyTimes;
    public TimeInterpolator[] timingFunctions;
    public float beginTime;
    public int repeatCount; //HUGE_VALE 无限循环
    public boolean autoreverses;

    private KeyFrameAnimation(Property property) {
        this.mProperty = property;
    }

    public static KeyFrameAnimation newKeyFrameAnimationWithIOSKeyPath(String keyPathOfIOS) {
        Property property = getPropertOfAnd(keyPathOfIOS);
        KeyFrameAnimation keyFrameAnimation = new KeyFrameAnimation(property);
        return keyFrameAnimation;
    }

    private static Property getPropertOfAnd(String propertyNameOfIOS) {
        Property property = null;
        if (propertyNameOfIOS.equals("transform.rotation.z")
                || propertyNameOfIOS.equals("transform.rotation")) {
            property = View.ROTATION;
        } else if (propertyNameOfIOS.equals("transform.rotation.x")) {
            property = View.ROTATION_X;
        } else if (propertyNameOfIOS.equals("transform.rotation.y")) {
            property = View.ROTATION_Y;
        } else if (propertyNameOfIOS.equals("transform.translation.x")) {
            property = View.TRANSLATION_X;
        } else if (propertyNameOfIOS.equals("transform.translation.y")) {
            property = View.TRANSLATION_Y;
        } else if (propertyNameOfIOS.equals("transform.scale.z")
                || propertyNameOfIOS.equals("transform.scale")) {
            property = SCALE;
        } else if (propertyNameOfIOS.equals("transform.scale.x")) {
            property = View.SCALE_X;
        } else if (propertyNameOfIOS.equals("transform.scale.y")) {
            property = View.SCALE_Y;
        } else if (propertyNameOfIOS.equals("opacity")) {
            property = View.ALPHA;
        }
        return property;
    }

    public static Property<View, Float> SCALE = new Property<View, Float>(Float.class, "scale") {

        @Override
        public void set(View object, Float value) {
            object.setScaleX(value);
            object.setScaleY(value);
        }

        @Override
        public Float get(View object) {
            return object.getScaleX(); //or object.getScaleY();
        }
    };

    public PropertyValuesHolder toPropertValuesHolder() {
        if (null == keyTimes
                || null == values
                || keyTimes.length == 0
                || values.length == 0
                || keyTimes.length != values.length) {
            throw new IllegalArgumentException("error KeyFrame params!");
        }
        Property property = mProperty;
        if (null == property
                || TextUtils.isEmpty(property.getName())) {
            throw new IllegalArgumentException("error KeyFrame property!");
        }
        List<Keyframe> keframeList = new ArrayList<>();
        Keyframe keyframe;
        for (int i = 0; i < keyTimes.length; i++) {
            if (property.getName().equals(View.ROTATION.getName())
                    || property.getName().equals(View.ROTATION_X.getName())
                    || property.getName().equals(View.ROTATION_Y.getName())) {
                int rotation = (int) (values[i] / Math.PI * 180d);
                keyframe = Keyframe.ofFloat(keyTimes[i], (float) rotation);
            } else {
                keyframe = Keyframe.ofFloat(keyTimes[i], values[i]);
            }
            keframeList.add(keyframe);
            if (null != timingFunctions) {
                final TimeInterpolator timeInterpolator = timingFunctions[i];
                if (null != timeInterpolator) {
                    keyframe.setInterpolator(timeInterpolator);
                }
            }
        }
        Keyframe[] keyFrames = new Keyframe[keframeList.size()];
        return PropertyValuesHolder.ofKeyframe(mProperty, keframeList.toArray(keyFrames));
    }

}
