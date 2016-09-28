package com.konylabs.js.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.JSLibrary;
import java.io.File;
import ny0k.C0442U;

/* renamed from: com.konylabs.js.api.j */
public final class C0437j extends JSLibrary {
    private static final String[] f3579a;

    static {
        f3579a = new String[]{"copyTo", "moveTo", "remove", "rename", "createFile", "createDirectory", "exists", "getFilesList", "isFile", "isDirectory", "read", "write"};
    }

    public final Object createInstance(Object[] objArr, long j) {
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                return new C0442U((String) obj, j);
            }
            if (obj instanceof File) {
                return new C0442U((File) obj, j);
            }
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        int length = objArr.length;
        C0442U c0442u = (C0442U) (length > 0 ? objArr[0] : null);
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                c0442u = c0442u.m3996a((String) (length >= 2 ? objArr[1] : null), (String) (length >= 3 ? objArr[2] : null));
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                c0442u = c0442u.m4001b((String) (length >= 2 ? objArr[1] : null), (String) (length >= 3 ? objArr[2] : null));
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                c0442u.m3997a((length >= 2 ? objArr[1] : Boolean.valueOf(false)).booleanValue());
                c0442u = null;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                c0442u = Boolean.valueOf(c0442u.m4000a((String) (length >= 2 ? objArr[1] : null)));
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                c0442u = Boolean.valueOf(c0442u.m3998a());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                c0442u = Boolean.valueOf(c0442u.m4002b());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                c0442u = Boolean.valueOf(c0442u.m4003c());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                c0442u = c0442u.m4004d();
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                c0442u = Boolean.valueOf(c0442u.m4005e());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                c0442u = Boolean.valueOf(c0442u.m4006f());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                c0442u = c0442u.m4007g();
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                c0442u = Boolean.valueOf(c0442u.m3999a(length >= 2 ? objArr[1] : null, (length >= 3 ? objArr[2] : Boolean.valueOf(false)).booleanValue()));
                break;
            default:
                c0442u = null;
                break;
        }
        if (c0442u == null) {
            return null;
        }
        return new Object[]{c0442u};
    }

    public final String[] getMethods() {
        return f3579a;
    }

    public final String getNameSpace() {
        return "kony.io";
    }
}
