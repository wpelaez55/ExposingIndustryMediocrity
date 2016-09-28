package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import ny0k.C0284S;
import ny0k.aZ;
import ny0k.ba;
import ny0k.bd;
import ny0k.be;

public class aO extends LinearLayout implements C0212n {
    private static int as;
    public static String[] f2471i;
    private Calendar f2472A;
    private Calendar f2473B;
    private Calendar f2474C;
    private Calendar f2475D;
    private Calendar f2476E;
    private Calendar f2477F;
    private LinearLayout f2478G;
    private Button f2479H;
    private Button f2480I;
    private TextView f2481J;
    private int f2482K;
    private int f2483L;
    private int f2484M;
    private int f2485N;
    private int f2486O;
    private int f2487P;
    private int f2488Q;
    private int f2489R;
    private Drawable f2490S;
    private Drawable f2491T;
    private Drawable f2492U;
    private Drawable f2493V;
    private Drawable f2494W;
    private Drawable f2495Z;
    public int f2496a;
    private aU aA;
    private ArrayList aa;
    private GregorianCalendar[] ab;
    private boolean ac;
    private Drawable ad;
    private ArrayList ae;
    private Drawable af;
    private boolean ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean ak;
    private Rect al;
    private boolean am;
    private RelativeLayout an;
    private int ao;
    private bd ap;
    private View aq;
    private int ar;
    private ib at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private int ay;
    private aS az;
    public int f2497b;
    public int f2498c;
    public int f2499d;
    public int f2500e;
    public int f2501f;
    public int f2502g;
    public int f2503h;
    public int f2504j;
    private dB f2505k;
    private dB f2506l;
    private dB f2507m;
    private LayoutParams f2508n;
    private LayoutParams f2509o;
    private Drawable f2510p;
    private Drawable f2511q;
    private int f2512r;
    private int f2513s;
    private int f2514t;
    private String f2515u;
    private Drawable f2516v;
    private Drawable f2517w;
    private ArrayList f2518x;
    private SimpleDateFormat f2519y;
    private String f2520z;

    static {
        f2471i = new String[]{"platform.calendar.january", "platform.calendar.february", "platform.calendar.march", "platform.calendar.april", "platform.calendar.may", "platform.calendar.june", "platform.calendar.july", "platform.calendar.august", "platform.calendar.september", "platform.calendar.october", "platform.calendar.november", "platform.calendar.december"};
        as = 1;
    }

    public aO(Context context) {
        super(context);
        this.f2510p = null;
        this.f2511q = null;
        this.f2512r = -1;
        this.f2513s = -1;
        this.f2514t = -1;
        this.f2515u = BuildConfig.FLAVOR;
        this.f2518x = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM yyyy");
        this.f2520z = "dd/MM/yyyy";
        this.f2472A = Calendar.getInstance();
        this.f2473B = Calendar.getInstance();
        this.f2474C = Calendar.getInstance();
        this.f2475D = Calendar.getInstance();
        this.f2476E = Calendar.getInstance();
        this.f2477F = Calendar.getInstance();
        this.f2478G = null;
        this.f2479H = null;
        this.f2480I = null;
        this.f2482K = 1;
        this.f2483L = 0;
        this.f2484M = 0;
        this.f2485N = 38;
        this.f2486O = 24;
        this.f2487P = 12;
        this.f2488Q = 22;
        this.f2489R = 1;
        this.f2496a = -2236963;
        this.f2497b = -986896;
        this.f2498c = -986896;
        this.f2499d = -16768512;
        this.f2500e = -16772830;
        this.f2501f = -14544640;
        this.ac = false;
        this.f2502g = -1;
        this.f2503h = -1;
        this.ag = true;
        this.ah = 8;
        this.al = null;
        this.am = false;
        this.an = null;
        this.ao = 0;
        this.ap = new aP(this);
        this.aq = null;
        this.ar = 0;
        this.at = null;
        this.au = false;
        this.av = true;
        this.aw = false;
        this.ax = false;
        this.ay = 5;
        this.f2508n = new LayoutParams(-2, -2);
        this.f2509o = new LayoutParams(-2, -2);
        this.f2508n.setMargins(this.ah, 0, this.ah, 0);
        this.f2490S = m2422d(-7829368);
        this.f2491T = m2422d(-5614336);
        this.f2492U = m2422d(-15641191);
        this.f2493V = m2422d(-5592406);
        this.f2494W = m2422d(-5592406);
        this.f2495Z = m2422d(-7816312);
        this.f2475D.setTimeInMillis(System.currentTimeMillis());
        this.f2512r = this.f2475D.get(1);
        this.f2513s = this.f2475D.get(2);
        this.f2514t = this.f2475D.get(5);
        this.f2477F.setTimeInMillis(0);
        this.f2476E.setTimeInMillis(0);
        String[] split = C0284S.m1823a(KonyMain.getAppContext()).m1841b().split("_");
        this.f2519y = new SimpleDateFormat(this.f2520z, split.length > 1 ? new Locale(split[0], split[1]) : new Locale(split[0]));
        this.f2504j = ViewConfiguration.get(context).getScaledTouchSlop();
        if (KonyMain.f3656d > 14) {
            setDrawingCacheEnabled(true);
        }
    }

