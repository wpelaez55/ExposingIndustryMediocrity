package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class dt implements OnClickListener {
    private /* synthetic */ dm f1227a;

    dt(dm dmVar) {
        this.f1227a = dmVar;
    }

    public final void onClick(View view) {
        if (this.f1227a.f2918n != null) {
            if (view == this.f1227a.f2907c) {
                this.f1227a.f2918n.m1560a(true);
            } else {
                this.f1227a.f2918n.m1560a(false);
            }
        }
    }
}
