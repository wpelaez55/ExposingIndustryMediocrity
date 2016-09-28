package com.konylabs.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.gcm.C0225a;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;

/* renamed from: com.konylabs.api.B */
public final class C0338B implements Library {
    private static String[] f2377a;

    static {
        f2377a = new String[]{"setcallbacks", "register", "deregister"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        int i2 = 0;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                i2 = C0225a.m1603b(objArr);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                i2 = C0225a.m1595a(objArr);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                i2 = C0225a.m1606c(objArr);
                break;
        }
        if (i2 == 1400) {
            throw new LuaError("Invalid number of arguments for kony.push API's", 1400);
        } else if (i2 != 1401) {
            return null;
        } else {
            throw new LuaError("Illegal arguments for kony.push API's", 1401);
        }
    }

    public final String[] getMethods() {
        return f2377a;
    }

    public final String getNameSpace() {
        return "push";
    }
}
