package com.konylabs.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import ny0k.C0281O;
import ny0k.C0284S;
import ny0k.cB;
import ny0k.cN;
import ny0k.cW;
import ny0k.cy;

/* renamed from: com.konylabs.android.a */
public final class C0128a {
    private static C0131d f20a;

    static {
        f20a = null;
    }

    public static C0131d m16a() {
        return f20a;
    }

    public static InputStream m17a(String str) {
        if (str != null) {
            try {
                if (str.endsWith(".theme")) {
                    return new FileInputStream(new File(f20a.f24d, str));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void m18a(Object[] objArr) {
        if (KonyMain.getActivityContext() != null) {
            if (objArr == null || objArr.length == 0 || objArr[0] == null || objArr[0] == LuaNil.nil) {
                KonyMain.m4109b(0);
                f20a = null;
                C0128a.m23c();
            } else {
                KonyMain.m4109b(3);
                C0131d c0131d = new C0131d();
                f20a = c0131d;
                c0131d.f21a = (String) objArr[0];
                if (new File(f20a.f21a).exists()) {
                    f20a.f22b = f20a.f21a + "/src";
                    f20a.f23c = f20a.f21a + "/images";
                    f20a.f24d = f20a.f21a + "/themes";
                    f20a.f25e = f20a.f21a + "/i18n";
                    f20a.f26f = f20a.f21a + "/fonts";
                    C0128a.m23c();
                } else {
                    throw new LuaError(101, "KonyVisualizer", "Child application directory(" + f20a.f21a + ") does not exist");
                }
            }
            KonyMain.getActivityContext().m4163k();
            cW.m3856e();
            C0281O.m1818c();
            KonyMain.m4094a(new C0129b());
        }
    }

    private static boolean m19a(File file, String str) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                if (KonyMain.f3657e) {
                    Log.d("KonyVisualizer", "Extracting: " + nextEntry.getName() + "...");
                }
                String str2 = str + "/" + nextEntry.getName();
                File file2 = new File(str2);
                if (nextEntry.isDirectory()) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyVisualizer", "The Entry is a directory..");
                    }
                    file2.mkdirs();
                } else {
                    if (KonyMain.f3657e) {
                        Log.d("KonyVisualizer", "The Entry is a file...");
                    }
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists()) {
                        if (parentFile.mkdir()) {
                            if (KonyMain.f3657e) {
                                Log.d("KonyVisualizer", "Creating parent directory " + parentFile + " successful");
                            }
                        } else if (KonyMain.f3657e) {
                            Log.d("KonyVisualizer", "Unable to create parent directory " + parentFile);
                        }
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                    byte[] bArr = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                    while (true) {
                        int read = zipInputStream.read(bArr, 0, MobileAPI.MAX_CUSTOM_STRING_LENGTH);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
                zipInputStream.closeEntry();
            }
            zipInputStream.close();
            if (KonyMain.f3657e) {
                Log.d("KonyVisualizer", "--------------------------------");
                Log.d("KonyVisualizer", "Unzipping completed..");
            }
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyVisualizer", "Exception occured: " + e.getMessage());
            }
            e.printStackTrace();
        }
        return true;
    }

    public static Drawable m20b(String str) {
        try {
            InputStream fileInputStream = new FileInputStream(new File(f20a.f23c, str));
            if (!str.endsWith(".9.png")) {
                return new cy(BitmapFactory.decodeStream(fileInputStream));
            }
            Options options = new Options();
            options.inScreenDensity = 160;
            Rect rect = new Rect();
            Bitmap decodeResourceStream = BitmapFactory.decodeResourceStream(KonyMain.getActContext().getResources(), new TypedValue(), fileInputStream, rect, options);
            if (decodeResourceStream != null) {
                byte[] ninePatchChunk = decodeResourceStream.getNinePatchChunk();
                if (ninePatchChunk != null && NinePatch.isNinePatchChunk(ninePatchChunk)) {
                    return new NinePatchDrawable(KonyMain.getActContext().getResources(), decodeResourceStream, ninePatchChunk, rect, str);
                }
            }
            return null;
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonyVisualizer", "************* " + e.getMessage());
            }
            return null;
        }
    }

    public static InputStream m21b() {
        try {
            return new FileInputStream(new File(f20a.f21a, "application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap m22c(String str) {
        if (f20a == null) {
            return null;
        }
        InputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(f20a.f23c, str));
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonyVisualizer", "************* " + e.getMessage());
            }
            fileInputStream = null;
        }
        return fileInputStream != null ? BitmapFactory.decodeStream(fileInputStream) : null;
    }

    private static void m23c() {
        File file;
        if (f20a != null) {
            file = new File(f20a.f23c + "/images.zip");
            if (file.exists()) {
                C0128a.m19a(file, f20a.f23c);
                file.delete();
            }
        }
        if (f20a != null) {
            file = new File(f20a.f24d + "/themes.zip");
            if (file.exists()) {
                C0128a.m19a(file, f20a.f24d);
                file.delete();
            }
        }
        cN.m2151d();
        C0128a.m24d();
        if (f20a != null) {
            file = new File(f20a.f26f + "/fonts.zip");
            if (file.exists()) {
                C0128a.m19a(file, f20a.f26f);
                file.delete();
            }
        }
        cB.m2102b();
    }

    private static void m24d() {
        int i = 0;
        try {
            C0284S a = C0284S.m1823a(KonyMain.getAppContext());
            a.m1836a();
            String name;
            if (f20a != null) {
                File file = new File(f20a.f25e + "/i18n.zip");
                if (file.exists()) {
                    C0128a.m19a(file, f20a.f25e);
                    file.delete();
                }
                file = new File(f20a.f25e);
                if (file.exists()) {
                    File[] listFiles = file.listFiles();
                    int length = listFiles.length;
                    while (i < length) {
                        File file2 = listFiles[i];
                        name = file2.getName();
                        if (name.endsWith(".prop")) {
                            if (KonyMain.f3657e) {
                                Log.d("KonyVisualizer", "loading i18n prop :" + name);
                            }
                            a.m1838a(new FileInputStream(file2), name.substring(0, name.indexOf(".prop")));
                        }
                        i++;
                    }
                    return;
                }
                return;
            }
            Context appContext = KonyMain.getAppContext();
            String[] list = appContext.getAssets().list(BuildConfig.FLAVOR);
            C0284S a2 = C0284S.m1823a(appContext);
            int length2 = list.length;
            while (i < length2) {
                name = list[i];
                if (name.endsWith(".prop")) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyVisualizer", "loading i18n prop :" + name);
                    }
                    a2.m1838a(appContext.getAssets().open(name), name.substring(0, name.indexOf(".prop")));
                }
                i++;
            }
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyVisualizer", BuildConfig.FLAVOR + e.getMessage());
            }
        }
    }
}
