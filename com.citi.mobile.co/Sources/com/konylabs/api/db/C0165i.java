package com.konylabs.api.db;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;

/* renamed from: com.konylabs.api.db.i */
final class C0165i implements Runnable {
    private /* synthetic */ Object[][] f151a;
    private /* synthetic */ Function f152b;
    private /* synthetic */ Object[] f153c;
    private /* synthetic */ Exception[] f154d;

    C0165i(C0164h c0164h, Object[][] objArr, Function function, Object[] objArr2, Exception[] exceptionArr) {
        this.f151a = objArr;
        this.f152b = function;
        this.f153c = objArr2;
        this.f154d = exceptionArr;
    }

    public final void run() {
        try {
            this.f151a[0] = this.f152b.execute(this.f153c);
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                e.printStackTrace();
            }
            this.f154d[0] = e;
        }
    }
}
