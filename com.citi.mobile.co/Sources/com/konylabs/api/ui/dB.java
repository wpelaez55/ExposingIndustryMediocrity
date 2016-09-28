package com.konylabs.api.ui;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Hashtable;
import ny0k.az;
import ny0k.cA;
import ny0k.cG;
import ny0k.cM;
import ny0k.cy;

public final class dB {
    private static boolean f1083G;
    private static HashMap f1084H;
    private static dC f1085I;
    private static HashMap f1086J;
    private static Hashtable f1087K;
    public static final Typeface f1088a;
    private static float f1089b;
    private static Typeface f1090c;
    private static int f1091d;
    private static int f1092e;
    private static boolean f1093f;
    private static DisplayMetrics f1094x;
    private int[] f1095A;
    private float[] f1096B;
    private String f1097C;
    private int f1098D;
    private int[] f1099E;
    private float[] f1100F;
    private int f1101g;
    private int f1102h;
    private int f1103i;
    private String f1104j;
    private Typeface f1105k;
    private int f1106l;
    private float f1107m;
    private int f1108n;
    private int f1109o;
    private int f1110p;
    private int f1111q;
    private String f1112r;
    private int f1113s;
    private boolean f1114t;
    private boolean f1115u;
    private String f1116v;
    private boolean f1117w;
    private dD f1118y;
    private int f1119z;

    static {
        f1088a = Typeface.DEFAULT;
        f1089b = 14.0f;
        f1090c = f1088a;
        f1091d = ViewCompat.MEASURED_STATE_MASK;
        f1092e = 0;
        f1093f = false;
        f1094x = null;
        f1083G = false;
        int memoryClass = ((ActivityManager) KonyMain.getActContext().getSystemService("activity")).getMemoryClass();
        if (KonyMain.f3657e) {
            Log.d("KonySkin", "Application Memory : " + memoryClass + "MB");
        }
        if (memoryClass >= 64) {
            float m = cG.m2122m();
            if (m > 0.0f) {
                if (m > 20.0f) {
                    m = 20.0f;
                }
                m = (m * ((float) memoryClass)) / 100.0f;
                if (KonyMain.f3657e) {
                    Log.d("KonySkin", "Limiting bitmap cache size to : " + m + "MB");
                }
                f1085I = new dC((int) (m * 1048576.0f));
            }
        }
        f1084H = new HashMap();
        f1086J = new HashMap();
        f1087K = new Hashtable();
        f1094x = KonyMain.getActContext().getResources().getDisplayMetrics();
        f1089b = cG.m2110a().floatValue();
        f1090c = cG.m2111b();
        int c = cG.m2112c();
        if (c == -1) {
            f1093f = true;
        } else {
            f1092e = c;
        }
        f1083G = cG.m2113d();
    }

    public dB() {
        this.f1115u = false;
        this.f1118y = null;
        this.f1101g = 0;
        this.f1102h = 0;
        this.f1103i = 0;
        this.f1104j = null;
        this.f1105k = f1090c;
        this.f1106l = f1092e;
        this.f1107m = f1089b;
        this.f1108n = f1091d;
        this.f1109o = 0;
        this.f1110p = 0;
        this.f1111q = 0;
        this.f1112r = "none";
        this.f1113s = ViewCompat.MEASURED_STATE_MASK;
        this.f1114t = f1093f;
    }

    public dB(dB dBVar) {
        this.f1115u = false;
        this.f1118y = null;
        this.f1101g = dBVar.f1101g;
        this.f1102h = dBVar.f1102h;
        this.f1103i = dBVar.f1103i;
        this.f1104j = dBVar.f1104j;
        this.f1105k = dBVar.f1105k;
        this.f1106l = dBVar.f1106l;
        this.f1107m = dBVar.f1107m;
        this.f1108n = dBVar.f1108n;
        this.f1109o = dBVar.f1109o;
        this.f1110p = dBVar.f1110p;
        this.f1111q = dBVar.f1111q;
        this.f1112r = "none";
        this.f1113s = dBVar.f1113s;
        this.f1114t = dBVar.f1114t;
        this.f1115u = dBVar.f1115u;
        this.f1116v = dBVar.f1116v;
        this.f1118y = dBVar.f1118y;
    }

    public static final Drawable m1102a(dB dBVar) {
        Drawable a = dBVar.m1117a();
        if (dBVar.m1126b() == null || a == null) {
            return a;
        }
        Drawable layerDrawable = new LayerDrawable(new Drawable[]{r3, a});
        layerDrawable.setLayerInset(1, dBVar.f1110p, dBVar.f1110p, dBVar.f1110p, dBVar.f1110p);
        return layerDrawable;
    }

