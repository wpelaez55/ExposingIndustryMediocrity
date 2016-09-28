package com.konylabs.api.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ny0k.C0284S;

public final class cH extends aO implements OnCreateContextMenuListener {
    private String f3542A;
    private SimpleDateFormat f3543B;
    private String f3544C;
    private ImageView f3545D;
    private String f3546E;
    private OnClickListener f3547F;
    private OnKeyListener f3548G;
    private boolean f3549H;
    private String f3550I;
    private String f3551J;
    Dialog f3552k;
    public OnFocusChangeListener f3553l;
    private Context f3554m;
    private dB f3555n;
    private dB f3556o;
    private LinearLayout f3557p;
    private RelativeLayout f3558q;
    private TextView f3559r;
    private LayoutParams f3560s;
    private RelativeLayout.LayoutParams f3561t;
    private LayoutParams f3562u;
    private Drawable f3563v;
    private Drawable f3564w;
    private int f3565x;
    private int f3566y;
    private int f3567z;

    public cH(Context context) {
        super(context);
        this.f3563v = null;
        this.f3564w = null;
        this.f3565x = -1;
        this.f3566y = -1;
        this.f3567z = -1;
        this.f3542A = "dd/MM/yyyy";
        this.f3544C = BuildConfig.FLAVOR;
        this.f3546E = BuildConfig.FLAVOR;
        this.f3547F = new cI(this);
        this.f3548G = new cJ(this);
        this.f3549H = false;
        this.f3553l = new cK(this);
        this.f3550I = "ic_cal_icon.png";
        this.f3554m = context;
        this.f3545D = new ImageView(context);
        this.f3545D.setId(222);
        this.f3559r = new TextView(context);
        this.f3557p = new LinearLayout(context);
        this.f3558q = new RelativeLayout(context);
        this.f3562u = new LayoutParams(-2, -2);
        this.f3560s = new LayoutParams(-2, -2);
        this.f3561t = new RelativeLayout.LayoutParams(-2, -2);
        if (KonyMain.f3656d > 3) {
            this.f3559r.setId(111);
            this.f3561t.addRule(15);
        }
        this.f3558q.addView(this.f3559r, this.f3561t);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(1, 111);
        layoutParams.addRule(15);
        this.f3558q.addView(this.f3545D, layoutParams);
        this.f3557p.addView(this.f3558q, this.f3560s);
        this.f3557p.setOnCreateContextMenuListener(this);
        this.f3557p.setFocusable(true);
        this.f3558q.setOnClickListener(this.f3547F);
        this.f3557p.setOnFocusChangeListener(this.f3553l);
        setOnClickListener(this.f3547F);
        String[] split = C0284S.m1823a(KonyMain.getAppContext()).m1841b().split("_");
        this.f3543B = new SimpleDateFormat("dd/MM/yyyy", split.length > 1 ? new Locale(split[0], split[1]) : new Locale(split[0]));
        if (KonyMain.f3656d >= 16) {
            this.f3559r.setImportantForAccessibility(2);
            this.f3557p.setImportantForAccessibility(2);
        }
    }

    private void m3953a(CharSequence charSequence) {
        if (hasFocus()) {
            this.f3559r.setText(this.f3556o.m1118a(charSequence.toString()));
        } else {
            this.f3559r.setText(this.f3555n.m1118a(charSequence.toString()));
        }
        m3957i(this.f3546E + charSequence.toString());
    }

