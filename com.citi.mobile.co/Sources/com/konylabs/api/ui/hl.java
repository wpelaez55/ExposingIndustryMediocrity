package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class hl implements OnClickListener {
    private /* synthetic */ hk f1522a;

    hl(hk hkVar) {
        this.f1522a = hkVar;
    }

    public final void onClick(View view) {
        int i = ((hm) view.getTag()).a;
        if (this.f1522a.a != null) {
            this.f1522a.a.m1269a(i);
        }
    }
}
