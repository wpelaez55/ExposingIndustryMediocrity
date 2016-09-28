package com.konylabs.api.ui;

import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.List;

final class bY implements Runnable {
    final /* synthetic */ bW f816a;
    private /* synthetic */ String f817b;

    bY(bW bWVar, String str) {
        this.f816a = bWVar;
        this.f817b = str;
    }

    public final void run() {
        List fromLocationName;
        int i = 0;
        try {
            fromLocationName = new Geocoder(KonyMain.getActContext()).getFromLocationName(this.f817b, 1);
        } catch (Throwable e) {
            if (KonyMain.f3657e) {
                Log.d("KonyMap", BuildConfig.FLAVOR + e, e);
            }
            fromLocationName = null;
        }
        if (fromLocationName != null && fromLocationName.size() > 0) {
            Address address = (Address) fromLocationName.get(0);
            StringBuffer stringBuffer = new StringBuffer();
            int maxAddressLineIndex = address.getMaxAddressLineIndex();
            while (i <= maxAddressLineIndex) {
                stringBuffer.append(address.getAddressLine(i)).append(" \n");
                i++;
            }
            LuaTable luaTable = new LuaTable();
            LuaTable luaTable2 = new LuaTable();
            luaTable2.setTable("lat", Float.valueOf((float) address.getLatitude()));
            luaTable2.setTable("lon", Float.valueOf((float) address.getLongitude()));
            luaTable2.setTable("name", address.getLocality());
            luaTable2.setTable("desc", stringBuffer.toString());
            luaTable2.setTable("showcallout", Boolean.valueOf(true));
            luaTable2.setTable("addressFromLocationName", this.f817b);
            luaTable.add(luaTable2);
            KonyMain.m4094a(new bZ(this, luaTable));
        }
    }
}
