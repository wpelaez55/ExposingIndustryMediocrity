package ny0k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.dB;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.LinkedHashMap;

public final class bq extends ListView implements aF, bg, bh {
    public static final int[] f3352c;
    public static final int[] f3353d;
    public static final int[] f3354e;
    private LinearLayout f3355A;
    private LinearLayout f3356B;
    private TextView f3357C;
    private LinearLayout f3358D;
    private LinearLayout f3359E;
    private TextView f3360F;
    private dB f3361G;
    private dB f3362H;
    private Drawable f3363I;
    private Drawable f3364J;
    private String f3365K;
    private String f3366L;
    private String f3367M;
    private String f3368N;
    private int f3369O;
    private int f3370P;
    private float f3371Q;
    private int f3372R;
    private float f3373S;
    private cg f3374f;
    private dB f3375g;
    private dB f3376h;
    private dB f3377i;
    private dB f3378j;
    private dB f3379k;
    private Drawable f3380l;
    private int f3381m;
    private int[] f3382n;
    private boolean f3383o;
    private LayoutParams f3384p;
    private View f3385q;
    private boolean f3386r;
    private int f3387s;
    private OnScrollListener f3388t;
    private bu f3389u;
    private cj f3390v;
    private int f3391w;
    private int f3392x;
    private aG f3393y;
    private aH f3394z;

    static {
        f3352c = new int[]{16842913};
        f3353d = new int[]{16842910};
        f3354e = new int[]{16842919};
        new int[1][0] = 16842908;
    }

    public bq(Context context) {
        super(context);
        this.f3381m = -1;
        this.f3382n = new int[4];
        this.f3383o = false;
        this.f3387s = 0;
        this.f3388t = new bs(this);
        this.f3391w = -1;
        this.f3365K = "Pull to refresh";
        this.f3366L = "Release to refresh";
        this.f3367M = "Push to refresh";
        this.f3368N = "Release to refresh";
        this.f3369O = 0;
        this.f3370P = 0;
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setClipChildren(false);
        setMinimumHeight(dB.m1116r(320));
        setHeaderDividersEnabled(false);
        setFooterDividersEnabled(false);
        setCacheColorHint(0);
        this.f3384p = new LayoutParams(-1, -1);
        LayoutParams layoutParams = this.f3384p;
        LayoutParams layoutParams2 = this.f3384p;
        LayoutParams layoutParams3 = this.f3384p;
        this.f3384p.bottomMargin = 2;
        layoutParams3.rightMargin = 2;
        layoutParams2.topMargin = 2;
        layoutParams.leftMargin = 2;
        this.f3372R = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void m3701C() {
        if (this.f3357C == null) {
            return;
        }
        if (this.f3363I != null) {
            this.f3357C.setBackgroundDrawable(this.f3363I);
            if (this.f3361G != null) {
                this.f3357C.setTextColor(this.f3361G.m1156m());
                this.f3361G.m1132c(this.f3357C);
                return;
            }
            return;
        }
        this.f3357C.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
    }

    private void m3702D() {
        if (this.f3360F == null) {
            return;
        }
        if (this.f3364J != null) {
            this.f3360F.setBackgroundDrawable(this.f3364J);
            if (this.f3362H != null) {
                this.f3360F.setTextColor(this.f3362H.m1156m());
                this.f3362H.m1132c(this.f3360F);
                return;
            }
            return;
        }
        this.f3360F.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
    }

    private void m3706b(TextView textView) {
        if (textView != null) {
            textView.setTextColor(getResources().getColor(17170444));
            textView.setTextSize(14.0f);
            textView.setTypeface(Typeface.DEFAULT, 0);
            textView.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
        }
    }

    private void m3707e(View view) {
        if (view != null) {
            this.f3385q = view;
            measureChild(this.f3385q, MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            this.f3385q.layout(0, 0, this.f3385q.getMeasuredWidth(), this.f3385q.getMeasuredHeight());
        }
    }

    private static void m3708f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? MeasureSpec.makeMeasureSpec(i, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void m3709j(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f3356B.getLayoutParams();
        marginLayoutParams.setMargins(0, i, 0, 0);
        this.f3356B.setLayoutParams(marginLayoutParams);
        requestLayout();
    }

    private void m3710k(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f3359E.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, 0, i);
        this.f3359E.setLayoutParams(marginLayoutParams);
        requestLayout();
    }

    public final void m3711A() {
        setOnScrollListener(this.f3388t);
    }

    public final void m3712B() {
        this.f3385q = null;
        this.f3391w = -1;
        setOnScrollListener(null);
    }

    public final void m3713a() {
        if (this.f3393y != null) {
            this.f3393y.m1885c();
        }
    }

    public final void m3714a(int i) {
        CharSequence charSequence = BuildConfig.FLAVOR;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                charSequence = this.f3365K;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                charSequence = this.f3366L;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                charSequence = "Refresh .. ";
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIDockListView2", " Pull to Refresh callback");
                }
                this.f3394z.m1898a(0);
                break;
        }
        this.f3357C.setText(charSequence);
    }

