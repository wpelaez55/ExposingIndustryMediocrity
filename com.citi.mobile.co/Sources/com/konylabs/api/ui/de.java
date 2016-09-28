package com.konylabs.api.ui;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import ny0k.cC;

public final class de extends SeekBar {
    private boolean f1184a;
    private dB f1185b;
    private dB f1186c;
    private Drawable f1187d;
    private Drawable f1188e;
    private Drawable f1189f;
    private StateListDrawable f1190g;
    private LinearLayout f1191h;
    private RelativeLayout f1192i;
    private LayoutParams f1193j;
    private TextView f1194k;
    private TextView f1195l;
    private dB f1196m;
    private dB f1197n;
    private LinearLayout.LayoutParams f1198o;
    private LinearLayout.LayoutParams f1199p;
    private int f1200q;
    private int f1201r;
    private int f1202s;
    private int f1203t;
    private Rect f1204u;
    private boolean f1205v;
    private int f1206w;
    private int f1207x;
    private boolean f1208y;

    public de(KonyMain konyMain) {
        super(konyMain);
        this.f1184a = false;
        this.f1185b = null;
        this.f1186c = null;
        this.f1187d = null;
        this.f1188e = null;
        this.f1189f = null;
        this.f1191h = null;
        this.f1192i = null;
        this.f1194k = null;
        this.f1195l = null;
        this.f1196m = null;
        this.f1197n = null;
        this.f1201r = 0;
        this.f1202s = 1;
        this.f1203t = 0;
        this.f1204u = new Rect(0, 0, 0, 0);
        this.f1205v = false;
        this.f1206w = dB.m1116r(20);
        this.f1207x = -1;
        this.f1208y = false;
        this.f1191h = new LinearLayout(konyMain);
        this.f1192i = new RelativeLayout(konyMain);
        this.f1191h.setOrientation(1);
        this.f1199p = new LinearLayout.LayoutParams(-1, -2);
        this.f1198o = new LinearLayout.LayoutParams(-1, -2);
        this.f1193j = new LayoutParams(-1, -2);
        this.f1195l = new TextView(getContext());
        this.f1194k = new TextView(getContext());
        this.f1195l.setText(BuildConfig.FLAVOR);
        this.f1194k.setText(BuildConfig.FLAVOR);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(9);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        this.f1195l.setLayoutParams(layoutParams);
        this.f1194k.setLayoutParams(layoutParams2);
        this.f1192i.addView(this.f1195l);
        this.f1192i.addView(this.f1194k);
    }

    public final int m1236a() {
        return this.f1202s;
    }

    public final void m1237a(float f) {
        this.f1199p.width = 0;
        this.f1199p.weight = f;
    }

    public final void m1238a(int i) {
        setVisibility(i);
    }

    public final void m1239a(dB dBVar) {
        this.f1186c = dBVar;
        this.f1184a = true;
    }

    public final void m1240a(String str) {
        if (!str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            this.f1188e = dB.m1112c(str);
        }
    }

    public final void m1241a(boolean z) {
        setFocusable(z);
        setEnabled(z);
    }

    public final void m1242a(int[] iArr) {
        ez.m1344a(iArr, this.f1191h, this.f1199p);
    }

    public final int m1243b() {
        return this.f1201r;
    }

    public final void m1244b(int i) {
        this.f1202s = i;
        setKeyProgressIncrement(this.f1202s);
    }

    public final void m1245b(dB dBVar) {
        this.f1185b = dBVar;
        this.f1184a = true;
    }

    public final void m1246b(String str) {
        if (!str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            this.f1189f = dB.m1112c(str);
        }
    }

    public final void m1247b(int[] iArr) {
        this.f1204u.left = iArr[0];
        this.f1204u.top = iArr[1];
        this.f1204u.right = iArr[2];
        this.f1204u.bottom = iArr[3];
    }

    public final int m1248c() {
        return this.f1200q;
    }

    public final void m1249c(int i) {
        this.f1200q = i;
        setMax(i);
    }

    public final void m1250c(dB dBVar) {
        this.f1196m = dBVar;
    }

    public final void m1251c(String str) {
        this.f1194k.setText(str);
    }

    public final int m1252d() {
        int progress = getProgress();
        if (this.f1202s > 1) {
            progress = (progress / this.f1202s) * this.f1202s;
        }
        return progress + this.f1201r;
    }

    public final void m1253d(int i) {
        this.f1201r = i;
    }

    public final void m1254d(dB dBVar) {
        this.f1197n = dBVar;
    }

    public final void m1255d(String str) {
        this.f1195l.setText(str);
    }

