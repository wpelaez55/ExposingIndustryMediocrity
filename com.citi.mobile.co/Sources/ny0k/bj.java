package ny0k;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

public class bj {
    int[] f2191a;
    final /* synthetic */ cb f2192b;
    private cj f2193c;

    bj(cb cbVar) {
        this.f2192b = cbVar;
        this.f2191a = new int[2];
        this.f2193c = this.f2192b.c;
    }

    public void m2077a(int i) {
        if (this.f2192b.am != LuaNil.nil) {
            int[] a = this.f2193c.m2170a(i, this.f2191a, this.f2192b.ab);
            int i2 = a[0];
            int i3 = a[1];
            boolean z = ((bI) ((bT) this.f2192b.Y.get(i2)).f2147g.get(i3)).f3317a.f2137f;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f2192b.am;
            Bundle bundle = new Bundle(4);
            bundle.putSerializable("key0", this.f2192b);
            bundle.putSerializable("key1", cr.m2200a(cr.m2199a(i2, 1)));
            bundle.putSerializable("key2", cr.m2200a(cr.m2199a(i3, 1)));
            bundle.putSerializable("key3", Boolean.valueOf(z));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
