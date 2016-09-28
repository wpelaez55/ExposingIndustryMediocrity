package ny0k;

import android.os.Handler;
import android.os.Message;
import com.konylabs.android.KonyMain;

final class cY extends Handler {
    cY(cW cWVar) {
    }

    public final void handleMessage(Message message) {
        try {
            if (message.what == 1 || message.what == 7) {
                KonyMain.m4143x().m1772a(message);
            } else if (message.what == 6) {
                removeMessages(1, message.obj);
            }
        } catch (Exception e) {
        }
    }
}
