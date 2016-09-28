package com.konylabs.vm;

import com.konylabs.vmintf.KonyJSVM;

/* renamed from: com.konylabs.vm.i */
public final class C0244i implements Runnable {
    private long f1842a;

    public C0244i(long j) {
        this.f1842a = 0;
        this.f1842a = j;
    }

    public final void run() {
        KonyJSVM.disposePersistent(this.f1842a);
        this.f1842a = 0;
    }
}