    public final void m3715a(int i, int i2, int i3, boolean z) {
        this.f3381m = i3;
        if (this.f3374f != null) {
            this.f3374f.m2163a(i, i2, z);
        }
    }

    public final void m3716a(View view) {
        this.f3381m = ((ck) view.getTag()).f2285l;
    }

    public final void m3717a(BaseAdapter baseAdapter) {
        if (this.f3387s > 0 && this.f3385q != null) {
            this.f3385q.setVisibility(8);
        }
        setDescendantFocusability(AccessibilityNodeInfoCompat.ACTION_EXPAND);
        super.setAdapter(baseAdapter);
    }

    public final void m3718a(TextView textView) {
        if (this.f3375g != null) {
            this.f3375g.m1129b(textView);
            return;
        }
        textView.setTextSize((float) dB.m1116r(10));
        textView.setTypeface(Typeface.SANS_SERIF, 1);
        textView.setTextColor(-1);
    }

    public final void m3719a(dB dBVar) {
        if (dBVar != null) {
            setBackgroundDrawable(dBVar.m1127b(true));
        } else {
            setBackgroundDrawable(null);
        }
    }

    public final void m3720a(String str) {
    }

    public final void m3721a(LinkedHashMap linkedHashMap) {
    }

    public final void m3722a(aG aGVar) {
        this.f3393y = aGVar;
        Context appContext = KonyMain.getAppContext();
        this.f3355A = new LinearLayout(appContext);
        this.f3355A.setId(549);
        this.f3355A.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        this.f3356B = new LinearLayout(appContext);
        this.f3356B.setId(550);
        this.f3356B.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        this.f3357C = new TextView(appContext);
        this.f3357C.setId(551);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        this.f3357C.setLayoutParams(layoutParams);
        this.f3357C.setGravity(19);
        this.f3357C.setPadding(25, 3, 0, 3);
        if (this.f3363I != null) {
            m3701C();
        } else {
            m3706b(this.f3357C);
        }
        this.f3356B.addView(this.f3357C);
        this.f3355A.addView(this.f3356B);
        this.f3358D = new LinearLayout(appContext);
        this.f3358D.setId(552);
        this.f3358D.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        this.f3359E = new LinearLayout(appContext);
        this.f3359E.setId(553);
        this.f3359E.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
        this.f3359E.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        this.f3360F = new TextView(appContext);
        this.f3360F.setId(554);
        this.f3360F.setLayoutParams(layoutParams);
        this.f3360F.setGravity(19);
        this.f3360F.setPadding(25, 3, 0, 3);
        if (this.f3364J != null) {
            m3702D();
        } else {
            m3706b(this.f3360F);
        }
        this.f3359E.addView(this.f3360F);
        this.f3358D.addView(this.f3359E);
        this.f3394z = new aH(this);
        aH aHVar = this.f3394z;
        this.f3394z.m1902c(this.f3369O);
        this.f3394z.m1903d(this.f3370P);
        this.f3394z.m1898a(0);
        this.f3394z.m1900b(4);
    }

    public final void m3723a(bu buVar) {
        this.f3389u = buVar;
    }

    public final void m3724a(cg cgVar) {
        this.f3374f = cgVar;
    }

    public final void m3725a(cj cjVar) {
        this.f3390v = cjVar;
    }

