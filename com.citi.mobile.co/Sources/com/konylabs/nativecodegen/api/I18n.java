package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0366o;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class I18n {
    private static Library f1716a;
    private static HashMap f1717b;

    private I18n() {
    }

    public static void deleteResourceBundle(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing I18n.deleteResourceBundle()");
        }
        f1716a.execute(((Integer) f1717b.get("deleteresourcebundle")).intValue(), objArr);
    }

    public static LuaTable getCurrentDeviceLocale(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing getcurrentdevicelocale()");
        }
        return (LuaTable) f1716a.execute(((Integer) f1717b.get("getcurrentdevicelocale")).intValue(), objArr)[0];
    }

    public static String getCurrentLocale() {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing I18n.getCurrentLocale()");
        }
        return (String) f1716a.execute(((Integer) f1717b.get("getcurrentlocale")).intValue(), null)[0];
    }

    public static Object getLocalizedString(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing I18n.getLocalizedString()");
        }
        Object[] execute = f1716a.execute(((Integer) f1717b.get("getlocalizedstring")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static LuaTable getSupportedLocales(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing getSupportedLocales()");
        }
        return (LuaTable) f1716a.execute(((Integer) f1717b.get("getsupportedlocales")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1716a == null) {
            Library c0366o = new C0366o(KonyMain.getAppContext());
            f1716a = c0366o;
            f1717b = cr.m2202a(c0366o);
        }
    }

    public static Boolean isLocaleSupportedByDevice(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing islocalesupportedbydevice()");
        }
        return (Boolean) f1716a.execute(((Integer) f1717b.get("islocalesupportedbydevice")).intValue(), objArr)[0];
    }

    public static Boolean isResourceBundlePresent(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing I18n.isResourceBundlePresent()");
        }
        return (Boolean) f1716a.execute(((Integer) f1717b.get("isresourcebundlepresent")).intValue(), objArr)[0];
    }

    public static Double setCurrentLocale(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing setCurrentLocale()");
        }
        return (Double) f1716a.execute(((Integer) f1717b.get("setcurrentlocale")).intValue(), objArr)[0];
    }

    public static void setDefaultLocale(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing I18n.setDefaultLocale()");
        }
        f1716a.execute(((Integer) f1717b.get("setdefaultlocale")).intValue(), objArr);
    }

    public static void setResourceBundle(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing I18n.setResourceBundle()");
        }
        f1716a.execute(((Integer) f1717b.get("setresourcebundle")).intValue(), objArr);
    }

    public static void updateResourceBundle(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("I18nLibNative", "Executing I18n.updateResourceBundle()");
        }
        f1716a.execute(((Integer) f1717b.get("updateresourcebundle")).intValue(), objArr);
    }
}
