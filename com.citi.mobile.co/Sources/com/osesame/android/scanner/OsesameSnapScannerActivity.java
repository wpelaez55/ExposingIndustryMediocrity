package com.osesame.android.scanner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.util.Iterator;
import java.util.List;
import net.sourceforge.zbar.Image;
import net.sourceforge.zbar.Symbol;

public abstract class OsesameSnapScannerActivity extends ScannerActivity implements OsesameConstants {
    private static final boolean DEBUG = true;
    private static final String TAG = "OsesameSnapScannerActivity";
    AutoFocusCallback mAutoFocus;
    private Camera mCamera;
    private PictureCallback mPicture;
    private CameraPreview mPreview;
    private boolean mPreviewing;
    private PictureCallback mRawPicture;
    protected int requiredWidth;
    private int soundVolume;

    /* renamed from: com.osesame.android.scanner.OsesameSnapScannerActivity.1 */
    class C02671 implements PictureCallback {
        C02671() {
        }

        public void onPictureTaken(byte[] data, Camera camera) {
            Options opt = new Options();
            opt.inPreferredConfig = Config.ARGB_8888;
            Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length, opt);
            Log.d(OsesameSnapScannerActivity.TAG, "Bitmap Format " + bitmap.getConfig().toString());
            Parameters parameters = camera.getParameters();
            Size size = parameters.getPictureSize();
            Log.d(OsesameSnapScannerActivity.TAG, "Picture Size " + size.width + "x" + size.height);
            Log.d(OsesameSnapScannerActivity.TAG, "Picture Format " + parameters.getPictureFormat());
            Log.d(OsesameSnapScannerActivity.TAG, "Preview Format " + parameters.getPreviewFormat());
            int[] pixels = new int[(size.width * size.height)];
            bitmap.getPixels(pixels, 0, size.width, 0, 0, size.width, size.height);
            byte[] ypixels = new byte[(size.width * size.height)];
            Image barcode = new Image(size.width, size.height, "Y800");
            Log.d(OsesameSnapScannerActivity.TAG, "Img " + barcode);
            for (int y = 0; y < size.height; y++) {
                for (int x = 0; x < size.width; x++) {
                    int i = (size.width * y) + x;
                    int color = pixels[i];
                    int luma = (int) (((0.299d * ((double) ((color >> 16) & MotionEventCompat.ACTION_MASK))) + (0.587d * ((double) ((color >> 8) & MotionEventCompat.ACTION_MASK)))) + (0.114d * ((double) (color & MotionEventCompat.ACTION_MASK))));
                    ypixels[i] = (byte) luma;
                    pixels[i] = (((luma << 8) | luma) | (luma << 16)) | ViewCompat.MEASURED_STATE_MASK;
                }
            }
            barcode.setData(ypixels);
            int result = OsesameSnapScannerActivity.this.mScanner.scanImage(barcode);
            barcode.destroy();
            bitmap.recycle();
            if (result != 0) {
                OsesameSnapScannerActivity.this.mCamera.cancelAutoFocus();
                OsesameSnapScannerActivity.this.mCamera.setPreviewCallback(null);
                OsesameSnapScannerActivity.this.mCamera.stopPreview();
                OsesameSnapScannerActivity.this.mPreviewing = false;
                Iterator i$ = OsesameSnapScannerActivity.this.mScanner.getResults().iterator();
                while (i$.hasNext()) {
                    Symbol sym = (Symbol) i$.next();
                    String symData = sym.getData();
                    if (!TextUtils.isEmpty(symData)) {
                        Intent dataIntent = new Intent();
                        dataIntent.putExtra(OsesameConstants.SCAN_RESULT, symData);
                        dataIntent.putExtra(OsesameConstants.SCAN_RESULT_TYPE, sym.getType());
                        OsesameSnapScannerActivity.this.setResult(-1, dataIntent);
                        OsesameSnapScannerActivity.this.finish();
                        return;
                    }
                }
                return;
            }
            OsesameSnapScannerActivity.this.mCamera.autoFocus(OsesameSnapScannerActivity.this.mAutoFocus);
        }
    }

    /* renamed from: com.osesame.android.scanner.OsesameSnapScannerActivity.2 */
    class C02682 implements PictureCallback {
        C02682() {
        }

        public void onPictureTaken(byte[] data, Camera camera) {
            OsesameSnapScannerActivity.this.mCamera.startPreview();
        }
    }

    /* renamed from: com.osesame.android.scanner.OsesameSnapScannerActivity.3 */
    class C02693 implements AutoFocusCallback {
        C02693() {
        }

        public void onAutoFocus(boolean b, Camera camera) {
            OsesameSnapScannerActivity.this.mCamera.takePicture(null, OsesameSnapScannerActivity.this.mRawPicture, OsesameSnapScannerActivity.this.mPicture);
        }
    }

    public abstract void prepareLayout(RelativeLayout relativeLayout);

    public OsesameSnapScannerActivity() {
        this.requiredWidth = 1600;
        this.mPreviewing = DEBUG;
        this.mPicture = new C02671();
        this.mRawPicture = new C02682();
        this.mAutoFocus = new C02693();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isCameraAvailable()) {
            requestWindowFeature(1);
            getWindow().addFlags(MobileAPI.MAX_CUSTOM_STRING_LENGTH);
            setupScanner();
            RelativeLayout mainLayout = new RelativeLayout(this);
            mainLayout.setLayoutParams(new LayoutParams(-1, -1));
            this.mPreview = new CameraPreview(this, null, this.mAutoFocus);
            RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(-1, -1);
            params1.addRule(13);
            mainLayout.addView(this.mPreview, params1);
            prepareLayout(mainLayout);
            setContentView(mainLayout);
            return;
        }
        cancelRequest();
    }

    protected Size selectedPictureSize(List<Size> sizeList) {
        int min = Integer.MAX_VALUE;
        Size result = null;
        for (int i = 0; i < sizeList.size(); i++) {
            Size s = (Size) sizeList.get(i);
            int diff = s.width - this.requiredWidth;
            if (diff >= 0 && diff < min) {
                min = diff;
                result = s;
            }
        }
        return result;
    }

    protected void onResume() {
        super.onResume();
        this.mCamera = Camera.open();
        if (this.mCamera == null) {
            cancelRequest();
            return;
        }
        Parameters params = this.mCamera.getParameters();
        Size picSize = selectedPictureSize(params.getSupportedPictureSizes());
        if (picSize == null) {
            cancelRequest();
            return;
        }
        params.setPictureSize(picSize.width, picSize.height);
        this.mCamera.setParameters(params);
        this.mPreview.setCamera(this.mCamera);
        this.mPreview.showSurfaceView();
        this.mCamera.autoFocus(this.mAutoFocus);
        AudioManager manager = (AudioManager) getSystemService("audio");
        this.soundVolume = manager.getStreamVolume(1);
        manager.setStreamVolume(1, 0, 8);
        this.mPreviewing = DEBUG;
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
        ((AudioManager) getSystemService("audio")).setStreamVolume(1, this.soundVolume, 2);
    }

    public boolean isCameraAvailable() {
        return getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    public void cancelRequest() {
        Intent dataIntent = new Intent();
        dataIntent.putExtra(OsesameConstants.ERROR_INFO, "Camera unavailable or it is unsupported");
        setResult(0, dataIntent);
        finish();
    }
}
