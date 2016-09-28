package com.konylabs.api;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.bW;
import com.konylabs.js.api.JSTable;
import com.konylabs.vm.LuaNil;

/* renamed from: com.konylabs.api.y */
final class C0436y extends JSTable {
    public static String f3570a;
    public static String f3571b;
    private static boolean f3572c;
    private static boolean f3573d;
    private static boolean f3574e;
    private static boolean f3575f;
    private static String f3576g;
    private static C0436y f3577h;
    private static String f3578i;

    static {
        f3572c = true;
        f3573d = true;
        f3574e = true;
        f3575f = false;
        f3576g = null;
        f3570a = "devicewidth";
        f3571b = "deviceheight";
        f3578i = "googleplayservicesoftwarelicence";
    }

    private C0436y() {
        if (KonyMain.m4057C()) {
            f3570a = "deviceWidth";
            f3571b = "deviceHeight";
            f3578i = "googleplayServiceSoftwareLicence";
        }
    }

    public static C0436y m3991a() {
        if (f3577h == null) {
            f3577h = new C0436y();
        }
        return f3577h;
    }

    public final Object getTable(Object obj) {
        int i = 0;
        LuaNil table = super.getTable(obj);
        if (table != LuaNil.nil) {
            return table;
        }
        Object obj2;
        String intern = ((String) obj).intern();
        if (intern == "name") {
            obj2 = "android";
        } else if (intern == "model") {
            obj2 = Build.MODEL;
        } else if (intern == "version") {
            obj2 = VERSION.RELEASE;
        } else if (intern == "APILevel") {
            try {
                i = Integer.parseInt(VERSION.SDK);
            } catch (NumberFormatException e) {
            }
            Double d = new Double((double) i);
        } else if (intern == "deviceid") {
            try {
                String deviceId = ((TelephonyManager) KonyMain.getAppContext().getSystemService("phone")).getDeviceId();
                f3576g = deviceId;
                if (deviceId == null) {
                    if (KonyMain.f3656d > 8) {
                        f3576g = Build.SERIAL;
                    }
                    if (f3576g == null) {
                        f3576g = Secure.getString(KonyMain.getAppContext().getContentResolver(), "android_id");
                    }
                }
            } catch (SecurityException e2) {
                if (f3576g == null) {
                    if (KonyMain.f3656d > 8) {
                        f3576g = Build.SERIAL;
                    }
                    if (f3576g == null) {
                        f3576g = Secure.getString(KonyMain.getAppContext().getContentResolver(), "android_id");
                    }
                }
            }
            obj2 = f3576g != null ? f3576g : "0000000000000000";
        } else {
            if (intern == "SERIAL_NO") {
                if (KonyMain.f3656d > 8) {
                    obj2 = Build.SERIAL;
                }
            } else if (intern == "ANDROID_ID") {
                obj2 = Secure.getString(KonyMain.getAppContext().getContentResolver(), "android_id");
            } else if (intern == "hasgps") {
                r0 = KonyMain.m4142u();
                f3572c = r0;
                obj2 = Boolean.valueOf(r0);
            } else if (intern == "hascamera") {
                obj2 = Boolean.valueOf(i);
                if (KonyMain.f3656d >= 9) {
                    if (!KonyMain.getAppContext().getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
                        KonyMain.getAppContext().getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera.front");
                    }
                    obj2 = Boolean.valueOf(true);
                } else if (KonyMain.f3656d >= 7 && KonyMain.getAppContext().getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
                    obj2 = Boolean.valueOf(true);
                }
            } else if (intern == "hastouchsupport") {
                r0 = KonyMain.m4141t();
                f3573d = r0;
                obj2 = Boolean.valueOf(r0);
            } else if (intern == "hasorientationsupport") {
                r0 = KonyMain.m4140s();
                f3574e = r0;
                obj2 = Boolean.valueOf(r0);
            } else if (intern == "hasaccelerometer") {
                r0 = KonyMain.m4139r();
                f3575f = r0;
                obj2 = Boolean.valueOf(r0);
            } else if (intern == f3570a) {
                obj2 = new Double((double) KonyMain.getAppContext().getResources().getDisplayMetrics().widthPixels);
            } else if (intern == f3571b) {
                obj2 = new Double((double) KonyMain.getAppContext().getResources().getDisplayMetrics().heightPixels);
            } else if (intern == f3578i) {
                try {
                    if (KonyMain.f3656d >= 8 && bW.m830h().booleanValue()) {
                        return Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getDeclaredMethod("getOpenSourceSoftwareLicenseInfo", new Class[]{Context.class}).invoke(null, new Object[]{KonyMain.getAppContext()});
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                return null;
            } else if (intern == "manufacturer") {
                obj2 = Build.MANUFACTURER;
            }
            LuaNil luaNil = table;
        }
        super.setTable(intern, obj2);
        return obj2;
    }
}
