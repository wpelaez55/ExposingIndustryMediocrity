package com.konylabs.js.api;

import com.konylabs.api.C0365n;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.v */
public final class C0408v implements Library {
    private static Library f3145a;
    private static HashMap f3146b;
    private static String[] f3147c;

    static {
        f3147c = new String[]{"executeFunctionInSPAContext", "executeFunctionInTCContext", "executeFunctionInNativeContext"};
    }

    public C0408v() {
        if (f3145a == null) {
            Library c0365n = new C0365n();
            f3145a = c0365n;
            f3146b = cr.m2202a(c0365n);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3145a.execute(((Integer) f3146b.get("executefunctioninspacontext")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3145a.execute(((Integer) f3146b.get("executefunctionintccontext")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3145a.execute(((Integer) f3146b.get("executefunctioninnativecontext")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3147c;
    }

    public final String getNameSpace() {
        return "kony.hybrid";
    }
}
