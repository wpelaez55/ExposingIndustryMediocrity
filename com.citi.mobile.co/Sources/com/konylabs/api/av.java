package com.konylabs.api;

final class av implements Runnable {
    private /* synthetic */ int f120a;
    private /* synthetic */ Object[] f121b;
    private /* synthetic */ au f122c;

    av(au auVar, int i, Object[] objArr) {
        this.f122c = auVar;
        this.f120a = i;
        this.f121b = objArr;
    }

    public final void run() {
        au.m2340a(this.f122c, au.m2339a(this.f122c, this.f120a, this.f121b));
    }
}
