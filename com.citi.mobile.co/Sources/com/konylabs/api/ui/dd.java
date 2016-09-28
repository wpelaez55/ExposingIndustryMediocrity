package com.konylabs.api.ui;

final class dd implements Runnable {
    private /* synthetic */ C0219u f1181a;
    private /* synthetic */ int f1182b;
    private /* synthetic */ cW f1183c;

    dd(cW cWVar, C0219u c0219u, int i) {
        this.f1183c = cWVar;
        this.f1181a = c0219u;
        this.f1182b = i;
    }

    public final void run() {
        this.f1183c.invalidate();
        this.f1183c.m2844b(this.f1181a, this.f1182b);
    }
}
