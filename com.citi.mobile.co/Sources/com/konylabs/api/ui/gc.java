package com.konylabs.api.ui;

final class gc implements ex {
    private /* synthetic */ gb f3004a;

    gc(gb gbVar) {
        this.f3004a = gbVar;
    }

    public final void m3329a(boolean z) {
        if (z) {
            this.f3004a.m4864M().m4653a(null);
            if (this.f3004a.f4581S == 2) {
                gb.f4579R = true;
                return;
            }
            gb.f4578Q = true;
            gb.m4875d(gb.f4573A);
            synchronized (gb.f4576D) {
                gb.f4576D.notifyAll();
            }
        }
    }
}
