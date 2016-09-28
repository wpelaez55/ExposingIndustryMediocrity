package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.N */
public final class C0389N implements Library {
    private static Library f3079a;
    private static HashMap f3080b;
    private static String[] f3081c;

    static {
        f3079a = null;
        f3081c = new String[]{"Alert", "dismissAlert"};
    }

    public C0389N() {
        if (f3079a == null) {
            Library c0349r = new C0349R();
            f3079a = c0349r;
            f3080b = cr.m2202a(c0349r);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3079a.execute(((Integer) f3080b.get("Alert")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3079a.execute(((Integer) f3080b.get("dismissAlert")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3081c;
    }

    public final String getNameSpace() {
        return BuildConfig.FLAVOR;
    }
}
