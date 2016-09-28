package com.konylabs.api;

import com.konylabs.vm.Function;

/* renamed from: com.konylabs.api.s */
final class C0368s extends Function {
    private Function f2436a;
    private /* synthetic */ C0172r f2437e;

    public C0368s(C0172r c0172r, Function function) {
        this.f2437e = c0172r;
        this.f2436a = function;
    }

    public final synchronized Object[] execute(Object[] objArr) throws Exception {
        this.f2436a.execute(objArr);
        if (!this.f2437e.f165d || this.f2437e.f166e) {
            C0347P.f2393a.remove(this.f2437e.f162a);
        } else {
            this.f2437e.m104a();
        }
        return null;
    }
}
