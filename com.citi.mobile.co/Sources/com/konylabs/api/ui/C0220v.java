package com.konylabs.api.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

/* renamed from: com.konylabs.api.ui.v */
public final class C0220v {
    int f1630a;
    String f1631b;
    String f1632c;
    C0224z f1633d;
    int f1634e;
    private LinearLayout f1635f;
    private TextView f1636g;
    private ImageView f1637h;
    private int f1638i;
    private Context f1639j;
    private String f1640k;
    private Builder f1641l;
    private String f1642m;
    private AlertDialog f1643n;
    private OnClickListener f1644o;
    private OnClickListener f1645p;
    private OnCancelListener f1646q;
    private String f1647r;

    public C0220v(Context context) {
        this.f1638i = 1;
        this.f1630a = 0;
        this.f1631b = "Yes";
        this.f1632c = "No";
        this.f1642m = "OK";
        this.f1644o = new C0221w(this);
        this.f1645p = new C0222x(this);
        this.f1646q = new C0223y(this);
        this.f1647r = null;
        this.f1634e = 19;
        this.f1639j = context;
        this.f1641l = new Builder(context);
    }

    public final void m1583a() {
        Drawable drawable;
        if (this.f1638i == 1 && this.f1634e == 19) {
            this.f1641l.setTitle(this.f1640k);
            drawable = null;
            if (this.f1647r != null) {
                drawable = dB.m1112c(this.f1647r);
                if (drawable != null) {
                    this.f1641l.setIcon(drawable);
                }
            }
            if (drawable == null) {
                switch (this.f1630a) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                        this.f1641l.setIcon(17301543);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f1641l.setIcon(17301533);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f1641l.setIcon(17301568);
                        break;
                }
            }
        } else if (this.f1640k != null && this.f1640k.length() > 0) {
            this.f1635f = new LinearLayout(this.f1639j);
            this.f1635f.setLayoutParams(new LayoutParams(-1, -2));
            this.f1635f.setPadding(dB.m1116r(10), dB.m1116r(10), dB.m1116r(10), dB.m1116r(10));
            this.f1637h = new ImageView(this.f1639j);
            ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.leftMargin = dB.m1116r(5);
            layoutParams.rightMargin = dB.m1116r(5);
            this.f1637h.setLayoutParams(layoutParams);
            drawable = null;
            if (this.f1647r != null) {
                drawable = dB.m1112c(this.f1647r);
            }
            if (drawable == null) {
                switch (this.f1630a) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                        this.f1637h.setImageResource(17301543);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f1637h.setImageResource(17301533);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f1637h.setImageResource(17301568);
                        break;
                    default:
                        break;
                }
            }
            this.f1637h.setImageDrawable(drawable);
            if (this.f1640k != null) {
                this.f1636g = new TextView(this.f1639j);
                layoutParams = new LayoutParams(-2, -2);
                layoutParams.leftMargin = dB.m1116r(5);
                layoutParams.rightMargin = dB.m1116r(5);
                this.f1636g.setLayoutParams(layoutParams);
                this.f1636g.setText(this.f1640k);
                this.f1636g.setTextSize(23.0f);
                this.f1636g.setTextColor(-1);
                switch (this.f1638i) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f1635f.addView(this.f1637h);
                        this.f1635f.addView(this.f1636g);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f1635f.addView(this.f1636g);
                        this.f1635f.addView(this.f1637h);
                        break;
                    default:
                        this.f1635f.addView(this.f1637h);
                        this.f1635f.addView(this.f1636g);
                        break;
                }
            }
            this.f1635f.addView(this.f1637h);
            this.f1635f.setGravity(this.f1634e);
            this.f1641l.setCustomTitle(this.f1635f);
        }
        this.f1641l.setOnCancelListener(this.f1646q);
        if (this.f1630a == 2) {
            this.f1641l.setPositiveButton(this.f1631b, this.f1644o);
            this.f1641l.setNegativeButton(this.f1632c, this.f1645p);
            this.f1643n = this.f1641l.create();
            this.f1643n.setCanceledOnTouchOutside(false);
            this.f1643n.show();
            return;
        }
        this.f1641l.setNeutralButton(this.f1642m, this.f1644o);
        this.f1643n = this.f1641l.show();
    }

    public final void m1584a(int i) {
        this.f1638i = i;
    }

    public final void m1585a(C0224z c0224z) {
        this.f1633d = c0224z;
    }

    public final void m1586a(String str) {
        this.f1640k = str;
    }

    public final void m1587a(boolean z) {
        if (this.f1643n != null) {
            this.f1643n.dismiss();
            if (!z) {
                this.f1646q.onCancel(this.f1643n);
            }
        }
    }

    public final void m1588b(int i) {
        this.f1630a = i;
    }

    public final void m1589b(String str) {
        View scrollView = new ScrollView(this.f1639j);
        View textView = new TextView(this.f1639j);
        textView.setGravity(this.f1634e);
        textView.setTextColor(-1);
        textView.setPadding(20, 5, 10, 10);
        textView.setTextSize(18.0f);
        textView.setText(str);
        scrollView.addView(textView);
        this.f1641l.setView(scrollView);
    }

    public final void m1590c(String str) {
        this.f1647r = str;
    }

    public final void m1591d(String str) {
        this.f1642m = str;
    }
}
