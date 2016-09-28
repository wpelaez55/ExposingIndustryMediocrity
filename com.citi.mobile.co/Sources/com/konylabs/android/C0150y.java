package com.konylabs.android;

import android.util.Log;
import com.konylabs.vm.C0252r;
import com.konylabs.vm.LuaError;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.konylabs.android.y */
final class C0150y implements UncaughtExceptionHandler {
    final /* synthetic */ KonyMain f52a;

    C0150y(KonyMain konyMain) {
        this.f52a = konyMain;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (KonyMain.f3659g) {
            LuaError a = C0252r.m1766a(th);
            Log.e(KonyMain.f3665n, "Error code " + a.getErrorCode());
            Log.e(KonyMain.f3665n, a.getErrorMessage());
        }
        KonyMain.m4094a(new C0151z(this, th));
    }
}
