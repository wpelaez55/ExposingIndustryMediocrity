package com.konylabs.api.ui;

import android.support.v4.view.ViewPager.LayoutParams;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost.TabContentFactory;
import com.konylabs.android.KonyMain;

public final class dW implements TabContentFactory {
    private String f1140a;
    private String f1141b;
    private String f1142c;
    private dL f1143d;
    private int f1144e;
    private /* synthetic */ dU f1145f;

    dW(dU dUVar, String str, String str2, String str3, int i) {
        this.f1145f = dUVar;
        this.f1140a = null;
        this.f1141b = null;
        this.f1142c = null;
        this.f1144e = 0;
        this.f1140a = str;
        this.f1141b = str2;
        this.f1142c = str3;
        this.f1144e = i;
    }

    public final void m1197a(dL dLVar) {
        this.f1143d = dLVar;
    }

    public final View createTabContent(String str) {
        View a = this.f1143d.m1184a();
        View linearLayout = new LinearLayout(KonyMain.getActivityContext());
        linearLayout.addView(a);
        if (this.f1145f.f2874w || (this.f1145f.f2853a && !this.f1143d.m1186c())) {
            a = new C0219u(KonyMain.getActContext());
            a.setScrollContainer(true);
            a.m1577a(cW.f2718i);
            a.setLayoutParams(new LayoutParams());
            a.addView(linearLayout);
            linearLayout = a;
        }
        if (this.f1145f.f2859g != null) {
            this.f1145f.f2859g.m1188a(this.f1144e);
        }
        return linearLayout;
    }
}
