package ny0k;

import android.hardware.SensorEvent;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class aM implements aO {
    private Object f3249a;
    private Object f3250b;
    private /* synthetic */ aK f3251c;

    public aM(aK aKVar, Object obj, Object obj2) {
        this.f3251c = aKVar;
        this.f3249a = null;
        this.f3250b = null;
        this.f3249a = obj;
        this.f3250b = obj2;
    }

    public final void m3532a(int i, SensorEvent sensorEvent) {
        try {
            this.f3251c.f3230b = System.currentTimeMillis();
            if (this.f3249a != null && this.f3251c.f3236i) {
                aK.m3516a(this.f3251c, this.f3249a, sensorEvent);
            } else if (this.f3249a != null && this.f3251c.f3230b > this.f3251c.f3231c + ((long) this.f3251c.f3237j)) {
                aK.m3516a(this.f3251c, this.f3249a, sensorEvent);
                this.f3251c.f3231c = this.f3251c.f3230b;
            }
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAccelerometerObserver", "MonitorSensorEvent error:" + e.getMessage());
            }
            m3533a(e.getMessage());
        }
    }

    public final void m3533a(String str) {
        if (this.f3250b != null) {
            aK.m3517a(this.f3251c, this.f3250b, str);
        }
    }
}
