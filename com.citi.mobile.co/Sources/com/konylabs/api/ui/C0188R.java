package com.konylabs.api.ui;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.util.Log;
import com.konylabs.android.KonyMain;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import ny0k.cq;

/* renamed from: com.konylabs.api.ui.R */
final class C0188R implements PictureCallback {
    private /* synthetic */ C0184N f325a;

    C0188R(C0184N c0184n) {
        this.f325a = c0184n;
    }

    private static Uri m314a(Bitmap bitmap) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("title", "App captured");
        contentValues.put("description", "Captured via application");
        contentValues.put("mime_type", "image/jpeg");
        ContentResolver contentResolver = KonyMain.getAppContext().getContentResolver();
        Uri insert = contentResolver.insert(Media.EXTERNAL_CONTENT_URI, contentValues);
        OutputStream openOutputStream;
        try {
            openOutputStream = contentResolver.openOutputStream(insert);
            bitmap.compress(CompressFormat.JPEG, 100, openOutputStream);
            openOutputStream.flush();
            openOutputStream.close();
            bitmap.recycle();
            ContentUris.parseId(insert);
            return insert;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            return null;
        } catch (Throwable th) {
            openOutputStream.close();
            bitmap.recycle();
        }
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        Object obj = null;
        this.f325a.f311o = false;
        if (KonyMain.f3656d >= 9 && this.f325a.f316t != null) {
            this.f325a.f316t.disable();
        }
        if (this.f325a.f288P == null) {
            return;
        }
        if (bArr == null) {
            this.f325a.f288P.m1402a(false, null);
        } else if (this.f325a.f290R != null) {
            r0 = new Options();
            r0.inDither = true;
            r0 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, r0);
            if (r0 != null) {
                if (KonyMain.f3656d >= 11) {
                    r0 = C0202e.m1280a((Object) bArr, r0);
                }
                int width = r0.getWidth();
                int height = r0.getHeight();
                int width2 = this.f325a.f291S.width();
                int height2 = this.f325a.f291S.height();
                int round = Math.round((float) ((this.f325a.f292T.left * width) / width2));
                int round2 = Math.round((float) (((this.f325a.f292T.top - this.f325a.f291S.top) * height) / height2));
                int round3 = Math.round((float) ((this.f325a.f290R.getWidth() * width) / width2));
                width2 = Math.round((float) ((this.f325a.f290R.getHeight() * height) / height2));
                if (round + round3 > width) {
                    round3 = width - round;
                }
                if (round2 + width2 > height) {
                    width2 = height - round2;
                }
                Bitmap createBitmap = (round < 0 || round2 < 0 || round3 <= 0 || width2 <= 0) ? r0 : Bitmap.createBitmap(r0, round, round2, round3, width2);
                if (createBitmap != r0) {
                    r0.recycle();
                }
                if (createBitmap != null) {
                    Object a;
                    if (this.f325a.f296Z == 2) {
                        int i = this.f325a.aa;
                        this.f325a.f295W;
                        a = C0202e.m1283a(createBitmap, i);
                    } else {
                        a = this.f325a.f296Z == 1 ? C0188R.m314a(createBitmap) : this.f325a.f296Z == 3 ? new cq(createBitmap) : null;
                    }
                    this.f325a.f288P.m1402a(true, a);
                    return;
                }
                this.f325a.f288P.m1402a(false, null);
            }
        } else {
            if (KonyMain.f3657e) {
                Log.d("KonyCamera", "overlayimage is null");
            }
            switch (this.f325a.f296Z) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    if (this.f325a.f312p != -1 && this.f325a.f312p != 1) {
                        obj = C0202e.m1288b(bArr, this.f325a.f312p);
                        break;
                    } else {
                        obj = C0202e.m1287b(bArr);
                        break;
                    }
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    if (this.f325a.f312p != -1 && this.f325a.f312p != 1) {
                        obj = C0202e.m1286a(bArr, this.f325a.f312p);
                        break;
                    } else {
                        obj = C0202e.m1285a(bArr);
                        break;
                    }
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    if (this.f325a.f312p != -1 && this.f325a.f312p != 1) {
                        r0 = new Options();
                        r0.inSampleSize = this.f325a.f312p;
                        r0 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, r0);
                        if (r0 != null) {
                            if (KonyMain.f3656d >= 11) {
                                r0 = C0202e.m1280a((Object) bArr, r0);
                            }
                            obj = new cq(r0);
                            break;
                        }
                    }
                    obj = new cq(bArr);
                    break;
                    break;
            }
            this.f325a.f288P.m1402a(true, obj);
        }
    }
}
