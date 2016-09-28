package com.konylabs.api.ui;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

final class hk extends dh {
    private df f3012b;
    private ArrayList f3013c;
    private OnClickListener f3014d;
    private /* synthetic */ hg f3015e;

    hk(hg hgVar) {
        this.f3015e = hgVar;
        this.f3012b = (df) this.f3015e.f4423c;
        this.f3013c = new ArrayList();
        this.f3014d = new hl(this);
    }

    public final void m3346a() {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI", "***Cleaning LuaSegUI Adapter Views***");
        }
        Iterator it = this.f3013c.iterator();
        while (it.hasNext()) {
            ((eO) it.next()).cleanup();
        }
        this.f3013c.clear();
    }

    public final int getCount() {
        int size = this.f3015e.f4424d.size();
        Vector vector = this.f3015e.f4424d;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ho) vector.elementAt(i2)).f1526b.size();
        }
        return this.f3012b.m3149v() + i;
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return this.f3012b.m3132f(i) ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        hm hmVar;
        View w;
        View widget;
        dB n;
        dB p;
        Drawable p2;
        Drawable drawable;
        eO eOVar;
        Drawable drawable2;
        View widget2;
        Drawable stateListDrawable;
        Drawable drawable3 = null;
        Drawable drawable4 = null;
        int i3 = 0;
        if (this.f3015e.au) {
            i3 = this.f3012b.getSectionForPosition(i);
            if (i3 != -1) {
                i2 = i3 + 1;
                if (view != null) {
                    hmVar = new hm(this);
                    w = this.f3012b.m3150w();
                    eO eOVar2 = (eO) this.f3015e.ai.createClone();
                    widget = eOVar2.getWidget();
                    view = this.f3012b.m3093a(w, widget);
                    view.setLayoutParams(new LayoutParams(-1, -2));
                    widget.setOnClickListener(this.f3014d);
                    n = this.f3012b.m3141n();
                    p = this.f3012b.m3143p();
                    dB o = this.f3012b.m3142o();
                    dB r = this.f3012b.m3145r();
                    if (n != null) {
                        drawable3 = n.m1162p();
                    }
                    if (p != null) {
                        drawable4 = p.m1162p();
                    }
                    p2 = r == null ? r.m1162p() : o == null ? o.m1162p() : this.f3012b.m3144q().getConstantState().newDrawable();
                    drawable = drawable4;
                    drawable4 = drawable3;
                    drawable3 = new ColorDrawable(0);
                    eOVar = eOVar2;
                    drawable2 = drawable;
                } else {
                    hm hmVar2 = (hm) view.getTag();
                    View view2 = hmVar2.f3016b;
                    eO eOVar3 = hmVar2.f3017c;
                    Drawable drawable5 = hmVar2.f3019e;
                    drawable3 = hmVar2.f3020f;
                    drawable4 = hmVar2.f3021g;
                    Drawable drawable6 = hmVar2.f3018d;
                    widget2 = eOVar3.getWidget();
                    if (widget2 != ((ViewGroup) view).getChildAt(1)) {
                        ((ViewGroup) view).removeViewAt(1);
                        ((ViewGroup) view).addView(widget2);
                        widget2.setOnClickListener(this.f3014d);
                    }
                    p2 = drawable4;
                    drawable4 = drawable5;
                    eOVar = eOVar3;
                    w = view2;
                    drawable = drawable3;
                    drawable3 = drawable6;
                    widget = widget2;
                    hmVar = hmVar2;
                    drawable2 = drawable;
                }
                if (getItemViewType(i) != 0) {
                    df dfVar = this.f3012b;
                    df.m3087a(w, this.f3012b.m3127e(i));
                    w.setEnabled(false);
                    w.setVisibility(0);
                    widget.setVisibility(8);
                } else {
                    hn a = this.f3015e.m4688b(i - i2);
                    this.f3015e.ak = eOVar;
                    this.f3015e.m4707a(eOVar, hg.m4700d(this.f3015e), a.f1524b);
                    a.f1523a = eOVar;
                    this.f3013c.add(eOVar);
                    widget.setVisibility(0);
                    w.setVisibility(8);
                    int i4 = i - i2;
                    stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(df.f2875c, drawable3);
                    stateListDrawable.addState(df.f2877e, p2);
                    if (drawable2 != null || i4 % 2 == 0) {
                        stateListDrawable.addState(df.f2876d, drawable4);
                    } else {
                        stateListDrawable.addState(df.f2876d, drawable2);
                    }
                    widget.setBackgroundDrawable(stateListDrawable);
                }
                hmVar.a = i - i2;
                hmVar.f3017c = eOVar;
                hmVar.f3016b = w;
                hmVar.f3020f = drawable2;
                hmVar.f3019e = drawable4;
                hmVar.f3018d = drawable3;
                hmVar.f3021g = p2;
                view.setTag(hmVar);
                eOVar.getWidget().setTag(hmVar);
                return view;
            }
        }
        i2 = i3;
        if (view != null) {
            hm hmVar22 = (hm) view.getTag();
            View view22 = hmVar22.f3016b;
            eO eOVar32 = hmVar22.f3017c;
            Drawable drawable52 = hmVar22.f3019e;
            drawable3 = hmVar22.f3020f;
            drawable4 = hmVar22.f3021g;
            Drawable drawable62 = hmVar22.f3018d;
            widget2 = eOVar32.getWidget();
            if (widget2 != ((ViewGroup) view).getChildAt(1)) {
                ((ViewGroup) view).removeViewAt(1);
                ((ViewGroup) view).addView(widget2);
                widget2.setOnClickListener(this.f3014d);
            }
            p2 = drawable4;
            drawable4 = drawable52;
            eOVar = eOVar32;
            w = view22;
            drawable = drawable3;
            drawable3 = drawable62;
            widget = widget2;
            hmVar = hmVar22;
            drawable2 = drawable;
        } else {
            hmVar = new hm(this);
            w = this.f3012b.m3150w();
            eO eOVar22 = (eO) this.f3015e.ai.createClone();
            widget = eOVar22.getWidget();
            view = this.f3012b.m3093a(w, widget);
            view.setLayoutParams(new LayoutParams(-1, -2));
            widget.setOnClickListener(this.f3014d);
            n = this.f3012b.m3141n();
            p = this.f3012b.m3143p();
            dB o2 = this.f3012b.m3142o();
            dB r2 = this.f3012b.m3145r();
            if (n != null) {
                drawable3 = n.m1162p();
            }
            if (p != null) {
                drawable4 = p.m1162p();
            }
            if (r2 == null) {
                if (o2 == null) {
                }
            }
            drawable = drawable4;
            drawable4 = drawable3;
            drawable3 = new ColorDrawable(0);
            eOVar = eOVar22;
            drawable2 = drawable;
        }
        if (getItemViewType(i) != 0) {
            hn a2 = this.f3015e.m4688b(i - i2);
            this.f3015e.ak = eOVar;
            this.f3015e.m4707a(eOVar, hg.m4700d(this.f3015e), a2.f1524b);
            a2.f1523a = eOVar;
            this.f3013c.add(eOVar);
            widget.setVisibility(0);
            w.setVisibility(8);
            int i42 = i - i2;
            stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(df.f2875c, drawable3);
            stateListDrawable.addState(df.f2877e, p2);
            if (drawable2 != null) {
            }
            stateListDrawable.addState(df.f2876d, drawable4);
            widget.setBackgroundDrawable(stateListDrawable);
        } else {
            df dfVar2 = this.f3012b;
            df.m3087a(w, this.f3012b.m3127e(i));
            w.setEnabled(false);
            w.setVisibility(0);
            widget.setVisibility(8);
        }
        hmVar.a = i - i2;
        hmVar.f3017c = eOVar;
        hmVar.f3016b = w;
        hmVar.f3020f = drawable2;
        hmVar.f3019e = drawable4;
        hmVar.f3018d = drawable3;
        hmVar.f3021g = p2;
        view.setTag(hmVar);
        eOVar.getWidget().setTag(hmVar);
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }
}
