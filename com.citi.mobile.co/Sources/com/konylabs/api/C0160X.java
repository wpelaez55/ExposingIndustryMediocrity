package com.konylabs.api;

/* renamed from: com.konylabs.api.X */
final class C0160X implements Runnable {
    private /* synthetic */ int f69a;
    private /* synthetic */ Object[] f70b;
    private /* synthetic */ C0351V f71c;

    C0160X(C0351V c0351v, int i, Object[] objArr) {
        this.f71c = c0351v;
        this.f69a = i;
        this.f70b = objArr;
    }

    public final void run() {
        this.f71c.f2399a = C0351V.m2309a(this.f69a, this.f70b);
    }
}