    public static cy m1103a(String str, boolean z) {
        if (z && f1085I != null) {
            Bitmap bitmap = (Bitmap) f1085I.get(str);
            if (bitmap != null) {
                return new cy(bitmap);
            }
        }
        WeakReference weakReference = (WeakReference) f1084H.get(str);
        if (weakReference != null) {
            ConstantState constantState = (ConstantState) weakReference.get();
            if (constantState != null) {
                if (KonyMain.f3657e) {
                    Log.d("KonySkin", "Drawable cache found for the key " + str);
                }
                return (cy) constantState.newDrawable();
            }
            if (KonyMain.f3657e) {
                Log.d("KonySkin", "Drawable cache cleared for the key " + str);
            }
            f1084H.remove(str);
        }
        return null;
    }

    public static void m1104a(Drawable drawable) {
        if (drawable != null) {
        }
    }

    public static void m1105a(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTypeface(f1090c, f1092e);
            textView.setTextSize(f1089b);
            textView.setTextColor(f1091d);
            textView.setTextKeepState(textView.getText().toString());
        }
    }

    protected static void m1106a(TextView textView) {
        if (f1083G) {
            textView.getPaint().setAntiAlias(true);
            textView.setPaintFlags(textView.getPaintFlags() | TransportMediator.FLAG_KEY_MEDIA_NEXT);
        }
    }

    public static void m1107a(TextView textView, boolean z, boolean z2) {
        textView.setTypeface(f1090c, f1092e);
        textView.setTextSize(f1089b);
        if (z2) {
            textView.setTextKeepState(textView.getText().toString());
        }
    }

    private void m1108a(String str, int i) {
        if (str == "plain") {
            this.f1111q = 0;
        } else if (str == "cr") {
            this.f1115u = true;
            this.f1111q = 0;
        } else if (str == "rc") {
            this.f1111q = m1116r(6);
        } else if (str == "custom" || str == "none") {
            this.f1111q = i;
        }
    }

    public static Drawable m1109b(String str) {
        return m1110b(str, true);
    }

    public static Drawable m1110b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        Drawable a = m1103a(str, z);
        if (a != null) {
            return a;
        }
        Object obj = f1086J.get(str);
        if (obj != null) {
            if (KonyMain.f3657e) {
                Log.d("KonySkin", "Synching for " + str);
            }
            synchronized (obj) {
                a = m1103a(str, z);
                if (KonyMain.f3657e && a != null) {
                    Log.d("KonySkin", "cache found for the url " + str);
                }
            }
        }
        if (a != null) {
            return a;
        }
        obj = new Object();
        synchronized (obj) {
            f1086J.put(str, obj);
            az azVar = new az(str, true);
            if (KonyMain.f3657e) {
                Log.d("KonySkin", "Invoking service for url " + str);
            }
            azVar.m3565a(true);
            azVar.m3561a(1);
            azVar.m3574k();
            if (azVar.m3567d()) {
                InputStream g = azVar.m3570g();
                InputStream bufferedInputStream = new BufferedInputStream(g);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                    a = decodeStream != null ? new cy(decodeStream) : a;
                } catch (OutOfMemoryError e) {
                    if (KonyMain.f3657e) {
                        Log.d("KonySkin", BuildConfig.FLAVOR + e);
                    }
                    System.gc();
                }
                try {
                    bufferedInputStream.close();
                    g.close();
                } catch (Exception e2) {
                    if (KonyMain.f3658f) {
                        Log.d("KonySkin", BuildConfig.FLAVOR + e2.getMessage());
                    }
                }
            }
            azVar.m3572i();
            if (!(a == null || a == null)) {
                if (z && f1085I != null) {
                    if (KonyMain.f3657e) {
                        Log.d("KonySkin", "Putting bitmap into cache for url " + str);
                    }
                    f1085I.put(str, a.getBitmap());
                    if (KonyMain.f3657e) {
                        Log.d("KonySkin", "Bitmap current cache size: " + (((double) f1085I.size()) / 1048576.0d) + " MB, " + " Max cache size: " + (((double) f1085I.maxSize()) / 1048576.0d) + " MB");
                    }
                }
                ConstantState a2 = a.m2214a();
                if (a2 != null) {
                    WeakReference weakReference = (WeakReference) f1084H.get(str);
                    if (weakReference == null || weakReference.get() != a2) {
                        if (KonyMain.f3657e) {
                            Log.d("KonySkin", "Putting constant state into cache for url " + str);
                        }
                        f1084H.put(str, new WeakReference(a2));
                    }
                }
            }
            f1086J.remove(str);
        }
        return a;
    }

    public static void m1111b(TextView textView, boolean z) {
        textView.setTypeface(f1090c, f1092e);
        textView.setTextSize(f1089b);
        if (z) {
            textView.setTextKeepState(m1115f(textView.getText().toString()));
        } else {
            textView.setTextKeepState(textView.getText().toString());
        }
    }

    public static Drawable m1112c(String str) {
        if (str == null || str.equals(BuildConfig.FLAVOR)) {
            return null;
        }
        KonyMain.getActContext();
        Drawable a = KonyMain.m4083a(str);
        if (a != null) {
            return a;
        }
        if (KonyMain.f3657e) {
            Log.d("KonySkin", "Image not found in resource/drawable-*");
        }
        a = m1103a(str, false);
        if (a != null) {
            return a;
        }
        ConstantState constantState;
        if (KonyMain.f3655c.m2134b() != 2) {
            a = KonyMain.getActContext().m4157c(str);
            if (a == null) {
                return a;
            }
            constantState = a.getConstantState();
            if (constantState == null) {
                return a;
            }
            f1084H.put(str, new WeakReference(constantState));
            return a;
        }
        Bitmap previewBitmap = KonyMain.getActContext().getPreviewBitmap(str);
        if (previewBitmap == null) {
            return a;
        }
        a = new cy(previewBitmap);
        constantState = a.m2214a();
        if (constantState == null) {
            return a;
        }
        if (KonyMain.f3657e) {
            Log.d("KonySkin", "Putting constant state into cache for url " + str);
        }
        f1084H.put(str, new WeakReference(constantState));
        return a;
    }

    public static void m1113e() {
        f1087K.clear();
    }

    private void m1114e(TextView textView) {
        String obj = textView.getText().toString();
        if (this.f1114t) {
            textView.setTextKeepState(m1115f(obj));
        } else {
            textView.setTextKeepState(obj);
        }
    }

    public static CharSequence m1115f(String str) {
        CharSequence spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, str.length(), 0);
        return spannableString;
    }

    public static int m1116r(int i) {
        return (int) (0.5f + TypedValue.applyDimension(1, (float) i, f1094x));
    }

    public final Drawable m1117a() {
        if (this.f1117w) {
            return null;
        }
        if (this.f1104j != null) {
            Drawable c = m1112c(this.f1104j);
            if (c == null) {
                return c;
            }
            c.mutate();
            return c;
        }
        Drawable cAVar = this.f1097C == "two" ? this.f1116v == "vg" ? new cA(180, new int[]{this.f1102h, this.f1103i}, null) : this.f1116v == "vs" ? new cA(this.f1102h, this.f1103i) : null : (this.f1097C == "ms_gradient" && this.f1116v == "linear") ? new cA(this.f1119z, this.f1095A, this.f1096B) : new cA(this.f1101g);
        cAVar.m2094a((float) this.f1111q);
        return cAVar;
    }

    public final CharSequence m1118a(String str) {
        return this.f1114t ? m1115f(str) : str;
    }

    public final void m1119a(float f) {
        this.f1107m = (f1089b * f) / 100.0f;
    }

    public final void m1120a(int i) {
        m1108a(this.f1112r, m1116r(i));
    }

    public final void m1121a(int i, int i2, int i3, int i4) {
        this.f1118y = new dD(this, i, i2, i4, i3);
    }

    public final void m1122a(Typeface typeface) {
        this.f1105k = typeface;
    }

    public final void m1123a(TextView textView, boolean z) {
        textView.setTypeface(this.f1105k, this.f1106l);
        textView.setTextSize(this.f1107m);
        if (z) {
            m1114e(textView);
        }
        m1136d(textView);
        m1106a(textView);
    }

    public final void m1124a(String str, int i, int[] iArr, float[] fArr) {
        this.f1119z = i;
        this.f1095A = iArr;
        this.f1096B = fArr;
    }

    public final void m1125a(boolean z) {
        this.f1114t = true;
    }

    public final Drawable m1126b() {
        Drawable drawable = null;
        if (!this.f1117w && this.f1110p > 0) {
            drawable = new cA(0);
            drawable.m2094a((float) this.f1111q);
            if (this.f1115u) {
                drawable.m2093a();
            }
            if (this.f1099E == null) {
                drawable.m2095a(this.f1110p, this.f1109o);
            } else {
                drawable.m2096a(this.f1110p, this.f1098D, this.f1099E, this.f1100F);
            }
        }
        return drawable;
    }

    public final Drawable m1127b(boolean z) {
        if (this.f1117w) {
            return null;
        }
        Drawable p = m1162p();
        if (this.f1104j != null) {
            return p;
        }
        ((cA) p).m2098a(true);
        return p;
    }

    public final void m1128b(int i) {
        this.f1101g = i;
    }

    public final void m1129b(TextView textView) {
        textView.setTypeface(this.f1105k, this.f1106l);
        textView.setTextSize(this.f1107m);
        textView.setTextColor(this.f1108n);
        m1114e(textView);
        m1106a(textView);
    }

    public final void m1130b(String str, int i, int[] iArr, float[] fArr) {
        this.f1098D = i;
        this.f1099E = iArr;
        this.f1100F = fArr;
    }

    public final void m1131c(int i) {
        this.f1109o = i;
    }

    public final void m1132c(TextView textView) {
        textView.setTypeface(this.f1105k, this.f1106l);
        textView.setTextSize(this.f1107m);
        m1114e(textView);
        m1136d(textView);
        m1106a(textView);
    }

    public final boolean m1133c() {
        return this.f1104j != null && (this.f1104j.startsWith("http://") || this.f1104j.startsWith("https://"));
    }

    public final int m1134d() {
        return this.f1111q;
    }

    public final void m1135d(int i) {
        this.f1102h = i;
    }

    public final void m1136d(TextView textView) {
        if (this.f1118y != null) {
            this.f1118y.m1168a(textView);
        }
    }

    public final void m1137d(String str) {
        this.f1104j = str;
    }

    public final void m1138e(int i) {
        this.f1103i = i;
    }

    public final void m1139e(String str) {
        this.f1112r = str.intern();
        m1108a(this.f1112r, this.f1111q);
    }

    public final String m1140f() {
        return this.f1104j;
    }

    public final void m1141f(int i) {
        this.f1106l = i;
    }

    public final int m1142g() {
        return this.f1101g;
    }

    public final void m1143g(int i) {
        this.f1108n = i;
    }

    public final void m1144g(String str) {
        this.f1116v = str;
    }

    public final int m1145h() {
        return this.f1109o;
    }

    public final void m1146h(int i) {
        this.f1110p = m1116r(i);
    }

    public final void m1147h(String str) {
        this.f1097C = str;
    }

    public final int m1148i() {
        return this.f1102h;
    }

    public final void m1149i(int i) {
        m1116r(i);
    }

    public final Typeface m1150j() {
        return this.f1105k;
    }

    public final void m1151j(int i) {
        m1116r(i);
    }

    public final int m1152k() {
        return this.f1106l;
    }

    public final void m1153k(int i) {
        m1116r(i);
    }

    public final float m1154l() {
        return this.f1107m;
    }

    public final void m1155l(int i) {
        m1116r(i);
    }

    public final int m1156m() {
        return this.f1108n;
    }

    public final void m1157m(int i) {
        m1116r(i);
    }

    public final int m1158n() {
        return this.f1110p;
    }

    public final void m1159n(int i) {
        m1116r(i);
    }

    public final void m1160o(int i) {
        m1116r(i);
    }

    public final boolean m1161o() {
        return this.f1114t;
    }

    public final Drawable m1162p() {
        if (this.f1117w) {
            return null;
        }
        if (this.f1104j != null) {
            Drawable c = m1112c(this.f1104j);
            return c != null ? c.mutate() : c;
        } else {
            Drawable cAVar = this.f1097C == "two" ? this.f1116v == "vg" ? new cA(180, new int[]{this.f1102h, this.f1103i}, null) : this.f1116v == "vs" ? new cA(this.f1102h, this.f1103i) : null : (this.f1097C == "ms_gradient" && this.f1116v == "linear") ? new cA(this.f1119z, this.f1095A, this.f1096B) : new cA(this.f1101g);
            cAVar.m2094a((float) this.f1111q);
            if (this.f1115u) {
                cAVar.m2093a();
            }
            if (this.f1110p > 0) {
                if (this.f1099E == null) {
                    cAVar.m2095a(this.f1110p, this.f1109o);
                } else {
                    cAVar.m2096a(this.f1110p, this.f1098D, this.f1099E, this.f1100F);
                }
            }
            return cAVar;
        }
    }

    public final void m1163p(int i) {
        m1116r(i);
    }

    public final void m1164q(int i) {
        this.f1113s = ((i * MotionEventCompat.ACTION_MASK) / 100) << 24;
    }

    public final boolean m1165q() {
        return this.f1117w;
    }

    public final void m1166r() {
        this.f1117w = true;
    }

    public final cM m1167s() {
        return (this.f1097C == "ms_gradient" && this.f1116v == "linear") ? cM.m2137a(this.f1119z, this.f1095A, this.f1096B) : this.f1097C == "one" ? cM.m2135a(this.f1101g) : null;
    }
}
