package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.h */
public final class C0399h implements Library {
    private static Library f3123a;
    private static HashMap f3124b;
    private static String[] f3125c;

    static {
        f3125c = new String[]{"addAll", "addDataAt", "removeAt", "removeAll", "setData", "setDataAt", "applyCellSkin", "selectAllRows", "setCellDataAt"};
    }

    public C0399h() {
        if (f3123a == null) {
            Library e = C0349R.m2286e();
            f3123a = e;
            f3124b = cr.m2202a(e);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3123a.execute(((Integer) f3124b.get("addall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3123a.execute(((Integer) f3124b.get("adddataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3123a.execute(((Integer) f3124b.get("removeat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3123a.execute(((Integer) f3124b.get("removeall")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3123a.execute(((Integer) f3124b.get("setdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3123a.execute(((Integer) f3124b.get("setdataat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3123a.execute(((Integer) f3124b.get("applycellskin")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3123a.execute(((Integer) f3124b.get("selectallrows")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3123a.execute(((Integer) f3124b.get("setcelldataat")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3125c;
    }

    public final String getNameSpace() {
        return "kony.ui.DataGrid";
    }
}
