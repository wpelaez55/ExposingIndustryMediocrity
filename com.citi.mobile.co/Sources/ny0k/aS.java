package ny0k;

import android.hardware.SensorEvent;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import java.util.ArrayList;

public final class aS implements aQ {
    private static aS f3255a;
    private ArrayList f3256b;

    static {
        f3255a = null;
    }

    private aS() {
        this.f3256b = new ArrayList();
        aR.m1929a().m1932a(3, this);
    }

    public static aS m3536a() {
        if (f3255a == null) {
            f3255a = new aS();
        }
        return f3255a;
    }

    private void m3537a(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonyOrientationObserver", "Disabling onOrientationSensorEvent() because of an error:" + str);
        }
        int size = this.f3256b.size();
        for (int i = 0; i < size; i++) {
            this.f3256b.get(i);
        }
    }

    public final void m3538a(int i, SensorEvent sensorEvent) {
        if (i == 3) {
            try {
                int size = this.f3256b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aP aPVar = (aP) this.f3256b.get(i2);
                    if (aPVar != null) {
                        aPVar.m1927a(3, sensorEvent);
                    }
                }
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d("KonyOrientationObserver", "Disabling onOrientationSensorEvent() because of an error:" + e.getMessage());
                }
                m3537a(e.getMessage());
            }
        }
    }

    public final void m3539a(Object obj) {
        this.f3256b.remove(obj);
        if (this.f3256b.size() <= 0) {
            aR.m1929a().m1931a(3);
            f3255a = null;
        }
    }

    public final void m3540a(aP aPVar) {
        if (!this.f3256b.contains(aPVar)) {
            this.f3256b.add(aPVar);
            if (this.f3256b.size() == 1) {
                try {
                    aR.m1929a().m1933b(3);
                } catch (Exception e) {
                    throw new LuaError("Error in starting Sensor Manager. " + e.getMessage(), 100);
                }
            }
        }
    }
}
