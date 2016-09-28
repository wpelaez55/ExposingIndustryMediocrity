package com.konylabs.js.api;

import com.konylabs.api.C0349R;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.P */
public final class C0391P implements Library {
    private static Library f3085a;
    private static HashMap f3086b;
    private static String[] f3087c;

    static {
        f3087c = new String[]{"setVisibility", "setFocus", "setEnabled", "setGestureRecognizer", "removeGestureRecognizer", "setGesturerecognizerForAllForms", "removeGestureRecognizerForAllForms", "toString", "setBadge", "getBadge", "applyAnimation"};
    }

    public C0391P() {
        if (f3085a == null) {
            Library a = C0349R.m2282a();
            f3085a = a;
            f3086b = cr.m2202a(a);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3085a.execute(((Integer) f3086b.get("setvisibility")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3085a.execute(((Integer) f3086b.get("setfocus")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3085a.execute(((Integer) f3086b.get("setenabled")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3085a.execute(((Integer) f3086b.get("setgesturerecognizer")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3085a.execute(((Integer) f3086b.get("removegesturerecognizer")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof LuaWidget)) {
                    return null;
                }
                String propertiesInfo = ((LuaWidget) objArr[0]).getPropertiesInfo();
                return new Object[]{propertiesInfo};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3085a.execute(((Integer) f3086b.get("setbadge")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return f3085a.execute(((Integer) f3086b.get("getbadge")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                return f3085a.execute(((Integer) f3086b.get("applyAnimation")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3087c;
    }

    public final String getNameSpace() {
        return "kony.widget";
    }
}
