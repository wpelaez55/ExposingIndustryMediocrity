package com.konylabs.js.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.C0339C;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.z */
public final class C0412z implements Library {
    private static String[] f3156a;
    private static Library f3157b;
    private static HashMap f3158c;

    static {
        f3156a = new String[]{"convertToBase64", "convertToRawBytes", "print", "type", "getError", "convertRawBytes"};
    }

    public C0412z() {
        if (f3157b == null) {
            Library c0339c = new C0339C(KonyMain.getAppContext());
            f3157b = c0339c;
            f3158c = cr.m2202a(c0339c);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3157b.execute(((Integer) f3158c.get("converttobase64")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3157b.execute(((Integer) f3158c.get("converttorawbytes")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3157b.execute(((Integer) f3158c.get("print")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3157b.execute(((Integer) f3158c.get("type")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3157b.execute(((Integer) f3158c.get("convertrawbytes")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3156a;
    }

    public final String getNameSpace() {
        return "kony";
    }
}
