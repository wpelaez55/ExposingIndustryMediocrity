package com.konylabs.js.api;

import com.konylabs.api.C0340G;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.J */
public final class C0385J implements Library {
    private static String[] f3066a;
    private static Library f3067b;
    private static HashMap f3068c;

    static {
        f3066a = new String[]{"registerDataStream", "deregisterDataStream", "setCallback"};
    }

    public C0385J() {
        if (f3067b == null) {
            Library c0340g = new C0340G();
            f3067b = c0340g;
            f3068c = cr.m2202a(c0340g);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3067b.execute(((Integer) f3068c.get("registerdatastream")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3067b.execute(((Integer) f3068c.get("deregisterdatastream")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3067b.execute(((Integer) f3068c.get("setcallback")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3066a;
    }

    public final String getNameSpace() {
        return "kony.stream";
    }
}
