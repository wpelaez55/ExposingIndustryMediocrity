package com.rsa.mobilesdk.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;

public class ApplicationKey {
    private static final String APP_KEY_PREF = "com.rsa.mobilesdk.app_key";
    private static final String APP_KEY_SHARED_PREFS = "rsa_application_key_prefs";
    public static final int DEVICE_BINDING_DATA_LENGTH = 16;
    private static final String INVALID_APP_KEY_STR = "INVALID";
    private static final String TAG = "ApplicationKey";

    public static synchronized String getApplicationKey(Context context) {
        String key;
        synchronized (ApplicationKey.class) {
            key = null;
            if (context != null) {
                key = getStoredApplicationKey(context);
                if (TextUtils.isEmpty(key)) {
                    key = generateApplicationKey(context);
                    storeApplicationKey(context, key);
                }
            }
        }
        return key;
    }

    private static String getStoredApplicationKey(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(APP_KEY_SHARED_PREFS, 0);
        if (prefs != null) {
            return prefs.getString(APP_KEY_PREF, null);
        }
        Log.e(TAG, "unexpected error in getStoredApplicationKey, can't get shared preferences");
        return INVALID_APP_KEY_STR;
    }

    private static String generateApplicationKey(Context context) {
        String deviceIDValue = BuildConfig.FLAVOR;
        byte[] deviceIDbytes = new byte[DEVICE_BINDING_DATA_LENGTH];
        if (Utils.getSecureRandomBytes(deviceIDbytes)) {
            return Utils.byteArrayToHexString(deviceIDbytes);
        }
        Log.e(TAG, "unexpected error in getStoredApplicationKey, can't generate key");
        return INVALID_APP_KEY_STR;
    }

    private static void storeApplicationKey(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences(APP_KEY_SHARED_PREFS, 0);
        if (prefs == null) {
            Log.e(TAG, "unexpected error in storeApplicationKey, can't get shared preferences");
            return;
        }
        Editor editor = prefs.edit();
        editor.putString(APP_KEY_PREF, key);
        editor.commit();
    }
}
