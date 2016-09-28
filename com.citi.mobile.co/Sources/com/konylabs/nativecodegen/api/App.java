package com.konylabs.nativecodegen.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.eG;
import com.konylabs.api.ui.eH;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class App {
    private static Library f1685a;
    private static HashMap f1686b;
    public static final eG footers;
    public static final eH headers;

    static {
        headers = eH.m3988a();
        footers = eG.m3985a();
    }

    private App() {
    }

    public static void initialize() {
        if (f1685a == null) {
            Library i = C0349R.m2290i();
            f1685a = i;
            f1686b = cr.m2202a(i);
        }
    }

    public static void setAppFooters(Object[] objArr) {
        f1685a.execute(((Integer) f1686b.get("setappfooters")).intValue(), objArr);
    }

    public static void setAppHeaders(Object[] objArr) {
        f1685a.execute(((Integer) f1686b.get("setappheaders")).intValue(), objArr);
    }
}
