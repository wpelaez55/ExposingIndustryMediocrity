package com.konylabs.js.api;

import com.konylabs.api.C0347P;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.M */
public final class C0388M implements Library {
    private static String[] f3076a;
    private static Library f3077b;
    private static HashMap f3078c;

    static {
        f3076a = new String[]{"schedule", "cancel", "setCallBack"};
    }

    public C0388M() {
        if (f3077b == null) {
            Library c0347p = new C0347P();
            f3077b = c0347p;
            f3078c = cr.m2202a(c0347p);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3077b.execute(((Integer) f3078c.get("schedule")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3077b.execute(((Integer) f3078c.get("cancel")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3077b.execute(((Integer) f3078c.get("setcallback")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3076a;
    }

    public final String getNameSpace() {
        return "kony.timer";
    }
}
