package com.konylabs.api.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public final class du extends BaseAdapter {
    private /* synthetic */ dm f1228a;

    public du(dm dmVar) {
        this.f1228a = dmVar;
    }

    public final int getCount() {
        return this.f1228a.f2913i.size();
    }

    public final Object getItem(int i) {
        return ((dv) this.f1228a.f2913i.elementAt(i)).m1274a(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return ((dv) this.f1228a.f2913i.elementAt(i)).m1274a(i);
    }
}
