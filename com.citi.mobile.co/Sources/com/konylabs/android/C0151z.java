package com.konylabs.android;

import com.konylabs.vm.C0252r;

/* renamed from: com.konylabs.android.z */
final class C0151z implements Runnable {
    private /* synthetic */ Throwable f53a;
    private /* synthetic */ C0150y f54b;

    C0151z(C0150y c0150y, Throwable th) {
        this.f54b = c0150y;
        this.f53a = th;
    }

    public final void run() {
        this.f54b.f52a.m4153a(C0252r.m1766a(this.f53a));
    }
}
