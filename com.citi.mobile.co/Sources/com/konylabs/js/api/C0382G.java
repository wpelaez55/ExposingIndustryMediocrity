package com.konylabs.js.api;

import com.konylabs.api.C0338B;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.G */
public final class C0382G implements Library {
    private static String[] f3057a;
    private static Library f3058b;
    private static HashMap f3059c;

    static {
        f3057a = new String[]{"register", "deRegister", "setCallbacks"};
    }

    public C0382G() {
        if (f3058b == null) {
            Library c0338b = new C0338B();
            f3058b = c0338b;
            f3059c = cr.m2202a(c0338b);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3058b.execute(((Integer) f3059c.get("register")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3058b.execute(((Integer) f3059c.get("deregister")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3058b.execute(((Integer) f3059c.get("setcallbacks")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3057a;
    }

    public final String getNameSpace() {
        return "kony.push";
    }
}
