package com.konylabs.api;

import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.id;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

/* renamed from: com.konylabs.api.A */
final class C0337A implements id {
    private /* synthetic */ Function f2376a;

    C0337A(C0375z c0375z, Function function) {
        this.f2376a = function;
    }

    public final void m2239a(boolean z, Uri uri) {
        if (this.f2376a != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f2376a;
            Bundle bundle = new Bundle(1);
            if (z) {
                bundle.putSerializable("key0", uri.toString());
            } else {
                bundle.putSerializable("key0", LuaNil.nil);
            }
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
