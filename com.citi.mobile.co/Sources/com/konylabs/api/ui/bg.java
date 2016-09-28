package com.konylabs.api.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class bg implements OnItemClickListener {
    private /* synthetic */ bd f828a;

    bg(bd bdVar) {
        this.f828a = bdVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f828a.m2685m(i);
        if (this.f828a.f2635c != null) {
            this.f828a.f2635c.onClick(view);
        }
    }
}
