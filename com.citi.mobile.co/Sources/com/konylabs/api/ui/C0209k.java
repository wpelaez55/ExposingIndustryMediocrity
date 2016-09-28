package com.konylabs.api.ui;

import android.view.View;
import android.widget.Adapter;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.konylabs.api.ui.k */
final class C0209k {
    private HashMap f1600a;
    private Adapter f1601b;
    private int f1602c;
    private ArrayList f1603d;

    private C0209k(C0203f c0203f, byte b) {
        this.f1600a = new HashMap();
    }

    public final View m1455a(int i) {
        ArrayList arrayList;
        if (this.f1602c != 1 || this.f1603d == null) {
            arrayList = (ArrayList) this.f1600a.get(Integer.valueOf(this.f1601b.getItemViewType(i)));
        } else {
            arrayList = this.f1603d;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            if (size != 0) {
                return (View) arrayList.remove(size - 1);
            }
        }
        return null;
    }

    public final void m1456a() {
        this.f1600a.clear();
        this.f1602c = this.f1601b.getViewTypeCount();
        this.f1603d = null;
    }

    public final void m1457a(int i, View view) {
        ArrayList arrayList;
        if (this.f1602c != 1 || this.f1603d == null) {
            int itemViewType = this.f1601b.getItemViewType(i);
            arrayList = (ArrayList) this.f1600a.get(Integer.valueOf(itemViewType));
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1600a.put(Integer.valueOf(itemViewType), arrayList);
                if (this.f1602c == 1) {
                    this.f1603d = arrayList;
                }
            }
        } else {
            arrayList = this.f1603d;
        }
        arrayList.add(view);
    }

    public final void m1458a(Adapter adapter) {
        this.f1601b = adapter;
        m1456a();
        this.f1602c = adapter.getViewTypeCount();
    }
}
