package com.konylabs.api.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public final class bb extends BaseAdapter {
    private /* synthetic */ aV f821a;

    public bb(aV aVVar) {
        this.f821a = aVVar;
    }

    public final int getCount() {
        return this.f821a.f2541b.size();
    }

    public final Object getItem(int i) {
        return this.f821a.f2541b.elementAt(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return ((bc) this.f821a.f2541b.elementAt(i)).m869a();
    }
}