    public final void m1256e() {
        int i = 0;
        int i2;
        if (this.f1202s > 1) {
            if (this.f1208y) {
                i2 = this.f1203t - this.f1201r;
                if (i2 >= 0) {
                    i = i2 > this.f1200q ? this.f1200q : i2;
                }
            } else {
                i = this.f1200q / 2;
            }
            if (i > 0) {
                i = Math.round(((float) i) / ((float) this.f1202s)) * this.f1202s;
            }
            setProgress(i);
        } else if (this.f1203t > 0) {
            i2 = this.f1203t - this.f1201r;
            if (i2 <= this.f1200q && i2 >= 0) {
                setProgress(i2);
            } else if (i2 > this.f1200q) {
                setProgress(getMax());
            } else {
                setProgress(0);
            }
        } else if (this.f1208y) {
            setProgress(this.f1203t);
        } else {
            setProgress(this.f1200q / 2);
        }
    }

    public final void m1257e(int i) {
        this.f1203t = i;
        this.f1208y = true;
    }

    public final void m1258e(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(2);
        } else {
            setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final View m1259f() {
        return this.f1191h;
    }

    public final void m1260f(int i) {
        this.f1206w = dB.m1116r(i);
    }

    public final void m1261g() {
        Drawable drawable = null;
        if (!this.f1205v) {
            int abs;
            Rect bounds = this.f1190g != null ? this.f1190g.getBounds() : null;
            this.f1190g = new StateListDrawable();
            if (this.f1189f != null) {
                this.f1190g.addState(PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET, this.f1189f);
                this.f1190g.addState(SELECTED_WINDOW_FOCUSED_STATE_SET, this.f1189f);
                this.f1190g.addState(FOCUSED_WINDOW_FOCUSED_STATE_SET, this.f1189f);
            }
            if (this.f1188e != null) {
                this.f1190g.addState(EMPTY_STATE_SET, this.f1188e);
            }
            if (!(this.f1188e == null && this.f1189f == null)) {
                if (bounds != null) {
                    this.f1190g.setBounds(bounds);
                }
                setThumb(this.f1190g);
                if (this.f1207x >= 0) {
                    setThumbOffset(this.f1207x);
                }
                this.f1190g.setState(EMPTY_STATE_SET);
            }
            if (this.f1207x < 0) {
                int i = this.f1204u.left;
                int i2 = this.f1204u.right;
                int i3 = this.f1204u.top;
                int i4 = this.f1204u.bottom;
                abs = this.f1188e != null ? Math.abs((this.f1188e.getIntrinsicWidth() / 2) - getThumbOffset()) : getThumbOffset();
                setPadding(i + abs, i3, abs + i2, i4);
            }
            if (this.f1187d == null || this.f1184a) {
                Drawable p = this.f1185b != null ? this.f1185b.m1162p() : null;
                if (this.f1186c != null) {
                    drawable = this.f1186c.m1162p();
                }
                if (!(p == null && drawable == null)) {
                    this.f1187d = new cC(getProgressDrawable(), p, drawable, this.f1206w);
                }
                if (this.f1187d != null) {
                    setProgressDrawable(this.f1187d);
                }
                this.f1184a = false;
            } else {
                setProgressDrawable(this.f1187d);
            }
            if (this.f1195l.getText().equals(BuildConfig.FLAVOR)) {
                this.f1195l.setVisibility(8);
            } else {
                if (this.f1196m != null) {
                    this.f1196m.m1129b(this.f1195l);
                }
                this.f1195l.setVisibility(0);
            }
            if (this.f1194k.getText().equals(BuildConfig.FLAVOR)) {
                this.f1194k.setVisibility(8);
            } else {
                if (this.f1197n != null) {
                    this.f1197n.m1129b(this.f1194k);
                }
                this.f1194k.setVisibility(0);
            }
            if (this.f1191h.indexOfChild(this) == -1) {
                this.f1192i.setLayoutParams(this.f1193j);
                this.f1191h.addView(this, this.f1198o);
                this.f1191h.addView(this.f1192i);
                m1256e();
            }
            abs = getProgress();
            if (abs == getMax()) {
                setProgress(abs - 1);
                setProgress(abs + 1);
            } else {
                setProgress(getProgress() + 1);
                setProgress(getProgress() - 1);
            }
            this.f1191h.setLayoutParams(this.f1199p);
            this.f1205v = true;
        }
    }

    public final void m1262g(int i) {
        this.f1199p.gravity = i;
        this.f1191h.setGravity(i);
    }

    public final void m1263h() {
        if (this.f1187d != null) {
            this.f1187d.setCallback(null);
        }
        if (this.f1188e != null) {
            this.f1188e.setCallback(null);
        }
        if (this.f1189f != null) {
            this.f1189f.setCallback(null);
        }
    }

    public final void m1264h(int i) {
        this.f1199p.height = i;
    }

    public final void m1265i() {
        this.f1205v = false;
        m1261g();
    }

    public final void m1266i(int i) {
        this.f1199p.width = i;
    }

    public final void m1267j(int i) {
        this.f1207x = i;
    }
}
