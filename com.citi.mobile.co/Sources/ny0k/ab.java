package ny0k;

import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;
import java.util.Hashtable;

public final class ab extends ad {
    static ac f3257a;
    static Hashtable f3258b;
    private static String f3259j;

    static {
        f3259j = "KonyGooglePlayLocationManager";
        f3257a = null;
        f3258b = null;
    }

    public static boolean m3545d() {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(KonyMain.getAppContext());
        if (KonyMain.f3657e) {
            Log.d(f3259j, "isGooglePlayServicesAvailable(): (0 for SUCCESS) status = " + isGooglePlayServicesAvailable);
        }
        return isGooglePlayServicesAvailable == 0;
    }

    public final void m3547a(long j) {
        if (f3258b != null && !f3258b.isEmpty()) {
            ac acVar = (ac) f3258b.remove(Long.valueOf(j));
            if (acVar != null) {
                acVar.m1957b();
            }
        }
    }

    public final void m3548a(Object obj, Object obj2, LuaTable luaTable) {
        if (KonyMain.f3657e) {
            Log.d(f3259j, "getCurrentPosition(): options=" + luaTable);
        }
        if (f3257a != null) {
            f3257a.m1957b();
        }
        ac acVar = new ac(this, obj, obj2, luaTable, true);
        f3257a = acVar;
        acVar.m1955a();
    }

    public final long m3549b(Object obj, Object obj2, LuaTable luaTable) {
        if (KonyMain.f3657e) {
            Log.d(f3259j, "watchPosition(): options=" + luaTable);
        }
        ac acVar = new ac(this, obj, obj2, luaTable, false);
        if (f3258b == null) {
            f3258b = new Hashtable();
        }
        long g = ad.m1962g();
        f3258b.put(Long.valueOf(g), acVar);
        acVar.m1956a(g);
        acVar.m1955a();
        return g;
    }

    public final void m3550b() {
        if (f3257a != null) {
            f3257a.m1955a();
        }
        if (f3258b != null && f3258b.size() > 0) {
            for (ac a : f3258b.values()) {
                a.m1955a();
            }
        }
    }

    public final void m3551c() {
        if (f3257a != null) {
            f3257a.m1957b();
        }
        if (f3258b != null && f3258b.size() > 0) {
            for (ac b : f3258b.values()) {
                b.m1957b();
            }
        }
    }
}
