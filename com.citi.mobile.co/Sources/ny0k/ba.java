package ny0k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.aO;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Calendar;

public final class ba extends TextView {
    private int f2157a;
    private int f2158b;
    private int f2159c;
    private bd f2160d;
    private Paint f2161e;
    private RectF f2162f;
    private String f2163g;
    private boolean f2164h;
    private boolean f2165i;
    private boolean f2166j;
    private boolean f2167k;
    private boolean f2168l;
    private boolean f2169m;
    private boolean f2170n;
    private aO f2171o;
    private int f2172p;
    private boolean f2173q;
    private boolean f2174r;
    private boolean f2175s;
    private bb f2176t;
    private GestureDetector f2177u;
    private View f2178v;
    private int f2179w;

    public ba(aO aOVar, Context context, int i, int i2) {
        super(context);
        this.f2157a = 0;
        this.f2158b = 0;
        this.f2159c = 0;
        this.f2160d = null;
        this.f2161e = new Paint();
        this.f2162f = new RectF();
        this.f2163g = BuildConfig.FLAVOR;
        this.f2164h = false;
        this.f2165i = false;
        this.f2166j = false;
        this.f2167k = false;
        this.f2168l = true;
        this.f2169m = false;
        this.f2170n = false;
        this.f2172p = 1;
        this.f2173q = false;
        this.f2174r = false;
        this.f2175s = false;
        this.f2176t = null;
        this.f2177u = new GestureDetector(new bc(this));
        this.f2178v = null;
        this.f2179w = 5;
        this.f2171o = aOVar;
        setFocusable(true);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        this.f2172p = aOVar.m2489s();
        this.f2161e.setTypeface(null);
        this.f2161e.setAntiAlias(true);
        this.f2161e.setShader(null);
        this.f2161e.setFakeBoldText(true);
        this.f2161e.setTextSize((float) i2);
        this.f2161e.setUnderlineText(false);
        this.f2176t = new bb(this, context);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        this.f2176t.setLayoutParams(layoutParams2);
        this.f2176t.addView(this, layoutParams);
    }

    private void m2025g() {
        if (this.f2160d != null) {
            this.f2160d.m2041a(this);
        }
    }

    public final View m2026a() {
        return this.f2176t;
    }

    public final void m2027a(int i) {
        this.f2179w = i;
    }

