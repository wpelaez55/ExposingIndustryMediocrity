package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.O */
public final class C0390O implements Library {
    private static Library f3082a;
    private static HashMap f3083b;
    private static String[] f3084c;

    static {
        f3084c = new String[]{"reload", "goForward", "goBack", "canGoBack", "canGoForward", "clearHistory", "loadData"};
    }

    public C0390O() {
        if (f3082a == null) {
            Library m = C0349R.m2294m();
            f3082a = m;
            f3083b = cr.m2202a(m);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3082a.execute(((Integer) f3083b.get("reload")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3082a.execute(((Integer) f3083b.get("goback")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3082a.execute(((Integer) f3083b.get("goforward")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3082a.execute(((Integer) f3083b.get("cangoback")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3082a.execute(((Integer) f3083b.get("cangoforward")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3082a.execute(((Integer) f3083b.get("clearhistory")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3082a.execute(((Integer) f3083b.get("loaddata")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3084c;
    }

    public final String getNameSpace() {
        return "kony.ui.WebWidget";
    }
}
