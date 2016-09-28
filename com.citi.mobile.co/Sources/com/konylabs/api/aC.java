package com.konylabs.api;

final class aC implements Runnable {
    private /* synthetic */ int f78a;
    private /* synthetic */ Object[] f79b;
    private /* synthetic */ aA f80c;

    aC(aA aAVar, int i, Object[] objArr) {
        this.f80c = aAVar;
        this.f78a = i;
        this.f79b = objArr;
    }

    public final void run() {
        aA.m2315a(this.f78a, this.f79b);
    }
}
