package ny0k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.konylabs.android.KonyMain;

public final class be extends View {
    private static String[] f2181g;
    private Paint f2182a;
    private Paint f2183b;
    private RectF f2184c;
    private int f2185d;
    private boolean f2186e;
    private String f2187f;

    static {
        f2181g = new String[]{"platform.calendar.sunday", "platform.calendar.monday", "platform.calendar.tuesday", "platform.calendar.wednesday", "platform.calendar.thursday", "platform.calendar.friday", "platform.calendar.saturday"};
    }

    public be(Context context, int i, int i2) {
        super(context);
        this.f2182a = new Paint();
        this.f2183b = new Paint();
        this.f2184c = new RectF();
        this.f2185d = -1;
        this.f2186e = false;
        LayoutParams layoutParams = new LinearLayout.LayoutParams(0, i);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        this.f2182a.setColor(this.f2186e ? -9408400 : -10066330);
        this.f2183b.setTypeface(null);
        this.f2183b.setTextSize((float) i2);
        this.f2183b.setAntiAlias(true);
        this.f2183b.setFakeBoldText(true);
        this.f2183b.setColor(this.f2186e ? -3092272 : -3355444);
    }

    private int m2042a() {
        return (int) ((-this.f2182a.ascent()) + this.f2182a.descent());
    }

    public final void m2043a(int i) {
        this.f2185d = i;
        this.f2186e = false;
        if (i == 7 || i == 1) {
            this.f2186e = true;
        }
        this.f2187f = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{f2181g[i - 1]});
        if (this.f2187f == null || this.f2187f.length() == 0) {
            this.f2187f = aZ.m1942a(i);
        }
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2184c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f2184c.inset(1.0f, 1.0f);
        if (this.f2185d != -1) {
            canvas.drawRect(this.f2184c, this.f2182a);
            int width = (((int) this.f2184c.left) + (((int) this.f2184c.width()) >> 1)) - (((int) this.f2183b.measureText(this.f2187f)) >> 1);
            canvas.drawText(this.f2187f, (float) width, (((float) ((((int) this.f2184c.bottom) + ((int) (-this.f2182a.ascent()))) - m2042a())) - ((float) ((((int) this.f2184c.height()) >> 1) - (m2042a() >> 1)))) + this.f2184c.top, this.f2183b);
        }
    }
}
