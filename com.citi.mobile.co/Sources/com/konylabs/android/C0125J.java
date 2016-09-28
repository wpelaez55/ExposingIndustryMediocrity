package com.konylabs.android;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.konylabs.android.J */
final class C0125J extends Thread {
    public volatile Handler f13a;
    C0135h f14b;

    C0125J() {
        this.f14b = null;
    }

    public final void run() {
        Looper.prepare();
        this.f13a = new C0126K(this);
        KonyMain.ag.m1726a(this.f13a);
        Looper.loop();
    }
}
