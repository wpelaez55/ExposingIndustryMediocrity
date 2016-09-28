package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.s */
public final class C0406s implements Library {
    private static Library f3139a;
    private static HashMap f3140b;
    private static String[] f3141c;

    static {
        f3141c = new String[]{"addAll", "removeAll", "removeAt", "setData", "setDataAt"};
    }

    public C0406s() {
        if (f3139a == null) {
            Library f = C0349R.m2287f();
            f3139a = f;
            f3140b = cr.m2202a(f);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3139a.execute(((Integer) f3140b.get("addall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3139a.execute(((Integer) f3140b.get("removeall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3139a.execute(((Integer) f3140b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3139a.execute(((Integer) f3140b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3139a.execute(((Integer) f3140b.get("setdataat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3141c;
    }

    public final String getNameSpace() {
        return "kony.ui.HorizontalImageStrip";
    }
}
