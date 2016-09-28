package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.d */
public final class C0395d implements Library {
    private static Library f3111a;
    private static HashMap f3112b;
    private static String[] f3113c;

    static {
        f3113c = new String[]{"clear", "setEnabled", "enableRangeOfDates", "setEnableAll", "setDatesSkin", "setData", "setDataAt", "removeDataAt", "clearData", "navigateToPreviousMonth", "navigateToNextMonth"};
    }

    public C0395d() {
        if (f3111a == null) {
            Library l = C0349R.m2293l();
            f3111a = l;
            f3112b = cr.m2202a(l);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3111a.execute(((Integer) f3112b.get("clear")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3111a.execute(((Integer) f3112b.get("setenabled")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3111a.execute(((Integer) f3112b.get("setenabled")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3111a.execute(((Integer) f3112b.get("setenableall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3111a.execute(((Integer) f3112b.get("setdateskin")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3111a.execute(((Integer) f3112b.get("setData")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3111a.execute(((Integer) f3112b.get("setDataAt")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3111a.execute(((Integer) f3112b.get("removeDataAt")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3111a.execute(((Integer) f3112b.get("clearData")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return f3111a.execute(((Integer) f3112b.get("navigateToPreviousMonth")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                return f3111a.execute(((Integer) f3112b.get("navigateToNextMonth")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3113c;
    }

    public final String getNameSpace() {
        return "kony.ui.Calendar";
    }
}
