package com.konylabs.js.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import ny0k.C0281O;

/* renamed from: com.konylabs.js.api.p */
public final class C0403p implements Library {
    private static String[] f3133a;

    static {
        f3133a = new String[]{"loadFunctionalModule", "loadFunctionalModuleAsync"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr.length == 0) {
                    throw new LuaError("Invalid number of arguments of arguments for kony.modules.loadFunctionalModule()", 11001);
                } else if (objArr[0] instanceof String) {
                    return new Object[]{Boolean.valueOf(C0281O.m1816b((String) objArr[0]))};
                } else {
                    throw new LuaError("Invalid invalid type of arguments for kony.modules.loadFunctionalModule()", 11001);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr.length == 0) {
                    throw new LuaError("Invalid number of arguments of arguments for kony.modules.loadFunctionalModuleAsync()", 11001);
                } else if (objArr[0] instanceof String) {
                    String str = (String) objArr[0];
                    Function function = (objArr.length <= 1 || objArr[1] == LuaNil.nil) ? null : (Function) objArr[1];
                    Function function2 = (objArr.length <= 2 || objArr[2] == LuaNil.nil) ? null : (Function) objArr[2];
                    C0281O.m1811a(str, function, function2);
                    return null;
                } else {
                    throw new LuaError("Invalid invalid type of arguments for kony.modules.loadFunctionalModuleAsync()", 11001);
                }
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3133a;
    }

    public final String getNameSpace() {
        return "kony.modules";
    }
}
