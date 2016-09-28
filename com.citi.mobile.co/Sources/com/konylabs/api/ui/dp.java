package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

final class dp implements OnClickListener {
    private /* synthetic */ dm f1223a;

    dp(dm dmVar) {
        this.f1223a = dmVar;
    }

    public final void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        int selectedItemId = (int) this.f1223a.f2908d.getSelectedItemId();
        if (KonyMain.f3657e) {
            Log.d("KonySegUIPageView", "onClick : Printing the OnclickListener focus image position = " + intValue + " Current Selection = " + selectedItemId);
        }
        if (intValue != selectedItemId) {
            if (intValue > selectedItemId) {
                this.f1223a.f2908d.setSelection(selectedItemId + 1, true);
            } else {
                this.f1223a.f2908d.setSelection(selectedItemId - 1, false);
            }
            this.f1223a.f2908d.requestLayout();
        }
    }
}
