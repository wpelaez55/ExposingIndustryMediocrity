package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Tabwidget {
    private static String f1755a;
    private static Library f1756b;
    private static HashMap f1757c;

    static {
        f1755a = "TabwidgetNative";
    }

    private Tabwidget() {
    }

    static void m1632a() {
        if (f1756b == null) {
            Library k = C0349R.m2292k();
            f1756b = k;
            f1757c = cr.m2202a(k);
        }
    }

    public static void add(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1755a, "Executing Tabwidget.add()");
        }
        f1756b.execute(((Integer) f1757c.get("add")).intValue(), objArr);
    }
}
