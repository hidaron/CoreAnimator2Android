package org.limlee.coreanimator2androidlib;

import android.content.Context;

final public class UIViewHelper {
    private Context mContext;

    public UIViewHelper(Context context) {
        mContext = context;
    }

    public AnimatorImageView newImageView() {
        return new AnimatorImageView(mContext);
    }

    public AnimatorViewGroup newViewGroup() {
        return new AnimatorViewGroup(mContext);
    }

    public AnimatorTextView newTextView() {
        return new AnimatorTextView(mContext);
    }
}
