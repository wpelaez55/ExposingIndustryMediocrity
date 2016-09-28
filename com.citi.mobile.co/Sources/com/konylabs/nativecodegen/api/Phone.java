package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0375z;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class Phone {
    public static final String TAG = "PhoneLibNative";
    private static Library f1734a;
    private static HashMap f1735b;

    private Phone() {
    }

    public static Double dial(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(TAG, "Executing Phone.dial()");
        }
        return (Double) f1734a.execute(((Integer) f1735b.get("dial")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1734a == null) {
            Library c0375z = new C0375z(KonyMain.getAppContext());
            f1734a = c0375z;
            f1735b = cr.m2202a(c0375z);
        }
    }

    public static LuaTable myLocation(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(TAG, "Executing Phone.myLocation()");
        }
        return (LuaTable) f1734a.execute(((Integer) f1735b.get("mylocation")).intValue(), objArr)[0];
    }

    public static void onreceiveSMS(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(TAG, "Executing phone.onreceiveSMS()");
        }
        f1734a.execute(((Integer) f1735b.get("onreceiveSMS")).intValue(), objArr);
    }

    public static LuaTable openEmail(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(TAG, "Phone.openMediaGallery()");
        }
        return (LuaTable) f1734a.execute(((Integer) f1735b.get("openemail")).intValue(), objArr)[0];
    }

    public static LuaTable openMediaGallery(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(TAG, "Executing Phone.openMediaGallery()");
        }
        return (LuaTable) f1734a.execute(((Integer) f1735b.get("openmediagallery")).intValue(), objArr)[0];
    }

    public static void sendMMS(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(TAG, "Executing phone.sendMMS()");
        }
        f1734a.execute(((Integer) f1735b.get("sendMMS")).intValue(), objArr);
    }

    public static Double sendSMS(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(TAG, "Executing Phone.sendSMS()");
        }
        return (Double) f1734a.execute(((Integer) f1735b.get("sendSMS")).intValue(), objArr)[0];
    }
}
