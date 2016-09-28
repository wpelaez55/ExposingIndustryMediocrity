package com.konylabs.api.ui;

import android.net.Uri;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class ey {
    final /* synthetic */ hP f1332a;

    ey(hP hPVar) {
        this.f1332a = hPVar;
    }

    public boolean m1342a(String str) {
        LuaTable luaTable = new LuaTable(0, 5, 1.0f, false);
        luaTable.setTable("originalURL", str);
        String encodedQuery = Uri.parse(str).getEncodedQuery();
        if (encodedQuery != null) {
            LuaTable luaTable2 = new LuaTable();
            for (String encodedQuery2 : encodedQuery2.split("&")) {
                String[] split = encodedQuery2.split("=");
                try {
                    luaTable2.setTable(URLDecoder.decode(split[0], "UTF-8"), split.length > 1 ? URLDecoder.decode(split[1], "UTF-8") : LuaNil.nil);
                } catch (UnsupportedEncodingException e) {
                    if (KonyMain.f3657e) {
                        e.printStackTrace();
                    }
                }
            }
            luaTable.setTable("queryParams", luaTable2);
        }
        LuaNil table = this.f1332a.getTable(hP.f4347i);
        if (table == LuaNil.nil) {
            return false;
        }
        try {
            Object[] execute = ((Function) table).execute(new Object[]{this.f1332a, luaTable});
            return (execute == null || !(execute[0] instanceof Boolean)) ? true : ((Boolean) execute[0]).booleanValue();
        } catch (Exception e2) {
            if (KonyMain.f3657e) {
                Log.d("LuaWeb", BuildConfig.FLAVOR + e2.getMessage());
            }
            if (e2 instanceof LuaError) {
                throw ((LuaError) e2);
            }
            throw new LuaError("Error in Browser widget handleRequest callback. " + e2.getMessage(), 605);
        }
    }
}
