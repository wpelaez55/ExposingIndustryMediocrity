package com.osesame.android.scanner;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class OsesameAutoScannerActivity extends Activity implements OsesameConstants {
    private static final boolean DEBUG = true;
    private static final int SCANNER_REQUEST = 0;
    private static final String TAG = "Osesame";
    private Class previewScanner;
    private int resolutionThreshold;
    private Class snapScanner;

    public OsesameAutoScannerActivity() {
        this.resolutionThreshold = 1000;
        this.previewScanner = null;
        this.snapScanner = null;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "OsesameAutoScannerActivity start!");
        if (isCameraAvailable()) {
            Intent i = getIntent();
            try {
                String previewName = i.getStringExtra(OsesameConstants.SCAN_PREVIEW);
                if (previewName != null) {
                    this.previewScanner = Class.forName(previewName);
                }
                String snapName = i.getStringExtra(OsesameConstants.SCAN_SNAP);
                if (snapName != null) {
                    this.snapScanner = Class.forName(snapName);
                }
                int threshold = i.getIntExtra(OsesameConstants.SCAN_RESOLUTION_THRESHOLD, this.resolutionThreshold);
                Log.d(TAG, "threshold=" + threshold);
                if (checkResolution(threshold) >= 0) {
                    launchPreviewScanner();
                    return;
                } else {
                    launchSnapScanner();
                    return;
                }
            } catch (ClassNotFoundException e) {
                cancelRequest("Class not found!");
                return;
            }
        }
        cancelRequest("Camera unavailable");
    }

    public int checkResolution(int threshold) {
        try {
            Camera mCamera = Camera.open();
            if (mCamera == null) {
                cancelRequest("Camera request failed");
                return -1;
            }
            List<Size> list = mCamera.getParameters().getSupportedPreviewSizes();
            mCamera.release();
            int index = SCANNER_REQUEST;
            Size res = (Size) list.get(SCANNER_REQUEST);
            int max = Math.max(res.width, res.height);
            for (int i = 1; i < list.size(); i++) {
                res = (Size) list.get(i);
                int size = Math.max(res.width, res.height);
                if (size > max) {
                    max = size;
                    index = i;
                }
            }
            Log.d(TAG, "max=" + max + ", threshold=" + threshold);
            if (max < threshold) {
                return -1;
            }
            return index;
        } catch (Exception e) {
            cancelRequest("Camera request failed");
            return -1;
        }
    }

    public void cancelRequest(String error) {
        Intent dataIntent = new Intent();
        dataIntent.putExtra(OsesameConstants.ERROR_INFO, error);
        setResult(SCANNER_REQUEST, dataIntent);
        finish();
    }

    public void launchPreviewScanner() {
        startActivityForResult(new Intent(this, this.previewScanner), SCANNER_REQUEST);
    }

    public void launchSnapScanner() {
        startActivityForResult(new Intent(this, this.snapScanner), SCANNER_REQUEST);
    }

    public boolean isCameraAvailable() {
        return getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0) {
            setResult(resultCode, data);
        } else {
            Intent dataIntent = new Intent();
            dataIntent.putExtra(OsesameConstants.ERROR_INFO, "Unknown scanner result");
            setResult(SCANNER_REQUEST, dataIntent);
        }
        finish();
    }
}
