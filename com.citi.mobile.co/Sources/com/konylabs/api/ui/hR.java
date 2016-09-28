package com.konylabs.api.ui;

final class hR implements Runnable {
    private /* synthetic */ String f1495a;
    private /* synthetic */ hP f1496b;

    hR(hP hPVar, String str) {
        this.f1496b = hPVar;
        this.f1495a = str;
    }

    public final void run() {
        this.f1496b.f4366x.loadUrl("javascript:" + this.f1495a);
    }
}
