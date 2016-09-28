package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Segui {
    private static Library f1744a;
    private static HashMap f1745b;

    private Segui() {
    }

    static void m1631a() {
        if (f1744a == null) {
            Library d = C0349R.m2285d();
            f1744a = d;
            f1745b = cr.m2202a(d);
        }
    }

    public static void addAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.addAll()");
        }
        f1744a.execute(((Integer) f1745b.get("addall")).intValue(), objArr);
    }

    public static void addAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.addAt()");
        }
        f1744a.execute(((Integer) f1745b.get("addat")).intValue(), objArr);
    }

    public static void addAtInSection(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.addAtInSection()");
        }
        f1744a.execute(((Integer) f1745b.get("addatinsection")).intValue(), objArr);
    }

    public static void removeAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.removeAll()");
        }
        f1744a.execute(((Integer) f1745b.get("removeall")).intValue(), objArr);
    }

    public static void removeAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.removeAt()");
        }
        f1744a.execute(((Integer) f1745b.get("removeat")).intValue(), objArr);
    }

    public static void removeAtInSection(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.removeAtInSection()");
        }
        f1744a.execute(((Integer) f1745b.get("removeatinsection")).intValue(), objArr);
    }

    public static void setData(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.setData()");
        }
        f1744a.execute(((Integer) f1745b.get("setdata")).intValue(), objArr);
    }

    public static void setDataAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.setDataAt()");
        }
        f1744a.execute(((Integer) f1745b.get("setdataat")).intValue(), objArr);
    }

    public static void setDataWithSections(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("SeguiLibNative", "Executing Segui.setDataWithSections()");
        }
        f1744a.execute(((Integer) f1745b.get("setdatawithsections")).intValue(), objArr);
    }
}
