package ny0k;

import android.view.animation.Interpolator;

/* renamed from: ny0k.u */
public final class C0305u implements Interpolator {
    private Interpolator f2355a;

    public C0305u(Interpolator interpolator) {
        this.f2355a = interpolator;
    }

    public final float getInterpolation(float f) {
        if (this.f2355a != null) {
            f = this.f2355a.getInterpolation(f);
        }
        return Math.abs(f - 1.0f);
    }
}
