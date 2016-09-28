package ny0k;

import android.util.SparseArray;

/* renamed from: ny0k.n */
final class C0299n implements Runnable {
    private /* synthetic */ SparseArray f2348a;
    private /* synthetic */ C0427g f2349b;

    C0299n(C0427g c0427g, SparseArray sparseArray) {
        this.f2349b = c0427g;
        this.f2348a = sparseArray;
    }

    public final void run() {
        if (this.f2349b.f3480d == 1 || this.f2349b.f3480d == 3) {
            this.f2349b.m3893a(this.f2349b.a.getWidget(), this.f2348a, this.f2348a.size() - 1, true);
        } else {
            this.f2349b.m3893a(this.f2349b.a.getWidget(), this.f2348a, 0, false);
        }
    }
}
