package com.konylabs.vm;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.konylabs.vm.j */
public final class C0245j {
    Handler f1843a;

    public C0245j(Handler handler) {
        this.f1843a = null;
        this.f1843a = handler;
    }

    public final Thread m1725a() {
        return this.f1843a != null ? this.f1843a.getLooper().getThread() : null;
    }

    public final void m1726a(Handler handler) {
        this.f1843a = handler;
    }

    public final boolean m1727a(Message message) {
        return this.f1843a != null ? this.f1843a.sendMessageAtFrontOfQueue(message) : false;
    }

    public final boolean m1728a(Runnable runnable) {
        return this.f1843a != null ? this.f1843a.post(runnable) : false;
    }

    public final boolean m1729b(Message message) {
        return this.f1843a != null ? this.f1843a.sendMessage(message) : false;
    }

    public final boolean m1730b(Runnable runnable) {
        return this.f1843a != null ? this.f1843a.postAtFrontOfQueue(runnable) : false;
    }
}
