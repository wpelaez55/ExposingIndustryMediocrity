package com.konylabs.api;

import android.content.Context;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.C0278K;

/* renamed from: com.konylabs.api.k */
public final class C0362k implements Library {
    private Context f2427a;

    public C0362k(Context context) {
        this.f2427a = context;
    }

    public final Object[] execute(int i, Object[] objArr) {
        C0278K c0278k;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (KonyMain.f3657e) {
                    Log.d("DataStoreLib", "Executing the save table for KonyDataSource");
                }
                if (objArr.length < 2) {
                    throw new LuaError("Invalid number of parameters for kony.ds.save()", 701);
                } else if (!(objArr[0] instanceof LuaTable)) {
                    throw new LuaError("Invalid first parameter type for kony.gs.save()", 702);
                } else if (objArr[1] instanceof String) {
                    boolean z;
                    c0278k = new C0278K(this.f2427a);
                    if (c0278k.m1804a(objArr[1].toString(), objArr[0])) {
                        z = true;
                    } else {
                        if (KonyMain.f3658f) {
                            Log.w("DataStoreLib", "Failed to save the object : " + c0278k.f1899a);
                        }
                        z = false;
                    }
                    new Object[1][0] = new Boolean(z);
                    return null;
                } else {
                    throw new LuaError("Invalid 2nd parameter type for kony.gs.save()", 703);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr.length <= 0) {
                    throw new LuaError("Invalid number of parameters for kony.ds.read()", 705);
                } else if (objArr[0] instanceof String) {
                    Object[] objArr2;
                    C0278K c0278k2 = new C0278K(this.f2427a);
                    Object a = c0278k2.m1803a(objArr[0].toString());
                    if (a != null || c0278k2.f1899a == null) {
                        Object[] objArr3 = new Object[1];
                        if (a == null) {
                            a = LuaNil.nil;
                        }
                        objArr3[0] = a;
                        objArr2 = objArr3;
                    } else {
                        objArr2 = null;
                    }
                    return objArr2;
                } else {
                    throw new LuaError("Invalid parameters for kony.ds.read()", 706);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr.length <= 0) {
                    throw new LuaError("Invalid number of parameters for kony.ds.remove()", 705);
                } else if (objArr[0] instanceof String) {
                    c0278k = new C0278K(this.f2427a);
                    return new Object[]{new Boolean(c0278k.m1805b(objArr[0].toString()))};
                } else {
                    throw new LuaError("Invalid parameter type for kony.ds.remove()", 706);
                }
            default:
                throw new LuaError("kony.ds name space has no such method", 708);
        }
    }

    public final String[] getMethods() {
        return new String[]{"save", "read", "delete"};
    }

    public final String getNameSpace() {
        return KonyMain.m4056B() ? "ds" : "kony.ds";
    }
}
