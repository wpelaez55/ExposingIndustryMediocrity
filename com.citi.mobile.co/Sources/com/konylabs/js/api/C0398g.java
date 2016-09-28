package com.konylabs.js.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.C0361j;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.g */
public final class C0398g implements Library {
    private static String[] f3120a;
    private static Library f3121b;
    private static HashMap f3122c;

    static {
        f3120a = new String[]{"newKey", "saveKey", "createHash", "retrievePublicKey", "deleteKey", "readKey", "encrypt", "performEncryption", "decrypt"};
    }

    public C0398g() {
        if (f3121b == null) {
            Library c0361j = new C0361j(KonyMain.getAppContext());
            f3121b = c0361j;
            f3122c = cr.m2202a(c0361j);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3121b.execute(((Integer) f3122c.get("newkey")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3121b.execute(((Integer) f3122c.get("savekey")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3121b.execute(((Integer) f3122c.get("createhash")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3121b.execute(((Integer) f3122c.get("retrievepublickey")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3121b.execute(((Integer) f3122c.get("deletekey")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3121b.execute(((Integer) f3122c.get("readkey")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3121b.execute(((Integer) f3122c.get("encrypt")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3121b.execute(((Integer) f3122c.get("decrypt")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3120a;
    }

    public final String getNameSpace() {
        return "kony.crypto";
    }
}
