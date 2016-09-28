package ny0k;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.C0128a;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.zip.ZipFile;
import javax.xml.parsers.SAXParserFactory;

/* renamed from: ny0k.O */
public final class C0281O {
    private static LinkedHashMap f1903a;
    private static HashMap f1904b;

    static {
        f1903a = new LinkedHashMap();
        f1904b = new HashMap();
    }

    public static void m1808a(long j) {
        f1904b.remove(BuildConfig.FLAVOR + j);
    }

    public static void m1809a(String str, Function function) {
        if (function != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = function;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", str);
            obtain.setData(bundle);
            KonyMain.m4061G().m1729b(obtain);
        }
    }

    public static void m1810a(String str, Function function, int i, String str2) {
        if (function != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = function;
            Bundle bundle = new Bundle(3);
            bundle.putSerializable("key0", str);
            bundle.putSerializable("key1", Integer.valueOf(i));
            bundle.putSerializable("key2", str2);
            obtain.setData(bundle);
            KonyMain.m4061G().m1729b(obtain);
        }
    }

    public static void m1811a(String str, Function function, Function function2) {
        KonyMain.m4061G().m1728a(new C0282P(str, function, function2));
    }

    public static boolean m1812a() {
        InputStream inputStream = null;
        try {
            if (KonyMain.m4059E() == 3) {
                ZipFile zipFile = new ZipFile(C0128a.m16a().m26b() + File.separator + "src.zip");
                InputStream inputStream2 = zipFile.getInputStream(zipFile.getEntry("functionalModules.xml"));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                inputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                zipFile.close();
                inputStream = inputStream2;
            } else {
                inputStream = KonyMain.getAppContext().getAssets().open("functionalModules.xml");
            }
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, new C0283Q(f1903a));
            if (inputStream == null) {
                return true;
            }
            try {
                inputStream.close();
                return true;
            } catch (IOException e) {
                return true;
            }
        } catch (Exception e2) {
            if (KonyMain.f3657e) {
                Log.d("KonyFunctionalModules", "Exception while initializing functional modules: " + e2);
            }
            if (inputStream == null) {
                return false;
            }
            try {
                inputStream.close();
                return false;
            } catch (IOException e3) {
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
        }
    }

    public static boolean m1813a(String str) {
        return (str == null || str.trim().length() == 0) ? false : f1903a.containsKey(str);
    }

    public static boolean m1815b() {
        for (String str : f1903a.keySet()) {
            C0423M c0423m = (C0423M) f1903a.get(str);
            if (c0423m.m3476b() && !C0281O.m1817b(c0423m, null)) {
                return false;
            }
        }
        return true;
    }

    public static boolean m1816b(String str) {
        if (C0281O.m1821d(str)) {
            return true;
        }
        C0423M c0423m = (C0423M) f1903a.get(str);
        return c0423m != null ? C0281O.m1817b(c0423m, null) : false;
    }

    private static boolean m1817b(C0423M c0423m, C0280N c0280n) {
        HashSet hashSet = (HashSet) f1904b.get(BuildConfig.FLAVOR + Thread.currentThread().getId());
        if (hashSet == null) {
            hashSet = new HashSet();
            f1904b.put(BuildConfig.FLAVOR + Thread.currentThread().getId(), hashSet);
        }
        String a = c0423m.m3471a();
        hashSet.add(a);
        boolean a2 = c0423m.m3474a(c0280n);
        if (!a2) {
            hashSet.remove(a);
        }
        return a2;
    }

    public static void m1818c() {
        f1903a.clear();
        f1904b.clear();
    }

    private static boolean m1821d(String str) {
        String str2 = BuildConfig.FLAVOR + Thread.currentThread().getId();
        if (str2 != null) {
            HashSet hashSet = (HashSet) f1904b.get(str2);
            if (hashSet != null && hashSet.contains(str)) {
                if (KonyMain.f3657e) {
                    Log.d("KonyFunctionalModules", "Module '" + str + "' already loaded.");
                }
                return true;
            }
        }
        return false;
    }
}
