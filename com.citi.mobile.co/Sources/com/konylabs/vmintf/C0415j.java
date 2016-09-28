package com.konylabs.vmintf;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0338B;
import com.konylabs.api.C0346M;
import com.konylabs.api.C0348Q;
import com.konylabs.api.C0349R;
import com.konylabs.api.C0353a;
import com.konylabs.api.C0354c;
import com.konylabs.api.C0363l;
import com.konylabs.api.C0364m;
import com.konylabs.api.C0365n;
import com.konylabs.api.C0434h;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.js.api.KonyJSONString;
import com.konylabs.libintf.C0235a;
import com.konylabs.libintf.Library;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.C0247l;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import ny0k.C0424R;
import ny0k.cN;

/* renamed from: com.konylabs.vmintf.j */
public final class C0415j implements C0254b {
    private static C0247l f3167a;
    private static String f3168c;
    private C0235a f3169b;

    static {
        f3167a = null;
        f3168c = "KonyLuaVM";
    }

    public C0415j() {
        this.f3169b = null;
    }

    private static String m3413a() {
        try {
            KonyMain.getAppContext().getAssets().open("konyappluabytecode.o").close();
            return "konyappluabytecode.o";
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d(f3168c, "Loading bytecode in mp3 extension");
            }
            return "konyappluabytecode.o.mp3";
        }
    }

    public final long m3414a(LuaWidget luaWidget, String str, boolean z) {
        return 0;
    }

    public final Function m3415a(String str) {
        return f3167a.m1746a(str);
    }

    public final void m3416a(Message message) {
        if (message.obj != null) {
            try {
                Bundle data = message.getData();
                if (data == null || data.size() <= 0) {
                    ((Function) message.obj).execute(null);
                    return;
                }
                Object[] objArr = new Object[data.size()];
                for (int i = 0; i < data.size(); i++) {
                    objArr[i] = data.get("key" + i);
                }
                ((Function) message.obj).execute(objArr);
            } catch (Throwable e) {
                if (KonyMain.f3657e) {
                    Log.d(f3168c, BuildConfig.FLAVOR + e.getMessage(), e);
                }
                if (e instanceof LuaError) {
                    throw ((LuaError) e);
                }
                throw new LuaError("Error in lua callback invocation." + e.getMessage(), 605);
            }
        }
    }

    public final void m3417a(LuaWidget luaWidget, LuaWidget luaWidget2) {
    }

    public final void m3418a(LuaWidget luaWidget, ArrayList arrayList) {
    }

    public final void m3419a(Library library, int i) {
        f3167a.m1748a(library);
    }

    public final void m3420a(C0235a c0235a) {
        this.f3169b = c0235a;
    }

    public final void m3421a(C0245j c0245j) {
        System.gc();
    }

    public final boolean m3422a(KonyJSONString konyJSONString) {
        return true;
    }

    public final void m3423b(LuaWidget luaWidget, LuaWidget luaWidget2) {
    }

    public final void m3424b(LuaWidget luaWidget, ArrayList arrayList) {
    }

    public final void m3425b(KonyJSONString konyJSONString) {
    }

    public final void m3426b(C0245j c0245j) {
        System.gc();
    }

    public final boolean m3427b() {
        try {
            DataInputStream dataInputStream;
            r3 = new Library[41];
            KonyMain.getAppContext();
            r3[29] = new C0354c();
            r3[30] = new C0363l();
            r3[31] = new C0338B();
            r3[32] = new C0365n();
            r3[33] = new C0424R();
            r3[34] = new C0364m();
            r3[35] = new C0346M();
            r3[36] = new C0348Q();
            r3[37] = new C0434h();
            r3[38] = C0349R.m2296o();
            r3[39] = new C0353a();
            r3[40] = C0349R.m2297p();
            cN.m2154e();
            long currentTimeMillis = System.currentTimeMillis();
            if (KonyMain.f3655c.m2134b() == 0) {
                dataInputStream = new DataInputStream(KonyMain.getAppContext().getAssets().open(C0415j.m3413a()));
            } else {
                InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(KonyMain.getAppContext().getFilesDir(), "konyappluabytecode.o")));
                bufferedInputStream.mark(bufferedInputStream.available());
                dataInputStream = new DataInputStream(bufferedInputStream);
            }
            C0247l c0247l = new C0247l(dataInputStream, r3, KonyMain.getActContext(), KonyMain.f3657e);
            f3167a = c0247l;
            c0247l.m1749a(this.f3169b);
            f3167a.m1747a();
            f3167a.m1750a(null);
            if (!KonyMain.f3657e) {
                return true;
            }
            Log.d("PERF", "Load time ::::::::::::::::::: " + (System.currentTimeMillis() - currentTimeMillis));
            return true;
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d(f3168c, BuildConfig.FLAVOR + e.getMessage());
            }
            KonyMain.m4121f().sendEmptyMessage(99991);
            return false;
        }
    }
}
