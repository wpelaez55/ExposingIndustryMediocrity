package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.I */
public final class C0384I implements Library {
    private static Library f3063a;
    private static HashMap f3064b;
    private static String[] f3065c;

    static {
        f3065c = new String[]{"addAll", "addAt", "setData", "setDataAt", "setDataWithSections", "removeAll", "removeAt"};
    }

    public C0384I() {
        if (f3063a == null) {
            Library d = C0349R.m2285d();
            f3063a = d;
            f3064b = cr.m2202a(d);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3063a.execute(((Integer) f3064b.get("addall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3063a.execute(((Integer) f3064b.get("addat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3063a.execute(((Integer) f3064b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3063a.execute(((Integer) f3064b.get("setdataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3063a.execute(((Integer) f3064b.get("setdatawithsections")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3063a.execute(((Integer) f3064b.get("removeall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3063a.execute(((Integer) f3064b.get("removeat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3065c;
    }

    public final String getNameSpace() {
        return "kony.ui.SegmentedUI";
    }
}
