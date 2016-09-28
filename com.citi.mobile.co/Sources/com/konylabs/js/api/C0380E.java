package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.E */
public final class C0380E implements Library {
    private static Library f3051a;
    private static HashMap f3052b;
    private static String[] f3053c;

    static {
        f3053c = new String[]{"setcomponentdata", "setselectedkeyincomponent"};
    }

    public C0380E() {
        if (f3051a == null) {
            Library n = C0349R.m2295n();
            f3051a = n;
            f3052b = cr.m2202a(n);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3051a.execute(((Integer) f3052b.get("setcomponentdata")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3051a.execute(((Integer) f3052b.get("setselectedkeyincomponent")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3053c;
    }

    public final String getNameSpace() {
        return "kony.ui.PickerView";
    }
}
