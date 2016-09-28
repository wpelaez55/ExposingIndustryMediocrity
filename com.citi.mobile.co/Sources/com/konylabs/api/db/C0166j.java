package com.konylabs.api.db;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.ii;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.konylabs.api.db.j */
final class C0166j extends Thread {
    private static Queue f155a;

    static {
        f155a = new LinkedList();
    }

    /* synthetic */ C0166j() {
        this((byte) 0);
    }

    private C0166j(byte b) {
    }

    private static C0164h m85a() {
        try {
            return (C0164h) f155a.remove();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public final synchronized void m86a(C0164h c0164h) {
        int i = C0163f.f131d + 1;
        C0163f.f131d = i;
        if (i % 10 == 0) {
            KonyMain.m4143x().m1782b(c0164h.f139a);
            System.gc();
            C0163f.f131d = 0;
        }
        f155a.add(c0164h);
    }

    public final void run() {
        C0164h[] c0164hArr = new C0164h[]{C0166j.m85a()};
        while (c0164hArr[0] != null) {
            if (c0164hArr[0].m82a()) {
                Runnable iiVar = new ii(new C0167k(this, c0164hArr));
                c0164hArr[0].f139a.m1728a(iiVar);
                iiVar.m1406a();
            } else {
                c0164hArr[0].m84b();
            }
            synchronized (this) {
                c0164hArr[0] = C0166j.m85a();
                if (c0164hArr[0] == null) {
                    return;
                }
            }
        }
    }
}
