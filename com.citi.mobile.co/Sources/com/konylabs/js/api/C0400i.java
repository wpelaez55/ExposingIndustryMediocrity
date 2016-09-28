package com.konylabs.js.api;

import com.konylabs.api.C0348Q;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.i */
public final class C0400i implements Library {
    private static String[] f3126a;
    private static Library f3127b;
    private static HashMap f3128c;

    static {
        f3126a = new String[]{"openDatabase", "transaction", "readTransaction", "executeSql", "sqlResultsetRowItem", "changeVersion", "openDatabaseSync"};
    }

    public C0400i() {
        if (f3127b == null) {
            Library c0348q = new C0348Q();
            f3127b = c0348q;
            f3128c = cr.m2202a(c0348q);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3127b.execute(((Integer) f3128c.get("opendatabase")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3127b.execute(((Integer) f3128c.get("transaction")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3127b.execute(((Integer) f3128c.get("readtransaction")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3127b.execute(((Integer) f3128c.get("executesql")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3127b.execute(((Integer) f3128c.get("sqlresultsetrowitem")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3127b.execute(((Integer) f3128c.get("changeversion")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3127b.execute(((Integer) f3128c.get("opendatabasesync")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3126a;
    }

    public final String getNameSpace() {
        return "kony.db";
    }
}
