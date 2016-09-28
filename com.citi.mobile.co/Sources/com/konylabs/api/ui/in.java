package com.konylabs.api.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;

final class in extends BaseAdapter {
    private LayoutInflater f1594a;
    private int f1595b;
    private ArrayList f1596c;
    private /* synthetic */ ij f1597d;

    public in(ij ijVar, Context context, int i, ArrayList arrayList) {
        this.f1597d = ijVar;
        this.f1594a = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f1595b = i;
        this.f1596c = arrayList;
    }

    public final io m1449a(int i) {
        return (io) this.f1596c.get(i);
    }

    public final int getCount() {
        if (this.f1596c == null) {
            return 0;
        }
        int size = this.f1596c.size();
        if (this.f1597d.f1576q == 1984 && size < 5) {
            this.f1597d.f1576q = 1985;
        }
        return this.f1597d.f1576q != 1984 ? size + 4 : size;
    }

    public final /* synthetic */ Object getItem(int i) {
        return m1449a(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        boolean z;
        if (view == null) {
            inflate = this.f1594a.inflate(this.f1595b, viewGroup, false);
            z = true;
        } else {
            z = false;
            inflate = view;
        }
        TextView textView = (TextView) inflate;
        io ioVar;
        if (this.f1597d.f1576q == 1984) {
            ioVar = (io) this.f1596c.get(i);
            textView.setText(ioVar.f1598b);
            textView.setFocusable(true);
            textView.setContentDescription(ioVar.f1599c);
        } else if (i < 2 || i >= this.f1596c.size() + 2) {
            if (KonyMain.f3656d >= 16) {
                inflate.setImportantForAccessibility(2);
            }
            textView.setText(BuildConfig.FLAVOR);
            textView.setFocusable(false);
        } else {
            ioVar = (io) this.f1596c.get(i - 2);
            textView.setText(ioVar.f1598b);
            textView.setFocusable(true);
            textView.setContentDescription(ioVar.f1599c);
            if (KonyMain.f3656d >= 16) {
                textView.setImportantForAccessibility(1);
            }
        }
        if (z) {
            ij.m1409a((TextView) inflate, this.f1597d.f1580u);
        }
        return inflate;
    }
}
