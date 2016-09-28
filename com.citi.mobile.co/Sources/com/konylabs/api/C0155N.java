package com.konylabs.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.fv;
import com.konylabs.vm.Function;

/* renamed from: com.konylabs.api.N */
final class C0155N implements Runnable {
    private /* synthetic */ Function f56a;
    private /* synthetic */ C0346M f57b;

    C0155N(C0346M c0346m, Function function) {
        this.f57b = c0346m;
        this.f56a = function;
    }

    public final void run() {
        fv b = fv.m4395b(KonyMain.f3653a);
        if (b != null) {
            b.m4467y();
        }
        if (this.f56a != null) {
            C0346M.m2274a(this.f56a);
        }
    }
}
