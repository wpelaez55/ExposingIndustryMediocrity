package com.konylabs.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.gb;
import com.konylabs.hybrid.C0227b;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

/* renamed from: com.konylabs.api.n */
public final class C0365n implements Library {
    private static String[] f2430a;

    static {
        f2430a = new String[]{"executefunctioninspacontext", "executefunctionintccontext", "executefunctioninnativecontext"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                Object[] a = (objArr == null || objArr.length == 0) ? null : (objArr[0] == null || objArr[0] == LuaNil.nil) ? null : (objArr.length <= 1 || objArr[1] == null || objArr[1] == LuaNil.nil) ? gb.m4869a((String) objArr[0], null) : gb.m4869a((String) objArr[0], (LuaTable) objArr[1]);
                return a;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return (objArr == null || objArr.length == 0 || objArr[0] == null || objArr[0] == LuaNil.nil) ? null : (objArr.length <= 1 || objArr[1] == null || objArr[1] == LuaNil.nil) ? gb.m4871b((String) objArr[0], null) : gb.m4871b((String) objArr[0], (LuaTable) objArr[1]);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return (objArr == null || objArr.length == 0 || objArr[0] == null || objArr[0] == LuaNil.nil) ? null : (objArr.length <= 1 || objArr[1] == null || objArr[1] == LuaNil.nil) ? C0227b.m1611a((String) objArr[0], null) : C0227b.m1611a((String) objArr[0], (LuaTable) objArr[1]);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f2430a;
    }

    public final String getNameSpace() {
        return "hybrid";
    }
}
