package com.konylabs.api.ui;

final class dc implements Runnable {
    private /* synthetic */ C0219u f1178a;
    private /* synthetic */ int f1179b;
    private /* synthetic */ cW f1180c;

    dc(cW cWVar, C0219u c0219u, int i) {
        this.f1180c = cWVar;
        this.f1178a = c0219u;
        this.f1179b = i;
    }

    public final void run() {
        if (this.f1178a != null) {
            this.f1180c.invalidate();
            this.f1180c.m2839a(this.f1178a, this.f1179b);
        }
    }
}
