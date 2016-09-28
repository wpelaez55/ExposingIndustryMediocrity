package ny0k;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;

public final class ac implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener, Runnable {
    private LocationClient f2048a;
    private Object f2049b;
    private Object f2050c;
    private boolean f2051d;
    private long f2052e;
    private long f2053f;
    private long f2054g;
    private boolean f2055h;
    private boolean f2056i;
    private boolean f2057j;
    private /* synthetic */ ab f2058k;

    public ac(ab abVar, Object obj, Object obj2, LuaTable luaTable, boolean z) {
        this.f2058k = abVar;
        this.f2048a = null;
        this.f2049b = null;
        this.f2050c = null;
        this.f2051d = true;
        this.f2052e = 0;
        this.f2053f = 0;
        this.f2054g = 0;
        this.f2055h = false;
        this.f2056i = false;
        this.f2057j = false;
        this.f2049b = obj;
        this.f2050c = obj2;
        this.f2051d = z;
        if (luaTable != null) {
            Object table = luaTable.getTable("enableHighAccuracy");
            if (table instanceof Boolean) {
                this.f2055h = ((Boolean) table).booleanValue();
            }
            table = luaTable.getTable("timeout");
            if (table instanceof Double) {
                this.f2053f = ((Double) table).longValue();
            }
            table = luaTable.getTable("maximumAge");
            if (table instanceof Double) {
                this.f2054g = ((Double) table).longValue();
            }
        }
    }

    private void m1952c() {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "startTimer()");
        }
        if (this.f2053f > 0) {
            KonyMain.m4095a((Runnable) this, this.f2053f);
        }
    }

    private void m1953d() {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "restartTimer()");
        }
        if (this.f2053f > 0) {
            m1954e();
            m1952c();
        }
    }

    private void m1954e() {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "cancelTimer()");
        }
        if (this.f2053f > 0) {
            KonyMain.m4096a((Runnable) this, null);
        }
    }

    public final void m1955a() {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "register()");
        }
        this.f2057j = false;
        this.f2048a = new LocationClient(KonyMain.getAppContext(), this, this);
        this.f2048a.connect();
        m1952c();
    }

    public final void m1956a(long j) {
        this.f2052e = j;
    }

    public final void m1957b() {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "unregister()");
        }
        if (this.f2048a != null && (this.f2048a.isConnected() || this.f2048a.isConnecting())) {
            this.f2048a.removeLocationUpdates(this);
            this.f2048a.disconnect();
        }
        m1954e();
        this.f2048a = null;
        this.f2057j = true;
    }

    public final void onConnected(Bundle bundle) {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "onConnected(): bundle=" + bundle);
        }
        if (this.f2048a != null && !this.f2057j) {
            if (KonyMain.f3657e) {
                Log.d(ab.f3259j, "onConnected(): Checking for last known location...");
            }
            Location lastLocation = this.f2048a.getLastLocation();
            if (KonyMain.f3657e) {
                Log.d(ab.f3259j, "onConnected(): last known location = " + lastLocation);
            }
            if (lastLocation != null && lastLocation.getTime() >= System.currentTimeMillis() - this.f2054g) {
                if (KonyMain.f3657e) {
                    Log.d(ab.f3259j, "onConnected(): last known location found within maximumAge limit. Executing success callback with location=" + lastLocation);
                }
                ab abVar = this.f2058k;
                ad.m1959a(this.f2049b, lastLocation);
                if (this.f2051d) {
                    this.f2056i = true;
                    this.f2053f = 60000;
                    m1953d();
                }
            }
            LocationRequest create = LocationRequest.create();
            if (this.f2055h) {
                create.setPriority(100);
            } else {
                create.setPriority(102);
            }
            if (this.f2051d) {
                create.setNumUpdates(1);
            } else {
                create.setInterval(ad.f2065g);
                create.setFastestInterval(ad.f2065g);
                create.setSmallestDisplacement((float) ad.f2066h);
            }
            this.f2048a.requestLocationUpdates(create, this);
        } else if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "onConnected(): locServClient is null");
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "onConnectionFailed() ConnectionResult=" + connectionResult);
        }
        if (!this.f2057j && this.f2050c != null) {
            if (!this.f2056i) {
                ab abVar = this.f2058k;
                ad.m1958a(this.f2050c, (int) ad.f2061c, ad.f2063e);
            }
            m1957b();
            if (this.f2051d) {
                ab.f3257a = null;
            } else {
                ab.f3258b.remove(Long.valueOf(this.f2052e));
            }
        }
    }

    public final void onDisconnected() {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "onDisconnected()");
        }
        if (!this.f2057j && this.f2051d) {
            if (!this.f2056i) {
                ab abVar = this.f2058k;
                ad.m1958a(this.f2050c, (int) ad.f2061c, ad.f2063e);
            }
            m1957b();
            ab.f3257a = null;
        }
    }

    public final void onLocationChanged(Location location) {
        if (KonyMain.f3657e) {
            Log.d(ab.f3259j, "onLocationChanged() location=" + location);
        }
        if (!this.f2057j && this.f2049b != null) {
            if (!this.f2056i) {
                ab abVar = this.f2058k;
                ad.m1959a(this.f2049b, location);
            }
            if (this.f2051d) {
                m1957b();
                ab.f3257a = null;
                return;
            }
            m1953d();
        }
    }

    public final void run() {
        if (!this.f2057j) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                KonyMain.m4121f().post(this);
                return;
            }
            if (KonyMain.f3657e) {
                Log.d(ab.f3259j, "run(TIMEOUT)");
            }
            if (!this.f2057j && this.f2050c != null) {
                if (!this.f2056i) {
                    ab abVar = this.f2058k;
                    ad.m1958a(this.f2050c, (int) ad.f2062d, ad.f2064f);
                }
                if (this.f2051d) {
                    m1957b();
                    ab.f3257a = null;
                    return;
                }
                m1953d();
            }
        }
    }
}
