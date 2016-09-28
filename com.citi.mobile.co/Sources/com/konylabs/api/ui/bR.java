package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;

final class bR extends ArrayAdapter {
    private /* synthetic */ bO f783a;

    public bR(bO bOVar, Context context, int i) {
        this.f783a = bOVar;
        super(context, i);
        bOVar.f761g = new ArrayList();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        CheckedTextView checkedTextView;
        if (view == null) {
            view = super.getDropDownView(i, view, viewGroup);
            CheckedTextView checkedTextView2 = (CheckedTextView) view.findViewById(16908308);
            if (this.f783a.f750P != null) {
                checkedTextView2.setCheckMarkDrawable(this.f783a.f750P);
            }
            this.f783a.m771a(view);
            this.f783a.f757c = checkedTextView2.getEllipsize();
            checkedTextView = checkedTextView2;
        } else {
            checkedTextView = (CheckedTextView) view.findViewById(16908308);
        }
        checkedTextView.setGravity(this.f783a.f754T);
        checkedTextView.setSingleLine(this.f783a.f755a);
        if (this.f783a.f755a) {
            checkedTextView.setEllipsize(this.f783a.f756b);
        } else {
            checkedTextView.setEllipsize(this.f783a.f757c);
        }
        bS bSVar = (bS) this.f783a.f778x.getItem(i);
        checkedTextView.setText(bSVar.f785b);
        this.f783a.m789a(checkedTextView, bSVar.f784a);
        if (!this.f783a.f761g.contains(view)) {
            this.f783a.f761g.add(view);
        }
        if (bSVar.f786c != null) {
            view.setContentDescription(bSVar.f786c);
        } else if (KonyMain.f3656d >= 16) {
            view.setImportantForAccessibility(2);
        }
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }
}
