package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class bf implements OnClickListener {
    private /* synthetic */ bd f827a;

    bf(bd bdVar) {
        this.f827a = bdVar;
    }

    public final void onClick(View view) {
        if (this.f827a.f2645m < this.f827a.f2636d.size() - 1) {
            this.f827a.f2645m = this.f827a.f2645m + 1;
            this.f827a.setSelection(this.f827a.f2645m);
        }
    }
}
