package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.hardware.Camera.Size;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.konylabs.android.KonyMain;
import java.io.IOException;
import java.util.List;

/* renamed from: com.konylabs.api.ui.N */
public final class C0184N extends SurfaceView implements Callback {
    private static String ab;
    private int f273A;
    private ScaleGestureDetector f274B;
    private float f275C;
    private float f276D;
    private int f277E;
    private int f278F;
    private int f279G;
    private int f280H;
    private boolean f281I;
    private boolean f282J;
    private boolean f283K;
    private int f284L;
    private boolean f285M;
    private SurfaceHolder f286N;
    private Camera f287O;
    private ic f288P;
    private View f289Q;
    private ImageView f290R;
    private Rect f291S;
    private Rect f292T;
    private ShutterCallback f293U;
    private PictureCallback f294V;
    private int f295W;
    private int f296Z;
    private Context f297a;
    private int aa;
    private int ac;
    private int ad;
    private dB f298b;
    private dB f299c;
    private int[] f300d;
    private int[] f301e;
    private LinearLayout f302f;
    private FrameLayout f303g;
    private LayoutParams f304h;
    private LayoutParams f305i;
    private LayoutParams f306j;
    private C0177F f307k;
    private GestureDetector f308l;
    private OnTouchListener f309m;
    private boolean f310n;
    private boolean f311o;
    private int f312p;
    private int f313q;
    private int f314r;
    private boolean f315s;
    private C0192V f316t;
    private LinearLayout f317u;
    private LayoutParams f318v;
    private Parameters f319w;
    private int f320x;
    private Drawable f321y;
    private int f322z;

    static {
        ab = null;
    }

    public C0184N(Context context) {
        super(context);
        this.f298b = null;
        this.f299c = null;
        this.f300d = new int[]{0, 0, 0, 0};
        this.f301e = new int[]{0, 0, 0, 0};
        this.f310n = false;
        this.f311o = false;
        this.f312p = -1;
        this.f313q = -1;
        this.f314r = -1;
        this.f315s = false;
        this.f316t = null;
        this.f322z = -1;
        this.f273A = -1;
        this.f284L = 0;
        this.f285M = false;
        this.f291S = new Rect();
        this.f292T = new Rect();
        this.f293U = new C0187Q(this);
        this.f294V = new C0188R(this);
        this.f295W = 50;
        this.f296Z = 1;
        this.aa = 1;
        this.ad = -1;
        this.f297a = context;
        this.f303g = new FrameLayout(context);
        this.f302f = new LinearLayout(context);
        this.f302f.setOrientation(0);
        this.f304h = new LayoutParams(-2, -2);
        this.f306j = new LayoutParams(-1, -2);
        this.f305i = new LayoutParams(-1, -1);
        this.f304h.gravity = 17;
        if (KonyMain.f3656d >= 9) {
            this.f316t = new C0192V(this, context);
        }
    }

