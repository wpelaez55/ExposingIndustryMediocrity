package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.eA;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;

/* renamed from: com.konylabs.js.api.r */
public final class C0405r implements Library {
    private static Library f3137a;
    private static String[] f3138b;

    static {
        f3137a = null;
        f3138b = new String[]{"alert"};
    }

    public C0405r() {
        if (f3137a == null) {
            f3137a = new C0349R();
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                Object propertiesInfo = (objArr.length <= 0 || objArr[0] == null) ? BuildConfig.FLAVOR : objArr[0] instanceof LuaWidget ? ((LuaWidget) objArr[0]).getPropertiesInfo() : objArr[0].toString();
                LuaTable luaTable = new LuaTable();
                luaTable.setTable("message", propertiesInfo);
                luaTable.setTable(eA.f3698b, new Double(0.0d));
                return f3137a.execute(8, new Object[]{luaTable, LuaNil.nil});
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3138b;
    }

    public final String getNameSpace() {
        return BuildConfig.FLAVOR;
    }
}
