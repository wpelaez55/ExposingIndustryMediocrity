package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.y */
public final class C0411y implements Library {
    private static Library f3153a;
    private static HashMap f3154b;
    private static String[] f3155c;

    static {
        f3155c = new String[]{"addAll", "setData", "setDataAt", "removeAll", "removeAt"};
    }

    public C0411y() {
        if (f3153a == null) {
            Library g = C0349R.m2288g();
            f3153a = g;
            f3154b = cr.m2202a(g);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3153a.execute(((Integer) f3154b.get("addall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3153a.execute(((Integer) f3154b.get("removeall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3153a.execute(((Integer) f3154b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3153a.execute(((Integer) f3154b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3153a.execute(((Integer) f3154b.get("setdataat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3155c;
    }

    public final String getNameSpace() {
        return "kony.ui.ImageGallery";
    }
}
