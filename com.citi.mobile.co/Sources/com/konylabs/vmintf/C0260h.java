package com.konylabs.vmintf;

/* renamed from: com.konylabs.vmintf.h */
final class C0260h implements Runnable {
    private /* synthetic */ KonyJavaScriptVM f1887a;

    C0260h(KonyJavaScriptVM konyJavaScriptVM) {
        this.f1887a = konyJavaScriptVM;
    }

    public final void run() {
        this.f1887a.notifyV8GC();
    }
}
