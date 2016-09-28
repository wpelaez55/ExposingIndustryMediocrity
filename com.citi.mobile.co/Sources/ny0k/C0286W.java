package ny0k;

import android.content.Context;
import android.os.Environment;
import com.konylabs.android.KonyMain;
import com.konylabs.vmintf.KonyJSVM;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import java.util.HashMap;

/* renamed from: ny0k.W */
public final class C0286W {
    public static final String f1922a;
    public static final String f1923b;
    private static final Context f1924c;
    private static String f1925d;

    static {
        Context appContext = KonyMain.getAppContext();
        f1924c = appContext;
        f1922a = appContext.getCacheDir().getAbsolutePath();
        f1923b = f1924c.getFilesDir().getAbsolutePath();
        f1925d = File.separator;
    }

    public static C0442U m1852a(String str) {
        return (C0442U) KonyJSVM.createJSObject("kony.io.File", new Object[]{str});
    }

    public static boolean m1853a() {
        String externalStorageState = Environment.getExternalStorageState();
        return externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro");
    }

    public static String m1854b() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        return externalStorageDirectory != null ? externalStorageDirectory.getAbsolutePath() : null;
    }

    public static HashMap m1855c() {
        HashMap hashMap = new HashMap();
        hashMap.put("FILE_PATH_SEPARATOR", f1925d);
        hashMap.put("APPLICATION_CACHE_DIRECTORY", f1922a);
        hashMap.put("APPLICATION_DATA_DIRECTORY", f1923b);
        hashMap.put("APPLICATION_RAW_DIRECTORY", "app.raw");
        hashMap.put("APPLICATION_DIRECTORY", BuildConfig.FLAVOR);
        hashMap.put("APPLICATION_SUPPORT_DIRECTORY", BuildConfig.FLAVOR);
        return hashMap;
    }
}
