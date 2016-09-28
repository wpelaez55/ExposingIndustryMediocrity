package com.konylabs.api;

final class ab implements Runnable {
    private /* synthetic */ int f84a;
    private /* synthetic */ Object[] f85b;
    private /* synthetic */ aa f86c;

    ab(aa aaVar, int i, Object[] objArr) {
        this.f86c = aaVar;
        this.f84a = i;
        this.f85b = objArr;
    }

    public final void run() {
        aa.m2320a(this.f86c, aa.m2319a(this.f86c, this.f84a, this.f85b));
    }
}
