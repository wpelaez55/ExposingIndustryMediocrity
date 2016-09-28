package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.B */
public final class C0377B implements Library {
    private static Library f3042a;
    private static HashMap f3043b;
    private static String[] f3044c;

    static {
        f3044c = new String[]{"navigateTo", "navigateToLocation", "addPolyline", "removePolyline", "dismissCallout", "getBounds", "clear"};
    }

    public C0377B() {
        if (f3042a == null) {
            Library o = C0349R.m2296o();
            f3042a = o;
            f3043b = cr.m2202a(o);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3042a.execute(((Integer) f3043b.get("navigateto")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3042a.execute(((Integer) f3043b.get("navigatetolocation")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3042a.execute(((Integer) f3043b.get("addpolyline")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3042a.execute(((Integer) f3043b.get("removepolyline")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3042a.execute(((Integer) f3043b.get("dismisscallout")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3042a.execute(((Integer) f3043b.get("getbounds")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3042a.execute(((Integer) f3043b.get("clear")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3044c;
    }

    public final String getNameSpace() {
        return "kony.ui.Map";
    }
}
