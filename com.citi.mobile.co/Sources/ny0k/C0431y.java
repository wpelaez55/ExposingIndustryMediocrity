package ny0k;

import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/* renamed from: ny0k.y */
public final class C0431y extends Animation implements C0301q {
    public static int f3513a;
    public static int f3514b;
    private int f3515c;
    private int f3516d;
    private int f3517e;
    private int f3518f;
    private int f3519g;
    private Interpolator f3520h;
    private Interpolator f3521i;

    static {
        f3513a = 0;
        f3514b = 1;
    }

    public C0431y(int i, int i2, int i3, int i4, int i5) {
        this.f3517e = f3514b;
        this.f3515c = i;
        this.f3516d = i2;
        this.f3517e = i5;
        this.f3518f = -1;
        this.f3519g = -1;
    }

    public final Interpolator m3912a() {
        return this.f3520h;
    }

    public final void m3913a(long j) {
        setStartOffset(0);
    }

    public final void m3914a(Interpolator interpolator) {
        this.f3520h = interpolator;
        if (this.f3520h instanceof LinearInterpolator) {
            this.f3521i = new C0305u();
        } else if (this.f3520h instanceof AccelerateInterpolator) {
            this.f3521i = new DecelerateInterpolator();
        } else if (this.f3520h instanceof DecelerateInterpolator) {
            this.f3521i = new AccelerateInterpolator();
        } else if (this.f3520h instanceof C0305u) {
            this.f3521i = new LinearInterpolator();
        } else if (this.f3520h instanceof AccelerateDecelerateInterpolator) {
            this.f3521i = new C0304t();
        } else {
            this.f3521i = new C0305u();
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        float f2 = (float) this.f3515c;
        f2 += (((float) this.f3516d) - f2) * f;
        Matrix matrix = transformation.getMatrix();
        if (this.f3517e == f3514b) {
            if (this.f3518f == -1 && this.f3519g == -1) {
                matrix.setSkew(0.0f, f2);
            } else {
                matrix.setSkew(0.0f, f2, (float) this.f3518f, (float) this.f3519g);
            }
        } else if (this.f3517e != 0) {
        } else {
            if (this.f3518f == -1 && this.f3519g == -1) {
                matrix.setSkew(f2, 0.0f);
            } else {
                matrix.setSkew(f2, 0.0f, (float) this.f3518f, (float) this.f3519g);
            }
        }
    }

    public final Interpolator m3915b() {
        return this.f3521i;
    }

    public final long m3916c() {
        return getStartOffset();
    }

    public final Animation m3917d() {
        return this;
    }
}
