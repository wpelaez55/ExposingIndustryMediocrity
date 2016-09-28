package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

/* renamed from: com.konylabs.api.ui.s */
public class C0217s {
    final /* synthetic */ hg f1607a;

    C0217s(hg hgVar) {
        this.f1607a = hgVar;
    }

    public void m1561a(int i) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI", "Outside onPageSelection is called pageSelectionCode - " + i);
        }
        if (this.f1607a.f4426f != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1607a.f4426f;
            Bundle bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f1607a);
            bundle.putSerializable("key1", new Double((double) i));
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            obtain.setData(bundle);
            if (KonyMain.f3657e) {
                Log.d("LuaSegUI", "Inside onPageSelection is called pageSelectionCode - " + i);
            }
            KonyMain.getActContext();
            if (KonyMain.m4121f().sendMessage(obtain)) {
                if (KonyMain.f3657e) {
                    Log.d("LuaSegUI", "Inside onPageSelection sendMessage is successful");
                }
            } else if (KonyMain.f3657e) {
                Log.d("LuaSegUI", "Inside onPageSelection sendMessage is fail");
            }
        }
    }
}
