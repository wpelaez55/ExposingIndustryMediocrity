package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0435t;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import java.util.Random;
import ny0k.cr;

public class MathLib {
    public static final Double PI;
    private static Library f1727a;
    private static HashMap f1728b;
    public static Random ran;

    static {
        ran = new Random();
        PI = Double.valueOf(3.141592653589793d);
    }

    private MathLib() {
    }

    public static void initialize() {
        if (f1727a == null) {
            Library c0435t = new C0435t();
            f1727a = c0435t;
            f1728b = cr.m2202a(c0435t);
        }
    }

    public static Double max(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("MathLibNative", "Executing Math.max()");
        }
        return (Double) f1727a.execute(((Integer) f1728b.get("max")).intValue(), objArr)[0];
    }

    public static Double min(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("MathLibNative", "Executing Math.min()");
        }
        return (Double) f1727a.execute(((Integer) f1728b.get("min")).intValue(), objArr)[0];
    }

    public static Double pow(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("MathLibNative", "Executing Math.pow()");
        }
        return (Double) f1727a.execute(((Integer) f1728b.get("pow")).intValue(), objArr)[0];
    }

    public static final Object random(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("MathLibNative", "Executing Math.random()");
        }
        return f1727a.execute(((Integer) f1728b.get("random")).intValue(), objArr)[0];
    }

    public static Double randomSeed(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("MathLibNative", "Executing Math.randomSeed()");
        }
        return (Double) f1727a.execute(((Integer) f1728b.get("randomseed")).intValue(), objArr)[0];
    }

    public static Double sqrt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("MathLibNative", "Executing Math.sqrt()");
        }
        return (Double) f1727a.execute(((Integer) f1728b.get("sqrt")).intValue(), objArr)[0];
    }

    public static Double toInteger(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("MathLibNative", "Executing Math.toInteger()");
        }
        return (Double) f1727a.execute(((Integer) f1728b.get("tointeger")).intValue(), objArr)[0];
    }
}
