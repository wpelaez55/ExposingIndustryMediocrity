package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class he implements OnSeekBarChangeListener {
    private /* synthetic */ hd f1517a;

    he(hd hdVar) {
        this.f1517a = hdVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.f1517a.f4383o || !z) {
            this.f1517a.f4383o = false;
            return;
        }
        int a = this.f1517a.f4382n.m1236a();
        int c = (this.f1517a.f4385q / a) * a;
        if (a > 1) {
            if (i >= c) {
                this.f1517a.f4382n.setProgress(c);
            } else {
                this.f1517a.f4382n.setProgress(Math.round(((float) i) / ((float) a)) * a);
            }
        }
        LuaNil table = this.f1517a.getTable(hd.f4369a);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f1517a);
            a = (a * (this.f1517a.f4382n.getProgress() / a)) + this.f1517a.f4382n.m1243b();
            hd.m4670a(this.f1517a, a);
            if (a <= this.f1517a.f4382n.m1248c()) {
                bundle.putSerializable("key1", new Double((double) a));
            }
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        LuaNil table = this.f1517a.getTable(hd.f4370b);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1517a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
        this.f1517a.f4382n.m1265i();
    }
}
