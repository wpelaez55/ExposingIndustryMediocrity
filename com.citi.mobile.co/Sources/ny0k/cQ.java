package ny0k;

import android.os.Handler;
import com.konylabs.js.api.KonyJSObject;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaTable;
import com.konylabs.vmintf.KonyJSVM;
import java.util.Vector;

public final class cQ extends KonyJSObject implements cP {
    public String f3628a;
    Vector f3629b;
    Vector f3630c;
    private cW f3631d;
    private cQ f3632e;
    private Handler f3633f;

    public cQ(Object[] objArr, long j) {
        this.f3631d = null;
        this.f3632e = null;
        this.f3628a = null;
        this.f3629b = new Vector();
        this.f3630c = new Vector();
        this.f3633f = new cV(this);
        this.ap = KonyJSVM.createPersistent(j);
        this.f3628a = (String) objArr[0];
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof cW) {
            this.f3632e = ((cW) currentThread).m3868c();
        }
        String str = this.f3628a;
        boolean a = (str == null || str.trim().length() == 0) ? false : str.endsWith(".js") ? true : C0281O.m1813a(str);
        if (a) {
            this.f3631d = new cW(this);
            if (currentThread instanceof cW) {
                ((cW) currentThread).m3863a(this.f3631d);
            }
            this.f3631d.start();
            return;
        }
        this.f3633f.post(new cR(this));
    }

    public final void m4046a() {
        if (this.f3631d != null) {
            this.f3631d.m3858a();
            this.f3631d = null;
        }
    }

    public final void m4047a(LuaTable luaTable) {
        while (true) {
            this.f3633f.post(new cT(this, luaTable));
            if (this.f3632e != null) {
                this = this.f3632e;
            } else {
                return;
            }
        }
    }

    public final void m4048a(Object obj) {
        if (this.f3631d != null) {
            this.f3631d.m3866b(obj);
        }
    }

    public final void m4049a(String str, Function function) {
        if (str.equals("message")) {
            this.f3629b.add(function);
        } else if (str.equals("error")) {
            this.f3630c.add(function);
        }
    }

    public final boolean m4050a(Object[] objArr) {
        return false;
    }

    public final void m4051b() {
        if (this.f3633f != null) {
            this.f3633f.post(new cU(this));
        }
    }

    public final void m4052b(Object obj) {
        if (obj != null) {
            this.f3633f.post(new cS(this, obj));
        }
    }

    public final void m4053b(String str, Function function) {
        Vector vector = str.equals("message") ? this.f3629b : str.equals("error") ? this.f3630c : null;
        if (vector != null && vector.size() > 0) {
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                if (function.equals(vector.get(i))) {
                    vector.remove(i);
                    return;
                }
            }
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
    }
}
