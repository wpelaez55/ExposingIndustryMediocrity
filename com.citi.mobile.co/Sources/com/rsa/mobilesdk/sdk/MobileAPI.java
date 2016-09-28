package com.rsa.mobilesdk.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Point;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.support.v4.content.ContextCompat;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.konylabs.ffi.N_RSA;
import com.rsa.mobilesdk.sdk.DeviceInfo.WiFiNetworksData;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;

public class MobileAPI {
    public static final String ADD_TIMESTAMP_KEY = "Add-timestamp-key";
    public static final int BEST_LOCATION_AGE_MINUTES_DEFAULT_VALUE = 3;
    public static final String BEST_LOCATION_AGE_MINUTES_KEY = "Best-location-age-key";
    public static final int COLLECT_ALL_DEVICE_DATA_AND_LOCATION = 2;
    public static final int COLLECT_BASIC_DEVICE_DATA_ONLY = 0;
    public static final int COLLECT_DEVICE_DATA_ONLY = 1;
    public static final int CONFIGURATION_DEFAULT_VALUE = 0;
    public static final String CONFIGURATION_KEY = "Configuration-key";
    public static final int MAX_ACCURACY_DEFAULT_VALUE = 100;
    public static final String MAX_ACCURACY_KEY = "Max-accuracy-key";
    private static final int MAX_API_ID = 22;
    public static final int MAX_CUSTOM_STRING_LENGTH = 1024;
    public static final int MAX_LOCATION_AGE_DAYS_DEFAULT_VALUE = 2;
    public static final String MAX_LOCATION_AGE_DAYS_KEY = "Max-location-age-key";
    private static final String RESULT_NO_PERMISSIONS = "-1";
    public static final int SILENT_PERIOD_DEFAULT_VALUE = 3;
    public static final String SILENT_PERIOD_MINUTES_KEY = "Silent-period-key";
    private static final String TAG = "MobileAPI";
    public static final int TIMEOUT_DEFAULT_VALUE = 2;
    public static final String TIMEOUT_MINUTES_KEY = "Timeout-key";
    private static MobileAPI sInstance;
    private LooperStatus looperStatus;
    private int[] mAPI_state;
    private boolean mAddTimestamp;
    private int mConfiguration;
    private final Context mContext;
    private HashMap<String, Object> mCustomValues;
    private DeviceInfo mDeviceInfo;
    private EmulatorDetection mEmulatorDetection;
    private int mLocationBestAgeMinutes;
    private int mLocationMaxAccuracy;
    private int mLocationMaxAgeDays;
    private LocationRetriever mLocationRetriever;
    private int mLocationSilentPeriod;
    private int mLocationTimeout;
    private int mScreenHeight;
    private int mScreenWidth;
    private final TelephonyManager mTelephonyManager;

    public enum CustomElementType {
        BOOLEAN,
        INT,
        FLOAT,
        STRING
    }

    private enum LooperStatus {
        LooperExist,
        LooperCreated,
        LooperMissing
    }

    /* renamed from: com.rsa.mobilesdk.sdk.MobileAPI.1 */
    class C04161 implements OnLocationDataChangedListener {
        C04161() {
        }

        public void onLocationDataChanged() {
            MobileAPI.this.mAPI_state[4] = MobileAPI.this.mDeviceInfo.mGeoLocation.mLocationDataStatus;
        }
    }

    static {
        sInstance = null;
    }

    public static synchronized MobileAPI getInstance(Activity activity) {
        MobileAPI mobileAPI;
        synchronized (MobileAPI.class) {
            if (activity != null) {
                if (sInstance == null) {
                    sInstance = new MobileAPI(activity);
                }
            }
            mobileAPI = sInstance;
        }
        return mobileAPI;
    }

    @SuppressLint({"NewApi"})
    private MobileAPI(Activity activity) {
        this.looperStatus = LooperStatus.LooperMissing;
        this.mConfiguration = CONFIGURATION_DEFAULT_VALUE;
        this.mAPI_state = new int[23];
        this.mAddTimestamp = true;
        this.mCustomValues = new HashMap();
        this.mContext = activity.getApplicationContext();
        Display disp = activity.getWindowManager().getDefaultDisplay();
        if (disp == null) {
            this.mScreenWidth = CONFIGURATION_DEFAULT_VALUE;
            this.mScreenHeight = CONFIGURATION_DEFAULT_VALUE;
        } else if (VERSION.SDK_INT >= 13) {
            Point p = new Point();
            disp.getSize(p);
            this.mScreenWidth = p.x;
            this.mScreenHeight = p.y;
        } else {
            this.mScreenWidth = disp.getWidth();
            this.mScreenHeight = disp.getHeight();
        }
        this.mTelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
    }

