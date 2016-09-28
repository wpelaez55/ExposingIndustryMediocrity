package com.konylabs.api.ui;

import android.content.Context;
import com.konylabs.android.KonyMain;

public final class bL {
    public static int f703a;
    public static int f704b;
    public static int f705c;
    public static int f706d;

    static {
        f703a = 1;
        f704b = 2;
        f705c = 3;
        f706d = 4;
    }

    public static C0213o m725a(Context context, int i) {
        if (i == f704b) {
            return new dE(context);
        }
        if (i == f703a) {
            return new aV(context);
        }
        if (i != f706d) {
            return new bl(context);
        }
        if (KonyMain.f3656d >= 7) {
            return new ao(context);
        }
        C0213o aVVar = new aV(context);
        ((aV) aVVar).m2563l(f706d);
        return aVVar;
    }
}
