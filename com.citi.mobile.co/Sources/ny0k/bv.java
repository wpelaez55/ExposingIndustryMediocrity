package ny0k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.dB;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class bv extends LinearLayout implements bg, bh {
    private static final int f3395J;
    public static final int[] f3396c;
    public static final int[] f3397d;
    public static final int[] f3398e;
    public static final int[] f3399f;
    private boolean f3400A;
    private boolean f3401B;
    private View f3402C;
    private bx f3403D;
    private String f3404E;
    private String f3405F;
    private int f3406G;
    private bz f3407H;
    private boolean f3408I;
    private ViewPager f3409g;
    private LayoutParams f3410h;
    private LayoutParams f3411i;
    private boolean f3412j;
    private Drawable f3413k;
    private Drawable f3414l;
    private Context f3415m;
    private int f3416n;
    private by f3417o;
    private LinearLayout f3418p;
    private int f3419q;
    private int f3420r;
    private Rect f3421s;
    private dB f3422t;
    private dB f3423u;
    private dB f3424v;
    private dB f3425w;
    private cg f3426x;
    private bj f3427y;
    private cj f3428z;

    static {
        f3395J = dB.m1116r(5);
        f3396c = new int[]{16842910};
        f3397d = new int[]{16842919};
        f3398e = new int[]{16842908};
        f3399f = new int[]{16842913};
    }

    public bv(Context context, boolean z) {
        super(context);
        this.f3415m = context;
        setOrientation(1);
        this.f3409g = new bw(this, context, context);
        this.f3417o = new by(this);
        this.f3409g.setOnPageChangeListener(this.f3417o);
        this.f3410h = new LayoutParams(-1, z ? -1 : -2);
        this.f3408I = z;
        this.f3411i = new LayoutParams(-1, 0, 1.0f);
        KonyMain.getActContext();
        this.f3413k = KonyMain.m4083a("page_indicator_active.png");
        KonyMain.getActContext();
        this.f3414l = KonyMain.m4083a("page_indicator_inactive.png");
    }

    private void m3785c(int i) {
        int childCount = this.f3418p.getChildCount();
        int i2 = 0;
        while (i2 < i) {
            View imageView = new ImageView(this.f3415m);
            imageView.setImageDrawable(this.f3414l);
            imageView.setPadding(f3395J, 0, f3395J, 0);
            imageView.setTag(Integer.valueOf(childCount));
            imageView.setOnClickListener(this.f3407H);
            imageView.setContentDescription((i2 + 1) + " slash " + i);
            this.f3418p.addView(imageView, new LayoutParams(-2, -2));
            i2++;
            childCount++;
        }
    }

    private void m3790g() {
        int i = this.f3419q;
        int h = m3791h();
        if (h != i) {
            if (h > i) {
                m3785c(h - i);
            } else if (h < i) {
                i -= h;
                int childCount = this.f3418p.getChildCount();
                if (i <= childCount) {
                    this.f3418p.removeViews(childCount - i, i);
                } else {
                    this.f3418p.removeViews(0, childCount);
                }
            }
            this.f3419q = h;
        }
    }

    private int m3791h() {
        float intrinsicWidth = (float) this.f3414l.getIntrinsicWidth();
        int i = (int) (((float) ((getResources().getDisplayMetrics().widthPixels - (this.f3410h.leftMargin + this.f3410h.rightMargin)) - (this.f3421s != null ? this.f3421s.left + this.f3421s.right : 0))) / (((float) (f3395J * 2)) + intrinsicWidth));
        int floor = (int) Math.floor((double) (((float) this.f3413k.getIntrinsicWidth()) / intrinsicWidth));
        if (floor > 1) {
            i -= floor;
        }
        return i > this.f3416n ? this.f3416n : i;
    }

    public final dB m3801a() {
        return this.f3422t;
    }

    public final void m3802a(int i) {
        this.f3416n = i;
        if (this.f3418p != null) {
            m3790g();
            if (this.f3420r < this.f3419q) {
                ((ImageView) this.f3418p.getChildAt(this.f3420r)).setImageDrawable(this.f3413k);
            }
        }
    }

    public final void m3803a(View view) {
    }

    public final void m3804a(dB dBVar) {
        setBackgroundDrawable(dBVar != null ? dBVar.m1127b(true) : null);
    }

    public final void m3805a(String str) {
        this.f3404E = str;
        if (this.f3403D != null) {
            this.f3403D.m3844a(str);
        }
    }

    public final void m3806a(LinkedHashMap linkedHashMap) {
        if (this.f3403D != null && linkedHashMap != null && !linkedHashMap.isEmpty() && this.f3406G == 1) {
            Iterator it = linkedHashMap.keySet().iterator();
            if (it.hasNext()) {
                this.f3403D.f3436a = ((Integer) linkedHashMap.get(it.next())).intValue();
            }
        }
    }

    public final void m3807a(bj bjVar) {
        this.f3427y = bjVar;
    }

    public final void m3808a(bx bxVar) {
        this.f3402C = null;
        this.f3403D = bxVar;
        this.f3409g.setAdapter(bxVar);
    }

    public final void m3809a(cg cgVar) {
        this.f3426x = cgVar;
    }

    public final void m3810a(cj cjVar) {
        this.f3428z = cjVar;
    }

    public final void m3811a(int[] iArr) {
        this.f3410h.leftMargin = iArr[0];
        this.f3410h.topMargin = iArr[1];
        this.f3410h.rightMargin = iArr[2];
        this.f3410h.bottomMargin = iArr[3];
    }

    public final dB m3812b() {
        return this.f3423u;
    }

    public final void m3813b(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.f3409g.getCurrentItem() != i) {
            this.f3400A = true;
            this.f3409g.setCurrentItem(i, false);
        }
    }

    public final void m3814b(int i, int i2) {
        if (this.f3428z != null) {
            int a = this.f3428z.m2168a(i, i2);
            if (a != -1) {
                if (this.f3401B) {
                    this.f3403D.f3436a = a;
                }
                if (a != this.f3409g.getCurrentItem()) {
                    this.f3400A = true;
                    this.f3409g.setCurrentItem(a, true);
                }
            }
        }
    }

    public final void m3815b(View view) {
    }

    public final void m3816b(dB dBVar) {
        this.f3422t = dBVar;
    }

    public final void m3817b(String str) {
        this.f3405F = str;
        if (this.f3403D != null) {
            this.f3403D.m3845b(str);
        }
    }

    public final void m3818b(boolean z) {
        if (!z) {
            if (this.f3418p != null) {
                removeView(this.f3418p);
            }
            this.f3418p = null;
            this.f3407H = null;
        } else if (this.f3418p == null) {
            this.f3407H = new bz(this);
            this.f3418p = new LinearLayout(this.f3415m);
            this.f3418p.setGravity(17);
            this.f3418p.setLayoutParams(new LayoutParams(-1, -2));
            int r = dB.m1116r(2);
            this.f3418p.setPadding(0, r, 0, r);
            this.f3419q = m3791h();
            m3785c(this.f3419q);
            if (this.f3420r < this.f3419q) {
                ((ImageView) this.f3418p.getChildAt(this.f3420r)).setImageDrawable(this.f3413k);
            }
            if (this.f3412j && this.f3418p != null) {
                addView(this.f3418p);
            }
        }
    }

    public final void m3819b(int[] iArr) {
        this.f3421s = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void b_(boolean z) {
        this.f3401B = z;
        if (this.f3403D != null) {
            this.f3403D.f3439d = z;
        }
        if (!z && this.f3402C != null) {
            this.f3402C.setSelected(false);
            this.f3402C = null;
        }
    }

    public final dB m3820c() {
        return this.f3424v;
    }

    public final void m3821c(int i, int i2) {
    }

    public final void m3822c(dB dBVar) {
        this.f3423u = dBVar;
    }

    public final void m3823c(String str) {
        if (str == null) {
            str = "page_indicator_active.png";
        }
        KonyMain.getActContext();
        this.f3413k = KonyMain.m4083a(str);
        if (this.f3418p != null) {
            m3790g();
            if (this.f3420r < this.f3418p.getChildCount()) {
                ((ImageView) this.f3418p.getChildAt(this.f3420r)).setImageDrawable(this.f3413k);
            }
        }
    }

    public final dB m3824d() {
        return this.f3425w;
    }

    public final void m3825d(int i, int i2) {
        m3814b(i, i2);
    }

    public final void m3826d(dB dBVar) {
        this.f3424v = dBVar;
    }

    public final void m3827d(String str) {
        if (str == null) {
            str = "page_indicator_inactive.png";
        }
        KonyMain.getActContext();
        this.f3414l = KonyMain.m4083a(str);
        if (this.f3418p != null) {
            m3790g();
            for (int i = 0; i < this.f3419q; i++) {
                if (i != this.f3420r) {
                    ((ImageView) this.f3418p.getChildAt(i)).setImageDrawable(this.f3414l);
                }
            }
        }
    }

    public final void m3828e() {
        if (this.f3418p != null) {
            this.f3418p.removeAllViews();
        }
        this.f3419q = 0;
        this.f3420r = 0;
    }

    public final void m3829e(dB dBVar) {
    }

    public final void e_(int i) {
        super.setVisibility(i);
    }

    public final int m3830f() {
        return this.f3420r;
    }

    public final void m3831f(int i) {
        this.f3410h.height = i;
        setLayoutParams(this.f3410h);
    }

    public final void m3832f(dB dBVar) {
        this.f3425w = dBVar;
    }

    public final void m3833g(int i) {
        this.f3406G = i;
    }

    public final View m3834k() {
        return this;
    }

    public final void m3835l() {
        if (!this.f3412j) {
            setLayoutParams(this.f3410h);
            if (this.f3421s != null) {
                setPadding(this.f3421s.left, this.f3421s.top, this.f3421s.right, this.f3421s.bottom);
            }
            addView(this.f3409g, this.f3411i);
            if (this.f3418p != null) {
                addView(this.f3418p);
            }
            this.f3412j = true;
        }
    }

    public final void m3836m() {
    }

    public final void m3837n() {
    }

    public final void m3838o() {
    }

    public final int m3839p() {
        return 0;
    }

    public final void m3840q() {
    }

    public final void m3841r() {
    }

    public final int m3842s() {
        return this.f3406G;
    }
}
