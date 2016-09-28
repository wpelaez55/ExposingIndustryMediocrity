package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.c */
public final class C0394c implements Library {
    private static Library f3108a;
    private static HashMap f3109b;
    private static String[] f3110c;

    static {
        f3110c = new String[]{"add", "addAt", "remove", "removeAt", "widgets", "scrollToBeginning", "scrollToEnd", "replaceAt", "destroy", "scrollToWidget"};
    }

    public C0394c() {
        if (f3108a == null) {
            Library c = C0349R.m2284c();
            f3108a = c;
            f3109b = cr.m2202a(c);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3108a.execute(((Integer) f3109b.get("add")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3108a.execute(((Integer) f3109b.get("addat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3108a.execute(((Integer) f3109b.get("remove")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3108a.execute(((Integer) f3109b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3108a.execute(((Integer) f3109b.get("widgets")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3108a.execute(((Integer) f3109b.get("scrolltobeginning")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3108a.execute(((Integer) f3109b.get("scrolltoend")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3108a.execute(((Integer) f3109b.get("replaceat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3108a.execute(((Integer) f3109b.get("destroy")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return f3108a.execute(((Integer) f3109b.get("scrolltowidget")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3110c;
    }

    public final String getNameSpace() {
        return "kony.ui.box";
    }
}
