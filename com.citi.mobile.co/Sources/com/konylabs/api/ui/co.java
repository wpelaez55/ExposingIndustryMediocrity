package com.konylabs.api.ui;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLngBounds.Builder;

final class co implements OnGlobalLayoutListener {
    private /* synthetic */ Builder f1003a;
    private /* synthetic */ View f1004b;
    private /* synthetic */ cn f1005c;

    co(cn cnVar, Builder builder, View view) {
        this.f1005c = cnVar;
        this.f1003a = builder;
        this.f1004b = view;
    }

    public final void onGlobalLayout() {
        LatLngBounds build = this.f1003a.build();
        this.f1004b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.f1005c.f2772x.moveCamera(CameraUpdateFactory.newLatLngBounds(build, 50));
    }
}
