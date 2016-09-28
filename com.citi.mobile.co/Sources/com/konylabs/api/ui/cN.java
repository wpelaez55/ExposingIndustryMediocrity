package com.konylabs.api.ui;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class cN implements OnCheckedChangeListener {
    private /* synthetic */ cM f934a;

    cN(cM cMVar) {
        this.f934a = cMVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        cO cOVar = (cO) compoundButton.getTag();
        if (z) {
            this.f934a.m970a(cOVar.f939e);
        } else {
            this.f934a.m978b(cOVar.f939e);
        }
    }
}
