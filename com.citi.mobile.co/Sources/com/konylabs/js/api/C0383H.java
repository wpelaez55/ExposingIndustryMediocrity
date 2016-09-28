package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.H */
public final class C0383H implements Library {
    private static Library f3060a;
    private static HashMap f3061b;
    private static String[] f3062c;

    static {
        f3062c = new String[]{"addAll", "addDataAt", "setData", "setDataAt", "removeAll", "removeAt", "addSectionAt", "removeSectionAt", "setSectionAt"};
    }

    public C0383H() {
        if (f3060a == null) {
            Library d = C0349R.m2285d();
            f3060a = d;
            f3061b = cr.m2202a(d);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3060a.execute(((Integer) f3061b.get("addall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3060a.execute(((Integer) f3061b.get("adddataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3060a.execute(((Integer) f3061b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3060a.execute(((Integer) f3061b.get("setdataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3060a.execute(((Integer) f3061b.get("removeall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3060a.execute(((Integer) f3061b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3060a.execute(((Integer) f3061b.get("addsectionat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3060a.execute(((Integer) f3061b.get("removesectionat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3060a.execute(((Integer) f3061b.get("setsectionat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3062c;
    }

    public final String getNameSpace() {
        return "kony.ui.SegmentedUI2";
    }
}
