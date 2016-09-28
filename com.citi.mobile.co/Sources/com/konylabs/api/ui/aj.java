package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class aj implements OnClickListener {
    private /* synthetic */ ah f552a;

    aj(ah ahVar) {
        this.f552a = ahVar;
    }

    public final void onClick(View view) {
        if (this.f552a.f528c.f2570e && !this.f552a.f544s) {
            ah.m533f(this.f552a);
        }
        this.f552a.f544s = !this.f552a.f544s;
        if (this.f552a.f531f != null) {
            this.f552a.f531f.m519a(this.f552a.f544s);
        }
        if (this.f552a.f545t != null) {
            this.f552a.f545t.m1191a(this.f552a, this.f552a.f544s);
        }
        this.f552a.m531e();
        this.f552a.m525b(this.f552a.f544s);
    }
}
