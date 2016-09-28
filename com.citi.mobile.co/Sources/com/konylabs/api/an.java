package com.konylabs.api;

final class an implements Runnable {
    private /* synthetic */ int f105a;
    private /* synthetic */ Object[] f106b;
    private /* synthetic */ am f107c;

    an(am amVar, int i, Object[] objArr) {
        this.f107c = amVar;
        this.f105a = i;
        this.f106b = objArr;
    }

    public final void run() {
        this.f107c.f2406a = this.f107c.m2330a(this.f105a, this.f106b);
    }
}