    private void m3957i(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            this.f3558q.setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                this.f3558q.setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            this.f3546E = BuildConfig.FLAVOR;
            this.f3558q.setImportantForAccessibility(2);
        } else {
            this.f3558q.setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final void m3958a() {
        if (!this.f3549H) {
            super.m2496z();
            super.m2430a();
            this.f3557p.setLayoutParams(this.f3562u);
            int n = this.f3555n != null ? this.f3555n.m1158n() : 0;
            int n2 = this.f3556o != null ? this.f3556o.m1158n() : 0;
            if (n > n2) {
                this.f3561t.setMargins(n, n, n, n);
            } else {
                this.f3561t.setMargins(n2, n2, n2, n2);
            }
            this.f3545D.setImageDrawable(dB.m1112c(this.f3550I));
            m3971b(false);
            this.f3549H = true;
        }
    }

    public final void m3959a(float f) {
        this.f3562u.width = 0;
        this.f3562u.weight = f;
        this.f3557p.setLayoutParams(this.f3562u);
    }

    public final void m3960a(int i) {
        this.f3562u.gravity = i;
        this.f3557p.setGravity(i);
        this.f3558q.setGravity(i);
    }

    public final void m3961a(int i, int i2) {
        if (i == -1) {
            this.f3558q.setVisibility(i2 == 0 ? 0 : 8);
        } else {
            this.f3558q.setVisibility(i2);
        }
        this.f3557p.setVisibility(i2);
    }

    public final void m3962a(int i, int i2, int i3) {
        super.m2434a(i, i2, i3);
        this.f3566y = i2;
        this.f3567z = i;
        this.f3565x = i3;
        m3984n();
    }

    public final void m3963a(dB dBVar) {
        this.f3555n = dBVar;
        this.f3564w = dBVar.m1127b(true);
    }

    public final void m3964a(String str) {
        this.f3542A = str;
        if (this.f3551J != null) {
            m3953a(this.f3551J);
        } else {
            m3953a((CharSequence) str);
        }
        this.f3543B.applyPattern(str);
    }

    public final void m3965a(boolean z) {
        this.f3562u.width = -1;
        this.f3560s.width = -1;
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(15);
        this.f3545D.setLayoutParams(layoutParams);
    }

    public final void m3966a(int[] iArr) {
        ez.m1344a(iArr, this.f3557p, this.f3562u);
        this.f3557p.setLayoutParams(this.f3562u);
    }

    public final View m3967b() {
        return this.f3557p;
    }

    public final void m3968b(int i) {
        this.f3561t.addRule(15);
        switch (i) {
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_CENTER /*17*/:
            case LuaWidget.KONY_WIDGET_POS_TOP_CENTER /*49*/:
            case LuaWidget.KONY_WIDGET_POS_BOTTOM_CENTER /*81*/:
                this.f3561t.addRule(14);
                break;
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_LEFT /*19*/:
            case LuaWidget.KONY_WIDGET_POS_TOP_LEFT /*51*/:
            case LuaWidget.KONY_WIDGET_POS_BOTTOM_LEFT /*83*/:
                this.f3561t.addRule(5);
                break;
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_RIGHT /*21*/:
            case LuaWidget.KONY_WIDGET_POS_TOP_RIGHT /*53*/:
            case LuaWidget.KONY_WIDGET_POS_BOTTOM_RIGHT /*85*/:
                ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(1, 111);
                layoutParams.addRule(15);
                this.f3545D.setLayoutParams(layoutParams);
                break;
        }
        this.f3559r.setLayoutParams(this.f3561t);
        this.f3558q.setGravity(21);
    }

    public final void m3969b(dB dBVar) {
        this.f3556o = dBVar;
        this.f3563v = dBVar.m1127b(true);
    }

    public final void m3970b(String str) {
        this.f3550I = str;
        if (this.f3545D != null && this.f3550I != null) {
            this.f3545D.setImageDrawable(dB.m1112c(this.f3550I));
        }
    }

    public final void m3971b(boolean z) {
        if (!z) {
            this.f3555n.m1129b(this.f3559r);
            this.f3558q.setBackgroundDrawable(this.f3564w);
        } else if (this.f3556o != null) {
            this.f3556o.m1129b(this.f3559r);
            this.f3558q.setBackgroundDrawable(this.f3563v);
        }
    }

    public final void m3972b(int[] iArr) {
        this.f3559r.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m3973c() {
        super.m2453c();
        if (this.f3552k != null && this.f3552k.isShowing()) {
            this.f3552k.dismiss();
        }
        if (this.f3563v != null) {
            this.f3563v.setCallback(null);
        }
        dB.m1104a(this.f3563v);
        if (this.f3564w != null) {
            this.f3564w.setCallback(null);
        }
        dB.m1104a(this.f3564w);
    }

    public final void m3974c(String str) {
        this.f3551J = str;
        if (this.f3551J != null) {
            m3953a(this.f3551J);
        } else {
            m3953a(this.f3543B.toPattern());
        }
    }

    public final void m3975c(boolean z) {
        this.f3557p.setClickable(z);
        this.f3558q.setClickable(z);
        this.f3557p.setFocusable(z);
        this.f3558q.setFocusable(z);
        setClickable(z);
        this.f3545D.setClickable(z);
        if (z) {
            this.f3558q.setOnClickListener(this.f3547F);
            setOnClickListener(this.f3547F);
            this.f3545D.setOnClickListener(this.f3547F);
            return;
        }
        this.f3558q.setOnClickListener(null);
        setOnClickListener(null);
        this.f3545D.setOnClickListener(null);
    }

    public final int m3976d() {
        return this.f3567z;
    }

    public final void m3977d(String str) {
        if (str != null) {
            this.f3546E = str;
            m3957i(this.f3546E + this.f3559r.getText());
            return;
        }
        m3957i(null);
    }

    public final int m3978e() {
        return this.f3566y;
    }

    public final int m3979f() {
        return this.f3565x;
    }

    public final void m3980g() {
        super.m2471g();
        this.f3565x = -1;
        this.f3566y = -1;
        this.f3567z = -1;
        if (this.f3551J != null) {
            m3953a(this.f3551J);
        } else {
            m3953a(this.f3543B.toPattern());
        }
    }

    public final String m3981h() {
        return this.f3544C;
    }

    public final void m3982i() {
        this.f3557p.setFocusableInTouchMode(true);
        this.f3557p.requestFocus();
        this.f3557p.setFocusableInTouchMode(false);
    }

    protected final void m3983m() {
        Log.d("KonyPopupGridCalendar", "onSelect of KonyPopuGridCalendar*******");
        this.f3567z = super.m2459d();
        this.f3566y = super.m2463e();
        this.f3565x = super.m2467f();
        m3984n();
        this.f3548G.onKey(this.f3552k, 4, new KeyEvent(1, 4));
    }

    public final void m3984n() {
        if (this.f3567z == -1 || this.f3566y == -1 || this.f3565x == -1) {
            m3964a(this.f3542A);
            this.f3544C = BuildConfig.FLAVOR;
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.setLenient(false);
        instance.set(this.f3565x, this.f3566y, this.f3567z, 0, 0, 0);
        this.f3544C = this.f3543B.format(instance.getTime());
        m3953a(this.f3544C);
        this.f3553l.onFocusChange(this.f3559r, false);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.add("Clear").setOnMenuItemClickListener(new cL(this));
    }
}
