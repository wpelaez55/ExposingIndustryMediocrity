package com.konylabs.api;

/* renamed from: com.konylabs.api.Z */
final class C0161Z implements Runnable {
    private /* synthetic */ int f72a;
    private /* synthetic */ Object[] f73b;
    private /* synthetic */ C0352Y f74c;

    C0161Z(C0352Y c0352y, int i, Object[] objArr) {
        this.f74c = c0352y;
        this.f72a = i;
        this.f73b = objArr;
    }

    public final void run() {
        C0352Y.m2314a(this.f74c, C0352Y.m2312a(this.f72a, this.f73b));
    }
}
