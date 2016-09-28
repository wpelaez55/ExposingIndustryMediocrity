package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;
import java.util.Iterator;

public final class ad extends LinearLayout implements dK {
    public static int f2566a;
    public static int f2567b;
    public static int f2568c;
    private int[] f2569d;
    private boolean f2570e;
    private ArrayList f2571f;
    private LayoutParams f2572g;
    private int[] f2573h;
    private int[] f2574i;
    private Context f2575j;
    private boolean f2576k;
    private C0219u f2577l;
    private LayoutParams f2578m;
    private int f2579n;

    static {
        f2566a = 19;
        f2567b = 21;
        f2568c = 17;
    }

    public ad(Context context) {
        super(context);
        this.f2569d = null;
        this.f2570e = false;
        this.f2571f = new ArrayList();
        this.f2572g = null;
        this.f2573h = new int[]{0, 0, 0, 0};
        this.f2574i = new int[]{0, 0, 0, 0};
        this.f2576k = false;
        this.f2579n = -1;
        this.f2575j = context;
        this.f2572g = new LayoutParams(-1, -2);
        setOrientation(1);
        setGravity(48);
        setDrawingCacheEnabled(false);
    }

    public final ArrayList m2574a() {
        return this.f2571f;
    }

    public final void m2575a(float f) {
        this.f2572g.width = 0;
        this.f2572g.weight = f;
    }

    public final void m2576a(int i) {
        super.setVisibility(i);
    }

    public final void m2577a(ah ahVar) {
        if (ahVar != null && !this.f2571f.contains(ahVar)) {
            this.f2571f.add(ahVar);
            addView(ahVar.m537a());
        }
    }

    public final void m2578a(ah ahVar, int i) {
        if (ahVar != null && !this.f2571f.contains(ahVar)) {
            this.f2571f.add(i, ahVar);
            addView(ahVar.m537a(), i);
        }
    }

    public final void m2579a(dB dBVar, dB dBVar2, dB dBVar3) {
        Iterator it = this.f2571f.iterator();
        while (it.hasNext()) {
            ah ahVar = (ah) it.next();
            ahVar.m540a(dBVar);
            ahVar.m546b(dBVar3);
            ahVar.m548c(dBVar2);
        }
    }

    public final void m2580a(String str) {
        Iterator it = this.f2571f.iterator();
        while (it.hasNext()) {
            ah ahVar = (ah) it.next();
            ahVar.m542a(str);
            ahVar.m531e();
        }
    }

    public final void m2581a(boolean z) {
        this.f2570e = z;
    }

    public final void m2582a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = this.f2574i;
            iArr2[i] = iArr2[i] + iArr[i];
        }
        ez.m1344a(iArr, this, this.f2572g);
    }

    public final void m2583b(int i) {
        Iterator it = this.f2571f.iterator();
        while (it.hasNext()) {
            ((ah) it.next()).m538a(i);
        }
    }

    public final void m2584b(String str) {
        Iterator it = this.f2571f.iterator();
        while (it.hasNext()) {
            ah ahVar = (ah) it.next();
            ahVar.m547b(str);
            ahVar.m531e();
        }
    }

    public final void m2585b(boolean z) {
    }

    public final void m2586b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = this.f2573h;
            iArr2[i] = iArr2[i] + iArr[i];
        }
        setPadding(this.f2573h[0], this.f2573h[1], this.f2573h[2], this.f2573h[3]);
    }

    public final int[] m2587b() {
        int i = 0;
        Iterator it = this.f2571f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = ((ah) it.next()).f544s ? i2 + 1 : i2;
        }
        this.f2569d = new int[i2];
        it = this.f2571f.iterator();
        i2 = 0;
        while (it.hasNext()) {
            int i3;
            if (((ah) it.next()).f544s) {
                this.f2569d[i2] = i;
                i3 = i2 + 1;
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        return this.f2569d;
    }

    public final void m2588c() {
        if (this.f2571f != null) {
            Iterator it = this.f2571f.iterator();
            while (it.hasNext()) {
                ((ah) it.next()).m544b();
            }
        }
    }

    public final void m2589c(int i) {
        Iterator it = this.f2571f.iterator();
        while (it.hasNext()) {
            ((ah) it.next()).m545b(i);
        }
    }

    public final void m2590c(String str) {
        Iterator it = this.f2571f.iterator();
        while (it.hasNext()) {
            ah ahVar = (ah) it.next();
            if (ahVar.f526a.equals(str)) {
                this.f2571f.remove(ahVar);
                removeView(ahVar.m537a());
                ahVar.m544b();
            }
        }
    }

    public final void m2591c(int[] iArr) {
        int i;
        if (this.f2570e) {
            this.f2569d = new int[]{iArr[0]};
        } else {
            this.f2569d = iArr;
        }
        int size = this.f2571f.size();
        for (i = 0; i < this.f2569d.length; i++) {
            if (this.f2569d[i] < size) {
                ((ah) this.f2571f.get(this.f2569d[i])).m543a(true);
            }
        }
        int i2 = 0;
        i = 0;
        while (i2 < size) {
            int i3;
            if (i >= this.f2569d.length || i2 != this.f2569d[i]) {
                if (((ah) this.f2571f.get(i2)).f544s) {
                    ((ah) this.f2571f.get(i2)).m543a(false);
                }
                i3 = i;
            } else {
                if (!((ah) this.f2571f.get(i2)).f544s) {
                    ((ah) this.f2571f.get(i2)).m543a(true);
                }
                i3 = i + 1;
            }
            i2++;
            i = i3;
        }
    }

    public final View m2592d() {
        super.setLayoutParams(this.f2572g);
        if (this.f2579n < 0) {
            return this;
        }
        if (this.f2577l == null) {
            this.f2577l = new C0219u(KonyMain.getActContext());
            this.f2577l.setScrollContainer(true);
            this.f2577l.m1577a(cW.f2718i);
            this.f2578m = new LayoutParams(-2, -2);
            this.f2578m.height = this.f2579n;
            this.f2577l.setLayoutParams(this.f2578m);
            View c0174b = new C0174B(this.f2575j);
            c0174b.addView(this);
            this.f2577l.addView(c0174b);
        }
        return this.f2577l;
    }

    public final void m2593d(int i) {
        if (i < this.f2571f.size()) {
            ah ahVar = (ah) this.f2571f.remove(i);
            removeViewAt(i);
            ahVar.m544b();
        }
    }

    public final void m2594e() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m2595e(int i) {
        this.f2579n = i;
        if (this.f2577l != null) {
            this.f2578m.height = this.f2579n;
            this.f2577l.setLayoutParams(this.f2578m);
            post(new ae(this));
        }
    }

    public final void m2596f() {
    }
}
