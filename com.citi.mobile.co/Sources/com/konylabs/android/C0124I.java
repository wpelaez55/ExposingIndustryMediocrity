package com.konylabs.android;

import android.view.KeyEvent;
import com.konylabs.api.ui.fv;

/* renamed from: com.konylabs.android.I */
final class C0124I implements Runnable {
    private /* synthetic */ C0334H f12a;

    C0124I(C0334H c0334h) {
        this.f12a = c0334h;
    }

    public final void run() {
        if (this.f12a.f2375a.f3682Q != null && this.f12a.f2375a.f3682Q.isPlaying()) {
            super.onKeyDown(4, new KeyEvent(1, 4));
        }
        if (KonyMain.f3651W == 1 || this.f12a.f2375a.f3687t == null || this.f12a.f2375a.f3687t.f442d != 9) {
            if (this.f12a.f2375a.f3687t != null && this.f12a.f2375a.f3687t.m469d(false)) {
                return;
            }
        } else if (this.f12a.f2375a.f3687t != null && this.f12a.f2375a.f3687t.m469d(true)) {
            return;
        }
        String k = KonyMain.aa();
        if (k == null) {
            super.onBackPressed();
            return;
        }
        this.f12a.f2375a.m4155b();
        this.f12a.f2375a.f3686l = true;
        fv.m4406c(k);
    }
}
