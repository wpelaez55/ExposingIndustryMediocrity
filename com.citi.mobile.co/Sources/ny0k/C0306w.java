package ny0k;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: ny0k.w */
public final class C0306w extends Animation {
    private int f2356a;
    private int f2357b;
    private int f2358c;
    private int f2359d;
    private float f2360e;
    private Camera f2361f;

    public C0306w(View view, int i, int i2) {
        this.f2356a = 0;
        this.f2357b = i2;
        if (view != null) {
            this.f2358c = (int) (((float) (view.getWidth() / 2)) + 0.5f);
            this.f2359d = (int) (((float) (view.getHeight() / 2)) + 0.5f);
            this.f2360e = 310.0f;
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        float f2 = (float) this.f2356a;
        f2 += (((float) this.f2357b) - f2) * f;
        float f3 = (float) this.f2358c;
        float f4 = (float) this.f2359d;
        float f5 = this.f2360e * f;
        Matrix matrix = transformation.getMatrix();
        this.f2361f.save();
        this.f2361f.translate(0.0f, 0.0f, f5);
        this.f2361f.rotateY(f2);
        this.f2361f.getMatrix(matrix);
        this.f2361f.restore();
        matrix.preTranslate(-f3, -f4);
        matrix.postTranslate(f3, f4);
    }

    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f2361f = new Camera();
    }
}
