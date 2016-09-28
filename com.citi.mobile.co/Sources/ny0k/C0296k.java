package ny0k;

import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: ny0k.k */
final class C0296k implements AnimationListener {
    final /* synthetic */ View f2339a;
    final /* synthetic */ SparseArray f2340b;
    final /* synthetic */ boolean f2341c;
    final /* synthetic */ C0427g f2342d;
    private /* synthetic */ int f2343e;

    C0296k(C0427g c0427g, int i, View view, SparseArray sparseArray, boolean z) {
        this.f2342d = c0427g;
        this.f2343e = i;
        this.f2339a = view;
        this.f2340b = sparseArray;
        this.f2341c = z;
    }

    public final void onAnimationEnd(Animation animation) {
        int i = this.f2343e + 1;
        this.f2342d.m3893a(this.f2339a, this.f2340b, i, this.f2341c);
        this.f2339a.post(new C0298m(this, i, !this.f2341c));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (this.f2343e == 0) {
            this.f2342d.a.getWidget().post(new C0297l(this));
            C0427g.m3884c(this.f2342d);
        }
    }
}
