package com.konylabs.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.ad;

/* renamed from: com.konylabs.api.m */
public final class C0364m implements Library {
    private static String[] f2429a;

    static {
        f2429a = new String[]{"getcurrentposition", "watchposition", "clearwatch"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        Object obj;
        LuaTable luaTable;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr == null || objArr.length <= 0 || objArr[0] == null || objArr[0] == LuaNil.nil) {
                    return null;
                }
                obj = (objArr.length <= 1 || objArr[1] == null || objArr[1] == LuaNil.nil) ? null : objArr[1];
                luaTable = (objArr.length <= 2 || objArr[2] == null || objArr[2] == LuaNil.nil) ? null : (LuaTable) objArr[2];
                ad.m1961f().m1967a(objArr[0], obj, luaTable);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr == null || objArr.length <= 0 || objArr[0] == null || objArr[0] == LuaNil.nil) {
                    return null;
                }
                obj = (objArr.length <= 1 || objArr[1] == null || objArr[1] == LuaNil.nil) ? null : objArr[1];
                luaTable = (objArr.length <= 2 || objArr[2] == null || objArr[2] == LuaNil.nil) ? null : (LuaTable) objArr[2];
                if (ad.m1961f().m1968b(objArr[0], obj, luaTable) <= 0) {
                    return null;
                }
                return new Object[]{new Double((double) ad.m1961f().m1968b(objArr[0], obj, luaTable))};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr == null || objArr.length <= 0 || objArr[0] == null || objArr[0] == LuaNil.nil) {
                    return null;
                }
                ad.m1961f().m1966a(((Double) objArr[0]).longValue());
                return null;
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f2429a;
    }

    public final String getNameSpace() {
        return "geolocation";
    }
}
