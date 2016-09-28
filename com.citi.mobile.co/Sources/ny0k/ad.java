package ny0k;

import android.location.Location;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;

public abstract class ad {
    private static String f2059a;
    private static byte f2060b;
    public static byte f2061c;
    public static byte f2062d;
    public static String f2063e;
    public static String f2064f;
    protected static long f2065g;
    protected static long f2066h;
    protected static long f2067i;
    private static String f2068j;
    private static ad f2069k;
    private static long f2070l;
    private static boolean f2071m;

    static {
        f2059a = "KonyLocationManager";
        f2060b = (byte) 1;
        f2061c = (byte) 2;
        f2062d = (byte) 3;
        f2068j = "PERMISSION_DENIED";
        f2063e = "POSITION_UNAVAILABLE";
        f2064f = "TIMEOUT";
        f2069k = null;
        f2065g = 0;
        f2066h = 0;
        f2067i = 0;
        f2070l = 0;
        f2071m = false;
        f2065g = cG.m2117h() * 1000;
        f2066h = cG.m2118i();
        f2067i = (cG.m2119j() * 60) * 1000;
    }

    protected ad() {
    }

    public static void m1958a(Object obj, int i, String str) {
        if (obj != null) {
            LuaTable luaTable = new LuaTable();
            luaTable.setTable("code", new Double((double) i));
            if (i == f2060b) {
                luaTable.setTable("message", f2068j);
            } else if (i == f2061c) {
                luaTable.setTable("message", f2063e);
            } else if (i == f2062d) {
                luaTable.setTable("message", f2064f);
            } else {
                luaTable.setTable("message", str);
            }
            if (KonyMain.f3657e) {
                Log.d(f2059a, "executeErrorCallback(): Executing the error callback...");
            }
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = obj;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key0", luaTable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public static void m1959a(Object obj, Location location) {
        if (obj != null) {
            LuaTable luaTable = new LuaTable();
            luaTable.setTable("latitude", new Double(location.getLatitude()));
            luaTable.setTable("longitude", new Double(location.getLongitude()));
            luaTable.setTable("accuracy", new Double((double) location.getAccuracy()));
            luaTable.setTable("altitude", new Double(location.getAltitude()));
            luaTable.setTable("heading", new Double((double) location.getBearing()));
            luaTable.setTable("speeding", new Double((double) location.getSpeed()));
            Serializable luaTable2 = new LuaTable();
            luaTable2.setTable("coords", luaTable);
            luaTable2.setTable("timestamp", new Double((double) location.getTime()));
            if (KonyMain.f3657e) {
                Log.d(f2059a, "executeSuccessCallback(): Executing the success callback...");
            }
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = obj;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key0", luaTable2);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public static void m1960a(boolean z) {
        f2071m = true;
    }

    public static ad m1961f() {
        if (f2069k == null) {
            if (f2071m && ab.m3545d()) {
                f2069k = new ab();
            } else {
                f2069k = new C0425Y();
            }
        }
        return f2069k;
    }

    public static long m1962g() {
        long j = f2070l + 1;
        f2070l = j;
        return j;
    }

    public static void m1963h() {
        if (f2069k != null) {
            f2069k.m1969b();
        }
    }

    public static void m1964i() {
        if (f2069k != null) {
            f2069k.m1970c();
        }
    }

    public Location m1965a() {
        return new C0425Y().m3502a();
    }

    public abstract void m1966a(long j);

    public abstract void m1967a(Object obj, Object obj2, LuaTable luaTable);

    public abstract long m1968b(Object obj, Object obj2, LuaTable luaTable);

    public abstract void m1969b();

    public abstract void m1970c();
}
