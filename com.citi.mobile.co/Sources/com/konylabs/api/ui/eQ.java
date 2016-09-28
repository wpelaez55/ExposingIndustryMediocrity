package com.konylabs.api.ui;

final class eQ implements Runnable {
    private /* synthetic */ Object[] f1256a;
    private /* synthetic */ eO f1257b;

    eQ(eO eOVar, Object[] objArr) {
        this.f1257b = eOVar;
        this.f1256a = objArr;
    }

    public final void run() {
        this.f1257b.m4218b(this.f1256a);
    }
}
