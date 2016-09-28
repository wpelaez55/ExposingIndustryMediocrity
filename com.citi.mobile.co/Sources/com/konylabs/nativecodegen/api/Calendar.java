package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Calendar {
    private static Library f1692a;
    private static HashMap f1693b;

    private Calendar() {
    }

    static void m1623a() {
        if (f1692a == null) {
            Library l = C0349R.m2293l();
            f1692a = l;
            f1693b = cr.m2202a(l);
        }
    }

    public static void clear(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("CalendarNative", "Executing Calendar.clear()");
        }
        f1692a.execute(((Integer) f1693b.get("clear")).intValue(), objArr);
    }
}
