package com.osesame.android.scanner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.util.Iterator;
import net.sourceforge.zbar.Image;
import net.sourceforge.zbar.Symbol;

public class OsesamePhotoScannerActivity extends ScannerActivity {
    private static final boolean DEBUG = true;
    private static final String TAG = "OsesamePhotoScannerActivity";
    private Handler mHandler;

    /* renamed from: com.osesame.android.scanner.OsesamePhotoScannerActivity.1 */
    class C02641 implements Runnable {
        final /* synthetic */ Intent val$data;

        /* renamed from: com.osesame.android.scanner.OsesamePhotoScannerActivity.1.1 */
        class C02631 implements Runnable {
            C02631() {
            }

            public void run() {
                OsesamePhotoScannerActivity.this.finish();
            }
        }

        C02641(Intent intent) {
            this.val$data = intent;
        }

        public void run() {
            OsesamePhotoScannerActivity.this.scanImage(OsesamePhotoScannerActivity.this.readBitmap(this.val$data.getData()));
            OsesamePhotoScannerActivity.this.mHandler.post(new C02631());
        }
    }

    public OsesamePhotoScannerActivity() {
        this.mHandler = new Handler();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().addFlags(MobileAPI.MAX_CUSTOM_STRING_LENGTH);
        RelativeLayout mainLayout = new RelativeLayout(this);
        mainLayout.setLayoutParams(new LayoutParams(-1, -1));
        ProgressBar spinner = new ProgressBar(this);
        spinner.setIndeterminate(DEBUG);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-2, -2);
        params.addRule(13);
        mainLayout.addView(spinner, params);
        setContentView(mainLayout);
        setupScanner();
        if (savedInstanceState == null) {
            pickImageFromGallery();
        }
    }

    protected void pickImageFromGallery() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(Intent.createChooser(intent, "Select picture..."), 1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1 || data == null) {
            setResult(0);
            finish();
            return;
        }
        new Thread(new C02641(data)).start();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap readBitmap(android.net.Uri r8) {
        /*
        r7 = this;
        r0 = 0;
        r3 = new android.graphics.BitmapFactory$Options;
        r3.<init>();
        r4 = 0;
        r3.inScaled = r4;
        r2 = 0;
        r4 = r7.getContentResolver();	 Catch:{ FileNotFoundException -> 0x0026 }
        r5 = "r";
        r2 = r4.openAssetFileDescriptor(r8, r5);	 Catch:{ FileNotFoundException -> 0x0026 }
        r4 = r2.getFileDescriptor();	 Catch:{ IOException -> 0x0021 }
        r5 = 0;
        r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r4, r5, r3);	 Catch:{ IOException -> 0x0021 }
        r2.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0020:
        return r0;
    L_0x0021:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0020;
    L_0x0026:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ all -> 0x003c }
        r4 = r2.getFileDescriptor();	 Catch:{ IOException -> 0x0037 }
        r5 = 0;
        r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r4, r5, r3);	 Catch:{ IOException -> 0x0037 }
        r2.close();	 Catch:{ IOException -> 0x0037 }
        goto L_0x0020;
    L_0x0037:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0020;
    L_0x003c:
        r4 = move-exception;
        r5 = r2.getFileDescriptor();	 Catch:{ IOException -> 0x004a }
        r6 = 0;
        r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r5, r6, r3);	 Catch:{ IOException -> 0x004a }
        r2.close();	 Catch:{ IOException -> 0x004a }
    L_0x0049:
        throw r4;
    L_0x004a:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.osesame.android.scanner.OsesamePhotoScannerActivity.readBitmap(android.net.Uri):android.graphics.Bitmap");
    }

    private void scanImage(Bitmap image) {
        int width = image.getWidth();
        int height = image.getHeight();
        Log.d(TAG, "size=" + width + "x" + height);
        int[] pixels = new int[(width * height)];
        image.getPixels(pixels, 0, width, 0, 0, width, height);
        byte[] ypixels = new byte[(width * height)];
        Image barcode = new Image(width, height, "Y800");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int i = (y * width) + x;
                int color = pixels[i];
                int luma = (int) (((0.299d * ((double) ((color >> 16) & MotionEventCompat.ACTION_MASK))) + (0.587d * ((double) ((color >> 8) & MotionEventCompat.ACTION_MASK)))) + (0.114d * ((double) (color & MotionEventCompat.ACTION_MASK))));
                ypixels[i] = (byte) luma;
                pixels[i] = (((luma << 8) | luma) | (luma << 16)) | ViewCompat.MEASURED_STATE_MASK;
            }
        }
        barcode.setData(ypixels);
        int result = this.mScanner.scanImage(barcode);
        barcode.destroy();
        Log.d(TAG, "result=" + result);
        if (result != 0) {
            Iterator i$ = this.mScanner.getResults().iterator();
            while (i$.hasNext()) {
                Symbol sym = (Symbol) i$.next();
                String symData = sym.getData();
                if (!TextUtils.isEmpty(symData)) {
                    Intent dataIntent = new Intent();
                    Log.d(TAG, symData);
                    dataIntent.putExtra(OsesameConstants.SCAN_RESULT, symData);
                    dataIntent.putExtra(OsesameConstants.SCAN_RESULT_TYPE, sym.getType());
                    setResult(-1, dataIntent);
                    return;
                }
            }
            return;
        }
        setResult(0);
    }
}
