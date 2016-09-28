package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0354c;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Camera {
    private static Library f1694a;
    private static HashMap f1695b;

    private Camera() {
    }

    public static void initialize() {
        if (f1694a == null) {
            KonyMain.getAppContext();
            Library c0354c = new C0354c();
            f1694a = c0354c;
            f1695b = cr.m2202a(c0354c);
        }
    }

    public static void releaseRawBytes(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CameraNative", "Executing Camera.releaseRawBytes()");
        }
        f1694a.execute(((Integer) f1695b.get("releaserawbytes")).intValue(), objArr);
    }
}
