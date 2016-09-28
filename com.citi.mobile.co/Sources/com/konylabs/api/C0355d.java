package com.konylabs.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.fi;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.api.d */
public final class C0355d implements Library {
    private static String[] f2412a;
    private static Library f2413b;
    private static HashMap f2414c;

    static {
        f2412a = new String[]{"takePicture", "closeCamera", "releaseRawBytes", "openCamera"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && (objArr[0] instanceof fi)) {
                    KonyMain.m4094a(new C0168e(this, objArr));
                    break;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && (objArr[0] instanceof fi)) {
                    KonyMain.m4094a(new C0169f(this, objArr));
                    break;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                Object[] objArr2;
                if (objArr == null || objArr.length <= 1 || !(objArr[0] instanceof fi) || objArr[1] == null) {
                    objArr2 = null;
                } else {
                    objArr2 = new Object[]{objArr[1]};
                }
                if (f2413b == null) {
                    KonyMain.getAppContext();
                    Library c0354c = new C0354c();
                    f2413b = c0354c;
                    f2414c = cr.m2202a(c0354c);
                }
                f2413b.execute(((Integer) f2414c.get("releaserawbytes")).intValue(), objArr2);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && (objArr[0] instanceof fi)) {
                    KonyMain.m4094a(new C0170g(this, objArr));
                    break;
                }
            default:
                throw new LuaError("Camera widget has no such smethod", 108);
        }
        return null;
    }

    public final String[] getMethods() {
        return f2412a;
    }

    public final String getNameSpace() {
        return "kony.ui.Camera";
    }
}
