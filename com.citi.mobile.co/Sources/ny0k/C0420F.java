package ny0k;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.konylabs.api.ui.LuaWidget;

/* renamed from: ny0k.F */
public final class C0420F extends Animation implements C0301q {
    private static int f3186g;
    private static int f3187h;
    private LuaWidget f3188a;
    private float f3189b;
    private float f3190c;
    private float f3191d;
    private float f3192e;
    private int f3193f;
    private Interpolator f3194i;
    private Interpolator f3195j;

    static {
        f3186g = 0;
        f3187h = 1;
    }

    public C0420F(LuaWidget luaWidget, float f, float f2, float f3, float f4) {
        this.f3193f = -1;
        this.f3189b = f4;
        this.f3191d = f3;
        this.f3190c = f2;
        this.f3192e = f;
        if (this.f3190c == this.f3189b && this.f3190c == 0.0f) {
            this.f3193f = 0;
        }
        if (this.f3192e == this.f3191d && this.f3192e == 0.0f) {
            this.f3193f = f3187h;
        }
        this.f3188a = luaWidget;
    }

    public final Interpolator m3446a() {
        return this.f3194i;
    }

    public final void m3447a(long j) {
        setStartOffset(0);
    }

    public final void m3448a(Interpolator interpolator) {
        this.f3194i = interpolator;
        if (this.f3194i instanceof LinearInterpolator) {
            this.f3195j = new C0305u();
        } else if (this.f3194i instanceof AccelerateInterpolator) {
            this.f3195j = new DecelerateInterpolator();
        } else if (this.f3194i instanceof DecelerateInterpolator) {
            this.f3195j = new AccelerateInterpolator();
        } else if (this.f3194i instanceof C0305u) {
            this.f3195j = new LinearInterpolator();
        } else if (this.f3194i instanceof AccelerateDecelerateInterpolator) {
            this.f3195j = new C0304t();
        } else {
            this.f3195j = new C0305u();
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        if (this.f3193f == f3187h) {
            this.f3188a.setHeight((int) (((this.f3189b - this.f3190c) * f) + this.f3190c));
        }
        if (this.f3193f == 0) {
            this.f3188a.setWidth((int) (((this.f3191d - this.f3192e) * f) + this.f3192e));
        }
    }

    public final Interpolator m3449b() {
        return this.f3195j;
    }

    public final long m3450c() {
        return getStartOffset();
    }

    public final Animation m3451d() {
        return this;
    }

    public final boolean willChangeBounds() {
        return true;
    }
}
