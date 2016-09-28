package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class cl implements OnClickListener {
    private /* synthetic */ ck f1002a;

    cl(ck ckVar) {
        this.f1002a = ckVar;
    }

    public final void onClick(View view) {
        if (view == this.f1002a.f994f && this.f1002a.f989a.h != null) {
            this.f1002a.f989a.h.m1028a(this.f1002a.f1000l);
        }
        this.f1002a.f990b.dismiss();
    }
}
