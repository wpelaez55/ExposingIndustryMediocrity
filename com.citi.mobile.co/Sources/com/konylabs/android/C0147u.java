package com.konylabs.android;

import android.util.Log;
import com.konylabs.vm.C0252r;
import com.konylabs.vm.LuaError;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.konylabs.android.u */
final class C0147u implements UncaughtExceptionHandler {
    private /* synthetic */ UncaughtExceptionHandler f50a;

    C0147u(KonyMain konyMain, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f50a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        LuaError a = C0252r.m1766a(th);
        Log.e(KonyMain.f3665n, "Error code " + a.getErrorCode());
        Log.e(KonyMain.f3665n, a.getErrorMessage());
        this.f50a.uncaughtException(thread, th);
    }
}
