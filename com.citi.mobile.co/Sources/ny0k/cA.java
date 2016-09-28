package ny0k;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;

public final class cA extends ShapeDrawable {
    private boolean f2211a;
    private int f2212b;
    private boolean f2213c;
    private Rect f2214d;
    private cM f2215e;
    private co f2216f;

    public cA(int i) {
        this.f2213c = false;
        getPaint().setColor(i);
        m2092b();
    }

    public cA(int i, int i2) {
        this.f2213c = false;
        this.f2215e = cM.m2136a(i, i2);
        m2092b();
    }

    public cA(int i, int[] iArr, float[] fArr) {
        this.f2213c = false;
        this.f2215e = cM.m2137a(i, iArr, fArr);
        m2092b();
    }

    private void m2092b() {
        this.f2216f = new co();
        setShape(this.f2216f);
    }

    public final void m2093a() {
        this.f2211a = true;
    }

    public final void m2094a(float f) {
        this.f2216f.m2188a(f > 0.0f ? new float[]{f, f, f, f, f, f, f, f} : null);
    }

    public final void m2095a(int i, int i2) {
        if (i > 0) {
            this.f2212b = i;
            this.f2216f.m2185a(i, i2);
            if (this.f2213c) {
                if (this.f2214d == null) {
                    this.f2214d = new Rect();
                }
                this.f2214d.set(this.f2212b, this.f2212b, this.f2212b, this.f2212b);
            }
        }
    }

    public final void m2096a(int i, int i2, int[] iArr, float[] fArr) {
        if (i > 0) {
            this.f2212b = i;
            this.f2216f.m2186a(i, cM.m2137a(i2, iArr, fArr));
            if (this.f2213c) {
                if (this.f2214d == null) {
                    this.f2214d = new Rect();
                }
                this.f2214d.set(this.f2212b, this.f2212b, this.f2212b, this.f2212b);
            }
        }
    }

    public final void m2097a(Rect rect) {
        if (this.f2214d == null) {
            this.f2214d = new Rect();
        }
        this.f2214d.set(this.f2212b + rect.left, this.f2212b + rect.top, this.f2212b + rect.right, this.f2212b + rect.bottom);
    }

    public final void m2098a(boolean z) {
        this.f2213c = z;
        if (this.f2212b > 0) {
            if (this.f2214d == null) {
                this.f2214d = new Rect();
            }
            this.f2214d.set(this.f2212b, this.f2212b, this.f2212b, this.f2212b);
        }
    }

    public final void m2099a(float[] fArr) {
        this.f2216f.m2188a(fArr);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        this.f2216f.m2187a(canvas);
        canvas.restoreToCount(save);
    }

    public final boolean getPadding(Rect rect) {
        if (!this.f2213c || this.f2214d == null) {
            return false;
        }
        rect.set(this.f2214d);
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        co coVar = (co) getShape();
        if (this.f2211a) {
            float height = ((float) rect.height()) / 2.0f;
            coVar.m2188a(new float[]{height, height, height, height, height, height, height, height});
        }
        if (this.f2215e != null) {
            getPaint().setShader(this.f2215e.m2138a((float) rect.width(), (float) rect.height()));
        }
        super.onBoundsChange(rect);
    }
}
