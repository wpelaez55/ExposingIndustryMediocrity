package com.konylabs.js.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.JSLibrary;
import java.io.File;
import ny0k.C0442U;
import ny0k.C0443V;

/* renamed from: com.konylabs.js.api.k */
public final class C0438k extends JSLibrary {
    private static final String[] f3580a;

    static {
        f3580a = new String[]{"item"};
    }

    public final Object createInstance(Object[] objArr, long j) {
        return new C0443V((File[]) objArr[0], j);
    }

    public final Object[] execute(int i, Object[] objArr) {
        C0442U a;
        int length = objArr.length;
        C0443V c0443v = (C0443V) (length > 0 ? objArr[0] : null);
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                a = c0443v.m4008a(length >= 2 ? ((Double) objArr[1]).intValue() : -1);
                break;
            default:
                a = null;
                break;
        }
        if (a == null) {
            return null;
        }
        return new Object[]{a};
    }

    public final String[] getMethods() {
        return f3580a;
    }

    public final String getNameSpace() {
        return "kony.io";
    }
}
