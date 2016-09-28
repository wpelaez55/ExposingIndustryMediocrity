package com.rsa.mobilesdk.sdk;

import android.location.Location;
import android.net.wifi.WifiInfo;
import java.util.Date;

class DeviceInfo {
    public static final int LOCATION_STATUS_DENY = 1;
    public static final int LOCATION_STATUS_NOT_AVAILABLE = 2;
    public static final int LOCATION_STATUS_NOT_SUPPORTED = 4;
    public static final int LOCATION_STATUS_SUCCESS = 0;
    public static final int LOCATION_STATUS_TIMEOUT = 3;
    Date collectionTimeStamp;
    String mCellTowerId;
    private int mConfiguration;
    String mDeviceModel;
    boolean mDeviceMultitaskingSupported;
    String mDeviceName;
    String mDeviceSystemName;
    String mDeviceSystemVersion;
    int mEmulator;
    GeoLocationInfo mGeoLocation;
    String mHardwareId;
    String mLanguage;
    String mLocationAreaCode;
    String mMCC;
    String mMNC;
    String mOS_ID;
    String mPhoneNumber;
    String mRSA_ApplicationKey;
    int mRooted;
    String mScreenSize;
    String mSim_Id;
    String mVendor_ClientID;
    WiFiNetworksData mWfNetworksData;
    String mWiFiMACAddress;

    class GeoLocationInfo {
        public double mAltitude;
        public double mAltitudeAccuracy;
        public boolean mAltitudeAccuracyAvailable;
        public boolean mAltitudeAvailable;
        public double mHeading;
        public boolean mHeadingAvailable;
        public double mHorizontalAccuracy;
        public boolean mHorizontalAccuracyAvailable;
        public double mLatitude;
        public boolean mLatitudeAvailable;
        public int mLocationDataStatus;
        public double mLongitude;
        public boolean mLongitudeAvailable;
        public double mSpeed;
        public boolean mSpeedAvailable;
        public long mTimestamp;

        GeoLocationInfo() {
        }

        void clearValues() {
            this.mLongitudeAvailable = false;
            this.mLatitudeAvailable = false;
            this.mHorizontalAccuracyAvailable = false;
            this.mAltitudeAvailable = false;
            this.mAltitudeAccuracyAvailable = false;
            this.mTimestamp = 0;
            this.mHeadingAvailable = false;
            this.mSpeedAvailable = false;
        }

        void set(Location location, int status) {
            clearValues();
            this.mLocationDataStatus = status;
            if (location != null) {
                this.mLatitude = location.getLatitude();
                this.mLatitudeAvailable = true;
                this.mLongitude = location.getLongitude();
                this.mLongitudeAvailable = true;
                if (location.hasAccuracy()) {
                    this.mHorizontalAccuracy = (double) location.getAccuracy();
                    this.mHorizontalAccuracyAvailable = true;
                }
                if (location.hasAltitude()) {
                    this.mAltitude = location.getAltitude();
                    this.mAltitudeAvailable = true;
                    if (location.hasAccuracy()) {
                        this.mAltitudeAccuracy = (double) location.getAccuracy();
                        this.mAltitudeAccuracyAvailable = true;
                    }
                }
                if (location.hasBearing()) {
                    this.mHeading = (double) location.getBearing();
                    this.mHeadingAvailable = true;
                }
                if (location.hasSpeed()) {
                    this.mSpeed = (double) location.getSpeed();
                    this.mSpeedAvailable = true;
                }
                this.mTimestamp = location.getTime();
            }
        }
    }

    public class WiFiNetworksData {
        public String mBBSID;
        public String mChannel;
        public String mSSID;
        public int mSignalStrength;
        public String mStationName;

        public WiFiNetworksData() {
            this.mStationName = null;
            this.mBBSID = null;
            this.mSignalStrength = DeviceInfo.LOCATION_STATUS_SUCCESS;
            this.mChannel = null;
            this.mSSID = null;
        }

