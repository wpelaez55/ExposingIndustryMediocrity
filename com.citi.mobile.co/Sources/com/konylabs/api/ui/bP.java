package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.util.Log;
import android.view.KeyEvent;
import com.konylabs.android.KonyMain;

final class bP implements OnKeyListener {
    private /* synthetic */ bO f781a;

    bP(bO bOVar) {
        this.f781a = bOVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (KonyMain.f3657e) {
            Log.d("KonyListBox", "Dialog on key invoked");
        }
        if (i != 4) {
            return false;
        }
        if (this.f781a.f776v.size() > 0) {
            this.f781a.f758d.setText(((bS) this.f781a.f776v.get(0)).f785b);
        }
        dialogInterface.dismiss();
        return true;
    }
}
