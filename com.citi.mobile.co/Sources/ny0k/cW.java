package ny0k;

import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0369u;
import com.konylabs.api.C0373w;
import com.konylabs.libintf.Library;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.Function;
import com.konylabs.vm.KonyJSException;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import com.konylabs.vmintf.C0261i;
import com.konylabs.vmintf.KonyJSVM;
import com.konylabs.vmintf.KonyJavaScriptVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public final class cW extends Thread implements C0261i, cP {
    private static Vector f3460f;
    Vector f3461a;
    int f3462b;
    String f3463c;
    private C0245j f3464d;
    private cQ f3465e;
    private Vector f3466g;
    private Vector f3467h;
    private ArrayList f3468i;
    private boolean f3469j;
    private boolean f3470k;

    static {
        f3460f = null;
    }

    public cW(cQ cQVar) {
        this.f3464d = null;
        this.f3465e = null;
        this.f3466g = new Vector();
        this.f3461a = new Vector();
        this.f3467h = new Vector();
        this.f3468i = null;
        this.f3469j = false;
        this.f3470k = false;
        this.f3462b = 0;
        this.f3463c = null;
        this.f3465e = cQVar;
        if (f3460f == null) {
            f3460f = new Vector();
        }
        f3460f.add(this);
    }

    public static void m3856e() {
        if (f3460f != null && f3460f.size() > 0) {
            int size = f3460f.size();
            for (int i = 0; i < size; i++) {
                ((cW) f3460f.get(i)).m3858a();
            }
            f3460f.clear();
        }
    }

    private static void m3857f() {
        ArrayList b = C0373w.m3365b();
        if (b != null && b.size() > 0) {
            for (int i = 0; i < b.size(); i++) {
                KonyMain.m4143x().m1775a((Library) b.get(i), 1);
            }
        }
    }

    public final void m3858a() {
        if (this.f3464d == null) {
            this.f3470k = true;
        } else {
            this.f3464d.m1730b(new cZ(this));
        }
    }

    public final void m3859a(Exception exception) {
        LuaTable luaTable = new LuaTable(0, 4);
        if (exception instanceof KonyJSException) {
            KonyJSException konyJSException = (KonyJSException) exception;
            luaTable.setTable("message", konyJSException.message);
            luaTable.setTable("filename", konyJSException.fileName);
            luaTable.setTable("lineno", Integer.valueOf(konyJSException.lineNumber));
        } else {
            luaTable.setTable("message", exception.getMessage());
        }
        int size = this.f3467h.size();
        for (int i = 0; i < size; i++) {
            try {
                ((Function) this.f3467h.get(i)).execute(new Object[]{luaTable});
            } catch (Exception e) {
            }
        }
        this.f3465e.m4047a(luaTable);
    }

    public final void m3860a(Object obj) {
        this.f3465e.m4052b(obj);
    }

    public final void m3861a(String str, int i, KonyJSException konyJSException) {
        if (KonyMain.f3657e) {
            Log.d("WorkerThread", "onFileCompiled : statusMsg=[" + str + "] statusCode=[" + i + "] expObj=[" + konyJSException + "]");
        }
        if (i == 2) {
            m3859a(new Exception("WorkerThread: InvalidParameter. WorkerThread script not found"));
            this.f3465e.m4046a();
        } else if (i != 1) {
        } else {
            if (konyJSException != null) {
                m3859a((Exception) konyJSException);
            } else {
                m3859a(new Exception(str));
            }
        }
    }

    public final void m3862a(String str, Function function) {
        if (str.equals("message")) {
            this.f3461a.add(function);
        } else if (str.equals("error")) {
            this.f3467h.add(function);
        }
    }

    public final void m3863a(cW cWVar) {
        this.f3466g.add(cWVar);
    }

    public final boolean m3864a(Object[] objArr) {
        if (objArr.length == 0) {
            return false;
        }
        String[] strArr = new String[objArr.length];
        int i = 0;
        while (i < objArr.length) {
            if (objArr[i] instanceof String) {
                strArr[i] = (String) objArr[i];
                i++;
            } else {
                throw new LuaError(3002, "WorkerThreadError", "importScripts: InvalidParameter. Invalid script name");
            }
        }
        this.f3462b = 0;
        this.f3463c = null;
        KonyJavaScriptVM.m3387a("workerthreads.kfm", strArr, new da(this));
        if (this.f3462b != 2) {
            return true;
        }
        throw new LuaError(3002, "WorkerThreadError", "importScripts: InvalidParameter. Unable to import script " + this.f3463c);
    }

    public final C0245j m3865b() {
        return this.f3464d;
    }

    public final void m3866b(Object obj) {
        if (this.f3464d == null || !this.f3469j) {
            if (this.f3468i == null) {
                this.f3468i = new ArrayList();
            }
            this.f3468i.add(obj);
            return;
        }
        this.f3464d.m1728a(new cX(this, obj));
    }

    public final void m3867b(String str, Function function) {
        Vector vector = str.equals("message") ? this.f3461a : str.equals("error") ? this.f3467h : null;
        if (vector != null && vector.size() > 0) {
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                if (function.equals(vector.get(i))) {
                    vector.remove(i);
                    return;
                }
            }
        }
    }

    public final cQ m3868c() {
        return this.f3465e;
    }

    public final void m3869d() {
        this.f3464d.m1726a(null);
        Looper myLooper = Looper.myLooper();
        KonyJSVM.disposeWorkerVM();
        if (KonyMain.f3657e) {
            KonyJSVM.displayHeapStatistics();
        }
        f3460f.remove(this);
        this.f3465e.m4051b();
        myLooper.quit();
    }

    public final void run() {
        if (KonyMain.f3657e) {
            Log.d("WorkerThread", "WorkerThread Successfully Created. Thread ID=" + Thread.currentThread().getId());
        }
        Looper.prepare();
        this.f3464d = new C0245j(new cY(this));
        KonyJavaScriptVM konyJavaScriptVM = (KonyJavaScriptVM) KonyMain.m4143x();
        KonyJavaScriptVM.f3162a[7] = new C0369u(KonyMain.getAppContext());
        konyJavaScriptVM.initWorkerVM(KonyJavaScriptVM.f3162a);
        m3857f();
        if (KonyMain.m4059E() == 3) {
            KonyJavaScriptVM.m3387a("src.zip", new String[]{"konylibrary.js", "require.js"}, (C0261i) this);
        } else {
            KonyJavaScriptVM.m3387a("common-jslibs.kfm", null, (C0261i) this);
        }
        if (!this.f3465e.f3628a.endsWith(".js")) {
            C0281O.m1816b(this.f3465e.f3628a);
        } else if (KonyMain.m4059E() == 3) {
            KonyJavaScriptVM.m3387a("src.zip", new String[]{"workerthreads/" + this.f3465e.f3628a}, (C0261i) this);
        } else {
            KonyJavaScriptVM.m3387a("workerthreads.kfm", new String[]{this.f3465e.f3628a}, (C0261i) this);
        }
        if (KonyMain.f3657e) {
            KonyJSVM.displayHeapStatistics();
        }
        this.f3469j = true;
        if (this.f3468i != null && this.f3468i.size() > 0) {
            Iterator it = this.f3468i.iterator();
            while (it.hasNext()) {
                m3866b(it.next());
            }
            this.f3468i.clear();
            this.f3468i = null;
        }
        if (this.f3470k) {
            m3858a();
        }
        Looper.loop();
        C0281O.m1808a(getId());
        if (KonyMain.f3657e) {
            Log.d("WorkerThread", "WorkerThread Successfully Terminated. Thread ID=" + Thread.currentThread().getId());
        }
    }
}
