package com.konylabs.api.ui;

final class fQ implements Runnable {
    private /* synthetic */ Object f1407a;
    private /* synthetic */ int f1408b;
    private /* synthetic */ Object f1409c;
    private /* synthetic */ fv f1410d;

    fQ(fv fvVar, Object obj, int i, Object obj2) {
        this.f1410d = fvVar;
        this.f1407a = obj;
        this.f1408b = i;
        this.f1409c = obj2;
    }

    public final void run() {
        this.f1410d.m4405c(this.f1407a, this.f1408b, this.f1409c);
    }
}
