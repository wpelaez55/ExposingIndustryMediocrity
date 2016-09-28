package com.konylabs.api.ui;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.konylabs.vm.LuaTable;

public final class cj extends Overlay {
    private /* synthetic */ ci f988a;

    protected cj(ci ciVar) {
        this.f988a = ciVar;
    }

    public final boolean onTap(GeoPoint geoPoint, MapView mapView) {
        if (this.f988a.e != null) {
            LuaTable luaTable = new LuaTable();
            luaTable.setTable("lat", Double.valueOf(((double) geoPoint.getLatitudeE6()) / 1000000.0d));
            luaTable.setTable("lon", Double.valueOf(((double) geoPoint.getLongitudeE6()) / 1000000.0d));
            this.f988a.e.m1026a(luaTable);
        }
        return false;
    }
}
