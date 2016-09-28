package com.rsa.mobilesdk.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;

class LocationRetriever {
    private static final String TAG = "LocationRetriever";
    private final int LOCATION_UPDATE_MIN_DISTANCE;
    private final int LOCATION_UPDATE_MIN_TIME;
    private final int MESSAGE_SILENCE_EXPIRED;
    private final int MESSAGE_TIMEOUT;
    private long mBestLocationAge_ms;
    private Context mContext;
    private boolean mGPSDenied;
    private LocationProvider mGPSProvider;
    private Location mLastKnownLocation;
    private OnLocationDataChangedListener mLocationDataListener;
    private int mLocationDataStatus;
    private GeoLocationInfo mLocationInfoBuffer;
    private LocationUpdateListener mLocationListener;
    private LocationManager mLocationManager;
    private int mMaxAccuracy;
    private long mMaxLocationAge_ms;
    private long mMaxTimeout_ms;
    private boolean mNetworkDenied;
    private LocationProvider mNetworkProvider;
    private SilenceExpiredHandler mSilenceExpiredHandler;
    private long mSilentPeriod_ms;
    private TimeoutHandler mTimeoutHandler;

    private class LocationUpdateListener implements LocationListener {
        private LocationUpdateListener() {
        }

        public void onLocationChanged(Location location) {
            Log.i(LocationRetriever.TAG, "onLocationChanged");
            LocationRetriever.this.resolveLocation(location);
            if (LocationRetriever.this.matchesTerminateConditions(LocationRetriever.this.mLastKnownLocation)) {
                LocationRetriever.this.cancelAllRequests();
                LocationRetriever.this.stopTimeoutHandler();
                LocationRetriever.this.startSilenceHandler();
                LocationRetriever.this.mLocationDataStatus = 0;
            }
            LocationRetriever.this.putResult();
        }

        public void onProviderDisabled(String arg0) {
        }

        public void onProviderEnabled(String arg0) {
        }

