package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

public class aH {
    final /* synthetic */ fv f471a;

    aH(fv fvVar) {
        this.f471a = fvVar;
    }

    public void m501a() {
        LuaNil d = super.getTable(fv.f4012h);
        this.f471a.aP = d != LuaNil.nil ? (Function) d : null;
        if (this.f471a.aP != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f471a.aP;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f471a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public boolean m502b() {
        LuaNil f = super.getTable(fv.f4012h);
        this.f471a.aP = f != LuaNil.nil ? (Function) f : null;
        if (this.f471a.aP != null) {
            try {
                Object[] execute = ((Function) this.f471a.aP).execute(new Object[]{this.f471a});
                if (execute != null && execute.length > 0) {
                    return ((Boolean) execute[0]).booleanValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
