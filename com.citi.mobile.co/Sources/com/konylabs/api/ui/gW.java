package com.konylabs.api.ui;

final class gW implements Runnable {
    private /* synthetic */ Object f1465a;
    private /* synthetic */ gU f1466b;

    gW(gU gUVar, Object obj) {
        this.f1466b = gUVar;
        this.f1465a = obj;
    }

    public final void run() {
        this.f1466b.f4188b = this.f1466b.m4575a(this.f1465a);
    }
}
