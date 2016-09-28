package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.K */
public final class C0386K implements Library {
    private static Library f3069a;
    private static HashMap f3070b;
    private static String[] f3071c;

    static {
        f3071c = new String[]{"addTab", "addTabAt", "removeTabAt", "removeTabById"};
    }

    public C0386K() {
        if (f3069a == null) {
            Library k = C0349R.m2292k();
            f3069a = k;
            f3070b = cr.m2202a(k);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3069a.execute(((Integer) f3070b.get("addtab")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3069a.execute(((Integer) f3070b.get("addtabat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3069a.execute(((Integer) f3070b.get("removetabat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3069a.execute(((Integer) f3070b.get("removetabbyid")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3071c;
    }

    public final String getNameSpace() {
        return "kony.ui.TabPane";
    }
}
