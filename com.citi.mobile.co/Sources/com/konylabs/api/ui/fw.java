package com.konylabs.api.ui;

final class fw implements Runnable {
    private /* synthetic */ Object f1439a;
    private /* synthetic */ Object f1440b;
    private /* synthetic */ fv f1441c;

    fw(fv fvVar, Object obj, Object obj2) {
        this.f1441c = fvVar;
        this.f1439a = obj;
        this.f1440b = obj2;
    }

    public final void run() {
        this.f1441c.m4413e(this.f1439a, this.f1440b);
    }
}
