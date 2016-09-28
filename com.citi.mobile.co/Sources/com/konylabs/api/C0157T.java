package com.konylabs.api;

/* renamed from: com.konylabs.api.T */
final class C0157T implements Runnable {
    private /* synthetic */ int f60a;
    private /* synthetic */ Object[] f61b;
    private /* synthetic */ C0350S f62c;

    C0157T(C0350S c0350s, int i, Object[] objArr) {
        this.f62c = c0350s;
        this.f60a = i;
        this.f61b = objArr;
    }

    public final void run() {
        this.f62c.f2397a = C0350S.m2298a(this.f60a, this.f61b);
    }
}
