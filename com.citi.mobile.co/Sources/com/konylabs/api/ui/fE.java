package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;

final class fE implements Runnable {
    private /* synthetic */ boolean f1390a;
    private /* synthetic */ fv f1391b;

    fE(fv fvVar, boolean z) {
        this.f1391b = fvVar;
        this.f1390a = z;
    }

    public final void run() {
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4151a(this.f1391b, this.f1390a);
        } else {
            KonyMain.f3653a = this.f1391b.bj;
        }
    }
}
