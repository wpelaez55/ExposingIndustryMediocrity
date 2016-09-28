package com.konylabs.api;

final class ax implements Runnable {
    private /* synthetic */ int f123a;
    private /* synthetic */ Object[] f124b;
    private /* synthetic */ aw f125c;

    ax(aw awVar, int i, Object[] objArr) {
        this.f125c = awVar;
        this.f123a = i;
        this.f124b = objArr;
    }

    public final void run() {
        aw.m2342a(this.f125c, aw.m2341a(this.f125c, this.f123a, this.f124b));
    }
}
