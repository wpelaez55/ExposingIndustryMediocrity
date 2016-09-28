package com.konylabs.ffi;

import com.konylabs.libintf.JSLibrary;
import com.konylabs.libintf.Library;
import com.rsa.mobilesdk.sdk.RSA;

public class N_RSA extends JSLibrary {
    public static final String collectInfo = "collectInfo";
    Library[] libs;
    String[] methods;

    public Library[] getClasses() {
        this.libs = new Library[0];
        return this.libs;
    }

    public N_RSA() {
        this.methods = new String[]{collectInfo};
        this.libs = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] execute(int r13, java.lang.Object[] r14) {
        /*
        r12 = this;
        r11 = 2;
        r10 = 1;
        r7 = 0;
        r3 = 0;
        r2 = r14.length;	 Catch:{ Exception -> 0x0020 }
        r1 = 1;
        switch(r13) {
            case 0: goto L_0x000b;
            default: goto L_0x0009;
        };	 Catch:{ Exception -> 0x0020 }
    L_0x0009:
        r4 = r3;
    L_0x000a:
        return r4;
    L_0x000b:
        if (r2 == 0) goto L_0x003d;
    L_0x000d:
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0020 }
        r5 = 0;
        r6 = new java.lang.Double;	 Catch:{ Exception -> 0x0020 }
        r8 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r6.<init>(r8);	 Catch:{ Exception -> 0x0020 }
        r4[r5] = r6;	 Catch:{ Exception -> 0x0020 }
        r5 = 1;
        r6 = "Invalid Params";
        r4[r5] = r6;	 Catch:{ Exception -> 0x0020 }
        goto L_0x000a;
    L_0x0020:
        r0 = move-exception;
        r4 = 3;
        r3 = new java.lang.Object[r4];
        r4 = r0.getMessage();
        r3[r7] = r4;
        r4 = new java.lang.Double;
        r6 = 4636807660098813952; // 0x4059400000000000 float:0.0 double:101.0;
        r4.<init>(r6);
        r3[r10] = r4;
        r4 = r0.getMessage();
        r3[r11] = r4;
        goto L_0x0009;
    L_0x003d:
        r3 = r12.collectInfo();	 Catch:{ Exception -> 0x0020 }
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.ffi.N_RSA.execute(int, java.lang.Object[]):java.lang.Object[]");
    }

    public String[] getMethods() {
        return this.methods;
    }

    public String getNameSpace() {
        return "RSA";
    }

    public final Object[] collectInfo() {
        return new Object[]{RSA.collectRSAInfo(), new Double(0.0d)};
    }
}
