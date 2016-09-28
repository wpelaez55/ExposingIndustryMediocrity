package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import com.konylabs.android.KonyMain;

final class dq implements OnItemClickListener {
    private /* synthetic */ dm f1224a;

    dq(dm dmVar) {
        this.f1224a = dmVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f1224a.f2913i != null && i >= 0 && i <= this.f1224a.f2913i.size()) {
            if (this.f1224a.f2913i.size() > i) {
                dv dvVar = (dv) this.f1224a.f2913i.elementAt(i);
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "OnclickListener callback position = " + i + " isClickable = " + dvVar.f1230b);
                }
                if (!(dvVar.f1230b == null || dvVar.f1230b.f1547a)) {
                    return;
                }
            }
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "Entering OnclickListener callback onclickHandler = " + this.f1224a.f2912h);
            }
            if (this.f1224a.f2912h != null) {
                View childAt = ((LinearLayout) view).getChildAt(0);
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "Printing the parent passed to OnclickListener = " + ((LinearLayout) view));
                    Log.d("KonySegUIPageView", "Printing the child passed to OnclickListener = " + childAt);
                }
                this.f1224a.f2912h.m1404a(i, true);
            }
        }
    }
}
