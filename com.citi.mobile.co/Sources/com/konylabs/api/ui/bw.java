package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.Queue;
import ny0k.cn;
import ny0k.cy;

public final class bw extends ImageView {
    private static RotateAnimation f874n;
    private static int f875s;
    private static int f876t;
    private static Queue f877u;
    private boolean f878A;
    private C0173A f879B;
    private Boolean f880C;
    private LinearLayout f881a;
    private LayoutParams f882b;
    private LayoutParams f883c;
    private Integer f884d;
    private String f885e;
    private int[] f886f;
    private Bitmap f887g;
    private Drawable f888h;
    private Drawable f889i;
    private Drawable f890j;
    private Drawable f891k;
    private StateListDrawable f892l;
    private boolean f893m;
    private Drawable f894o;
    private Drawable f895p;
    private int f896q;
    private bx f897r;
    private boolean f898v;
    private int f899w;
    private int f900x;
    private bz f901y;
    private boolean f902z;

    static {
        f875s = 0;
        f876t = 0;
        f877u = null;
        if (KonyMain.f3656d <= 3) {
            f877u = new LinkedList();
        }
    }

    public bw(Context context) {
        super(context);
        this.f881a = null;
        this.f882b = null;
        this.f883c = null;
        this.f884d = Integer.valueOf(1);
        this.f885e = null;
        this.f886f = new int[]{0, 0, 0, 0};
        this.f887g = null;
        this.f888h = null;
        this.f889i = null;
        this.f890j = null;
        this.f891k = null;
        this.f893m = false;
        this.f896q = 0;
        this.f898v = false;
        this.f899w = -1;
        this.f900x = -1;
        this.f902z = false;
        this.f878A = false;
        this.f879B = null;
        this.f880C = Boolean.valueOf(true);
        this.f881a = new LinearLayout(context);
        this.f882b = new LayoutParams(-2, -2);
        this.f883c = new LayoutParams(-1, -1);
        this.f894o = dB.m1112c("ic_image_loading_icon.png");
        this.f895p = dB.m1112c("ic_image_error_icon.png");
        setImageDrawable(this.f894o);
        if (f874n == null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            f874n = rotateAnimation;
            rotateAnimation.setRepeatCount(-1);
            f874n.setDuration(1000);
        }
        setAdjustViewBounds(true);
        f875s++;
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "####################################Image create count = " + f875s);
        }
    }

    private void m920b(boolean z) {
        int i = 0;
        setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.f881a;
        if (!z) {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    static /* synthetic */ int m923o() {
        int i = f876t;
        f876t = i - 1;
        return i;
    }

    private void m924p() {
        setAnimation(null);
        if (this.f893m && this.f891k != null && this.f889i != null) {
            m927s();
        } else if (this.f889i != null) {
            if (this.f889i instanceof BitmapDrawable) {
                ((BitmapDrawable) this.f889i).setAntiAlias(true);
            }
            setImageDrawable(this.f889i);
            m943b(5);
        } else {
            if (this.f890j != null) {
                setImageDrawable(this.f890j);
            } else {
                setImageDrawable(this.f895p);
            }
            m943b(4);
        }
    }

    private void m925q() {
        if (this.f887g != null) {
            this.f887g.recycle();
            this.f887g = null;
        }
    }

    private void m926r() {
        if (m928a() <= 3) {
            if (KonyMain.f3657e) {
                Log.d("KonyImage", "Cancelling loading of image " + this.f885e);
            }
            String toLowerCase = this.f885e.trim().toLowerCase();
            if (!((!toLowerCase.startsWith("http://") && !toLowerCase.startsWith("https://")) || this.f897r == null || this.f897r.isCancelled())) {
                this.f897r.cancel(true);
                if (!(KonyMain.f3656d > 3 || f877u == null || f877u.remove(this.f897r))) {
                    f876t--;
                    if (KonyMain.f3657e) {
                        Log.d("KonyImage", "Task count = " + f876t);
                    }
                }
                this.f897r = null;
            }
            m943b(1);
        }
    }

    private void m927s() {
        if (this.f893m && this.f891k != null && this.f889i != null) {
            setImageDrawable(null);
            this.f892l = new StateListDrawable();
            this.f892l.addState(PRESSED_ENABLED_FOCUSED_STATE_SET, this.f891k);
            this.f892l.addState(FOCUSED_STATE_SET, this.f891k);
            this.f892l.addState(PRESSED_ENABLED_STATE_SET, this.f891k);
            this.f892l.addState(ENABLED_STATE_SET, this.f889i);
            setImageDrawable(this.f892l);
            ((DrawableContainerState) this.f892l.getConstantState()).setConstantSize(true);
        }
    }

    final int m928a() {
        int intValue;
        synchronized (this.f884d) {
            intValue = this.f884d.intValue();
        }
        return intValue;
    }

    public final void m929a(float f) {
        this.f882b.width = 0;
        this.f882b.weight = f;
        requestLayout();
    }

    public final void m930a(int i) {
        this.f896q = i;
    }

    public final void m931a(int i, int i2) {
        if (i == -1) {
            setVisibility(i2 == 0 ? 0 : 8);
        } else {
            setVisibility(i2);
        }
        this.f881a.setVisibility(i2);
    }

    public final void m932a(Drawable drawable) {
        this.f888h = drawable;
    }

    public final void m933a(Uri uri) {
        setAnimation(null);
        this.f885e = null;
        m925q();
        if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
            Bitmap a = C0202e.m1279a(uri, null);
            if (a != null) {
                if (KonyMain.f3656d >= 11 && !uri.toString().contains("contacts")) {
                    a = C0202e.m1280a((Object) uri, a);
                }
                this.f889i = new cy(a);
            } else {
                this.f889i = null;
            }
        } else {
            this.f889i = Drawable.createFromPath(uri.toString());
        }
        m924p();
        if (this.f881a.getVisibility() == 4) {
            m920b(true);
        }
    }

    public final void m934a(bz bzVar) {
        this.f901y = bzVar;
    }

    public final void m935a(Boolean bool) {
        this.f880C = Boolean.valueOf(!bool.booleanValue());
    }

    public final void m936a(String str) {
        Drawable c = dB.m1112c(str);
        if (c instanceof BitmapDrawable) {
            ((BitmapDrawable) c).setAntiAlias(true);
        }
        this.f888h = c;
    }

    public final void m937a(String str, dB dBVar) {
        if (str == null || str.trim().length() <= 0) {
            if (this.f879B != null) {
                this.f879B.m109a(BuildConfig.FLAVOR);
            }
            this.f878A = false;
        } else {
            if (this.f879B == null) {
                this.f879B = new C0173A(this);
            }
            this.f879B.m109a(str);
            if (dBVar != null) {
                this.f879B.m108a(dBVar);
            }
            this.f878A = true;
        }
        postInvalidate();
    }

    public final void m938a(boolean z) {
        this.f893m = z;
        this.f881a.setDuplicateParentStateEnabled(z);
        setDuplicateParentStateEnabled(z);
        m927s();
    }

    public final void m939a(boolean z, boolean z2) {
        this.f882b.width = -1;
        this.f882b.height = -1;
    }

    public final void m940a(byte[] bArr) {
        setAnimation(null);
        m925q();
        Bitmap a = C0202e.m1281a(bArr, this.f900x, this.f899w);
        if (KonyMain.f3656d >= 11 && a != null) {
            a = C0202e.m1280a((Object) bArr, a);
        }
        this.f887g = a;
        if (a != null) {
            this.f889i = new cy(a);
        }
        m924p();
        if (this.f881a.getVisibility() == 4) {
            m920b(true);
        }
    }

    public final void m941a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f886f[i] = iArr[i];
        }
        ez.m1344a(this.f886f, this.f881a, this.f882b);
        this.f881a.setLayoutParams(this.f882b);
    }

    public final String m942b() {
        return this.f885e;
    }

    final void m943b(int i) {
        synchronized (this.f884d) {
            this.f884d = Integer.valueOf(i);
        }
    }

    public final void m944b(String str) {
        Drawable c = dB.m1112c(str);
        if (c instanceof BitmapDrawable) {
            ((BitmapDrawable) c).setAntiAlias(true);
        }
        this.f890j = c;
    }

    public final void m945b(int[] iArr) {
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m946c() {
        if (!this.f898v) {
            this.f881a.setLayoutParams(this.f882b);
            this.f881a.addView(this, this.f883c);
            if (this.f888h == null) {
                if (m928a() <= 3) {
                    setAnimation(f874n);
                    f874n.start();
                }
            } else if (this.f888h != null) {
                setAnimation(null);
                if (m928a() <= 3) {
                    setImageDrawable(this.f888h);
                }
            }
            this.f898v = true;
        }
    }

    public final void m947c(int i) {
        this.f882b.height = i;
        this.f881a.setLayoutParams(this.f882b);
    }

    public final void m948c(String str) {
        if (this.f885e == null || !this.f885e.equalsIgnoreCase(str)) {
            if (str != null && str.trim().equals(BuildConfig.FLAVOR)) {
                str = null;
            }
            if (this.f885e != null && ((this.f885e.trim().toLowerCase().startsWith("http") || this.f885e.trim().toLowerCase().startsWith("https")) && m928a() <= 3)) {
                m926r();
            }
            m925q();
            this.f885e = str;
            if (str == null) {
                setBackgroundDrawable(null);
                m920b(false);
                return;
            }
            m920b(true);
            m943b(1);
            if (KonyMain.f3657e) {
                Log.d("KonyImage", "Initiated loading from setImageUri " + this.f885e);
            }
            if (this.f896q == 1 || this.f902z) {
                m959h();
            }
        }
    }

    public final View m949d() {
        return this.f881a;
    }

    public final void m950d(int i) {
        this.f882b.gravity = i;
        this.f881a.setGravity(i);
    }

    public final void m951d(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            setFocusable(true);
            setContentDescription(str);
            return;
        }
        setFocusable(false);
        setContentDescription(BuildConfig.FLAVOR);
    }

    public final void m952e() {
        setFocusable(false);
        setContentDescription(null);
    }

    public final void m953e(int i) {
        this.f900x = dB.m1116r(i);
        requestLayout();
    }

    public final void m954e(String str) {
        Drawable drawable = null;
        setAnimation(null);
        this.f885e = null;
        try {
            Object a = cn.m2178a(str);
            m925q();
            InputStream byteArrayInputStream = new ByteArrayInputStream(a);
            Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
            if (KonyMain.f3656d >= 11 && decodeStream != null) {
                decodeStream = C0202e.m1280a(a, decodeStream);
            }
            this.f887g = decodeStream;
            if (decodeStream != null) {
                drawable = new cy(decodeStream);
            }
            this.f889i = drawable;
            byteArrayInputStream.close();
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyImage", BuildConfig.FLAVOR + e.getMessage());
            }
        }
        m924p();
        if (this.f881a.getVisibility() == 4) {
            m920b(true);
        }
    }

    public final void m955f() {
        if (this.f894o != null) {
            this.f894o.setCallback(null);
        }
        this.f894o = null;
        if (this.f895p != null) {
            this.f895p.setCallback(null);
        }
        this.f895p = null;
        m958g();
        f875s--;
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "Image destroy count = " + f875s + " ####################################");
        }
    }

    public final void m956f(int i) {
        this.f899w = dB.m1116r(i);
        requestLayout();
    }

    public final void m957f(String str) {
        if (str != null) {
            this.f891k = dB.m1112c(str);
        } else {
            this.f891k = null;
        }
        m927s();
    }

    public final void m958g() {
        if (this.f885e != null) {
            this.f885e.trim().toLowerCase();
            m926r();
        }
        if (this.f892l != null) {
            this.f892l.setCallback(null);
        }
        this.f892l = null;
        this.f885e = null;
        m925q();
        if (this.f888h != null) {
            this.f888h.setCallback(null);
        }
        this.f888h = null;
        if (this.f890j != null) {
            this.f890j.setCallback(null);
        }
        this.f890j = null;
        setImageDrawable(null);
    }

    public final void m959h() {
        if (this.f885e != null) {
            m943b(2);
            if (this.f888h != null) {
                setImageDrawable(this.f888h);
                setAnimation(null);
            } else {
                setImageDrawable(this.f894o);
                setAnimation(f874n);
                f874n.start();
            }
            String toLowerCase = this.f885e.trim().toLowerCase();
            if (toLowerCase.startsWith("http://") || toLowerCase.startsWith("https://")) {
                Drawable a = dB.m1103a(this.f885e, this.f880C.booleanValue());
                if (a != null) {
                    this.f889i = a;
                    m960i();
                    return;
                }
                this.f897r = new bx(this);
                if (KonyMain.f3656d > 3) {
                    if (KonyMain.f3656d > 10) {
                        this.f897r.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    } else {
                        this.f897r.execute(new String[0]);
                    }
                    if (KonyMain.f3657e) {
                        Log.d("KonyImage", "........Executing Image Download task.........");
                        return;
                    }
                    return;
                }
                if (f876t < 0) {
                    f876t = 0;
                }
                if (f876t < 20) {
                    this.f897r.execute(new String[0]);
                    f876t++;
                    return;
                }
                f877u.offer(this.f897r);
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "........Queueing Image Download task.........TaskCount = " + f876t);
                    return;
                }
                return;
            }
            m943b(3);
            this.f889i = dB.m1112c(this.f885e);
            m924p();
            return;
        }
        if (KonyMain.f3658f) {
            Log.w("KonyImage", "Image URI is empty");
        }
        m925q();
        m920b(false);
    }

    public final void m960i() {
        if (this.f901y != null) {
            boolean z = false;
            if (this.f889i != null) {
                z = true;
            }
            this.f901y.m964a(this.f885e, z);
        }
        m924p();
    }

    public final void m961j() {
        setAdjustViewBounds(true);
        setScaleType(ScaleType.CENTER_INSIDE);
    }

    public final void m962k() {
        setAdjustViewBounds(false);
        setScaleType(ScaleType.FIT_XY);
    }

    public final void m963l() {
        setAdjustViewBounds(false);
        setScaleType(ScaleType.MATRIX);
    }

    protected final void onAttachedToWindow() {
        this.f902z = true;
        if (this.f896q == 0 && m928a() == 1) {
            if (KonyMain.f3657e) {
                Log.d("KonyImage", "Image not loaded.. Initiating loading " + this.f885e);
            }
            m959h();
        }
        super.onAttachedToWindow();
    }

    protected final void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap == null || bitmap.isRecycled()) {
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "***************************Draw for image " + this.f885e + "*******************************");
                    return;
                }
                return;
            }
        }
        super.onDraw(canvas);
        if (this.f878A) {
            this.f879B.m107a(canvas);
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = super.getDrawable();
        if (drawable != null && getScaleType() == ScaleType.MATRIX) {
            float f2;
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth < width || intrinsicHeight < height) {
                float f3 = (float) ((int) ((((float) (width - intrinsicWidth)) * 0.5f) + 0.5f));
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                f2 = (float) ((int) ((((float) (height - intrinsicHeight)) * 0.5f) + 0.5f));
                if (f2 < 0.0f) {
                    f2 = f3;
                } else {
                    f = f2;
                    f2 = f3;
                }
            } else {
                f2 = 0.0f;
            }
            Matrix matrix = new Matrix();
            matrix.setTranslate(f2, f);
            setImageMatrix(matrix);
        }
    }

    protected final void onMeasure(int i, int i2) {
        int mode;
        int size;
        int i3 = 1073741824;
        if (this.f900x >= 0) {
            mode = MeasureSpec.getMode(i);
            size = MeasureSpec.getSize(i);
            switch (mode) {
                case ExploreByTouchHelper.INVALID_ID /*-2147483648*/:
                    size = Math.min(size, this.f900x);
                    mode = 1073741824;
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                    size = this.f900x;
                    mode = 1073741824;
                    break;
                case 1073741824:
                    size = Math.min(size, this.f900x);
                    break;
            }
            i = MeasureSpec.makeMeasureSpec(size, mode);
        }
        if (this.f899w >= 0) {
            mode = MeasureSpec.getMode(i2);
            size = MeasureSpec.getSize(i2);
            switch (mode) {
                case ExploreByTouchHelper.INVALID_ID /*-2147483648*/:
                    size = Math.min(size, this.f899w);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                    size = this.f899w;
                    break;
                case 1073741824:
                    size = Math.min(size, this.f899w);
                    i3 = mode;
                    break;
                default:
                    i3 = mode;
                    break;
            }
            i2 = MeasureSpec.makeMeasureSpec(size, i3);
        }
        super.onMeasure(i, i2);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        m925q();
        int i = this.f900x;
        int i2 = this.f899w;
        if (bitmap == null) {
            bitmap = null;
        } else {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            if (toByteArray != null && toByteArray.length > 0) {
                bitmap = C0202e.m1281a(toByteArray, i, i2);
            } else if (KonyMain.f3657e) {
                Log.d("MediaUtil", "getScaledBitMap : Conversion from bitmap to byte array failed");
            }
        }
        this.f887g = bitmap;
        if (this.f887g != null) {
            this.f889i = new cy(this.f887g);
        } else {
            this.f889i = null;
        }
        m924p();
        if (this.f881a.getVisibility() == 4) {
            m920b(true);
        }
    }
}
