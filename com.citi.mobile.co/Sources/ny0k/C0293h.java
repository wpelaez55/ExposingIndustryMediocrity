package ny0k;

import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: ny0k.h */
final class C0293h implements AnimationListener {
    final /* synthetic */ SparseArray f2330a;
    final /* synthetic */ View f2331b;
    final /* synthetic */ boolean f2332c;
    final /* synthetic */ C0427g f2333d;
    private /* synthetic */ int f2334e;

    C0293h(C0427g c0427g, int i, SparseArray sparseArray, View view, boolean z) {
        this.f2333d = c0427g;
        this.f2334e = i;
        this.f2330a = sparseArray;
        this.f2331b = view;
        this.f2332c = z;
    }

    public final void onAnimationEnd(Animation animation) {
        int i = this.f2334e - 1;
        this.f2333d.m3893a(this.f2331b, this.f2330a, i, this.f2332c);
        this.f2331b.post(new C0295j(this, i, !this.f2332c));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (this.f2334e == this.f2330a.size() - 1) {
            this.f2333d.a.getWidget().post(new C0294i(this));
            C0427g.m3884c(this.f2333d);
        }
    }
}