    public synchronized void initSDK(Properties properties) {
        Log.i(TAG, "initSDK");
        if (this.mDeviceInfo == null) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
                this.looperStatus = LooperStatus.LooperCreated;
            } else {
                this.looperStatus = LooperStatus.LooperExist;
            }
            if (properties != null) {
                initAndValidateProperties(properties);
                this.mDeviceInfo = new DeviceInfo(this.mConfiguration);
                for (int i = CONFIGURATION_DEFAULT_VALUE; i < this.mAPI_state.length; i += COLLECT_DEVICE_DATA_ONLY) {
                    this.mAPI_state[i] = TIMEOUT_DEFAULT_VALUE;
                }
                switch (this.mConfiguration) {
                    case CONFIGURATION_DEFAULT_VALUE /*0*/:
                        collectBasicDeviceData();
                        break;
                    case COLLECT_DEVICE_DATA_ONLY /*1*/:
                        collectBasicDeviceData();
                        collectDeviceData();
                        break;
                    case TIMEOUT_DEFAULT_VALUE /*2*/:
                        collectBasicDeviceData();
                        collectDeviceData();
                        collectDeviceLocationAndNetworkData(properties);
                        break;
                    default:
                        break;
                }
            }
            throw new IllegalArgumentException("Invalid parameter: " + properties);
        }
        Log.w(TAG, "SDK already initialized");
    }

    private void initAndValidateProperties(Properties properties) {
        this.mConfiguration = Utils.getIntProperty(properties, CONFIGURATION_KEY, CONFIGURATION_DEFAULT_VALUE);
        if (this.mConfiguration < 0 || this.mConfiguration > TIMEOUT_DEFAULT_VALUE) {
            throw new IllegalArgumentException("invalid configuration key: " + this.mConfiguration);
        }
        this.mAddTimestamp = Utils.getBooleanProperty(properties, ADD_TIMESTAMP_KEY, false);
        if (this.mConfiguration == TIMEOUT_DEFAULT_VALUE) {
            this.mLocationTimeout = Utils.getIntProperty(properties, TIMEOUT_MINUTES_KEY, TIMEOUT_DEFAULT_VALUE);
            if (this.mLocationTimeout < COLLECT_DEVICE_DATA_ONLY || this.mLocationTimeout > 4) {
                throw new IllegalArgumentException("invalid TIMEOUT_MINUTES_KEY: " + this.mLocationTimeout);
            }
            this.mLocationSilentPeriod = Utils.getIntProperty(properties, SILENT_PERIOD_MINUTES_KEY, SILENT_PERIOD_DEFAULT_VALUE);
            if (this.mLocationSilentPeriod < COLLECT_DEVICE_DATA_ONLY || this.mLocationSilentPeriod > 60) {
                throw new IllegalArgumentException("invalid SILENT_PERIOD_MINUTES_KEY: " + this.mLocationSilentPeriod);
            }
            this.mLocationBestAgeMinutes = Utils.getIntProperty(properties, BEST_LOCATION_AGE_MINUTES_KEY, SILENT_PERIOD_DEFAULT_VALUE);
            if (this.mLocationBestAgeMinutes < TIMEOUT_DEFAULT_VALUE || this.mLocationBestAgeMinutes > 4) {
                throw new IllegalArgumentException("invalid BEST_LOCATION_AGE_MINUTES_KEY: " + this.mLocationBestAgeMinutes);
            }
            this.mLocationMaxAgeDays = Utils.getIntProperty(properties, MAX_LOCATION_AGE_DAYS_KEY, TIMEOUT_DEFAULT_VALUE);
            if (this.mLocationMaxAgeDays < COLLECT_DEVICE_DATA_ONLY || this.mLocationMaxAgeDays > SILENT_PERIOD_DEFAULT_VALUE) {
                throw new IllegalArgumentException("invalid MAX_LOCATION_AGE_DAYS_KEY: " + this.mLocationMaxAgeDays);
            }
            this.mLocationMaxAccuracy = Utils.getIntProperty(properties, MAX_ACCURACY_KEY, MAX_ACCURACY_DEFAULT_VALUE);
            if (this.mLocationMaxAccuracy < 50 || this.mLocationMaxAccuracy > 200) {
                throw new IllegalArgumentException("invalid MAX_ACCURACY_KEY: " + this.mLocationMaxAccuracy);
            }
        }
    }

    private void collectBasicDeviceData() {
        this.mEmulatorDetection = new EmulatorDetection(this.mContext);
        this.mDeviceInfo.collectionTimeStamp = new Date();
        this.mDeviceInfo.mHardwareId = getDeviceId();
        this.mDeviceInfo.mSim_Id = getSubscriberId();
        this.mDeviceInfo.mPhoneNumber = getPhoneNumber();
        this.mDeviceInfo.mRSA_ApplicationKey = getRsaApplicationKey();
        this.mDeviceInfo.mRooted = isRootedDevice();
        this.mDeviceInfo.mEmulator = isEmulator();
    }

    private void collectDeviceLocationAndNetworkData(Properties params) {
        if (this.mLocationRetriever == null) {
            this.mLocationRetriever = new LocationRetriever();
        }
        this.mLocationRetriever.queryLocation(this.mContext, (long) this.mLocationTimeout, (long) this.mLocationSilentPeriod, (long) this.mLocationBestAgeMinutes, (long) this.mLocationMaxAgeDays, this.mLocationMaxAccuracy, this.mDeviceInfo.mGeoLocation, new C04161());
        getWiFiNetworksData(this.mDeviceInfo.mWfNetworksData);
        this.mDeviceInfo.mMCC = getMCC();
        this.mDeviceInfo.mMNC = getMNC();
        this.mDeviceInfo.mCellTowerId = getCellTowerId();
        this.mDeviceInfo.mLocationAreaCode = getLocationAreaCode();
    }

    private void collectDeviceData() {
        this.mDeviceInfo.mDeviceModel = getDeviceModel();
        this.mDeviceInfo.mDeviceMultitaskingSupported = isMultitaskingSupported();
        this.mDeviceInfo.mDeviceName = getDeviceName();
        this.mDeviceInfo.mDeviceSystemName = getDeviceSystemName();
        this.mDeviceInfo.mDeviceSystemVersion = getDeviceSystemVersion();
        this.mDeviceInfo.mScreenSize = getScreenSize();
        this.mDeviceInfo.mLanguage = getLanguage();
        this.mDeviceInfo.mWiFiMACAddress = getWiFiMacAddress();
        this.mDeviceInfo.mOS_ID = getOsId();
    }

    String getDeviceId() {
        this.mAPI_state[COLLECT_DEVICE_DATA_ONLY] = -1;
        try {
            if (ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_PHONE_STATE") == 0) {
                String result = this.mTelephonyManager.getDeviceId();
                this.mAPI_state[COLLECT_DEVICE_DATA_ONLY] = CONFIGURATION_DEFAULT_VALUE;
                return result;
            }
            this.mAPI_state[COLLECT_DEVICE_DATA_ONLY] = COLLECT_DEVICE_DATA_ONLY;
            return RESULT_NO_PERMISSIONS;
        } catch (SecurityException e) {
            this.mAPI_state[COLLECT_DEVICE_DATA_ONLY] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getSubscriberId() {
        this.mAPI_state[TIMEOUT_DEFAULT_VALUE] = -1;
        try {
            String result = this.mTelephonyManager.getSubscriberId();
            this.mAPI_state[TIMEOUT_DEFAULT_VALUE] = CONFIGURATION_DEFAULT_VALUE;
            return result;
        } catch (SecurityException e) {
            this.mAPI_state[TIMEOUT_DEFAULT_VALUE] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getPhoneNumber() {
        this.mAPI_state[SILENT_PERIOD_DEFAULT_VALUE] = -1;
        try {
            String result = this.mTelephonyManager.getLine1Number();
            this.mAPI_state[SILENT_PERIOD_DEFAULT_VALUE] = CONFIGURATION_DEFAULT_VALUE;
            return result;
        } catch (SecurityException e) {
            this.mAPI_state[SILENT_PERIOD_DEFAULT_VALUE] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getScreenSize() {
        this.mAPI_state[15] = CONFIGURATION_DEFAULT_VALUE;
        return Integer.toString(this.mScreenWidth) + "x" + Integer.toString(this.mScreenHeight);
    }

    String getLanguage() {
        this.mAPI_state[10] = -1;
        try {
            String language = Locale.getDefault().getLanguage().toLowerCase();
            if (language.equals("iw")) {
                language = "he";
            } else if (language.equals("in")) {
                language = "id";
            } else if (language.equals("ji")) {
                language = "yi";
            }
            this.mAPI_state[10] = CONFIGURATION_DEFAULT_VALUE;
            return language;
        } catch (SecurityException e) {
            this.mAPI_state[10] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getWiFiMacAddress() {
        this.mAPI_state[11] = -1;
        try {
            String macAddr = ((WifiManager) this.mContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            this.mAPI_state[11] = CONFIGURATION_DEFAULT_VALUE;
            return macAddr;
        } catch (SecurityException e) {
            this.mAPI_state[11] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getMCC() {
        this.mAPI_state[18] = -1;
        try {
            String networkOperator = this.mTelephonyManager.getNetworkOperator();
            this.mAPI_state[18] = CONFIGURATION_DEFAULT_VALUE;
            if (networkOperator != null && networkOperator.length() >= SILENT_PERIOD_DEFAULT_VALUE) {
                return networkOperator.substring(CONFIGURATION_DEFAULT_VALUE, SILENT_PERIOD_DEFAULT_VALUE);
            }
            int mcc = this.mContext.getResources().getConfiguration().mcc;
            if (mcc == 0) {
                return null;
            }
            return Integer.toString(mcc);
        } catch (SecurityException e) {
            this.mAPI_state[18] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getMNC() {
        this.mAPI_state[19] = -1;
        try {
            String networkOperator = this.mTelephonyManager.getNetworkOperator();
            this.mAPI_state[19] = CONFIGURATION_DEFAULT_VALUE;
            if (networkOperator != null && networkOperator.length() >= SILENT_PERIOD_DEFAULT_VALUE) {
                return networkOperator.substring(SILENT_PERIOD_DEFAULT_VALUE);
            }
            int mnc = this.mContext.getResources().getConfiguration().mnc;
            if (mnc == 0) {
                return null;
            }
            return Integer.toString(mnc);
        } catch (SecurityException e) {
            this.mAPI_state[19] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getDeviceModel() {
        this.mAPI_state[5] = CONFIGURATION_DEFAULT_VALUE;
        return Build.MODEL;
    }

    boolean isMultitaskingSupported() {
        this.mAPI_state[6] = CONFIGURATION_DEFAULT_VALUE;
        return true;
    }

    String getDeviceName() {
        this.mAPI_state[7] = CONFIGURATION_DEFAULT_VALUE;
        try {
            BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
            if (adapter != null) {
                String name = adapter.getName();
                if (!TextUtils.isEmpty(name)) {
                    return name;
                }
            }
        } catch (SecurityException e) {
        }
        String result = Build.DEVICE;
        if (result.equals(getDeviceModel())) {
            return null;
        }
        return result;
    }

    String getDeviceSystemName() {
        this.mAPI_state[8] = CONFIGURATION_DEFAULT_VALUE;
        return "Android";
    }

    String getDeviceSystemVersion() {
        this.mAPI_state[9] = CONFIGURATION_DEFAULT_VALUE;
        return BuildConfig.FLAVOR + VERSION.SDK_INT;
    }

    int isRootedDevice() {
        this.mAPI_state[21] = CONFIGURATION_DEFAULT_VALUE;
        return RootedDeviceChecker.isDeviceRooted(this.mContext);
    }

    int isEmulator() {
        this.mAPI_state[MAX_API_ID] = CONFIGURATION_DEFAULT_VALUE;
        return this.mEmulatorDetection.isEmulator();
    }

    String getWiFiNetworksData(WiFiNetworksData buffer) {
        this.mAPI_state[12] = -1;
        try {
            buffer.set(((WifiManager) this.mContext.getSystemService("wifi")).getConnectionInfo());
            this.mAPI_state[12] = CONFIGURATION_DEFAULT_VALUE;
            return buffer.toString();
        } catch (SecurityException e) {
            this.mAPI_state[12] = COLLECT_DEVICE_DATA_ONLY;
            buffer.setNoPermission();
            Log.e(TAG, e.toString());
            return null;
        }
    }

    String getCellTowerId() {
        this.mAPI_state[13] = -1;
        try {
            CellLocation cl = this.mTelephonyManager.getCellLocation();
            String result = null;
            if (cl instanceof GsmCellLocation) {
                result = Integer.toString(((GsmCellLocation) cl).getCid());
            } else if (cl instanceof CdmaCellLocation) {
                result = Integer.toString(((CdmaCellLocation) cl).getBaseStationId());
            }
            this.mAPI_state[13] = CONFIGURATION_DEFAULT_VALUE;
            return result;
        } catch (SecurityException e) {
            this.mAPI_state[13] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getLocationAreaCode() {
        this.mAPI_state[14] = -1;
        try {
            CellLocation cl = this.mTelephonyManager.getCellLocation();
            if (!(cl instanceof GsmCellLocation)) {
                return null;
            }
            this.mAPI_state[14] = CONFIGURATION_DEFAULT_VALUE;
            return Integer.toString(((GsmCellLocation) cl).getLac());
        } catch (SecurityException e) {
            this.mAPI_state[14] = COLLECT_DEVICE_DATA_ONLY;
            Log.e(TAG, e.toString());
            return RESULT_NO_PERMISSIONS;
        }
    }

    String getRsaApplicationKey() {
        return ApplicationKey.getApplicationKey(this.mContext);
    }

    String getOsId() {
        this.mAPI_state[20] = CONFIGURATION_DEFAULT_VALUE;
        return Secure.getString(this.mContext.getContentResolver(), "android_id");
    }

    int getError(int api_id) {
        if (api_id < 0 || api_id >= this.mAPI_state.length) {
            return -1;
        }
        return this.mAPI_state[api_id];
    }

    public synchronized String collectInfo() {
        Log.i(TAG, N_RSA.collectInfo);
        if (this.mDeviceInfo == null) {
            throw new IllegalStateException("Mobile SDK was not initialized");
        }
        return this.mDeviceInfo.toJSONString(this.mAddTimestamp, this.mCustomValues);
    }

    public synchronized void destroy() {
        Log.i(TAG, "destroy");
        stopLocations();
        destroySDK();
        stopLooper();
    }

    private void stopLooper() {
        if (this.looperStatus.equals(LooperStatus.LooperCreated)) {
            Looper.myLooper().quit();
            this.looperStatus = LooperStatus.LooperMissing;
        }
    }

    private void destroySDK() {
        if (this.mDeviceInfo != null) {
            this.mDeviceInfo.resetData();
            this.mDeviceInfo = null;
        }
        this.mCustomValues.clear();
        if (this.mEmulatorDetection != null) {
            this.mEmulatorDetection = null;
        }
    }

    private void stopLocations() {
        if (this.mLocationRetriever != null) {
            this.mLocationRetriever.release();
            this.mLocationRetriever = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean addCustomElement(com.rsa.mobilesdk.sdk.MobileAPI.CustomElementType r4, java.lang.String r5, java.lang.Object r6) {
        /*
        r3 = this;
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0 = 0;
        monitor-enter(r3);
        r1 = r6 instanceof java.lang.Integer;	 Catch:{ all -> 0x0043 }
        if (r1 == 0) goto L_0x000e;
    L_0x0008:
        r1 = com.rsa.mobilesdk.sdk.MobileAPI.CustomElementType.INT;	 Catch:{ all -> 0x0043 }
        if (r4 == r1) goto L_0x0016;
    L_0x000c:
        monitor-exit(r3);
        return r0;
    L_0x000e:
        r1 = r6 instanceof java.lang.Boolean;	 Catch:{ all -> 0x0043 }
        if (r1 == 0) goto L_0x001d;
    L_0x0012:
        r1 = com.rsa.mobilesdk.sdk.MobileAPI.CustomElementType.BOOLEAN;	 Catch:{ all -> 0x0043 }
        if (r4 != r1) goto L_0x000c;
    L_0x0016:
        r0 = r3.mCustomValues;	 Catch:{ all -> 0x0043 }
        r0.put(r5, r6);	 Catch:{ all -> 0x0043 }
        r0 = 1;
        goto L_0x000c;
    L_0x001d:
        r1 = r6 instanceof java.lang.String;	 Catch:{ all -> 0x0043 }
        if (r1 == 0) goto L_0x003a;
    L_0x0021:
        r1 = com.rsa.mobilesdk.sdk.MobileAPI.CustomElementType.STRING;	 Catch:{ all -> 0x0043 }
        if (r4 != r1) goto L_0x000c;
    L_0x0025:
        r1 = r6.toString();	 Catch:{ all -> 0x0043 }
        r1 = r1.length();	 Catch:{ all -> 0x0043 }
        if (r1 > r2) goto L_0x000c;
    L_0x002f:
        r1 = r5.toString();	 Catch:{ all -> 0x0043 }
        r1 = r1.length();	 Catch:{ all -> 0x0043 }
        if (r1 <= r2) goto L_0x0016;
    L_0x0039:
        goto L_0x000c;
    L_0x003a:
        r1 = r6 instanceof java.lang.Float;	 Catch:{ all -> 0x0043 }
        if (r1 == 0) goto L_0x000c;
    L_0x003e:
        r1 = com.rsa.mobilesdk.sdk.MobileAPI.CustomElementType.FLOAT;	 Catch:{ all -> 0x0043 }
        if (r4 == r1) goto L_0x0016;
    L_0x0042:
        goto L_0x000c;
    L_0x0043:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rsa.mobilesdk.sdk.MobileAPI.addCustomElement(com.rsa.mobilesdk.sdk.MobileAPI$CustomElementType, java.lang.String, java.lang.Object):boolean");
    }
}
