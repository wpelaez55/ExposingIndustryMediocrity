package com.konylabs.api.ui;

final class eq implements Runnable {
    private /* synthetic */ KonyWeb f1323a;

    eq(KonyWeb konyWeb) {
        this.f1323a = konyWeb;
    }

    public final void run() {
        this.f1323a.destroy();
    }
}
