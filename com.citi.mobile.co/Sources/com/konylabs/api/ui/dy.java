package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class dy implements OnClickListener {
    private /* synthetic */ dw f1237a;

    private dy(dw dwVar, byte b) {
        this.f1237a = dwVar;
    }

    public final void onClick(View view) {
        boolean a = dw.m3218a(this.f1237a, view);
        if (this.f1237a.f2947e != null) {
            this.f1237a.f2947e.m1404a(this.f1237a.m3220b(view), a);
        }
    }
}
