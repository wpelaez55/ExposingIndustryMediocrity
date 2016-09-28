package ny0k;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;

class cg {
    final /* synthetic */ bO f2275a;

    cg(bO bOVar) {
        this.f2275a = bOVar;
    }

    public void m2163a(int i, int i2, boolean z) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f2275a.aj;
        Bundle bundle = new Bundle(4);
        bundle.putSerializable("key0", this.f2275a);
        bundle.putSerializable("key1", Integer.valueOf(i));
        bundle.putSerializable("key2", Integer.valueOf(i2));
        bundle.putSerializable("key3", Boolean.valueOf(z));
        bundle.putSerializable("DropMultipleTaps", Boolean.valueOf(true));
        obtain.setData(bundle);
        KonyMain.m4121f().sendMessage(obtain);
    }
}
