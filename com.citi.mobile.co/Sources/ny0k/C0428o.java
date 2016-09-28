package ny0k;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.konylabs.api.ui.LuaWidget;

/* renamed from: ny0k.o */
public final class C0428o extends Animation implements C0301q {
    private LuaWidget f3494a;
    private float f3495b;
    private float f3496c;
    private Interpolator f3497d;
    private Interpolator f3498e;

    public C0428o(LuaWidget luaWidget, float f, float f2) {
        this.f3495b = f;
        this.f3496c = f2;
        this.f3494a = luaWidget;
    }

    public final Interpolator m3894a() {
        return this.f3497d;
    }

    public final void m3895a(long j) {
        setStartOffset(0);
    }

    public final void m3896a(Interpolator interpolator) {
        this.f3497d = interpolator;
        if (this.f3497d instanceof LinearInterpolator) {
            this.f3498e = new C0305u();
        } else if (this.f3497d instanceof AccelerateInterpolator) {
            this.f3498e = new DecelerateInterpolator();
        } else if (this.f3497d instanceof DecelerateInterpolator) {
            this.f3498e = new AccelerateInterpolator();
        } else if (this.f3497d instanceof C0305u) {
            this.f3498e = new LinearInterpolator();
        } else if (this.f3497d instanceof AccelerateDecelerateInterpolator) {
            this.f3498e = new C0304t();
        } else {
            this.f3498e = new C0305u();
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        this.f3494a.setWeight(((this.f3496c - this.f3495b) * f) + this.f3495b);
    }

    public final Interpolator m3897b() {
        return this.f3498e;
    }

    public final long m3898c() {
        return getStartOffset();
    }

    public final Animation m3899d() {
        return this;
    }

    public final boolean willChangeBounds() {
        return true;
    }
}
