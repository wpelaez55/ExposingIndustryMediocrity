package com.konylabs.android;

/* renamed from: com.konylabs.android.C */
final class C0119C implements Runnable {
    private /* synthetic */ KonyMain f2a;

    C0119C(KonyMain konyMain) {
        this.f2a = konyMain;
    }

    public final void run() {
        if (this.f2a.f3681P != null) {
            this.f2a.f3681P.start();
        }
    }
}
