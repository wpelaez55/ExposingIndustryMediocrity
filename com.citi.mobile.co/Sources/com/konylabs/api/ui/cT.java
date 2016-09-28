package com.konylabs.api.ui;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class cT extends AsyncTask {
    private String f962a;
    private /* synthetic */ cP f963b;

    public cT(cP cPVar, String str) {
        this.f963b = cPVar;
        this.f962a = str;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        KonyMain actContext = KonyMain.getActContext();
        actContext.m4147a();
        if (KonyMain.f3657e) {
            Log.d("KonyRichText", "Downloading image from: " + this.f962a);
        }
        Drawable b = dB.m1109b(this.f962a);
        actContext.m4155b();
        return b;
    }

    protected final void onCancelled() {
        if (KonyMain.f3657e) {
            Log.d("KonyRichText", "........Cancelling task.........");
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (KonyMain.f3657e) {
            Log.d("KonyRichText", "Download complete");
        }
        this.f963b.m1008a(this.f962a, drawable);
    }

    protected final void onPreExecute() {
    }
}
