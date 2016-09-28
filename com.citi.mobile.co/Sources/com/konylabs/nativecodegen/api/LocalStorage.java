package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.C0424R;
import ny0k.cr;

public class LocalStorage {
    private static C0424R f1722a;
    private static HashMap f1723b;

    private LocalStorage() {
    }

    public static void clear() {
        if (KonyMain.f3657e) {
            Log.d("LocalStorageNative", "Calling clear()");
        }
        f1722a.execute(((Integer) f1723b.get("clear")).intValue(), null);
    }

    public static Object getItem(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("LocalStorageNative", "Calling getItem() with key: " + objArr[0]);
        }
        return f1722a.execute(((Integer) f1723b.get("getitem")).intValue(), objArr)[0];
    }

    public static String getKey(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("LocalStorageNative", "Calling getKey() for index: " + objArr[0]);
        }
        return (String) f1722a.execute(((Integer) f1723b.get("key")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1722a == null) {
            Library c0424r = new C0424R();
            f1722a = c0424r;
            f1723b = cr.m2202a(c0424r);
        }
    }

    public static void removeItem(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("LocalStorageNative", "Calling removeItem() with key: " + objArr[0]);
        }
        f1722a.execute(((Integer) f1723b.get("removeitem")).intValue(), objArr);
    }

    public static void setItem(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("LocalStorageNative", "Calling setItem() with key: " + objArr[0] + " value: " + objArr[1]);
        }
        f1722a.execute(((Integer) f1723b.get("setitem")).intValue(), objArr);
    }
}
