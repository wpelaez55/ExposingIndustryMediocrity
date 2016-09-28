package com.konylabs.api.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.konylabs.android.KonyMain;

public final class cs extends Fragment {
    public MapView f2774a;
    private GoogleMap f2775b;
    private Bundle f2776c;
    private cn f2777d;

    public cs() {
        this.f2777d = null;
    }

    public final void m2926a(cn cnVar) {
        this.f2777d = cnVar;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f2777d == null) {
            getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
        this.f2775b = this.f2774a.getMap();
        ((KonyMapV2View) this.f2774a).setKonyMap(this.f2777d);
        this.f2777d.m2910a(this.f2775b);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2776c = bundle;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Class cls = Class.forName("com.google.android.gms.maps.MapsInitializer");
            cls.getMethod("initialize", new Class[]{Context.class}).invoke(cls, new Object[]{getActivity()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        View inflate = layoutInflater.inflate(KonyMain.getAppContext().getResources().getIdentifier("mapv2", "layout", KonyMain.getAppContext().getPackageName()), viewGroup, false);
        this.f2774a = (MapView) inflate.findViewById(KonyMain.getAppContext().getResources().getIdentifier("mapv2view", "id", KonyMain.getAppContext().getPackageName()));
        this.f2774a.setLayoutParams(new LayoutParams(-1, -1));
        this.f2774a.onCreate(this.f2776c);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2774a.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        this.f2774a.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f2774a.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }
}
