package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;

final class eB implements Runnable {
    private /* synthetic */ Object[] f1243a;
    private /* synthetic */ eA f1244b;

    eB(eA eAVar, Object[] objArr) {
        this.f1244b = eAVar;
        this.f1243a = objArr;
    }

    public final void run() {
        if (KonyMain.getActContext() != null) {
            this.f1244b.m4185c(this.f1243a);
        }
    }
}
