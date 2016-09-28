package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;

public final class cz extends PopupWindow {
    public static int f1035b;
    public static int f1036c;
    private boolean f1037A;
    private cG f1038B;
    private OnDismissListener f1039C;
    private float f1040D;
    private int f1041E;
    private boolean f1042F;
    private cF f1043G;
    private long f1044H;
    private boolean f1045I;
    private boolean f1046J;
    private int f1047K;
    private boolean f1048L;
    private boolean f1049M;
    private int f1050N;
    private int f1051O;
    private boolean f1052P;
    private boolean f1053Q;
    public C0207if f1054a;
    LinearLayout f1055d;
    LinearLayout f1056e;
    boolean f1057f;
    OnPreDrawListener f1058g;
    private float f1059h;
    private dB f1060i;
    private Drawable f1061j;
    private LinearLayout f1062k;
    private RelativeLayout f1063l;
    private String f1064m;
    private LinearLayout f1065n;
    private TextView f1066o;
    private ProgressBar f1067p;
    private View f1068q;
    private int f1069r;
    private int f1070s;
    private int f1071t;
    private int f1072u;
    private int f1073v;
    private Context f1074w;
    private LayoutParams f1075x;
    private Rect f1076y;
    private int f1077z;

    static {
        f1035b = 1;
        f1036c = 2;
    }

    public cz(Context context) {
        super(context);
        this.f1054a = null;
        this.f1073v = -1;
        this.f1076y = new Rect(0, 0, 0, 0);
        this.f1077z = 16;
        this.f1037A = false;
        this.f1039C = new cA(this);
        this.f1040D = 0.25f;
        this.f1041E = -1;
        this.f1044H = 0;
        this.f1045I = false;
        this.f1047K = 0;
        this.f1048L = true;
        this.f1058g = new cB(this);
        this.f1052P = false;
        this.f1053Q = true;
        this.f1074w = context;
        setWindowLayoutMode(0, -2);
        setOutsideTouchable(true);
        setTouchable(true);
        setFocusable(true);
        setClippingEnabled(true);
        this.f1063l = new cE(this, this.f1074w);
        this.f1063l.setLayoutParams(new LayoutParams(-1, -1));
        this.f1065n = new LinearLayout(this.f1074w);
        this.f1065n.setBackgroundColor(-7829368);
        this.f1065n.setGravity(17);
        this.f1065n.setLayoutParams(new LayoutParams(-1, -2));
        this.f1065n.setId(1);
        this.f1066o = new TextView(this.f1074w);
        this.f1066o.setVisibility(8);
        this.f1066o.setGravity(17);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dB.m1116r(5);
        layoutParams.bottomMargin = dB.m1116r(5);
        layoutParams.weight = 1.0f;
        this.f1066o.setLayoutParams(layoutParams);
        this.f1066o.setTextSize(2, 18.0f);
        this.f1066o.setTypeface(Typeface.DEFAULT_BOLD);
        this.f1065n.addView(this.f1066o);
        this.f1067p = new ProgressBar(this.f1074w);
        layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f1067p.setBackgroundColor(-3355444);
        this.f1067p.setIndeterminate(true);
        this.f1067p.setMinimumWidth(dB.m1116r(20));
        this.f1067p.setMinimumHeight(dB.m1116r(20));
        this.f1067p.setVisibility(8);
        this.f1067p.setLayoutParams(layoutParams);
        this.f1065n.addView(this.f1067p);
        this.f1056e = new LinearLayout(this.f1074w);
        this.f1056e.setOrientation(1);
        this.f1056e.setId(4);
        layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.f1056e.setLayoutParams(layoutParams);
        this.f1056e.setVisibility(8);
        this.f1055d = new LinearLayout(this.f1074w);
        this.f1055d.setId(3);
        this.f1055d.setOrientation(1);
        layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(3, 1);
        this.f1055d.setLayoutParams(layoutParams);
        this.f1054a = new C0207if(this.f1074w);
        this.f1075x = new LayoutParams(-1, -2);
        this.f1075x.addRule(3, 3);
        this.f1075x.addRule(2, 4);
        this.f1054a.setLayoutParams(this.f1075x);
        this.f1054a.setFillViewport(true);
        this.f1054a.setScrollContainer(true);
        this.f1054a.setHorizontalScrollBarEnabled(false);
        this.f1054a.setVerticalScrollBarEnabled(true);
        this.f1054a.setId(5);
        this.f1063l.addView(this.f1065n);
        this.f1063l.addView(this.f1055d);
        this.f1063l.addView(this.f1054a);
        this.f1063l.addView(this.f1056e);
        this.f1062k = new LinearLayout(this.f1074w);
        this.f1062k.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f1062k.setOrientation(1);
        this.f1054a.addView(this.f1062k);
        setOnDismissListener(this.f1039C);
        setContentView(this.f1063l);
        setAnimationStyle(16973826);
    }

