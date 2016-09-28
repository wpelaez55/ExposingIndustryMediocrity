package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;

public final class cI {
    private cJ f2250a;
    private cJ f2251b;
    private int f2252c;

    public cI() {
        this.f2252c = 0;
    }

    public final synchronized cJ m2124a() {
        cJ cJVar = null;
        synchronized (this) {
            if (this.f2250a == null && this.f2251b == null) {
                if (KonyMain.f3657e) {
                    Log.d("RunnablePool", "Pool size empty");
                }
            } else if (this.f2250a == this.f2251b) {
                cJVar = this.f2250a;
                this.f2251b = null;
                this.f2250a = null;
                this.f2252c--;
            } else {
                cJVar = this.f2250a;
                this.f2250a = cJVar.f2253a;
                this.f2252c--;
            }
        }
        return cJVar;
    }

    public final synchronized void m2125a(cJ cJVar) {
        if (this.f2252c < 50) {
            cJVar.m2128a();
            if (this.f2250a == null && this.f2251b == null) {
                this.f2251b = cJVar;
                this.f2250a = cJVar;
                this.f2252c++;
            } else {
                this.f2251b.f2253a = cJVar;
                this.f2251b = cJVar;
                cJVar.f2253a = null;
                this.f2252c++;
            }
        } else if (KonyMain.f3657e) {
            Log.d("RunnablePool", "Pool size reached max pool size");
        }
    }
}
