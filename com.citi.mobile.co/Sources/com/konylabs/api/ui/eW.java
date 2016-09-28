package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;
import ny0k.C0300p;

final class eW implements C0300p {
    final /* synthetic */ eV f2991a;

    eW(eV eVVar) {
        this.f2991a = eVVar;
    }

    public final void m3312a() {
        if (this.f2991a.f1271b.E != LuaWidget.KONY_WIDGET_RESTORE) {
            return;
        }
        if (KonyMain.f3656d > 11) {
            this.f2991a.f1271b.m4198c(this.f2991a.f1270a);
        } else {
            this.f2991a.f1271b.f3718g.post(new eX(this));
        }
    }
}
