package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.o */
public final class C0402o implements Library {
    private static Library f3130a;
    private static HashMap f3131b;
    private static String[] f3132c;

    static {
        f3132c = new String[]{"add", "addAt", "show", "destroy", "remove", "removeAt", "widgets", "scrollToWidget", "scrollToBeginning", "scrollToEnd", "replaceAt"};
    }

    public C0402o() {
        if (f3130a == null) {
            Library b = C0349R.m2283b();
            f3130a = b;
            f3131b = cr.m2202a(b);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3130a.execute(((Integer) f3131b.get("add")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3130a.execute(((Integer) f3131b.get("addat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3130a.execute(((Integer) f3131b.get("show")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3130a.execute(((Integer) f3131b.get("destroy")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3130a.execute(((Integer) f3131b.get("remove")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3130a.execute(((Integer) f3131b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3130a.execute(((Integer) f3131b.get("widgets")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3130a.execute(((Integer) f3131b.get("scrolltowidget")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3130a.execute(((Integer) f3131b.get("scrolltobeginning")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return f3130a.execute(((Integer) f3131b.get("scrolltoend")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                return f3130a.execute(((Integer) f3131b.get("replaceat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3132c;
    }

    public final String getNameSpace() {
        return "kony.ui.form";
    }
}
