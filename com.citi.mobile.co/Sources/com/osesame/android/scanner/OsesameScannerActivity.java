package com.osesame.android.scanner;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.security.MessageDigest;
import java.util.Iterator;
import net.sourceforge.zbar.Image;
import net.sourceforge.zbar.Symbol;

public abstract class OsesameScannerActivity extends ScannerActivity implements PreviewCallback, OsesameConstants {
    private static final String TAG = "OsesameScannerActivity";
    AutoFocusCallback autoFocusCB;
    private int cropModeCounter;
    private Runnable doAutoFocus;
    private Handler mAutoFocusHandler;
    private Camera mCamera;
    private CameraPreview mPreview;
    private boolean mPreviewing;

    /* renamed from: com.osesame.android.scanner.OsesameScannerActivity.1 */
    class C02651 implements Runnable {
        C02651() {
        }

        public void run() {
            if (OsesameScannerActivity.this.mCamera != null && OsesameScannerActivity.this.mPreviewing) {
                OsesameScannerActivity.this.mCamera.autoFocus(OsesameScannerActivity.this.autoFocusCB);
            }
        }
    }

    /* renamed from: com.osesame.android.scanner.OsesameScannerActivity.2 */
    class C02662 implements AutoFocusCallback {
        C02662() {
        }

        public void onAutoFocus(boolean success, Camera camera) {
            OsesameScannerActivity.this.mAutoFocusHandler.postDelayed(OsesameScannerActivity.this.doAutoFocus, 1000);
        }
    }

    public abstract void prepareLayout(RelativeLayout relativeLayout);

    public OsesameScannerActivity() {
        this.mPreviewing = true;
        this.doAutoFocus = new C02651();
        this.autoFocusCB = new C02662();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isCameraAvailable()) {
            this.cropModeCounter = 0;
            requestWindowFeature(1);
            getWindow().addFlags(MobileAPI.MAX_CUSTOM_STRING_LENGTH);
            this.mAutoFocusHandler = new Handler();
            setupScanner();
            RelativeLayout mainLayout = new RelativeLayout(this);
            mainLayout.setLayoutParams(new LayoutParams(-1, -1));
            if (customFocusMode() == null) {
                this.mPreview = new CameraPreview(this, this, this.autoFocusCB, customPreviewSize());
            } else {
                this.mPreview = new CameraPreview(this, this, this.autoFocusCB, customPreviewSize(), customFocusMode());
            }
            RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(-1, -1);
            params1.addRule(13);
            mainLayout.addView(this.mPreview, params1);
            if (!checkToken()) {
                RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(-2, -2);
                params2.addRule(13);
                TextView txtDemo = new TextView(this);
                txtDemo.setText("DEMO Version\nFor Evaluation Only.");
                txtDemo.setTextSize(40.0f);
                txtDemo.setTextColor(Color.argb(TransportMediator.FLAG_KEY_MEDIA_NEXT, MotionEventCompat.ACTION_MASK, 0, 0));
                mainLayout.addView(txtDemo, params2);
            }
            prepareLayout(mainLayout);
            setContentView(mainLayout);
            return;
        }
        cancelRequest();
    }

    public int customPreviewSize() {
        return -1;
    }

    public String customFocusMode() {
        return null;
    }

    public int cropMode() {
        return -1;
    }

    public String scanToken() {
        return "DEMO";
    }

    protected boolean checkToken() {
        String clientInitial = scanToken().substring(0, 3);
        if (scanToken().equals(clientInitial + md5(BuildConfig.FLAVOR + clientInitial + "OSE").substring(0, 12))) {
            return true;
        }
        return false;
    }

    protected static final String md5(String toEncrypt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            digest.update(toEncrypt.getBytes());
            byte[] bytes = digest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(bytes[i])}));
            }
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            return BuildConfig.FLAVOR;
        }
    }

    protected void onResume() {
        super.onResume();
        this.mCamera = Camera.open();
        if (this.mCamera == null) {
            cancelRequest();
            return;
        }
        this.mPreview.setCamera(this.mCamera);
        this.mPreview.showSurfaceView();
        this.mPreviewing = true;
    }

    protected void onPause() {
        super.onPause();
        if (this.mCamera != null) {
            this.mPreview.setCamera(null);
            this.mCamera.cancelAutoFocus();
            this.mCamera.setPreviewCallback(null);
            this.mCamera.stopPreview();
            this.mCamera.release();
            this.mPreview.hideSurfaceView();
            this.mPreviewing = false;
            this.mCamera = null;
        }
    }

    public boolean isCameraAvailable() {
        return getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    public void cancelRequest() {
        Intent dataIntent = new Intent();
        dataIntent.putExtra(OsesameConstants.ERROR_INFO, "Camera unavailable");
        setResult(0, dataIntent);
        finish();
    }

    public void onPreviewFrame(byte[] data, Camera camera) {
        Size size = camera.getParameters().getPreviewSize();
        Image barcode = new Image(size.width, size.height, "Y800");
        barcode.setData(data);
        if (cropMode() == 1) {
            barcode.setCrop(0, (size.height / 5) * 2, size.width, size.height / 5);
        } else if (cropMode() == 2) {
            barcode.setCrop(0, size.height / 4, size.width, size.height / 2);
        } else if (cropMode() == 3) {
            if (this.cropModeCounter % 2 == 0) {
                barcode.setCrop(0, (size.height / 5) * 2, size.width, size.height / 5);
                this.cropModeCounter++;
            } else {
                barcode.setCrop(0, size.height / 4, size.width, size.height / 2);
                this.cropModeCounter++;
            }
        } else if (cropMode() == -1) {
        }
        int result = this.mScanner.scanImage(barcode);
        barcode.destroy();
        if (result != 0) {
            this.mCamera.cancelAutoFocus();
            this.mCamera.setPreviewCallback(null);
            this.mCamera.stopPreview();
            this.mPreviewing = false;
            Iterator i$ = this.mScanner.getResults().iterator();
            while (i$.hasNext()) {
                Symbol sym = (Symbol) i$.next();
                String symData = sym.getData();
                if (!TextUtils.isEmpty(symData)) {
                    Intent dataIntent = new Intent();
                    dataIntent.putExtra(OsesameConstants.SCAN_RESULT, symData);
                    dataIntent.putExtra(OsesameConstants.SCAN_RESULT_TYPE, sym.getType());
                    setResult(-1, dataIntent);
                    finish();
                    return;
                }
            }
        }
    }
}
