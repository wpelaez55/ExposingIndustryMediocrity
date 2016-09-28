package ny0k;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.konylabs.api.ui.LuaWidget;

/* renamed from: ny0k.D */
public final class C0419D extends Animation implements C0301q {
    private static int f3176g;
    private static int f3177h;
    private LuaWidget f3178a;
    private int f3179b;
    private int f3180c;
    private int f3181d;
    private int f3182e;
    private int f3183f;
    private Interpolator f3184i;
    private Interpolator f3185j;

    static {
        f3176g = 0;
        f3177h = 1;
    }

    public C0419D(LuaWidget luaWidget, int i, int i2, int i3, int i4) {
        this.f3183f = -1;
        this.f3179b = i3;
        this.f3181d = i4;
        this.f3180c = i;
        this.f3182e = i2;
        if (this.f3180c == this.f3179b && this.f3180c == 0) {
            this.f3183f = f3177h;
        }
        if (this.f3182e == this.f3181d && this.f3182e == 0) {
            this.f3183f = 0;
        }
        this.f3178a = luaWidget;
    }

    public final Interpolator m3440a() {
        return this.f3184i;
    }

    public final void m3441a(long j) {
        setStartOffset(0);
    }

    public final void m3442a(Interpolator interpolator) {
        this.f3184i = interpolator;
        if (this.f3184i instanceof LinearInterpolator) {
            this.f3185j = new C0305u();
        } else if (this.f3184i instanceof AccelerateInterpolator) {
            this.f3185j = new DecelerateInterpolator();
        } else if (this.f3184i instanceof DecelerateInterpolator) {
            this.f3185j = new AccelerateInterpolator();
        } else if (this.f3184i instanceof C0305u) {
            this.f3185j = new LinearInterpolator();
        } else if (this.f3184i instanceof AccelerateDecelerateInterpolator) {
            this.f3185j = new C0304t();
        } else {
            this.f3185j = new C0305u();
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        if (this.f3183f == 0) {
            this.f3178a.setX((float) (-(this.f3180c + ((int) (((float) (this.f3179b - this.f3180c)) * f)))));
        }
        if (this.f3183f == f3177h) {
            this.f3178a.setY((float) (-(this.f3182e + ((int) (((float) (this.f3181d - this.f3182e)) * f)))));
        }
    }

    public final Interpolator m3443b() {
        return this.f3185j;
    }

    public final long m3444c() {
        return getStartOffset();
    }

    public final Animation m3445d() {
        return this;
    }

    public final boolean willChangeBounds() {
        return true;
    }
}
