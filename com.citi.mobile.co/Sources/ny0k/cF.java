package ny0k;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.dB;

public final class cF extends AsyncTask {
    private String f2232a;
    private cO f2233b;

    public cF(String str) {
        this.f2232a = str;
    }

    public final void m2109a(cO cOVar) {
        this.f2233b = cOVar;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4147a();
        }
        if (KonyMain.f3657e) {
            Log.d("ImageDownloadAsyncTask", "Downloading image from: " + this.f2232a);
        }
        Drawable b = dB.m1109b(this.f2232a);
        if (actContext != null) {
            actContext.m4155b();
        }
        return b;
    }

    protected final void onCancelled() {
        if (KonyMain.f3657e) {
            Log.d("ImageDownloadAsyncTask", this.f2232a + " Download cancelled");
        }
        if (this.f2233b != null) {
            cO cOVar = this.f2233b;
            String str = this.f2232a;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (KonyMain.f3657e) {
            Log.d("ImageDownloadAsyncTask", this.f2232a + " Download complete");
        }
        if (this.f2233b != null) {
            cO cOVar = this.f2233b;
            String str = this.f2232a;
            cOVar.m2157a(drawable);
        }
    }

    protected final void onPreExecute() {
        if (KonyMain.f3657e) {
            Log.d("ImageDownloadAsyncTask", this.f2232a + " Download started");
        }
        if (this.f2233b != null) {
            cO cOVar = this.f2233b;
            String str = this.f2232a;
        }
    }
}