    public final void m3726a(int[] iArr) {
        for (int i : iArr) {
            if (KonyMain.f3657e) {
                Log.d("PageView", "margin = " + i);
            }
        }
        this.f3384p.leftMargin = iArr[0];
        this.f3384p.topMargin = iArr[1];
        this.f3384p.rightMargin = iArr[2];
        this.f3384p.bottomMargin = iArr[3];
    }

    public final void m3727b() {
        if (this.f3393y != null) {
            this.f3393y.m1886d();
        }
    }

    public final void m3728b(int i) {
        CharSequence charSequence = BuildConfig.FLAVOR;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                charSequence = this.f3367M;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                charSequence = this.f3368N;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                charSequence = "Refresh .. ";
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIDockListView2", " Push to Refresh callback");
                }
                this.f3394z.m1900b(4);
                break;
        }
        this.f3360F.setText(charSequence);
    }

    public final void m3729b(int i, int i2) {
        if (this.f3390v == null) {
            this.f3381m = -1;
            return;
        }
        this.f3381m = this.f3390v.m2168a(i, i2);
        this.f3392x = this.f3390v.m2171b(i, i2);
        int i3 = this.f3392x;
        setSelection(i3);
        if (this.f3389u != null) {
            invalidateViews();
            postDelayed(new bt(this, i3), 200);
        }
    }

    public final void m3730b(View view) {
        this.f3381m = ((ck) view.getTag()).f2285l;
    }

    public final void m3731b(dB dBVar) {
        this.f3377i = dBVar;
    }

    public final void m3732b(String str) {
    }

    public final void m3733b(boolean z) {
    }

    public final void m3734b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            this.f3382n[i] = iArr[i];
        }
    }

    public final void b_(boolean z) {
    }

    public final void m3735c() {
        if (this.f3393y != null) {
            this.f3393y.m1883a();
        }
        if (KonyMain.f3657e) {
            Log.d("KonySegUIDockListView2", " Reaching Begining callback");
        }
    }

    public final void m3736c(int i) {
        if (this.f3393y.m1889g() && i != 0) {
            if (KonyMain.f3657e) {
                Log.d("KonySegUIDockListView2", " -------- diff value --- " + i);
            }
            int i2 = (-i) - this.f3369O;
            if (KonyMain.f3657e) {
                Log.d("KonySegUIDockListView2", " -------- new margin value --- " + i2);
            }
            m3709j(i2);
        }
    }

    public final void m3737c(int i, int i2) {
        setDivider(new ColorDrawable(i2));
        setDividerHeight(dB.m1116r(i));
    }

    public final void m3738c(View view) {
        addHeaderView(view, null, false);
    }

    public final void m3739c(dB dBVar) {
        this.f3376h = dBVar;
        if (!this.f3383o) {
            return;
        }
        if (dBVar != null) {
            setSelector(this.f3376h.m1162p());
        } else {
            setSelector(this.f3380l);
        }
    }

    public final void m3740c(String str) {
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.f3365K = str2;
                return;
            }
        }
        this.f3365K = "Pull to refresh";
    }

    public final void m3741d() {
        if (this.f3393y != null) {
            this.f3393y.m1884b();
        }
        if (KonyMain.f3657e) {
            Log.d("KonySegUIDockListView2", " Reaching End callback");
        }
    }

    public final void m3742d(int i) {
        if (this.f3393y.m1890h()) {
            m3710k(i);
        }
    }

    public final void m3743d(int i, int i2) {
        m3729b(i, i2);
    }

    public final void m3744d(View view) {
        addFooterView(view, null, false);
    }

    public final void m3745d(dB dBVar) {
        this.f3378j = dBVar;
    }

    public final void m3746d(String str) {
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.f3367M = str2;
                return;
            }
        }
        this.f3367M = "Push to refresh";
    }

    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f3386r && this.f3385q != null) {
            drawChild(canvas, this.f3385q, getDrawingTime());
        }
    }

    public final int m3747e() {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (firstVisiblePosition == 0) {
            if (this.f3393y.m1889g()) {
                return getChildAt(1) != null ? 0 : -1;
            } else {
                View childAt = getChildAt(0);
                return childAt != null ? childAt.getTop() : 0;
            }
        } else if (firstVisiblePosition != 1) {
            return -1;
        } else {
            m3760i();
            return 1;
        }
    }

    public final void m3748e(dB dBVar) {
        this.f3375g = dBVar;
    }

    public final void m3749e(String str) {
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.f3366L = str2;
                return;
            }
        }
        this.f3366L = "Release to refresh";
    }

    public final void e_(int i) {
        super.setVisibility(i);
    }

    public final void m3750f(int i) {
        this.f3384p.height = i;
        setLayoutParams(this.f3384p);
        post(new br(this));
    }

    public final void m3751f(dB dBVar) {
        this.f3379k = dBVar;
    }

    public final void m3752f(String str) {
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.f3368N = str2;
                return;
            }
        }
        this.f3368N = "Release to refresh";
    }

    public final boolean m3753f() {
        return getFirstVisiblePosition() == 0;
    }

    public final void m3754g(int i) {
    }

    public final void m3755g(dB dBVar) {
        this.f3361G = dBVar;
        if (dBVar != null) {
            this.f3363I = dBVar.m1162p();
            m3701C();
        } else {
            this.f3363I = null;
            m3706b(this.f3357C);
        }
        m3708f(this.f3356B);
        this.f3369O = this.f3356B.getMeasuredHeight();
        if (this.f3394z != null) {
            this.f3394z.m1902c(this.f3369O);
        }
    }

    public final boolean m3756g() {
        if (this.f3355A.getHeight() > 0) {
            return false;
        }
        int firstVisiblePosition = getFirstVisiblePosition() + getChildCount();
        int count = getCount();
        if (firstVisiblePosition == count) {
            if (!this.f3393y.m1890h()) {
                return true;
            }
            if (this.f3358D.getVisibility() == 0) {
                return true;
            }
            if (getAdapter().getView(firstVisiblePosition - 1, null, this).getBottom() != getBottom() - getTop()) {
                return false;
            }
            this.f3358D.setVisibility(0);
            return true;
        } else if (!this.f3393y.m1890h() || firstVisiblePosition + 1 < count) {
            return false;
        } else {
            if (this.f3358D.getVisibility() == 4) {
                this.f3358D.setVisibility(0);
            }
            return true;
        }
    }

    public final int m3757h() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.getHeight() : -1;
    }

    public final void m3758h(int i) {
        this.f3387s += i;
    }

    public final void m3759h(dB dBVar) {
        this.f3362H = dBVar;
        if (dBVar != null) {
            this.f3364J = dBVar.m1162p();
            m3702D();
        } else {
            this.f3364J = null;
            m3706b(this.f3360F);
        }
        m3708f(this.f3359E);
        this.f3370P = this.f3359E.getMeasuredHeight();
        if (this.f3394z != null) {
            this.f3394z.m1903d(this.f3370P);
        }
    }

    public final void m3760i() {
        m3709j(-(this.f3356B.getHeight() + this.f3369O));
        if (this.f3393y.m1889g() && m3757h() > this.f3369O && getFirstVisiblePosition() == 0) {
            setSelection(0);
        }
    }

    public final void m3761i(int i) {
        if (i < 0 || this.f3389u == null) {
            this.f3386r = false;
            return;
        }
        boolean z;
        int i2 = i + 1;
        int count = getCount();
        if (i2 < 0 || count == 0) {
            z = false;
        } else {
            if (i2 < count) {
                if (this.f3390v.m2167a(i2) == -1) {
                    z = false;
                } else {
                    cj cjVar = this.f3390v;
                    count = (cjVar.f2281a == null || cjVar.f2281a.size() <= 0) ? -1 : ((bH) cjVar.f2281a.get(i2)).f2133b;
                    if (count != -1 && i2 == count) {
                        z = true;
                    }
                }
            }
            z = true;
        }
        switch (z) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.f3386r = false;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.f3389u != null) {
                    count = this.f3390v.m2167a(i);
                    if (this.f3391w != count) {
                        View a = this.f3389u.m2091a(i);
                        if (a != null) {
                            m3707e(a);
                        }
                    } else if (!(this.f3385q == null || this.f3385q.getTop() == 0)) {
                        this.f3385q.layout(0, 0, this.f3385q.getMeasuredWidth(), this.f3385q.getMeasuredHeight());
                    }
                    this.f3391w = count;
                    this.f3386r = true;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.f3389u != null) {
                    View a2;
                    if (this.f3385q == null) {
                        a2 = this.f3389u.m2091a(i);
                        if (a2 != null) {
                            m3707e(a2);
                            this.f3386r = true;
                        }
                    }
                    a2 = getChildAt(0);
                    if (a2 != null) {
                        int bottom = a2.getBottom();
                        count = this.f3385q != null ? this.f3385q.getHeight() : 0;
                        count = bottom < count ? bottom - count : 0;
                        bottom = this.f3390v.m2167a(i);
                        if (this.f3391w != bottom) {
                            View a3 = this.f3389u.m2091a(i);
                            if (a3 != null) {
                                m3707e(a3);
                            }
                        }
                        if (!(this.f3385q == null || this.f3385q.getTop() == count)) {
                            this.f3385q.layout(0, count, this.f3385q.getMeasuredWidth(), this.f3385q.getMeasuredHeight() + count);
                        }
                        this.f3391w = bottom;
                        this.f3386r = true;
                    }
                }
            default:
        }
    }

    public final void m3762j() {
        m3710k(-(this.f3359E.getHeight() + this.f3370P));
        this.f3358D.setVisibility(4);
    }

    public final View m3763k() {
        return this;
    }

    public final void m3764l() {
        if (!this.f3383o) {
            setLayoutParams(this.f3384p);
            this.f3380l = getSelector();
            if (this.f3376h != null) {
                setSelector(this.f3376h.m1162p());
            }
            this.f3383o = true;
        }
    }

    public final void m3765m() {
        this.f3387s = 0;
        m3712B();
        setOnItemClickListener(null);
        setOnItemSelectedListener(null);
        setOnFocusChangeListener(null);
        clearDisappearingChildren();
        if (this.f3363I != null) {
            this.f3363I.setCallback(null);
        }
        if (this.f3364J != null) {
            this.f3364J.setCallback(null);
        }
    }

    public final void m3766n() {
    }

    public final void m3767o() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        if (this.f3394z != null) {
            this.f3394z.m1899a(motionEvent);
        }
        if (this.f3393y != null && motionEvent.getAction() == 0) {
            this.f3393y.m1891i();
        }
        switch (motionEvent.getAction()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.f3371Q = y;
                this.f3373S = x;
                ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                int abs = (int) Math.abs(y - this.f3371Q);
                if (((int) Math.abs(x - this.f3373S)) > abs) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                } else if (abs > this.f3372R) {
                    return true;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f3391w = -1;
        m3761i(getFirstVisiblePosition());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3393y != null && motionEvent.getAction() == 0) {
            this.f3393y.m1891i();
        }
        if (this.f3394z != null) {
            this.f3394z.m1901b(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final int m3768p() {
        return this.f3381m;
    }

    public final void m3769q() {
    }

    public final void m3770r() {
    }

    public final int m3771s() {
        return 0;
    }

    public final void m3772t() {
        addHeaderView(this.f3355A);
        m3708f(this.f3356B);
        this.f3369O = this.f3356B.getMeasuredHeight();
        if (this.f3394z != null) {
            this.f3394z.m1902c(this.f3369O);
        }
        m3709j(-this.f3369O);
        this.f3387s++;
    }

    public final void m3773u() {
        addFooterView(this.f3358D);
        m3708f(this.f3359E);
        this.f3370P = this.f3359E.getMeasuredHeight();
        if (this.f3394z != null) {
            this.f3394z.m1903d(this.f3370P);
        }
        m3710k(-this.f3370P);
        this.f3358D.setVisibility(4);
    }

    public final dB m3774v() {
        return this.f3377i;
    }

    public final dB m3775w() {
        return this.f3376h;
    }

    public final dB m3776x() {
        return this.f3378j;
    }

    public final Drawable m3777y() {
        if (this.f3375g == null) {
            return new cA(180, new int[]{-16776961, -1}, new float[]{0.0f, 1.0f});
        }
        Drawable b = this.f3375g.m1127b(true);
        return b instanceof cA ? (cA) b : null;
    }

    public final dB m3778z() {
        return this.f3379k;
    }
}
