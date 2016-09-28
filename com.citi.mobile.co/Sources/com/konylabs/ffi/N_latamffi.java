package com.konylabs.ffi;

import com.citi.latam.ffimodules.FFIFunctions;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;

public class N_latamffi extends JSLibrary {
    public static final String findAndLaunchApp = "findAndLaunchApp";
    public static final String isAppIDExists = "isAppIDExists";
    public static final String launchStore = "launchStore";
    Library[] libs;
    String[] methods;

    public Library[] getClasses() {
        this.libs = new Library[0];
        return this.libs;
    }

    public N_latamffi() {
        this.methods = new String[]{isAppIDExists, launchStore, findAndLaunchApp};
        this.libs = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] execute(int r17, java.lang.Object[] r18) {
        /*
        r16 = this;
        r8 = 0;
        r0 = r18;
        r7 = r0.length;	 Catch:{ Exception -> 0x0020 }
        r6 = 1;
        switch(r17) {
            case 0: goto L_0x000a;
            case 1: goto L_0x0059;
            case 2: goto L_0x009b;
            default: goto L_0x0008;
        };	 Catch:{ Exception -> 0x0020 }
    L_0x0008:
        r11 = r8;
    L_0x0009:
        return r11;
    L_0x000a:
        r11 = 1;
        if (r7 == r11) goto L_0x0040;
    L_0x000d:
        r11 = 2;
        r11 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = 0;
        r13 = new java.lang.Double;	 Catch:{ Exception -> 0x0020 }
        r14 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r13.<init>(r14);	 Catch:{ Exception -> 0x0020 }
        r11[r12] = r13;	 Catch:{ Exception -> 0x0020 }
        r12 = 1;
        r13 = "Invalid Params";
        r11[r12] = r13;	 Catch:{ Exception -> 0x0020 }
        goto L_0x0009;
    L_0x0020:
        r5 = move-exception;
        r11 = 3;
        r8 = new java.lang.Object[r11];
        r11 = 0;
        r12 = r5.getMessage();
        r8[r11] = r12;
        r11 = 1;
        r12 = new java.lang.Double;
        r14 = 4636807660098813952; // 0x4059400000000000 float:0.0 double:101.0;
        r12.<init>(r14);
        r8[r11] = r12;
        r11 = 2;
        r12 = r5.getMessage();
        r8[r11] = r12;
        goto L_0x0008;
    L_0x0040:
        r2 = 0;
        r11 = 0;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        if (r11 == 0) goto L_0x0052;
    L_0x0046:
        r11 = 0;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = com.konylabs.vm.LuaNil.nil;	 Catch:{ Exception -> 0x0020 }
        if (r11 == r12) goto L_0x0052;
    L_0x004d:
        r11 = 0;
        r2 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x0020 }
    L_0x0052:
        r0 = r16;
        r8 = r0.isAppIDExists(r2);	 Catch:{ Exception -> 0x0020 }
        goto L_0x0008;
    L_0x0059:
        r11 = 2;
        if (r7 == r11) goto L_0x006f;
    L_0x005c:
        r11 = 2;
        r11 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = 0;
        r13 = new java.lang.Double;	 Catch:{ Exception -> 0x0020 }
        r14 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r13.<init>(r14);	 Catch:{ Exception -> 0x0020 }
        r11[r12] = r13;	 Catch:{ Exception -> 0x0020 }
        r12 = 1;
        r13 = "Invalid Params";
        r11[r12] = r13;	 Catch:{ Exception -> 0x0020 }
        goto L_0x0009;
    L_0x006f:
        r3 = 0;
        r11 = 0;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        if (r11 == 0) goto L_0x0081;
    L_0x0075:
        r11 = 0;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = com.konylabs.vm.LuaNil.nil;	 Catch:{ Exception -> 0x0020 }
        if (r11 == r12) goto L_0x0081;
    L_0x007c:
        r11 = 0;
        r3 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r3 = (java.lang.String) r3;	 Catch:{ Exception -> 0x0020 }
    L_0x0081:
        r9 = 0;
        r11 = 1;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        if (r11 == 0) goto L_0x0093;
    L_0x0087:
        r11 = 1;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = com.konylabs.vm.LuaNil.nil;	 Catch:{ Exception -> 0x0020 }
        if (r11 == r12) goto L_0x0093;
    L_0x008e:
        r11 = 1;
        r9 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r9 = (java.lang.String) r9;	 Catch:{ Exception -> 0x0020 }
    L_0x0093:
        r0 = r16;
        r8 = r0.launchStore(r3, r9);	 Catch:{ Exception -> 0x0020 }
        goto L_0x0008;
    L_0x009b:
        r11 = 2;
        if (r7 == r11) goto L_0x00b2;
    L_0x009e:
        r11 = 2;
        r11 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = 0;
        r13 = new java.lang.Double;	 Catch:{ Exception -> 0x0020 }
        r14 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r13.<init>(r14);	 Catch:{ Exception -> 0x0020 }
        r11[r12] = r13;	 Catch:{ Exception -> 0x0020 }
        r12 = 1;
        r13 = "Invalid Params";
        r11[r12] = r13;	 Catch:{ Exception -> 0x0020 }
        goto L_0x0009;
    L_0x00b2:
        r4 = 0;
        r11 = 0;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        if (r11 == 0) goto L_0x00c4;
    L_0x00b8:
        r11 = 0;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = com.konylabs.vm.LuaNil.nil;	 Catch:{ Exception -> 0x0020 }
        if (r11 == r12) goto L_0x00c4;
    L_0x00bf:
        r11 = 0;
        r4 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0020 }
    L_0x00c4:
        r10 = 0;
        r11 = 1;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        if (r11 == 0) goto L_0x00d6;
    L_0x00ca:
        r11 = 1;
        r11 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r12 = com.konylabs.vm.LuaNil.nil;	 Catch:{ Exception -> 0x0020 }
        if (r11 == r12) goto L_0x00d6;
    L_0x00d1:
        r11 = 1;
        r10 = r18[r11];	 Catch:{ Exception -> 0x0020 }
        r10 = (java.lang.String) r10;	 Catch:{ Exception -> 0x0020 }
    L_0x00d6:
        r0 = r16;
        r8 = r0.findAndLaunchApp(r4, r10);	 Catch:{ Exception -> 0x0020 }
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.ffi.N_latamffi.execute(int, java.lang.Object[]):java.lang.Object[]");
    }

    public String[] getMethods() {
        return this.methods;
    }

    public String getNameSpace() {
        return "latamffi";
    }

    public final Object[] isAppIDExists(String inputKey0) {
        return new Object[]{new Boolean(FFIFunctions.callIsAppIDExists(inputKey0)), new Double(0.0d)};
    }

    public final Object[] launchStore(String inputKey0, String inputKey1) {
        FFIFunctions.callLaunchStore(inputKey0, inputKey1);
        return new Object[]{LuaNil.nil, new Double(0.0d)};
    }

    public final Object[] findAndLaunchApp(String inputKey0, String inputKey1) {
        FFIFunctions.findAndLaunchApp(inputKey0, inputKey1);
        return new Object[]{LuaNil.nil, new Double(0.0d)};
    }
}
