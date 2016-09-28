package ny0k;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class cK {
    private Context f2254a;

    public cK(Context context) {
        this.f2254a = context;
    }

    private void m2129a(String str, String str2) {
        Editor edit = this.f2254a.getSharedPreferences("KonyPrefs", 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static void m2130c() {
        try {
            PrintStream cLVar = new cL(new ByteArrayOutputStream());
            System.setOut(cLVar);
            System.setErr(cLVar);
        } catch (Exception e) {
        }
    }

    public final void m2131a(int i) {
        Editor edit = this.f2254a.getSharedPreferences("KonyPrefs", 0).edit();
        edit.putInt("AppUpgradeState", i);
        edit.commit();
    }

    public final void m2132a(String str, boolean z) {
        Editor edit = this.f2254a.getSharedPreferences("KonyPrefs", 0).edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    public final boolean m2133a() {
        PackageInfo packageInfo;
        boolean z = this.f2254a.getSharedPreferences("KonyPrefs", 0).getBoolean("AppFirstRun", true);
        try {
            packageInfo = this.f2254a.getPackageManager().getPackageInfo(this.f2254a.getPackageName(), 0);
        } catch (Throwable e) {
            if (KonyMain.f3659g) {
                Log.d("Preferences", BuildConfig.FLAVOR + e, e);
            }
            packageInfo = null;
        }
        if (packageInfo == null) {
            return z;
        }
        if (z) {
            m2129a("AppVersion", packageInfo.versionName);
            return z;
        }
        String string = this.f2254a.getSharedPreferences("KonyPrefs", 0).getString("AppVersion", null);
        String str = packageInfo.versionName;
        if (string == null || string.equals(str)) {
            return z;
        }
        m2129a("AppVersion", str);
        return true;
    }

    public final int m2134b() {
        return this.f2254a.getSharedPreferences("KonyPrefs", 0).getInt("AppUpgradeState", 0);
    }
}
