package ny0k;

import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class aa implements Runnable {
    public String f2038a;
    public boolean f2039b;
    public boolean f2040c;
    public boolean f2041d;
    private Object f2042e;
    private Object f2043f;
    private long f2044g;
    private boolean f2045h;
    private boolean f2046i;
    private /* synthetic */ C0425Y f2047j;

    public aa(C0425Y c0425y, boolean z) {
        this.f2047j = c0425y;
        this.f2042e = null;
        this.f2043f = null;
        this.f2044g = -1;
        this.f2045h = false;
        this.f2046i = false;
        this.f2038a = null;
        this.f2039b = true;
        this.f2040c = false;
        this.f2041d = false;
        this.f2045h = z;
    }

    public final void m1945a() {
        if (KonyMain.getActivityContext() != null) {
            KonyMain.m4096a((Runnable) this, null);
            if (this.f2044g > 0) {
                KonyMain.m4095a((Runnable) this, this.f2044g);
            }
        }
    }

    public final void m1946a(int i, String str) {
        C0425Y c0425y = this.f2047j;
        ad.m1958a(this.f2043f, i, str);
    }

    public final void m1947a(Location location) {
        C0425Y c0425y = this.f2047j;
        ad.m1959a(this.f2042e, location);
    }

    public final void m1948a(Object obj, Object obj2, long j, boolean z, String str) {
        this.f2042e = obj;
        this.f2043f = obj2;
        this.f2044g = j;
        this.f2046i = z;
        this.f2038a = str;
    }

    public final void m1949a(boolean z) {
        this.f2040c = z;
    }

    public final void m1950b() {
        if (KonyMain.getActivityContext() != null && this.f2044g > 0) {
            KonyMain.m4095a((Runnable) this, this.f2044g);
        }
    }

    public final void m1951c() {
        if (KonyMain.getActivityContext() != null && this.f2044g > 0) {
            KonyMain.m4096a((Runnable) this, null);
        }
    }

    public final void run() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            KonyMain.m4121f().post(this);
        } else if (this.f2043f != null) {
            if (KonyMain.f3657e) {
                Log.d(C0425Y.f3216j, "LocationWatchClient.run(timeout): useBestProvider=" + this.f2040c);
            }
            if (this.f2040c && !this.f2041d) {
                if (KonyMain.f3657e) {
                    Log.d(C0425Y.f3216j, "LocationWatchClient.run(timeout): useBestProvider is true, Trying to get latest known location again");
                }
                Location a = this.f2047j.m3485b(0);
                if (KonyMain.f3657e) {
                    Log.d(C0425Y.f3216j, "LocationWatchClient.run(timeout): latest known location in timeout, location = " + a);
                }
                if (!(a == null || this.f2042e == null)) {
                    if (KonyMain.f3657e) {
                        Log.d(C0425Y.f3216j, "LocationWatchClient.run(timeout): latest known location found in timeout. executing success callback with location=" + a);
                    }
                    m1947a(a);
                    if (this.f2045h) {
                        this.f2047j.m3497m();
                        this.f2047j.f3217a = null;
                        return;
                    }
                }
            }
            if (!this.f2041d) {
                if (KonyMain.f3657e) {
                    Log.d(C0425Y.f3216j, "LocationWatchClient.run(timeout): Executing error callback due to timeout");
                }
                m1946a(ad.f2062d, ad.f2064f);
            }
            if (this.f2045h) {
                this.f2047j.m3497m();
                this.f2047j.f3217a = null;
                return;
            }
            m1945a();
        }
    }
}
