package com.konylabs.vm;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.konylabs.vm.m */
public final class C0248m {
    private Runtime f1865a;
    private long f1866b;
    private HashMap f1867c;
    private boolean f1868d;
    private boolean f1869e;
    private long f1870f;
    private long f1871g;
    private long f1872h;

    public C0248m() {
        this.f1865a = null;
        this.f1866b = 0;
        this.f1867c = null;
        this.f1868d = false;
        this.f1869e = false;
        this.f1870f = 0;
        this.f1871g = 0;
        this.f1872h = 0;
        this.f1865a = Runtime.getRuntime();
        this.f1867c = new HashMap();
        if (!this.f1868d) {
            this.f1868d = true;
            this.f1869e = false;
            this.f1870f = SystemClock.uptimeMillis();
            this.f1872h = 0;
            this.f1871g = 0;
        }
    }

    public final C0249n m1751a(String str) {
        m1757e();
        C0249n c0249n = (C0249n) this.f1867c.get(str);
        if (c0249n == null) {
            c0249n = new C0249n(this);
        }
        c0249n.f1876d.add(Long.valueOf(m1759g()));
        c0249n.f1875c++;
        this.f1867c.put(str, c0249n);
        this.f1866b++;
        m1758f();
        return c0249n;
    }

    public final HashMap m1752a() {
        return this.f1867c;
    }

    public final long m1753b() {
        return this.f1865a.freeMemory();
    }

    public final C0249n m1754b(String str) {
        m1757e();
        this.f1865a.gc();
        C0249n c0249n = (C0249n) this.f1867c.get(str);
        if (c0249n != null) {
            c0249n.f1874b = m1759g() - ((Long) c0249n.f1876d.get(c0249n.f1876d.size() - 1)).longValue();
            c0249n.f1876d.remove(c0249n.f1876d.size() - 1);
            if (c0249n.f1876d.size() == 0) {
                c0249n.f1873a += c0249n.f1874b;
            }
        }
        this.f1866b--;
        m1758f();
        return c0249n;
    }

    public final long m1755c() {
        return this.f1865a.totalMemory();
    }

    public final long m1756d() {
        return this.f1866b;
    }

    protected final void m1757e() {
        this.f1872h++;
        if (!this.f1869e) {
            this.f1871g = (SystemClock.uptimeMillis() - this.f1870f) + this.f1871g;
            this.f1869e = true;
        }
    }

    protected final void m1758f() {
        if (this.f1869e) {
            this.f1870f = SystemClock.uptimeMillis();
            this.f1872h--;
            if (0 == this.f1872h) {
                this.f1869e = false;
            }
        }
    }

    protected final long m1759g() {
        return this.f1869e ? this.f1871g : (SystemClock.uptimeMillis() - this.f1870f) + this.f1871g;
    }
}
