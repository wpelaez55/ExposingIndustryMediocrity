package com.konylabs.api;

final class ad implements Runnable {
    private /* synthetic */ int f87a;
    private /* synthetic */ Object[] f88b;
    private /* synthetic */ ac f89c;

    ad(ac acVar, int i, Object[] objArr) {
        this.f89c = acVar;
        this.f87a = i;
        this.f88b = objArr;
    }

    public final void run() {
        this.f89c.f2403a = ac.m2321a(this.f87a, this.f88b);
    }
}
