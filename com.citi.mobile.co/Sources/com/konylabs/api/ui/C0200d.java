package com.konylabs.api.ui;

import android.database.DataSetObserver;

/* renamed from: com.konylabs.api.ui.d */
final class C0200d extends DataSetObserver {
    private /* synthetic */ C0197a f1078a;

    private C0200d(C0197a c0197a, byte b) {
        this.f1078a = c0197a;
    }

    public final void onChanged() {
        this.f1078a.f380O = this.f1078a.f386a.getCount();
        if (this.f1078a.f410y && this.f1078a.f399n == 769) {
            this.f1078a.m401l();
            this.f1078a.m384d();
            this.f1078a.removeAllViews();
            this.f1078a.m386e();
        }
    }
}
