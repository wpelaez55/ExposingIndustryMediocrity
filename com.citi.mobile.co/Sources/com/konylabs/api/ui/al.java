package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;

final class al extends ArrayAdapter {
    private /* synthetic */ ak f581a;

    public al(ak akVar, Context context) {
        this.f581a = akVar;
        super(context, 17367048);
        akVar.f561g = new ArrayList();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        an anVar;
        if (view == null) {
            view = super.getDropDownView(i, view, viewGroup);
            anVar = new an(this.f581a);
            anVar.f585a = (TextView) view.findViewById(16908308);
            anVar.f585a.setGravity(this.f581a.f554A);
            this.f581a.m559a(anVar.f585a);
            this.f581a.f560f = anVar.f585a.getEllipsize();
            view.setTag(anVar);
        } else {
            anVar = (an) view.getTag();
        }
        anVar.f585a.setText(((am) this.f581a.f569o.getItem(i)).f583b);
        anVar.f585a.setSingleLine(this.f581a.f556b);
        if (this.f581a.f556b) {
            anVar.f585a.setEllipsize(this.f581a.f558d);
        } else {
            anVar.f585a.setEllipsize(this.f581a.f560f);
        }
        this.f581a.m550a(anVar.f585a, false);
        if (!this.f581a.f561g.contains(view)) {
            this.f581a.f561g.add(view);
        }
        am amVar = (am) this.f581a.f569o.getItem(i);
        if (amVar.f584c != null) {
            view.setContentDescription(amVar.f584c);
        } else if (KonyMain.f3656d >= 16) {
            view.setImportantForAccessibility(2);
        }
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        an anVar;
        if (view == null) {
            view = super.getView(i, view, viewGroup);
            anVar = new an(this.f581a);
            anVar.f585a = (TextView) view.findViewById(16908308);
            anVar.f585a.setGravity(this.f581a.f554A);
            this.f581a.m550a(anVar.f585a, false);
            this.f581a.f559e = anVar.f585a.getEllipsize();
            view.setTag(anVar);
        } else {
            anVar = (an) view.getTag();
        }
        if (this.f581a.f567m != null) {
            anVar.f585a.setPadding(this.f581a.f567m.left, this.f581a.f567m.top, this.f581a.f567m.right, this.f581a.f567m.bottom);
        }
        anVar.f585a.setText(((am) this.f581a.f569o.getItem(i)).f583b);
        anVar.f585a.setSingleLine(this.f581a.f555a);
        if (this.f581a.f555a) {
            anVar.f585a.setEllipsize(this.f581a.f557c);
        } else {
            anVar.f585a.setEllipsize(this.f581a.f559e);
        }
        return view;
    }
}
