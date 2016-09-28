package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class ImageStrip {
    private static Library f1718a;
    private static HashMap f1719b;

    private ImageStrip() {
    }

    static void m1628a() {
        if (f1718a == null) {
            Library f = C0349R.m2287f();
            f1718a = f;
            f1719b = cr.m2202a(f);
        }
    }

    public static void addAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ImageStripNative", "Executing ImageStrip.addAll(params)");
        }
        f1718a.execute(((Integer) f1719b.get("addall")).intValue(), objArr);
    }

    public static void removeAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ImageStripNative", "Executing ImageStrip.removeAll(params)");
        }
        f1718a.execute(((Integer) f1719b.get("removeall")).intValue(), objArr);
    }

    public static void removeAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ImageStripNative", "Executing ImageStrip.removeAt(params)");
        }
        f1718a.execute(((Integer) f1719b.get("removeat")).intValue(), objArr);
    }

    public static void setData(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ImageStripNative", "Executing ImageStrip.setData(params)");
        }
        f1718a.execute(((Integer) f1719b.get("setdata")).intValue(), objArr);
    }

    public static void setDataAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ImageStripNative", "Executing ImageStrip.setDataAt(params)");
        }
        f1718a.execute(((Integer) f1719b.get("setdataat")).intValue(), objArr);
    }
}
