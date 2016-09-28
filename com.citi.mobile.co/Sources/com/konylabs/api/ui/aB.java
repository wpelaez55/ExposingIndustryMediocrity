package com.konylabs.api.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public final class aB {
    Hashtable f413a;
    LinearLayout f414b;
    int f415c;
    private C0174B f416d;
    private aw f417e;
    private Hashtable f418f;
    private dB f419g;
    private HashMap f420h;
    private Drawable f421i;
    private boolean f422j;
    private /* synthetic */ av f423k;

    public aB(av avVar, aw awVar) {
        this.f423k = avVar;
        this.f413a = new Hashtable();
        this.f418f = new Hashtable();
        this.f422j = false;
        this.f417e = awVar;
        this.f420h = new HashMap(this.f417e.f616a.size(), 1.0f);
    }

    protected final View m419a() {
        if (this.f414b != null) {
            return this.f414b;
        }
        this.f414b = new LinearLayout(this.f423k.f595a);
        this.f414b.setOrientation(1);
        this.f416d = new C0174B(this.f423k.f595a);
        this.f416d.m131b(av.m589a(this.f423k, 3));
        int size = this.f417e.f616a.size();
        ArrayList arrayList = this.f417e.f616a;
        for (int i = 0; i < size; i++) {
            View view;
            ay ayVar = (ay) arrayList.get(i);
            String str = (String) this.f413a.get(ayVar.f628c);
            View f;
            if (ayVar.f627b == az.TEXT) {
                bM bMVar = new bM(this.f423k.f595a);
                bMVar.m736a(true);
                bMVar.m742b(true);
                bMVar.m729a(ayVar.m649c());
                bMVar.m745c(ayVar.m649c());
                bMVar.m743b(new int[]{this.f423k.f603i[0], this.f423k.f603i[1], this.f423k.f603i[2], this.f423k.f603i[3]});
                if (str != null) {
                    bMVar.m733a(str);
                }
                bMVar.m728a((float) ayVar.m646b());
                bMVar.m751e();
                f = bMVar.m753f();
                this.f420h.put(ayVar.f628c, bMVar);
                view = f;
            } else {
                bt btVar = new bt(this.f423k.f595a);
                btVar.m890a((float) ayVar.m646b());
                btVar.m907c(ayVar.m649c());
                btVar.setPadding(this.f423k.f603i[0], this.f423k.f603i[1], this.f423k.f603i[2], this.f423k.f603i[3]);
                if (str != null) {
                    btVar.m908c(str);
                }
                btVar.m906c();
                f = btVar.m910d();
                this.f420h.put(ayVar.f628c, btVar);
                view = f;
            }
            this.f416d.m131b(view);
            this.f416d.m131b(av.m589a(this.f423k, 17));
        }
        this.f416d.m143e();
        m426e();
        this.f414b.addView(this.f416d);
        this.f414b.addView(av.m588a(this.f423k));
        this.f414b.setFocusable(true);
        this.f414b.setOnFocusChangeListener(this.f423k.f596b);
        this.f414b.setOnClickListener(this.f423k.f596b);
        this.f414b.setTag(this);
        return this.f414b;
    }

    public final void m420a(dB dBVar) {
        if (this.f419g != dBVar) {
            this.f419g = dBVar;
            this.f421i = null;
            if (this.f414b != null) {
                m426e();
            }
        }
    }

    public final void m421a(String str, dB dBVar) {
        if (dBVar != null) {
            this.f418f.put(str, dBVar);
        } else {
            this.f418f.remove(str);
        }
        if (this.f414b != null) {
            View view = (View) this.f420h.get(str);
            if (view instanceof bM) {
                bM bMVar = (bM) view;
                bMVar.m732a(dBVar);
                bMVar.m738b();
                if (dBVar == null) {
                    m426e();
                }
            }
        }
    }

    public final void m422a(String str, String str2) {
        this.f413a.put(str, str2);
        if (this.f414b != null) {
            View view = (View) this.f420h.get(str);
            if (view instanceof bM) {
                ((bM) view).m733a(str2);
            } else if (view instanceof bt) {
                ((bt) view).m908c(str2);
            }
        }
    }

    public final void m423b() {
        if (this.f420h != null) {
            for (View view : this.f420h.values()) {
                if (view instanceof bM) {
                    ((bM) view).m754g();
                } else if (view instanceof bt) {
                    ((bt) view).m915f();
                }
            }
            this.f420h.clear();
            this.f420h = null;
        }
        if (this.f416d != null) {
            this.f416d.setBackgroundDrawable(null);
            this.f416d.m146f();
        }
        if (this.f414b != null) {
            this.f414b.removeAllViews();
            this.f414b = null;
        }
        if (this.f417e != null) {
            this.f417e.m639b();
        }
        if (this.f418f != null) {
            this.f418f.clear();
            this.f418f = null;
        }
        this.f419g = null;
        this.f421i = null;
    }

    public final void m424c() {
        this.f416d.setBackgroundDrawable(this.f423k.f601g);
        for (View view : this.f420h.values()) {
            if (view instanceof bM) {
                TextView textView = (bM) view;
                if (textView.m727a() == null && this.f423k.f598d != null) {
                    this.f423k.f598d.m1129b(textView);
                }
            }
        }
    }

    public final void m425d() {
        this.f416d.setBackgroundDrawable(this.f423k.f602h);
        for (View view : this.f420h.values()) {
            if (view instanceof bM) {
                TextView textView = (bM) view;
                if (textView.m727a() == null && this.f423k.f598d != null) {
                    this.f423k.f598d.m1129b(textView);
                }
            }
        }
    }

    public final void m426e() {
        dB g = this.f419g != null ? this.f419g : (this.f423k.f600f == null || this.f415c % 2 == 0) ? this.f423k.f599e : this.f423k.f600f;
        if (g != null && this.f421i == null) {
            this.f421i = g.m1162p();
        }
        this.f416d.setBackgroundDrawable(this.f421i);
        for (String str : this.f420h.keySet()) {
            View view = (View) this.f420h.get(str);
            if (view instanceof bM) {
                view = (bM) view;
                dB dBVar = (dB) this.f418f.get(str);
                if (dBVar != null) {
                    view.m732a(dBVar);
                    view.m738b();
                } else if (g != null) {
                    g.m1129b((TextView) view);
                } else {
                    dB.m1105a(view);
                }
            }
        }
    }
}
