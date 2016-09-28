package com.konylabs.api;

final class aE implements Runnable {
    private /* synthetic */ int f81a;
    private /* synthetic */ Object[] f82b;
    private /* synthetic */ aD f83c;

    aE(aD aDVar, int i, Object[] objArr) {
        this.f83c = aDVar;
        this.f81a = i;
        this.f82b = objArr;
    }

    public final void run() {
        aD.m2318a(this.f83c, this.f81a, this.f82b);
    }
}
