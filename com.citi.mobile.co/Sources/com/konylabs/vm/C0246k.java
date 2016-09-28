package com.konylabs.vm;

import java.io.Serializable;
import java.util.Vector;

/* renamed from: com.konylabs.vm.k */
final class C0246k implements Serializable {
    public Object[] f1844a;
    public Object[] f1845b;
    public int f1846c;
    public Vector f1847d;
    public int f1848e;

    C0246k() {
        this.f1844a = null;
        this.f1845b = null;
        this.f1846c = -1;
        this.f1847d = new Vector(4);
        this.f1848e = 0;
    }

    public final Object[] m1731a(int i) {
        int i2 = 0;
        if (this.f1844a == null) {
            this.f1844a = new Object[i];
        }
        this.f1848e = 0;
        while (i2 < this.f1844a.length) {
            this.f1844a[i2] = LuaNil.nil;
            i2++;
        }
        return this.f1844a;
    }

    public final Object[] m1732b(int i) {
        if (this.f1844a == null) {
            m1731a(i);
        } else {
            Object obj = new Object[i];
            System.arraycopy(this.f1844a, 0, obj, 0, this.f1844a.length);
            for (int length = this.f1844a.length; length < i; length++) {
                obj[length] = LuaNil.nil;
            }
            this.f1844a = obj;
        }
        return this.f1844a;
    }
}
