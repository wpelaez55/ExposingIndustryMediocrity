package com.konylabs.api.ui;

import android.os.MessageQueue.IdleHandler;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.konylabs.api.ui.D */
final class C0175D implements IdleHandler {
    private /* synthetic */ C0174B f207a;

    C0175D(C0174B c0174b) {
        this.f207a = c0174b;
    }

    public final boolean queueIdle() {
        int measuredHeight = this.f207a.getMeasuredHeight();
        if (measuredHeight > 0) {
            int paddingTop = (measuredHeight - this.f207a.getPaddingTop()) - this.f207a.getPaddingBottom();
            for (int i = 0; i < this.f207a.getChildCount(); i++) {
                View childAt = this.f207a.getChildAt(i);
                if (childAt instanceof LinearLayout) {
                    childAt = ((LinearLayout) childAt).getChildAt(0);
                    if (childAt instanceof bt) {
                        ((bt) childAt).m911d(paddingTop);
                    } else if (childAt instanceof C0177F) {
                        ((C0177F) childAt).m190c(paddingTop);
                    } else if (childAt instanceof bM) {
                        ((bM) childAt).m739b(paddingTop);
                    } else if (childAt instanceof cP) {
                        ((cP) childAt).m1017c(paddingTop);
                    } else if (childAt instanceof ak) {
                        ((ak) childAt).m572c(paddingTop);
                    }
                }
            }
        }
        return false;
    }
}
