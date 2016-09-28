package com.konylabs.js.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import ny0k.ak;

/* renamed from: com.konylabs.js.api.n */
public final class C0440n extends JSLibrary {
    public final Object createInstance(Object[] objArr, long j) {
        return new ak();
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (!(objArr[0] == null && objArr[0] == LuaNil.nil)) {
                    String str = (objArr[1] == null || objArr[1] == LuaNil.nil) ? null : (String) objArr[1];
                    String str2 = (objArr[2] == null || objArr[2] == LuaNil.nil) ? null : (String) objArr[2];
                    String str3 = (objArr.length <= 3 || objArr[3] == null || objArr[3] == LuaNil.nil) ? null : (String) objArr[3];
                    ((ak) objArr[0]).m1995a(str, str2, str3);
                }
                return null;
            default:
                throw new LuaError("No such smethod error", 108);
        }
    }

    public final String[] getMethods() {
        return null;
    }

    public final String getNameSpace() {
        return null;
    }
}
