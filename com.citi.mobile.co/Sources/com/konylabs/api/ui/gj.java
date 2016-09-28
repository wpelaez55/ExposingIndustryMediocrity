package com.konylabs.api.ui;

final class gj implements ex {
    gj() {
    }

    public final void m3331a(boolean z) {
        if (z) {
            gb.f4576D.m4653a(null);
            gb.f4578Q = true;
            synchronized (gb.f4576D) {
                gb.f4576D.notifyAll();
            }
        }
    }
}
