package com.konylabs.hybrid;

import com.konylabs.api.ui.C0216r;
import com.konylabs.api.ui.gb;

/* renamed from: com.konylabs.hybrid.a */
final class C0226a implements Runnable {
    private /* synthetic */ String f1665a;
    private /* synthetic */ String f1666b;
    private /* synthetic */ KonyHybridJSInterface f1667c;

    C0226a(KonyHybridJSInterface konyHybridJSInterface, String str, String str2) {
        this.f1667c = konyHybridJSInterface;
        this.f1665a = str;
        this.f1666b = str2;
    }

    public final void run() {
        if (this.f1667c.f1664a == 2) {
            gb.m4869a(this.f1665a, C0216r.m1554a(this.f1666b, 0));
        } else {
            gb.m4869a(this.f1665a, C0216r.m1554a(this.f1666b, 0));
        }
    }
}
