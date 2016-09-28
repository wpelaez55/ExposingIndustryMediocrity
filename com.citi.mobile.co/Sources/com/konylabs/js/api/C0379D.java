package com.konylabs.js.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.C0375z;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.D */
public final class C0379D implements Library {
    private static String[] f3048a;
    private static Library f3049b;
    private static HashMap f3050c;

    static {
        f3048a = new String[]{"sendSMS", "dial", "openEmail", "openMediaGallery", "addCalendarEvent", "removeCalendarEvent", "findCalendarEvents", "myLocation"};
    }

    public C0379D() {
        if (f3049b == null) {
            Library c0375z = new C0375z(KonyMain.getAppContext());
            f3049b = c0375z;
            f3050c = cr.m2202a(c0375z);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3049b.execute(((Integer) f3050c.get("sendSMS")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3049b.execute(((Integer) f3050c.get("dial")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3049b.execute(((Integer) f3050c.get("openemail")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3049b.execute(((Integer) f3050c.get("openmediagallery")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3049b.execute(((Integer) f3050c.get("addcalendarevent")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3049b.execute(((Integer) f3050c.get("removecalendarevent")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3049b.execute(((Integer) f3050c.get("findcalendarevents")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3049b.execute(((Integer) f3050c.get("mylocation")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3048a;
    }

    public final String getNameSpace() {
        return "kony.phone";
    }
}
