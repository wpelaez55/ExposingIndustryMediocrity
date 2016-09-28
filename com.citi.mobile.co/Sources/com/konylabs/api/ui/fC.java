package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;

final class fC implements Runnable {
    private /* synthetic */ int f1385a;
    private /* synthetic */ int f1386b;
    private /* synthetic */ fv f1387c;

    fC(fv fvVar, int i, int i2) {
        this.f1387c = fvVar;
        this.f1385a = i;
        this.f1386b = i2;
    }

    public final void run() {
        if (KonyMain.getActContext() != null && this.f1387c.f4030w != null) {
            this.f1387c.f4030w.f439a.scrollTo(this.f1385a, this.f1386b);
        }
    }
}
