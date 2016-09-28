package com.kony.barcodescaner;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.ffi.ActivityResultListener;
import com.konylabs.vm.Function;
import com.osesame.android.scanner.OsesameConstants;
import com.rsa.mobilesdk.sdk.BuildConfig;

public class ScanBarcode {
    public static final int SCANNER_REQUEST = 1;
    private static Function callback;
    private static KonyMain konyContext;

    private class ResultListener implements ActivityResultListener {
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            Log.d("KonyBarcode", "On Activity Result.." + requestCode + " resultCode :" + resultCode);
            switch (requestCode) {
                case ScanBarcode.SCANNER_REQUEST /*1*/:
                    if (resultCode == -1) {
                        String scanResult = data.getStringExtra(OsesameConstants.SCAN_RESULT);
                        String scanResultFormat = data.getStringExtra(OsesameConstants.SCAN_RESULT_TYPE);
                        Log.d("KonyBarcode", "ScanResult : " + scanResult);
                        try {
                            ScanBarcode.callback.execute(new Object[]{scanResult, scanResultFormat});
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (resultCode == 0 && data != null) {
                        String error = data.getStringExtra(OsesameConstants.ERROR_INFO);
                        Log.d("KonyBarcode", "ScanError : " + error);
                        try {
                            ScanBarcode.callback.execute(new Object[]{BuildConfig.FLAVOR, BuildConfig.FLAVOR});
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        TextUtils.isEmpty(error);
                    } else if (resultCode == 0 && data == null) {
                        try {
                            ScanBarcode.callback.execute(new Object[]{BuildConfig.FLAVOR, BuildConfig.FLAVOR});
                        } catch (Exception e22) {
                            e22.printStackTrace();
                        }
                        Log.d("KonyBarcode", "ScanError : Data is null");
                    }
                default:
            }
        }
    }

    static {
        callback = null;
    }

    public void scanBarcode(Function cb) {
        callback = cb;
        Log.d("KonyBarcode", "FFI Function called.");
        konyContext = KonyMain.getActivityContext();
        konyContext.registerActivityResultListener(SCANNER_REQUEST, new ResultListener());
        konyContext.startActivityForResult(new Intent(konyContext, Scanner.class), SCANNER_REQUEST);
    }
}
