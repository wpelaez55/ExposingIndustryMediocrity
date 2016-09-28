package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.t */
public final class C0407t implements Library {
    private static Library f3142a;
    private static HashMap f3143b;
    private static String[] f3144c;

    static {
        f3144c = new String[]{"addAll", "removeAll", "removeAt", "setData", "setDataAt", "addDataAt"};
    }

    public C0407t() {
        if (f3142a == null) {
            Library f = C0349R.m2287f();
            f3142a = f;
            f3143b = cr.m2202a(f);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3142a.execute(((Integer) f3143b.get("addall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3142a.execute(((Integer) f3143b.get("removeall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3142a.execute(((Integer) f3143b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3142a.execute(((Integer) f3143b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3142a.execute(((Integer) f3143b.get("setdataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3142a.execute(((Integer) f3143b.get("adddataat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3144c;
    }

    public final String getNameSpace() {
        return "kony.ui.HorizontalImageStrip2";
    }
}
