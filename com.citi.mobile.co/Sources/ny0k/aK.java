package ny0k;

import android.hardware.SensorEvent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public final class aK implements aQ {
    private static aK f3228g;
    HashMap f3229a;
    long f3230b;
    long f3231c;
    private aN f3232d;
    private aM f3233e;
    private aL f3234f;
    private ArrayList f3235h;
    private boolean f3236i;
    private int f3237j;
    private String f3238k;
    private float f3239l;
    private float f3240m;
    private float f3241n;
    private float f3242o;
    private float f3243p;
    private float f3244q;
    private long f3245r;
    private long f3246s;
    private int f3247t;

    static {
        f3228g = null;
    }

    private aK() {
        this.f3232d = null;
        this.f3233e = null;
        this.f3234f = null;
        this.f3235h = new ArrayList();
        this.f3236i = false;
        this.f3237j = 200;
        this.f3238k = "shake";
        this.f3229a = null;
        this.f3239l = 0.0f;
        this.f3240m = 0.0f;
        this.f3241n = 0.0f;
        this.f3242o = -1.0f;
        this.f3243p = -1.0f;
        this.f3244q = -1.0f;
        this.f3230b = 0;
        this.f3231c = 0;
        this.f3245r = 0;
        this.f3247t = 0;
        aR.m1929a().m1932a(1, this);
    }

    public static aK m3512a() {
        if (f3228g == null) {
            f3228g = new aK();
        }
        return f3228g;
    }

    private void m3514a(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonyAccelerometerObserver", "Disabling onAccelerometerSensorEvent() because of an error:" + str);
        }
        int size = this.f3235h.size();
        for (int i = 0; i < size; i++) {
            ((aO) this.f3235h.get(i)).m1926a(str);
        }
    }

    static /* synthetic */ void m3515a(aK aKVar, SensorEvent sensorEvent) {
        if (aKVar.f3229a != null && aKVar.f3229a.size() > 0) {
            Set keySet = aKVar.f3229a.keySet();
            int size = keySet.size();
            String[] strArr = (String[]) keySet.toArray(new String[size]);
            for (int i = 0; i < size; i++) {
                if (strArr[i].equalsIgnoreCase(aKVar.f3238k)) {
                    aKVar.f3239l = sensorEvent.values[0];
                    aKVar.f3240m = sensorEvent.values[1];
                    aKVar.f3241n = sensorEvent.values[2];
                    if (Math.abs(((((aKVar.f3239l + aKVar.f3240m) + aKVar.f3241n) - aKVar.f3242o) - aKVar.f3243p) - aKVar.f3244q) > 10.0f) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (aKVar.f3245r == 0) {
                            aKVar.f3245r = currentTimeMillis;
                            aKVar.f3246s = currentTimeMillis;
                        }
                        if (currentTimeMillis - aKVar.f3246s < 300) {
                            aKVar.f3246s = currentTimeMillis;
                            aKVar.f3247t++;
                            aKVar.f3242o = aKVar.f3239l;
                            aKVar.f3243p = aKVar.f3240m;
                            aKVar.f3244q = aKVar.f3241n;
                            if (aKVar.f3247t >= 2 && currentTimeMillis - aKVar.f3245r < 200) {
                                Message obtain = Message.obtain();
                                obtain.what = 1;
                                obtain.obj = aKVar.f3229a.get(aKVar.f3238k);
                                KonyMain.m4121f().sendMessage(obtain);
                                aKVar.m3521c();
                            }
                        } else {
                            aKVar.m3521c();
                        }
                    }
                }
            }
        }
    }

    static /* synthetic */ void m3516a(aK aKVar, Object obj, SensorEvent sensorEvent) {
        if (obj != null) {
            Serializable luaTable = new LuaTable();
            luaTable.setTable("x", new Double((double) sensorEvent.values[0]));
            luaTable.setTable("y", new Double((double) sensorEvent.values[1]));
            luaTable.setTable("z", new Double((double) sensorEvent.values[2]));
            luaTable.setTable("timestamp", new Double((double) sensorEvent.timestamp));
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = obj;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key0", luaTable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    static /* synthetic */ void m3517a(aK aKVar, Object obj, String str) {
        if (obj != null) {
            Serializable luaTable = new LuaTable();
            luaTable.setTable("message", str);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = obj;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key0", luaTable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    private void m3518b(aO aOVar) {
        this.f3235h.add(aOVar);
        if (this.f3235h.size() == 1) {
            try {
                aR.m1929a().m1933b(1);
            } catch (Exception e) {
                throw new LuaError(100, "Error", "Error in starting Accelerometer." + e.getMessage());
            }
        }
    }

    private void m3521c() {
        this.f3245r = 0;
        this.f3247t = 0;
        this.f3246s = 0;
        this.f3242o = 0.0f;
        this.f3243p = 0.0f;
        this.f3244q = 0.0f;
    }

    public final void m3523a(int i, SensorEvent sensorEvent) {
        if (i == 1) {
            try {
                int size = this.f3235h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((aO) this.f3235h.get(i2)).m1925a(1, sensorEvent);
                }
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d("KonyAccelerometerObserver", "Disabling onAccelerometerSensorEvent() because of an error:" + e.getMessage());
                }
                m3514a(e.getMessage());
            }
        }
    }

    public final void m3524a(Object obj) {
        LuaTable luaTable = (LuaTable) obj;
        if (luaTable != null) {
            Hashtable hashtable = luaTable.map;
            if (hashtable != null && hashtable.size() > 0) {
                if (this.f3229a == null) {
                    this.f3229a = new HashMap();
                }
                for (String str : hashtable.keySet()) {
                    this.f3229a.put(str, hashtable.get(str));
                }
            }
        }
        this.f3234f = new aL(this);
        m3518b(this.f3234f);
    }

    public final void m3525a(Object obj, Object obj2) {
        this.f3232d = new aN(this, obj, obj2);
        m3518b(this.f3232d);
    }

    public final void m3526a(Object obj, Object obj2, Object obj3) {
        LuaTable luaTable = (LuaTable) obj3;
        if (luaTable != null) {
            LuaNil table = luaTable.getTable("frequency");
            if (!(table == null || table == LuaNil.nil)) {
                int intValue = ((Double) table).intValue();
                if (intValue < 0) {
                    intValue = this.f3237j;
                }
                this.f3237j = intValue;
            }
            table = luaTable.getTable("onchange");
            if (!(table == null || table == LuaNil.nil)) {
                this.f3236i = ((Boolean) table).booleanValue();
            }
            table = luaTable.getTable("threshold");
            if (!(table == null || table == LuaNil.nil)) {
                ((Float) table).floatValue();
            }
        }
        this.f3233e = new aM(this, obj, obj2);
        m3518b(this.f3233e);
    }

    public final void m3527a(aO aOVar) {
        this.f3235h.remove(aOVar);
        if (this.f3235h.size() <= 0) {
            aR.m1929a().m1931a(1);
            f3228g = null;
        }
    }

    public final void m3528b() {
        if (this.f3233e != null) {
            m3527a(this.f3233e);
        }
    }

    public final void m3529b(Object obj) {
        LuaTable luaTable = (LuaTable) obj;
        if (luaTable != null) {
            Vector vector = luaTable.list;
            if (this.f3229a != null && vector != null) {
                int size = vector.size();
                for (int i = 0; i < size; i++) {
                    this.f3229a.remove(vector.get(i));
                }
                if (this.f3229a.size() <= 0 && this.f3234f != null) {
                    m3527a(this.f3234f);
                }
            }
        }
    }
}
