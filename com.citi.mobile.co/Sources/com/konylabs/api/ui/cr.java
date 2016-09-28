package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class cr implements OnClickListener {
    private /* synthetic */ cq f1014a;

    cr(cq cqVar) {
        this.f1014a = cqVar;
    }

    public final void onClick(View view) {
        if (view == this.f1014a.f1008b && this.f1014a.f1009c.h != null) {
            this.f1014a.f1009c.h.m1028a(this.f1014a.f1009c.f2773y);
        }
        this.f1014a.dismiss();
    }
}
