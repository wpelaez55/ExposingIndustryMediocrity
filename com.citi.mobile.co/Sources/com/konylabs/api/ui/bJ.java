package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;

public final class bJ extends BaseAdapter {
    private Context f699a;
    private /* synthetic */ bG f700b;

    public bJ(bG bGVar, Context context) {
        this.f700b = bGVar;
        this.f699a = context;
    }

    public final int getCount() {
        return this.f700b.f683m.size();
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        bK bKVar = (bK) this.f700b.f683m.elementAt(i);
        if (bKVar.f702b == null) {
            int intrinsicHeight;
            int i2;
            bKVar.f702b = new bw(this.f699a);
            int b = this.f700b.f678B;
            int c = this.f700b.f679C;
            if (this.f700b.f691u != null) {
                Drawable c2 = dB.m1112c(this.f700b.f691u);
                if (c2 instanceof BitmapDrawable) {
                    ((BitmapDrawable) c2).setAntiAlias(true);
                }
                bKVar.f702b.m932a(c2);
                if (b <= 0) {
                    b = c2.getIntrinsicWidth();
                }
                intrinsicHeight = c > 0 ? c : c2.getIntrinsicHeight();
                i2 = b;
            } else {
                intrinsicHeight = c;
                i2 = b;
            }
            if (this.f700b.f690t != null) {
                bKVar.f702b.m944b(this.f700b.f690t);
            }
            if (i2 > 0) {
                this.f700b.f687q = i2;
            }
            if (intrinsicHeight > 0) {
                this.f700b.f688r = intrinsicHeight;
            }
            bKVar.f702b.setLayoutParams(new LayoutParams(this.f700b.f687q, this.f700b.f688r));
            if (this.f700b.f680D == bG.f667a) {
                bKVar.f702b.m963l();
            } else if (this.f700b.f680D == bG.f668b) {
                bKVar.f702b.m962k();
            }
            bKVar.f702b.setPadding(this.f700b.f677A, this.f700b.f677A, this.f700b.f677A, this.f700b.f677A);
            bKVar.f702b.setBackgroundDrawable(this.f700b.f696z);
            bKVar.f702b.m948c(bKVar.f701a);
        }
        return bKVar.f702b;
    }
}
