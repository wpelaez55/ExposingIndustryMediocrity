package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Map {
    private static String f1724a;
    private static Library f1725b;
    private static HashMap f1726c;

    static {
        f1724a = "MapNative";
    }

    private Map() {
    }

    public static void initialize() {
        if (f1725b == null) {
            Library o = C0349R.m2296o();
            f1725b = o;
            f1726c = cr.m2202a(o);
        }
    }

    public static void navigateto(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1724a, "Executing Map.navigateto()");
        }
        f1725b.execute(((Integer) f1726c.get("navigateto")).intValue(), objArr);
    }

    public static void navigatetolocation(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1724a, "Executing navigatetolocation()");
        }
        f1725b.execute(((Integer) f1726c.get("navigatetolocation")).intValue(), objArr);
    }

    public static void routelocations(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1724a, "Executing routelocations()");
        }
        f1725b.execute(((Integer) f1726c.get("routelocations")).intValue(), objArr);
    }
}
