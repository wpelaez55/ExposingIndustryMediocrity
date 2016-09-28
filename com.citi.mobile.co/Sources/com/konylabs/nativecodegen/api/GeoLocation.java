package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0364m;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class GeoLocation {
    private static Library f1712a;
    private static HashMap f1713b;

    private GeoLocation() {
    }

    public static void clearWatch(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GeoLocationLibNative", "Executing GeoLocation.clearWatch()");
        }
        f1712a.execute(((Integer) f1713b.get("clearwatch")).intValue(), objArr);
    }

    public static void getCurrentPosition(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GeoLocationLibNative", "Executing GeoLocation.getCurrentPosition()");
        }
        f1712a.execute(((Integer) f1713b.get("getcurrentposition")).intValue(), objArr);
    }

    public static void initialize() {
        if (f1712a == null) {
            Library c0364m = new C0364m();
            f1712a = c0364m;
            f1713b = cr.m2202a(c0364m);
        }
    }

    public static void watchPosition(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GeoLocationLibNative", "Executing GeoLocation.watchPosition()");
        }
        f1712a.execute(((Integer) f1713b.get("watchposition")).intValue(), objArr);
    }
}
