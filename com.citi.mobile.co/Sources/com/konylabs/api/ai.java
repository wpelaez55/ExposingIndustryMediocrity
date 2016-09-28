package com.konylabs.api;

final class ai implements Runnable {
    private /* synthetic */ int f96a;
    private /* synthetic */ Object[] f97b;
    private /* synthetic */ ah f98c;

    ai(ah ahVar, int i, Object[] objArr) {
        this.f98c = ahVar;
        this.f96a = i;
        this.f97b = objArr;
    }

    public final void run() {
        this.f98c.f2404a = this.f98c.m2325a(this.f96a, this.f97b);
    }
}
