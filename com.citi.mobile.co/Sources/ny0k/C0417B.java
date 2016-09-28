package ny0k;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: ny0k.B */
public final class C0417B extends TranslateAnimation implements C0301q {
    private Interpolator f3170a;
    private Interpolator f3171b;

    public C0417B(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }

    public final Interpolator m3428a() {
        return this.f3170a;
    }

    public final void m3429a(long j) {
        setStartOffset(0);
    }

    public final void m3430a(Interpolator interpolator) {
        this.f3170a = interpolator;
        if (this.f3170a instanceof LinearInterpolator) {
            this.f3171b = new C0305u();
        } else if (this.f3170a instanceof AccelerateInterpolator) {
            this.f3171b = new DecelerateInterpolator();
        } else if (this.f3170a instanceof DecelerateInterpolator) {
            this.f3171b = new AccelerateInterpolator();
        } else if (this.f3170a instanceof C0305u) {
            this.f3171b = new LinearInterpolator();
        } else if (this.f3170a instanceof AccelerateDecelerateInterpolator) {
            this.f3171b = new C0304t();
        } else {
            this.f3171b = new C0305u();
        }
    }

    public final Interpolator m3431b() {
        return this.f3171b;
    }

    public final long m3432c() {
        return getStartOffset();
    }

    public final Animation m3433d() {
        return this;
    }
}
