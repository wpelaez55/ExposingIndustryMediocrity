package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;
import ny0k.C0300p;

final class fy implements C0300p {
    final /* synthetic */ fx f3002a;

    fy(fx fxVar) {
        this.f3002a = fxVar;
    }

    public final void m3327a() {
        if (this.f3002a.f1443b.f4029v != LuaWidget.KONY_WIDGET_BACKUP) {
            if (KonyMain.f3656d > 11) {
                this.f3002a.f1443b.m4403c(this.f3002a.f1442a);
            } else {
                this.f3002a.f1443b.f4030w.post(new fz(this));
            }
        }
    }
}