    private static void m1057j(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (KonyMain.f3657e) {
                Log.d("KonyPopup", "The child being added already has a parent so removing it");
            }
            viewGroup.removeView(view);
        }
    }

    private void m1058p() {
        View contentView = getContentView();
        contentView.setMinimumWidth(this.f1047K);
        int o = KonyMain.getActContext().m4166o();
        int p = KonyMain.getActContext().m4167p();
        if (this.f1052P) {
            contentView.measure(MeasureSpec.makeMeasureSpec(o, 1073741824), MeasureSpec.makeMeasureSpec(p, 1073741824));
        } else if (this.f1047K == 0) {
            contentView.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(p, ExploreByTouchHelper.INVALID_ID));
        } else {
            contentView.measure(MeasureSpec.makeMeasureSpec(this.f1047K, ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(p, ExploreByTouchHelper.INVALID_ID));
        }
        int measuredWidth = this.f1068q.getMeasuredWidth();
        int measuredHeight = this.f1068q.getMeasuredHeight();
        this.f1071t = contentView.getMeasuredWidth();
        this.f1072u = contentView.getMeasuredHeight();
        if (this.f1073v != -1) {
            if (this.f1077z == 16 && this.f1073v >= this.f1072u && this.f1055d.getMeasuredHeight() > 0 && this.f1056e.getMeasuredHeight() > 0) {
                setWindowLayoutMode(0, -2);
            } else if (this.f1077z == 32 && !this.f1042F) {
                setWindowLayoutMode(0, 0);
            }
            this.f1072u = this.f1073v;
        } else if (this.f1077z == 16) {
            setWindowLayoutMode(0, -2);
        } else if (this.f1077z != 32 || this.f1042F) {
            contentView = getContentView();
            this.f1072u = contentView.findViewById(5).getMeasuredHeight() + ((contentView.findViewById(1).getMeasuredHeight() + contentView.findViewById(3).getMeasuredHeight()) + contentView.findViewById(4).getMeasuredHeight());
        } else {
            setWindowLayoutMode(0, 0);
        }
        int[] iArr = new int[2];
        this.f1068q.getLocationOnScreen(iArr);
        switch (this.f1041E) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f1069r = iArr[0];
                this.f1070s = iArr[1];
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f1069r = measuredWidth + iArr[0];
                this.f1070s = iArr[1];
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (!this.f1042F) {
                    this.f1069r = ((measuredWidth - this.f1071t) + iArr[0]) / 2;
                    this.f1070s = ((measuredHeight - this.f1072u) + iArr[1]) / 2;
                    break;
                }
                this.f1069r = ((o - this.f1071t) + iArr[0]) / 2;
                this.f1070s = ((p - this.f1072u) + iArr[1]) / 2;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                this.f1069r = iArr[0];
                this.f1070s = iArr[1] + measuredHeight;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                this.f1069r = measuredWidth + iArr[0];
                this.f1070s = iArr[1] + measuredHeight;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                this.f1069r = iArr[0];
                this.f1070s = iArr[1] - this.f1072u;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                this.f1069r = iArr[0] - this.f1071t;
                this.f1070s = iArr[1];
                break;
        }
        if (this.f1069r < 0) {
            this.f1069r = 0;
        } else if (this.f1069r > o) {
            this.f1069r = o - this.f1071t;
            if (this.f1069r < 0) {
                this.f1071t += this.f1069r;
                this.f1069r = 0;
            }
        }
        if (this.f1069r + this.f1071t > o) {
            measuredWidth = (this.f1071t + this.f1069r) - o;
            if (this.f1069r - measuredWidth < 0) {
                this.f1069r = 0;
                this.f1071t = o;
            } else {
                this.f1069r -= measuredWidth;
            }
        }
        int[] iArr2 = new int[2];
        KonyMain.getActContext().m4164l().m464d().getLocationOnScreen(iArr2);
        if (this.f1070s < 0) {
            if (!this.f1042F && this.f1077z == 32) {
                this.f1072u = iArr[1] - iArr2[1];
            }
            this.f1070s = 0;
        } else if (this.f1070s > p) {
            this.f1070s = p - this.f1072u;
            if (this.f1070s < 0) {
                this.f1072u += this.f1070s;
                this.f1070s = 0;
            }
        } else {
            this.f1037A = true;
        }
        if (this.f1070s + this.f1072u > p) {
            measuredWidth = (this.f1072u + this.f1070s) - p;
            if (this.f1070s - measuredWidth >= 0) {
                if (this.f1070s - measuredWidth > 0) {
                    if (this.f1037A && !this.f1042F && this.f1077z == 32) {
                        setWindowLayoutMode(0, 0);
                        if (this.f1041E == 1 || this.f1041E == 3 || this.f1041E == 9 || this.f1041E == 11) {
                            this.f1070s -= measuredWidth;
                        } else {
                            this.f1072u = p - this.f1070s;
                        }
                    } else {
                        this.f1070s -= measuredWidth;
                    }
                } else if (this.f1037A && !this.f1042F && this.f1077z == 32) {
                    setWindowLayoutMode(0, 0);
                    if (this.f1041E == 1 || this.f1041E == 3 || this.f1041E == 9 || this.f1041E == 11) {
                        this.f1070s -= measuredWidth;
                    } else {
                        this.f1072u = p - this.f1070s;
                    }
                }
                this.f1072u = measuredHeight;
                this.f1070s = iArr[1];
            } else if (this.f1037A && !this.f1042F && this.f1077z == 32) {
                setWindowLayoutMode(0, 0);
            } else {
                this.f1070s = 0;
                this.f1072u = p;
                if (this.f1042F && this.f1072u > measuredHeight) {
                    this.f1072u = measuredHeight;
                    this.f1070s = iArr[1];
                }
            }
            this.f1072u = p - this.f1070s;
            this.f1072u = measuredHeight;
            this.f1070s = iArr[1];
        }
        if (this.f1070s == 0) {
            this.f1070s = iArr2[1];
        }
    }

    private void m1059q() {
        int i = 0;
        if (this.f1060i != null) {
            i = this.f1060i.m1158n();
        }
        int i2 = this.f1076y.bottom + i;
        int i3 = this.f1076y.left + i;
        int i4 = this.f1076y.right + i;
        i += this.f1076y.top;
        if (this.f1053Q) {
            this.f1054a.setPadding(i3, i, i4, i2);
        } else {
            this.f1062k.setPadding(i3, i, i4, i2);
        }
    }

    public final String m1060a() {
        return this.f1064m;
    }

    public final void m1061a(float f) {
        this.f1059h = f;
        m1090g();
    }

    public final void m1062a(int i) {
        if (KonyMain.f3657e) {
            Log.d("KonyPopup", "SetBlur = " + i);
        }
        this.f1040D = Math.abs(1.0f - (((float) i) / 100.0f));
    }

    public final void m1063a(int i, int i2) {
        int identifier;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                identifier = this.f1074w.getResources().getIdentifier("SlideInUp", "style", this.f1074w.getPackageName());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                identifier = this.f1074w.getResources().getIdentifier("DropDownLeftUp", "style", this.f1074w.getPackageName());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                identifier = this.f1074w.getResources().getIdentifier("DropDownRightUp", "style", this.f1074w.getPackageName());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                identifier = this.f1074w.getResources().getIdentifier("DropUpDown", "style", this.f1074w.getPackageName());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                identifier = 16973826;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                identifier = this.f1074w.getResources().getIdentifier("SlideInLeft", "style", this.f1074w.getPackageName());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                identifier = this.f1074w.getResources().getIdentifier("SlideInRight", "style", this.f1074w.getPackageName());
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                identifier = this.f1074w.getResources().getIdentifier("SlideInDown", "style", this.f1074w.getPackageName());
                break;
            default:
                return;
        }
        if (i2 == f1036c) {
            this.f1050N = identifier;
            return;
        }
        this.f1051O = identifier;
        setAnimationStyle(identifier);
        update();
    }

    public final void m1064a(View view) {
        if (view != null) {
            this.f1068q = view;
            if (view.equals(KonyMain.getActContext().m4164l().m464d())) {
                this.f1042F = true;
                return;
            }
            return;
        }
        this.f1068q = KonyMain.getActContext().m4164l().m464d();
        setWindowLayoutMode(0, 0);
        this.f1042F = true;
    }

    public final void m1065a(View view, int i) {
        this.f1062k.addView(view, i);
    }

    public final void m1066a(cF cFVar) {
        this.f1043G = cFVar;
    }

    public final void m1067a(cG cGVar) {
        this.f1038B = cGVar;
    }

    public final void m1068a(dB dBVar) {
        this.f1060i = dBVar;
        if (this.f1060i != null) {
            this.f1061j = this.f1060i.m1117a();
            if (this.f1060i.m1126b() != null && this.f1061j != null) {
                Drawable layerDrawable = new LayerDrawable(new Drawable[]{r2, this.f1061j});
                layerDrawable.setLayerInset(1, this.f1060i.m1158n(), this.f1060i.m1158n(), this.f1060i.m1158n(), this.f1060i.m1158n());
                this.f1061j = layerDrawable;
            }
        }
    }

    public final void m1069a(String str) {
        this.f1064m = str;
        if (str != null) {
            this.f1066o.setText(str);
            this.f1066o.setVisibility(0);
            return;
        }
        this.f1066o.setVisibility(8);
    }

    public final void m1070a(boolean z) {
        this.f1045I = z;
    }

    public final void m1071a(int[] iArr) {
        this.f1076y.left = iArr[0];
        this.f1076y.top = iArr[1];
        this.f1076y.right = iArr[2];
        this.f1076y.bottom = iArr[3];
    }

    public final void m1072b() {
        if (this.f1068q != null && this.f1068q.getViewTreeObserver().isAlive()) {
            this.f1068q.getViewTreeObserver().addOnPreDrawListener(this.f1058g);
        }
    }

    public final void m1073b(int i) {
        this.f1041E = i;
    }

    public final void m1074b(View view) {
        this.f1062k.addView(view);
    }

    public final void m1075b(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            this.f1063l.setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                this.f1063l.setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            this.f1063l.setImportantForAccessibility(2);
        } else {
            this.f1063l.setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final void m1076b(boolean z) {
        this.f1046J = true;
    }

    public final void m1077c() {
        if (KonyMain.f3656d > 3) {
            try {
                getClass().getMethod("setSoftInputMode", new Class[]{Integer.TYPE}).invoke(this, new Object[]{Integer.valueOf(this.f1077z)});
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    e.printStackTrace();
                }
            }
        }
        m1059q();
        dB dBVar = this.f1060i;
        m1092h();
        m1058p();
        setBackgroundDrawable(null);
        showAtLocation(this.f1068q, 0, 0, 0);
        this.f1048L = true;
        if (this.f1046J) {
            setTouchable(false);
        }
        ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            if (this.f1045I || !this.f1049M) {
                layoutParams2.flags = 2;
            } else {
                layoutParams2.flags = 34;
            }
            layoutParams2.dimAmount = this.f1040D;
        }
        update(this.f1069r, this.f1070s, this.f1071t, this.f1072u, true);
        this.f1044H = System.currentTimeMillis();
        getContentView().clearFocus();
        if (!this.f1042F) {
            this.f1068q.requestFocus();
        }
    }

    public final void m1078c(int i) {
        this.f1077z = i;
    }

    public final void m1079c(View view) {
        this.f1062k.removeView(view);
    }

    public final void m1080c(boolean z) {
        this.f1052P = z;
        if (z) {
            this.f1054a.setLayoutParams(new LayoutParams(-1, -1));
        }
    }

    public final View m1081d() {
        return this.f1062k;
    }

    public final void m1082d(int i) {
        this.f1073v = i;
    }

    public final void m1083d(View view) {
        if (view instanceof C0174B) {
            C0174B c0174b = (C0174B) view;
            ViewGroup viewGroup = (ViewGroup) c0174b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            c0174b.m139c(true);
            this.f1055d.addView(view);
            this.f1055d.setVisibility(0);
        }
    }

    public final void m1084d(boolean z) {
        this.f1049M = z;
    }

    public final void dismiss() {
        setAnimationStyle(f1036c == f1036c ? this.f1050N : this.f1051O);
        update();
        if (KonyMain.f3656d > 10) {
            WindowManager windowManager = (WindowManager) this.f1074w.getSystemService("window");
            if (!(getContentView() == null || getContentView().getParent() == null)) {
                windowManager.removeView(getContentView().getRootView());
            }
            if (this.f1039C != null) {
                this.f1039C.onDismiss();
            }
            this.f1048L = false;
        }
        super.dismiss();
    }

    public final void m1085e() {
        m1058p();
        update(this.f1069r, this.f1070s, this.f1071t, this.f1072u, true);
    }

    public final void m1086e(View view) {
        if (view instanceof C0174B) {
            C0174B c0174b = (C0174B) view;
            ViewGroup viewGroup = (ViewGroup) c0174b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            c0174b.m142d(true);
            this.f1056e.addView(view);
            this.f1056e.setVisibility(0);
        }
    }

    public final void m1087e(boolean z) {
        if (this.f1053Q != z) {
            this.f1053Q = z;
            int indexOfChild;
            if (this.f1053Q) {
                indexOfChild = this.f1063l.indexOfChild(this.f1062k);
                this.f1063l.removeView(this.f1062k);
                this.f1054a.addView(this.f1062k);
                this.f1063l.addView(this.f1054a, indexOfChild);
                m1059q();
                return;
            }
            indexOfChild = this.f1063l.indexOfChild(this.f1054a);
            this.f1063l.removeView(this.f1054a);
            this.f1062k.setLayoutParams(this.f1075x);
            this.f1054a.removeView(this.f1062k);
            this.f1063l.addView(this.f1062k, indexOfChild, this.f1075x);
            m1059q();
        }
    }

    public final void m1088f() {
        this.f1062k.removeAllViews();
    }

    public final void m1089f(View view) {
        if (view != this.f1062k) {
            this.f1054a.clearDisappearingChildren();
            this.f1054a.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.f1062k = (LinearLayout) view;
            this.f1054a.addView(view);
        }
    }

    public final void m1090g() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) KonyMain.getActContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f1047K = (int) (((float) displayMetrics.widthPixels) * this.f1059h);
        setWidth(this.f1047K);
    }

    public final void m1091g(View view) {
        if (this.f1055d != view) {
            m1057j(view);
            int indexOfChild = this.f1063l.indexOfChild(this.f1055d);
            this.f1063l.removeViewAt(indexOfChild);
            this.f1063l.addView(view, indexOfChild);
            this.f1055d = (LinearLayout) view;
        }
    }

    public final void m1092h() {
        if (this.f1061j != null) {
            this.f1063l.setBackgroundDrawable(this.f1061j);
        }
    }

    public final void m1093h(View view) {
        if (this.f1056e != view) {
            m1057j(view);
            int indexOfChild = this.f1063l.indexOfChild(this.f1056e);
            this.f1063l.removeViewAt(indexOfChild);
            this.f1063l.addView(view, indexOfChild);
            this.f1056e = (LinearLayout) view;
        }
    }

    public final void m1094i() {
        this.f1054a.post(new cD(this));
    }

    public final void m1095i(View view) {
        if (this.f1065n != view) {
            m1057j(view);
            int indexOfChild = this.f1063l.indexOfChild(this.f1065n);
            this.f1063l.removeViewAt(indexOfChild);
            this.f1063l.addView(view, indexOfChild);
            this.f1065n = (LinearLayout) view;
        }
    }

    public final boolean isShowing() {
        return (this.f1048L || KonyMain.f3656d < 11) ? super.isShowing() : this.f1048L;
    }

    public final void m1096j() {
        int i = 0;
        if (this.f1062k != null) {
            i = this.f1062k.getChildCount();
        }
        if (i > 0) {
            m1059q();
            dB dBVar = this.f1060i;
            m1092h();
            m1058p();
            update(this.f1069r, this.f1070s, this.f1071t, this.f1072u, true);
        }
    }

    public final View m1097k() {
        return this.f1055d;
    }

    public final View m1098l() {
        return this.f1056e;
    }

    public final View m1099m() {
        return this.f1065n;
    }

    public final void m1100n() {
        this.f1055d.removeAllViews();
    }

    public final void m1101o() {
        this.f1056e.removeAllViews();
    }
}