        public void set(WifiInfo info) {
            this.mStationName = null;
            this.mBBSID = info.getBSSID();
            this.mSignalStrength = info.getRssi();
            this.mChannel = null;
            this.mSSID = info.getSSID();
            if (this.mSSID == null) {
                return;
            }
            if (this.mSSID.contains("<") || this.mSSID.contains(">") || this.mSSID.equalsIgnoreCase("0x")) {
                this.mSSID = null;
            }
        }

        public void setNoPermission() {
            this.mStationName = "-1";
            this.mBBSID = "-1";
            this.mSignalStrength = -1;
            this.mChannel = "-1";
            this.mSSID = "-1";
        }

        public void reset() {
            this.mStationName = null;
            this.mBBSID = null;
            this.mSignalStrength = DeviceInfo.LOCATION_STATUS_SUCCESS;
            this.mChannel = null;
            this.mSSID = null;
        }

        public String toString() {
            StringBuffer buffer = new StringBuffer();
            buffer.append("Station Name: ");
            buffer.append(Utils.getStringVal(this.mStationName));
            buffer.append("\n");
            buffer.append("BBSID: ");
            buffer.append(Utils.getStringVal(this.mBBSID));
            buffer.append("\n");
            buffer.append("Signal Strength: ");
            buffer.append(this.mSignalStrength);
            buffer.append("\n");
            buffer.append("Channel: ");
            buffer.append(Utils.getStringVal(this.mChannel));
            buffer.append("\n");
            buffer.append("SSID: ");
            buffer.append(Utils.getStringVal(this.mSSID));
            buffer.append("\n");
            return buffer.toString();
        }
    }

    public DeviceInfo(int configuration) {
        this.collectionTimeStamp = null;
        this.mHardwareId = null;
        this.mSim_Id = null;
        this.mPhoneNumber = null;
        this.mGeoLocation = null;
        this.mDeviceModel = null;
        this.mDeviceMultitaskingSupported = false;
        this.mDeviceName = null;
        this.mDeviceSystemName = null;
        this.mDeviceSystemVersion = null;
        this.mLanguage = null;
        this.mWiFiMACAddress = null;
        this.mWfNetworksData = null;
        this.mCellTowerId = null;
        this.mLocationAreaCode = null;
        this.mScreenSize = null;
        this.mRSA_ApplicationKey = null;
        this.mVendor_ClientID = null;
        this.mMCC = null;
        this.mMNC = null;
        this.mOS_ID = null;
        if (configuration == LOCATION_STATUS_NOT_AVAILABLE) {
            this.mGeoLocation = new GeoLocationInfo();
            this.mWfNetworksData = new WiFiNetworksData();
        }
        this.mConfiguration = configuration;
    }

    public void resetData() {
        if (this.mGeoLocation != null) {
            this.mGeoLocation.clearValues();
        }
        if (this.mWfNetworksData != null) {
            this.mWfNetworksData.reset();
        }
    }

