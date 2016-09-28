package ny0k;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.widget.AutoScrollHelper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.Hashtable;

/* renamed from: ny0k.Y */
public final class C0425Y extends ad {
    private static String f3216j;
    aa f3217a;
    Hashtable f3218b;
    private LocationManager f3219k;
    private C0287Z f3220l;
    private C0287Z f3221m;
    private C0287Z f3222n;

    static {
        f3216j = "KonyAndroidLocationManager";
    }

    public C0425Y() {
        this.f3219k = null;
        this.f3217a = null;
        this.f3220l = null;
        this.f3221m = null;
        this.f3222n = null;
        this.f3218b = null;
    }

    private String m3480a(boolean z, boolean z2) {
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getProvider(START) {");
        }
        String str = null;
        m3490e();
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getProvider(): enableHighAccuracy = [ " + z + " ]   useBestProvider= [ " + z2 + " ]");
        }
        if (this.f3219k != null) {
            if (z2) {
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getProvider(): useBestProvider is true,  so querying for bestProvoder from System ");
                }
                str = this.f3219k.getBestProvider(new Criteria(), true);
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getProvider():  useBestProvider is true. bestProvoder from System =" + str);
                }
                if (str == null) {
                    str = z ? "gps" : "network";
                    if (KonyMain.f3657e) {
                        Log.d(f3216j, "getProvider(): useBestProvider is true.  bestProvoder picked =" + str);
                    }
                }
            } else {
                if (z) {
                    if (KonyMain.f3657e) {
                        Log.d(f3216j, "getProvider(): enableHighAccuracy is 'true', so checking if GPS is enabled in System settings... ");
                    }
                    if (this.f3219k.isProviderEnabled("gps")) {
                        if (KonyMain.f3657e) {
                            Log.d(f3216j, "getProvider(): with enableHighAccuracy as 'true & 'GPS is in enabled state, Applicable provider is 'GPS' ");
                        }
                        str = "gps";
                    } else if (this.f3219k.isProviderEnabled("network")) {
                        if (KonyMain.f3657e) {
                            Log.d(f3216j, "getProvider(): 'GPS is not in enabled state, next applicable provider is 'network' ");
                        }
                        str = "network";
                    } else if (KonyMain.f3657e) {
                        Log.d(f3216j, "getProvider(): None of the providers(gps/network) are enabled in System settings ");
                    }
                } else {
                    if (KonyMain.f3657e) {
                        Log.d(f3216j, "getProvider(): enableHighAccuracy is 'false', so checking if 'network' is enabled in System settings... ");
                    }
                    if (this.f3219k.isProviderEnabled("network")) {
                        if (KonyMain.f3657e) {
                            Log.d(f3216j, "getProvider(): with enableHighAccuracy as 'false' & 'network' provider is in enabled state, Applicable provider is 'network' ");
                        }
                        str = "network";
                    }
                }
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getProvider(): After checking the system settings as per user options, provider is = " + str);
                }
            }
        }
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getProvider(END) } provider= " + str);
        }
        return str;
    }

    private C0287Z m3481a(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("network")) {
            if (this.f3221m == null) {
                this.f3221m = new C0287Z(this, false);
            }
            return this.f3221m;
        }
        if (this.f3222n == null) {
            this.f3222n = new C0287Z(this, false);
        }
        return this.f3222n;
    }

    private void m3483a(aa aaVar) {
        if (!(this.f3219k == null || aaVar == null)) {
            boolean z;
            if (!(this.f3218b == null || this.f3218b.isEmpty())) {
                for (aa aaVar2 : this.f3218b.values()) {
                    if (aaVar2 != aaVar && aaVar2.f2039b && aaVar2.f2038a.equals(aaVar.f2038a)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                if (aaVar.f2038a.equals("network")) {
                    this.f3219k.removeUpdates(this.f3221m);
                } else if (aaVar.f2038a.equals("gps")) {
                    this.f3219k.removeUpdates(this.f3222n);
                }
            }
            if ((this.f3218b == null || this.f3218b.isEmpty()) && this.f3217a == null) {
                this.f3219k = null;
            }
        }
        if (aaVar != null) {
            aaVar.m1951c();
            aaVar.f2039b = false;
        }
    }

    private boolean m3484a(String str, C0287Z c0287z) {
        boolean z;
        m3490e();
        if (!(this.f3219k == null || c0287z == null || str == null)) {
            try {
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "register(): Trying to register with Android LocationManager...");
                }
                this.f3219k.requestLocationUpdates(str, g, (float) h, c0287z);
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "register(): Successfully registered with Android LocationManager...");
                }
                z = true;
            } catch (IllegalArgumentException e) {
                if (KonyMain.f3657e) {
                    Log.e("KonyLocationManager", e.toString());
                }
                e.printStackTrace();
            }
            if (KonyMain.f3657e) {
                Log.d(f3216j, "register(): Android LocationManager registeration status = " + z);
            }
            return z;
        }
        z = false;
        if (KonyMain.f3657e) {
            Log.d(f3216j, "register(): Android LocationManager registeration status = " + z);
        }
        return z;
    }

    private Location m3485b(long j) {
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getLatestKnownLocation(maximumAge) START: maximumAge = " + j);
        }
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getLatestKnownLocation(maximumAge): Trying to get latest known location...");
        }
        Location j2 = m3494j();
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getLatestKnownLocation(maximumAge) : latest known location = " + j2);
        }
        if (j > 0) {
            if (j2 == null || j2.getTime() < System.currentTimeMillis() - j) {
                j2 = null;
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getLatestKnownLocation(maximumAge): latest known location not available");
                }
            } else if (KonyMain.f3657e) {
                Log.d(f3216j, "getLatestKnownLocation(maximumAge): latest known location found within maximumAge. location=" + j2);
            }
        }
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getLatestKnownLocation(maximumAge) END. location = " + j2);
        }
        return j2;
    }

    private void m3490e() {
        if (this.f3219k == null) {
            Context activityContext = KonyMain.getActivityContext();
            if (activityContext != null) {
                this.f3219k = (LocationManager) activityContext.getSystemService("location");
            }
        }
    }

    private Location m3494j() {
        Location location = null;
        long j = Long.MIN_VALUE;
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getLatestKnownLocation() START {");
        }
        m3490e();
        if (this.f3219k != null) {
            for (String str : this.f3219k.getAllProviders()) {
                long time;
                Location location2;
                Location lastKnownLocation = this.f3219k.getLastKnownLocation(str);
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getLatestKnownLocation(): provider=" + str + "     location=" + lastKnownLocation);
                }
                if (lastKnownLocation != null) {
                    time = lastKnownLocation.getTime();
                    if (time > j) {
                        location2 = lastKnownLocation;
                        location = location2;
                        j = time;
                    }
                }
                time = j;
                location2 = location;
                location = location2;
                j = time;
            }
        }
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getLatestKnownLocation() best location(interms of time) = " + location);
        }
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getLatestKnownLocation() END }");
        }
        return location;
    }

    private void m3495k() {
        if (this.f3217a != null) {
            m3497m();
        }
        m3496l();
    }

    private void m3496l() {
        if (this.f3218b != null && !this.f3218b.isEmpty()) {
            for (aa a : this.f3218b.values()) {
                m3483a(a);
            }
        }
    }

    private void m3497m() {
        if (!(this.f3219k == null || this.f3220l == null)) {
            this.f3219k.removeUpdates(this.f3220l);
        }
        if (this.f3217a != null) {
            this.f3217a.m1951c();
        }
        if (this.f3218b == null || this.f3218b.isEmpty()) {
            this.f3219k = null;
        }
    }

    private C0287Z m3498n() {
        if (this.f3220l == null) {
            this.f3220l = new C0287Z(this, true);
        }
        return this.f3220l;
    }

    private void m3499o() {
        if (this.f3217a != null) {
            this.f3217a.m1951c();
            String a = m3480a(this.f3217a.f2046i, this.f3217a.f2040c);
            if (a == null || !m3484a(a, m3498n())) {
                if (!this.f3217a.f2041d) {
                    this.f3217a.m1946a(c, e);
                }
                m3497m();
                this.f3217a = null;
                return;
            }
            this.f3217a.m1950b();
        }
    }

    private void m3500p() {
        if (this.f3218b != null && !this.f3218b.isEmpty()) {
            for (aa aaVar : this.f3218b.values()) {
                aaVar.m1951c();
                String a = m3480a(aaVar.f2046i, aaVar.f2040c);
                if (a == null || !m3484a(a, m3481a(a))) {
                    aaVar.m1946a(c, e);
                    this.f3218b.remove(aaVar);
                    m3483a(aaVar);
                } else {
                    aaVar.f2039b = true;
                    aaVar.m1950b();
                }
            }
        }
    }

    private void m3501q() {
        m3499o();
        m3500p();
    }

    public final Location m3502a() {
        long currentTimeMillis = System.currentTimeMillis() - i;
        m3490e();
        if (this.f3219k == null) {
            return null;
        }
        float f = AutoScrollHelper.NO_MAX;
        Location location = null;
        long j = Long.MIN_VALUE;
        for (String lastKnownLocation : this.f3219k.getAllProviders()) {
            long time;
            Location location2;
            Location lastKnownLocation2 = this.f3219k.getLastKnownLocation(lastKnownLocation);
            if (lastKnownLocation2 != null) {
                float accuracy = lastKnownLocation2.getAccuracy();
                time = lastKnownLocation2.getTime();
                if (time > currentTimeMillis && accuracy < r4) {
                    j = time;
                    f = accuracy;
                    location = lastKnownLocation2;
                } else if (time < currentTimeMillis && r4 == AutoScrollHelper.NO_MAX && time > j) {
                    location2 = lastKnownLocation2;
                    location = location2;
                    j = time;
                }
            }
            time = j;
            location2 = location;
            location = location2;
            j = time;
        }
        return location;
    }

    public final void m3503a(long j) {
        if (this.f3218b != null && !this.f3218b.isEmpty()) {
            aa aaVar = (aa) this.f3218b.remove(Long.valueOf(j));
            if (aaVar != null) {
                m3483a(aaVar);
            }
        }
    }

    public final void m3504a(Object obj, Object obj2, LuaTable luaTable) {
        boolean booleanValue;
        boolean z;
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getCurrentPosition(START) {");
        }
        long j = -1;
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getCurrentPosition(): options = " + luaTable);
        }
        if (luaTable != null) {
            LuaNil table = luaTable.getTable("maximumAge");
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(): options.maximumAge = " + table);
            }
            if (table != LuaNil.nil) {
                long longValue = ((Double) table).longValue();
                if (longValue > 0) {
                    if (KonyMain.f3657e) {
                        Log.d(f3216j, "getCurrentPosition(): Trying to get latest known location...");
                    }
                    Location b = m3485b(longValue);
                    if (b != null) {
                        if (KonyMain.f3657e) {
                            Log.d(f3216j, "getCurrentPosition(): latest known location found within maximumAge. executing success callback with location=" + b);
                        }
                        ad.m1959a(obj, b);
                        if (KonyMain.f3657e) {
                            Log.d(f3216j, "getCurrentPosition(END) }");
                            return;
                        }
                        return;
                    } else if (KonyMain.f3657e) {
                        Log.d(f3216j, "getCurrentPosition(): latest known location not available within maximumAge limit");
                    }
                }
            }
            table = luaTable.getTable("timeout");
            if (table != LuaNil.nil) {
                j = ((Double) table).longValue();
            }
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(): options.timeout=" + j);
            }
            if (j == 0) {
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getCurrentPosition(): Executing error callback since timeout given 0");
                }
                ad.m1958a(obj2, (int) d, f);
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getCurrentPosition(END) }");
                    return;
                }
                return;
            }
            table = luaTable.getTable("enableHighAccuracy");
            boolean booleanValue2 = table != LuaNil.nil ? ((Boolean) table).booleanValue() : false;
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(): options.enableHighAccuracy=" + booleanValue2);
            }
            table = luaTable.getTable("useBestProvider");
            booleanValue = table != LuaNil.nil ? ((Boolean) table).booleanValue() : false;
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(): options.useBestProvider=" + booleanValue);
            }
            z = booleanValue2;
        } else {
            booleanValue = false;
            z = false;
        }
        String a = m3480a(z, booleanValue);
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getCurrentPosition(): based on options, applicable provider = " + a);
        }
        if (this.f3217a != null) {
            m3497m();
        }
        if (a == null || !m3484a(a, m3498n())) {
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(): Regsiration failed (no provider OR registartion with Android failed). Executing error callback");
            }
            m3497m();
            ad.m1958a(obj2, (int) c, e);
            this.f3217a = null;
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(END) }");
                return;
            }
            return;
        }
        boolean z2;
        long j2;
        if (booleanValue) {
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(): useBestProvider is true, Trying for latest known location again after registration,...");
            }
            Location b2 = m3485b(0);
            if (KonyMain.f3657e) {
                Log.d(f3216j, "getCurrentPosition(): After registration, latest known location = " + b2);
            }
            if (b2 != null) {
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getCurrentPosition(): After registration, latest known location found executing sucess callback with location = " + b2);
                }
                ad.m1959a(obj, b2);
                z2 = true;
                j2 = 60000;
                if (this.f3217a == null) {
                    this.f3217a = new aa(this, true);
                }
                this.f3217a.m1948a(obj, obj2, j2, z, a);
                this.f3217a.m1949a(booleanValue);
                this.f3217a.m1945a();
                this.f3217a.f2041d = z2;
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getCurrentPosition(): Successfully registered. Waiting for Location ... ");
                }
                if (KonyMain.f3657e) {
                    Log.d(f3216j, "getCurrentPosition(END) }");
                }
            }
        }
        z2 = false;
        j2 = j;
        if (this.f3217a == null) {
            this.f3217a = new aa(this, true);
        }
        this.f3217a.m1948a(obj, obj2, j2, z, a);
        this.f3217a.m1949a(booleanValue);
        this.f3217a.m1945a();
        this.f3217a.f2041d = z2;
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getCurrentPosition(): Successfully registered. Waiting for Location ... ");
        }
        if (KonyMain.f3657e) {
            Log.d(f3216j, "getCurrentPosition(END) }");
        }
    }

    public final long m3505b(Object obj, Object obj2, LuaTable luaTable) {
        boolean z = false;
        long j = -1;
        if (luaTable != null) {
            LuaNil table = luaTable.getTable("maximumAge");
            if (table != LuaNil.nil) {
                int intValue = ((Double) table).intValue();
                Location j2 = m3494j();
                if (j2 != null && j2.getTime() >= System.currentTimeMillis() - ((long) intValue)) {
                    ad.m1959a(obj, j2);
                }
            }
            table = luaTable.getTable("timeout");
            if (table != LuaNil.nil) {
                j = ((Double) table).longValue();
            }
            if (j == 0) {
                ad.m1958a(obj2, (int) d, f);
                return 0;
            }
            table = luaTable.getTable("enableHighAccuracy");
            if (table != LuaNil.nil) {
                z = ((Boolean) table).booleanValue();
            }
        }
        String a = m3480a(z, false);
        if (a == null || !m3484a(a, m3481a(a))) {
            ad.m1958a(obj2, (int) c, e);
            return 0;
        }
        if (this.f3218b == null) {
            this.f3218b = new Hashtable();
        }
        aa aaVar = new aa(this, false);
        aaVar.m1948a(obj, obj2, j, z, a);
        long g = ad.m1962g();
        this.f3218b.put(Long.valueOf(g), aaVar);
        if (j > 0) {
            aaVar.m1950b();
        }
        return g;
    }

    public final void m3506b() {
        m3501q();
    }

    public final void m3507c() {
        m3495k();
    }
}
