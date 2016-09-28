package com.konylabs.api.ui;

final class au implements Runnable {
    private /* synthetic */ Object f593a;
    private /* synthetic */ KonyCustomWidget f594b;

    au(KonyCustomWidget konyCustomWidget, Object obj) {
        this.f594b = konyCustomWidget;
        this.f593a = obj;
    }

    public final void run() {
        this.f594b.f3690a = this.f594b.onPropertyGet(this.f594b.f3691b, this.f593a);
    }
}
