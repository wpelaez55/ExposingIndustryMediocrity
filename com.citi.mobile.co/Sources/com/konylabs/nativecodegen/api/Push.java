package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0338B;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Push {
    private static Library f1742a;
    private static HashMap f1743b;

    private Push() {
    }

    public static void deregister(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("PushLibNative", "Executing Push.deregister()");
        }
        f1742a.execute(((Integer) f1743b.get("deregister")).intValue(), objArr);
    }

    public static void initialize() {
        if (f1742a == null) {
            Library c0338b = new C0338B();
            f1742a = c0338b;
            f1743b = cr.m2202a(c0338b);
        }
    }

    public static void register(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("PushLibNative", "Executing Push.register()");
        }
        f1742a.execute(((Integer) f1743b.get("register")).intValue(), objArr);
    }

    public static void setCallbacks(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("PushLibNative", "Executing Push.setCallbacks()");
        }
        f1742a.execute(((Integer) f1743b.get("setcallbacks")).intValue(), objArr);
    }
}
