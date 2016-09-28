package com.konylabs.api.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public final class bj extends BaseAdapter {
    private /* synthetic */ bd f831a;

    public bj(bd bdVar) {
        this.f831a = bdVar;
    }

    public final int getCount() {
        return this.f831a.f2636d.size();
    }

    public final Object getItem(int i) {
        return this.f831a.f2636d.elementAt(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return ((bk) this.f831a.f2636d.elementAt(i)).m872a();
    }
}
