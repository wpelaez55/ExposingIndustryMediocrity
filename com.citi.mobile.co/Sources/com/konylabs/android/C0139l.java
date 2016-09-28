package com.konylabs.android;

import com.konylabs.api.ui.aD;
import com.konylabs.api.ui.eK;

/* renamed from: com.konylabs.android.l */
final class C0139l implements Runnable {
    private /* synthetic */ KonyMain f45a;

    C0139l(KonyMain konyMain) {
        this.f45a = konyMain;
    }

    public final void run() {
        aD l = this.f45a.m4164l();
        if (l != null && !eK.m3302f()) {
            l.m450a(true);
        }
    }
}
