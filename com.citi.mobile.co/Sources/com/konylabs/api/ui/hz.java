package com.konylabs.api.ui;

final class hz implements Runnable {
    private /* synthetic */ Object f1540a;
    private /* synthetic */ hy f1541b;

    hz(hy hyVar, Object obj) {
        this.f1541b = hyVar;
        this.f1540a = obj;
    }

    public final void run() {
        this.f1541b.f4503a = this.f1541b.m4750a(this.f1540a);
    }
}
