package ny0k;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.konylabs.android.KonyMain;

/* renamed from: ny0k.v */
public final class C0429v extends Animation implements C0301q {
    public static int f3499a;
    public static int f3500b;
    private static int f3501c;
    private int f3502d;
    private int f3503e;
    private int f3504f;
    private int f3505g;
    private int f3506h;
    private int f3507i;
    private int f3508j;
    private Interpolator f3509k;
    private Interpolator f3510l;

    static {
        f3499a = 0;
        f3500b = 1;
        f3501c = 2;
    }

    public C0429v(int i, int i2) {
        this.f3504f = f3500b;
        this.f3507i = -1;
        this.f3508j = -1;
        this.f3502d = i;
        this.f3503e = i2;
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            this.f3505g = actContext.m4166o() / 2;
            this.f3506h = actContext.m4167p() / 2;
        }
    }

    public C0429v(View view, int i, int i2) {
        this.f3504f = f3500b;
        this.f3507i = -1;
        this.f3508j = -1;
        this.f3502d = i;
        this.f3503e = i2;
        if (view != null) {
            this.f3505g = (int) (((float) (view.getMeasuredWidth() / 2)) + 0.5f);
            this.f3506h = (int) (((float) (view.getMeasuredHeight() / 2)) + 0.5f);
        }
    }

    public C0429v(View view, int i, int i2, int i3, int i4, int i5) {
        this.f3504f = f3500b;
        this.f3507i = -1;
        this.f3508j = -1;
        this.f3502d = i;
        this.f3503e = i2;
        if (view != null) {
            this.f3505g = (int) (((float) (view.getMeasuredWidth() / 2)) + 0.5f);
            this.f3506h = (int) (((float) (view.getMeasuredHeight() / 2)) + 0.5f);
        }
        this.f3504f = i5;
        this.f3507i = -1;
        this.f3508j = -1;
    }

    public final Interpolator m3900a() {
        return this.f3509k;
    }

    public final void m3901a(long j) {
        setStartOffset(0);
    }

    public final void m3902a(Interpolator interpolator) {
        this.f3509k = interpolator;
        if (this.f3509k instanceof LinearInterpolator) {
            this.f3510l = new C0305u();
        } else if (this.f3509k instanceof AccelerateInterpolator) {
            this.f3510l = new DecelerateInterpolator();
        } else if (this.f3509k instanceof DecelerateInterpolator) {
            this.f3510l = new AccelerateInterpolator();
        } else if (this.f3509k instanceof C0305u) {
            this.f3510l = new LinearInterpolator();
        } else if (this.f3509k instanceof AccelerateDecelerateInterpolator) {
            this.f3510l = new C0304t();
        } else {
            this.f3510l = new C0305u();
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        float f2 = (float) this.f3502d;
        f2 += (((float) this.f3503e) - f2) * f;
        Camera camera = new Camera();
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f3504f == f3500b) {
            camera.rotateY(f2);
        } else if (this.f3504f == 0) {
            camera.rotateX(f2);
        } else if (this.f3504f == f3501c) {
            camera.rotateZ(f2);
        }
        camera.getMatrix(matrix);
        camera.restore();
        if (this.f3507i == -1 && this.f3508j == -1) {
            matrix.preTranslate((float) (-this.f3505g), (float) (-this.f3506h));
            matrix.postTranslate((float) this.f3505g, (float) this.f3506h);
            return;
        }
        matrix.preTranslate((float) (-this.f3507i), (float) (-this.f3508j));
        matrix.postTranslate((float) this.f3507i, (float) this.f3508j);
    }

    public final Interpolator m3903b() {
        return this.f3510l;
    }

    public final long m3904c() {
        return getStartOffset();
    }

    public final Animation m3905d() {
        return this;
    }
}
