package com.konylabs.api.ui;

final class gv implements Runnable {
    private /* synthetic */ Object f1475a;
    private /* synthetic */ gu f1476b;

    gv(gu guVar, Object obj) {
        this.f1476b = guVar;
        this.f1475a = obj;
    }

    public final void run() {
        this.f1476b.f4241b = this.f1476b.m4601a(this.f1475a);
    }
}
