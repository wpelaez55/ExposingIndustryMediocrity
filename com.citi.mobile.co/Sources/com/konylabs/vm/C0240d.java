package com.konylabs.vm;

import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.vm.d */
final class C0240d implements Runnable {
    private /* synthetic */ Object[] f1817a;
    private /* synthetic */ Function f1818b;

    C0240d(Function function, Object[] objArr) {
        this.f1818b = function;
        this.f1817a = objArr;
    }

    public final void run() {
        try {
            this.f1818b.execute(this.f1817a);
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                e.printStackTrace();
            }
        }
    }
}
