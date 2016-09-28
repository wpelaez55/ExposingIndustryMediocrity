package com.konylabs.js.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.C0366o;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.w */
public final class C0409w implements Library {
    private static Library f3148a;
    private static HashMap f3149b;

    public C0409w() {
        if (f3148a == null) {
            Library c0366o = new C0366o(KonyMain.getAppContext());
            f3148a = c0366o;
            f3149b = cr.m2202a(c0366o);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3148a.execute(((Integer) f3149b.get("getlocalizedstring")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3148a.execute(((Integer) f3149b.get("getcurrentlocale")).intValue(), null);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3148a.execute(((Integer) f3149b.get("getcurrentdevicelocale")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3148a.execute(((Integer) f3149b.get("getsupportedlocales")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3148a.execute(((Integer) f3149b.get("islocalesupportedbydevice")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3148a.execute(((Integer) f3149b.get("setcurrentlocale")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                f3148a.execute(((Integer) f3149b.get("setcurrentlocaleasync")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                f3148a.execute(((Integer) f3149b.get("setdefaultlocale")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                f3148a.execute(((Integer) f3149b.get("setdefaultlocaleasync")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                f3148a.execute(((Integer) f3149b.get("setresourcebundle")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                f3148a.execute(((Integer) f3149b.get("updateresourcebundle")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                f3148a.execute(((Integer) f3149b.get("deleteresourcebundle")).intValue(), objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                return f3148a.execute(((Integer) f3149b.get("isresourcebundlepresent")).intValue(), objArr);
            default:
                throw new LuaError("I18N : No such smethod error", 308);
        }
    }

    public final String[] getMethods() {
        return new String[]{"getLocalizedString", "getCurrentLocale", "getCurrentDeviceLocale", "getSupportedLocales", "isLocaleSupportedByDevice", "setCurrentLocale", "setCurrentLocaleAsync", "setDefaultLocale", "setDefaultLocaleAsync", "setResourceBundle", "updateResourceBundle", "deleteResourceBundle", "isResourceBundlePresent"};
    }

    public final String getNameSpace() {
        return "kony.i18n";
    }
}
