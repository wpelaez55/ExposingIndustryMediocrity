package ny0k;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import android.util.SparseArray;
import com.konylabs.android.KonyMain;

public final class aR implements SensorEventListener {
    public static SparseArray f2020a;
    private static aR f2021b;
    private Context f2022c;
    private SensorManager f2023d;
    private SparseArray f2024e;

    static {
        f2021b = null;
        f2020a = new SparseArray();
    }

    public aR() {
        this.f2023d = null;
        this.f2024e = new SparseArray();
        this.f2022c = KonyMain.getAppContext();
        this.f2023d = (SensorManager) this.f2022c.getApplicationContext().getSystemService("sensor");
        m1930b();
    }

    public static aR m1929a() {
        if (f2021b == null) {
            f2021b = new aR();
        }
        return f2021b;
    }

    private void m1930b() {
        for (Sensor type : this.f2023d.getSensorList(-1)) {
            int type2 = type.getType();
            f2020a.put(type2, Integer.valueOf(type2));
        }
    }

    public final void m1931a(int i) {
        this.f2024e.remove(i);
        if (this.f2024e.size() <= 0) {
            if (KonyMain.f3657e) {
                Log.d("KonySensorManager", "Stop()....");
            }
            this.f2023d.unregisterListener(this);
        }
    }

    public final void m1932a(int i, aQ aQVar) {
        this.f2024e.put(i, aQVar);
    }

    public final void m1933b(int i) throws Exception {
        if (f2020a.get(i) != null) {
            this.f2023d.registerListener(this, this.f2023d.getDefaultSensor(i), 3);
        } else if (KonyMain.f3657e) {
            Log.d("KonySensorManager", "Phone does not support this sensor type " + i);
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            int type = sensorEvent.sensor.getType();
            aQ aQVar = (aQ) this.f2024e.get(type);
            if (aQVar != null) {
                aQVar.m1928a(type, sensorEvent);
            }
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonySensorManager", "Disabling onSensorEvent() because of an error:" + e.getMessage());
            }
        }
    }
}
