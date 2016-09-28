package com.citi.latam.ffimodules;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.konylabs.android.KonyMain;

public class FFIFunctions {
    private static KonyMain konyContext;

    public static void findAndLaunchApp(String appID, String storeURL) {
        konyContext = KonyMain.getActivityContext();
        Activity activity = konyContext;
        PackageManager packageManager = activity.getPackageManager();
        if (isPackageExists(packageManager, appID)) {
            activity.startActivity(packageManager.getLaunchIntentForPackage(appID));
            return;
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(storeURL)));
    }

    public static void launchStore(Object activityObject, String appID, String storeURL) {
        Activity activity = (Activity) activityObject;
        if (!isPackageExists(activity.getPackageManager(), appID)) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(storeURL)));
        }
    }

    public static void callLaunchStore(String appID, String storeURL) {
        konyContext = KonyMain.getActivityContext();
        launchStore(konyContext, appID, storeURL);
    }

    public static boolean callIsAppIDExists(String appID) {
        konyContext = KonyMain.getActivityContext();
        return isAppIDExists(konyContext, appID);
    }

    public static boolean isAppIDExists(Object activityObject, String appID) {
        return isPackageExists(((Activity) activityObject).getPackageManager(), appID);
    }

    public static boolean isPackageExists(PackageManager packageManager, String targetPackage) {
        for (ApplicationInfo packageInfo : packageManager.getInstalledApplications(0)) {
            if (packageInfo.packageName.equals(targetPackage)) {
                return true;
            }
        }
        return false;
    }
}
