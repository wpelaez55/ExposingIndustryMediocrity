package com.konylabs.api.ui;

import java.util.Iterator;

public class en {
    final /* synthetic */ fv f1315a;

    en(fv fvVar) {
        this.f1315a = fvVar;
    }

    public void m1339a(int i) {
        LuaWidget.f3529O = i;
        Iterator it = this.f1315a.bA.iterator();
        while (it.hasNext()) {
            ((C0211m) it.next()).onFormHeightChanged(LuaWidget.f3529O);
        }
    }
}
