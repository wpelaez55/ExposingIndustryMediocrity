package com.konylabs.vmintf;

/* renamed from: com.konylabs.vmintf.f */
final class C0258f implements Runnable {
    private /* synthetic */ KonyJavaScriptVM f1885a;

    C0258f(KonyJavaScriptVM konyJavaScriptVM) {
        this.f1885a = konyJavaScriptVM;
    }

    public final void run() {
        this.f1885a.v8GC();
        System.gc();
    }
}
