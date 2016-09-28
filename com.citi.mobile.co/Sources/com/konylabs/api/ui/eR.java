package com.konylabs.api.ui;

final class eR implements Runnable {
    private /* synthetic */ Object f1258a;
    private /* synthetic */ int f1259b;
    private /* synthetic */ Object f1260c;
    private /* synthetic */ eO f1261d;

    eR(eO eOVar, Object obj, int i, Object obj2) {
        this.f1261d = eOVar;
        this.f1258a = obj;
        this.f1259b = i;
        this.f1260c = obj2;
    }

    public final void run() {
        this.f1261d.m4200c(this.f1258a, this.f1259b, this.f1260c);
    }
}
