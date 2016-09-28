package ny0k;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;

/* renamed from: ny0k.x */
public final class C0430x extends ScaleAnimation implements C0301q {
    private Interpolator f3511a;
    private Interpolator f3512b;

    public C0430x(float f, float f2, float f3, float f4, float f5, float f6) {
        super(f, f2, f3, f4, f5, f6);
    }

    public final Interpolator m3906a() {
        return this.f3511a;
    }

    public final void m3907a(long j) {
        setStartOffset(0);
    }

    public final void m3908a(Interpolator interpolator) {
        this.f3511a = interpolator;
        if (this.f3511a instanceof LinearInterpolator) {
            this.f3512b = new C0305u();
        } else if (this.f3511a instanceof AccelerateInterpolator) {
            this.f3512b = new DecelerateInterpolator();
        } else if (this.f3511a instanceof DecelerateInterpolator) {
            this.f3512b = new AccelerateInterpolator();
        } else if (this.f3511a instanceof C0305u) {
            this.f3512b = new LinearInterpolator();
        } else if (this.f3511a instanceof AccelerateDecelerateInterpolator) {
            this.f3512b = new C0304t();
        } else {
            this.f3512b = new C0305u();
        }
    }

    public final Interpolator m3909b() {
        return this.f3512b;
    }

    public final long m3910c() {
        return getStartOffset();
    }

    public final Animation m3911d() {
        return this;
    }
}
