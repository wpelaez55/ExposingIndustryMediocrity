package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0347P;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Timer {
    private static C0347P f1760a;
    private static HashMap f1761b;

    private Timer() {
    }

    public static void cancel(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("TimerNative", "Executing Timer.cancel()");
        }
        f1760a.execute(((Integer) f1761b.get("cancel")).intValue(), objArr);
    }

    public static void initialize() {
        if (f1760a == null) {
            Library c0347p = new C0347P();
            f1760a = c0347p;
            f1761b = cr.m2202a(c0347p);
        }
    }

    public static void schedule(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("TimerNative", "Executing Timer.schedule()");
        }
        f1760a.execute(((Integer) f1761b.get("schedule")).intValue(), objArr);
    }

    public static Double setCallback(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("TimerNative", "Executing Timer.setCallback()");
        }
        Object[] execute = f1760a.execute(((Integer) f1761b.get("setcallback")).intValue(), objArr);
        return execute != null ? (Double) execute[0] : null;
    }
}
