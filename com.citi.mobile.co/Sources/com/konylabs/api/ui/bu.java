package com.konylabs.api.ui;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.IOException;
import ny0k.cn;
import ny0k.cy;

final class bu extends AsyncTask {
    private /* synthetic */ bt f873a;

    bu(bt btVar) {
        this.f873a = btVar;
    }

    private Void m917a() {
        if (this.f873a.f871y) {
            try {
                byte[] a = cn.m2178a(this.f873a.f870x);
                this.f873a.m887n();
                Bitmap a2 = C0202e.m1281a(a, -1, -1);
                this.f873a.f857g = a2;
                this.f873a.f859i = new cy(a2);
            } catch (IOException e) {
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", BuildConfig.FLAVOR + e.getMessage());
                }
            }
        } else {
            KonyMain.getActContext().m4147a();
            this.f873a.f859i = dB.m1109b(this.f873a.m901b());
            KonyMain.getActContext().m4155b();
        }
        return null;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m917a();
    }

    protected final void onCancelled() {
        super.onCancelled();
        this.f873a.m902b(1);
        if (KonyMain.f3657e) {
            Log.d("KonyImage", "........Cancelling task.........");
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        this.f873a.m886m();
        if (KonyMain.f3656d <= 3) {
            bu buVar = (bu) bt.f847t.poll();
            if (buVar != null) {
                buVar.execute(new String[0]);
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "........Executing next Image Download Task from Queue.........TaskCount = " + bt.f846s);
                }
            } else {
                bt.m885l();
                if (KonyMain.f3657e) {
                    Log.d("KonyImage", "Task count = " + bt.f846s);
                }
            }
        }
        super.onPostExecute(voidR);
    }

    protected final void onPreExecute() {
        if (this.f873a.m889a() == 2) {
            this.f873a.m902b(3);
        }
        super.onPreExecute();
    }
}
