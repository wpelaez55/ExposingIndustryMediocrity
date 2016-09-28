package com.konylabs.api.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;

public final class es extends Fragment {
    private /* synthetic */ KonyWeb f2992a;

    public es(KonyWeb konyWeb) {
        this.f2992a = konyWeb;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f2992a.f265u;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f2992a.f266v != null) {
            this.f2992a.f266v.onCustomViewHidden();
            this.f2992a.f266v = null;
            KonyMain.getActivityContext().m4152a(null);
        }
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
    }

    public final void onStop() {
        super.onStop();
        if (this.f2992a.f266v != null) {
            this.f2992a.f266v.onCustomViewHidden();
            this.f2992a.f266v = null;
            KonyMain.getActivityContext().m4152a(null);
        }
    }
}
