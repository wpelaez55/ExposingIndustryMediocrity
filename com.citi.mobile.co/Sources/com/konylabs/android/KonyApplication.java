package com.konylabs.android;

import android.app.Application;
import android.util.Log;

public class KonyApplication extends Application {
    public static int KONY_TRIM_MEMORY_COMPLETE;
    public static int KONY_TRIM_MEMORY_MODERATE;
    public static int KONY_TRIM_MEMORY_RUNNING_CRITICAL;
    public static int KONY_TRIM_MEMORY_RUNNING_LOW;
    public static int KONY_TRIM_MEMORY_RUNNING_MODERATE;
    private static String f16a;

    static {
        f16a = "KonyApplication";
        KONY_TRIM_MEMORY_COMPLETE = 1;
        KONY_TRIM_MEMORY_MODERATE = 2;
        KONY_TRIM_MEMORY_RUNNING_CRITICAL = 3;
        KONY_TRIM_MEMORY_RUNNING_LOW = 4;
        KONY_TRIM_MEMORY_RUNNING_MODERATE = 5;
    }

    public void onLowMemory() {
        if (KonyMain.f3654b == 1) {
            if (KonyMain.f3657e) {
                Log.d(f16a, "onLowMemory()");
            }
            KonyMain.m4115c(KONY_TRIM_MEMORY_COMPLETE);
        }
    }

    public void onTrimMemory(int i) {
        if (KonyMain.f3654b == 1) {
            if (KonyMain.f3657e) {
                Log.d(f16a, "onTrimMemory(" + i + ")");
            }
            KonyMain.m4115c(i);
        }
    }
}
