package ny0k;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0208j;

final class bW implements C0208j {
    private int[] f3325a;
    private /* synthetic */ bV f3326b;

    private bW(bV bVVar, byte b) {
        this.f3326b = bVVar;
        this.f3325a = new int[2];
    }

    private void m3643c(int i) {
        if (this.f3326b.an != null) {
            int[] a = this.f3326b.c.m2170a(i, this.f3325a, this.f3326b.ab);
            int i2 = a[0];
            int i3 = a[1];
            boolean z = ((bI) ((bT) this.f3326b.Y.get(i2)).f2147g.get(i3)).f3317a.f2137f;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f3326b.an;
            Bundle bundle = new Bundle(4);
            bundle.putSerializable("key0", this.f3326b);
            bundle.putSerializable("key1", Integer.valueOf(i2));
            bundle.putSerializable("key2", Integer.valueOf(i3));
            bundle.putSerializable("key3", Boolean.valueOf(z));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public final void m3644a() {
        this.f3326b.al.m2086b();
    }

    public final void m3645a(int i) {
        m3643c(i);
    }

    public final void m3646b(int i) {
        m3643c(i);
    }
}
