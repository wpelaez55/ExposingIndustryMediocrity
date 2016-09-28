package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0346M;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class Themes {
    private static Library f1758a;
    private static HashMap f1759b;

    private Themes() {
    }

    public static LuaTable getAllThemes(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ThemesNative", "Calling Themes.getAllThemes()");
        }
        return (LuaTable) f1758a.execute(((Integer) f1759b.get("allthemes")).intValue(), objArr)[0];
    }

    public static String getCurrentTheme(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ThemesNative", "Calling Themes.getCurrentTheme()");
        }
        return (String) f1758a.execute(((Integer) f1759b.get("getcurrenttheme")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1758a == null) {
            Library c0346m = new C0346M();
            f1758a = c0346m;
            f1759b = cr.m2202a(c0346m);
        }
    }

    public static boolean isThemePresent(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ThemesNative", "Calling Themes.isThemePresent()");
        }
        return ((Boolean) f1758a.execute(((Integer) f1759b.get("isthemepresent")).intValue(), objArr)[0]).booleanValue();
    }

    public static boolean setCurrentTheme(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("ThemesNative", "Calling Themes.setCurrentTheme()");
        }
        return ((Boolean) f1758a.execute(((Integer) f1759b.get("setcurrenttheme")).intValue(), objArr)[0]).booleanValue();
    }
}
