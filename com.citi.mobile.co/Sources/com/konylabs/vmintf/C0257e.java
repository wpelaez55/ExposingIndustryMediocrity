package com.konylabs.vmintf;

/* renamed from: com.konylabs.vmintf.e */
final class C0257e implements Runnable {
    private /* synthetic */ KonyJavaScriptVM f1884a;

    C0257e(KonyJavaScriptVM konyJavaScriptVM) {
        this.f1884a = konyJavaScriptVM;
    }

    public final void run() {
        this.f1884a.v8GC();
        System.gc();
    }
}
