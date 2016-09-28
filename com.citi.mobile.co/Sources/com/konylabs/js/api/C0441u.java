package com.konylabs.js.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import ny0k.ak;
import ny0k.al;

/* renamed from: com.konylabs.js.api.u */
public final class C0441u extends JSLibrary {
    private static String[] f3582a;

    static {
        f3582a = new String[]{"open", "setRequestHeader", "send", "abort", "getResponseHeader", "getAllResponseHeaders"};
    }

    public final Object createInstance(Object[] objArr, long j) {
        return new al(j);
    }

    public final Object[] execute(int i, Object[] objArr) {
        Object[] objArr2 = null;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr[0] == null && objArr[0] == LuaNil.nil) {
                    return null;
                }
                String str = "POST";
                if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
                    str = (String) objArr[1];
                }
                String str2 = (objArr[2] == null || objArr[2] == LuaNil.nil) ? null : (String) objArr[2];
                Boolean valueOf = Boolean.valueOf(true);
                if (!(objArr.length <= 3 || objArr[3] == null || objArr[3] == LuaNil.nil)) {
                    valueOf = (Boolean) objArr[3];
                }
                String str3 = (objArr.length <= 4 || objArr[4] == null || objArr[4] == LuaNil.nil) ? null : (String) objArr[4];
                String str4 = (objArr.length <= 5 || objArr[5] == null || objArr[5] == LuaNil.nil) ? null : (String) objArr[5];
                ((al) objArr[0]).m4037a(str, str2, valueOf, str3, str4);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil || objArr[2] == null || objArr[2] == LuaNil.nil) {
                    return null;
                }
                ((al) objArr[0]).m4036a((String) objArr[1], (String) objArr[2]);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr[0] == null || objArr[0] == LuaNil.nil) {
                    return null;
                }
                ak akVar = (objArr.length <= 1 || objArr[1] == LuaNil.nil) ? null : (ak) objArr[1];
                ((al) objArr[0]).m4038a(akVar);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr[0] == null || objArr[0] == LuaNil.nil) {
                    return null;
                }
                ((al) objArr[0]).m4040d();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                Object[] objArr3 = new Object[1];
                if (!(objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil)) {
                    objArr2 = ((al) objArr[0]).m4034a((String) objArr[1]);
                }
                objArr3[0] = objArr2;
                return objArr3;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                Object[] objArr4 = new Object[1];
                if (!(objArr[0] == null || objArr[0] == LuaNil.nil)) {
                    objArr2 = ((al) objArr[0]).m4041e();
                }
                objArr4[0] = objArr2;
                return objArr4;
            default:
                throw new LuaError("No such smethod error", 108);
        }
    }

    public final String[] getMethods() {
        return f3582a;
    }

    public final String getNameSpace() {
        return null;
    }
}
