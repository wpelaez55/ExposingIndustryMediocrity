package com.konylabs.api;

/* renamed from: com.konylabs.api.W */
final class C0159W implements Runnable {
    private /* synthetic */ int f66a;
    private /* synthetic */ Object[] f67b;
    private /* synthetic */ C0351V f68c;

    C0159W(C0351V c0351v, int i, Object[] objArr) {
        this.f68c = c0351v;
        this.f66a = i;
        this.f67b = objArr;
    }

    public final void run() {
        this.f68c.f2399a = C0351V.m2309a(this.f66a, this.f67b);
    }
}
