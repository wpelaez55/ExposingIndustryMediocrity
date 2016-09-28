package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v4.view.ViewCompat;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ny0k.cA;

public final class cP extends TextView {
    SpannableStringBuilder f940a;
    public boolean f941b;
    private dB f942c;
    private dB f943d;
    private Rect f944e;
    private LinearLayout f945f;
    private LayoutParams f946g;
    private LayoutParams f947h;
    private cU f948i;
    private Drawable f949j;
    private Rect f950k;
    private List f951l;
    private ArrayList f952m;
    private boolean f953n;
    private boolean f954o;
    private String f955p;
    private int f956q;
    private boolean f957r;

    public cP(Context context) {
        super(context);
        this.f942c = null;
        this.f943d = null;
        this.f944e = null;
        this.f950k = null;
        this.f953n = false;
        this.f955p = BuildConfig.FLAVOR;
        this.f956q = -1;
        this.f957r = true;
        this.f945f = new LinearLayout(context);
        this.f946g = new LayoutParams(-2, -2);
        this.f947h = new LayoutParams(-2, -2);
        this.f945f.addView(this, this.f947h);
        setDrawingCacheEnabled(false);
        setLinksClickable(true);
    }

    private SpannableStringBuilder m996b(String str) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) Html.fromHtml(str, new cR(this), new cS(this));
        ImageSpan[] imageSpanArr = (ImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class);
        if (imageSpanArr != null && imageSpanArr.length > 0) {
            this.f951l = new ArrayList(Arrays.asList(imageSpanArr));
        }
        int length = spannableStringBuilder.length();
        int i = 0;
        while (i < spannableStringBuilder.length()) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i, length, URLSpan.class);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(i, nextSpanTransition, URLSpan.class)) {
                int spanStart;
                int spanStart2 = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                spannableStringBuilder.setSpan(new cV(this, uRLSpan.getURL()), spanStart2, spanEnd, 33);
                spannableStringBuilder.removeSpan(uRLSpan);
                for (Object obj : (ForegroundColorSpan[]) spannableStringBuilder.getSpans(spanStart2, spanEnd, ForegroundColorSpan.class)) {
                    int spanStart3 = spannableStringBuilder.getSpanStart(obj);
                    int spanEnd2 = spannableStringBuilder.getSpanEnd(obj);
                    spannableStringBuilder.removeSpan(obj);
                    spannableStringBuilder.setSpan(obj, spanStart3, spanEnd2, 33);
                }
                for (Object obj2 : (UnderlineSpan[]) spannableStringBuilder.getSpans(spanStart2, spanEnd, UnderlineSpan.class)) {
                    spanStart = spannableStringBuilder.getSpanStart(obj2);
                    int spanEnd3 = spannableStringBuilder.getSpanEnd(obj2);
                    spannableStringBuilder.removeSpan(obj2);
                    spannableStringBuilder.setSpan(obj2, spanStart, spanEnd3, 33);
                }
            }
            i = nextSpanTransition;
        }
        return spannableStringBuilder;
    }

    private void m999c(String str) {
        if (KonyMain.f3656d > 3) {
            CharSequence charSequence;
            if (this.f956q == 0) {
                setFocusable(false);
                charSequence = null;
            } else if (this.f956q == 1) {
                setFocusable(true);
            }
            if (charSequence != null) {
                setContentDescription(charSequence);
                if (KonyMain.f3656d >= 16) {
                    setImportantForAccessibility(1);
                }
            } else if (KonyMain.f3656d >= 16) {
                this.f955p = BuildConfig.FLAVOR;
                setImportantForAccessibility(2);
            } else {
                setContentDescription(BuildConfig.FLAVOR);
            }
        }
    }

    public final void m1000a() {
        int m;
        Typeface typeface;
        if (!(this.f944e == null || this.f949j == null || !(this.f949j instanceof cA))) {
            ((cA) this.f949j).m2097a(this.f944e);
        }
        setBackgroundDrawable(this.f949j);
        if (this.f944e != null && this.f949j == null) {
            setPadding(this.f944e.left, this.f944e.top, this.f944e.right, this.f944e.bottom);
        }
        Typeface typeface2 = dB.f1088a;
        float f = 14.0f;
        int i = ViewCompat.MEASURED_STATE_MASK;
        if (this.f942c != null) {
            Typeface j = this.f942c.m1150j();
            int k = this.f942c.m1152k();
            float l = this.f942c.m1154l();
            m = this.f942c.m1156m();
            if (this.f942c.m1161o()) {
                CharSequence text = getText();
                if (text instanceof Spannable) {
                    ((Spannable) text).setSpan(new UnderlineSpan(), 0, text.length(), 0);
                } else {
                    setTextKeepState(dB.m1115f(text.toString()));
                }
            }
            this.f942c.m1136d((TextView) this);
            dB dBVar = this.f942c;
            dB.m1106a((TextView) this);
            i = m;
            f = l;
            m = k;
            typeface = j;
        } else {
            typeface = typeface2;
            m = 0;
        }
        setTypeface(typeface, m);
        setTextSize(f);
        setTextColor(i);
    }

    public final void m1001a(float f) {
        this.f946g.width = 0;
        this.f946g.weight = f;
    }

    public final void m1002a(int i) {
        this.f946g.gravity = i;
        this.f945f.setGravity(i);
        setGravity(i);
    }

    public final void m1003a(int i, int i2) {
        if (i == -1) {
            setVisibility(i2 == 0 ? 0 : 8);
        } else {
            setVisibility(i2);
        }
        this.f945f.setVisibility(i2);
    }

    public final void m1004a(cU cUVar) {
        this.f948i = cUVar;
    }

    public final void m1005a(dB dBVar) {
        this.f942c = dBVar;
        if (dBVar != null) {
            this.f949j = dBVar.m1162p();
        } else {
            this.f949j = null;
        }
        if (this.f949j != null && (this.f949j instanceof cA)) {
            ((cA) this.f949j).m2098a(true);
        }
    }

    public final void m1006a(String str) {
        this.f941b = false;
        this.f940a = m996b("<rtv>" + str + "</rtv>");
        super.setText(this.f940a, BufferType.SPANNABLE);
        if (this.f941b) {
            setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            setMovementMethod(null);
            setClickable(false);
        }
        if (this.f957r) {
            m999c(this.f955p);
        } else {
            m999c(getText() + this.f955p);
        }
    }

    public final void m1007a(String str, int i, boolean z) {
        this.f955p = str;
        this.f956q = i;
        this.f957r = z;
        m999c(this.f955p);
    }

    public final void m1008a(String str, Drawable drawable) {
        if (drawable == null) {
            if (KonyMain.f3659g) {
                Log.e("KonyRichText", "Image for " + str + " is null");
            }
        } else if (this.f951l != null) {
            List list = this.f951l;
            for (int i = 0; i < list.size(); i++) {
                ImageSpan imageSpan = (ImageSpan) list.get(i);
                if (str.equals(imageSpan.getSource())) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyRichText", "Refreshing image: " + str);
                    }
                    int spanStart = this.f940a.getSpanStart(imageSpan);
                    int spanEnd = this.f940a.getSpanEnd(imageSpan);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        this.f940a.setSpan(new ImageSpan(drawable), spanStart, spanEnd, 33);
                        this.f940a.removeSpan(imageSpan);
                        list.remove(i);
                    }
                }
            }
            if (list.size() == 0) {
                list.clear();
                this.f951l = null;
            }
            setTextKeepState(this.f940a);
        } else if (KonyMain.f3659g) {
            Log.e("KonyRichText", "RichText doesn't contain Image Spans");
        }
    }

    public final void m1009a(boolean z) {
        int i = -1;
        this.f946g.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f947h;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
    }

    public final void m1010a(int[] iArr) {
        this.f950k = new Rect();
        this.f950k.left = iArr[0];
        this.f950k.top = iArr[1];
        this.f950k.right = iArr[2];
        this.f950k.bottom = iArr[3];
        ez.m1344a(iArr, this.f945f, this.f946g);
    }

    public final void m1011b() {
        this.f953n = false;
        m1016c();
    }

    public final void m1012b(int i) {
        setGravity(i);
    }

    public final void m1013b(dB dBVar) {
        this.f943d = dBVar;
    }

    public final void m1014b(boolean z) {
        this.f947h.height = z ? -1 : -2;
        this.f954o = z;
    }

    public final void m1015b(int[] iArr) {
        this.f944e = new Rect();
        this.f944e.left = iArr[0];
        this.f944e.top = iArr[1];
        this.f944e.right = iArr[2];
        this.f944e.bottom = iArr[3];
    }

    public final void m1016c() {
        if (!this.f953n) {
            this.f945f.setLayoutParams(this.f946g);
            m1000a();
            this.f945f.setTag(this);
            this.f953n = true;
        }
    }

    public final void m1017c(int i) {
        if (this.f954o) {
            if (this.f950k != null) {
                i = ez.m1343a(i, new int[]{this.f950k.left, this.f950k.top, this.f950k.right, this.f950k.bottom});
            }
            if (getMeasuredHeight() != i) {
                this.f945f.setMinimumHeight(i);
                this.f945f.requestLayout();
            }
        }
    }

    public final void m1018c(boolean z) {
        setEnabled(z);
    }

    public final View m1019d() {
        return this.f945f;
    }

    public final void m1020e() {
        if (this.f952m != null) {
            int size = this.f952m.size();
            for (int i = 0; i < size; i++) {
                ((AsyncTask) this.f952m.get(i)).cancel(true);
            }
            this.f952m.clear();
            this.f952m = null;
        }
        if (this.f951l != null) {
            this.f951l.clear();
            this.f951l = null;
        }
        setBackgroundDrawable(null);
        this.f949j = null;
    }

    public final void m1021f() {
        m1005a(this.f942c);
        m1000a();
    }

    public final void setHeight(int i) {
        this.f946g.height = i;
        super.setHeight(i);
    }

    public final void setWidth(int i) {
        this.f946g.width = i;
        super.setWidth(i);
    }
}
