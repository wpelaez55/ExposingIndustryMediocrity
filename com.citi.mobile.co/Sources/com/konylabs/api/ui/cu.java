package com.konylabs.api.ui;

import android.graphics.drawable.Drawable;
import com.konylabs.android.KonyMain;

public final class cu {
    public static String f1020a;
    public static int f1021b;
    public static int f1022c;
    public static int f1023d;
    public static int f1024e;
    public static int f1025f;
    private static int f1026j;
    private static int f1027k;
    public String f1028g;
    public String f1029h;
    public Object f1030i;
    private String f1031l;
    private boolean f1032m;
    private int f1033n;

    static {
        f1026j = 0;
        f1027k = 2;
        f1020a = "showasflag";
        f1021b = 1;
        f1022c = 2;
        f1023d = 3;
        f1024e = 4;
        f1025f = 5;
        if (KonyMain.m4057C()) {
            f1020a = "showAsFlag";
        }
    }

    public cu(String str, String str2, int i, Object obj) throws Exception {
        this.f1033n = f1021b;
        if (str == null) {
            throw new Exception("Menu ID is null");
        } else if (str2 == null) {
            throw new Exception("Menu title is null");
        } else if (obj == null) {
            throw new Exception("Menu callback is null");
        } else {
            this.f1028g = str;
            this.f1029h = str2;
            this.f1030i = obj;
            this.f1032m = true;
            int i2 = f1027k;
        }
    }

    public final String m1040a() {
        return this.f1028g;
    }

    public final void m1041a(int i) {
        this.f1033n = i;
    }

    public final void m1042a(String str) {
        this.f1031l = str;
    }

    public final void m1043a(boolean z) {
        this.f1032m = z;
    }

    public final String m1044b() {
        return this.f1029h;
    }

    public final boolean m1045c() {
        return this.f1032m;
    }

    public final Drawable m1046d() {
        return dB.m1112c(this.f1031l);
    }

    public final int m1047e() {
        if (KonyMain.f3656d >= 11) {
            if (this.f1033n == f1021b) {
                return 0;
            }
            if (this.f1033n == f1022c) {
                return 2;
            }
            if (this.f1033n == f1023d) {
                return 1;
            }
            if (this.f1033n == f1024e) {
                return 6;
            }
            if (this.f1033n == f1025f) {
                return 5;
            }
        }
        return this.f1033n;
    }
}
