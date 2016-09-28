package ny0k;

import android.os.MessageQueue.IdleHandler;

/* renamed from: ny0k.A */
final class C0274A implements IdleHandler {
    private /* synthetic */ C0307z f1894a;

    C0274A(C0307z c0307z) {
        this.f1894a = c0307z;
    }

    public final boolean queueIdle() {
        this.f1894a.f2369h = null;
        if (this.f1894a.f2362a != null) {
            this.f1894a.f2362a.recycle();
            this.f1894a.f2362a = null;
        }
        if (this.f1894a.f2363b != null) {
            this.f1894a.f2363b.recycle();
            this.f1894a.f2363b = null;
        }
        if (this.f1894a.f2364c != null) {
            this.f1894a.f2364c.recycle();
            this.f1894a.f2364c = null;
        }
        if (this.f1894a.f2365d != null) {
            this.f1894a.f2365d.recycle();
            this.f1894a.f2365d = null;
        }
        return true;
    }
}
