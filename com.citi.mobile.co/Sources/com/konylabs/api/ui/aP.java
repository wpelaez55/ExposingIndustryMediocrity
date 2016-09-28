package com.konylabs.api.ui;

import ny0k.ba;
import ny0k.bd;

final class aP implements bd {
    private /* synthetic */ aO f2521a;

    aP(aO aOVar) {
        this.f2521a = aOVar;
    }

    public final void m2497a(ba baVar) {
        if (baVar.m2035c() && (!this.f2521a.ak || baVar.m2037d())) {
            this.f2521a.m2488r();
            this.f2521a.f2475D.setTimeInMillis(baVar.m2038e().getTimeInMillis());
            this.f2521a.f2512r = this.f2521a.f2475D.get(1);
            this.f2521a.f2513s = this.f2521a.f2475D.get(2);
            this.f2521a.f2514t = this.f2521a.f2475D.get(5);
            this.f2521a.m2484n();
        }
        if (this.f2521a.at != null && (!this.f2521a.ak || baVar.m2037d())) {
            this.f2521a.at.m1401a(baVar.m2035c());
        }
        if (baVar.m2037d()) {
            if (baVar.m2035c()) {
                baVar.setSelected(true);
            }
        } else if (this.f2521a.ak) {
            baVar.invalidate();
        } else {
            int i = baVar.m2038e().get(2);
            int i2 = baVar.m2038e().get(1);
            if (i2 == this.f2521a.f2484M) {
                if (i > this.f2521a.f2483L) {
                    this.f2521a.m2485o();
                } else {
                    this.f2521a.m2486p();
                }
            } else if (i2 > this.f2521a.f2484M) {
                this.f2521a.m2485o();
            } else {
                this.f2521a.m2486p();
            }
        }
        if (!this.f2521a.ak || baVar.m2037d()) {
            this.f2521a.m2483m();
        }
    }
}
