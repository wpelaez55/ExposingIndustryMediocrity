package ny0k;

import java.util.Hashtable;

public final class aX implements aU {
    private int f3589a;
    private aV f3590b;
    private aW f3591c;
    private Hashtable f3592d;
    private aY f3593e;

    static {
    }

    public final void m4014a() {
    }

    public final void m4015a(Hashtable hashtable, int i, aV aVVar, aW aWVar) {
        this.f3589a = i;
        this.f3590b = aVVar;
        this.f3591c = aWVar;
        this.f3592d = hashtable;
    }

    public final void m4016a(aV aVVar, aW aWVar) {
        this.f3590b = aVVar;
        this.f3591c = aWVar;
        if (this.f3593e != null) {
            this.f3593e.m1939a(aVVar, aWVar);
        }
    }

    public final void m4017b() {
        if (this.f3593e != null) {
            this.f3593e.m1938a();
        }
        if (this.f3590b != null) {
            this.f3590b.m1936a(1011, "Connection Failure", -1);
        }
    }

    public final boolean m4018c() {
        this.f3593e = new aY();
        if (!this.f3593e.m1940a(this.f3592d, this.f3590b, this.f3591c)) {
            return false;
        }
        this.f3593e.start();
        return true;
    }

    public final boolean m4019d() {
        if (this.f3593e == null) {
            return false;
        }
        this.f3593e.m1938a();
        return true;
    }
}
