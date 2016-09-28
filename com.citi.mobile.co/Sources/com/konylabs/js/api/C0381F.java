package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.F */
public final class C0381F implements Library {
    private static Library f3054a;
    private static HashMap f3055b;
    private static String[] f3056c;

    static {
        f3056c = new String[]{"add", "addAt", "show", "dismiss", "setContext", "destroy", "remove", "removeAt", "widgets", "scrollToWidget", "scrollToBeginning", "scrollToEnd", "navigateTo"};
    }

    public C0381F() {
        if (f3054a == null) {
            Library j = C0349R.m2291j();
            f3054a = j;
            f3055b = cr.m2202a(j);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3054a.execute(((Integer) f3055b.get("add")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3054a.execute(((Integer) f3055b.get("addat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3054a.execute(((Integer) f3055b.get("show")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3054a.execute(((Integer) f3055b.get("dismiss")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3054a.execute(((Integer) f3055b.get("setcontext")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3054a.execute(((Integer) f3055b.get("destroy")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3054a.execute(((Integer) f3055b.get("remove")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3054a.execute(((Integer) f3055b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3054a.execute(((Integer) f3055b.get("widgets")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return f3054a.execute(((Integer) f3055b.get("scrolltowidget")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                return f3054a.execute(((Integer) f3055b.get("scrolltobeginning")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                return f3054a.execute(((Integer) f3055b.get("scrolltoend")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                return f3054a.execute(((Integer) f3055b.get("navigateto")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3056c;
    }

    public final String getNameSpace() {
        return "kony.ui.Popup";
    }
}
