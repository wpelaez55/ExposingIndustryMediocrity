package com.konylabs.js.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.C0424R;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.A */
public final class C0376A implements Library {
    private static final String[] f3039a;
    private static C0424R f3040b;
    private static HashMap f3041c;

    static {
        f3039a = new String[]{"key", "getItem", "setItem", "removeItem", "clear", "length"};
    }

    public C0376A() {
        if (f3040b == null) {
            Library c0424r = new C0424R();
            f3040b = c0424r;
            f3041c = cr.m2202a(c0424r);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3040b.execute(((Integer) f3041c.get("key")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3040b.execute(((Integer) f3041c.get("getitem")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                f3040b.execute(((Integer) f3041c.get("setitem")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                f3040b.execute(((Integer) f3041c.get("removeitem")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                f3040b.execute(((Integer) f3041c.get("clear")).intValue(), null);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3040b.execute(((Integer) f3041c.get("length")).intValue(), null);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3039a;
    }

    public final String getNameSpace() {
        return "kony.store";
    }
}
