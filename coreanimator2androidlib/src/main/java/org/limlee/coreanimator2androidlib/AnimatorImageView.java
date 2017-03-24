package org.limlee.coreanimator2androidlib;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.renderscript.Float2;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AnimatorImageView extends ImageView implements AnimatorUIImage {
    public RectF bounds;
    public PointF position;
    public Float2 scale;
    public String image;
    public float rotation;
    public PointF anchorPoint;
    public float alpha = 1.0f;

    public AnimatorImageView(Context context) {
        super(context);
    }

    public AnimatorImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimatorImageView(Context context, AttributeSet attrs, int defStyleAttr) {
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
    public String getImage() {
        return image;
    }
}
