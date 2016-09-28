package com.konylabs.search;

import android.app.SearchManager.OnCancelListener;

/* renamed from: com.konylabs.search.a */
final class C0236a implements OnCancelListener {
    private /* synthetic */ SearchDataAdapter f1781a;

    C0236a(SearchDataAdapter searchDataAdapter) {
        this.f1781a = searchDataAdapter;
    }

    public final void onCancel() {
        this.f1781a.raiseOnDismissCallback();
    }
}
