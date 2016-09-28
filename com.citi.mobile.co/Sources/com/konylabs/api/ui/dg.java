package com.konylabs.api.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class dg implements OnScrollListener {
    private /* synthetic */ df f1209a;

    dg(df dfVar) {
        this.f1209a = dfVar;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f1209a.m3134g(i - this.f1209a.f2895w);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
