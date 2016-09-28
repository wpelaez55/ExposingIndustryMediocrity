package com.konylabs.api.ui;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnFocusChangeListener;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ny0k.C0284S;

/* renamed from: com.konylabs.api.ui.G */
public final class C0371G extends TextView implements OnCreateContextMenuListener, C0212n {
    private String f2442A;
    private ib f2443B;
    private String f2444C;
    public OnFocusChangeListener f2445a;
    private dB f2446b;
    private dB f2447c;
    private LinearLayout f2448d;
    private LinearLayout f2449e;
    private LayoutParams f2450f;
    private LayoutParams f2451g;
    private LayoutParams f2452h;
    private Drawable f2453i;
    private Drawable f2454j;
    private int f2455k;
    private int f2456l;
    private int f2457m;
    private String f2458n;
    private SimpleDateFormat f2459o;
    private String f2460p;
    private ImageView f2461q;
    private Calendar f2462r;
    private Calendar f2463s;
    private Boolean f2464t;
    private DatePickerDialog f2465u;
    private String f2466v;
    private OnDateSetListener f2467w;
    private OnDismissListener f2468x;
    private OnClickListener f2469y;
    private boolean f2470z;

    public C0371G(Context context) {
        super(context);
        this.f2453i = null;
        this.f2454j = null;
        this.f2455k = -1;
        this.f2456l = -1;
        this.f2457m = -1;
        this.f2458n = "dd/MM/yyyy";
        this.f2460p = BuildConfig.FLAVOR;
        this.f2462r = Calendar.getInstance();
        this.f2463s = Calendar.getInstance();
        this.f2464t = null;
        this.f2466v = BuildConfig.FLAVOR;
        this.f2467w = new C0178H(this);
        this.f2468x = new C0179I(this);
        this.f2469y = new C0180J(this);
        this.f2470z = false;
        this.f2445a = new C0182L(this);
        this.f2442A = "ic_cal_icon.png";
        this.f2443B = null;
        this.f2461q = new ImageView(context);
        setId(111);
        this.f2461q.setId(222);
        this.f2448d = new LinearLayout(context);
        this.f2449e = new LinearLayout(context);
        this.f2450f = new LayoutParams(-2, -2);
        this.f2451g = new LayoutParams(-2, -2);
        this.f2452h = new LayoutParams(-2, -2);
        this.f2449e.addView(this, this.f2452h);
        this.f2449e.addView(this.f2461q, new LayoutParams(-2, -2));
        this.f2449e.setGravity(19);
        this.f2448d.addView(this.f2449e, this.f2451g);
        this.f2448d.setOnCreateContextMenuListener(this);
        this.f2448d.setFocusable(true);
        this.f2448d.setOnFocusChangeListener(this.f2445a);
        this.f2449e.setOnClickListener(this.f2469y);
        setOnClickListener(this.f2469y);
        String[] split = C0284S.m1823a(KonyMain.getAppContext()).m1841b().split("_");
        this.f2459o = new SimpleDateFormat("dd/MM/yyyy", split.length > 1 ? new Locale(split[0], split[1]) : new Locale(split[0]));
        this.f2463s.setTimeInMillis(0);
        this.f2462r.setTimeInMillis(0);
        if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(2);
            this.f2448d.setImportantForAccessibility(2);
        }
    }

    private void m2370a(CharSequence charSequence) {
        if (hasFocus()) {
            setText(this.f2447c.m1118a(charSequence.toString()));
        } else {
            setText(this.f2446b.m1118a(charSequence.toString()));
        }
        m2377g(this.f2466v + charSequence.toString());
    }

    public static boolean m2374d(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.setLenient(false);
        instance.set(i3, i2, i);
        try {
            instance.getTime();
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static int m2375e(String str) {
        int i = 0;
        String toLowerCase = str.toLowerCase();
        String[] strArr = new String[]{"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        while (i < strArr.length) {
            if (strArr[i].equals(toLowerCase)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean m2376f(String str) {
        try {
            new SimpleDateFormat().applyPattern(str);
            return true;
        } catch (IllegalArgumentException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyCalendar", str + " date format pattern is not valid " + e.toString());
            }
            return false;
        }
    }

    private void m2377g(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            this.f2449e.setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                this.f2449e.setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            this.f2466v = BuildConfig.FLAVOR;
            this.f2449e.setImportantForAccessibility(2);
        } else {
            this.f2449e.setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final void m2378a() {
        if (!this.f2470z) {
            this.f2448d.setLayoutParams(this.f2450f);
            int n = this.f2446b != null ? this.f2446b.m1158n() : 0;
            int n2 = this.f2447c != null ? this.f2447c.m1158n() : 0;
            if (n > n2) {
                this.f2452h.setMargins(n, n, n, n);
            } else {
                this.f2452h.setMargins(n2, n2, n2, n2);
            }
            this.f2461q.setImageDrawable(dB.m1112c(this.f2442A));
            m2394b(false);
            this.f2470z = true;
        }
    }

    public final void m2379a(float f) {
        this.f2450f.width = 0;
        this.f2450f.weight = f;
        this.f2448d.setLayoutParams(this.f2450f);
    }

    public final void m2380a(int i) {
        this.f2450f.gravity = i;
        this.f2448d.setGravity(i);
    }

    public final void m2381a(int i, int i2) {
        if (i == -1) {
            this.f2449e.setVisibility(i2 == 0 ? 0 : 8);
        } else {
            this.f2449e.setVisibility(i2);
        }
        this.f2448d.setVisibility(i2);
    }

    public final void m2382a(int i, int i2, int i3) {
        this.f2456l = i2;
        this.f2457m = i;
        this.f2455k = i3;
        m2407j();
    }

    public final void m2383a(dB dBVar) {
        this.f2446b = dBVar;
        this.f2454j = dBVar.m1127b(true);
    }

    public final void m2384a(ib ibVar) {
        this.f2443B = ibVar;
    }

    public final void m2385a(Boolean bool) {
        this.f2464t = bool;
    }

    public final void m2386a(String str) {
        this.f2458n = str;
        if (this.f2444C != null) {
            m2370a(this.f2444C);
        } else {
            m2370a((CharSequence) str);
        }
        this.f2459o.applyPattern(str);
    }

    public final void m2387a(boolean z) {
        this.f2450f.width = -1;
        this.f2451g.width = -1;
        this.f2452h.weight = 1.0f;
        setLayoutParams(this.f2452h);
        this.f2449e.setLayoutParams(this.f2451g);
        this.f2448d.setLayoutParams(this.f2450f);
    }

    public final void m2388a(int[] iArr) {
        ez.m1344a(iArr, this.f2448d, this.f2450f);
        this.f2448d.setLayoutParams(this.f2450f);
    }

    public final View m2389b() {
        return this.f2448d;
    }

    public final void m2390b(int i) {
        setGravity(i);
    }

    public final void m2391b(int i, int i2, int i3) {
        this.f2462r.set(i3, i2, i, 0, 0, 0);
    }

    public final void m2392b(dB dBVar) {
        this.f2447c = dBVar;
        this.f2453i = dBVar.m1127b(true);
    }

    public final void m2393b(String str) {
        this.f2442A = str;
        if (this.f2461q != null && this.f2442A != null) {
            this.f2461q.setImageDrawable(dB.m1112c(this.f2442A));
        }
    }

    public final void m2394b(boolean z) {
        if (!z) {
            this.f2446b.m1129b((TextView) this);
            this.f2449e.setBackgroundDrawable(this.f2454j);
        } else if (this.f2447c != null) {
            this.f2447c.m1129b((TextView) this);
            this.f2449e.setBackgroundDrawable(this.f2453i);
        }
    }

    public final void m2395b(int[] iArr) {
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m2396c() {
        if (this.f2465u != null) {
            this.f2465u.dismiss();
        }
        if (this.f2453i != null) {
            this.f2453i.setCallback(null);
        }
        dB.m1104a(this.f2453i);
        if (this.f2454j != null) {
            this.f2454j.setCallback(null);
        }
        dB.m1104a(this.f2454j);
    }

    public final void m2397c(int i, int i2, int i3) {
        this.f2463s.set(i3, i2, i);
    }

    public final void m2398c(String str) {
        this.f2444C = str;
        if (this.f2444C != null) {
            m2370a(this.f2444C);
        } else {
            m2370a(this.f2459o.toPattern());
        }
    }

    public final void m2399c(boolean z) {
        this.f2448d.setClickable(z);
        this.f2449e.setClickable(z);
        this.f2448d.setFocusable(z);
        this.f2449e.setFocusable(z);
        setClickable(z);
        this.f2461q.setClickable(z);
        if (z) {
            this.f2449e.setOnClickListener(this.f2469y);
            setOnClickListener(this.f2469y);
            this.f2461q.setOnClickListener(this.f2469y);
            return;
        }
        this.f2449e.setOnClickListener(null);
        setOnClickListener(null);
        this.f2461q.setOnClickListener(null);
    }

    public final int m2400d() {
        return this.f2457m;
    }

    public final void m2401d(String str) {
        if (str != null) {
            this.f2466v = str;
            m2377g(this.f2466v + getText());
            return;
        }
        m2377g(null);
    }

    public final int m2402e() {
        return this.f2456l;
    }

    public final int m2403f() {
        return this.f2455k;
    }

    public final void m2404g() {
        this.f2455k = -1;
        this.f2456l = -1;
        this.f2457m = -1;
        if (this.f2444C != null) {
            m2370a(this.f2444C);
        } else {
            m2370a(this.f2459o.toPattern());
        }
    }

    public final String m2405h() {
        return this.f2460p;
    }

    public final void m2406i() {
        this.f2448d.setFocusableInTouchMode(true);
        this.f2448d.requestFocus();
        this.f2448d.setFocusableInTouchMode(false);
    }

    public final void m2407j() {
        if (this.f2457m == -1 || this.f2456l == -1 || this.f2455k == -1) {
            m2386a(this.f2458n);
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.setLenient(false);
        instance.set(this.f2455k, this.f2456l, this.f2457m, 0, 0, 0);
        this.f2460p = this.f2459o.format(instance.getTime());
        m2370a(this.f2460p);
        this.f2445a.onFocusChange(this, false);
    }

    public final void m2408k() {
        int i;
        int i2;
        int i3;
        if (this.f2455k < 1970 || this.f2456l < 0 || this.f2457m <= 0) {
            Calendar instance = Calendar.getInstance();
            i = instance.get(1);
            i2 = instance.get(2);
            i3 = instance.get(5);
        } else {
            i = this.f2455k;
            i2 = this.f2456l;
            i3 = this.f2457m;
        }
        Context actContext = KonyMain.getActContext();
        if (actContext != null) {
            this.f2465u = new C0181K(this, actContext, this.f2467w, i, i2, i3);
            this.f2465u.setOnDismissListener(this.f2468x);
            if (KonyMain.f3656d >= 11) {
                DatePicker datePicker = this.f2465u.getDatePicker();
                if (this.f2464t != null) {
                    datePicker.setCalendarViewShown(this.f2464t.booleanValue());
                }
                if (this.f2462r.getTimeInMillis() > this.f2463s.getTimeInMillis()) {
                    datePicker.setMinDate(this.f2462r.getTimeInMillis());
                } else {
                    if (this.f2462r.getTimeInMillis() > 0) {
                        datePicker.setMinDate(this.f2462r.getTimeInMillis());
                    }
                    if (this.f2463s.getTimeInMillis() > 0) {
                        datePicker.setMaxDate(this.f2463s.getTimeInMillis());
                    }
                }
            }
            this.f2465u.show();
        }
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.add("Clear").setOnMenuItemClickListener(new C0183M(this));
    }

    public final void setHeight(int i) {
        this.f2450f.height = i;
        this.f2448d.setLayoutParams(this.f2450f);
    }
}
