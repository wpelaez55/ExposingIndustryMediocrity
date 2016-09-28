package ny0k;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;

/* renamed from: ny0k.j */
final class C0295j implements Runnable {
    private /* synthetic */ int f2336a;
    private /* synthetic */ boolean f2337b;
    private /* synthetic */ C0293h f2338c;

    C0295j(C0293h c0293h, int i, boolean z) {
        this.f2338c = c0293h;
        this.f2336a = i;
        this.f2337b = z;
    }

    public final void run() {
        if (this.f2336a < 0 && this.f2338c.f2333d.f3479c > 1) {
            int i;
            AnimationSet animationSet;
            if (this.f2338c.f2333d.f3480d == 2) {
                for (i = 0; i < this.f2338c.f2330a.size(); i++) {
                    animationSet = (AnimationSet) this.f2338c.f2330a.valueAt(i);
                    if (this.f2338c.f2333d.f3479c % 2 == 0) {
                        for (Animation animation : animationSet.getAnimations()) {
                            animation.setInterpolator(((C0301q) animation).m2216a());
                        }
                    } else {
                        for (Animation animation2 : animationSet.getAnimations()) {
                            animation2.setInterpolator(((C0301q) animation2).m2218b());
                        }
                    }
                }
                if (this.f2338c.f2333d.f3479c % 2 == 0) {
                    this.f2338c.f2333d.m3893a(this.f2338c.f2331b, this.f2338c.f2330a, 0, this.f2337b);
                } else {
                    this.f2338c.f2333d.m3893a(this.f2338c.f2331b, this.f2338c.f2330a, this.f2338c.f2330a.size() - 1, this.f2337b);
                }
            } else if (this.f2338c.f2333d.f3480d == 3) {
                for (i = 0; i < this.f2338c.f2330a.size(); i++) {
                    animationSet = (AnimationSet) this.f2338c.f2330a.valueAt(i);
                    if (this.f2338c.f2333d.f3479c % 2 == 0) {
                        for (Animation animation22 : animationSet.getAnimations()) {
                            animation22.setInterpolator(((C0301q) animation22).m2218b());
                        }
                    } else {
                        for (Animation animation222 : animationSet.getAnimations()) {
                            animation222.setInterpolator(((C0301q) animation222).m2216a());
                        }
                    }
                }
                if (this.f2338c.f2333d.f3479c % 2 == 0) {
                    this.f2338c.f2333d.m3893a(this.f2338c.f2331b, this.f2338c.f2330a, this.f2338c.f2330a.size() - 1, this.f2337b);
                } else {
                    this.f2338c.f2333d.m3893a(this.f2338c.f2331b, this.f2338c.f2330a, 0, this.f2337b);
                }
            } else {
                this.f2338c.f2333d.m3893a(this.f2338c.f2331b, this.f2338c.f2330a, this.f2338c.f2330a.size() - 1, this.f2338c.f2332c);
            }
            this.f2338c.f2333d.f3479c = this.f2338c.f2333d.f3479c - 1;
            C0427g.m3888g(this.f2338c.f2333d);
        } else if (this.f2336a < 0 && this.f2338c.f2333d.f3479c == 1) {
            if (this.f2338c.f2333d.f3482f == 1) {
                C0427g.m3882a(this.f2338c.f2333d, this.f2338c.f2333d.f3486j, 1);
            } else if (this.f2338c.f2333d.f3482f == 3) {
                this.f2338c.f2333d.m3879a();
            } else if (this.f2338c.f2333d.f3482f == 0 || this.f2338c.f2333d.f3482f == 2) {
                C0427g.m3882a(this.f2338c.f2333d, this.f2338c.f2333d.f3486j, 0);
            }
            C0427g.m3890i(this.f2338c.f2333d);
            C0427g.m3888g(this.f2338c.f2333d);
            C0427g.m3891j(this.f2338c.f2333d);
        }
    }
}
