package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class gS implements cG {
    final /* synthetic */ gL f3003a;

    gS(gL gLVar) {
        this.f3003a = gLVar;
    }

    public final void m3328a() {
        if (!(this.f3003a.f4166P == LuaNil.nil || this.f3003a.f4166P == null)) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = this.f3003a.f4166P;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f3003a);
            obtain.setData(bundle);
            if (KonyMain.f3657e) {
                Log.d("LuaPopUp", "OnDismiss Called " + this.f3003a.f4166P);
            }
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
        int f = this.f3003a.m4551t();
        if (f == 0 || f == -1) {
            this.f3003a.m4570l();
        } else if (this.f3003a.f4178z != null) {
            View contentView = this.f3003a.f4178z.getContentView();
            if (contentView != null) {
                contentView.post(new gT(this));
            }
        }
    }
}
