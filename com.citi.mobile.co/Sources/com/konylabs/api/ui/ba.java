package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Gallery;

final class ba implements OnFocusChangeListener {
    private /* synthetic */ aV f820a;

    ba(aV aVVar) {
        this.f820a = aVVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view != null) {
            this.f820a.m2503a((bc) ((Gallery) view).getSelectedItem(), z);
        }
    }
}
