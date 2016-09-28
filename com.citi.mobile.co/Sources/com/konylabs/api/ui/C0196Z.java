package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;

/* renamed from: com.konylabs.api.ui.Z */
final class C0196Z implements OnFocusChangeListener {
    private /* synthetic */ C0195Y f365a;

    C0196Z(C0195Y c0195y) {
        this.f365a = c0195y;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f365a.m340a((TextView) view);
        } else {
            this.f365a.m349b((TextView) view);
        }
    }
}
