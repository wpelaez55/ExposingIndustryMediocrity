package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Box {
    private static String f1689a;
    private static Library f1690b;
    private static HashMap f1691c;

    static {
        f1689a = "BoxNative";
    }

    private Box() {
    }

    static void m1622a() {
        if (f1690b == null) {
            Library c = C0349R.m2284c();
            f1690b = c;
            f1691c = cr.m2202a(c);
        }
    }

    public static void add(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1689a, "Executing Box.add()");
        }
        f1690b.execute(((Integer) f1691c.get("add")).intValue(), objArr);
    }

    public static void setVisibility(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1689a, "Executing Box.setVisibility()");
        }
        f1690b.execute(((Integer) f1691c.get("setvisibility")).intValue(), objArr);
    }
}
