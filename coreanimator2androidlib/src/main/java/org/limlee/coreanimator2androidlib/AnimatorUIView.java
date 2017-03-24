package org.limlee.coreanimator2androidlib;

import android.graphics.PointF;
import android.graphics.RectF;
import android.renderscript.Float2;

public interface AnimatorUIView {

    /**
     * view的约束
     *
     * @return
     */
    RectF getUIBounds();

    /**
     * 缩放
     *
     * @return
     */
    Float2 getUIScale();

    /**
     * 初始位置
     *
     * @return
     */
    PointF getUIPosition();

    /**
     * 旋转
     *
     * @return
     */
    float getUIRotation();

    /**
     * 锚点
     *
     * @return
     */
    PointF getUIAnchorPoint();

    /**
     * alpha
     *
     * @return
     */
    float getUIAlpha();
}
