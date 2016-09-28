package com.konylabs.api.ui;

final class gy implements Runnable {
    private /* synthetic */ Object f1478a;
    private /* synthetic */ gx f1479b;

    gy(gx gxVar, Object obj) {
        this.f1479b = gxVar;
        this.f1478a = obj;
    }

    public final void run() {
        this.f1479b.f4260a = this.f1479b.m4610a(this.f1478a);
    }
}