    private View m2409G() {
        int i = 0;
        View linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        while (i < 7) {
            ba baVar = new ba(this, getContext(), this.f2485N, this.f2488Q);
            baVar.m2030a(this.ap);
            this.f2518x.add(baVar);
            linearLayout.addView(baVar.m2026a());
            i++;
        }
        return linearLayout;
    }

    private void m2410H() {
        int i = 0;
        this.f2478G.setGravity(17);
        View linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        for (int i2 = 0; i2 < 7; i2++) {
            Context context = getContext();
            int i3 = this.f2485N;
            View beVar = new be(context, this.f2486O, this.f2487P);
            beVar.m2043a(aZ.m1941a(i2, this.f2482K));
            linearLayout.addView(beVar);
        }
        this.aq = linearLayout;
        this.aq.setVisibility(this.ar);
        this.f2478G.addView(this.aq);
        this.f2518x.clear();
        while (i < 6) {
            this.f2478G.addView(m2409G());
            i++;
        }
    }

    private void m2411I() {
        int i;
        this.f2483L = this.f2472A.get(2);
        this.f2484M = this.f2472A.get(1);
        this.f2472A.set(5, 1);
        int i2 = this.f2472A.get(2);
        String str = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{f2471i[i2]});
        if (str == null || str.length() == 0) {
            str = aZ.m1943b(i2);
        }
        str = str + " " + this.f2472A.get(1);
        if (this.f2507m != null) {
            this.f2481J.setText(this.f2507m.m1118a(str));
        } else {
            this.f2481J.setText(str);
        }
        i2 = this.f2482K;
        if (i2 == 2) {
            i = this.f2472A.get(7) - 2;
            if (i < 0) {
                i = 6;
            }
        } else {
            i = 0;
        }
        if (i2 == 1) {
            i = this.f2472A.get(7) - 1;
            if (i < 0) {
                i = 6;
            }
        }
        this.f2472A.add(7, -i);
    }

    private void m2412J() {
        this.aa = null;
        this.ab = null;
        this.ac = false;
        this.ad = null;
        this.f2502g = -1;
    }

    private void m2413K() {
        if (this.f2514t != -1 && this.f2513s != -1 && this.f2512r != -1) {
            this.ag = true;
            GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f2512r, this.f2513s, this.f2514t);
            if (this.aa != null || this.ab != null) {
                if (this.ac) {
                    if (!m2416a(gregorianCalendar)) {
                        this.ag = false;
                        this.f2475D.setTimeInMillis(System.currentTimeMillis());
                        this.f2512r = this.f2475D.get(1);
                        this.f2513s = this.f2475D.get(2);
                        this.f2514t = this.f2475D.get(5);
                    }
                } else if (m2416a(gregorianCalendar)) {
                    this.ag = false;
                    this.f2475D.setTimeInMillis(System.currentTimeMillis());
                    this.f2512r = this.f2475D.get(1);
                    this.f2513s = this.f2475D.get(2);
                    this.f2514t = this.f2475D.get(5);
                }
            }
        }
    }

    private boolean m2416a(GregorianCalendar gregorianCalendar) {
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i = 0; i < size; i++) {
                if (((GregorianCalendar) this.aa.get(i)).equals(gregorianCalendar)) {
                    return true;
                }
            }
            return false;
        }
        Object obj = this.ab[0];
        Object obj2 = this.ab[1];
        return gregorianCalendar.equals(obj) || gregorianCalendar.equals(obj2) || (gregorianCalendar.after(obj) && gregorianCalendar.before(obj2));
    }

    private static Drawable m2422d(int i) {
        return new PaintDrawable(i);
    }

    public final void m2424A() {
        m2412J();
        if (this.am) {
            m2480j();
        }
    }

    public final Drawable m2425B() {
        return this.ad;
    }

    public final Drawable m2426C() {
        return this.af;
    }

    public final boolean m2427D() {
        return this.ag;
    }

    public final void m2428E() {
        Iterator it = this.f2518x.iterator();
        while (it.hasNext()) {
            ((ba) it.next()).invalidate();
        }
    }

    public final LuaTable m2429F() {
        LuaTable luaTable = new LuaTable(2, 0);
        luaTable.list.add(new Double((double) (this.f2483L + 1)));
        luaTable.list.add(new Double((double) this.f2484M));
        return luaTable;
    }

    public void m2430a() {
        int i = 0;
        if (!this.am) {
            float applyDimension = TypedValue.applyDimension(2, 1.0f, getContext().getResources().getDisplayMetrics());
            this.f2485N = (int) (((double) (((float) this.f2485N) * applyDimension)) + 0.5d);
            this.f2486O = (int) (((double) (((float) this.f2486O) * applyDimension)) + 0.5d);
            this.f2487P = (int) (((double) (((float) this.f2487P) * applyDimension)) + 0.5d);
            this.f2488Q = (int) (((double) (applyDimension * ((float) this.f2488Q))) + 0.5d);
            this.f2482K = 1;
            setLayoutParams(new LayoutParams(-1, -2));
            setOrientation(1);
            this.an = new RelativeLayout(getContext());
            this.an.setVisibility(this.ao);
            LinearLayout aTVar = new aT(this, getContext());
            aTVar.setLayoutParams(new LayoutParams(-1, -2));
            aTVar.setOrientation(1);
            aTVar.setGravity(17);
            this.f2478G = aTVar;
            RelativeLayout relativeLayout = this.an;
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            relativeLayout.setPadding(0, 0, 0, 1);
            this.f2481J = new TextView(getContext());
            this.f2481J.setText(BuildConfig.FLAVOR);
            if (((AccessibilityManager) KonyMain.getAppContext().getSystemService("accessibility")).isEnabled()) {
                this.f2481J.setFocusable(true);
            }
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f2481J.setLayoutParams(layoutParams);
            this.f2481J.setGravity(17);
            this.f2479H = new Button(getContext());
            this.f2479H.setContentDescription("Previous Month");
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            this.f2479H.setLayoutParams(layoutParams);
            this.f2479H.setId(as);
            this.f2479H.setBackgroundDrawable(this.f2516v != null ? this.f2516v : dB.m1112c("ic_cal_prev"));
            this.f2480I = new Button(getContext());
            this.f2480I.setContentDescription("Next Month");
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            this.f2480I.setLayoutParams(layoutParams);
            this.f2480I.setBackgroundDrawable(this.f2517w != null ? this.f2517w : dB.m1112c("ic_cal_next"));
            this.f2479H.setOnClickListener(new aQ(this));
            this.f2480I.setOnClickListener(new aR(this));
            relativeLayout.setGravity(17);
            relativeLayout.addView(this.f2479H);
            relativeLayout.addView(this.f2481J);
            relativeLayout.addView(this.f2480I);
            m2410H();
            addView(this.an);
            addView(this.f2478G);
            setLayoutParams(this.f2508n);
            int n = this.f2505k != null ? this.f2505k.m1158n() : 0;
            if (this.f2506l != null) {
                i = this.f2506l.m1158n();
            }
            if (n > i) {
                this.f2509o.setMargins(n, n, n, n);
            } else {
                this.f2509o.setMargins(i, i, i, i);
            }
            m2481k();
            this.f2475D.set(this.f2512r, this.f2513s, this.f2514t);
            if (!this.ax) {
                this.f2472A.set(this.f2512r, this.f2513s, this.f2514t);
            }
            m2484n();
            this.f2473B.setTimeInMillis(System.currentTimeMillis());
            this.f2473B.setFirstDayOfWeek(this.f2482K);
            if (this.f2475D.getTimeInMillis() == 0) {
                if (!this.ax) {
                    this.f2472A.setTimeInMillis(System.currentTimeMillis());
                }
                this.f2472A.setFirstDayOfWeek(this.f2482K);
            } else {
                if (!this.ax) {
                    this.f2472A.setTimeInMillis(this.f2475D.getTimeInMillis());
                }
                this.f2472A.setFirstDayOfWeek(this.f2482K);
            }
            m2411I();
            this.f2472A = this.f2472A;
            ba q = m2487q();
            if (q != null) {
                q.requestFocus();
            }
            this.am = true;
        }
    }

    public void m2431a(float f) {
        this.f2508n.width = 0;
        this.f2508n.weight = f;
        setLayoutParams(this.f2508n);
    }

    public void m2432a(int i) {
        setGravity(i);
    }

    public void m2433a(int i, int i2) {
        setVisibility(i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2434a(int r9, int r10, int r11) {
        /*
        r8 = this;
        r6 = 0;
        r0 = 1;
        r2 = java.util.Calendar.getInstance();
        r2.setTimeInMillis(r6);
        r2.set(r11, r10, r9);
        r1 = 0;
        r3 = r8.f2476E;
        r4 = r3.getTimeInMillis();
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0032;
    L_0x0018:
        r3 = r8.f2477F;
        r4 = r3.getTimeInMillis();
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0032;
    L_0x0022:
        if (r0 == 0) goto L_0x0031;
    L_0x0024:
        r8.f2513s = r10;
        r8.f2514t = r9;
        r8.f2512r = r11;
        r0 = r8.am;
        if (r0 == 0) goto L_0x0031;
    L_0x002e:
        r8.m2480j();
    L_0x0031:
        return;
    L_0x0032:
        r3 = r8.f2477F;
        r4 = r3.getTimeInMillis();
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x004e;
    L_0x003c:
        r3 = r8.f2476E;
        r3 = r2.equals(r3);
        if (r3 != 0) goto L_0x0022;
    L_0x0044:
        r3 = r8.f2476E;
        r2 = r2.after(r3);
        if (r2 != 0) goto L_0x0022;
    L_0x004c:
        r0 = r1;
        goto L_0x0022;
    L_0x004e:
        r3 = r8.f2476E;
        r4 = r3.getTimeInMillis();
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0069;
    L_0x0058:
        r3 = r8.f2477F;
        r3 = r2.equals(r3);
        if (r3 != 0) goto L_0x0022;
    L_0x0060:
        r3 = r8.f2477F;
        r2 = r2.before(r3);
        if (r2 == 0) goto L_0x004c;
    L_0x0068:
        goto L_0x0022;
    L_0x0069:
        r3 = r8.f2476E;
        r3 = r2.equals(r3);
        if (r3 != 0) goto L_0x0022;
    L_0x0071:
        r3 = r8.f2477F;
        r3 = r2.equals(r3);
        if (r3 != 0) goto L_0x0022;
    L_0x0079:
        r3 = r8.f2476E;
        r3 = r2.after(r3);
        if (r3 == 0) goto L_0x004c;
    L_0x0081:
        r3 = r8.f2477F;
        r2 = r2.before(r3);
        if (r2 == 0) goto L_0x004c;
    L_0x0089:
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.aO.a(int, int, int):void");
    }

    public final void m2435a(aS aSVar) {
        this.az = aSVar;
    }

    public final void m2436a(aU aUVar) {
        this.aA = aUVar;
    }

    public void m2437a(dB dBVar) {
        this.f2505k = dBVar;
        this.f2511q = dBVar.m1162p();
    }

    public final void m2438a(ib ibVar) {
        this.at = ibVar;
    }

    public void m2439a(String str) {
        this.f2520z = str;
        this.f2519y.applyPattern(str);
    }

    public final void m2440a(ArrayList arrayList, dB dBVar) {
        this.ae = arrayList;
        this.af = null;
        this.f2503h = -1;
        if (dBVar != null) {
            this.af = dBVar.m1162p();
            this.f2503h = dBVar.m1156m();
        }
        if (this.am) {
            m2487q();
        }
    }

    public final void m2441a(ArrayList arrayList, dB dBVar, boolean z) {
        m2412J();
        this.aa = arrayList;
        this.ac = z;
        if (dBVar != null) {
            this.ad = dBVar.m1162p();
            this.f2502g = dBVar.m1156m();
        }
        m2413K();
        if (this.am) {
            m2480j();
        }
    }

    public void m2442a(boolean z) {
        this.f2508n.width = -1;
    }

    public void m2443a(int[] iArr) {
        this.al = new Rect();
        this.al.left = iArr[0];
        this.al.top = iArr[1];
        this.al.right = iArr[2];
        this.al.bottom = iArr[3];
        ez.m1344a(iArr, this, this.f2508n);
        setLayoutParams(this.f2508n);
    }

    public final void m2444a(GregorianCalendar[] gregorianCalendarArr, dB dBVar, boolean z) {
        m2412J();
        this.ab = gregorianCalendarArr;
        this.ac = z;
        if (dBVar != null) {
            this.ad = dBVar.m1162p();
            this.f2502g = dBVar.m1156m();
        }
        m2413K();
        if (this.am) {
            m2480j();
        }
    }

    public View m2445b() {
        return this;
    }

    public void m2446b(int i) {
    }

    public final void m2447b(int i, int i2) {
        this.f2483L = i;
        this.f2484M = i2;
        this.ax = true;
        this.f2472A.set(5, 1);
        this.f2472A.set(2, this.f2483L);
        this.f2472A.set(1, this.f2484M);
        if (this.am) {
            m2411I();
            m2487q();
        }
    }

    public final void m2448b(int i, int i2, int i3) {
        this.f2476E.set(i3, i2, i);
        if (this.f2477F.getTimeInMillis() != 0 && this.f2477F.getTimeInMillis() < this.f2476E.getTimeInMillis()) {
            this.f2476E.setTimeInMillis(0);
        }
    }

    public void m2449b(dB dBVar) {
        this.f2506l = dBVar;
        this.f2510p = dBVar.m1162p();
    }

    public void m2450b(String str) {
    }

    public void m2451b(boolean z) {
    }

    public void m2452b(int[] iArr) {
    }

    public void m2453c() {
        if (this.f2510p != null) {
            this.f2510p.setCallback(null);
        }
        dB.m1104a(this.f2510p);
        if (this.f2511q != null) {
            this.f2511q.setCallback(null);
        }
        dB.m1104a(this.f2511q);
        if (this.f2490S != null) {
            this.f2490S.setCallback(null);
        }
        dB.m1104a(this.f2490S);
        if (this.f2491T != null) {
            this.f2491T.setCallback(null);
        }
        dB.m1104a(this.f2491T);
        if (this.f2492U != null) {
            this.f2492U.setCallback(null);
        }
        dB.m1104a(this.f2492U);
        if (this.f2493V != null) {
            this.f2493V.setCallback(null);
        }
        dB.m1104a(this.f2493V);
        if (this.f2495Z != null) {
            this.f2495Z.setCallback(null);
        }
        dB.m1104a(this.f2495Z);
        if (this.f2494W != null) {
            this.f2494W.setCallback(null);
        }
        dB.m1104a(this.f2494W);
        if (this.f2516v != null) {
            this.f2516v.setCallback(null);
        }
        dB.m1104a(this.f2516v);
        if (this.f2517w != null) {
            this.f2517w.setCallback(null);
        }
        dB.m1104a(this.f2517w);
        if (this.ad != null) {
            this.ad.setCallback(null);
        }
        dB.m1104a(this.ad);
        if (this.af != null) {
            this.af.setCallback(null);
        }
        dB.m1104a(this.af);
        removeAllViews();
    }

    public final void m2454c(int i) {
        this.ay = i;
    }

    public final void m2455c(int i, int i2, int i3) {
        this.f2477F.set(i3, i2, i);
        if (this.f2477F.getTimeInMillis() < this.f2476E.getTimeInMillis()) {
            this.f2477F.setTimeInMillis(0);
        }
    }

    public final void m2456c(dB dBVar) {
        Drawable p = dBVar.m1162p();
        if (p != null) {
            this.f2490S = p;
        }
        this.f2496a = dBVar.m1156m();
    }

    public void m2457c(String str) {
    }

    public void m2458c(boolean z) {
        setClickable(z);
        setFocusable(z);
    }

    public int m2459d() {
        return this.f2514t;
    }

    public final void m2460d(dB dBVar) {
        Drawable p = dBVar.m1162p();
        if (p != null) {
            this.f2491T = p;
        }
        this.f2501f = dBVar.m1156m();
    }

    public void m2461d(String str) {
        if (KonyMain.f3656d > 3) {
            setContentDescription(str);
        }
    }

    public final void m2462d(boolean z) {
        this.av = z;
    }

    public int m2463e() {
        return this.f2513s;
    }

    public final void m2464e(dB dBVar) {
        Drawable p = dBVar.m1162p();
        if (p != null) {
            this.f2492U = p;
        }
        this.f2500e = dBVar.m1156m();
    }

    public final void m2465e(String str) {
        this.f2516v = dB.m1112c(str);
    }

    public final void m2466e(boolean z) {
        this.ak = z;
    }

    public int m2467f() {
        return this.f2512r;
    }

    public final void m2468f(dB dBVar) {
        Drawable p = dBVar.m1162p();
        if (p != null) {
            this.f2493V = p;
        }
        this.f2498c = dBVar.m1156m();
    }

    public final void m2469f(String str) {
        this.f2517w = dB.m1112c(str);
    }

    public final void m2470f(boolean z) {
        this.ao = !z ? 0 : 8;
        if (this.an != null) {
            this.an.setVisibility(this.ao);
        }
    }

    public void m2471g() {
        this.f2512r = -1;
        this.f2513s = -1;
        this.f2514t = -1;
        m2488r();
    }

    public final void m2472g(dB dBVar) {
        Drawable p = dBVar.m1162p();
        if (p != null) {
            this.f2494W = p;
        }
        this.f2497b = dBVar.m1156m();
    }

    public final void m2473g(String str) {
        if (this.f2479H != null && str != null) {
            this.f2516v = dB.m1112c(str);
            this.f2479H.setBackgroundDrawable(this.f2516v != null ? this.f2516v : dB.m1112c("ic_cal_prev"));
        }
    }

    public final void m2474g(boolean z) {
        this.ar = !z ? 0 : 8;
        if (this.aq != null) {
            this.aq.setVisibility(this.ar);
        }
    }

    public String m2475h() {
        return this.f2515u;
    }

    public final void m2476h(dB dBVar) {
        Drawable p = dBVar.m1162p();
        if (p != null) {
            this.f2495Z = p;
        }
        this.f2499d = dBVar.m1156m();
    }

    public final void m2477h(String str) {
        if (this.f2480I != null && str != null) {
            this.f2517w = dB.m1112c(str);
            this.f2480I.setBackgroundDrawable(this.f2517w != null ? this.f2517w : dB.m1112c("ic_cal_next"));
        }
    }

    public void m2478i() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m2479i(dB dBVar) {
        this.f2507m = dBVar;
    }

    public final void m2480j() {
        if (this.f2514t != -1 && this.f2513s != -1 && this.f2512r != -1) {
            this.f2475D.set(this.f2512r, this.f2513s, this.f2514t);
            this.f2472A.set(this.f2512r, this.f2513s, this.f2514t);
            m2484n();
            m2411I();
            m2487q();
        }
    }

    public final void m2481k() {
        if (this.f2507m != null) {
            this.f2478G.setBackgroundColor(this.f2507m.m1142g());
            this.f2507m.m1129b(this.f2481J);
            return;
        }
        this.f2481J.setTypeface(Typeface.DEFAULT, 1);
        this.f2481J.setTextSize(19.0f);
        if (this.aw) {
            this.f2481J.setTextColor(-1);
        } else {
            this.f2481J.setTextColor(-12303292);
        }
    }

    public final String m2482l() {
        return this.f2520z;
    }

    protected void m2483m() {
    }

    public void m2484n() {
        if (this.f2514t != -1 && this.f2513s != -1 && this.f2512r != -1) {
            Calendar instance = Calendar.getInstance();
            instance.setLenient(false);
            instance.set(this.f2512r, this.f2513s, this.f2514t);
            this.f2515u = this.f2519y.format(instance.getTime());
        }
    }

    public final void m2485o() {
        this.f2483L++;
        if (this.f2483L == 12) {
            this.f2483L = 0;
            this.f2484M++;
        }
        this.f2472A.set(5, 1);
        this.f2472A.set(2, this.f2483L);
        this.f2472A.set(1, this.f2484M);
        m2411I();
        m2487q();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.ai = (int) motionEvent.getY();
                this.aj = (int) motionEvent.getX();
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                int abs = (int) Math.abs(motionEvent.getX() - ((float) this.aj));
                if (abs > ((int) Math.abs(motionEvent.getY() - ((float) this.ai))) && abs > this.f2504j) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
        }
        return false;
    }

    public final void m2486p() {
        this.f2483L--;
        if (this.f2483L == -1) {
            this.f2483L = 11;
            this.f2484M--;
        }
        this.f2472A.set(5, 1);
        this.f2472A.set(2, this.f2483L);
        this.f2472A.set(1, this.f2484M);
        m2411I();
        m2487q();
    }

    public final ba m2487q() {
        Object obj = this.f2475D.getTimeInMillis() != 0 ? 1 : null;
        int i = this.f2475D.get(1);
        int i2 = this.f2475D.get(2);
        int i3 = this.f2475D.get(5);
        int i4 = this.f2477F.get(1);
        int i5 = this.f2477F.get(2);
        int i6 = this.f2477F.get(5);
        int i7 = this.f2476E.get(1);
        int i8 = this.f2476E.get(2);
        int i9 = this.f2476E.get(5);
        this.f2474C.setTimeInMillis(this.f2472A.getTimeInMillis());
        this.aA.m513a();
        int i10 = 0;
        ba baVar = null;
        while (i10 < this.f2518x.size()) {
            boolean z;
            boolean z2;
            ba baVar2;
            View a;
            int i11 = this.f2474C.get(2);
            ba baVar3 = (ba) this.f2518x.get(i10);
            baVar3.m2040f();
            int i12 = this.f2474C.get(1);
            int i13 = this.f2474C.get(5);
            int i14 = this.f2474C.get(7);
            boolean z3 = false;
            if (this.ae != null) {
                if (this.ae != null) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(i12, i11, i13);
                    int size = this.ae.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        if (((GregorianCalendar) this.ae.get(i15)).equals(gregorianCalendar)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
            }
            baVar3.m2039e(z3);
            z3 = false;
            if (this.f2473B.get(1) == i12 && this.f2473B.get(2) == i11 && this.f2473B.get(5) == i13) {
                z3 = true;
            }
            boolean z4 = false;
            if (i14 == 7 || i14 == 1) {
                z4 = true;
            }
            baVar3.m2028a(i12, i11, i13, z3, z4, this.f2483L);
            boolean z5 = obj != null && i3 == i13 && i2 == i11 && i == i12;
            baVar3.setSelected(z5);
            ba baVar4 = z5 ? baVar3 : baVar;
            Object obj2 = null;
            if (i12 > i7) {
                obj2 = 1;
            } else if (i12 == i7) {
                if (i11 > i8) {
                    obj2 = 1;
                } else if (i11 == i8 && i13 >= i9) {
                    obj2 = 1;
                }
            }
            if (this.f2477F.getTimeInMillis() != 0) {
                if (obj2 != null) {
                    if (i12 < i4) {
                        z = true;
                    } else if (i12 == i4) {
                        if (i11 < i5) {
                            z = true;
                        } else if (i11 == i5 && i13 <= i6) {
                            z = true;
                        }
                    }
                }
                z = false;
            } else {
                if (this.f2477F.getTimeInMillis() == 0 && obj2 != null) {
                    z = true;
                }
                z = false;
            }
            if (!this.av && z && z4) {
                z2 = false;
                baVar3.m2032b(false);
            } else {
                baVar3.m2032b(true);
                z2 = z;
            }
            baVar3.m2034c(false);
            baVar3.m2036d(false);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(i12, i11, i13);
            if (z && !(this.aa == null && this.ab == null)) {
                if (m2416a(gregorianCalendar2)) {
                    z2 = this.ac;
                    baVar3.m2034c(true);
                    if (!(this.ac || !z5 || z3)) {
                        baVar2 = null;
                        baVar3.setSelected(false);
                        a = this.az.m512a(gregorianCalendar2);
                        if (a == null) {
                            baVar3.m2029a(a);
                        }
                        baVar3.m2031a(z2);
                        baVar3.m2027a(this.ay);
                        baVar3.invalidate();
                        this.f2474C.add(5, 1);
                        i10++;
                        baVar = baVar2;
                    }
                } else if (!z4) {
                    baVar3.m2036d(true);
                    z2 = !this.ac;
                    if (!(!z5 || z2 || z3)) {
                        baVar2 = null;
                        baVar3.setSelected(false);
                        a = this.az.m512a(gregorianCalendar2);
                        if (a == null) {
                            baVar3.m2029a(a);
                        }
                        baVar3.m2031a(z2);
                        baVar3.m2027a(this.ay);
                        baVar3.invalidate();
                        this.f2474C.add(5, 1);
                        i10++;
                        baVar = baVar2;
                    }
                }
            }
            baVar2 = baVar4;
            a = this.az.m512a(gregorianCalendar2);
            if (a == null) {
                baVar3.m2029a(a);
            }
            baVar3.m2031a(z2);
            baVar3.m2027a(this.ay);
            baVar3.invalidate();
            this.f2474C.add(5, 1);
            i10++;
            baVar = baVar2;
        }
        return baVar;
    }

    public final void m2488r() {
        this.f2475D.setTimeInMillis(0);
        for (int i = 0; i < this.f2518x.size(); i++) {
            ba baVar = (ba) this.f2518x.get(i);
            if (baVar.m2033b()) {
                baVar.setSelected(false);
            }
        }
    }

    public final int m2489s() {
        return this.f2489R;
    }

    public void setHeight(int i) {
        this.f2508n.height = i;
        setLayoutParams(this.f2508n);
    }

    public final Drawable m2490t() {
        return this.f2490S;
    }

    public final Drawable m2491u() {
        return this.f2491T;
    }

    public final Drawable m2492v() {
        return this.f2492U;
    }

    public final Drawable m2493w() {
        return this.f2493V;
    }

    public final Drawable m2494x() {
        return this.f2495Z;
    }

    public final Drawable m2495y() {
        return this.f2494W;
    }

    public final void m2496z() {
        this.aw = true;
    }
}
