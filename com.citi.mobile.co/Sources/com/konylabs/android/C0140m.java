package com.konylabs.android;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: com.konylabs.android.m */
final class C0140m implements Runnable {
    C0140m() {
    }

    public final void run() {
        KonyMain.m4080Z();
        if (!KonyMain.am) {
            if (KonyMain.f3657e) {
                Log.d(KonyMain.f3665n, "Registering for idle timeout : " + (KonyMain.an - (SystemClock.elapsedRealtime() - KonyMain.al)));
            }
            KonyMain.f3638B.postDelayed(KonyMain.aq, KonyMain.an - (SystemClock.elapsedRealtime() - KonyMain.al));
        }
    }
}
