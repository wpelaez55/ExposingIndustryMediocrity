package com.konylabs.api.ui;

import android.os.AsyncTask;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class bx extends AsyncTask {
    final /* synthetic */ bw f903a;

    bx(bw bwVar) {
        this.f903a = bwVar;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        KonyMain.getActContext().m4147a();
        this.f903a.f889i = dB.m1110b(this.f903a.m942b(), this.f903a.f880C.booleanValue());
        KonyMain.getActContext().m4155b();
        return null;
    }

    protected final void onCancelled() {
        super.onCancelled();
        this.f903a.m943b(1);
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "........Cancelling task.........");
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f903a.m960i();
        } else {
            KonyMain.m4094a(new by(this));
        }
        if (KonyMain.f3656d <= 3) {
            bx bxVar = (bx) bw.f877u.poll();
            if (bxVar != null) {
                bxVar.execute(new String[0]);
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "........Executing next Image Download Task from Queue.........TaskCount = " + bw.f876t);
                }
            } else {
                bw.m923o();
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "Task count = " + bw.f876t);
                }
            }
        }
        super.onPostExecute(voidR);
    }

    protected final void onPreExecute() {
        if (this.f903a.m928a() == 2) {
            this.f903a.m943b(3);
        }
        super.onPreExecute();
    }
}
