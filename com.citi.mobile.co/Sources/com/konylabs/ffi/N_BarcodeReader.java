package com.konylabs.ffi;

import com.kony.barcodescaner.ScanBarcode;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

public class N_BarcodeReader extends JSLibrary {
    Library[] libs;
    String[] methods;

    class scanZXingAndroid extends JSLibrary {
        public static final String scanBarcode = "scanBarcode";
        String[] methods;

        scanZXingAndroid() {
            this.methods = new String[]{scanBarcode};
        }

        public Object createInstance(Object[] params) {
            return new ScanBarcode();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object[] execute(int r14, java.lang.Object[] r15) {
            /*
            r13 = this;
            r12 = 2;
            r11 = 0;
            r10 = 1;
            r4 = 0;
            r3 = r15.length;	 Catch:{ Exception -> 0x0022 }
            r2 = 1;
            switch(r14) {
                case 0: goto L_0x000b;
                default: goto L_0x0009;
            };	 Catch:{ Exception -> 0x0022 }
        L_0x0009:
            r5 = r4;
        L_0x000a:
            return r5;
        L_0x000b:
            if (r3 < r10) goto L_0x000f;
        L_0x000d:
            if (r3 <= r12) goto L_0x003f;
        L_0x000f:
            r5 = 2;
            r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0022 }
            r6 = 0;
            r7 = new java.lang.Double;	 Catch:{ Exception -> 0x0022 }
            r8 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
            r7.<init>(r8);	 Catch:{ Exception -> 0x0022 }
            r5[r6] = r7;	 Catch:{ Exception -> 0x0022 }
            r6 = 1;
            r7 = "Invalid Params";
            r5[r6] = r7;	 Catch:{ Exception -> 0x0022 }
            goto L_0x000a;
        L_0x0022:
            r1 = move-exception;
            r5 = 3;
            r4 = new java.lang.Object[r5];
            r5 = r1.getMessage();
            r4[r11] = r5;
            r5 = new java.lang.Double;
            r6 = 4636807660098813952; // 0x4059400000000000 float:0.0 double:101.0;
            r5.<init>(r6);
            r4[r10] = r5;
            r5 = r1.getMessage();
            r4[r12] = r5;
            goto L_0x0009;
        L_0x003f:
            r2 = 1;
            r0 = 0;
            r5 = 1;
            r5 = r15[r5];	 Catch:{ Exception -> 0x0022 }
            if (r5 == 0) goto L_0x0052;
        L_0x0046:
            r5 = 1;
            r5 = r15[r5];	 Catch:{ Exception -> 0x0022 }
            r6 = com.konylabs.vm.LuaNil.nil;	 Catch:{ Exception -> 0x0022 }
            if (r5 == r6) goto L_0x0052;
        L_0x004d:
            r5 = 1;
            r0 = r15[r5];	 Catch:{ Exception -> 0x0022 }
            r0 = (com.konylabs.vm.Function) r0;	 Catch:{ Exception -> 0x0022 }
        L_0x0052:
            r5 = 0;
            r5 = r15[r5];	 Catch:{ Exception -> 0x0022 }
            r4 = r13.scanBarcode(r5, r0);	 Catch:{ Exception -> 0x0022 }
            goto L_0x0009;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.konylabs.ffi.N_BarcodeReader.scanZXingAndroid.execute(int, java.lang.Object[]):java.lang.Object[]");
        }

        public String[] getMethods() {
            return this.methods;
        }

        public String getNameSpace() {
            return "scanZXingAndroid";
        }

        public final Object[] scanBarcode(Object self, Function inputKey0) {
            ((ScanBarcode) self).scanBarcode(inputKey0);
            return new Object[]{LuaNil.nil, new Double(0.0d)};
        }
    }

    public Library[] getClasses() {
        this.libs = new Library[1];
        this.libs[0] = new scanZXingAndroid();
        return this.libs;
    }

    public N_BarcodeReader() {
        this.methods = new String[0];
        this.libs = null;
    }

    public Object[] execute(int index, Object[] params) {
        try {
            int paramLen = params.length;
            return null;
        } catch (Exception e) {
            return new Object[]{e.getMessage(), new Double(101.0d), e.getMessage()};
        }
    }

    public String[] getMethods() {
        return this.methods;
    }

    public String getNameSpace() {
        return "BarcodeReader";
    }
}
