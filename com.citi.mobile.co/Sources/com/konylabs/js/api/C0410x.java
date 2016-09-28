package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.x */
public final class C0410x implements Library {
    private static Library f3150a;
    private static HashMap f3151b;
    private static String[] f3152c;

    static {
        f3152c = new String[]{"addAll", "setData", "setDataAt", "addDataAt", "removeAll", "removeAt"};
    }

    public C0410x() {
        if (f3150a == null) {
            Library g = C0349R.m2288g();
            f3150a = g;
            f3151b = cr.m2202a(g);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3150a.execute(((Integer) f3151b.get("addall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3150a.execute(((Integer) f3151b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3150a.execute(((Integer) f3151b.get("setdataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3150a.execute(((Integer) f3151b.get("adddataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3150a.execute(((Integer) f3151b.get("removeall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3150a.execute(((Integer) f3151b.get("removeat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3152c;
    }

    public final String getNameSpace() {
        return "kony.ui.ImageGallery2";
    }
}
