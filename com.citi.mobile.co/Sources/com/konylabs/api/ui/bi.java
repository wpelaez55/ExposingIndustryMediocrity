package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Gallery;

final class bi implements OnFocusChangeListener {
    private /* synthetic */ bd f830a;

    bi(bd bdVar) {
        this.f830a = bdVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view != null) {
            this.f830a.m2666a((bk) ((Gallery) view).getSelectedItem(), z);
        }
    }
}
