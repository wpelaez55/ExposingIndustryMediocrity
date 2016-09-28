package ny0k;

/* renamed from: ny0k.f */
final class C0292f implements Runnable {
    private /* synthetic */ C0290d f2329a;

    C0292f(C0290d c0290d) {
        this.f2329a = c0290d;
    }

    public final void run() {
        if (this.f2329a.f2327b.f3446f == 1) {
            C0426c.m3849a(this.f2329a.f2327b, this.f2329a.f2326a, 1);
        } else if (this.f2329a.f2327b.f3446f == 3) {
            this.f2329a.f2327b.m3847a();
        } else if (this.f2329a.f2327b.f3446f == 0 || this.f2329a.f2327b.f3446f == 2) {
            C0426c.m3849a(this.f2329a.f2327b, this.f2329a.f2326a, 0);
        }
        C0426c.m3853e(this.f2329a.f2327b);
    }
}
