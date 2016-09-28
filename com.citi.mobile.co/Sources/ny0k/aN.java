package ny0k;

import android.hardware.SensorEvent;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class aN implements aO {
    private Object f3252a;
    private Object f3253b;
    private /* synthetic */ aK f3254c;

    public aN(aK aKVar, Object obj, Object obj2) {
        this.f3254c = aKVar;
        this.f3252a = null;
        this.f3253b = null;
        this.f3252a = obj;
        this.f3253b = obj2;
    }

    public final void m3534a(int i, SensorEvent sensorEvent) {
        try {
            if (this.f3254c.f3232d != null) {
                aK.m3516a(this.f3254c, this.f3252a, sensorEvent);
                this.f3252a = null;
                this.f3253b = null;
                this.f3254c.m3527a((aO) this);
            }
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAccelerometerObserver", "RetriveSensorEvent error:" + e.getMessage());
            }
            m3535a(e.getMessage());
        }
    }

    public final void m3535a(String str) {
        if (this.f3253b != null) {
            aK.m3517a(this.f3254c, this.f3253b, str);
        }
    }
}
