package ny0k;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.konylabs.api.ui.LuaWidget;

/* renamed from: ny0k.C */
public final class C0418C extends Animation implements C0301q {
    private LuaWidget f3172a;
    private int f3173b;
    private Interpolator f3174c;
    private Interpolator f3175d;

    public C0418C(LuaWidget luaWidget, int i) {
        this.f3172a = luaWidget;
        this.f3173b = i;
    }

    public final Interpolator m3434a() {
        return this.f3174c;
    }

    public final void m3435a(long j) {
        setStartOffset(0);
    }

    public final void m3436a(Interpolator interpolator) {
        this.f3174c = interpolator;
        if (this.f3174c instanceof LinearInterpolator) {
            this.f3175d = new C0305u();
        } else if (this.f3174c instanceof AccelerateInterpolator) {
            this.f3175d = new DecelerateInterpolator();
        } else if (this.f3174c instanceof DecelerateInterpolator) {
            this.f3175d = new AccelerateInterpolator();
        } else if (this.f3174c instanceof C0305u) {
            this.f3175d = new LinearInterpolator();
        } else if (this.f3174c instanceof AccelerateDecelerateInterpolator) {
            this.f3175d = new C0304t();
        } else {
            this.f3175d = new C0305u();
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        if (f == 1.0f) {
            this.f3172a.setVisible(this.f3173b);
        }
    }

    public final Interpolator m3437b() {
        return this.f3175d;
    }

    public final long m3438c() {
        return getStartOffset();
    }

    public final Animation m3439d() {
        return this;
    }
}
