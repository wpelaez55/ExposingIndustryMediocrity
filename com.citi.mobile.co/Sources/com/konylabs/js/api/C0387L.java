package com.konylabs.js.api;

import com.konylabs.api.C0346M;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.L */
public final class C0387L implements Library {
    private static final String[] f3073a;
    private static Library f3074b;
    private static HashMap f3075c;

    static {
        f3073a = new String[]{"setCurrentTheme", "isThemePresent", "getAllThemes", "getCurrentTheme", "createTheme", "getCurrentThemeData", "deleteTheme"};
    }

    public C0387L() {
        if (f3074b == null) {
            Library c0346m = new C0346M();
            f3074b = c0346m;
            f3075c = cr.m2202a(c0346m);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3074b.execute(((Integer) f3075c.get("setcurrenttheme")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3074b.execute(((Integer) f3075c.get("isthemepresent")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3074b.execute(((Integer) f3075c.get("allthemes")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3074b.execute(((Integer) f3075c.get("getcurrenttheme")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3074b.execute(((Integer) f3075c.get("createtheme")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3074b.execute(((Integer) f3075c.get("getcurrentthemedata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3074b.execute(((Integer) f3075c.get("deletetheme")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3073a;
    }

    public final String getNameSpace() {
        return "kony.theme";
    }
}
