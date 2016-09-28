package ny0k;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;

public final class co extends Shape {
    private Path f2295a;
    private Paint f2296b;
    private int f2297c;
    private float[] f2298d;
    private cM f2299e;
    private Path f2300f;
    private RectF f2301g;
    private RectF f2302h;

    public co() {
        this.f2300f = new Path();
    }

    private void m2182a() {
        this.f2295a = new Path();
        this.f2296b = new Paint();
        this.f2296b.setAntiAlias(true);
        this.f2296b.setDither(true);
        this.f2296b.setStyle(Style.STROKE);
    }

    private void m2183b() {
        if (this.f2301g != null && this.f2295a != null) {
            this.f2295a.reset();
            if (this.f2298d != null) {
                this.f2295a.addRoundRect(this.f2301g, this.f2298d, Direction.CCW);
            } else {
                this.f2295a.addRect(this.f2301g, Direction.CCW);
            }
        }
    }

    private void m2184c() {
        if (this.f2302h != null) {
            this.f2300f.reset();
            if (this.f2298d != null) {
                this.f2300f.addRoundRect(this.f2302h, this.f2298d, Direction.CCW);
            } else {
                this.f2300f.addRect(this.f2302h, Direction.CCW);
            }
        }
    }

    public final void m2185a(int i, int i2) {
        if (i > 0) {
            if (this.f2295a == null) {
                m2182a();
            }
            this.f2297c = i;
            this.f2296b.setColor(i2);
            this.f2296b.setStrokeWidth((float) i);
            m2183b();
            m2184c();
        }
    }

    public final void m2186a(int i, cM cMVar) {
        if (i > 0) {
            if (this.f2295a == null) {
                m2182a();
            }
            this.f2297c = i;
            this.f2296b.setStrokeWidth((float) i);
            this.f2299e = cMVar;
            if (cMVar != null && getWidth() != 0.0f && getHeight() != 0.0f) {
                this.f2296b.setShader(cMVar.m2138a(getWidth(), getHeight()));
            }
        }
    }

    public final void m2187a(Canvas canvas) {
        if (this.f2295a != null) {
            canvas.drawPath(this.f2295a, this.f2296b);
        }
    }

    public final void m2188a(float[] fArr) {
        this.f2298d = fArr;
        m2183b();
        m2184c();
    }

    public final void draw(Canvas canvas, Paint paint) {
        if (this.f2297c > 0) {
            paint.setStyle(Style.FILL_AND_STROKE);
            paint.setStrokeWidth((float) this.f2297c);
        } else {
            paint.setStyle(Style.FILL);
        }
        canvas.drawPath(this.f2300f, paint);
    }

    protected final void onResize(float f, float f2) {
        super.onResize(f, f2);
        float f3 = ((float) this.f2297c) / 2.0f;
        if (this.f2297c > 0) {
            if (this.f2301g == null) {
                this.f2301g = new RectF();
            }
            this.f2301g.left = 0.0f + f3;
            this.f2301g.top = 0.0f + f3;
            this.f2301g.right = f - f3;
            this.f2301g.bottom = f2 - f3;
            if (this.f2298d != null) {
                if (this.f2302h == null) {
                    this.f2302h = new RectF();
                }
                this.f2302h.left = this.f2301g.left;
                this.f2302h.top = this.f2301g.top;
                this.f2302h.right = this.f2301g.right;
                this.f2302h.bottom = this.f2301g.bottom;
            } else {
                if (this.f2302h == null) {
                    this.f2302h = new RectF();
                }
                this.f2302h.left = 0.0f;
                this.f2302h.top = 0.0f;
                this.f2302h.right = f;
                this.f2302h.bottom = f2;
            }
        } else {
            if (this.f2302h == null) {
                this.f2302h = new RectF();
            }
            this.f2302h.left = 0.0f;
            this.f2302h.top = 0.0f;
            this.f2302h.right = f;
            this.f2302h.bottom = f2;
        }
        m2183b();
        m2184c();
        if (this.f2299e != null) {
            this.f2296b.setShader(this.f2299e.m2138a(f, f2));
        }
    }
}
