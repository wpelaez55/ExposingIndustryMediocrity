package ny0k;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager.LayoutParams;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0219u;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.bt;
import com.konylabs.api.ui.bw;
import com.konylabs.api.ui.cW;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

final class cc extends bx implements OnClickListener {
    private HashMap f3634f;
    private ViewGroup f3635g;
    private AccessibilityDelegateCompat f3636h;
    private /* synthetic */ cb f3637i;

    public cc(cb cbVar) {
        this.f3637i = cbVar;
        bv b = cbVar.ak;
        b.getClass();
        super(b);
        this.f3634f = new HashMap();
        cj cjVar = this.f3637i.c;
        this.f3636h = new cd(this);
    }

    public final void m4055a() {
        ArrayList arrayList = null;
        for (Object obj : this.f3634f.keySet()) {
            ArrayList arrayList2;
            eO eOVar = ((ce) ((ViewGroup) this.f3634f.get(obj)).getChildAt(0).getTag()).f3476c;
            eOVar.cleanup();
            if (eOVar.isJsObjectCloneCreated()) {
                arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                arrayList2.add(eOVar);
            } else {
                arrayList2 = arrayList;
            }
            arrayList = arrayList2;
        }
        if (this.f3635g != null) {
            int childCount = this.f3635g.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ce ceVar = (ce) ((ViewGroup) this.f3635g.getChildAt(i)).getChildAt(0).getTag();
                if (ceVar != null) {
                    eO eOVar2 = ceVar.f3476c;
                    eOVar2.cleanup();
                    if (eOVar2.isJsObjectCloneCreated()) {
                        arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList2.add(eOVar2);
                        arrayList = arrayList2;
                    }
                }
            }
        }
        if (arrayList != null) {
            cr.m2206a(this.f3637i, arrayList);
        }
        this.f3634f.clear();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (!this.f3637i.an) {
            bH e = this.f3637i.m4911e(i);
            if (e != null) {
                this.f3634f.put(Integer.valueOf(e.f2136e), obj);
            }
        }
        viewGroup.removeView((View) obj);
    }

    public final void finishUpdate(ViewGroup viewGroup) {
        this.f3637i.an = false;
    }

    public final int getCount() {
        return this.f3637i.b != null ? this.f3637i.ab ? this.f3637i.b.size() - this.f3637i.Y.size() : this.f3637i.b.size() : 0;
    }

    public final int getItemPosition(Object obj) {
        return this.f3637i.an ? -2 : ((ce) ((ViewGroup) obj).getChildAt(0).getTag()).l;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Drawable p;
        Drawable drawable;
        ce ceVar;
        Object obj;
        View view;
        this.f3635g = viewGroup;
        bH e = this.f3637i.m4911e(i);
        bI bIVar = (bI) e.f2132a;
        Hashtable hashtable = bIVar.d.map;
        ci ciVar = bIVar.f3318b;
        C0219u c0219u = (C0219u) this.f3634f.remove(Integer.valueOf(e.f2136e));
        Drawable drawable2 = null;
        Drawable stateListDrawable;
        if (c0219u == null) {
            eO eOVar = (eO) bIVar.c.createClone();
            eOVar.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, bIVar.e);
            this.f3637i.m4799a(eOVar, hashtable);
            View widget = eOVar.getWidget();
            widget.setOnClickListener(this);
            if (this.f3637i.S == 1 || this.f3637i.S == 2) {
                ViewCompat.setAccessibilityDelegate(widget, this.f3636h);
            }
            View c0219u2 = new C0219u(KonyMain.getActContext());
            c0219u2.setScrollContainer(true);
            c0219u2.m1577a(cW.f2718i);
            c0219u2.setLayoutParams(new LayoutParams());
            c0219u2.addView(widget);
            viewGroup.addView(c0219u2);
            ce ceVar2 = new ce(this);
            ceVar2.f3476c = eOVar;
            widget.setTag(ceVar2);
            dB a = (ciVar == null || ciVar.f2278b == null) ? this.f3637i.ak.m3801a() : ciVar.f2278b;
            dB c = this.f3637i.ak.m3820c();
            dB b = this.f3637i.ak.m3812b();
            dB d = this.f3637i.ak.m3824d();
            Drawable p2 = a != null ? a.m1162p() : null;
            Drawable p3 = c != null ? c.m1162p() : null;
            Drawable p4 = b != null ? b.m1162p() : null;
            p = d != null ? d.m1162p() : null;
            if (!(p2 == null && p4 == null && p == null)) {
                drawable2 = new StateListDrawable();
                drawable2.addState(bv.f3398e, p4);
                drawable2.addState(bv.f3399f, p != null ? p : p4);
                drawable2.addState(bv.f3397d, p != null ? p : p4);
                drawable2.addState(bv.f3396c, p2);
                ceVar2.f3475b = drawable2;
            }
            if (p3 != null) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(bv.f3398e, p4);
                stateListDrawable.addState(bv.f3399f, p != null ? p : p4);
                int[] iArr = bv.f3397d;
                if (p == null) {
                    p = p4;
                }
                stateListDrawable.addState(iArr, p);
                stateListDrawable.addState(bv.f3396c, p3);
                ceVar2.f3474a = stateListDrawable;
                drawable = stateListDrawable;
            } else {
                drawable = null;
            }
            p = drawable2;
            ceVar = ceVar2;
            obj = c0219u2;
            view = widget;
        } else {
            c0219u.scrollTo(0, 0);
            ce ceVar3 = (ce) c0219u.getChildAt(0).getTag();
            eO eOVar2 = ceVar3.f3476c;
            eOVar2.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, bIVar.e);
            this.f3637i.m4799a(eOVar2, hashtable);
            viewGroup.addView(c0219u);
            view = c0219u.getChildAt(0);
            stateListDrawable = ceVar3.f3475b;
            Drawable drawable3 = ceVar3.f3474a;
            ceVar = ceVar3;
            p = stateListDrawable;
            C0219u c0219u3 = c0219u;
            drawable = drawable3;
        }
        ceVar.j = e.f2134c;
        ceVar.k = e.f2135d;
        ceVar.l = i;
        if (drawable == null || i % 2 == 0) {
            view.setBackgroundDrawable(p);
        } else {
            view.setBackgroundDrawable(drawable);
        }
        view.setClickable(ciVar != null ? ciVar.f2277a : true);
        if (this.d && this.a == i) {
            view.setSelected(true);
            this.f3440e.f3402C = view;
        } else {
            view.setSelected(false);
        }
        if (this.f3637i.S == 1 || this.f3637i.S == 2) {
            ci ciVar2;
            if (ciVar == null || ciVar.f2279c == null) {
                ci h = this.f3637i.m4831h(bIVar.d);
                bIVar.f3318b = h;
                ciVar2 = h;
            } else {
                ciVar.f2279c = this.f3637i.V;
                ciVar2 = ciVar;
            }
            this.f3637i.V = null;
            ImageView imageView = (ImageView) ciVar2.f2279c;
            if (imageView != null) {
                String str = this.c;
                if (e.f2137f) {
                    str = this.b;
                }
                if (imageView instanceof bw) {
                    ((bw) imageView).m948c(str);
                } else if (imageView instanceof bt) {
                    ((bt) imageView).m908c(str);
                }
            }
        }
        return obj;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final void onClick(View view) {
        ck ckVar = (ck) view.getTag();
        int i = ckVar.f2283j;
        int i2 = ckVar.f2284k;
        int i3 = ckVar.f2285l;
        boolean a = this.f3637i.m4902a(i, i2);
        if (this.f3637i.S == 1 || this.f3637i.S == 2) {
            ImageView imageView;
            if (this.f3637i.S == 1) {
                int i4 = this.a;
                if (i4 >= 0) {
                    imageView = (ImageView) ((bI) this.f3637i.m4911e(i4).f2132a).f3318b.f2279c;
                    if (imageView instanceof bw) {
                        ((bw) imageView).m948c(this.c);
                    } else if (imageView instanceof bt) {
                        ((bt) imageView).m908c(this.c);
                    }
                }
            }
            imageView = (ImageView) ((bI) this.f3637i.m4911e(i3).f2132a).f3318b.f2279c;
            String str = this.c;
            if (a) {
                str = this.b;
            }
            if (imageView instanceof bw) {
                ((bw) imageView).m948c(str);
            } else if (imageView instanceof bt) {
                ((bt) imageView).m908c(str);
            }
        }
        this.a = i3;
        view.sendAccessibilityEvent(1);
        m3843a(view, i, i2, a);
    }
}
