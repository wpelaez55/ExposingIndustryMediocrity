package com.konylabs.api.ui;

final class gG implements Runnable {
    private /* synthetic */ Object f1450a;
    private /* synthetic */ gF f1451b;

    gG(gF gFVar, Object obj) {
        this.f1451b = gFVar;
        this.f1450a = obj;
    }

    public final void run() {
        this.f1451b.f4084b = this.f1451b.m4488a(this.f1450a);
    }
}
