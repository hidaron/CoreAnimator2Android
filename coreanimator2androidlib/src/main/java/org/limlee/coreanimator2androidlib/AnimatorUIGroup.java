package org.limlee.coreanimator2androidlib;

import android.view.View;

public interface AnimatorUIGroup extends AnimatorUIView {

    void addViewWithName(View view, String name);

    View findViewsByName(String name);

    void setViewsByName(View view, String name);
}
