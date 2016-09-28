package ny0k;

import android.hardware.SensorEvent;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class aL implements aO {
    private /* synthetic */ aK f3248a;

    aL(aK aKVar) {
        this.f3248a = aKVar;
    }

    public final void m3530a(int i, SensorEvent sensorEvent) {
        try {
            if (this.f3248a.f3234f != null && this.f3248a.f3229a != null && this.f3248a.f3229a.size() > 0) {
                aK.m3515a(this.f3248a, sensorEvent);
            }
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAccelerometerObserver", "MonitorSensorEventType error:" + e.getMessage());
            }
        }
    }

    public final void m3531a(String str) {
    }
}
