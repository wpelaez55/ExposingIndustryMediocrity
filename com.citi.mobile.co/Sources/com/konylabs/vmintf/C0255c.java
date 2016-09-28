package com.konylabs.vmintf;

/* renamed from: com.konylabs.vmintf.c */
final class C0255c implements Runnable {
    private /* synthetic */ int f1881a;
    private /* synthetic */ KonyJavaScriptVM f1882b;

    C0255c(KonyJavaScriptVM konyJavaScriptVM, int i) {
        this.f1882b = konyJavaScriptVM;
        this.f1881a = i;
    }

    public final void run() {
        this.f1882b.m3412b(this.f1881a);
    }
}
