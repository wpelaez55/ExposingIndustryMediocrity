package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.chartinterface.IXYMultiSeriesDataSet;
import com.konylabs.chartinterface.IXYMultiSeriesRenderer;
import com.konylabs.chartinterface.KonyChartInterface;

/* renamed from: com.konylabs.api.ui.W */
public final class C0193W extends LinearLayout {
    private Context f330a;
    private LayoutParams f331b;
    private int[] f332c;
    private int[] f333d;
    private View f334e;
    private KonyChartInterface f335f;
    private IXYMultiSeriesDataSet f336g;
    private IXYMultiSeriesRenderer f337h;
    private int f338i;
    private boolean f339j;

    public C0193W(Context context) {
        super(context);
        this.f331b = null;
        this.f332c = new int[]{0, 0, 0, 0};
        this.f333d = new int[]{0, 0, 0, 0};
        this.f339j = false;
        this.f330a = context;
        this.f331b = new LayoutParams(-2, -2);
        this.f335f = C0193W.m316e();
        if (this.f335f == null) {
            throw new RuntimeException("Chart Engine Not Initialized");
        }
    }

    public static void m315c() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.konylabs.chartinterface.KonyChartInterface m316e() {
        /*
        r0 = "com.konylabs.chartenginterface.AChartEngineInterface";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000d, IllegalAccessException -> 0x0013, InstantiationException -> 0x0018 }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x000d, IllegalAccessException -> 0x0013, InstantiationException -> 0x0018 }
        r0 = (com.konylabs.chartinterface.KonyChartInterface) r0;	 Catch:{ ClassNotFoundException -> 0x000d, IllegalAccessException -> 0x0013, InstantiationException -> 0x0018 }
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x0011:
        r0 = 0;
        goto L_0x000c;
    L_0x0013:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0011;
    L_0x0018:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.W.e():com.konylabs.chartinterface.KonyChartInterface");
    }

    public final void m317a() {
        if (!this.f339j) {
            if (this.f334e == null) {
                this.f334e = this.f335f.getChartView(this.f330a, this.f336g, this.f337h, this.f338i);
                this.f331b = new LayoutParams(-2, (int) (getContext().getResources().getDisplayMetrics().density * 200.0f));
                setLayoutParams(this.f331b);
                addView(this.f334e, new LayoutParams(-1, -1));
            }
            this.f339j = true;
        }
    }

    public final void m318a(int i) {
        setVisibility(i);
    }

    public final void m319a(IXYMultiSeriesDataSet iXYMultiSeriesDataSet) {
        this.f336g = iXYMultiSeriesDataSet;
    }

    public final void m320a(IXYMultiSeriesRenderer iXYMultiSeriesRenderer) {
        this.f337h = iXYMultiSeriesRenderer;
    }

    public final void m321a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = this.f332c;
            iArr2[i] = iArr2[i] + iArr[i];
        }
        this.f331b.setMargins(this.f332c[0], this.f332c[1], this.f332c[2], this.f332c[3]);
    }

    public final View m322b() {
        return this;
    }

    public final void m323b(int i) {
        this.f338i = i;
    }

    public final void m324b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = this.f333d;
            iArr2[i] = iArr2[i] + iArr[i];
        }
        setPadding(this.f333d[0], this.f333d[1], this.f333d[2], this.f333d[3]);
    }

    public final KonyChartInterface m325d() {
        return this.f335f;
    }
}
