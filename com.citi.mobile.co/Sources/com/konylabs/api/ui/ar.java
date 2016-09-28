package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;

final class ar extends BaseAdapter {
    private Context f588a;
    private /* synthetic */ aq f589b;

    public ar(aq aqVar, Context context) {
        this.f589b = aqVar;
        this.f588a = context;
    }

    public final int getCount() {
        return this.f589b.f2598h.size();
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        if (view == null || !this.f589b.f2606q) {
            view2 = view;
        } else {
            ((bw) view).m955f();
            view2 = null;
        }
        if (view2 == null) {
            view2 = new bw(this.f588a);
            if (this.f589b.f2594b != null) {
                view2.m936a(this.f589b.f2594b);
            }
            if (this.f589b.f2595c != null) {
                view2.m944b(this.f589b.f2595c);
            }
            if (this.f589b.f2601k == 0) {
                this.f589b.f2601k = -2;
            }
            if (this.f589b.f2602l == 0) {
                this.f589b.f2602l = -2;
            }
            view2.m946c();
            view2.setScaleType(ScaleType.FIT_CENTER);
            view2.setLayoutParams(new LayoutParams(this.f589b.f2602l, this.f589b.f2601k));
            if (this.f589b.f2605p == aq.f2591e) {
                view2.m963l();
            } else if (this.f589b.f2605p == aq.f2592f) {
                view2.m962k();
            }
        }
        ((bw) view2).m948c((String) this.f589b.f2598h.get(i));
        return view2;
    }
}
