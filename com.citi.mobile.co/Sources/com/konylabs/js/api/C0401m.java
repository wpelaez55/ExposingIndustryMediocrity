package com.konylabs.js.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.rsa.mobilesdk.sdk.BuildConfig;
import ny0k.C0286W;
import ny0k.C0442U;

/* renamed from: com.konylabs.js.api.m */
public final class C0401m implements Library {
    private static final String[] f3129a;

    static {
        f3129a = new String[]{"getFile", "getCacheDirectoryPath", "getDataDirectoryPath", BuildConfig.FLAVOR, "getExternalStorageDirectoryPath", "getRawDirectoryPath", BuildConfig.FLAVOR, "isExternalStorageAvailable"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        C0442U a;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                Object obj = (objArr == null || objArr.length <= 0) ? null : objArr[0];
                a = C0286W.m1852a((String) obj);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                a = C0286W.f1922a;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                a = C0286W.f1923b;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                a = BuildConfig.FLAVOR;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                a = C0286W.m1854b();
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                a = "app.raw";
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                a = BuildConfig.FLAVOR;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                a = Boolean.valueOf(C0286W.m1853a());
                break;
            default:
                a = null;
                break;
        }
        if (a == null) {
            return null;
        }
        return new Object[]{a};
    }

    public final String[] getMethods() {
        return f3129a;
    }

    public final String getNameSpace() {
        return "kony.io";
    }
}
