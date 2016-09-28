package com.konylabs.js.api;

import com.konylabs.libintf.JSLibrary;
import java.io.File;
import java.io.InputStream;
import ny0k.C0444X;

/* renamed from: com.konylabs.js.api.l */
public final class C0439l extends JSLibrary {
    private static final String[] f3581a;

    static {
        f3581a = new String[]{"readAsText"};
    }

    public final Object createInstance(Object[] objArr, long j) {
        Object obj = objArr[0];
        return obj instanceof File ? new C0444X((File) obj, j) : obj instanceof InputStream ? new C0444X((InputStream) obj, j) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] execute(int r4, java.lang.Object[] r5) {
        /*
        r3 = this;
        r2 = 0;
        r1 = 0;
        r0 = r5.length;
        if (r0 <= 0) goto L_0x0015;
    L_0x0005:
        r0 = r5[r2];
    L_0x0007:
        r0 = (ny0k.C0444X) r0;
        switch(r4) {
            case 0: goto L_0x0017;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = r1;
    L_0x000d:
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r1[r2] = r0;
    L_0x0014:
        return r1;
    L_0x0015:
        r0 = r1;
        goto L_0x0007;
    L_0x0017:
        if (r0 == 0) goto L_0x000c;
    L_0x0019:
        r0 = r0.m4010b();
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.js.api.l.execute(int, java.lang.Object[]):java.lang.Object[]");
    }

    public final String[] getMethods() {
        return f3581a;
    }

    public final String getNameSpace() {
        return "kony.type";
    }
}
