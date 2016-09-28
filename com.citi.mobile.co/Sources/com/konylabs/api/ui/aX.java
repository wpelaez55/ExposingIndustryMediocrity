package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class aX implements OnClickListener {
    private /* synthetic */ aV f509a;

    aX(aV aVVar) {
        this.f509a = aVVar;
    }

    public final void onClick(View view) {
        if (this.f509a.f2550k < this.f509a.f2541b.size() - 1) {
            this.f509a.f2550k = this.f509a.f2550k + 1;
            this.f509a.setSelection(this.f509a.f2550k);
        }
    }
}
