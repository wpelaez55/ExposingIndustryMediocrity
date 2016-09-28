package ny0k;

import android.support.v4.util.LruCache;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class cs extends LruCache {
    cs(int i) {
        super(50);
    }

    protected final /* synthetic */ Object create(Object obj) {
        Integer num = (Integer) obj;
        if (KonyMain.f3657e) {
            Log.d("CommonUtil", "Creating an entry in cached doubles for " + num);
        }
        return new Double((double) num.intValue());
    }
}
