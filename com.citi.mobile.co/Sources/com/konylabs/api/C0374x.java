package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.thirdparty.bumpapi.C0273b;
import ny0k.aH;

/* renamed from: com.konylabs.api.x */
final class C0374x implements C0273b {
    private /* synthetic */ Function f3034a;
    private /* synthetic */ Function f3035b;
    private /* synthetic */ C0373w f3036c;

    C0374x(C0373w c0373w, Function function, Function function2) {
        this.f3036c = c0373w;
        this.f3034a = function;
        this.f3035b = function2;
    }

    public final void m3377a(int i, String str) {
        C0373w c0373w = this.f3036c;
        C0373w.m3360a(this.f3034a, i, str);
    }

    public final void m3378a(byte[] bArr) {
        if (bArr != null) {
            if (KonyMain.f3657e) {
                Log.d("OSLib", "Data Received =================" + new String(bArr));
            }
            Object a = aH.m1892a(new String(bArr));
            C0373w c0373w = this.f3036c;
            C0373w.m3361a(this.f3035b, a);
            return;
        }
        C0373w c0373w2 = this.f3036c;
        C0373w.m3361a(this.f3035b, (Object) "Read failed");
    }
}
