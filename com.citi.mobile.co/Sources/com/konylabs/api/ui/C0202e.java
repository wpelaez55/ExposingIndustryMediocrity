package com.konylabs.api.ui;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.C0245j;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ny0k.C0277J;
import ny0k.ae;

/* renamed from: com.konylabs.api.ui.e */
public class C0202e {
    final /* synthetic */ ao f1242a;

    private C0202e(ao aoVar, byte b) {
        this.f1242a = aoVar;
    }

    public static int m1277a(Options options, int i, int i2) {
        KonyMain actContext = KonyMain.getActContext();
        if (actContext == null) {
            return 1;
        }
        int ceil = (int) Math.ceil((double) (((float) options.outHeight) / (i2 != -1 ? (float) i2 : (float) actContext.m4167p())));
        int ceil2 = (int) Math.ceil((double) (((float) options.outWidth) / (i != -1 ? (float) i : (float) actContext.m4166o())));
        if (ceil <= 1 && ceil2 <= 1) {
            ceil2 = 1;
        } else if (ceil > ceil2) {
            ceil2 = ceil;
        }
        return ceil2;
    }

    public static int m1278a(Object obj) {
        ExifInterface exifInterface = null;
        int i = 0;
        if (obj != null) {
            if (obj instanceof Uri) {
                String str;
                KonyMain actContext = KonyMain.getActContext();
                Uri uri = (Uri) obj;
                if ("content".equals(uri.getScheme())) {
                    Cursor query = actContext != null ? actContext.getContentResolver().query(uri, new String[]{"_data"}, null, null, null) : null;
                    String string = (query == null || !query.moveToFirst()) ? null : query.getString(0);
                    str = string;
                } else {
                    str = "file".equals(uri.getScheme()) ? uri.getPath() : null;
                }
                if (str != null) {
                    try {
                        exifInterface = new ExifInterface(str);
                    } catch (IOException e) {
                        if (KonyMain.f3657e) {
                            Log.d("MediaUtil", BuildConfig.FLAVOR + e.getMessage());
                        }
                    }
                    if (exifInterface != null) {
                        int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
                        if (KonyMain.f3657e) {
                            Log.d("MediaUtil", "getRotation : rotationConst of ExifInterface = " + attributeInt);
                        }
                        if (!(attributeInt == 1 || attributeInt == 0)) {
                            switch (attributeInt) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    attributeInt = 0;
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                    attributeInt = 180;
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                    attributeInt = 90;
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                    attributeInt = 270;
                                    break;
                                default:
                                    attributeInt = 0;
                                    break;
                            }
                            i = attributeInt;
                        }
                    }
                }
            } else if (obj instanceof byte[]) {
                i = ae.m1971a((byte[]) obj);
            }
            if (KonyMain.f3657e) {
                Log.d("MediaUtil", "getRotation : Exif rotation value = " + i);
            }
        }
        return i;
    }

    public static Bitmap m1279a(Uri uri, Options options) {
        InputStream openInputStream;
        Object obj;
        String str;
        String str2;
        Throwable th;
        Bitmap bitmap = null;
        if (uri.toString().contains("contacts")) {
            C0277J a = C0277J.m1795a();
            a.m1800a(KonyMain.getActContext());
            a.m1799a(KonyMain.getActContext().getContentResolver());
            return a.m1796a(uri);
        }
        KonyMain actContext = KonyMain.getActContext();
        if (actContext == null) {
            return bitmap;
        }
        Uri a2 = C0202e.m1284a(uri);
        Options options2 = new Options();
        if (a2 != null) {
            try {
                openInputStream = actContext.getContentResolver().openInputStream(a2);
                try {
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(openInputStream, null, options2);
                    if (options2.outWidth == -1 || options2.outHeight == -1) {
                        obj = null;
                    } else {
                        int i = 1;
                    }
                } catch (FileNotFoundException e) {
                    obj = e;
                    try {
                        if (KonyMain.f3657e) {
                            Log.d("MediaUtil", "File Not Found for thumbnail uri: " + a2);
                            Log.d("MediaUtil", BuildConfig.FLAVOR + obj);
                        }
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (IOException e2) {
                                if (KonyMain.f3657e) {
                                    Log.d("MediaUtil", "IO Excepiton while closing stream for thumbnail uri: " + a2);
                                    Log.d("MediaUtil", BuildConfig.FLAVOR + e2);
                                }
                            }
                        }
                        obj = null;
                        if (obj == null) {
                            if (KonyMain.f3657e) {
                                Log.d("MediaUtil", "-------Decoding with thumbnail uri fails-------------");
                            }
                            try {
                                openInputStream = actContext.getContentResolver().openInputStream(uri);
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(openInputStream, null, options2);
                                if (options2.outWidth != -1) {
                                }
                                obj = null;
                                if (openInputStream != null) {
                                    try {
                                        openInputStream.close();
                                    } catch (IOException e3) {
                                        if (KonyMain.f3657e) {
                                            Log.d("MediaUtil", "IO Exception while closing stream for original uri: " + uri);
                                            Log.d("MediaUtil", BuildConfig.FLAVOR + e3);
                                        }
                                    }
                                }
                            } catch (FileNotFoundException e4) {
                                if (KonyMain.f3657e) {
                                    Log.d("MediaUtil", "File Not Found for original uri: " + uri);
                                    Log.d("MediaUtil", BuildConfig.FLAVOR + e4);
                                }
                                if (openInputStream != null) {
                                    try {
                                        openInputStream.close();
                                    } catch (IOException e22) {
                                        if (KonyMain.f3657e) {
                                            Log.d("MediaUtil", "IO Exception while closing stream for original uri: " + uri);
                                            Log.d("MediaUtil", BuildConfig.FLAVOR + e22);
                                        }
                                    }
                                }
                                obj = null;
                            } catch (Throwable th2) {
                                if (openInputStream != null) {
                                    try {
                                        openInputStream.close();
                                    } catch (IOException e222) {
                                        if (KonyMain.f3657e) {
                                            Log.d("MediaUtil", "IO Exception while closing stream for original uri: " + uri);
                                            Log.d("MediaUtil", BuildConfig.FLAVOR + e222);
                                        }
                                    }
                                }
                            }
                            if (obj == null) {
                                if (KonyMain.f3657e) {
                                    return bitmap;
                                }
                                Log.d("MediaUtil", "-------Decoding with original uri fails-------------");
                                return bitmap;
                            }
                        }
                        uri = a2;
                        if (options == null) {
                            options = new Options();
                        }
                        options.inSampleSize = C0202e.m1277a(options2, -1, -1);
                        openInputStream = actContext.getContentResolver().openInputStream(uri);
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                        if (openInputStream != null) {
                            return bitmap;
                        }
                        try {
                            openInputStream.close();
                            return bitmap;
                        } catch (IOException e2222) {
                            if (!KonyMain.f3657e) {
                                return bitmap;
                            }
                            str = "MediaUtil";
                            str2 = BuildConfig.FLAVOR + e2222;
                            Log.d(str, str2);
                            return bitmap;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (IOException e22222) {
                                if (KonyMain.f3657e) {
                                    Log.d("MediaUtil", "IO Excepiton while closing stream for thumbnail uri: " + a2);
                                    Log.d("MediaUtil", BuildConfig.FLAVOR + e22222);
                                }
                            }
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e5) {
                obj = e5;
                openInputStream = bitmap;
                if (KonyMain.f3657e) {
                    Log.d("MediaUtil", "File Not Found for thumbnail uri: " + a2);
                    Log.d("MediaUtil", BuildConfig.FLAVOR + obj);
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
                obj = null;
                if (obj == null) {
                    uri = a2;
                } else {
                    if (KonyMain.f3657e) {
                        Log.d("MediaUtil", "-------Decoding with thumbnail uri fails-------------");
                    }
                    openInputStream = actContext.getContentResolver().openInputStream(uri);
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(openInputStream, null, options2);
                    if (options2.outWidth != -1) {
                    }
                    obj = null;
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    if (obj == null) {
                        if (KonyMain.f3657e) {
                            return bitmap;
                        }
                        Log.d("MediaUtil", "-------Decoding with original uri fails-------------");
                        return bitmap;
                    }
                }
                if (options == null) {
                    options = new Options();
                }
                options.inSampleSize = C0202e.m1277a(options2, -1, -1);
                openInputStream = actContext.getContentResolver().openInputStream(uri);
                bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    return bitmap;
                }
                openInputStream.close();
                return bitmap;
            } catch (Throwable th4) {
                openInputStream = bitmap;
                th = th4;
                if (openInputStream != null) {
                    openInputStream.close();
                }
                throw th;
            }
        }
        obj = null;
        Object obj2 = bitmap;
        if (openInputStream != null) {
            try {
                openInputStream.close();
            } catch (IOException e6) {
                if (KonyMain.f3657e) {
                    Log.d("MediaUtil", "IO Excepiton while closing stream for thumbnail uri: " + a2);
                    Log.d("MediaUtil", BuildConfig.FLAVOR + e6);
                }
            }
        }
        if (obj == null) {
            if (KonyMain.f3657e) {
                Log.d("MediaUtil", "-------Decoding with thumbnail uri fails-------------");
            }
            openInputStream = actContext.getContentResolver().openInputStream(uri);
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options2);
            if (options2.outWidth != -1 || options2.outHeight == -1) {
                obj = null;
            } else {
                i = 1;
            }
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (obj == null) {
                if (KonyMain.f3657e) {
                    return bitmap;
                }
                Log.d("MediaUtil", "-------Decoding with original uri fails-------------");
                return bitmap;
            }
        }
        uri = a2;
        if (options == null) {
            options = new Options();
        }
        options.inSampleSize = C0202e.m1277a(options2, -1, -1);
        try {
            openInputStream = actContext.getContentResolver().openInputStream(uri);
            bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
            if (openInputStream != null) {
                return bitmap;
            }
            openInputStream.close();
            return bitmap;
        } catch (FileNotFoundException e42) {
            if (KonyMain.f3657e) {
                Log.d("MediaUtil", BuildConfig.FLAVOR + e42);
            }
            if (openInputStream == null) {
                return bitmap;
            }
            try {
                openInputStream.close();
                return bitmap;
            } catch (IOException e222222) {
                if (!KonyMain.f3657e) {
                    return bitmap;
                }
                str = "MediaUtil";
                str2 = BuildConfig.FLAVOR + e222222;
                Log.d(str, str2);
                return bitmap;
            }
        } catch (Throwable th5) {
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException e2222222) {
                    if (KonyMain.f3657e) {
                        Log.d("MediaUtil", BuildConfig.FLAVOR + e2222222);
                    }
                }
            }
        }
    }

    public static Bitmap m1280a(Object obj, Bitmap bitmap) {
        if (obj == null || bitmap == null) {
            return bitmap;
        }
        int a = C0202e.m1278a(obj);
        if (a == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) a);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (createBitmap == null) {
            return bitmap;
        }
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap m1281a(byte[] bArr, int i, int i2) {
        Bitmap decodeByteArray;
        C0245j c0245j = null;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inSampleSize = C0202e.m1277a(options, i, i2);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (OutOfMemoryError e) {
            if (KonyMain.f3657e) {
                Log.d("MediaUtil", "OOM************************************");
            }
            KonyMain.m4143x().m1777a(c0245j);
        }
        return decodeByteArray;
    }

    public static Uri m1282a(long j) {
        KonyMain actContext = KonyMain.getActContext();
        ContentResolver contentResolver = actContext != null ? actContext.getContentResolver() : null;
        Cursor query = contentResolver != null ? contentResolver.query(Thumbnails.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "image_id=" + j, null, null) : null;
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        Uri parse = Uri.parse(Thumbnails.EXTERNAL_CONTENT_URI + "/" + query.getString(0));
        query.close();
        return parse;
    }

    public static Uri m1283a(Bitmap bitmap, int i) {
        ContentResolver contentResolver = KonyMain.getAppContext().getContentResolver();
        String str = "png";
        if (i == 2) {
            str = "jpg";
        }
        Uri parse = Uri.parse(new File(KonyMain.getAppContext().getCacheDir(), BuildConfig.FLAVOR + System.currentTimeMillis() + "." + str).toURI().toString());
        OutputStream openOutputStream;
        try {
            openOutputStream = contentResolver.openOutputStream(parse);
            if (i == 1) {
                bitmap.compress(CompressFormat.PNG, 100, openOutputStream);
            } else {
                bitmap.compress(CompressFormat.JPEG, 100, openOutputStream);
            }
            openOutputStream.flush();
            openOutputStream.close();
            bitmap.recycle();
            return parse;
        } catch (FileNotFoundException e) {
            if (KonyMain.f3657e) {
                Log.d("MediaUtil", "File not found exception");
            }
            return null;
        } catch (IOException e2) {
            if (KonyMain.f3657e) {
                Log.d("MediaUtil", "IO exception");
            }
            return null;
        } catch (Throwable th) {
            openOutputStream.close();
            bitmap.recycle();
        }
    }

    public static Uri m1284a(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            Uri uri2;
            String path = uri.getPath();
            KonyMain actContext = KonyMain.getActContext();
            ContentResolver contentResolver = actContext != null ? actContext.getContentResolver() : null;
            Cursor query = contentResolver != null ? contentResolver.query(Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data='" + path + "'", null, null) : null;
            if (query == null || !query.moveToFirst()) {
                uri2 = null;
            } else {
                long j = query.getLong(0);
                query.close();
                uri2 = C0202e.m1282a(j);
            }
            if (uri2 != null) {
                return uri2;
            }
            String uri3 = uri.toString();
            int lastIndexOf = uri3.lastIndexOf(".");
            if (lastIndexOf > 0) {
                uri3 = uri3.substring(0, lastIndexOf) + "Thumb" + uri3.substring(lastIndexOf, uri3.length());
            }
            return Uri.parse(uri3);
        }
        try {
            uri = C0202e.m1282a(ContentUris.parseId(uri));
        } catch (NumberFormatException e) {
            if (KonyMain.f3657e) {
                Log.d("MediaUtil", BuildConfig.FLAVOR + e);
            }
        }
        return uri;
    }

    public static Uri m1285a(byte[] bArr) {
        if (KonyMain.f3657e) {
            Log.d("MediaUtil", "saveMediaPrivateFromData called");
        }
        File file = new File(KonyMain.getAppContext().getCacheDir(), BuildConfig.FLAVOR + System.currentTimeMillis() + ".jpg");
        Uri fromFile = Uri.fromFile(file);
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
            return fromFile;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            return null;
        } catch (Throwable th) {
            fileOutputStream.close();
        }
    }

    public static Uri m1286a(byte[] bArr, int i) {
        OutputStream fileOutputStream;
        if (KonyMain.f3657e) {
            Log.d("MediaUtil", "saveMediaPrivateFromData(final byte[] data, int scale) called");
        }
        File file = new File(KonyMain.getAppContext().getCacheDir(), BuildConfig.FLAVOR + System.currentTimeMillis() + ".jpg");
        Uri fromFile = Uri.fromFile(file);
        Options options = new Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray == null) {
            return null;
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            decodeByteArray.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            decodeByteArray.recycle();
            return fromFile;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            return null;
        } catch (Throwable th) {
            fileOutputStream.close();
            decodeByteArray.recycle();
        }
    }

    public static Uri m1287b(byte[] bArr) {
        if (KonyMain.f3657e) {
            Log.d("MediaUtil", "saveMediaPublicFromData called");
        }
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("title", "App captured");
        contentValues.put("description", "Captured via application");
        contentValues.put("mime_type", "image/jpeg");
        if (KonyMain.f3656d >= 11) {
            contentValues.put("orientation", Integer.valueOf(C0202e.m1278a((Object) bArr)));
        }
        ContentResolver contentResolver = KonyMain.getAppContext().getContentResolver();
        Uri insert = contentResolver.insert(Media.EXTERNAL_CONTENT_URI, contentValues);
        OutputStream openOutputStream;
        try {
            openOutputStream = contentResolver.openOutputStream(insert);
            openOutputStream.write(bArr);
            openOutputStream.flush();
            openOutputStream.close();
            return insert;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            return null;
        } catch (Throwable th) {
            openOutputStream.close();
        }
    }

    public static Uri m1288b(byte[] bArr, int i) {
        if (KonyMain.f3657e) {
            Log.d("MediaUtil", "saveMediaPublicFromData(final byte[] data, int scale) called");
        }
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("title", "App captured");
        contentValues.put("description", "Captured via application");
        contentValues.put("mime_type", "image/jpeg");
        if (KonyMain.f3656d >= 11) {
            contentValues.put("orientation", Integer.valueOf(C0202e.m1278a((Object) bArr)));
        }
        ContentResolver contentResolver = KonyMain.getAppContext().getContentResolver();
        Uri insert = contentResolver.insert(Media.EXTERNAL_CONTENT_URI, contentValues);
        Options options = new Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray == null) {
            return null;
        }
        OutputStream openOutputStream;
        try {
            openOutputStream = contentResolver.openOutputStream(insert);
            decodeByteArray.compress(CompressFormat.JPEG, 100, openOutputStream);
            openOutputStream.flush();
            openOutputStream.close();
            decodeByteArray.recycle();
            return insert;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            return null;
        } catch (Throwable th) {
            openOutputStream.close();
            decodeByteArray.recycle();
        }
    }

    public void m1289a(int i) {
        this.f1242a.f2584e = i;
    }

    public void m1290b(int i) {
        this.f1242a.f2584e = i;
        if (this.f1242a.f2590k != null) {
            this.f1242a.f2590k.onClick(this.f1242a);
        }
    }
}
