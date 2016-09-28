package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class aW implements OnClickListener {
    private /* synthetic */ aV f508a;

    aW(aV aVVar) {
        this.f508a = aVVar;
    }

    public final void onClick(View view) {
        if (this.f508a.f2550k > 0) {
            this.f508a.f2550k = this.f508a.f2550k - 1;
            this.f508a.setSelection(this.f508a.f2550k);
        }
    }
}
