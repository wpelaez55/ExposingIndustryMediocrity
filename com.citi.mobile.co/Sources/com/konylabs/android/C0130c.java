package com.konylabs.android;

import com.konylabs.vmintf.KonyJSVM;
import com.konylabs.vmintf.KonyJavaScriptVM;

/* renamed from: com.konylabs.android.c */
final class C0130c implements Runnable {
    C0130c(C0129b c0129b) {
    }

    public final void run() {
        KonyJSVM.disposeContext(KonyJavaScriptVM.m3392c(), KonyJavaScriptVM.f3162a);
        KonyMain.m4121f().removeMessages(1);
        KonyMain.m4121f().removeMessages(7);
        System.gc();
        ((KonyJavaScriptVM) KonyMain.m4143x()).m3412b(0);
    }
}
