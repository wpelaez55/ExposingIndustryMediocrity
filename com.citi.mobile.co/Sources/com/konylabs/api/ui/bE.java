package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;

public final class bE extends BaseAdapter {
    private Context f663a;
    private /* synthetic */ bA f664b;

    public bE(bA bAVar, Context context) {
        this.f664b = bAVar;
        this.f663a = context;
    }

    public final int getCount() {
        return this.f664b.f644g.size();
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        bF bFVar = (bF) this.f664b.f644g.elementAt(i);
        if (bFVar.f666b == null) {
            bFVar.f666b = new bt(this.f663a);
            bFVar.f666b.m908c(bFVar.f665a);
            if (this.f664b.f653s != null) {
                bFVar.f666b.m895a(this.f664b.f653s);
            }
            if (this.f664b.f652r != null) {
                bFVar.f666b.m903b(this.f664b.f652r);
            }
            bFVar.f666b.setLayoutParams(new LayoutParams(bA.f635a, bA.f636b));
            bFVar.f666b.setScaleType(ScaleType.CENTER_INSIDE);
            bFVar.f666b.setPadding(this.f664b.f659y, this.f664b.f659y, this.f664b.f659y, this.f664b.f659y);
            bFVar.f666b.setBackgroundDrawable(this.f664b.f658x);
        }
        return bFVar.f666b;
    }
}
