package ny0k;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: ny0k.s */
public final class C0303s extends Animation {
    private View f2351a;
    private int f2352b;
    private int f2353c;
    private boolean f2354d;

    public C0303s(View view, boolean z) {
        this.f2351a = view;
        int measuredHeight = this.f2351a.getMeasuredHeight();
        this.f2352b = measuredHeight;
        this.f2353c = measuredHeight;
        this.f2354d = z;
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        int i = (int) ((this.f2354d ? 1.0f - f : f) * ((float) this.f2352b));
        this.f2351a.scrollTo(0, i);
        this.f2351a.getLayoutParams().height = this.f2353c - i;
        if (this.f2354d && f == 1.0f) {
            this.f2351a.scrollTo(0, 0);
            this.f2351a.getLayoutParams().height = -2;
        }
        this.f2351a.requestLayout();
    }

    public final boolean willChangeBounds() {
        return true;
    }
}
