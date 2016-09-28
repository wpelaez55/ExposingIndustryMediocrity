package com.konylabs.api.ui;

final class ep implements Runnable {
    private /* synthetic */ String f1321a;
    private /* synthetic */ KonyWeb f1322b;

    ep(KonyWeb konyWeb, String str) {
        this.f1322b = konyWeb;
        this.f1321a = str;
    }

    public final void run() {
        if (!this.f1322b.f258n) {
            this.f1322b.loadDataWithBaseURL(null, this.f1321a, "text/html", "UTF-8", null);
        }
    }
}
