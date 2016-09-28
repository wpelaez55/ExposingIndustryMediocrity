package com.konylabs.js.api;

import com.konylabs.api.C0364m;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.q */
public final class C0404q implements Library {
    private static Library f3134a;
    private static HashMap f3135b;
    private static String[] f3136c;

    static {
        f3136c = new String[]{"getCurrentPosition", "watchPosition", "clearWatch"};
    }

    public C0404q() {
        if (f3134a == null) {
            Library c0364m = new C0364m();
            f3134a = c0364m;
            f3135b = cr.m2202a(c0364m);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                f3134a.execute(((Integer) f3135b.get("getcurrentposition")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3134a.execute(((Integer) f3135b.get("watchposition")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                f3134a.execute(((Integer) f3135b.get("clearwatch")).intValue(), objArr);
                break;
        }
        return null;
    }

    public final String[] getMethods() {
        return f3136c;
    }

    public final String getNameSpace() {
        return "kony.location";
    }
}
