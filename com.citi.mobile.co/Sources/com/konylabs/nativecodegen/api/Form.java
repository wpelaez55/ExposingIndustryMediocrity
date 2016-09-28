package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Form {
    private static String f1707a;
    private static Library f1708b;
    private static HashMap f1709c;

    static {
        f1707a = "FormNative";
    }

    private Form() {
    }

    static void m1626a() {
        if (f1708b == null) {
            Library b = C0349R.m2283b();
            f1708b = b;
            f1709c = cr.m2202a(b);
        }
    }

    public static void add(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1707a, "Executing Form.add()");
        }
        f1708b.execute(((Integer) f1709c.get("add")).intValue(), objArr);
    }

    public static void destroy(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1707a, "Executing Form.destroy()");
        }
        f1708b.execute(((Integer) f1709c.get("destroy")).intValue(), objArr);
    }

    public static Object getCurrentForm(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1707a, "Executing Form.getCurrentForm()");
        }
        return f1708b.execute(((Integer) f1709c.get("getcurrentform")).intValue(), objArr)[0];
    }

    public static Object getPreviousForm(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1707a, "Executing Form.getPreviousForm()");
        }
        return f1708b.execute(((Integer) f1709c.get("getpreviousform")).intValue(), objArr)[0];
    }

    public static void show(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1707a, "Executing Form.show()");
        }
        f1708b.execute(((Integer) f1709c.get("show")).intValue(), objArr);
    }
}
