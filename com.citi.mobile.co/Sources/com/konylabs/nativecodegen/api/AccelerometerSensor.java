package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0353a;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class AccelerometerSensor {
    private static C0353a f1683a;
    private static HashMap f1684b;

    private AccelerometerSensor() {
    }

    public static void initialize() {
        if (f1683a == null) {
            Library c0353a = new C0353a();
            f1683a = c0353a;
            f1684b = cr.m2202a(c0353a);
        }
    }

    public static void registerAccelerationEvents(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AccelerometerSensor", "Calling registeraccelerationevents() ");
        }
        f1683a.execute(((Integer) f1684b.get("registeraccelerationevents")).intValue(), objArr);
    }

    public static void retrieveCurrentAcceleration(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AccelerometerSensor", "Calling retrievecurrentacceleration() ");
        }
        f1683a.execute(((Integer) f1684b.get("retrievecurrentacceleration")).intValue(), objArr);
    }

    public static void startMonitoringAcceleration(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AccelerometerSensor", "Calling startmonitoringacceleration() ");
        }
        f1683a.execute(((Integer) f1684b.get("startmonitoringacceleration")).intValue(), objArr);
    }

    public static void stopMonitoringAcceleration() {
        if (KonyMain.f3657e) {
            Log.d("AccelerometerSensor", "Calling stopmonitoringacceleration() ");
        }
        f1683a.execute(((Integer) f1684b.get("stopmonitoringacceleration")).intValue(), null);
    }

    public static void unregisterAccelerationEvents(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("AccelerometerSensor", "Calling unregisteraccelerationevents()");
        }
        f1683a.execute(((Integer) f1684b.get("unregisteraccelerationevents")).intValue(), objArr);
    }
}
