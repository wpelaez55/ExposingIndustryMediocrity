package com.konylabs.android;

import android.view.ViewGroup.LayoutParams;

/* renamed from: com.konylabs.android.n */
final class C0141n implements Runnable {
    private /* synthetic */ KonyMain f46a;

    C0141n(KonyMain konyMain) {
        this.f46a = konyMain;
    }

    public final void run() {
        this.f46a.f3685Z.addView(this.f46a.m4079Y(), new LayoutParams(-1, -1));
        this.f46a.f3685Z.showNext();
    }
}
