package com.konylabs.vmintf;

/* renamed from: com.konylabs.vmintf.k */
public final class C0262k {
    public static int f1888a;
    public static int f1889b;
    public static int f1890c;

    static {
        f1888a = 0;
        f1889b = 1;
        f1890c = 2;
    }

    public static C0254b m1785a(int i) {
        return i == f1889b ? new C0415j() : i == f1890c ? new KonyJavaScriptVM() : null;
    }
}
