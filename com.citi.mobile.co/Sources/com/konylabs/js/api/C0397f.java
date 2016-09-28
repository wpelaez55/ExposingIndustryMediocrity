package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.f */
public final class C0397f implements Library {
    private static Library f3117a;
    private static HashMap f3118b;
    private static String[] f3119c;

    static {
        f3119c = new String[]{"updateData", "setData", "addData", "setProperties", "setEvents"};
    }

    public C0397f() {
        if (f3117a == null) {
            Library p = C0349R.m2297p();
            f3117a = p;
            f3118b = cr.m2202a(p);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3117a.execute(((Integer) f3118b.get("updatedata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3117a.execute(((Integer) f3118b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3117a.execute(((Integer) f3118b.get("adddata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3117a.execute(((Integer) f3118b.get("setProperties")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3117a.execute(((Integer) f3118b.get("setEvents")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3119c;
    }

    public final String getNameSpace() {
        return "kony.ui.Chart2d3d";
    }
}
