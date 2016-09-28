package com.konylabs.api.ui;

final class at implements Runnable {
    private /* synthetic */ Object f590a;
    private /* synthetic */ Object f591b;
    private /* synthetic */ KonyCustomWidget f592c;

    at(KonyCustomWidget konyCustomWidget, Object obj, Object obj2) {
        this.f592c = konyCustomWidget;
        this.f590a = obj;
        this.f591b = obj2;
    }

    public final void run() {
        this.f592c.m4175a(this.f590a, this.f591b);
    }
}
