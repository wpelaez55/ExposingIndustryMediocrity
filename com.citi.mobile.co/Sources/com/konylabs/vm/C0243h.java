package com.konylabs.vm;

import com.konylabs.libintf.Library;
import java.io.Serializable;

/* renamed from: com.konylabs.vm.h */
public final class C0243h implements Serializable {
    public Library f1840a;
    public int f1841b;

    public C0243h(Library library, int i) {
        this.f1840a = null;
        this.f1841b = 0;
        this.f1840a = library;
        this.f1841b = i;
    }

    public final Object[] m1724a(Object[] objArr) {
        return this.f1840a.execute(this.f1841b, objArr);
    }
}
