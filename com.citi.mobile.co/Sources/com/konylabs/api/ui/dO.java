package com.konylabs.api.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public final class dO implements OnPageChangeListener, dK {
    private Vector f2835a;
    private ViewPager f2836b;
    private LinearLayout f2837c;
    private LayoutParams f2838d;
    private LinearLayout f2839e;
    private HorizontalScrollView f2840f;
    private int f2841g;
    private boolean f2842h;
    private String f2843i;
    private String f2844j;
    private Queue f2845k;
    private dM f2846l;
    private dN f2847m;
    private dS f2848n;
    private OnClickListener f2849o;
    private boolean f2850p;

    public dO(Context context, dM dMVar, dN dNVar) {
        this.f2835a = new Vector(5);
        this.f2836b = null;
        this.f2837c = null;
        this.f2838d = null;
        this.f2839e = null;
        this.f2840f = null;
        this.f2841g = 0;
        this.f2842h = true;
        this.f2843i = "page_indicator_active.png";
        this.f2844j = "page_indicator_inactive.png";
        this.f2845k = new LinkedList();
        this.f2846l = null;
        this.f2847m = null;
        this.f2848n = null;
        this.f2849o = new dQ(this);
        this.f2846l = dMVar;
        this.f2847m = dNVar;
        this.f2837c = new LinearLayout(context);
        this.f2837c.setGravity(17);
        this.f2837c.setOrientation(1);
        this.f2838d = new LayoutParams(-1, -1);
        this.f2837c.setLayoutParams(this.f2838d);
        this.f2836b = new ViewPager(context);
        this.f2836b.setOffscreenPageLimit(2);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
        this.f2848n = new dS(this);
        this.f2836b.setAdapter(this.f2848n);
        this.f2836b.setOnPageChangeListener(this);
        this.f2837c.addView(this.f2836b, layoutParams);
        this.f2837c.post(new dP(this));
    }

    private void m3028a() {
        if (this.f2842h && this.f2839e != null) {
            int childCount = this.f2839e.getChildCount();
            bw bwVar = new bw(KonyMain.getActContext());
            bwVar.setFocusable(true);
            bwVar.m948c(this.f2844j);
            bwVar.m941a(new int[]{dB.m1116r(5), dB.m1116r(5), dB.m1116r(5), dB.m1116r(5)});
            bwVar.setLayoutParams(new LayoutParams(-1, -2));
            bwVar.setOnClickListener(this.f2849o);
            bwVar.setTag(Integer.valueOf(childCount));
            bwVar.m946c();
            this.f2839e.addView(bwVar.m949d());
        }
    }

    private void m3030a(String str, int i) {
        if (this.f2842h && str != null) {
            LinearLayout linearLayout = (LinearLayout) this.f2839e.getChildAt(i);
            if (linearLayout != null) {
                bw bwVar = (bw) linearLayout.getChildAt(0);
                bwVar.m948c(str);
                bwVar.m959h();
            }
        }
    }

    private void m3032b(int i) {
        if (this.f2839e != null && this.f2843i != null && this.f2844j != null) {
            bw bwVar = (bw) ((LinearLayout) this.f2839e.getChildAt(i)).getChildAt(0);
            if (KonyMain.f3657e) {
                Log.d("KonyTabPager", "Setting focus for pageData = " + bwVar + " for position = " + i);
            }
            bwVar.m948c(this.f2843i);
            bwVar.m959h();
            bwVar.getLocationOnScreen(new int[2]);
            this.f2840f.requestChildFocus(bwVar, bwVar);
            if (this.f2841g != i && this.f2841g < this.f2839e.getChildCount()) {
                bwVar = (bw) ((LinearLayout) this.f2839e.getChildAt(this.f2841g)).getChildAt(0);
                if (KonyMain.f3657e) {
                    Log.d("KonyTabPager", "Removing focus for pageData = " + bwVar + " for position = " + this.f2841g);
                }
                bwVar.m948c(this.f2844j);
                bwVar.m959h();
                this.f2841g = i;
            }
        }
    }

    public final void m3037a(float f) {
    }

    public final void m3038a(int i) {
        this.f2837c.setVisibility(i);
    }

    public final void m3039a(dB dBVar, dB dBVar2, dB dBVar3) {
    }

    public final void m3040a(dT dTVar) {
        this.f2835a.add(dTVar);
        m3028a();
        this.f2848n.notifyDataSetChanged();
    }

    public final void m3041a(dT dTVar, int i) {
        this.f2836b.setAdapter(null);
        this.f2835a.add(i, dTVar);
        this.f2836b.setAdapter(this.f2848n);
        m3028a();
    }

    public final void m3042a(String str) {
        if (str != null && str.trim().length() > 0) {
            this.f2843i = str;
            if (this.f2842h && this.f2835a.size() > 0) {
                m3030a(str, this.f2841g);
            }
        }
    }

    public final void m3043a(boolean z) {
        int i = 0;
        this.f2842h = z;
        if (z) {
            if (this.f2839e == null) {
                Context actContext = KonyMain.getActContext();
                this.f2840f = new HorizontalScrollView(actContext);
                this.f2840f.setHorizontalScrollBarEnabled(false);
                ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                layoutParams.setMargins(dB.m1116r(3), dB.m1116r(5), dB.m1116r(3), dB.m1116r(5));
                this.f2839e = new LinearLayout(actContext);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(dB.m1116r(3), layoutParams2.topMargin, dB.m1116r(3), layoutParams2.bottomMargin);
                this.f2839e.setGravity(17);
                this.f2840f.addView(this.f2839e, layoutParams2);
                this.f2837c.addView(this.f2840f, layoutParams);
                while (i < this.f2835a.size()) {
                    m3028a();
                    i++;
                }
                if (this.f2835a.size() > 0) {
                    m3032b(this.f2841g);
                    this.f2836b.setCurrentItem(this.f2841g, true);
                }
            }
        } else if (this.f2840f != null) {
            this.f2837c.removeView(this.f2840f);
            this.f2839e = null;
            this.f2840f = null;
        }
    }

    public final void m3044a(int[] iArr) {
        ez.m1344a(iArr, this.f2837c, this.f2838d);
        this.f2837c.setLayoutParams(this.f2838d);
    }

    public final void m3045b(String str) {
        if (str != null && str.trim().length() > 0) {
            this.f2844j = str;
            int size = this.f2835a.size();
            if (this.f2842h && size > 0) {
                for (int i = 0; i < size; i++) {
                    if (i != this.f2841g) {
                        m3030a(str, i);
                    }
                }
            }
        }
    }

    public final void m3046b(boolean z) {
    }

    public final void m3047b(int[] iArr) {
        this.f2837c.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final int[] m3048b() {
        return new int[]{this.f2841g};
    }

    public final void m3049c() {
        this.f2836b.setAdapter(null);
        if (this.f2839e != null) {
            int size = this.f2835a.size();
            for (int i = 0; i < size; i++) {
                LinearLayout linearLayout = (LinearLayout) this.f2839e.getChildAt(i);
                if (linearLayout != null) {
                    ((bw) linearLayout.getChildAt(0)).m955f();
                }
            }
            this.f2839e.removeAllViews();
        }
    }

    public final void m3050c(String str) {
        Object obj = null;
        Iterator it = this.f2835a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((dT) it.next()).f1137b.equals(str)) {
                obj = 1;
                break;
            }
            i++;
        }
        if (obj != null) {
            m3053d(i);
        }
    }

    public final void m3051c(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            int i = iArr[0];
            if (iArr[0] >= this.f2835a.size()) {
                i = this.f2835a.size() - 1;
            }
            m3032b(i);
            this.f2836b.setCurrentItem(i, true);
        }
    }

    public final View m3052d() {
        return this.f2837c;
    }

    public final void m3053d(int i) {
        this.f2836b.setAdapter(null);
        this.f2835a.remove(i);
        m3030a(this.f2844j, this.f2841g);
        if (this.f2839e != null) {
            this.f2839e.removeViewAt(i);
        }
        this.f2836b.setAdapter(this.f2848n);
    }

    public final void m3054e() {
        this.f2837c.setFocusableInTouchMode(true);
        this.f2837c.requestFocus();
        this.f2837c.setFocusableInTouchMode(false);
    }

    public final void m3055e(int i) {
        this.f2850p = true;
        this.f2838d.height = i;
        this.f2837c.setLayoutParams(this.f2838d);
        this.f2837c.post(new dR(this));
    }

    public final void m3056f() {
        int size = this.f2835a.size();
        if (this.f2842h && size > 0) {
            for (int i = 0; i < size; i++) {
                if (i == this.f2841g) {
                    m3030a(this.f2843i, i);
                } else {
                    m3030a(this.f2844j, i);
                }
            }
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        if (this.f2846l != null) {
            this.f2846l.m1188a(i);
        }
        if (this.f2847m != null) {
            this.f2847m.m1190a(i);
        }
        m3032b(i);
    }
}
