package com.konylabs.js.api;

import com.konylabs.api.C0353a;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.a */
public final class C0392a implements Library {
    private static Library f3088a;
    private static HashMap f3089b;
    private static String[] f3090c;

    static {
        f3090c = new String[]{"retrieveCurrentAcceleration", "startMonitoringAcceleration", "stopMonitoringAcceleration", "registerAccelerationEvents", "unregisterAccelerationEvents"};
    }

    public C0392a() {
        if (f3088a == null) {
            Library c0353a = new C0353a();
            f3088a = c0353a;
            f3089b = cr.m2202a(c0353a);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                f3088a.execute(((Integer) f3089b.get("retrievecurrentacceleration")).intValue(), objArr);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                f3088a.execute(((Integer) f3089b.get("startmonitoringacceleration")).intValue(), objArr);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                f3088a.execute(((Integer) f3089b.get("stopmonitoringacceleration")).intValue(), objArr);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                f3088a.execute(((Integer) f3089b.get("registeraccelerationevents")).intValue(), objArr);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                f3088a.execute(((Integer) f3089b.get("unregisteraccelerationevents")).intValue(), objArr);
                break;
        }
        return null;
    }

    public final String[] getMethods() {
        return f3090c;
    }

    public final String getNameSpace() {
        return "kony.accelerometer";
    }
}
