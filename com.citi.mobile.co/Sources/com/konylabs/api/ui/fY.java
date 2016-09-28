package com.konylabs.api.ui;

final class fY implements Runnable {
    private /* synthetic */ Object f1419a;
    private /* synthetic */ fX f1420b;

    fY(fX fXVar, Object obj) {
        this.f1420b = fXVar;
        this.f1419a = obj;
    }

    public final void run() {
        this.f1420b.f3808b = this.f1420b.m4252a(this.f1419a);
    }
}
