package com.konylabs.api;

final class ae implements Runnable {
    private /* synthetic */ int f90a;
    private /* synthetic */ Object[] f91b;
    private /* synthetic */ ac f92c;

    ae(ac acVar, int i, Object[] objArr) {
        this.f92c = acVar;
        this.f90a = i;
        this.f91b = objArr;
    }

    public final void run() {
        this.f92c.f2403a = ac.m2321a(this.f90a, this.f91b);
    }
}
