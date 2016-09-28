package com.konylabs.vm;

import java.io.Serializable;
import java.util.Vector;

/* renamed from: com.konylabs.vm.e */
final class C0241e implements Serializable {
    public static C0241e f1819n;
    public static int f1820o;
    public volatile boolean f1821a;
    public int f1822b;
    public int f1823c;
    public int[] f1824d;
    public Object[] f1825e;
    public C0241e[] f1826f;
    public int f1827g;
    public int f1828h;
    public int f1829i;
    public int f1830j;
    public int[] f1831k;
    public Vector f1832l;
    public String f1833m;

    static {
        f1819n = null;
        f1820o = 0;
    }

    C0241e() {
        this.f1821a = false;
        this.f1822b = -1;
        this.f1823c = -1;
        this.f1824d = null;
        this.f1825e = null;
        this.f1826f = null;
        this.f1827g = 0;
        this.f1828h = 0;
        this.f1829i = 0;
        this.f1830j = 0;
        this.f1831k = null;
        this.f1832l = null;
        this.f1833m = null;
    }

    public final int[] m1678a(int i) {
        if (this.f1824d == null) {
            this.f1824d = new int[i];
        }
        return this.f1824d;
    }

    public final Object[] m1679b(int i) {
        if (this.f1825e == null) {
            this.f1825e = new Object[i];
        }
        return this.f1825e;
    }

    public final C0241e[] m1680c(int i) {
        if (this.f1826f == null) {
            this.f1826f = new C0241e[i];
        }
        return this.f1826f;
    }
}
