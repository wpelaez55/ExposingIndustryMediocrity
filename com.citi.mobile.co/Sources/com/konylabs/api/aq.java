package com.konylabs.api;

final class aq implements Runnable {
    private /* synthetic */ int f111a;
    private /* synthetic */ Object[] f112b;
    private /* synthetic */ ap f113c;

    aq(ap apVar, int i, Object[] objArr) {
        this.f113c = apVar;
        this.f111a = i;
        this.f112b = objArr;
    }

    public final void run() {
        this.f113c.f2408a = this.f113c.m2333a(this.f111a, this.f112b);
    }
}
