package com.konylabs.api.ui;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

final class aT extends LinearLayout {
    public aT(aO aOVar, Context context) {
        super(context);
    }

    protected final void onMeasure(int i, int i2) {
        int i3 = 0;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(((int) Math.floor(((double) getMeasuredWidth()) / 7.0d)) * 7, 1073741824);
        measuredHeight = MeasureSpec.makeMeasureSpec(measuredHeight, 0);
        int childCount = getChildCount();
        while (i3 < childCount) {
            measureChild(getChildAt(i3), makeMeasureSpec, measuredHeight);
            i3++;
        }
    }
}
