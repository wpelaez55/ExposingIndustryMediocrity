package com.rsa.mobilesdk.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v4.media.TransportMediator;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RootedDeviceChecker {
    private static final String[] APK_BLACKLIST;
    private static Set<String> PACKAGE_BLACKLIST;
    private static final String[] SU_DIR;

    static {
        APK_BLACKLIST = new String[]{"Superuser.apk", "myhappy.apk"};
        SU_DIR = new String[]{"/system/bin/", "/system/xbin/", "/sbin/", "/system/", "/system/bin/.ext/", "/system/usr/we-need-root/"};
        PACKAGE_BLACKLIST = new HashSet();
        PACKAGE_BLACKLIST.add("com.noshufou.android.su");
        PACKAGE_BLACKLIST.add("eu.chainfire.supersu");
        PACKAGE_BLACKLIST.add("eu.chainfire.supersu.pro");
        PACKAGE_BLACKLIST.add("com.koushikdutta.superuser");
        PACKAGE_BLACKLIST.add("com.noshufou.android.su.elite");
        PACKAGE_BLACKLIST.add("david.lahuta.superuser.free.pro");
        PACKAGE_BLACKLIST.add("com.bitcubate.android.su.installer");
        PACKAGE_BLACKLIST.add("com.bitcubate.superuser.pro");
        PACKAGE_BLACKLIST.add("david.lahuta.superuser");
    }

    private RootedDeviceChecker() {
    }

    static int isDeviceRooted(Context context) {
        int result = 0;
        for (Boolean booleanValue : new Boolean[]{Boolean.valueOf(checkPackages(context)), Boolean.valueOf(checkPresenceOfsuspiciosAPKs()), Boolean.valueOf(checkSUFileExist())}) {
            int i;
            result <<= 1;
            if (booleanValue.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            result += i;
        }
        return result;
    }

    private static boolean checkPresenceOfsuspiciosAPKs() {
        try {
            for (String apk : Arrays.asList(APK_BLACKLIST)) {
                if (new File("/system/app/" + apk).exists()) {
                    return true;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    private static boolean checkPackages(Context context) {
        List<ApplicationInfo> packages = context.getPackageManager().getInstalledApplications(TransportMediator.FLAG_KEY_MEDIA_NEXT);
        if (packages != null) {
            for (ApplicationInfo packageInfo : packages) {
                if (PACKAGE_BLACKLIST.contains(packageInfo.packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkSUFileExist() {
        for (String dir : Arrays.asList(SU_DIR)) {
            if (new File(dir + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
