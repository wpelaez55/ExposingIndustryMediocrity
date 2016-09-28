package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;

final class ap extends BaseAdapter {
    private Context f586a;
    private /* synthetic */ ao f587b;

    public ap(ao aoVar, Context context) {
        this.f587b = aoVar;
        this.f586a = context;
    }

    public final int getCount() {
        return this.f587b.f2586g.size();
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View btVar;
        if (view == null) {
            btVar = new bt(this.f586a);
            if (this.f587b.f2580a != null) {
                btVar.m895a(this.f587b.f2580a);
            }
            if (this.f587b.f2581b != null) {
                btVar.m903b(this.f587b.f2581b);
            }
            if (this.f587b.f2582c == 0) {
                this.f587b.f2582c = -2;
            }
            if (this.f587b.f2583d == 0) {
                this.f587b.f2583d = -2;
            }
            btVar.m906c();
            btVar.setScaleType(ScaleType.FIT_CENTER);
            btVar.setLayoutParams(new LayoutParams(this.f587b.f2583d, this.f587b.f2582c));
        } else {
            btVar = view;
        }
        ((bt) btVar).m908c((String) this.f587b.f2586g.get(i));
        return btVar;
    }
}
