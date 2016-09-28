package ny0k;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.dB;

public final class aI extends LinearLayout {
    private String f1987A;
    private String f1988B;
    private dB f1989C;
    private dB f1990D;
    private Drawable f1991E;
    private Drawable f1992F;
    private TextView f1993a;
    private TextView f1994b;
    private LinearLayout f1995c;
    private LinearLayout f1996d;
    private View f1997e;
    private boolean f1998f;
    private float f1999g;
    private float f2000h;
    private float f2001i;
    private boolean f2002j;
    private boolean f2003k;
    private int f2004l;
    private float f2005m;
    private int f2006n;
    private int f2007o;
    private int f2008p;
    private int f2009q;
    private ImageView f2010r;
    private ImageView f2011s;
    private float f2012t;
    private RotateAnimation f2013u;
    private int f2014v;
    private aG f2015w;
    private Context f2016x;
    private String f2017y;
    private String f2018z;

    public aI(Context context, boolean z, boolean z2, LayoutParams layoutParams) {
        super(context);
        this.f2009q = 0;
        this.f2017y = "Pull to refresh";
        this.f2018z = "Release to refresh";
        this.f1987A = "Push to refresh";
        this.f1988B = "Release to refresh";
        this.f2016x = context;
        this.f2000h = (float) (ViewConfiguration.get(this.f2016x).getScaledTouchSlop() - 22);
        this.f2002j = z;
        this.f2003k = z2;
        if (z && z2) {
            this.f2004l = 3;
        } else if (z) {
            this.f2004l = 1;
        } else if (z2) {
            this.f2004l = 2;
        } else {
            this.f2004l = 0;
        }
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        } else {
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        }
    }

    private void m1904a(TextView textView) {
        if (textView != null) {
            textView.setTextColor(getResources().getColor(17170444));
            textView.setTextSize(14.0f);
            textView.setTypeface(Typeface.DEFAULT, 0);
            textView.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
        }
    }

    private static void m1905b(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? MeasureSpec.makeMeasureSpec(i, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
    }

    private boolean m1906c() {
        switch (this.f2004l) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m1908e() || m1907d();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return m1907d();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return m1908e();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return m1908e() || m1907d();
            default:
                return false;
        }
    }

    private boolean m1907d() {
        if (this.f1997e instanceof AdapterView) {
            if (this.f2009q == 0) {
                return ((AdapterView) this.f1997e).getFirstVisiblePosition() == 0;
            } else {
                if (this.f2009q == 1) {
                    return true;
                }
            }
        } else if (this.f2009q == 0) {
            return this.f1997e.getScrollY() == 0;
        } else {
            if (this.f2009q == 1) {
                return this.f1997e.getScrollX() == 0;
            }
        }
        return false;
    }

    private boolean m1908e() {
        View childAt;
        if (!(this.f1997e instanceof AdapterView)) {
            childAt = ((ViewGroup) this.f1997e).getChildAt(0);
            if (childAt != null) {
                if (this.f2009q == 0) {
                    return this.f1997e.getScrollY() >= childAt.getHeight() - getHeight();
                } else {
                    if (this.f2009q == 1) {
                        return this.f1997e.getScrollX() >= childAt.getWidth() - getWidth();
                    }
                }
            }
        } else if (this.f2009q == 0) {
            int count = ((AdapterView) this.f1997e).getCount() - 1;
            int lastVisiblePosition = ((AdapterView) this.f1997e).getLastVisiblePosition();
            if (lastVisiblePosition >= count - 1) {
                childAt = ((ViewGroup) this.f1997e).getChildAt(lastVisiblePosition - ((AdapterView) this.f1997e).getFirstVisiblePosition());
                if (childAt != null) {
                    return childAt.getBottom() <= this.f1997e.getBottom();
                }
            }
        } else if (this.f2009q == 1) {
            return true;
        }
        return false;
    }

    private boolean m1909f() {
        return this.f2004l == 1 || this.f2004l == 3 || this.f2004l == 0;
    }

    private boolean m1910g() {
        return this.f2004l == 2 || this.f2004l == 3 || this.f2004l == 0;
    }

    private void m1911h() {
        switch (this.f2006n) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.f2014v == 2) {
                    this.f2013u = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                } else if (this.f2014v == 0) {
                    this.f2013u = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                }
                this.f2013u.setInterpolator(new LinearInterpolator());
                this.f2013u.setDuration(250);
                this.f2013u.setFillAfter(true);
                this.f2011s.startAnimation(this.f2013u);
            default:
                if (this.f2014v == 1) {
                    this.f2013u = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                } else if (this.f2014v == 0) {
                    this.f2013u = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                }
                this.f2013u.setInterpolator(new LinearInterpolator());
                this.f2013u.setDuration(250);
                this.f2013u.setFillAfter(true);
                this.f2010r.startAnimation(this.f2013u);
        }
    }

    private void m1912i() {
        int measuredHeight;
        int measuredHeight2;
        if (this.f2002j) {
            m1905b(this.f1995c);
            measuredHeight = this.f1995c.getMeasuredHeight();
            this.f2007o = measuredHeight;
        } else {
            measuredHeight = 0;
        }
        if (this.f2003k) {
            m1905b(this.f1996d);
            measuredHeight2 = this.f1996d.getMeasuredHeight();
            this.f2008p = measuredHeight2;
        } else {
            measuredHeight2 = 0;
        }
        if (this.f2009q == 1) {
            setPadding(-measuredHeight, 0, -measuredHeight2, 0);
        } else {
            setPadding(0, -measuredHeight, 0, -measuredHeight2);
        }
    }

    public final void m1913a() {
        if (this.f2015w.m1887e()) {
            this.f2015w.m1883a();
        }
    }

    public final void m1914a(int i) {
        this.f2009q = 1;
    }

    public final void m1915a(View view) {
        int measuredHeight;
        int measuredHeight2;
        this.f1997e = view;
        if (this.f2009q == 1) {
            setOrientation(0);
        } else {
            setOrientation(1);
        }
        if (this.f2009q == 0) {
            this.f1995c = new LinearLayout(this.f2016x);
            this.f1995c.setOrientation(1);
            this.f1995c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            View linearLayout = new LinearLayout(this.f2016x);
            linearLayout.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f1993a = new TextView(this.f2016x);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            this.f1993a.setLayoutParams(layoutParams);
            this.f1993a.setGravity(1);
            this.f1993a.setTextColor(getResources().getColor(17170444));
            this.f1993a.setText(this.f2017y);
            linearLayout.addView(this.f1993a);
            this.f1995c.addView(linearLayout);
        } else if (this.f2009q == 1) {
            this.f1995c = new LinearLayout(this.f2016x);
            this.f1995c.setOrientation(0);
            this.f1995c.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            this.f2010r = new ImageView(this.f2016x);
            this.f2010r.setBackgroundResource(KonyMain.getAppContext().getResources().getIdentifier("ic_cal_next", "drawable", KonyMain.getAppContext().getPackageName()));
            LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            this.f2010r.setLayoutParams(layoutParams2);
            this.f1995c.addView(this.f2010r);
        }
        if (this.f2009q == 0) {
            this.f1996d = new LinearLayout(this.f2016x);
            this.f1996d.setOrientation(1);
            this.f1996d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout = new LinearLayout(this.f2016x);
            linearLayout.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f1994b = new TextView(this.f2016x);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            this.f1994b.setLayoutParams(layoutParams);
            this.f1994b.setGravity(1);
            this.f1994b.setTextColor(getResources().getColor(17170444));
            this.f1994b.setText(this.f1987A);
            linearLayout.addView(this.f1994b);
            this.f1996d.addView(linearLayout);
        } else if (this.f2009q == 1) {
            this.f1996d = new LinearLayout(this.f2016x);
            this.f1996d.setOrientation(0);
            this.f1996d.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            this.f2011s = new ImageView(this.f2016x);
            this.f2011s.setBackgroundResource(KonyMain.getAppContext().getResources().getIdentifier("ic_cal_prev", "drawable", KonyMain.getAppContext().getPackageName()));
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            this.f2011s.setLayoutParams(layoutParams2);
            this.f1996d.addView(this.f2011s);
        }
        if (this.f2002j) {
            addView(this.f1995c, 0);
            m1905b(this.f1995c);
            measuredHeight = this.f1995c.getMeasuredHeight();
            this.f2007o = measuredHeight;
        } else {
            measuredHeight = 0;
        }
        addView(this.f1997e, new LinearLayout.LayoutParams(-1, -1, 1.0f));
        if (this.f2003k) {
            addView(this.f1996d, -1);
            m1905b(this.f1996d);
            measuredHeight2 = this.f1996d.getMeasuredHeight();
            this.f2008p = measuredHeight2;
        } else {
            measuredHeight2 = 0;
        }
        if (this.f2009q == 1) {
            setPadding(-measuredHeight, 0, -measuredHeight2, 0);
        } else {
            setPadding(0, -measuredHeight, 0, -measuredHeight2);
        }
    }

    public final void m1916a(LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
        post(new aJ(this));
    }

    public final void m1917a(dB dBVar) {
        this.f1989C = dBVar;
        if (dBVar != null) {
            this.f1991E = dBVar.m1162p();
            if (this.f1993a != null) {
                if (this.f1991E != null) {
                    this.f1993a.setBackgroundDrawable(this.f1991E);
                    if (this.f1989C != null) {
                        this.f1993a.setTextColor(this.f1989C.m1156m());
                        this.f1989C.m1132c(this.f1993a);
                    }
                } else {
                    this.f1993a.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
                }
            }
        } else {
            this.f1991E = null;
            m1904a(this.f1993a);
        }
        m1912i();
    }

    public final void m1918a(String str) {
        if (str != null) {
            this.f2017y = str;
        } else {
            this.f2017y = "Pull to refresh";
        }
    }

    public final void m1919a(aG aGVar) {
        this.f2015w = aGVar;
    }

    public final void m1920b() {
        if (this.f2015w.m1888f()) {
            this.f2015w.m1884b();
        }
    }

    public final void m1921b(dB dBVar) {
        this.f1990D = dBVar;
        if (dBVar != null) {
            this.f1992F = dBVar.m1162p();
            if (this.f1994b != null) {
                if (this.f1992F != null) {
                    this.f1994b.setBackgroundDrawable(this.f1992F);
                    if (this.f1990D != null) {
                        this.f1994b.setTextColor(this.f1990D.m1156m());
                        this.f1990D.m1132c(this.f1994b);
                    }
                } else {
                    this.f1994b.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
                }
            }
        } else {
            this.f1992F = null;
            m1904a(this.f1994b);
        }
        m1912i();
    }

    public final void m1922b(String str) {
        if (str != null) {
            this.f2018z = str;
        } else {
            this.f2018z = "Release to refresh";
        }
    }

    public final void m1923c(String str) {
        if (str != null) {
            this.f1987A = str;
        } else {
            this.f1987A = "Push to refresh";
        }
    }

    public final void m1924d(String str) {
        if (str != null) {
            this.f1988B = str;
        } else {
            this.f1988B = "Release to refresh";
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || this.f2015w == null) {
            this.f1998f = false;
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.f1998f) {
            return true;
        }
        float y;
        switch (action) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (m1906c()) {
                    y = motionEvent.getY();
                    this.f2001i = y;
                    this.f1999g = y;
                    y = motionEvent.getX();
                    this.f2012t = y;
                    this.f2005m = y;
                    this.f1998f = false;
                    break;
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (!m1906c()) {
                    ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                y = motionEvent.getY();
                float f = y - this.f1999g;
                float abs = Math.abs(f);
                float x = motionEvent.getX();
                float f2 = x - this.f2005m;
                float abs2 = Math.abs(f2);
                if (this.f2009q == 0 && abs > this.f2000h && abs > abs2) {
                    if (!m1909f() || f < 1.0f || !m1907d()) {
                        if (m1910g() && f <= -1.0f && m1908e()) {
                            this.f1999g = y;
                            this.f1998f = true;
                            this.f2006n = 2;
                            break;
                        }
                    }
                    this.f1999g = y;
                    this.f1998f = true;
                    this.f2006n = 1;
                    break;
                } else if (this.f2009q == 1 && abs2 > this.f2000h && abs2 > abs) {
                    if (!m1909f() || f2 < 1.0f || !m1907d()) {
                        if (m1910g() && f2 <= -1.0f && m1908e()) {
                            this.f2005m = x;
                            this.f1998f = true;
                            this.f2006n = 2;
                            break;
                        }
                    }
                    this.f2005m = x;
                    this.f1998f = true;
                    this.f2006n = 1;
                    break;
                } else if ((this.f2009q == 1 && abs > abs2) || (this.f2009q == 0 && abs2 > abs)) {
                    ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
        }
        return this.f1998f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r7 = 2;
        r6 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r5 = 0;
        r2 = 1;
        r1 = 0;
        r0 = r9.getAction();
        switch(r0) {
            case 0: goto L_0x011d;
            case 1: goto L_0x013f;
            case 2: goto L_0x000e;
            case 3: goto L_0x013f;
            default: goto L_0x000d;
        };
    L_0x000d:
        return r1;
    L_0x000e:
        r0 = r8.f1998f;
        if (r0 == 0) goto L_0x000d;
    L_0x0012:
        r0 = r8.f2009q;
        if (r0 != 0) goto L_0x0059;
    L_0x0016:
        r0 = r9.getY();
        r8.f1999g = r0;
    L_0x001c:
        r0 = r8.f2009q;
        if (r0 != 0) goto L_0x00a0;
    L_0x0020:
        r3 = r8.getScrollY();
        r0 = r8.f2006n;
        switch(r0) {
            case 2: goto L_0x0064;
            default: goto L_0x0029;
        };
    L_0x0029:
        r0 = r8.f2015w;
        r0 = r0.m1889g();
        if (r0 == 0) goto L_0x01db;
    L_0x0031:
        r0 = r8.f2001i;
        r4 = r8.f1999g;
        r0 = r0 - r4;
        r0 = java.lang.Math.min(r0, r5);
        r0 = r0 / r6;
        r0 = java.lang.Math.round(r0);
        r4 = r8.f2007o;
        r5 = java.lang.Math.abs(r0);
        if (r4 >= r5) goto L_0x0096;
    L_0x0047:
        r4 = r8.f1993a;
        r5 = r8.f2018z;
        r4.setText(r5);
        r8.f2014v = r2;
    L_0x0050:
        r8.scrollTo(r1, r0);
        r1 = r0;
        r0 = r3;
    L_0x0055:
        if (r0 == r1) goto L_0x0057;
    L_0x0057:
        r1 = r2;
        goto L_0x000d;
    L_0x0059:
        r0 = r8.f2009q;
        if (r0 != r2) goto L_0x001c;
    L_0x005d:
        r0 = r9.getX();
        r8.f2005m = r0;
        goto L_0x001c;
    L_0x0064:
        r0 = r8.f2015w;
        r0 = r0.m1890h();
        if (r0 == 0) goto L_0x01db;
    L_0x006c:
        r0 = r8.f2001i;
        r4 = r8.f1999g;
        r0 = r0 - r4;
        r0 = java.lang.Math.max(r0, r5);
        r0 = r0 / r6;
        r0 = java.lang.Math.round(r0);
        r4 = r8.f2008p;
        r5 = java.lang.Math.abs(r0);
        if (r4 < r5) goto L_0x008c;
    L_0x0082:
        r4 = r8.f1994b;
        r5 = r8.f1987A;
        r4.setText(r5);
        r8.f2014v = r1;
        goto L_0x0050;
    L_0x008c:
        r4 = r8.f1994b;
        r5 = r8.f1988B;
        r4.setText(r5);
        r8.f2014v = r7;
        goto L_0x0050;
    L_0x0096:
        r4 = r8.f1993a;
        r5 = r8.f2017y;
        r4.setText(r5);
        r8.f2014v = r1;
        goto L_0x0050;
    L_0x00a0:
        r3 = r8.getScrollX();
        r0 = r8.f2006n;
        switch(r0) {
            case 2: goto L_0x00dc;
            default: goto L_0x00a9;
        };
    L_0x00a9:
        r0 = r8.f2015w;
        r0 = r0.m1889g();
        if (r0 == 0) goto L_0x01d8;
    L_0x00b1:
        r0 = r8.f2012t;
        r4 = r8.f2005m;
        r0 = r0 - r4;
        r0 = java.lang.Math.min(r0, r5);
        r0 = r0 / r6;
        r0 = java.lang.Math.round(r0);
        java.lang.Math.abs(r0);
        r4 = r8.f2007o;
        r4 = r8.f2007o;
        r5 = java.lang.Math.abs(r0);
        if (r4 > r5) goto L_0x0113;
    L_0x00cc:
        r4 = r8.f2014v;
        if (r4 == r2) goto L_0x00d5;
    L_0x00d0:
        r8.f2014v = r2;
        r8.m1911h();
    L_0x00d5:
        r8.scrollTo(r0, r1);
        r1 = r0;
        r0 = r3;
        goto L_0x0055;
    L_0x00dc:
        r0 = r8.f2015w;
        r0 = r0.m1890h();
        if (r0 == 0) goto L_0x01d8;
    L_0x00e4:
        r0 = r8.f2012t;
        r4 = r8.f2005m;
        r0 = r0 - r4;
        r0 = java.lang.Math.max(r0, r5);
        r0 = r0 / r6;
        r0 = java.lang.Math.round(r0);
        java.lang.Math.abs(r0);
        r4 = r8.f2008p;
        r4 = r8.f2008p;
        r5 = java.lang.Math.abs(r0);
        if (r4 < r5) goto L_0x0109;
    L_0x00ff:
        r4 = r8.f2014v;
        if (r4 == 0) goto L_0x00d5;
    L_0x0103:
        r8.f2014v = r1;
        r8.m1911h();
        goto L_0x00d5;
    L_0x0109:
        r4 = r8.f2014v;
        if (r4 == r7) goto L_0x00d5;
    L_0x010d:
        r8.f2014v = r7;
        r8.m1911h();
        goto L_0x00d5;
    L_0x0113:
        r4 = r8.f2014v;
        if (r4 == 0) goto L_0x00d5;
    L_0x0117:
        r8.f2014v = r1;
        r8.m1911h();
        goto L_0x00d5;
    L_0x011d:
        r0 = r8.m1906c();
        if (r0 == 0) goto L_0x000d;
    L_0x0123:
        r0 = r8.f2009q;
        if (r0 != 0) goto L_0x0132;
    L_0x0127:
        r0 = r9.getY();
        r8.f2001i = r0;
        r8.f1999g = r0;
    L_0x012f:
        r1 = r2;
        goto L_0x000d;
    L_0x0132:
        r0 = r8.f2009q;
        if (r0 != r2) goto L_0x012f;
    L_0x0136:
        r0 = r9.getX();
        r8.f2012t = r0;
        r8.f2005m = r0;
        goto L_0x012f;
    L_0x013f:
        r0 = r8.f1998f;
        if (r0 == 0) goto L_0x000d;
    L_0x0143:
        r8.f1998f = r1;
        r0 = r8.m1907d();
        if (r0 == 0) goto L_0x0163;
    L_0x014b:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0156;
    L_0x014f:
        r0 = "KonyRefreshView";
        r3 = "RAISE REACHED TO TOP--------";
        android.util.Log.d(r0, r3);
    L_0x0156:
        r0 = r8.f2015w;
        r0 = r0.m1887e();
        if (r0 == 0) goto L_0x0163;
    L_0x015e:
        r0 = r8.f2015w;
        r0.m1883a();
    L_0x0163:
        r0 = r8.m1908e();
        if (r0 == 0) goto L_0x0181;
    L_0x0169:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0174;
    L_0x016d:
        r0 = "KonyRefreshView";
        r3 = "RAISE REACHED TO BOTTOM--------";
        android.util.Log.d(r0, r3);
    L_0x0174:
        r0 = r8.f2015w;
        r0 = r0.m1888f();
        if (r0 == 0) goto L_0x0181;
    L_0x017c:
        r0 = r8.f2015w;
        r0.m1884b();
    L_0x0181:
        r0 = r8.f2014v;
        if (r0 != r2) goto L_0x01b5;
    L_0x0185:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0190;
    L_0x0189:
        r0 = "KonyRefreshView";
        r3 = "RAISE_PULL_TO_REFRESH--------";
        android.util.Log.d(r0, r3);
    L_0x0190:
        r0 = r8.f2015w;
        r0 = r0.m1889g();
        if (r0 == 0) goto L_0x019d;
    L_0x0198:
        r0 = r8.f2015w;
        r0.m1885c();
    L_0x019d:
        r8.f1998f = r1;
        r8.f2014v = r1;
        r0 = r8.f2009q;
        if (r0 != r2) goto L_0x01af;
    L_0x01a5:
        r0 = r8.f2006n;
        switch(r0) {
            case 2: goto L_0x01d2;
            default: goto L_0x01aa;
        };
    L_0x01aa:
        r0 = r8.f2010r;
        r0.clearAnimation();
    L_0x01af:
        r8.scrollTo(r1, r1);
        r1 = r2;
        goto L_0x000d;
    L_0x01b5:
        r0 = r8.f2014v;
        if (r0 != r7) goto L_0x019d;
    L_0x01b9:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x01c4;
    L_0x01bd:
        r0 = "KonyRefreshView";
        r3 = "RAISE_PUSH_TO_REFRESH--------";
        android.util.Log.d(r0, r3);
    L_0x01c4:
        r0 = r8.f2015w;
        r0 = r0.m1890h();
        if (r0 == 0) goto L_0x019d;
    L_0x01cc:
        r0 = r8.f2015w;
        r0.m1886d();
        goto L_0x019d;
    L_0x01d2:
        r0 = r8.f2011s;
        r0.clearAnimation();
        goto L_0x01af;
    L_0x01d8:
        r0 = r1;
        goto L_0x00d5;
    L_0x01db:
        r0 = r1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.aI.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
