package com.konylabs.js.api;

import com.konylabs.api.C0373w;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.C */
public final class C0378C implements Library {
    private static String[] f3045a;
    private static Library f3046b;
    private static HashMap f3047c;

    static {
        f3045a = new String[]{"toNumber", "toCurrency", "freeMemory", "userAgent", "deviceInfo", "hasGPSSupport", "hasCameraSupport", "hasTouchSupport", "hasOrientationSupport", "getDeviceCurrentOrientation", "hasAccelerometerSupport", "loadLibrary", "gc"};
    }

    public C0378C() {
        if (f3046b == null) {
            Library c0373w = new C0373w();
            f3046b = c0373w;
            f3047c = cr.m2202a(c0373w);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3046b.execute(((Integer) f3047c.get("tonumber")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3046b.execute(((Integer) f3047c.get("tocurrency")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3046b.execute(((Integer) f3047c.get("freememory")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3046b.execute(((Integer) f3047c.get("useragent")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3046b.execute(((Integer) f3047c.get("deviceinfo")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return new Object[]{((LuaTable) f3046b.execute(((Integer) f3047c.get("platform")).intValue(), objArr)[0]).getTable("hasgps")};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return new Object[]{((LuaTable) f3046b.execute(((Integer) f3047c.get("platform")).intValue(), objArr)[0]).getTable("hascamera")};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return new Object[]{((LuaTable) f3046b.execute(((Integer) f3047c.get("platform")).intValue(), objArr)[0]).getTable("hastouchsupport")};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return new Object[]{((LuaTable) f3046b.execute(((Integer) f3047c.get("platform")).intValue(), objArr)[0]).getTable("hasorientationsupport")};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return f3046b.execute(((Integer) f3047c.get("getdevicecurrentorientation")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                return new Object[]{((LuaTable) f3046b.execute(((Integer) f3047c.get("platform")).intValue(), objArr)[0]).getTable("hasaccelerometer")};
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                f3046b.execute(((Integer) f3047c.get("loadlibrary")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                f3046b.execute(((Integer) f3047c.get("gc")).intValue(), objArr);
                break;
        }
        return null;
    }

    public final String[] getMethods() {
        return f3045a;
    }

    public final String getNameSpace() {
        return "kony.os";
    }
}
