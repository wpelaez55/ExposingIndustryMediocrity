package com.konylabs.api;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Vector;
import ny0k.cN;

/* renamed from: com.konylabs.api.M */
public final class C0346M implements Library {
    private static final String[] f2392a;

    static {
        f2392a = new String[]{"setcurrenttheme", "isthemepresent", "allthemes", "getcurrenttheme", "createtheme", "getcurrentthemedata", "deletetheme", "getallthemes"};
    }

    private static void m2274a(Function function) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = function;
        KonyMain.m4121f().sendMessage(obtain);
    }

    private static void m2275a(Function function, int i, String str) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = function;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", Integer.valueOf(-1));
        bundle.putSerializable("key1", str);
        obtain.setData(bundle);
        KonyMain.m4121f().sendMessage(obtain);
    }

    public final Object[] execute(int i, Object[] objArr) {
        Function function;
        String str;
        boolean d;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr == null || objArr.length != 3) {
                    throw new LuaError("Invalid number of arguments or invalid type of arguments for kony.theme.setCurrentTheme()", 11001);
                }
                str = (String) objArr[0];
                Function function2 = objArr[1] != LuaNil.nil ? (Function) objArr[1] : null;
                Function function3 = objArr[2] != LuaNil.nil ? (Function) objArr[2] : null;
                if (str == null) {
                    if (function3 == null) {
                        return null;
                    }
                    C0346M.m2275a(function3, -1, "Theme Id not specified for theme.setcurrenttheme()");
                    return null;
                } else if (str.equals(cN.m2142a())) {
                    if (function2 == null) {
                        return null;
                    }
                    C0346M.m2274a(function2);
                    return null;
                } else if (cN.m2143a(str)) {
                    KonyMain.m4094a(new C0155N(this, function2));
                    return null;
                } else if (function3 == null) {
                    return null;
                } else {
                    C0346M.m2275a(function3, -1, "Unable to load theme");
                    return null;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr == null || objArr.length != 1) {
                    throw new LuaError("Invalid number of arguments or invalid type of arguments for kony.theme.isThemePresent()", 11001);
                }
                str = objArr[0] != LuaNil.nil ? (String) objArr[0] : null;
                d = str == null ? false : cN.m2152d(str);
                return new Object[]{Boolean.valueOf(d)};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                LuaTable luaTable;
                Vector b = cN.m2147b();
                if (b != null) {
                    luaTable = new LuaTable(b.size(), 0);
                    luaTable.addAll(b);
                } else {
                    luaTable = null;
                }
                if (luaTable == null) {
                    return null;
                }
                return new Object[]{luaTable};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (cN.m2142a() == null) {
                    return null;
                }
                return new Object[]{cN.m2142a()};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr == null || objArr.length != 4) {
                    throw new LuaError("Invalid number of arguments or invalid type of arguments for kony.theme.createTheme()", 11001);
                }
                String str2 = objArr[0] != LuaNil.nil ? (String) objArr[0] : null;
                String str3 = objArr[1] != LuaNil.nil ? (String) objArr[1] : null;
                Function function4 = objArr[2] != LuaNil.nil ? (Function) objArr[2] : null;
                function = objArr[3] != LuaNil.nil ? (Function) objArr[3] : null;
                if (str2 == null) {
                    C0346M.m2275a(function, -1, "Url to the theme not specified or nil");
                    return null;
                } else if (str3 == null) {
                    C0346M.m2275a(function, -1, "Theme Id not specified or nil");
                    return null;
                } else {
                    try {
                        if (cN.m2144a(str2, str3)) {
                            if (function4 == null) {
                                return null;
                            }
                            C0346M.m2274a(function4);
                            return null;
                        } else if (function == null) {
                            return null;
                        } else {
                            C0346M.m2275a(function, -1, "Creating theme from url " + str2 + " failed");
                            return null;
                        }
                    } catch (MalformedURLException e) {
                        if (KonyMain.f3657e) {
                            Log.d("ThemeLib", BuildConfig.FLAVOR + e);
                        }
                        if (function == null) {
                            return null;
                        }
                        C0346M.m2275a(function, -1, "Url " + str2 + " is malformed");
                        return null;
                    } catch (IOException e2) {
                        if (KonyMain.f3657e) {
                            Log.d("ThemeLib", BuildConfig.FLAVOR + e2);
                        }
                        if (function == null) {
                            return null;
                        }
                        C0346M.m2275a(function, -1, "Unable to read json string from url: " + str2);
                        return null;
                    }
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (cN.m2149c() == null) {
                    return null;
                }
                return new Object[]{cN.m2149c()};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (objArr == null || objArr.length != 3) {
                    throw new LuaError("Invalid number of arguments or invalid type of arguments to theme.deletetheme()", 11001);
                }
                String str4 = objArr[0] != LuaNil.nil ? (String) objArr[0] : null;
                function = objArr[1] != LuaNil.nil ? (Function) objArr[1] : null;
                Function function5 = objArr[2] != LuaNil.nil ? (Function) objArr[2] : null;
                if (str4 == null) {
                    if (function5 != null) {
                        C0346M.m2275a(function5, -1, "Theme Id nil or not specified");
                    }
                    d = false;
                } else {
                    str = (String) objArr[0];
                    if (!cN.m2150c((String) objArr[0])) {
                        if (function5 != null) {
                            C0346M.m2275a(function5, -1, "Deleting theme with themeId '" + str4 + "' failed");
                        }
                        d = false;
                    } else if (cN.m2142a().equals(str)) {
                        cN.m2143a("default");
                        KonyMain.m4094a(new C0156O(this, function));
                        d = true;
                    } else {
                        if (function != null) {
                            C0346M.m2274a(function);
                        }
                        d = true;
                    }
                }
                if (Boolean.valueOf(d) == null) {
                    return null;
                }
                return new Object[]{Boolean.valueOf(d)};
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f2392a;
    }

    public final String getNameSpace() {
        return "theme";
    }
}
