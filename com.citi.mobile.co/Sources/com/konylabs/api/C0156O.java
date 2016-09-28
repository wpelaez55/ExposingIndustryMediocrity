package com.konylabs.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.fv;
import com.konylabs.vm.Function;

/* renamed from: com.konylabs.api.O */
final class C0156O implements Runnable {
    private /* synthetic */ Function f58a;
    private /* synthetic */ C0346M f59b;

    C0156O(C0346M c0346m, Function function) {
        this.f59b = c0346m;
        this.f58a = function;
    }

    public final void run() {
        fv b = fv.m4395b(KonyMain.f3653a);
        b.cleanup();
        System.gc();
        b.m4449c();
        if (this.f58a != null) {
            C0346M.m2274a(this.f58a);
        }
    }
}
