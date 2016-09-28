package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.KonyJSException;
import com.konylabs.vmintf.C0261i;

final class da implements C0261i {
    private /* synthetic */ cW f3477a;

    da(cW cWVar) {
        this.f3477a = cWVar;
    }

    public final void m3877a(String str, int i, KonyJSException konyJSException) {
        if (KonyMain.f3657e) {
            Log.d("WorkerThread", "onFileCompiled(importScripts) : statusMsg=[" + str + "] statusCode=[" + i + "] expObj=[" + konyJSException + "]");
        }
        this.f3477a.f3462b = i;
        this.f3477a.f3463c = str;
        if (i != 1) {
            return;
        }
        if (konyJSException != null) {
            this.f3477a.m3859a((Exception) konyJSException);
        } else {
            this.f3477a.m3859a(new Exception(str));
        }
    }
}
