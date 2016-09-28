package com.konylabs.api;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.Function;

/* renamed from: com.konylabs.api.r */
final class C0172r implements Runnable {
    String f162a;
    C0368s f163b;
    long f164c;
    boolean f165d;
    private volatile boolean f166e;
    private C0245j f167f;

    C0172r() {
        this.f165d = false;
        this.f166e = false;
        this.f167f = null;
    }

    public final void m104a() {
        this.f167f = KonyMain.m4061G();
        String str = this.f162a;
        KonyMain.m4095a((Runnable) this, this.f164c);
    }

    public final synchronized void m105a(Function function) {
        if (function != null) {
            this.f163b = new C0368s(this, function);
        } else {
            this.f163b = null;
        }
    }

    public final synchronized void m106b() {
        KonyMain.m4096a((Runnable) this, this.f162a);
        this.f166e = true;
    }

    public final void run() {
        synchronized (this) {
            if (!this.f166e) {
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = this.f163b;
                Bundle bundle = new Bundle(2);
                bundle.putSerializable("hideProgress", Boolean.valueOf(true));
                bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
                obtain.setData(bundle);
                this.f167f.m1729b(obtain);
            }
        }
    }
}
