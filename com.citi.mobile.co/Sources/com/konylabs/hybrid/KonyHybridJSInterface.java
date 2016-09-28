package com.konylabs.hybrid;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0216r;
import com.konylabs.api.ui.gb;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;

public class KonyHybridJSInterface {
    private int f1664a;

    public KonyHybridJSInterface(int i) {
        this.f1664a = 0;
        this.f1664a = i;
    }

    public void executeFunctionInNativeContext(String str, String str2) {
        if (KonyMain.f3657e) {
            Log.d("KonyHybridJSInterface", "executeFunctionInNativeContext():: methodName=" + str + " params=" + str2);
        }
        Function a = KonyMain.m4143x().m1771a(str);
        if (a != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = a;
            LuaTable a2 = str2 != null ? this.f1664a == 1 ? C0216r.m1554a(str2, 1) : C0216r.m1554a(str2, 0) : null;
            if (a2 != null) {
                Bundle bundle = new Bundle();
                for (int i = 0; i < a2.list.size(); i++) {
                    Object obj = a2.list.get(i);
                    if (obj instanceof String) {
                        bundle.putString("key" + i, (String) obj);
                    } else if (obj instanceof Double) {
                        bundle.putDouble("key" + i, ((Double) obj).doubleValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean("key" + i, ((Boolean) obj).booleanValue());
                    } else {
                        bundle.putSerializable("key" + i, (Serializable) obj);
                    }
                }
                obtain.setData(bundle);
            }
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public void executeFunctionInSPAContext(String str, String str2) {
        if (KonyMain.f3657e) {
            Log.d("KonyHybridJSInterface", "executeFunctionInSPAContext():: methodName=" + str + " params=" + str2);
        }
        KonyMain.m4121f().post(new C0226a(this, str, str2));
    }

    public void executeFunctionInTCContext(String str, String str2) {
        if (KonyMain.f3657e) {
            Log.d("KonyHybridJSInterface", "executeFunctionInTCContext():: methodName=" + str + " params=" + str2);
        }
        if (this.f1664a == 1) {
            gb.m4871b(str, C0216r.m1554a(str2, 1));
        } else {
            gb.m4871b(str, C0216r.m1554a(str2, 0));
        }
    }
}
