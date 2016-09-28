package ny0k;

import android.graphics.Typeface;
import android.util.Log;
import com.konylabs.android.C0128a;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class cB {
    private static HashMap f2217a;
    private static String[] f2218b;
    private static cB f2219c;

    static {
        f2217a = new HashMap();
        f2218b = null;
        f2219c = null;
    }

    private cB() {
        if (f2219c != null) {
            throw new IllegalStateException("Already instantiated");
        }
        try {
            if (KonyMain.m4059E() == 3) {
                File file = new File(C0128a.m16a().m27c());
                if (file.exists()) {
                    f2218b = file.list();
                    return;
                }
                return;
            }
            f2218b = KonyMain.getAppContext().getAssets().list("fonts");
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("CustomFontUtil", e.getMessage());
            }
        }
    }

    public static Typeface m2100a(String str) {
        Typeface typeface;
        String str2;
        WeakReference weakReference = (WeakReference) f2217a.get(str);
        if (weakReference != null) {
            typeface = (Typeface) weakReference.get();
            if (typeface != null) {
                return typeface;
            }
            f2217a.remove(str);
        }
        if (KonyMain.f3657e) {
            Log.d("CustomFontUtil", "Font name is:" + str);
        }
        String str3 = BuildConfig.FLAVOR;
        int length = f2218b != null ? f2218b.length : 0;
        for (int i = 0; i < length; i++) {
            String str4 = f2218b[i];
            if (str4.substring(0, str4.indexOf(46)).equals(str)) {
                str2 = f2218b[i];
                break;
            }
        }
        str2 = str3;
        if (str2.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            return null;
        }
        typeface = KonyMain.m4059E() == 3 ? Typeface.createFromFile(C0128a.m16a().m27c() + "/" + str2) : Typeface.createFromAsset(KonyMain.getAppContext().getAssets(), "fonts/" + str2);
        if (typeface == null) {
            return typeface;
        }
        f2217a.put(str, new WeakReference(typeface));
        return typeface;
    }

    public static cB m2101a() {
        if (f2219c == null) {
            f2219c = new cB();
        }
        return f2219c;
    }

    public static void m2102b() {
        if (f2217a != null) {
            f2217a.clear();
        }
        f2218b = null;
        f2219c = null;
    }
}
