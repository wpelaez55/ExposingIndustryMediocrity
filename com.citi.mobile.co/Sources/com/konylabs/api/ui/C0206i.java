package com.konylabs.api.ui;

import android.database.DataSetObserver;

/* renamed from: com.konylabs.api.ui.i */
final class C0206i extends DataSetObserver {
    private /* synthetic */ C0203f f1542a;

    private C0206i(C0203f c0203f, byte b) {
        this.f1542a = c0203f;
    }

    public final void onChanged() {
        this.f1542a.f1345K = this.f1542a.f1359b.getCount();
        if (this.f1542a.f1380w) {
            C0203f.m1386o(this.f1542a);
            this.f1542a.m1383n();
            this.f1542a.removeAllViews();
            this.f1542a.m1370g();
        }
    }
}
