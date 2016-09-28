package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.LibraryWithConstants;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Hashtable;
import java.util.Random;

/* renamed from: com.konylabs.api.t */
public final class C0435t implements LibraryWithConstants {
    private static Random f3526a;
    private static String[] f3527b;

    static {
        f3526a = new Random();
        f3527b = new String[]{"random", "tointeger", "pow", "min", "max", "sqrt", "randomseed"};
        LuaTable luaTable = new LuaTable(0, 10);
    }

    private static Object[] m3923a(Object[] objArr) {
        Object[] objArr2 = new Object[1];
        try {
            if (objArr.length == 1) {
                objArr2[0] = new Double((double) f3526a.nextLong());
            } else if (objArr.length == 2) {
                objArr2[0] = new Double((double) f3526a.nextLong());
                objArr2[0] = new Double(f3526a.nextDouble());
            } else if (objArr.length == 0) {
                objArr2[0] = new Double((double) f3526a.nextLong());
                objArr2[0] = new Double(f3526a.nextDouble());
            } else {
                throw new LuaError("math.random", 401);
            }
        } catch (ClassCastException e) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib random : " + e.getMessage());
            }
            objArr2[0] = LuaNil.nil;
        } catch (NumberFormatException e2) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib random : " + e2.getMessage());
            }
            objArr2[0] = LuaNil.nil;
        } catch (Exception e3) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib random : " + e3.getMessage());
            }
            if (KonyMain.f3657e) {
                Log.d("MathLib", BuildConfig.FLAVOR + e3.getMessage());
            }
            throw new LuaError("math.random", 403);
        }
        return objArr2;
    }

    private static Object[] m3924b(Object[] objArr) {
        if (objArr.length <= 0) {
            throw new LuaError("math.randowseed", 301);
        }
        try {
            Double d = new Double(new Random((long) ((Double) objArr[0]).doubleValue()).nextDouble());
            return new Object[]{d};
        } catch (ClassCastException e) {
            throw new LuaError("math.randomseed", 302);
        }
    }

    private static Object[] m3925c(Object[] objArr) {
        if (objArr.length <= 0) {
            throw new LuaError("math.tointeger", 301);
        }
        try {
            return new Object[]{new Double((double) ((Double) objArr[0]).intValue())};
        } catch (ClassCastException e) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib tointeger : " + e.getMessage());
            }
            throw new LuaError("math.tointeger", 302);
        }
    }

    private static Object[] m3926d(Object[] objArr) {
        if (objArr.length < 2) {
            throw new LuaError("math.pow", 301);
        }
        try {
            Double d = (Double) objArr[1];
            Double d2 = ((int) d.doubleValue()) == 0 ? new Double(1.0d) : new Double(Math.pow(((Double) objArr[0]).doubleValue(), d.doubleValue()));
            return new Object[]{d2};
        } catch (ClassCastException e) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib pow : " + e.getMessage());
            }
            throw new LuaError("math.pow", 302);
        }
    }

    private static Object[] m3927e(Object[] objArr) {
        if (objArr.length < 2) {
            throw new LuaError("math.min", 301);
        }
        try {
            double doubleValue = ((Double) objArr[0]).doubleValue();
            int i = 1;
            while (i < objArr.length) {
                double doubleValue2 = ((Double) objArr[i]).doubleValue();
                if (doubleValue < doubleValue2) {
                    doubleValue2 = doubleValue;
                }
                i++;
                doubleValue = doubleValue2;
            }
            return new Object[]{new Double(doubleValue)};
        } catch (ClassCastException e) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib min : " + e.getMessage());
            }
            throw new LuaError("math.min", 302);
        }
    }

    private static Object[] m3928f(Object[] objArr) {
        if (objArr.length < 2) {
            throw new LuaError("math.max", 301);
        }
        try {
            double doubleValue = ((Double) objArr[0]).doubleValue();
            int i = 1;
            while (i < objArr.length) {
                double doubleValue2 = ((Double) objArr[i]).doubleValue();
                if (doubleValue > doubleValue2) {
                    doubleValue2 = doubleValue;
                }
                i++;
                doubleValue = doubleValue2;
            }
            return new Object[]{new Double(doubleValue)};
        } catch (ClassCastException e) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib max : " + e.getMessage());
            }
            throw new LuaError("math.max", 302);
        }
    }

    private static Object[] m3929g(Object[] objArr) {
        if (objArr.length <= 0) {
            throw new LuaError("math.sqrt", 301);
        }
        try {
            if (new Double(Math.sqrt(((Double) objArr[0]).doubleValue())).equals(Double.valueOf(Double.NaN))) {
                return new Object[]{"nan"};
            }
            return new Object[]{new Double(Math.sqrt(((Double) objArr[0]).doubleValue()))};
        } catch (ClassCastException e) {
            if (KonyMain.f3658f) {
                Log.w("MathLib", "MathLib sqrt : " + e.getMessage());
            }
            throw new LuaError("math.sqrt", 302);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return C0435t.m3923a(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return C0435t.m3925c(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return C0435t.m3926d(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return C0435t.m3927e(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return C0435t.m3928f(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return C0435t.m3929g(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return C0435t.m3924b(objArr);
            default:
                throw new LuaError("No such smethod error", 108);
        }
    }

    public final Hashtable getConstants() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("pi", new Double(3.141592653589793d));
        return hashtable;
    }

    public final String[] getMethods() {
        return f3527b;
    }

    public final String getNameSpace() {
        return "math";
    }
}
