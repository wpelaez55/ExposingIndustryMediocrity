package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class WebWidget {
    private static Library f1764a;
    private static HashMap f1765b;

    private WebWidget() {
    }

    static void m1633a() {
        if (f1764a == null) {
            Library m = C0349R.m2294m();
            f1764a = m;
            f1765b = cr.m2202a(m);
        }
    }

    public static Boolean canGoBack(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebWidgetNative", "Executing WebWidget.canGoBack()");
        }
        Object[] execute = f1764a.execute(((Integer) f1765b.get("cangoback")).intValue(), objArr);
        return Boolean.valueOf(execute != null ? ((Boolean) execute[0]).booleanValue() : false);
    }

    public static Boolean canGoForward(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebWidgetNative", "Executing WebWidget.canGoForward()");
        }
        Object[] execute = f1764a.execute(((Integer) f1765b.get("cangoforward")).intValue(), objArr);
        return Boolean.valueOf(execute != null ? ((Boolean) execute[0]).booleanValue() : false);
    }

    public static void clearHistory(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebWidgetNative", "Executing WebWidget.clearHistory()");
        }
        f1764a.execute(((Integer) f1765b.get("clearhistory")).intValue(), objArr);
    }

    public static void goBack(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebWidgetNative", "Executing WebWidget.goBack()");
        }
        f1764a.execute(((Integer) f1765b.get("goback")).intValue(), objArr);
    }

    public static void goForward(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebWidgetNative", "Executing WebWidget.goForward()");
        }
        f1764a.execute(((Integer) f1765b.get("goforward")).intValue(), objArr);
    }

    public static void reload(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebWidgetNative", "Executing WebWidget.reload()");
        }
        f1764a.execute(((Integer) f1765b.get("reload")).intValue(), objArr);
    }
}
