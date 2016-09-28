package com.konylabs.api.ui;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class aa implements OnCheckedChangeListener {
    private /* synthetic */ C0195Y f512a;

    aa(C0195Y c0195y) {
        this.f512a = c0195y;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ac acVar = (ac) compoundButton.getTag();
        if (z) {
            this.f512a.m340a(acVar.f518e);
        } else {
            this.f512a.m349b(acVar.f518e);
        }
        if (!this.f512a.f364r && this.f512a.f358k != null) {
            ab b = this.f512a.f358k;
            compoundButton.getTag();
            b.m514a();
        }
    }
}
