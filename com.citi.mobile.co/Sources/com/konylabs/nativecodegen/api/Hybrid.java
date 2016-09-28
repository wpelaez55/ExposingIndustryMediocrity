package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0365n;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Hybrid {
    private static Library f1714a;
    private static HashMap f1715b;

    private Hybrid() {
    }

    public static Object[] executeFunctionInNativeContext(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("HybridLibNative", "Executing hybrid.executefunctioninnativecontext()");
        }
        return f1714a.execute(((Integer) f1715b.get("executefunctioninnativecontext")).intValue(), objArr);
    }

    public static Object[] executeFunctionInSPAContext(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("HybridLibNative", "Executing hybrid.executefunctioninspacontext()");
        }
        return f1714a.execute(((Integer) f1715b.get("executefunctioninspacontext")).intValue(), objArr);
    }

    public static Object[] executeFunctionInTCContext(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("HybridLibNative", "Executing hybrid.executefunctionintccontext()");
        }
        return f1714a.execute(((Integer) f1715b.get("executefunctionintccontext")).intValue(), objArr);
    }

    public static void initialize() {
        if (f1714a == null) {
            Library c0365n = new C0365n();
            f1714a = c0365n;
            f1715b = cr.m2202a(c0365n);
        }
    }
}
