package com.konylabs.api;

final class aB implements Runnable {
    private /* synthetic */ int f75a;
    private /* synthetic */ Object[] f76b;
    private /* synthetic */ aA f77c;

    aB(aA aAVar, int i, Object[] objArr) {
        this.f77c = aAVar;
        this.f75a = i;
        this.f76b = objArr;
    }

    public final void run() {
        this.f77c.f2401a = aA.m2315a(this.f75a, this.f76b);
    }
}
