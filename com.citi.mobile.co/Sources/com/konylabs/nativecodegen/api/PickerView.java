package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class PickerView {
    private static String f1736a;
    private static Library f1737b;
    private static HashMap f1738c;

    static {
        f1736a = "PickerViewNative";
    }

    private PickerView() {
    }

    static void m1629a() {
        if (f1737b == null) {
            Library n = C0349R.m2295n();
            f1737b = n;
            f1738c = cr.m2202a(n);
        }
    }

    public static void setComponentData(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1736a, "Executing PickerView.setComponentData()");
        }
        f1737b.execute(((Integer) f1738c.get("setcomponentdata")).intValue(), objArr);
    }

    public static void setSelectedKeyInComponent(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1736a, "Executing PickerView.setSelectedKeyInComponent()");
        }
        f1737b.execute(((Integer) f1738c.get("setselectedkeyincomponent")).intValue(), objArr);
    }
}
