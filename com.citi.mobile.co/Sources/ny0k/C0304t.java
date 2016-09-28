package ny0k;

import android.view.animation.Interpolator;

/* renamed from: ny0k.t */
public final class C0304t implements Interpolator {
    public final float getInterpolation(float f) {
        return Math.abs((((float) (Math.cos(((double) (f + 1.0f)) * 3.141592653589793d) / 2.0d)) + 0.5f) - 1.0f);
    }
}
