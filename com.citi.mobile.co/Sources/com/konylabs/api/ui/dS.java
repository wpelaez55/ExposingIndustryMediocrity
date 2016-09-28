package com.konylabs.api.ui;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;

final class dS extends PagerAdapter {
    private /* synthetic */ dO f2851a;

    dS(dO dOVar) {
        this.f2851a = dOVar;
    }

    public final void destroyItem(View view, int i, Object obj) {
        if (KonyMain.f3657e) {
            Log.d("KonyTabPager", "************ destroyItem page=" + i);
        }
        if (obj instanceof C0219u) {
            C0219u c0219u = (C0219u) obj;
            c0219u.removeAllViews();
            this.f2851a.f2845k.add(c0219u);
        }
        ((ViewPager) view).removeView((View) obj);
        ((dT) this.f2851a.f2835a.get(i)).f1136a.m1185b();
    }

    public final int getCount() {
        return this.f2851a.f2835a.size();
    }

    public final /* synthetic */ CharSequence getPageTitle(int i) {
        return ((dT) this.f2851a.f2835a.get(i)).f1138c;
    }

    public final Object instantiateItem(View view, int i) {
        if (KonyMain.f3657e) {
            Log.d("KonyTabPager", "************** instantiateItem page=" + i);
        }
        dT dTVar = (dT) this.f2851a.f2835a.get(i);
        int measuredHeight = view.getMeasuredHeight();
        View linearLayout = new LinearLayout(KonyMain.getActivityContext());
        linearLayout.addView(dTVar.f1136a.m1184a(), new LayoutParams(-1, -1));
        if (this.f2851a.f2850p || !dTVar.f1136a.m1186c()) {
            View view2 = (C0219u) this.f2851a.f2845k.poll();
            if (view2 == null) {
                view2 = new C0219u(KonyMain.getActContext());
                view2.setScrollContainer(true);
                view2.m1577a(cW.f2718i);
                view2.setLayoutParams(new ViewPager.LayoutParams());
            }
            view2.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            ((ViewPager) view).addView(view2);
            return view2;
        }
        linearLayout.setMinimumHeight(measuredHeight);
        ((ViewPager) view).addView(linearLayout);
        return linearLayout;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