    public final void m2028a(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        this.f2157a = i;
        this.f2158b = i2;
        this.f2159c = i3;
        String str = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{"platform.calendar." + this.f2159c});
        if (str == null || str.length() <= 0) {
            this.f2163g = Integer.toString(this.f2159c);
        } else {
            this.f2163g = str;
        }
        this.f2169m = this.f2158b == i4;
        this.f2166j = z;
        this.f2167k = z2;
    }

    public final void m2029a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            int i = layoutParams2.gravity;
            if ((i & 48) == 48) {
                layoutParams3.addRule(10);
            } else if ((i & 80) == 80) {
                layoutParams3.addRule(12);
            } else if ((i & 17) == 17) {
                layoutParams3.addRule(13);
            }
            this.f2176t.addView(view, layoutParams3);
        } else {
            this.f2176t.addView(view);
        }
        this.f2178v = view;
    }

    public final void m2030a(bd bdVar) {
        this.f2160d = bdVar;
    }

    public final void m2031a(boolean z) {
        this.f2165i = z;
    }

    public final void m2032b(boolean z) {
        this.f2168l = z;
    }

    public final boolean m2033b() {
        return this.f2164h;
    }

    public final void m2034c(boolean z) {
        this.f2173q = z;
    }

    public final boolean m2035c() {
        return this.f2165i;
    }

    public final void m2036d(boolean z) {
        this.f2174r = z;
    }

    public final boolean m2037d() {
        return this.f2169m;
    }

    public final Calendar m2038e() {
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(1, this.f2157a);
        instance.set(2, this.f2158b);
        instance.set(5, this.f2159c);
        return instance;
    }

    public final void m2039e(boolean z) {
        this.f2175s = z;
    }

    public final void m2040f() {
        if (this.f2178v != null) {
            this.f2176t.removeView(this.f2178v);
            this.f2178v = null;
        }
    }

    protected final void onDraw(Canvas canvas) {
        if (super.getVisibility() != 8) {
            super.onDraw(canvas);
            int measuredWidth = this.f2176t.getMeasuredWidth();
            this.f2162f.set(0.0f, 0.0f, (float) measuredWidth, (float) measuredWidth);
            this.f2162f.inset((float) this.f2172p, (float) this.f2172p);
            boolean z = this.f2165i ? this.f2176t.isFocused() || this.f2170n : false;
            Drawable drawable;
            if (this.f2164h || z) {
                drawable = null;
                if (z) {
                    drawable = this.f2171o.m2491u();
                }
                if (this.f2164h) {
                    drawable = this.f2171o.m2492v();
                }
                if (drawable != null) {
                    drawable.setBounds((int) this.f2162f.left, (int) this.f2162f.top, (int) this.f2162f.right, (int) this.f2162f.bottom);
                    drawable.draw(canvas);
                }
            } else if (this.f2175s && this.f2169m) {
                drawable = this.f2171o.m2426C();
                if (drawable != null) {
                    drawable.setBounds((int) this.f2162f.left, (int) this.f2162f.top, (int) this.f2162f.right, (int) this.f2162f.bottom);
                    drawable.draw(canvas);
                }
            } else if (this.f2173q || this.f2174r) {
                drawable = null;
                if (this.f2169m) {
                    if (this.f2173q) {
                        drawable = this.f2171o.m2425B();
                    }
                    if (drawable == null) {
                        drawable = this.f2165i ? this.f2171o.m2490t() : this.f2171o.m2493w();
                    }
                } else {
                    drawable = this.f2171o.m2493w();
                }
                if (drawable != null) {
                    drawable.setBounds((int) this.f2162f.left, (int) this.f2162f.top, (int) this.f2162f.right, (int) this.f2162f.bottom);
                    drawable.draw(canvas);
                }
            } else if (this.f2166j) {
                drawable = this.f2171o.m2494x();
                if (drawable != null) {
                    drawable.setBounds((int) this.f2162f.left, (int) this.f2162f.top, (int) this.f2162f.right, (int) this.f2162f.bottom);
                    drawable.draw(canvas);
                }
            } else if (this.f2165i && this.f2169m) {
                drawable = this.f2167k ? this.f2171o.m2495y() : this.f2171o.m2490t();
                drawable.setBounds((int) this.f2162f.left, (int) this.f2162f.top, (int) this.f2162f.right, (int) this.f2162f.bottom);
                drawable.draw(canvas);
            } else if (this.f2168l || !this.f2169m) {
                drawable = this.f2171o.m2493w();
                drawable.setBounds((int) this.f2162f.left, (int) this.f2162f.top, (int) this.f2162f.right, (int) this.f2162f.bottom);
                drawable.draw(canvas);
            } else {
                drawable = this.f2171o.m2495y();
                drawable.setBounds((int) this.f2162f.left, (int) this.f2162f.top, (int) this.f2162f.right, (int) this.f2162f.bottom);
                drawable.draw(canvas);
            }
            this.f2161e.setUnderlineText(false);
            if (this.f2166j && !this.f2175s) {
                this.f2161e.setUnderlineText(true);
            }
            float width = (float) ((((int) this.f2162f.right) - (((int) this.f2162f.width()) / 2)) - (((int) this.f2161e.measureText(this.f2163g)) / 2));
            float height = (float) ((((((int) this.f2162f.bottom) - (((int) this.f2162f.height()) / 2)) - (((int) ((-this.f2161e.ascent()) + this.f2161e.descent())) / 2)) - ((int) this.f2161e.ascent())) + 1);
            switch (this.f2179w) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    width = this.f2162f.left;
                    height = (this.f2162f.top + this.f2161e.getTextSize()) - this.f2161e.descent();
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    height = (this.f2162f.top + this.f2161e.getTextSize()) - this.f2161e.descent();
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    width = this.f2162f.right - this.f2161e.measureText(this.f2163g);
                    height = (this.f2162f.top + this.f2161e.getTextSize()) - this.f2161e.descent();
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    width = (float) ((int) this.f2162f.left);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    width = (float) (((int) this.f2162f.right) - ((int) this.f2161e.measureText(this.f2163g)));
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                    width = this.f2162f.left;
                    height = this.f2162f.bottom - 1.0f;
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                    height = this.f2162f.bottom - 1.0f;
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                    width = this.f2162f.right - this.f2161e.measureText(this.f2163g);
                    height = this.f2162f.bottom - 1.0f;
                    break;
            }
            if (this.f2164h || z) {
                if (this.f2164h) {
                    this.f2161e.setColor(this.f2171o.f2500e);
                }
                if (z) {
                    this.f2161e.setColor(this.f2171o.f2501f);
                }
            } else if (this.f2175s && this.f2169m) {
                this.f2161e.setColor(this.f2171o.f2503h);
            } else if (this.f2173q || this.f2174r) {
                if (!this.f2169m) {
                    this.f2161e.setColor(this.f2171o.f2498c);
                    this.f2161e.setAlpha(136);
                } else if (this.f2173q && this.f2171o.f2502g != -1) {
                    this.f2161e.setColor(this.f2171o.f2502g);
                } else if (this.f2165i) {
                    this.f2161e.setColor(this.f2171o.f2496a);
                } else {
                    this.f2161e.setColor(this.f2171o.f2498c);
                    this.f2161e.setAlpha(136);
                }
            } else if (this.f2166j) {
                this.f2161e.setColor(this.f2171o.f2499d);
            } else if (this.f2165i && this.f2169m) {
                if (this.f2167k) {
                    this.f2161e.setColor(this.f2171o.f2497b);
                } else {
                    this.f2161e.setColor(this.f2171o.f2496a);
                }
            } else if (this.f2168l || !this.f2169m) {
                this.f2161e.setColor(this.f2171o.f2498c);
                this.f2161e.setAlpha(136);
            } else {
                this.f2161e.setColor(this.f2171o.f2497b);
            }
            canvas.drawText(this.f2163g, width, height, this.f2161e);
        }
    }

    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        invalidate();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (i == 23 || i == 66) {
            m2025g();
        }
        return onKeyDown;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2177u.onTouchEvent(motionEvent)) {
            return true;
        }
        boolean z;
        if (motionEvent.getAction() == 0) {
            this.f2170n = true;
            invalidate();
            View view = this.f2176t;
            Animation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
            alphaAnimation.setDuration(100);
            alphaAnimation.startNow();
            view.startAnimation(alphaAnimation);
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 3) {
            this.f2170n = false;
            invalidate();
            z = true;
        }
        if (motionEvent.getAction() == 2) {
            this.f2170n = false;
        }
        if (motionEvent.getAction() != 1) {
            return z;
        }
        this.f2170n = false;
        m2025g();
        return true;
    }

    public final void sendAccessibilityEvent(int i) {
        CharSequence charSequence;
        String str = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{aO.f2471i[this.f2158b]});
        if (str == null || str.length() == 0) {
            str = aZ.m1943b(this.f2158b);
        }
        String l = this.f2171o.m2482l();
        String str2 = BuildConfig.FLAVOR;
        if (l.startsWith("dd")) {
            charSequence = (str2 + this.f2159c) + " " + str + " " + this.f2157a;
        } else if (l.startsWith("MM") || l.startsWith("mm")) {
            charSequence = (str2 + str) + " " + this.f2159c + " " + this.f2157a;
        } else {
            Object obj = str2;
        }
        setContentDescription(charSequence);
        super.sendAccessibilityEvent(i);
    }

    public final void setSelected(boolean z) {
        if (this.f2164h != z) {
            this.f2164h = z;
            invalidate();
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f2176t.setVisibility(i);
    }
}
