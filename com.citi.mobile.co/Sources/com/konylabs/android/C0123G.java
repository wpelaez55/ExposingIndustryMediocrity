package com.konylabs.android;

import com.konylabs.api.ui.ii;

/* renamed from: com.konylabs.android.G */
final class C0123G {
    private ii f11a;

    C0123G(KonyMain konyMain) {
    }

    final synchronized void m12a() {
        if (this.f11a != null) {
            this.f11a.m1407b();
            this.f11a = null;
        }
    }

    final synchronized void m13a(ii iiVar) {
        this.f11a = iiVar;
    }
}
