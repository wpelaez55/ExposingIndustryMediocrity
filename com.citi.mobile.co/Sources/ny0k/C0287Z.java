package ny0k;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;
import com.konylabs.android.KonyMain;

/* renamed from: ny0k.Z */
final class C0287Z implements LocationListener {
    private boolean f1926a;
    private /* synthetic */ C0425Y f1927b;

    public C0287Z(C0425Y c0425y, boolean z) {
        this.f1927b = c0425y;
        this.f1926a = false;
        this.f1926a = z;
    }

    public final void onLocationChanged(Location location) {
        if (KonyMain.f3657e && KonyMain.f3657e) {
            Log.d("HTML5-KonyLocationManager", " ########## Kony Location :[ " + location + " ]##########");
        }
        if (KonyMain.f3657e) {
            Log.d(C0425Y.f3216j, "KonyLocationListener.onLocationChanged() : Location received from Android location manager location=" + location);
        }
        if (this.f1926a) {
            if (this.f1927b.f3217a != null && location != null) {
                if (!this.f1927b.f3217a.f2041d) {
                    if (KonyMain.f3657e) {
                        Log.d(C0425Y.f3216j, "KonyLocationListener.onLocationChanged(oneShot) : Executing success callback with received location=" + location);
                    }
                    this.f1927b.f3217a.m1947a(location);
                }
                this.f1927b.m3497m();
                this.f1927b.f3217a = null;
            }
        } else if (this.f1927b.f3218b != null && !this.f1927b.f3218b.isEmpty()) {
            for (aa aaVar : this.f1927b.f3218b.values()) {
                String provider = location.getProvider();
                if (provider == null) {
                    if (KonyMain.f3657e) {
                        Log.d(C0425Y.f3216j, "KonyLocationListener.onLocationChanged(watchPos) : Executing success callback with received location");
                    }
                    aaVar.m1947a(location);
                } else if (provider.equals(aaVar.f2038a)) {
                    if (KonyMain.f3657e) {
                        Log.d(C0425Y.f3216j, "KonyLocationListener.onLocationChanged(watchPos) : Executing success callback with received location");
                    }
                    aaVar.m1947a(location);
                }
                aaVar.m1945a();
            }
        }
    }

    public final void onProviderDisabled(String str) {
        if (KonyMain.f3657e) {
            Log.d(C0425Y.f3216j, "KonyLocationListener.onProviderDisabled() provider=" + str);
        }
        if (this.f1927b.f3219k != null) {
            if (!(this.f1927b.f3217a == null || this.f1927b.f3217a.f2040c)) {
                this.f1927b.m3497m();
                this.f1927b.m3499o();
            }
            this.f1927b.m3496l();
            this.f1927b.m3500p();
        }
    }

    public final void onProviderEnabled(String str) {
        if (KonyMain.f3657e) {
            Log.d(C0425Y.f3216j, "KonyLocationListener.onProviderEnabled() provider=" + str);
        }
        this.f1927b.m3495k();
        this.f1927b.m3501q();
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        if (KonyMain.f3657e) {
            Log.d(C0425Y.f3216j, "KonyLocationListener.onStatusChanged() provider=" + str + "  status=" + i);
        }
        if (i != 0 && i != 1) {
            return;
        }
        if (this.f1926a) {
            if (this.f1927b.f3217a != null && this.f1927b.f3217a.f2038a.equals(str)) {
                if (!this.f1927b.f3217a.f2041d) {
                    if (KonyMain.f3657e) {
                        Log.d(C0425Y.f3216j, "KonyLocationListener.onStatusChanged(oneShot) Executing error callback");
                    }
                    this.f1927b.f3217a.m1946a(ad.f2061c, ad.f2063e);
                }
                this.f1927b.m3497m();
                this.f1927b.f3217a = null;
            }
        } else if (this.f1927b.f3218b != null && !this.f1927b.f3218b.isEmpty()) {
            for (aa aaVar : this.f1927b.f3218b.values()) {
                if (KonyMain.f3657e) {
                    Log.d(C0425Y.f3216j, "KonyLocationListener.onStatusChanged(watchPos) Executing error callback");
                }
                aaVar.m1946a(ad.f2061c, ad.f2063e);
                aaVar.m1945a();
            }
        }
    }
}
