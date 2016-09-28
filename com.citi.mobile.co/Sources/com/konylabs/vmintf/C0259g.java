package com.konylabs.vmintf;

/* renamed from: com.konylabs.vmintf.g */
final class C0259g implements Runnable {
    private /* synthetic */ KonyJavaScriptVM f1886a;

    C0259g(KonyJavaScriptVM konyJavaScriptVM) {
        this.f1886a = konyJavaScriptVM;
    }

    public final void run() {
        this.f1886a.notifyV8GC();
    }
}
