package com.konylabs.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.eG;
import com.konylabs.api.ui.eH;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

final class aD implements Library {
    private final String[] f2402a;

    aD() {
        this.f2402a = new String[]{"setappfooters", "setappheaders"};
    }

    static /* synthetic */ Object[] m2318a(aD aDVar, int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length > 0 && objArr[0] != LuaNil.nil) {
                    eG.m3985a().m3986a((LuaTable) objArr[0]);
                    break;
                }
                throw new LuaError("Invalid number of arguments to setappfooters", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && objArr.length > 0 && objArr[0] != LuaNil.nil) {
                    eH.m3988a().m3989a((LuaTable) objArr[0]);
                    break;
                }
                throw new LuaError("Invalid number of arguments to setappheaders", 11001);
                break;
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain.m4094a(new aE(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return this.f2402a;
    }

    public final String getNameSpace() {
        return null;
    }
}
