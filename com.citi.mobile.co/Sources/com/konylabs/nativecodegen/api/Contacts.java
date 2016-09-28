package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0360i;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import java.util.HashMap;
import ny0k.cr;

public class Contacts {
    private static Library f1699a;
    private static HashMap f1700b;

    private Contacts() {
    }

    public static Object add(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ContactsLibNative", "Executing Contacts.add()");
        }
        return f1699a.execute(((Integer) f1700b.get("add")).intValue(), objArr)[0];
    }

    public static Object delete(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ContactsLibNative", "Executing Contacts.delete()");
        }
        Object[] execute = f1699a.execute(((Integer) f1700b.get("delete")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static Object find(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ContactsLibNative", "Executing Contacts.find()");
        }
        return f1699a.execute(((Integer) f1700b.get("find")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1699a == null) {
            Library c0360i = new C0360i(KonyMain.getAppContext());
            f1699a = c0360i;
            f1700b = cr.m2202a(c0360i);
        }
    }
}
