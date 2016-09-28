package com.rsa.mobilesdk.sdk;

import android.util.Log;
import com.konylabs.android.KonyMain;
import java.util.Properties;

public class RSA {
    public static String collectRSAInfo() {
        Log.d("RSA", "inside initRSA");
        MobileAPI mobileApi = MobileAPI.getInstance(KonyMain.getActivityContext());
        Properties props = new Properties();
        props.setProperty(MobileAPI.CONFIGURATION_KEY, "2");
        mobileApi.initSDK(props);
        String rsaJSON = mobileApi.collectInfo();
        Log.d("rsaJSON value: ", rsaJSON);
        Log.d("RSA", "returning from initRSA");
        return rsaJSON;
    }

    public static boolean isDeviceRooted() {
        return RootedDeviceChecker.isDeviceRooted(KonyMain.getAppContext()) != 0;
    }
}
