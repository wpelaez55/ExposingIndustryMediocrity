package com.konylabs.api.ui;

import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.rsa.mobilesdk.sdk.BuildConfig;

final class cp implements InfoWindowAdapter {
    private /* synthetic */ cn f1006a;

    cp(cn cnVar) {
        this.f1006a = cnVar;
    }

    public final View getInfoContents(Marker marker) {
        return null;
    }

    public final View getInfoWindow(Marker marker) {
        ch chVar = (ch) this.f1006a.n.get(this.f1006a.m2907a(marker));
        this.f1006a.f2772x.animateCamera(CameraUpdateFactory.newLatLng(new LatLng((double) chVar.f978a, (double) chVar.f979b)));
        if (chVar.f983f || chVar.f984g) {
            chVar.f984g = false;
            View a = this.f1006a.d.m1024a(chVar.f987j);
            if (a == null) {
                if (this.f1006a.f2769C == null) {
                    this.f1006a.f2769C = new cq(this.f1006a, this.f1006a.a);
                }
                this.f1006a.f2769C.f1007a.setText(chVar.f981d != null ? chVar.f981d : BuildConfig.FLAVOR);
                if (!(chVar.f980c == null && chVar.f981d == null)) {
                    this.f1006a.f2769C.setTitle(chVar.f980c != null ? chVar.f980c : BuildConfig.FLAVOR);
                    if (this.f1006a.h == null) {
                        this.f1006a.f2769C.f1008b.setVisibility(8);
                    }
                    this.f1006a.f2769C.show();
                }
            } else {
                a.setClickable(true);
                return a;
            }
        }
        return null;
    }
}
