package ny0k;

import android.os.Handler;
import android.os.Message;
import com.konylabs.android.KonyMain;

final class cV extends Handler {
    private /* synthetic */ cQ f2271a;

    cV(cQ cQVar) {
        this.f2271a = cQVar;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1 || message.what == 7) {
            KonyMain.m4143x().m1772a(message);
        } else if (message.what == 6) {
            this.f2271a.f3633f.removeMessages(1, message.obj);
        }
    }
}
