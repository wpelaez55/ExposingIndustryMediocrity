package ny0k;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.cu;
import com.konylabs.vm.Function;

public class bi {
    final /* synthetic */ cf f2190a;

    private bi(cf cfVar, byte b) {
        this.f2190a = cfVar;
    }

    public void m2076a(cu cuVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = (Function) cuVar.f1030i;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", this.f2190a);
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }
}
