package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Chart2D3D {
    private static String f1696a;
    private static Library f1697b;
    private static HashMap f1698c;

    static {
        f1696a = "Chart2D3DNative";
    }

    private Chart2D3D() {
    }

    static void m1624a() {
        if (f1697b == null) {
            Library p = C0349R.m2297p();
            f1697b = p;
            f1698c = cr.m2202a(p);
        }
    }

    public static void setdata(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1696a, "Executing Chart2D3D.setdata()");
        }
        f1697b.execute(((Integer) f1698c.get("setdata")).intValue(), objArr);
    }

    public static void setdatamap(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1696a, "Executing Chart2D3D.setdatamap()");
        }
        f1697b.execute(((Integer) f1698c.get("setdatamap")).intValue(), objArr);
    }

    public static void update(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1696a, "Executing Chart2D3D.update()");
        }
        f1697b.execute(((Integer) f1698c.get("update")).intValue(), objArr);
    }
}
