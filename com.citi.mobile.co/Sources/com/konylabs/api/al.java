package com.konylabs.api;

final class al implements Runnable {
    private /* synthetic */ int f102a;
    private /* synthetic */ Object[] f103b;
    private /* synthetic */ ak f104c;

    al(ak akVar, int i, Object[] objArr) {
        this.f104c = akVar;
        this.f102a = i;
        this.f103b = objArr;
    }

    public final void run() {
        ak.m2329a(this.f104c, ak.m2328a(this.f104c, this.f102a, this.f103b));
    }
}
