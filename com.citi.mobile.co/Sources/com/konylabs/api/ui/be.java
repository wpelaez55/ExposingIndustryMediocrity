package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class be implements OnClickListener {
    private /* synthetic */ bd f826a;

    be(bd bdVar) {
        this.f826a = bdVar;
    }

    public final void onClick(View view) {
        if (this.f826a.f2645m > 0) {
            this.f826a.f2645m = this.f826a.f2645m - 1;
            this.f826a.setSelection(this.f826a.f2645m);
        }
    }
}
