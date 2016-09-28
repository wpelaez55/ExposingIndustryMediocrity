package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0361j;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Crypto {
    private static Library f1701a;
    private static HashMap f1702b;

    private Crypto() {
    }

    public static String createHash(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.createHash()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("createhash")).intValue(), objArr);
        return execute != null ? (String) execute[0] : null;
    }

    public static String decrypt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.decrypt()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("decrypt")).intValue(), objArr);
        return execute != null ? (String) execute[0] : null;
    }

    public static Object deleteKey(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.deleteKey()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("deletekey")).intValue(), objArr);
        return execute != null ? execute[0] : null;
    }

    public static Object encrypt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.encrypt()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("encrypt")).intValue(), objArr);
        return execute != null ? execute[0] : null;
    }

    public static void initialize() {
        if (f1701a == null) {
            Library c0361j = new C0361j(KonyMain.getAppContext());
            f1701a = c0361j;
            f1702b = cr.m2202a(c0361j);
        }
    }

    public static Object newKey(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.newKey()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("newkey")).intValue(), objArr);
        return execute != null ? execute[0] : null;
    }

    public static Object readKey(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.readKey()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("readkey")).intValue(), objArr);
        return execute != null ? execute[0] : null;
    }

    public static Object retrievePublicKey(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.retrievePublicKey()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("retrievepublickey")).intValue(), objArr);
        return execute != null ? execute[0] : null;
    }

    public static String saveKey(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CryptoLibNAtive", "Executing Crypto.saveKey()");
        }
        Object[] execute = f1701a.execute(((Integer) f1702b.get("savekey")).intValue(), objArr);
        return execute != null ? (String) execute[0] : null;
    }
}
