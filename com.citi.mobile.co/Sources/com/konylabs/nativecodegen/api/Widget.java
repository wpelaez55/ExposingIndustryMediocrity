package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Widget {
    private static Library f1766a;
    private static HashMap f1767b;

    private Widget() {
    }

    static void m1634a() {
        if (f1766a == null) {
            Library a = C0349R.m2282a();
            f1766a = a;
            f1767b = cr.m2202a(a);
        }
    }

    public static void removeGestureRecognizer(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WidgetNative", "Calling removeGestureRecognizer()");
        }
        f1766a.execute(((Integer) f1767b.get("removegesturerecognizer")).intValue(), objArr);
    }

    public static void setEnable(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WidgetNative", "Calling Widget.setenable()");
        }
        f1766a.execute(((Integer) f1767b.get("setenabled")).intValue(), objArr);
    }

    public static void setFocus(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WidgetNative", "Calling Widget.setfocus()");
        }
        f1766a.execute(((Integer) f1767b.get("setfocus")).intValue(), objArr);
    }

    public static void setFontColor(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WidgetNative", "Calling Widget.setfontcolor()");
        }
        f1766a.execute(((Integer) f1767b.get("setfontcolor")).intValue(), objArr);
    }

    public static void setGestureRecognizer(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WidgetNative", "Calling Widget.addGestureRecognizer()");
        }
        f1766a.execute(((Integer) f1767b.get("setgesturerecognizer")).intValue(), objArr);
    }

    public static void setVisibility(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WidgetNative", "Calling Widget.setvisibility()");
        }
        f1766a.execute(((Integer) f1767b.get("setvisibility")).intValue(), objArr);
    }
}
