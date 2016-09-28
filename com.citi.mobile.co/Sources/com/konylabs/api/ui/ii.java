package com.konylabs.api.ui;

public final class ii implements Runnable {
    private final Runnable f1551a;
    private boolean f1552b;
    private boolean f1553c;

    public ii(Runnable runnable) {
        this.f1553c = true;
        this.f1551a = runnable;
    }

    public ii(Runnable runnable, boolean z) {
        this.f1553c = true;
        this.f1551a = runnable;
        this.f1553c = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1406a() {
        /*
        r1 = this;
        monitor-enter(r1);
    L_0x0001:
        r0 = r1.f1552b;	 Catch:{ all -> 0x000d }
        if (r0 != 0) goto L_0x000b;
    L_0x0005:
        r1.wait();	 Catch:{ InterruptedException -> 0x0009 }
        goto L_0x0001;
    L_0x0009:
        r0 = move-exception;
        goto L_0x0001;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x000d }
        return;
    L_0x000d:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.ii.a():void");
    }

    public final void m1407b() {
        synchronized (this) {
            this.f1552b = true;
            notifyAll();
        }
    }

    public final void run() {
        this.f1551a.run();
        if (this.f1553c) {
            m1407b();
        }
    }
}
