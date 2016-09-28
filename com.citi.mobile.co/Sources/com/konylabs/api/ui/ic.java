package com.konylabs.api.ui;

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Looper;
import android.provider.MediaStore.Images.Thumbnails;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ic {
    final /* synthetic */ fi f1545a;

    ic(fi fiVar) {
        this.f1545a = fiVar;
    }

    public void m1402a(boolean z, Object obj) {
        Cursor cursor = null;
        if (z) {
            if (KonyMain.f3656d < 11) {
                KonyMain.m4143x().m1777a(null);
            }
            this.f1545a.ab = obj;
            if (KonyMain.f3657e) {
                Log.d("LuaCamera", "Successfully got the image : " + obj);
            }
            Options options;
            if (this.f1545a.f3910Z == 2) {
                Uri uri = (Uri) this.f1545a.ab;
                int c = this.f1545a.f3902R;
                if ("file".equals(uri.getScheme())) {
                    Options options2 = new Options();
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(uri.getPath(), options2);
                    options = new Options();
                    int round = Math.round(((float) options2.outWidth) / 320.0f);
                    if (round == 0) {
                        round = 4;
                    }
                    options.inSampleSize = round;
                    Bitmap decodeFile = BitmapFactory.decodeFile(uri.getPath(), options);
                    if (decodeFile != null) {
                        String lastPathSegment = uri.getLastPathSegment();
                        int lastIndexOf = lastPathSegment.lastIndexOf(".");
                        if (lastIndexOf > 0) {
                            lastPathSegment = lastPathSegment.substring(0, lastIndexOf) + "Thumb" + lastPathSegment.substring(lastIndexOf, lastPathSegment.length());
                        }
                        OutputStream fileOutputStream;
                        try {
                            fileOutputStream = new FileOutputStream(new File(KonyMain.getAppContext().getCacheDir(), lastPathSegment));
                            if (c == 1) {
                                decodeFile.compress(CompressFormat.PNG, 100, fileOutputStream);
                            } else {
                                decodeFile.compress(CompressFormat.JPEG, 100, fileOutputStream);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            decodeFile.recycle();
                        } catch (FileNotFoundException e) {
                            if (KonyMain.f3657e) {
                                Log.d("MediaUtil", "File not found exception");
                            }
                        } catch (IOException e2) {
                            if (KonyMain.f3657e) {
                                Log.d("MediaUtil", "IO exception");
                            }
                        } catch (Throwable th) {
                            fileOutputStream.close();
                            decodeFile.recycle();
                        }
                    }
                } else if (KonyMain.f3657e) {
                    Log.d("MediaUtil", "File not found");
                }
            } else if (this.f1545a.f3910Z == 1) {
                Uri uri2 = (Uri) this.f1545a.ab;
                try {
                    KonyMain actContext = KonyMain.getActContext();
                    if (actContext != null) {
                        cursor = actContext.getContentResolver().query(uri2, new String[]{"_data"}, null, null, null);
                    }
                    if (cursor != null) {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(0);
                            options = new Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(string, options);
                            Options options3 = new Options();
                            options3.inSampleSize = Math.round(((float) options.outWidth) / 320.0f);
                            Bitmap decodeFile2 = BitmapFactory.decodeFile(string, options3);
                            if (decodeFile2 != null) {
                                long parseId = ContentUris.parseId(uri2);
                                ContentValues contentValues = new ContentValues(4);
                                contentValues.put("kind", Integer.valueOf(1));
                                contentValues.put("image_id", Integer.valueOf((int) parseId));
                                contentValues.put("height", Integer.valueOf(decodeFile2.getHeight()));
                                contentValues.put("width", Integer.valueOf(decodeFile2.getWidth()));
                                OutputStream openOutputStream = KonyMain.getAppContext().getContentResolver().openOutputStream(KonyMain.getAppContext().getContentResolver().insert(Thumbnails.EXTERNAL_CONTENT_URI, contentValues));
                                decodeFile2.compress(CompressFormat.JPEG, 100, openOutputStream);
                                openOutputStream.close();
                                decodeFile2.recycle();
                            }
                        }
                        cursor.close();
                    }
                } catch (FileNotFoundException e3) {
                    if (KonyMain.f3657e) {
                        Log.d("MediaUtil", BuildConfig.FLAVOR + e3.getMessage());
                    }
                } catch (IOException e4) {
                    if (KonyMain.f3657e) {
                        Log.d("MediaUtil", BuildConfig.FLAVOR + e4.getMessage());
                    }
                }
            }
            fi.m4321d(this.f1545a);
            return;
        }
        this.f1545a.ab = null;
        if (KonyMain.f3657e) {
            Log.d("LuaCamera", "Failed to take picture");
        }
        if (this.f1545a.f3901Q != 1 && this.f1545a.f3901Q != 1) {
            Looper.myQueue().addIdleHandler(new fk(this));
        }
    }
}
