package com.konylabs.api;

import com.konylabs.api.ui.eG;
import com.konylabs.api.ui.eH;
import com.konylabs.libintf.LibraryWithConstants;
import java.util.Hashtable;

/* renamed from: com.konylabs.api.b */
public final class C0432b implements LibraryWithConstants {
    private static String[] f3523a;

    static {
        f3523a = new String[0];
    }

    public final Object[] execute(int i, Object[] objArr) {
        return null;
    }

    public final Hashtable getConstants() {
        Hashtable hashtable = new Hashtable(2, 1.0f);
        hashtable.put("headers", eH.m3988a());
        hashtable.put("footers", eG.m3985a());
        return hashtable;
    }

    public final String[] getMethods() {
        return f3523a;
    }

    public final String getNameSpace() {
        return "app";
    }
}
