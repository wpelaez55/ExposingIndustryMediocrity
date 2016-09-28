package com.konylabs.api.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

public final class aw {
    protected ArrayList f616a;
    private boolean f617b;
    private LinearLayout f618c;
    private C0174B f619d;
    private View f620e;
    private View f621f;
    private dB f622g;
    private ArrayList f623h;
    private ax f624i;
    private /* synthetic */ av f625j;

    public aw(av avVar) {
        this.f625j = avVar;
        this.f617b = true;
        this.f622g = null;
        this.f616a = new ArrayList();
        this.f623h = new ArrayList();
        this.f624i = null;
    }

    private void m634c() {
        if (this.f619d != null) {
            this.f619d.setBackgroundDrawable(this.f622g != null ? this.f622g.m1162p() : null);
            Iterator it = this.f623h.iterator();
            while (it.hasNext()) {
                View view = (bM) it.next();
                if (this.f622g != null) {
                    this.f622g.m1129b((TextView) view);
                } else {
                    dB.m1105a(view);
                }
            }
        }
    }

    protected final View m635a() {
        if (this.f618c != null) {
            return this.f618c;
        }
        this.f618c = new LinearLayout(this.f625j.f595a);
        this.f618c.setOrientation(1);
        this.f620e = av.m588a(this.f625j);
        this.f618c.addView(this.f620e);
        this.f619d = new C0174B(this.f625j.f595a);
        this.f619d.m131b(av.m589a(this.f625j, 3));
        for (int i = 0; i < this.f616a.size(); i++) {
            ay ayVar = (ay) this.f616a.get(i);
            bM bMVar = new bM(this.f625j.f595a);
            bMVar.m728a((float) ayVar.m646b());
            bMVar.m733a(ayVar.f630e);
            bMVar.m729a(ayVar.m649c());
            bMVar.m745c(ayVar.m649c());
            bMVar.m743b(new int[]{this.f625j.f603i[0], this.f625j.f603i[1], this.f625j.f603i[2], this.f625j.f603i[3]});
            bMVar.m751e();
            this.f623h.add(bMVar);
            View f = bMVar.m753f();
            if (ayVar.f626a != null) {
                if (this.f624i == null) {
                    this.f624i = new ax(this);
                }
                f.setOnClickListener(this.f624i);
                f.setTag(ayVar);
            }
            this.f619d.m131b(f);
            this.f619d.m131b(av.m589a(this.f625j, 17));
        }
        this.f619d.m143e();
        m634c();
        this.f618c.addView(this.f619d);
        this.f621f = av.m588a(this.f625j);
        this.f618c.addView(this.f621f);
        if (!this.f617b) {
            this.f620e.setVisibility(8);
            this.f619d.setVisibility(8);
        }
        return this.f618c;
    }

    public final void m636a(ay ayVar) {
        if (this.f616a.contains(ayVar)) {
            throw new RuntimeException("Column already exists : " + ayVar.f628c);
        }
        this.f616a.add(ayVar);
    }

    public final void m637a(dB dBVar) {
        if (this.f622g != dBVar) {
            this.f622g = dBVar;
            m634c();
        }
    }

    public final void m638a(boolean z) {
        int i = 0;
        this.f617b = z;
        if (this.f618c != null) {
            this.f620e.setVisibility(z ? 0 : 8);
            C0174B c0174b = this.f619d;
            if (!z) {
                i = 8;
            }
            c0174b.setVisibility(i);
        }
    }

    public final void m639b() {
        if (this.f623h != null) {
            this.f623h.clear();
            this.f623h = null;
        }
        if (this.f619d != null) {
            this.f619d.m146f();
            this.f619d = null;
        }
        if (this.f618c != null) {
            this.f618c.removeAllViews();
            this.f618c = null;
        }
        if (this.f616a != null) {
            this.f616a.clear();
            this.f616a = null;
        }
        this.f620e = null;
        this.f621f = null;
    }
}
