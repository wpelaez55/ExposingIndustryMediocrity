package com.konylabs.vm;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.js.api.KonyJSObject;
import java.io.Serializable;
import ny0k.cW;

public class Function implements Serializable {
    private C0239c f1782a;
    public Object f1783b;
    public C0251q[] f1784c;
    public boolean f1785d;
    private long f1786e;
    private String f1787f;
    private int f1788g;
    private transient C0245j f1789h;

    public Function() {
        this.f1783b = null;
        this.f1784c = null;
        this.f1785d = true;
        this.f1782a = null;
        this.f1786e = 0;
        this.f1787f = null;
        this.f1788g = 0;
        this.f1789h = null;
    }

    public Function(long j, String str, int i) {
        this.f1783b = null;
        this.f1784c = null;
        this.f1785d = true;
        this.f1782a = null;
        this.f1786e = 0;
        this.f1787f = null;
        this.f1788g = 0;
        this.f1789h = null;
        this.f1786e = j;
        this.f1787f = str;
        this.f1788g = i;
        this.f1789h = KonyMain.m4061G();
    }

    public Function(Object obj, boolean z) {
        this.f1783b = null;
        this.f1784c = null;
        this.f1785d = true;
        this.f1782a = null;
        this.f1786e = 0;
        this.f1787f = null;
        this.f1788g = 0;
        this.f1789h = null;
        this.f1785d = z;
        this.f1783b = obj;
    }

    private synchronized Object[] m1635a(Object[] objArr) throws Exception {
        Object[] a;
        if (KonyMain.f3657e) {
            Log.d("VM Function", " Non Synchronized Function.execute called.");
        }
        try {
            if (this.f1785d) {
                C0241e c0241e = (C0241e) this.f1783b;
                if (KonyMain.f3657e) {
                    Log.d("VM Function", "Executing the Lua Function");
                }
                C0246k c0246k = new C0246k();
                c0246k.m1731a(objArr != null ? Math.max(c0241e.f1828h, objArr.length) : c0241e.f1828h);
                int i = 0;
                while (objArr != null && i < objArr.length) {
                    c0246k.f1844a[i] = objArr[i];
                    i++;
                }
                this.f1782a = new C0239c();
                C0242f a2 = C0242f.m1681a(this.f1782a);
                if (KonyMain.f3657e) {
                    Log.d("VM Function", "Dispathcing the function");
                }
                a = a2.m1720a(this, c0246k, false);
            } else {
                a = ((C0243h) this.f1783b).m1724a(objArr);
            }
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("VM Function", "execute", e);
            }
            throw e;
        }
        return a;
    }

    public final boolean m1636a() {
        return this.f1785d;
    }

    public final synchronized Object[] m1637a(Object[] objArr, KonyJSObject konyJSObject) throws Exception {
        Object[] a;
        if (KonyMain.m4056B()) {
            a = m1635a(objArr);
        } else if (konyJSObject != null) {
            try {
                long jSObject = konyJSObject.getJSObject();
                a = jSObject != 0 ? executeJS(this.f1786e, objArr, jSObject) : null;
            } catch (Exception e) {
                Exception exception = e;
                Thread currentThread = Thread.currentThread();
                if (currentThread instanceof cW) {
                    ((cW) currentThread).m3859a(exception);
                }
                throw exception;
            }
        } else {
            a = executeJS(this.f1786e, objArr, 0);
        }
        return a;
    }

    public final boolean m1638b() {
        return this.f1789h == null || this.f1789h.f1843a != null;
    }

    public final C0245j m1639c() {
        C0245j c0245j = this.f1789h;
        return c0245j == null ? KonyMain.m4125g() : c0245j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Function) {
            Function function = (Function) obj;
            if (this.f1787f != null && this.f1787f.equals(function.f1787f) && this.f1788g == function.f1788g) {
                return true;
            }
        }
        return false;
    }

    public synchronized Object[] execute(Object[] objArr) throws Exception {
        Object[] a;
        if (KonyMain.m4056B()) {
            a = m1635a(objArr);
        } else {
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (objArr[0] instanceof KonyJSObject)) {
                        long jSObject = ((KonyJSObject) objArr[0]).getJSObject();
                        a = jSObject != 0 ? executeJS(this.f1786e, objArr, jSObject) : null;
                    }
                } catch (Exception e) {
                    Exception exception = e;
                    Thread currentThread = Thread.currentThread();
                    if (currentThread instanceof cW) {
                        ((cW) currentThread).m3859a(exception);
                    }
                    throw exception;
                }
            }
            a = executeJS(this.f1786e, objArr, 0);
        }
        return a;
    }

    public synchronized void executeAsync(Object[] objArr) throws Exception {
        C0245j c0245j = this.f1789h;
        if (c0245j == null) {
            c0245j = KonyMain.m4125g();
        }
        c0245j.m1728a(new C0240d(this, objArr));
    }

    public native synchronized Object[] executeJS(long j, Object[] objArr, long j2) throws Exception;

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f1789h != null) {
            if ((this.f1789h.f1843a != null ? 1 : null) != null) {
                this.f1789h.m1728a(new C0244i(this.f1786e));
            }
        }
    }

    public long getJSCallback() {
        return this.f1786e;
    }

    public String toString() {
        return "function";
    }
}
