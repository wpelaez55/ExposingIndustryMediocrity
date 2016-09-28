package com.konylabs.api;

/* renamed from: com.konylabs.api.U */
final class C0158U implements Runnable {
    private /* synthetic */ int f63a;
    private /* synthetic */ Object[] f64b;
    private /* synthetic */ C0350S f65c;

    C0158U(C0350S c0350s, int i, Object[] objArr) {
        this.f65c = c0350s;
        this.f63a = i;
        this.f64b = objArr;
    }

    public final void run() {
        C0350S.m2298a(this.f63a, this.f64b);
    }
}
