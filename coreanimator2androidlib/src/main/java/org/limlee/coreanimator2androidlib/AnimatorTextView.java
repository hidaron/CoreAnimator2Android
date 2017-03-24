package org.limlee.coreanimator2androidlib;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.renderscript.Float2;
import android.util.AttributeSet;
import android.widget.TextView;

public class AnimatorTextView extends TextView implements AnimatorUIView {

    public RectF bounds;
    public PointF position;
    public Float2 scale;
    public float rotation;
    public PointF anchorPoint;
    public float alpha = 1.0f;

    public AnimatorTextView(Context context) {
        super(context);
    }

    public AnimatorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimatorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
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
}
