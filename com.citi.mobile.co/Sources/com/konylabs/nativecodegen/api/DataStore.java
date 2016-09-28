package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0362k;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import java.util.HashMap;
import ny0k.cr;

public class DataStore {
    private static Library f1703a;
    private static HashMap f1704b;

    private DataStore() {
    }

    public static Boolean delete(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataStoreLibNative", "Executing DataStore.delete()");
        }
        return (Boolean) f1703a.execute(((Integer) f1704b.get("delete")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1703a == null) {
            Library c0362k = new C0362k(KonyMain.getAppContext());
            f1703a = c0362k;
            f1704b = cr.m2202a(c0362k);
        }
    }

    public static Object read(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataStoreLibNative", "Executing DataStore.read()");
        }
        Object[] execute = f1703a.execute(((Integer) f1704b.get("read")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static Boolean save(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataStoreLibNative", "Executing DataStore.save()");
        }
        return (Boolean) f1703a.execute(((Integer) f1704b.get("save")).intValue(), objArr)[0];
    }
}