    private String removeXMLInvalid(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = LOCATION_STATUS_SUCCESS; i < str.length(); i += LOCATION_STATUS_DENY) {
            char originalChar = str.charAt(i);
            if (!(originalChar == '\"' || originalChar == '&' || originalChar == '<' || originalChar == '>' || originalChar == '\'')) {
                sb.append(originalChar);
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toJSONString(boolean r21, java.util.HashMap<java.lang.String, java.lang.Object> r22) {
        /*
        r20 = this;
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0600 }
        r10.<init>();	 Catch:{ JSONException -> 0x0600 }
        if (r21 == 0) goto L_0x0020;
    L_0x0007:
        r0 = r20;
        r0 = r0.collectionTimeStamp;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r12 = com.rsa.mobilesdk.sdk.Utils.covertDateToISO8601(r16);	 Catch:{ JSONException -> 0x0600 }
        r16 = "TIMESTAMP";
        r0 = r20;
        r17 = r0.removeXMLInvalid(r12);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0020:
        r0 = r20;
        r0 = r0.mHardwareId;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x003f;
    L_0x0028:
        r16 = "HardwareID";
        r0 = r20;
        r0 = r0.mHardwareId;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x003f:
        r0 = r20;
        r0 = r0.mSim_Id;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x005e;
    L_0x0047:
        r16 = "SIM_ID";
        r0 = r20;
        r0 = r0.mSim_Id;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x005e:
        r0 = r20;
        r0 = r0.mPhoneNumber;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x007d;
    L_0x0066:
        r16 = "PhoneNumber";
        r0 = r20;
        r0 = r0.mPhoneNumber;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x007d:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x02e0;
    L_0x0085:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mLocationDataStatus;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x0093:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mLongitudeAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x00a1:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mLatitudeAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x00af:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mHeadingAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x00bd:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mSpeedAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x00cb:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mHorizontalAccuracyAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x00d9:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mAltitudeAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x00e7:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mAltitudeAccuracyAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 != 0) goto L_0x0103;
    L_0x00f5:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r17 = 2;
        r0 = r17;
        r1 = r16;
        r1.mLocationDataStatus = r0;	 Catch:{ JSONException -> 0x0600 }
    L_0x0103:
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0600 }
        r6.<init>();	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mLongitudeAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x012f;
    L_0x0116:
        r16 = "Longitude";
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r17;
        r0 = r0.mLongitude;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r17 = com.rsa.mobilesdk.sdk.Utils.getDoubleString(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x012f:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mLatitudeAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0156;
    L_0x013d:
        r16 = "Latitude";
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r17;
        r0 = r0.mLatitude;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r17 = com.rsa.mobilesdk.sdk.Utils.getDoubleString(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0156:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mHorizontalAccuracyAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0195;
    L_0x0164:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mHorizontalAccuracy;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r16 = java.lang.Math.round(r16);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r8 = (int) r0;	 Catch:{ JSONException -> 0x0600 }
        r16 = "HorizontalAccuracy";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r17;
        r17 = r0.append(r8);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0195:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mAltitudeAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x01d4;
    L_0x01a3:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mAltitude;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r16 = java.lang.Math.round(r16);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r3 = (int) r0;	 Catch:{ JSONException -> 0x0600 }
        r16 = "Altitude";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r17;
        r17 = r0.append(r3);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x01d4:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mAltitudeAccuracyAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0213;
    L_0x01e2:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mAltitudeAccuracy;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r16 = java.lang.Math.round(r16);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r2 = (int) r0;	 Catch:{ JSONException -> 0x0600 }
        r16 = "AltitudeAccuracy";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r17;
        r17 = r0.append(r2);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0213:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r14 = r0.mTimestamp;	 Catch:{ JSONException -> 0x0600 }
        r16 = "Timestamp";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r17;
        r17 = r0.append(r14);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mHeadingAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x026a;
    L_0x0251:
        r16 = "Heading";
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r17;
        r0 = r0.mHeading;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r17 = com.rsa.mobilesdk.sdk.Utils.getDoubleString(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x026a:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mSpeedAvailable;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x02a9;
    L_0x0278:
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mSpeed;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r16 = java.lang.Math.round(r16);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r11 = (int) r0;	 Catch:{ JSONException -> 0x0600 }
        r16 = "Speed";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r17;
        r17 = r0.append(r11);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x02a9:
        r16 = "Status";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r0 = r0.mGeoLocation;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r0 = r18;
        r0 = r0.mLocationDataStatus;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r6.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        r7 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0600 }
        r7.<init>();	 Catch:{ JSONException -> 0x0600 }
        r7.put(r6);	 Catch:{ JSONException -> 0x0600 }
        r16 = "GeoLocationInfo";
        r0 = r16;
        r10.put(r0, r7);	 Catch:{ JSONException -> 0x0600 }
    L_0x02e0:
        r0 = r20;
        r0 = r0.mDeviceModel;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x02ff;
    L_0x02e8:
        r16 = "DeviceModel";
        r0 = r20;
        r0 = r0.mDeviceModel;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x02ff:
        r0 = r20;
        r0 = r0.mConfiguration;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r17 = 1;
        r0 = r16;
        r1 = r17;
        if (r0 == r1) goto L_0x031b;
    L_0x030d:
        r0 = r20;
        r0 = r0.mConfiguration;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r17 = 2;
        r0 = r16;
        r1 = r17;
        if (r0 != r1) goto L_0x032a;
    L_0x031b:
        r16 = "MultitaskingSupported";
        r0 = r20;
        r0 = r0.mDeviceMultitaskingSupported;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x032a:
        r0 = r20;
        r0 = r0.mDeviceName;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0349;
    L_0x0332:
        r16 = "DeviceName";
        r0 = r20;
        r0 = r0.mDeviceName;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0349:
        r0 = r20;
        r0 = r0.mDeviceSystemName;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0368;
    L_0x0351:
        r16 = "DeviceSystemName";
        r0 = r20;
        r0 = r0.mDeviceSystemName;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0368:
        r0 = r20;
        r0 = r0.mDeviceSystemVersion;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0387;
    L_0x0370:
        r16 = "DeviceSystemVersion";
        r0 = r20;
        r0 = r0.mDeviceSystemVersion;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0387:
        r0 = r20;
        r0 = r0.mLanguage;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x03a6;
    L_0x038f:
        r16 = "Languages";
        r0 = r20;
        r0 = r0.mLanguage;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x03a6:
        r0 = r20;
        r0 = r0.mWiFiMACAddress;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x03c5;
    L_0x03ae:
        r16 = "WiFiMacAddress";
        r0 = r20;
        r0 = r0.mWiFiMACAddress;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x03c5:
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x04b8;
    L_0x03cd:
        r13 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0600 }
        r13.<init>();	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mStationName;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x03fd;
    L_0x03e0:
        r16 = "StationName";
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r17;
        r0 = r0.mStationName;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r13.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x03fd:
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mBBSID;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0428;
    L_0x040b:
        r16 = "BBSID";
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r17;
        r0 = r0.mBBSID;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r13.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0428:
        r16 = "SignalStrength";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r0 = r18;
        r0 = r0.mSignalStrength;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r13.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        r16 = "Channel";
        r17 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0600 }
        r17.<init>();	 Catch:{ JSONException -> 0x0600 }
        r18 = "";
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r0 = r18;
        r0 = r0.mChannel;	 Catch:{ JSONException -> 0x0600 }
        r18 = r0;
        r0 = r20;
        r1 = r18;
        r18 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.append(r18);	 Catch:{ JSONException -> 0x0600 }
        r17 = r17.toString();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r13.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        r0 = r16;
        r0 = r0.mSSID;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x04ab;
    L_0x048e:
        r16 = "SSID";
        r0 = r20;
        r0 = r0.mWfNetworksData;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r17;
        r0 = r0.mSSID;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r13.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x04ab:
        r16 = r13.length();	 Catch:{ JSONException -> 0x0600 }
        if (r16 <= 0) goto L_0x04b8;
    L_0x04b1:
        r16 = "WiFiNetworksData";
        r0 = r16;
        r10.put(r0, r13);	 Catch:{ JSONException -> 0x0600 }
    L_0x04b8:
        r0 = r20;
        r0 = r0.mCellTowerId;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x04d7;
    L_0x04c0:
        r16 = "CellTowerId";
        r0 = r20;
        r0 = r0.mCellTowerId;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x04d7:
        r0 = r20;
        r0 = r0.mLocationAreaCode;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x04f6;
    L_0x04df:
        r16 = "LocationAreaCode";
        r0 = r20;
        r0 = r0.mLocationAreaCode;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x04f6:
        r0 = r20;
        r0 = r0.mScreenSize;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0515;
    L_0x04fe:
        r16 = "ScreenSize";
        r0 = r20;
        r0 = r0.mScreenSize;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0515:
        r0 = r20;
        r0 = r0.mRSA_ApplicationKey;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0534;
    L_0x051d:
        r16 = "RSA_ApplicationKey";
        r0 = r20;
        r0 = r0.mRSA_ApplicationKey;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0534:
        r0 = r20;
        r0 = r0.mMCC;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0553;
    L_0x053c:
        r16 = "MCC";
        r0 = r20;
        r0 = r0.mMCC;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0553:
        r0 = r20;
        r0 = r0.mMNC;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0572;
    L_0x055b:
        r16 = "MNC";
        r0 = r20;
        r0 = r0.mMNC;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0572:
        r0 = r20;
        r0 = r0.mOS_ID;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0591;
    L_0x057a:
        r16 = "OS_ID";
        r0 = r20;
        r0 = r0.mOS_ID;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
    L_0x0591:
        r16 = "SDK_VERSION";
        r17 = "3.5.0";
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        r16 = "Compromised";
        r0 = r20;
        r0 = r0.mRooted;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        r16 = "Emulator";
        r0 = r20;
        r0 = r0.mEmulator;	 Catch:{ JSONException -> 0x0600 }
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        if (r22 == 0) goto L_0x062b;
    L_0x05c4:
        r16 = r22.entrySet();	 Catch:{ JSONException -> 0x0600 }
        r9 = r16.iterator();	 Catch:{ JSONException -> 0x0600 }
    L_0x05cc:
        r16 = r9.hasNext();	 Catch:{ JSONException -> 0x0600 }
        if (r16 == 0) goto L_0x062b;
    L_0x05d2:
        r5 = r9.next();	 Catch:{ JSONException -> 0x0600 }
        r5 = (java.util.Map.Entry) r5;	 Catch:{ JSONException -> 0x0600 }
        r16 = r5.getValue();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r0 = r0 instanceof java.lang.String;	 Catch:{ JSONException -> 0x0600 }
        r16 = r0;
        if (r16 == 0) goto L_0x0619;
    L_0x05e4:
        r16 = r5.getKey();	 Catch:{ JSONException -> 0x0600 }
        r16 = (java.lang.String) r16;	 Catch:{ JSONException -> 0x0600 }
        r17 = r5.getValue();	 Catch:{ JSONException -> 0x0600 }
        r17 = (java.lang.String) r17;	 Catch:{ JSONException -> 0x0600 }
        r0 = r20;
        r1 = r17;
        r17 = r0.removeXMLInvalid(r1);	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        goto L_0x05cc;
    L_0x0600:
        r4 = move-exception;
        r16 = new java.lang.StringBuilder;
        r16.<init>();
        r17 = "JSONStringFailure:";
        r16 = r16.append(r17);
        r17 = r4.toString();
        r16 = r16.append(r17);
        r16 = r16.toString();
    L_0x0618:
        return r16;
    L_0x0619:
        r16 = r5.getKey();	 Catch:{ JSONException -> 0x0600 }
        r16 = (java.lang.String) r16;	 Catch:{ JSONException -> 0x0600 }
        r17 = r5.getValue();	 Catch:{ JSONException -> 0x0600 }
        r0 = r16;
        r1 = r17;
        r10.put(r0, r1);	 Catch:{ JSONException -> 0x0600 }
        goto L_0x05cc;
    L_0x062b:
        r16 = 0;
        r0 = r16;
        r16 = r10.toString(r0);	 Catch:{ JSONException -> 0x0600 }
        goto L_0x0618;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rsa.mobilesdk.sdk.DeviceInfo.toJSONString(boolean, java.util.HashMap):java.lang.String");
    }
}
