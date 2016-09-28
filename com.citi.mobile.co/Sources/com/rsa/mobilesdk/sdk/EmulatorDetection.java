package com.rsa.mobilesdk.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmulatorDetection {
    private static Set<String> emulatorBuildProductMap;
    private ArrayList<Boolean> emulator;

    static {
        emulatorBuildProductMap = new HashSet();
        emulatorBuildProductMap.add("google_sdk");
        emulatorBuildProductMap.add("sdk");
        emulatorBuildProductMap.add("sdk_x86");
        emulatorBuildProductMap.add("vbox86p");
    }

    public EmulatorDetection(Context context) {
        this.emulator = new ArrayList(3);
        this.emulator.add(Boolean.valueOf(isEmulatorByFingerprint()));
        this.emulator.add(Boolean.valueOf(isEmulatorByBuildProduct()));
        this.emulator.add(Boolean.valueOf(isEmulatorByHardware()));
    }

    public int isEmulator() {
        int result = 0;
        Iterator i$ = this.emulator.iterator();
        while (i$.hasNext()) {
            result = (result << 1) + (((Boolean) i$.next()).booleanValue() ? 1 : 0);
        }
        return result;
    }

    private boolean isEmulatorByFingerprint() {
        return Build.FINGERPRINT.contains("generic");
    }

    private boolean isEmulatorByBuildProduct() {
        return emulatorBuildProductMap.contains(Build.PRODUCT);
    }

    @TargetApi(8)
    private boolean isEmulatorByHardware() {
        if (VERSION.SDK_INT >= 8) {
            return "goldfish".equals(Build.HARDWARE);
        }
        return false;
    }
}
