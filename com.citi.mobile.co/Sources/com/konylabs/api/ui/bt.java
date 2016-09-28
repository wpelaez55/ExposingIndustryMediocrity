package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import ny0k.cy;

public final class bt extends ImageView {
    private static RotateAnimation f844m;
    private static int f845r;
    private static int f846s;
    private static Queue f847t;
    private boolean f848A;
    private boolean f849B;
    private C0173A f850C;
    private LinearLayout f851a;
    private LayoutParams f852b;
    private LayoutParams f853c;
    private Integer f854d;
    private String f855e;
    private int[] f856f;
    private Bitmap f857g;
    private Drawable f858h;
    private Drawable f859i;
    private Drawable f860j;
    private boolean f861k;
    private boolean f862l;
    private Drawable f863n;
    private Drawable f864o;
    private int f865p;
    private bu f866q;
    private boolean f867u;
    private int f868v;
    private int f869w;
    private String f870x;
    private boolean f871y;
    private boolean f872z;

    static {
        Hashtable hashtable = new Hashtable();
        f845r = 0;
        f846s = 0;
        f847t = null;
        if (KonyMain.f3656d <= 3) {
            f847t = new LinkedList();
        }
    }

    public bt(Context context) {
        super(context);
        this.f851a = null;
        this.f852b = null;
        this.f853c = null;
        this.f854d = Integer.valueOf(1);
        this.f855e = null;
        this.f856f = new int[]{0, 0, 0, 0};
        this.f857g = null;
        this.f858h = null;
        this.f859i = null;
        this.f860j = null;
        this.f861k = false;
        this.f862l = false;
        this.f865p = 0;
        this.f867u = false;
        this.f871y = false;
        this.f872z = false;
        this.f848A = false;
        this.f849B = false;
        this.f850C = null;
        this.f851a = new LinearLayout(context);
        this.f852b = new LayoutParams(-2, -2);
        this.f853c = new LayoutParams(-2, -2);
        this.f863n = dB.m1112c("ic_image_loading_icon.png");
        this.f864o = dB.m1112c("ic_image_error_icon.png");
        setImageDrawable(this.f863n);
        if (f844m == null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            f844m = rotateAnimation;
            rotateAnimation.setRepeatCount(-1);
            f844m.setDuration(1000);
        }
        setAdjustViewBounds(true);
        setScaleType(ScaleType.CENTER_INSIDE);
        f845r++;
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "####################################Image create count = " + f845r);
        }
    }

    private void m880d(boolean z) {
        int i = 0;
        setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.f851a;
        if (!z) {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    public static void m881g() {
    }

    public static void m882i() {
    }

    static /* synthetic */ int m885l() {
        int i = f846s;
        f846s = i - 1;
        return i;
    }

    private void m886m() {
        setAnimation(null);
        if (this.f859i != null) {
            if (this.f848A) {
                if (this.f858h != null) {
                    this.f869w = this.f858h.getIntrinsicWidth();
                    this.f868v = this.f858h.getIntrinsicHeight();
                } else {
                    this.f869w = this.f859i.getIntrinsicWidth();
                    this.f868v = this.f859i.getIntrinsicHeight();
                }
                if (!this.f861k) {
                    this.f853c.width = this.f869w;
                }
                if (!this.f862l) {
                    this.f853c.height = this.f868v;
                }
            }
            if (this.f861k || this.f862l || this.f848A) {
                setAdjustViewBounds(false);
                setScaleType(ScaleType.FIT_XY);
            }
            if (this.f859i instanceof BitmapDrawable) {
                ((BitmapDrawable) this.f859i).setAntiAlias(true);
            }
            setImageDrawable(this.f859i);
            m902b(5);
            return;
        }
        if (this.f860j != null) {
            setImageDrawable(this.f860j);
        } else {
            setScaleType(ScaleType.CENTER);
            setImageDrawable(this.f864o);
        }
        m902b(4);
    }

    private void m887n() {
        if (this.f857g != null) {
            this.f857g.recycle();
            this.f857g = null;
        }
    }

    private void m888o() {
        if (m889a() <= 3) {
            if (KonyMain.f3657e) {
                Log.d("KonyImage", "Cancelling loading of image " + this.f855e);
            }
            String str = BuildConfig.FLAVOR;
            if (this.f855e != null) {
                str = this.f855e.trim().toLowerCase();
            }
            if (!((!str.startsWith("http://") && !str.startsWith("https://") && !this.f871y) || this.f866q == null || this.f866q.isCancelled())) {
                this.f866q.cancel(true);
                if (!(KonyMain.f3656d > 3 || f847t == null || f847t.remove(this.f866q))) {
                    f846s--;
                    if (KonyMain.f3657e) {
                        Log.d("KonyImage", "Task count = " + f846s);
                    }
                }
                this.f866q = null;
            }
            m902b(1);
        }
    }

    final int m889a() {
        int intValue;
        synchronized (this.f854d) {
            intValue = this.f854d.intValue();
        }
        return intValue;
    }

    public final void m890a(float f) {
        this.f852b.width = 0;
        this.f852b.weight = f;
    }

    public final void m891a(int i) {
        this.f865p = i;
    }

    public final void m892a(int i, int i2) {
        if (i == -1) {
            setVisibility(i2 == 0 ? 0 : 8);
        } else {
            setVisibility(i2);
        }
        this.f851a.setVisibility(i2);
    }

    public final void m893a(Uri uri) {
        setAnimation(null);
        this.f855e = null;
        m887n();
        if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
            Bitmap a = C0202e.m1279a(uri, null);
            if (a != null) {
                this.f859i = new cy(a);
            } else {
                this.f859i = null;
            }
        } else {
            this.f859i = Drawable.createFromPath(uri.toString());
        }
        m886m();
        if (this.f851a.getVisibility() == 4) {
            m880d(true);
        }
        this.f871y = false;
    }

    public final void m894a(bv bvVar) {
    }

    public final void m895a(String str) {
        Drawable c = dB.m1112c(str);
        if (c instanceof BitmapDrawable) {
            ((BitmapDrawable) c).setAntiAlias(true);
        }
        this.f858h = c;
    }

    public final void m896a(String str, dB dBVar) {
        if (str == null || str.trim().length() <= 0) {
            if (this.f850C != null) {
                this.f850C.m109a(BuildConfig.FLAVOR);
            }
            this.f849B = false;
        } else {
            if (this.f850C == null) {
                this.f850C = new C0173A(this);
            }
            this.f850C.m109a(str);
            if (dBVar != null) {
                this.f850C.m108a(dBVar);
            }
            this.f849B = true;
        }
        postInvalidate();
    }

    public final void m897a(boolean z) {
        int i = -1;
        this.f852b.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f853c;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
        this.f861k = z;
    }

    public final void m898a(boolean z, boolean z2) {
        this.f852b.width = -1;
        this.f852b.height = -1;
    }

    public final void m899a(byte[] bArr) {
        setAnimation(null);
        m887n();
        Bitmap a = C0202e.m1281a(bArr, -1, -1);
        this.f857g = a;
        this.f859i = new cy(a);
        m886m();
        if (this.f851a.getVisibility() == 4) {
            m880d(true);
        }
        this.f871y = false;
    }

    public final void m900a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f856f[i] = iArr[i];
        }
        ez.m1344a(iArr, this.f851a, this.f852b);
    }

    public final String m901b() {
        return this.f855e;
    }

    final void m902b(int i) {
        synchronized (this.f854d) {
            this.f854d = Integer.valueOf(i);
        }
    }

    public final void m903b(String str) {
        Drawable c = dB.m1112c(str);
        if (c instanceof BitmapDrawable) {
            ((BitmapDrawable) c).setAntiAlias(true);
        }
        this.f860j = c;
    }

    public final void m904b(boolean z) {
        this.f853c.height = z ? -1 : -2;
        this.f862l = z;
    }

    public final void m905b(int[] iArr) {
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m906c() {
        if (!this.f867u) {
            this.f851a.setLayoutParams(this.f852b);
            this.f851a.addView(this, this.f853c);
            if (this.f858h == null) {
                if (m889a() <= 3) {
                    setAnimation(f844m);
                    f844m.start();
                }
            } else if (this.f858h != null) {
                setAnimation(null);
                if (m889a() <= 3) {
                    setImageDrawable(this.f858h);
                }
                if (this.f848A) {
                    this.f868v = this.f858h.getIntrinsicHeight();
                    this.f869w = this.f858h.getIntrinsicWidth();
                }
            }
            this.f867u = true;
        }
    }

    public final void m907c(int i) {
        this.f852b.gravity = i;
        this.f851a.setGravity(i);
    }

    public final void m908c(String str) {
        if (this.f855e == null || !this.f855e.equalsIgnoreCase(str)) {
            if (str != null && str.trim().equals(BuildConfig.FLAVOR)) {
                str = null;
            }
            if (this.f855e != null && ((this.f855e.trim().toLowerCase().startsWith("http") || this.f855e.trim().toLowerCase().startsWith("https")) && m889a() <= 3)) {
                m888o();
            }
            m887n();
            this.f855e = str;
            if (str == null) {
                setBackgroundDrawable(null);
                m880d(false);
                return;
            }
            m880d(true);
            m902b(1);
            if (KonyMain.f3657e) {
                Log.d("KonyImage", "Initiated loading from setImageUri " + this.f855e);
            }
            if (this.f865p == 1 || this.f872z) {
                m916h();
            }
            this.f871y = false;
        }
    }

    public final void m909c(boolean z) {
        this.f848A = true;
    }

    public final View m910d() {
        return this.f851a;
    }

    public final void m911d(int i) {
        if (this.f862l) {
            int a = ez.m1343a(i, this.f856f);
            if (getMeasuredHeight() != a) {
                this.f851a.setMinimumHeight(a);
                this.f851a.requestLayout();
            }
        }
    }

    public final void m912d(String str) {
        setAnimation(null);
        this.f855e = null;
        if (str != null && m889a() <= 3) {
            m888o();
        }
        this.f870x = str;
        this.f871y = true;
        m887n();
        if (this.f851a.getVisibility() == 4) {
            m880d(true);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "Initiated loading from Base64");
        }
        if (this.f865p == 1 || this.f872z) {
            m916h();
        }
    }

    public final Bitmap m913e() {
        return this.f857g;
    }

    public final void m914e(String str) {
        if (KonyMain.f3656d > 3) {
            setFocusable(true);
            setContentDescription(str);
        }
    }

    public final void m915f() {
        if (this.f855e != null) {
            this.f855e.trim().toLowerCase();
            m888o();
        }
        m887n();
        if (this.f858h != null) {
            this.f858h.setCallback(null);
        }
        this.f858h = null;
        if (this.f860j != null) {
            this.f860j.setCallback(null);
        }
        this.f860j = null;
        if (this.f863n != null) {
            this.f863n.setCallback(null);
        }
        this.f863n = null;
        if (this.f864o != null) {
            this.f864o.setCallback(null);
        }
        this.f864o = null;
        setImageDrawable(null);
        f845r--;
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "Image destroy count = " + f845r + " ####################################");
        }
    }

    public final void m916h() {
        if (this.f855e != null || this.f871y) {
            m902b(2);
            if (this.f858h != null) {
                setImageDrawable(this.f858h);
                setAnimation(null);
            } else {
                setImageDrawable(this.f863n);
                setAnimation(f844m);
                f844m.start();
            }
            String str = BuildConfig.FLAVOR;
            if (this.f855e != null) {
                str = this.f855e.trim().toLowerCase();
            }
            if (str.startsWith("http://") || str.startsWith("https://") || this.f871y) {
                this.f866q = new bu(this);
                if (KonyMain.f3656d > 3) {
                    this.f866q.execute(new String[0]);
                    if (KonyMain.f3657e) {
                        Log.d("KonyImage", "........Executing Image Download task.........");
                        return;
                    }
                    return;
                }
                if (f846s < 0) {
                    f846s = 0;
                }
                if (f846s < 20) {
                    this.f866q.execute(new String[0]);
                    f846s++;
                    return;
                }
                f847t.offer(this.f866q);
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "........Queueing Image Download task.........TaskCount = " + f846s);
                    return;
                }
                return;
            }
            m902b(3);
            this.f859i = dB.m1112c(this.f855e);
            m886m();
            return;
        }
        if (KonyMain.f3658f) {
            Log.w("KonyImage", "Image URI is empty");
        }
        m887n();
        m880d(false);
    }

    protected final void onAttachedToWindow() {
        this.f872z = true;
        if (this.f865p == 0 && m889a() == 1) {
            if (KonyMain.f3657e) {
                Log.d("KonyImage", "Image not loaded.. Initiating loading " + this.f855e);
            }
            m916h();
        }
        super.onAttachedToWindow();
    }

    protected final void onDetachedFromWindow() {
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "=========================================IMAGE DETTACHED FROM WINDOW=========================================");
        }
        if (this.f871y) {
            m887n();
            m902b(1);
        }
        super.onDetachedFromWindow();
    }

    protected final void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap == null || bitmap.isRecycled()) {
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "***************************Draw for image " + this.f855e + "*******************************");
                    return;
                }
                return;
            }
        }
        super.onDraw(canvas);
        if (this.f849B) {
            this.f850C.m107a(canvas);
        }
    }
}
