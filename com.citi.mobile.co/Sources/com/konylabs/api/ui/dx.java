package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class dx implements OnClickListener {
    private /* synthetic */ dw f1236a;

    dx(dw dwVar) {
        this.f1236a = dwVar;
    }

    public final void onClick(View view) {
        if (this.f1236a.f2946d != null) {
            if (view == this.f1236a.f2945c) {
                this.f1236a.f2946d.m1560a(true);
            } else {
                this.f1236a.f2946d.m1560a(false);
            }
        }
    }
}