        public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
        }
    }

    interface OnLocationDataChangedListener {
        void onLocationDataChanged();
    }

    private static class SilenceExpiredHandler extends Handler {
        private WeakReference<LocationRetriever> ref;

        public SilenceExpiredHandler(LocationRetriever inRef) {
            this.ref = new WeakReference(inRef);
        }

        public void handleMessage(Message msg) {
            try {
                ((LocationRetriever) this.ref.get()).handleSilenceExpired();
                super.handleMessage(msg);
            } catch (Exception e) {
                Log.d(LocationRetriever.TAG, "release mode, SEH skipping.");
            }
        }
    }

    private static class TimeoutHandler extends Handler {
        private WeakReference<LocationRetriever> ref;

        public TimeoutHandler(LocationRetriever inRef) {
            this.ref = new WeakReference(inRef);
        }

        public void handleMessage(Message msg) {
            try {
                ((LocationRetriever) this.ref.get()).handleTimeout();
                super.handleMessage(msg);
            } catch (Exception e) {
                Log.d(LocationRetriever.TAG, "release mode, TOH skipping.");
            }
        }
    }

    LocationRetriever() {
        this.MESSAGE_TIMEOUT = 1200;
        this.MESSAGE_SILENCE_EXPIRED = 1201;
        this.LOCATION_UPDATE_MIN_TIME = 30000;
        this.LOCATION_UPDATE_MIN_DISTANCE = 10;
        this.mLocationManager = null;
        this.mGPSProvider = null;
        this.mNetworkProvider = null;
        this.mContext = null;
        this.mMaxTimeout_ms = 0;
        this.mBestLocationAge_ms = 0;
        this.mMaxLocationAge_ms = 0;
        this.mMaxAccuracy = 0;
        this.mSilentPeriod_ms = 0;
        this.mLastKnownLocation = null;
        this.mLocationListener = null;
        this.mLocationDataStatus = 0;
        this.mLocationDataListener = null;
        this.mTimeoutHandler = new TimeoutHandler(this);
        this.mSilenceExpiredHandler = new SilenceExpiredHandler(this);
    }

    void queryLocation(Context context, long timeout_minutes, long silencePeriod_minutes, long bestLocationAgeMinutes, long maxLocationAgeDays, int maxAccuracy, GeoLocationInfo locationInfoBuffer, OnLocationDataChangedListener locDataChangeListener) {
        Log.i(TAG, "queryLocation");
        if (locationInfoBuffer == null) {
            Log.e(TAG, "mobile SDK: internal problem, queryLocation, null locationInfoBuffer");
            return;
        }
        this.mLocationDataStatus = 0;
        this.mGPSDenied = false;
        this.mNetworkDenied = false;
        this.mContext = context;
        this.mLocationInfoBuffer = locationInfoBuffer;
        this.mLocationDataListener = locDataChangeListener;
        this.mLocationManager = (LocationManager) this.mContext.getSystemService("location");
        this.mMaxTimeout_ms = (60 * timeout_minutes) * 1000;
        this.mSilentPeriod_ms = (60 * silencePeriod_minutes) * 1000;
        this.mBestLocationAge_ms = (60 * bestLocationAgeMinutes) * 1000;
        this.mMaxLocationAge_ms = ((24 * maxLocationAgeDays) * 3600) * 1000;
        this.mMaxAccuracy = maxAccuracy;
        try {
            this.mGPSProvider = this.mLocationManager.getProvider("gps");
        } catch (SecurityException e) {
            this.mGPSDenied = true;
        }
        if (this.mGPSProvider != null) {
            if (!this.mLocationManager.isProviderEnabled("gps")) {
                this.mGPSDenied = true;
            }
            try {
                resolveLocation(this.mLocationManager.getLastKnownLocation("gps"));
            } catch (SecurityException e2) {
                this.mGPSDenied = true;
            }
        } else {
            this.mLocationDataStatus = 4;
        }
        try {
            this.mNetworkProvider = this.mLocationManager.getProvider("network");
            if (!this.mLocationManager.isProviderEnabled("network")) {
                this.mNetworkDenied = true;
            }
            resolveLocation(this.mLocationManager.getLastKnownLocation("network"));
        } catch (SecurityException e3) {
            this.mNetworkDenied = true;
        }
        if (this.mGPSDenied && this.mNetworkDenied) {
            this.mLocationDataStatus = 1;
        }
        putResult();
        startLocationUpdate();
    }

    private void startLocationUpdate() {
        Log.i(TAG, "startLocationUpdate");
        boolean started = false;
        this.mNetworkDenied = false;
        this.mGPSDenied = false;
        try {
            this.mGPSProvider = this.mLocationManager.getProvider("gps");
        } catch (SecurityException e) {
            this.mGPSDenied = true;
        }
        if (this.mGPSProvider != null) {
            if (this.mLocationManager.isProviderEnabled("gps")) {
                this.mLocationManager.requestLocationUpdates("gps", 30000, 10.0f, getUpdateListener(), Looper.getMainLooper());
                started = true;
            } else {
                this.mGPSDenied = true;
            }
        }
        try {
            this.mNetworkProvider = this.mLocationManager.getProvider("network");
        } catch (SecurityException e2) {
            this.mNetworkDenied = true;
        }
        if (this.mNetworkProvider == null || !this.mLocationManager.isProviderEnabled("network")) {
            this.mNetworkDenied = true;
        } else {
            this.mLocationManager.requestLocationUpdates("network", 30000, 10.0f, getUpdateListener(), Looper.getMainLooper());
            started = true;
        }
        if (this.mGPSDenied && this.mNetworkDenied) {
            this.mLocationDataStatus = 1;
        }
        if (started) {
            startTimeoutHandler();
        }
    }

    private LocationUpdateListener getUpdateListener() {
        if (this.mLocationListener == null) {
            this.mLocationListener = new LocationUpdateListener();
        }
        return this.mLocationListener;
    }

    private void putResult() {
        Log.i(TAG, "putResult");
        this.mLocationInfoBuffer.set(this.mLastKnownLocation, this.mLocationDataStatus);
        if (this.mLocationDataListener != null) {
            this.mLocationDataListener.onLocationDataChanged();
        }
    }

    private void cancelAllRequests() {
        Log.i(TAG, "cancelAllRequests");
        if (this.mLocationManager != null && this.mLocationListener != null) {
            this.mLocationManager.removeUpdates(this.mLocationListener);
        }
    }

    private synchronized void resolveLocation(Location newLocation) {
        this.mLastKnownLocation = getBetterLocation(this.mLastKnownLocation, newLocation);
    }

    private boolean isLocationOk(Location location) {
        if (location == null || System.currentTimeMillis() - location.getTime() >= this.mMaxLocationAge_ms) {
            return false;
        }
        return true;
    }

    private Location getBetterLocation(Location loc1, Location loc2) {
        boolean isLoc1Valid = isLocationOk(loc1);
        boolean isLoc2Valid = isLocationOk(loc2);
        if (!isLoc1Valid && !isLoc2Valid) {
            return null;
        }
        if (isLoc1Valid && isLoc2Valid) {
            long currTime = System.currentTimeMillis();
            long loc1Age = currTime - loc1.getTime();
            long loc2Age = currTime - loc2.getTime();
            if (loc1Age >= this.mBestLocationAge_ms || loc2Age >= this.mBestLocationAge_ms) {
                if (loc1Age < this.mBestLocationAge_ms) {
                    return loc1;
                }
                if (loc2Age < this.mBestLocationAge_ms) {
                    return loc2;
                }
                if (loc1Age < loc2Age) {
                    return loc1;
                }
                return loc2;
            } else if (loc1.getAccuracy() < loc2.getAccuracy()) {
                return loc1;
            } else {
                return loc2;
            }
        } else if (isLoc1Valid) {
            return loc1;
        } else {
            if (isLoc2Valid) {
                return loc2;
            }
            return null;
        }
    }

    private boolean matchesTerminateConditions(Location location) {
        if (location == null || System.currentTimeMillis() - location.getTime() >= this.mBestLocationAge_ms || location.getAccuracy() > ((float) this.mMaxAccuracy)) {
            return false;
        }
        return true;
    }

    private void handleTimeout() {
        Log.i(TAG, "handleTimeout");
        stopTimeoutHandler();
        stopSilenceHandler();
        this.mLocationDataStatus = 3;
        cancelAllRequests();
        putResult();
        startSilenceHandler();
    }

    private void handleSilenceExpired() {
        Log.i(TAG, "handleSilenceExpired");
        stopTimeoutHandler();
        stopSilenceHandler();
        this.mLocationDataStatus = 0;
        startLocationUpdate();
    }

    private void startTimeoutHandler() {
        stopTimeoutHandler();
        this.mTimeoutHandler.sendEmptyMessageDelayed(1200, this.mMaxTimeout_ms);
    }

    private void stopTimeoutHandler() {
        if (this.mTimeoutHandler.hasMessages(1200)) {
            this.mTimeoutHandler.removeMessages(1200);
        }
    }

    private void startSilenceHandler() {
        stopSilenceHandler();
        this.mSilenceExpiredHandler.sendEmptyMessageDelayed(1201, this.mSilentPeriod_ms);
    }

    private void stopSilenceHandler() {
        if (this.mSilenceExpiredHandler.hasMessages(1201)) {
            this.mSilenceExpiredHandler.removeMessages(1201);
        }
    }

    void release() {
        stopTimeoutHandler();
        stopSilenceHandler();
        cancelAllRequests();
        this.mLocationManager = null;
        this.mGPSProvider = null;
        this.mNetworkProvider = null;
        this.mLocationDataListener = null;
        this.mLocationListener = null;
    }
}
