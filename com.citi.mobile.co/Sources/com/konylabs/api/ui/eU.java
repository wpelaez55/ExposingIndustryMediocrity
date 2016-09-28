package com.konylabs.api.ui;

final class eU implements Runnable {
    private /* synthetic */ Object f1267a;
    private /* synthetic */ Object f1268b;
    private /* synthetic */ eO f1269c;

    eU(eO eOVar, Object obj, Object obj2) {
        this.f1269c = eOVar;
        this.f1267a = obj;
        this.f1268b = obj2;
    }

    public final void run() {
        this.f1269c.m4201e(this.f1267a, this.f1268b);
    }
}
