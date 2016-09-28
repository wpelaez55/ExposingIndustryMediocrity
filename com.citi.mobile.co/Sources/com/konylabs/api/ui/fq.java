package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class fq implements OnItemSelectedListener {
    private /* synthetic */ fp f1433a;

    fq(fp fpVar) {
        this.f1433a = fpVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f1433a.f3958n = (am) this.f1433a.f3957m.getSelectedItem();
        if (this.f1433a.f3959o) {
            this.f1433a.f3959o = false;
            if (KonyMain.f3657e) {
                Log.d("LuaComboBox", " skipOnDoneEvent true return onItemSelected");
            }
        } else if (this.f1433a.f3958n != null) {
            LuaNil table = this.f1433a.getTable(fp.f3945a);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f1433a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        } else if (KonyMain.f3657e) {
            Log.d("LuaComboBox", " selected_data=null return onItemSelected");
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
