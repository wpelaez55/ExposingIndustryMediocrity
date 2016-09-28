package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class AppMenu {
    private static Library f1687a;
    private static HashMap f1688b;

    private AppMenu() {
    }

    public static void addAppMenuItem(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AppMenuLibNative", "Executing Appmenu.addappmenuitem()");
        }
        f1687a.execute(((Integer) f1688b.get("addappmenuitem")).intValue(), objArr);
    }

    public static void hideAppMenuItems(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AppMenuLibNative", "Executing Appmenu.hideAppMenuItems()");
        }
        f1687a.execute(((Integer) f1688b.get("hideappmenuitems")).intValue(), objArr);
    }

    public static void initialize() {
        if (f1687a == null) {
            Library h = C0349R.m2289h();
            f1687a = h;
            f1688b = cr.m2202a(h);
        }
    }

    public static void removeAppMenuItem(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AppMenuLibNative", "Executing Appmenu.removeappmenuitem()");
        }
        f1687a.execute(((Integer) f1688b.get("removeappmenuitem")).intValue(), objArr);
    }

    public static void setAppMenu(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AppMenuLibNative", "Executing Appmenu.setAppMenu()");
        }
        f1687a.execute(((Integer) f1688b.get("setappmenu")).intValue(), objArr);
    }

    public static void setAppMenuFocusIndex(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AppMenuLibNative", "Executing Appmenu.setAppMenuFocusIndex()");
        }
        f1687a.execute(((Integer) f1688b.get("setappmenufocusindex")).intValue(), objArr);
    }

    public static void showAppMenuItems(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AppMenuLibNative", "Executing Appmenu.showAppMenuItems()");
        }
        f1687a.execute(((Integer) f1688b.get("showappmenuitems")).intValue(), objArr);
    }
}
