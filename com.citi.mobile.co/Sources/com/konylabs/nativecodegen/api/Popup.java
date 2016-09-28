package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Popup {
    private static String f1739a;
    private static Library f1740b;
    private static HashMap f1741c;

    static {
        f1739a = "PopupNative";
    }

    private Popup() {
    }

    static void m1630a() {
        if (f1740b == null) {
            Library j = C0349R.m2291j();
            f1740b = j;
            f1741c = cr.m2202a(j);
        }
    }

    public static void add(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1739a, "Executing Popup.add()");
        }
        f1740b.execute(((Integer) f1741c.get("add")).intValue(), objArr);
    }

    public static void destroy(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1739a, "Executing Popup.destroy()");
        }
        f1740b.execute(((Integer) f1741c.get("destroy")).intValue(), objArr);
    }

    public static void dismiss(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1739a, "Executing Popup.dismiss()");
        }
        f1740b.execute(((Integer) f1741c.get("dismiss")).intValue(), objArr);
    }

    public static void setContext(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1739a, "Executing Popup.setcontext()");
        }
        f1740b.execute(((Integer) f1741c.get("setcontext")).intValue(), objArr);
    }

    public static void show(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1739a, "Executing Popup.show()");
        }
        f1740b.execute(((Integer) f1741c.get("show")).intValue(), objArr);
    }
}
