package com.konylabs.api.ui;

final class er implements Runnable {
    private /* synthetic */ KonyWeb f1324a;

    er(KonyWeb konyWeb) {
        this.f1324a = konyWeb;
    }

    public final void run() {
        this.f1324a.requestLayout();
    }
}
