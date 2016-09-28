package com.konylabs.js.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.C0354c;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.fi;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.e */
public final class C0396e implements Library {
    private static Library f3114a;
    private static HashMap f3115b;
    private static String[] f3116c;

    static {
        f3116c = new String[]{"releaseRawBytes"};
    }

    public C0396e() {
        if (f3114a == null) {
            KonyMain.getAppContext();
            Library c0354c = new C0354c();
            f3114a = c0354c;
            f3115b = cr.m2202a(c0354c);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr.length > 1 && (objArr[0] instanceof fi)) {
                    objArr = new Object[]{objArr[1]};
                }
                return f3114a.execute(((Integer) f3115b.get("releaserawbytes")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3116c;
    }

    public final String getNameSpace() {
        return "kony.camera";
    }
}
