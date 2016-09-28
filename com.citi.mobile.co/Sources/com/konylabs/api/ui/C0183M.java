package com.konylabs.api.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

/* renamed from: com.konylabs.api.ui.M */
final class C0183M implements OnMenuItemClickListener {
    private /* synthetic */ C0371G f272a;

    C0183M(C0371G c0371g) {
        this.f272a = c0371g;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f272a.f2455k = -1;
        this.f272a.f2456l = -1;
        this.f272a.f2457m = -1;
        this.f272a.m2386a(this.f272a.f2458n);
        return true;
    }
}