    private static Size m245a(List list, double d, int i, int i2) {
        if (list == null) {
            return null;
        }
        Size size = null;
        double d2 = Double.MAX_VALUE;
        int min = Math.min(i, i2);
        for (Size size2 : list) {
            Size size3;
            double abs;
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d) <= 0.001d) {
                if (((double) Math.abs(size2.height - min)) < d2) {
                    size3 = size2;
                    abs = (double) Math.abs(size2.height - min);
                } else {
                    double d3 = d2;
                    size3 = size;
                    abs = d3;
                }
                size = size3;
                d2 = abs;
            }
        }
        if (size != null) {
            return size;
        }
        d2 = Double.MAX_VALUE;
        for (Size size22 : list) {
            if (((double) Math.abs(size22.height - min)) < d2) {
                size3 = size22;
                abs = (double) Math.abs(size22.height - min);
            } else {
                d3 = d2;
                size3 = size;
                abs = d3;
            }
            size = size3;
            d2 = abs;
        }
        return size;
    }

    public static void m250b() {
    }

    private int[] m252b(View view) {
        int[] iArr = new int[]{view.getLeft(), view.getTop()};
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof View)) {
            int[] b = m252b((View) parent);
            iArr[0] = iArr[0] + b[0];
            iArr[1] = b[1] + iArr[1];
        }
        return iArr;
    }

    private void m266o() {
        if (KonyMain.getAppContext().getResources().getConfiguration().orientation == 2) {
            this.f306j.width = 0;
            this.f318v.width = 0;
            this.f306j.height = -1;
            this.f318v.height = -1;
            this.f302f.setOrientation(0);
            return;
        }
        this.f306j.height = 0;
        this.f318v.height = 0;
        this.f306j.width = -1;
        this.f318v.width = -1;
        this.f302f.setOrientation(1);
    }

    public final void m277a() {
        this.f286N = getHolder();
        this.f286N.addCallback(this);
        this.f286N.setSizeFromLayout();
        this.f286N.setType(3);
    }

    public final void m278a(float f) {
        this.f304h.width = 0;
        this.f304h.weight = f;
    }

    public final void m279a(int i) {
        this.f302f.setVisibility(i);
    }

    public final void m280a(View view) {
        if (this.f289Q != null) {
            if (this.f289Q != null) {
                this.f303g.removeView(this.f289Q);
                ViewGroup viewGroup = (ViewGroup) this.f289Q;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof ImageView) {
                        ((ImageView) childAt).setImageBitmap(null);
                    }
                }
                this.f289Q.setOnTouchListener(null);
            }
            if (view != null) {
                this.f303g.addView(view);
            }
        }
        this.f289Q = view;
        if (this.f289Q == null) {
            return;
        }
        if (this.f283K || this.f282J) {
            if (this.f309m == null) {
                this.f309m = new C0189S(this);
            }
            if (this.f309m == null) {
                return;
            }
            if (this.f289Q instanceof RelativeLayout) {
                View findViewById = this.f289Q.findViewById(2);
                if (findViewById != null) {
                    findViewById.setOnTouchListener(this.f309m);
                }
                this.f289Q.setOnTouchListener(this.f309m);
                return;
            }
            this.f289Q.setOnTouchListener(this.f309m);
        }
    }

    public final void m281a(bt btVar) {
        this.f290R = btVar;
    }

    public final void m282a(bw bwVar) {
        this.f290R = bwVar;
    }

    public final void m283a(dB dBVar) {
        int i = (dBVar == null || dBVar.m1165q()) ? 0 : 1;
        if (this.f307k == null) {
            if (i == 0 || KonyMain.f3656d <= 10) {
                this.f307k = new C0177F(this.f297a);
            } else {
                this.f307k = new C0177F(this.f297a, 0);
            }
            this.f321y = this.f307k.getBackground();
        }
    }

    public final void m284a(ic icVar) {
        this.f288P = icVar;
    }

    public final void m285a(String str) {
        this.f307k.m178a(str);
    }

    public final void m286a(boolean z) {
        this.f283K = z;
        if (z) {
            this.f308l = new GestureDetector(new C0190T());
        }
    }

    public final void m287a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f300d[i] = iArr[i];
        }
        ez.m1344a(this.f300d, this.f302f, this.f304h);
    }

    public final void m288b(int i) {
        this.f295W = i;
    }

    public final void m289b(dB dBVar) {
        this.f298b = dBVar;
    }

    public final void m290b(boolean z) {
        this.f282J = z;
        if (z) {
            this.f274B = new ScaleGestureDetector(KonyMain.getActContext(), new C0191U());
        }
    }

    public final void m291b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f301e[i] = iArr[i];
        }
        setPadding(this.f301e[0], this.f301e[1], this.f301e[2], this.f301e[3]);
    }

    public final void m292c() {
        if (!this.f285M) {
            int n = (this.f298b == null || this.f299c == null) ? this.f298b != null ? this.f298b.m1158n() : this.f299c != null ? this.f299c.m1158n() : 0 : this.f298b.m1158n() > this.f299c.m1158n() ? this.f298b.m1158n() : this.f299c.m1158n();
            this.f306j.setMargins(n, n, n, n);
            dB dBVar = this.f298b;
            this.f303g.addView(this, this.f305i);
            if (this.f289Q != null) {
                this.f304h.width = -1;
                this.f306j.width = -2;
                this.f306j.height = -1;
                this.f303g.addView(this.f289Q);
            }
            this.f306j.width = 0;
            this.f306j.weight = 0.9f;
            this.f307k.m171a(0.1f);
            this.f307k.m172a(17);
            this.f307k.m189c();
            this.f307k.setOnClickListener(new C0185O(this));
            this.f317u = (LinearLayout) this.f307k.m194d();
            this.f318v = (LayoutParams) this.f317u.getLayoutParams();
            this.f302f.setLayoutParams(this.f304h);
            this.f302f.addView(this.f303g, this.f306j);
            this.f302f.addView(this.f307k.m194d());
            this.f285M = true;
        }
    }

    public final void m293c(int i) {
        this.f296Z = i;
    }

    public final void m294c(dB dBVar) {
        this.f299c = dBVar;
    }

    public final void m295c(boolean z) {
        if (this.f315s != z) {
            this.f315s = z;
            this.f307k.m194d().setVisibility(this.f315s ? 8 : 0);
        }
    }

    public final View m296d() {
        return this.f302f;
    }

    public final void m297d(int i) {
        this.aa = i;
    }

    public final void m298d(dB dBVar) {
        if (dBVar != null) {
            this.f307k.m185b(dBVar);
            this.f307k.setBackgroundDrawable(dBVar.m1117a());
        }
    }

    public final void m299e() {
        if (this.f287O != null) {
            this.f311o = true;
            if (this.f319w.getFocusMode().equals("continuous-picture")) {
                m312m();
            } else {
                this.f287O.autoFocus(new C0186P(this));
            }
        }
    }

    public final void m300e(int i) {
        this.f312p = -1;
        this.f313q = i;
    }

    public final void m301f() {
        this.ac++;
    }

    public final void m302f(int i) {
        this.f313q = -1;
        this.f312p = i;
    }

    public final int m303g() {
        int i = this.ac;
        this.ac = i - 1;
        return i;
    }

    public final void m304g(int i) {
        this.f314r = i;
    }

    public final void m305h() {
        if (!this.f311o) {
            m299e();
        }
    }

    public final void m306h(int i) {
        this.f284L = i;
    }

    public final void m307i() {
        if (this.f287O != null) {
            KonyMain actContext = KonyMain.getActContext();
            if (actContext != null) {
                actContext.m4162i();
            }
        }
    }

    public final void m308i(int i) {
        this.ad = i;
        this.f304h.width = -1;
        this.f304h.height = -1;
        if (i == 6) {
            this.f306j.width = 0;
            this.f318v.width = 0;
            this.f306j.height = -1;
            this.f318v.height = -1;
            this.f302f.setOrientation(0);
        } else if (i == 7) {
            this.f306j.height = 0;
            this.f318v.height = 0;
            this.f306j.width = -1;
            this.f318v.width = -1;
            this.f302f.setOrientation(1);
        }
        if (i == 2) {
            m266o();
        }
        this.f302f.invalidate();
    }

    public final int m309j() {
        int i = 0;
        KonyMain actContext = KonyMain.getActContext();
        if (actContext == null) {
            return -1;
        }
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(this.f320x, cameraInfo);
        int rotation = actContext.getWindowManager().getDefaultDisplay().getRotation();
        this.f322z = rotation;
        switch (rotation) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                i = 90;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                i = 180;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                i = 270;
                break;
        }
        return cameraInfo.facing == 1 ? (360 - ((i + cameraInfo.orientation) % 360)) % 360 : ((cameraInfo.orientation - i) + 360) % 360;
    }

    public final void m310k() {
        m266o();
        this.f302f.invalidate();
    }

    public final void m311l() {
        this.f302f.setVisibility(0);
        this.f290R = null;
        this.f295W = 50;
        this.f307k.m185b(null);
        if (this.f321y != null) {
            this.f307k.setBackgroundDrawable(this.f321y);
        }
        this.f296Z = 1;
        this.f314r = 4;
        m295c(false);
        this.f312p = -1;
        this.f313q = -1;
        this.f322z = -1;
        this.f273A = -1;
        this.ad = -1;
        this.f282J = false;
        this.f309m = null;
        this.f308l = null;
        this.f274B = null;
        this.f283K = false;
        this.f284L = 0;
    }

    public final void m312m() {
        if (this.f290R != null) {
            int[] b;
            int width;
            int height;
            this.f291S = new Rect();
            int[] b2 = m252b((View) this);
            this.f291S.left = b2[0];
            this.f291S.top = b2[1];
            this.f291S.right = getWidth() + this.f291S.left;
            this.f291S.bottom = getHeight() + this.f291S.top;
            this.f292T = new Rect();
            if (this.f290R instanceof bt) {
                b = m252b(this.f290R);
                width = this.f290R.getWidth();
                height = this.f290R.getHeight();
            } else if (this.f290R instanceof bw) {
                b = m252b(this.f290R);
                width = this.f290R.getWidth();
                height = this.f290R.getHeight();
            } else {
                width = 0;
                b = b2;
                height = 0;
            }
            this.f292T.left = b[0];
            this.f292T.top = b[1];
            this.f292T.right = width + this.f292T.left;
            this.f292T.bottom = height + this.f292T.top;
            if (KonyMain.f3657e) {
                Log.d("KonyCamera", "Surface Rect = " + this.f291S);
            }
            if (KonyMain.f3657e) {
                Log.d("KonyCamera", "Overlay global Rect = " + this.f292T);
            }
        }
        this.f287O.takePicture(this.f293U, null, this.f294V);
        this.f307k.setEnabled(false);
    }

    public final void m313n() {
        if (this.f321y != null) {
            this.f321y.setCallback(null);
            this.f321y = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void surfaceChanged(android.view.SurfaceHolder r9, int r10, int r11, int r12) {
        /*
        r8 = this;
        r1 = 0;
        r7 = -1;
        r6 = 1;
        r0 = r8.f287O;
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r8.f311o;
        if (r0 != r6) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r0 = r8.f287O;
        r0 = r0.getParameters();
        r8.f319w = r0;
        r0 = r8.f319w;
        r0 = r0.getSupportedPictureSizes();
        if (r0 == 0) goto L_0x02d1;
    L_0x001c:
        r2 = r0.size();
        if (r2 <= 0) goto L_0x02d1;
    L_0x0022:
        r2 = com.konylabs.android.KonyMain.f3657e;
        if (r2 == 0) goto L_0x0046;
    L_0x0026:
        r2 = "KonyCamera";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "picture-size-values ";
        r3 = r3.append(r4);
        r4 = r8.f319w;
        r5 = "picture-size-values";
        r4 = r4.get(r5);
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.d(r2, r3);
    L_0x0046:
        r2 = r8.f313q;
        if (r2 == r7) goto L_0x0205;
    L_0x004a:
        r3 = r0.iterator();
        r2 = r1;
    L_0x004f:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0202;
    L_0x0055:
        r0 = r3.next();
        r0 = (android.hardware.Camera.Size) r0;
        if (r1 != 0) goto L_0x01e5;
    L_0x005d:
        r1 = r0;
    L_0x005e:
        r4 = r0.width;
        r5 = r8.f313q;
        if (r4 != r5) goto L_0x01ee;
    L_0x0064:
        if (r0 == 0) goto L_0x0230;
    L_0x0066:
        r1 = com.konylabs.android.KonyMain.f3657e;
        if (r1 == 0) goto L_0x0090;
    L_0x006a:
        r1 = "KonyCamera";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "picture-size ";
        r2 = r2.append(r3);
        r3 = r0.width;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r0.height;
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.d(r1, r2);
    L_0x0090:
        r1 = r8.f319w;
        r2 = r0.width;
        r0 = r0.height;
        r1.setPictureSize(r2, r0);
    L_0x0099:
        r0 = r8.f319w;
        if (r0 == 0) goto L_0x00c3;
    L_0x009d:
        r0 = r8.f319w;
        r2 = r0.getSupportedPreviewSizes();
        r0 = r8.f319w;
        r3 = r0.getPictureSize();
        r0 = 0;
        if (r3 == 0) goto L_0x00b4;
    L_0x00ad:
        r0 = r3.width;
        r0 = (double) r0;
        r3 = r3.height;
        r4 = (double) r3;
        r0 = r0 / r4;
    L_0x00b4:
        r0 = com.konylabs.api.ui.C0184N.m245a(r2, r0, r11, r12);
        if (r0 == 0) goto L_0x00c3;
    L_0x00ba:
        r1 = r8.f319w;
        r2 = r0.width;
        r0 = r0.height;
        r1.setPreviewSize(r2, r0);
    L_0x00c3:
        r0 = r8.f319w;
        r1 = "focus-mode-values";
        r0 = r0.get(r1);
        if (r0 == 0) goto L_0x00f1;
    L_0x00cd:
        r1 = r8.f284L;
        if (r1 != r6) goto L_0x0267;
    L_0x00d1:
        r1 = com.konylabs.android.KonyMain.f3656d;
        r2 = 14;
        if (r1 < r2) goto L_0x0267;
    L_0x00d7:
        r1 = "continuous-picture";
        r1 = r0.contains(r1);
        if (r1 == 0) goto L_0x0267;
    L_0x00df:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x00ea;
    L_0x00e3:
        r0 = "KonyCamera";
        r1 = "focusMode =  FOCUS_MODE_CONTINUOUS_PICTURE";
        android.util.Log.d(r0, r1);
    L_0x00ea:
        r0 = r8.f319w;
        r1 = "continuous-picture";
        r0.setFocusMode(r1);
    L_0x00f1:
        r0 = r8.f319w;
        r1 = r8.f295W;
        r0.setJpegQuality(r1);
        r0 = r8.f319w;
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0.setPictureFormat(r1);
        r0 = ab;
        if (r0 != 0) goto L_0x010b;
    L_0x0103:
        r0 = r8.f319w;
        r0 = r0.getFlashMode();
        ab = r0;
    L_0x010b:
        r0 = r8.f314r;
        if (r0 == r7) goto L_0x0128;
    L_0x010f:
        r0 = r8.f319w;
        r1 = r0.getSupportedFlashModes();
        if (r1 == 0) goto L_0x0128;
    L_0x0117:
        r2 = r8.f314r;
        if (r2 != 0) goto L_0x0283;
    L_0x011b:
        r2 = "auto";
        r2 = r1.contains(r2);
        if (r2 == 0) goto L_0x0283;
    L_0x0123:
        r1 = "auto";
        r0.setFlashMode(r1);
    L_0x0128:
        r0 = r8.f282J;
        if (r0 == 0) goto L_0x01a0;
    L_0x012c:
        r0 = r8.f281I;
        if (r0 == 0) goto L_0x01a0;
    L_0x0130:
        r0 = java.lang.Math.min(r11, r12);
        r0 = (float) r0;
        r8.f275C = r0;
        r0 = r8.f275C;
        r1 = r8.f276D;
        r0 = r0 - r1;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 / r1;
        r8.f275C = r0;
        r0 = r8.f276D;
        r1 = r8.f280H;
        r1 = (float) r1;
        r2 = r8.f275C;
        r3 = r8.f276D;
        r2 = r2 - r3;
        r1 = r1 * r2;
        r2 = r8.f278F;
        r2 = r2 + 0;
        r2 = (float) r2;
        r1 = r1 / r2;
        r0 = r0 + r1;
        r0 = (int) r0;
        r8.f277E = r0;
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x01a0;
    L_0x015a:
        r0 = "KonyCamera";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Surface changed : width = ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " height = ";
        r1 = r1.append(r2);
        r1 = r1.append(r12);
        r2 = "  mCircleSize = ";
        r1 = r1.append(r2);
        r2 = r8.f277E;
        r1 = r1.append(r2);
        r2 = "  mMaxZoom = ";
        r1 = r1.append(r2);
        r2 = r8.f278F;
        r1 = r1.append(r2);
        r2 = "  initialZoom = ";
        r1 = r1.append(r2);
        r2 = r8.f280H;
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x01a0:
        r0 = r8.f310n;
        if (r0 == 0) goto L_0x01a9;
    L_0x01a4:
        r0 = r8.f287O;
        r0.stopPreview();
    L_0x01a9:
        r0 = com.konylabs.android.KonyMain.f3656d;
        r1 = 9;
        if (r0 < r1) goto L_0x01d0;
    L_0x01af:
        r0 = com.konylabs.android.KonyMain.getActContext();
        if (r0 == 0) goto L_0x01d0;
    L_0x01b5:
        r0 = r0.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getRotation();
        r1 = r8.f322z;
        if (r0 == r1) goto L_0x01d0;
    L_0x01c5:
        r0 = r8.m309j();
        if (r0 == r7) goto L_0x01d0;
    L_0x01cb:
        r1 = r8.f287O;
        r1.setDisplayOrientation(r0);
    L_0x01d0:
        r0 = r8.f287O;
        r1 = r8.f319w;
        r0.setParameters(r1);
        r0 = r8.f287O;
        r0.startPreview();
        r8.f310n = r6;
        r0 = r8.f307k;
        r0.setEnabled(r6);
        goto L_0x000b;
    L_0x01e5:
        r4 = r0.width;
        r5 = r1.width;
        if (r4 >= r5) goto L_0x005e;
    L_0x01eb:
        r1 = r0;
        goto L_0x005e;
    L_0x01ee:
        r4 = r0.width;
        r5 = r8.f313q;
        if (r4 >= r5) goto L_0x02ce;
    L_0x01f4:
        if (r2 != 0) goto L_0x01f9;
    L_0x01f6:
        r2 = r0;
        goto L_0x004f;
    L_0x01f9:
        r4 = r0.width;
        r5 = r2.width;
        if (r4 < r5) goto L_0x02ce;
    L_0x01ff:
        r2 = r0;
        goto L_0x004f;
    L_0x0202:
        r0 = r2;
        goto L_0x0064;
    L_0x0205:
        r3 = r0.iterator();
        r2 = r1;
    L_0x020a:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x02ca;
    L_0x0210:
        r0 = r3.next();
        r0 = (android.hardware.Camera.Size) r0;
        if (r2 != 0) goto L_0x0228;
    L_0x0218:
        r2 = r0;
    L_0x0219:
        r4 = r0.width;
        r5 = 1199; // 0x4af float:1.68E-42 double:5.924E-321;
        if (r4 <= r5) goto L_0x020a;
    L_0x021f:
        r4 = r0.width;
        r5 = 1601; // 0x641 float:2.243E-42 double:7.91E-321;
        if (r4 >= r5) goto L_0x020a;
    L_0x0225:
        r1 = r2;
        goto L_0x0064;
    L_0x0228:
        r4 = r0.width;
        r5 = r2.width;
        if (r4 >= r5) goto L_0x0219;
    L_0x022e:
        r2 = r0;
        goto L_0x0219;
    L_0x0230:
        if (r1 == 0) goto L_0x0099;
    L_0x0232:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x025c;
    L_0x0236:
        r0 = "KonyCamera";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "picture-size ";
        r2 = r2.append(r3);
        r3 = r1.width;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r1.height;
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.d(r0, r2);
    L_0x025c:
        r0 = r8.f319w;
        r2 = r1.width;
        r1 = r1.height;
        r0.setPictureSize(r2, r1);
        goto L_0x0099;
    L_0x0267:
        r1 = "auto";
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x00f1;
    L_0x026f:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x027a;
    L_0x0273:
        r0 = "KonyCamera";
        r1 = "focusMode =  FOCUS_MODE_AUTO";
        android.util.Log.d(r0, r1);
    L_0x027a:
        r0 = r8.f319w;
        r1 = "auto";
        r0.setFocusMode(r1);
        goto L_0x00f1;
    L_0x0283:
        r2 = r8.f314r;
        if (r2 != r6) goto L_0x0296;
    L_0x0287:
        r2 = "on";
        r2 = r1.contains(r2);
        if (r2 == 0) goto L_0x0296;
    L_0x028f:
        r1 = "on";
        r0.setFlashMode(r1);
        goto L_0x0128;
    L_0x0296:
        r2 = r8.f314r;
        r3 = 2;
        if (r2 != r3) goto L_0x02aa;
    L_0x029b:
        r2 = "off";
        r2 = r1.contains(r2);
        if (r2 == 0) goto L_0x02aa;
    L_0x02a3:
        r1 = "off";
        r0.setFlashMode(r1);
        goto L_0x0128;
    L_0x02aa:
        r2 = r8.f314r;
        r3 = 3;
        if (r2 != r3) goto L_0x02be;
    L_0x02af:
        r2 = "torch";
        r1 = r1.contains(r2);
        if (r1 == 0) goto L_0x02be;
    L_0x02b7:
        r1 = "torch";
        r0.setFlashMode(r1);
        goto L_0x0128;
    L_0x02be:
        r1 = r8.f314r;
        r2 = 4;
        if (r1 != r2) goto L_0x0128;
    L_0x02c3:
        r1 = ab;
        r0.setFlashMode(r1);
        goto L_0x0128;
    L_0x02ca:
        r0 = r1;
        r1 = r2;
        goto L_0x0064;
    L_0x02ce:
        r0 = r2;
        goto L_0x01ff;
    L_0x02d1:
        r0 = r1;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.N.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        int i;
        try {
            if (KonyMain.f3656d < 9) {
                this.f287O = Camera.open();
            } else {
                int numberOfCameras = Camera.getNumberOfCameras();
                CameraInfo cameraInfo = new CameraInfo();
                int i2 = 0;
                i = -1;
                while (i2 < numberOfCameras) {
                    Camera.getCameraInfo(i2, cameraInfo);
                    if (cameraInfo.facing == 0) {
                        break;
                    }
                    if (cameraInfo.facing == 1) {
                        i = i2;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 != -1) {
                    this.f287O = Camera.open(i2);
                    this.f320x = i2;
                } else if (i != -1) {
                    this.f287O = Camera.open(i);
                    this.f320x = i;
                }
            }
            if (this.f287O != null) {
                this.f287O.setPreviewDisplay(surfaceHolder);
                if (KonyMain.f3656d >= 9 && this.f316t != null) {
                    this.f316t.enable();
                }
                if (KonyMain.f3656d >= 8) {
                    Parameters parameters = this.f287O.getParameters();
                    this.f281I = parameters.isZoomSupported();
                    if (this.f281I) {
                        this.f276D = (float) dB.m1116r(48);
                        this.f280H = parameters.getZoom();
                        this.f278F = parameters.getMaxZoom();
                        this.f279G = 0;
                    }
                }
            }
        } catch (IOException e) {
            this.f287O.release();
            this.f287O = null;
        } catch (Exception e2) {
            Log.e("KonyCamera", e2.toString());
            if (KonyMain.getActContext() != null) {
                Context appContext = KonyMain.getAppContext();
                i = appContext.getResources().getIdentifier("camera_error", "string", appContext.getPackageName());
                if (i > 0) {
                    Toast.makeText(KonyMain.getAppContext(), KonyMain.getAppContext().getResources().getString(i), 1).show();
                }
            }
            if (this.f288P != null) {
                this.f288P.m1402a(false, null);
            }
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (KonyMain.f3657e) {
            Log.d("KonyCamera", "Camera Surface destroyed... releasing camera");
        }
        if (this.f287O != null) {
            this.f287O.stopPreview();
            this.f287O.release();
            this.f310n = false;
            this.f311o = false;
            this.f287O = null;
            this.f322z = -1;
            if (this.f316t != null) {
                this.f316t.disable();
            }
        }
    }
}
