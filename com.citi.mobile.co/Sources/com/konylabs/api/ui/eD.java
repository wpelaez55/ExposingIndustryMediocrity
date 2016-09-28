package com.konylabs.api.ui;

final class eD implements Runnable {
    private /* synthetic */ eA f1248a;

    eD(eA eAVar) {
        this.f1248a = eAVar;
    }

    public final void run() {
        if (this.f1248a.f3707g != null) {
            this.f1248a.f3707g.m1587a(false);
            this.f1248a.f3707g = null;
        }
    }
}
