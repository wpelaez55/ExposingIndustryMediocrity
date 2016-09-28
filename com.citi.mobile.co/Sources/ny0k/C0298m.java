package ny0k;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;

/* renamed from: ny0k.m */
final class C0298m implements Runnable {
    private /* synthetic */ int f2345a;
    private /* synthetic */ boolean f2346b;
    private /* synthetic */ C0296k f2347c;

    C0298m(C0296k c0296k, int i, boolean z) {
        this.f2347c = c0296k;
        this.f2345a = i;
        this.f2346b = z;
    }

    public final void run() {
        if (this.f2345a == this.f2347c.f2340b.size() && this.f2347c.f2342d.f3479c > 1) {
            int i;
            AnimationSet animationSet;
            if (this.f2347c.f2342d.f3480d == 2) {
                for (i = 0; i < this.f2347c.f2340b.size(); i++) {
                    animationSet = (AnimationSet) this.f2347c.f2340b.valueAt(i);
                    if (this.f2347c.f2342d.f3479c % 2 == 0) {
                        for (Animation animation : animationSet.getAnimations()) {
                            animation.setInterpolator(((C0301q) animation).m2216a());
                        }
                    } else {
                        for (Animation animation2 : animationSet.getAnimations()) {
                            animation2.setInterpolator(((C0301q) animation2).m2218b());
                        }
                    }
                }
                if (this.f2347c.f2342d.f3479c % 2 == 0) {
                    this.f2347c.f2342d.m3893a(this.f2347c.f2339a, this.f2347c.f2340b, 0, this.f2346b);
                } else {
                    this.f2347c.f2342d.m3893a(this.f2347c.f2339a, this.f2347c.f2340b, this.f2347c.f2340b.size() - 1, this.f2346b);
                }
            } else if (this.f2347c.f2342d.f3480d == 3) {
                for (i = 0; i < this.f2347c.f2340b.size(); i++) {
                    animationSet = (AnimationSet) this.f2347c.f2340b.valueAt(i);
                    if (this.f2347c.f2342d.f3479c % 2 == 0) {
                        for (Animation animation22 : animationSet.getAnimations()) {
                            animation22.setInterpolator(((C0301q) animation22).m2218b());
                        }
                    } else {
                        for (Animation animation222 : animationSet.getAnimations()) {
                            animation222.setInterpolator(((C0301q) animation222).m2216a());
                        }
                    }
                }
                if (this.f2347c.f2342d.f3479c % 2 == 0) {
                    this.f2347c.f2342d.m3893a(this.f2347c.f2339a, this.f2347c.f2340b, this.f2347c.f2340b.size() - 1, this.f2346b);
                } else {
                    this.f2347c.f2342d.m3893a(this.f2347c.f2339a, this.f2347c.f2340b, 0, this.f2346b);
                }
            } else {
                this.f2347c.f2342d.m3893a(this.f2347c.f2339a, this.f2347c.f2340b, 0, this.f2347c.f2341c);
            }
            this.f2338c.f2333d.f3479c = this.f2347c.f2342d.f3479c - 1;
            C0427g.m3888g(this.f2347c.f2342d);
        } else if (this.f2345a == this.f2347c.f2340b.size() && this.f2347c.f2342d.f3479c == 1) {
            if (this.f2347c.f2342d.f3482f == 1) {
                C0427g.m3882a(this.f2347c.f2342d, this.f2347c.f2342d.f3486j, 1);
            } else if (this.f2347c.f2342d.f3482f == 3) {
                this.f2347c.f2342d.m3879a();
            } else if (this.f2347c.f2342d.f3482f == 0 || this.f2347c.f2342d.f3482f == 2) {
                C0427g.m3882a(this.f2347c.f2342d, this.f2347c.f2342d.f3486j, 0);
            }
            C0427g.m3890i(this.f2347c.f2342d);
            C0427g.m3888g(this.f2347c.f2342d);
            C0427g.m3891j(this.f2347c.f2342d);
            this.f2338c.f2333d.f3479c = this.f2347c.f2342d.f3479c - 1;
        }
    }
}
