package com.konylabs.api.ui;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import com.konylabs.android.KonyMain;

final class bQ implements OnItemClickListener {
    private /* synthetic */ bO f782a;

    bQ(bO bOVar) {
        this.f782a = bOVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (KonyMain.f3657e) {
            Log.d("KonyListBox", "LuaListBox: item select listener called - position = " + i);
        }
        bS bSVar = (bS) ((ArrayAdapter) adapterView.getAdapter()).getItem(i);
        if (bSVar != null) {
            if (this.f782a.getChoiceMode() == 2) {
                if (this.f782a.f776v.contains(bSVar)) {
                    this.f782a.f776v.remove(bSVar);
                } else {
                    this.f782a.f776v.add(bSVar);
                }
            } else if (!this.f782a.f776v.contains(bSVar)) {
                this.f782a.f776v.clear();
                this.f782a.f776v.add(bSVar);
            }
            this.f782a.f758d.setText(bSVar.f785b);
            if (this.f782a.f760f != null) {
                bV bVVar = this.f782a.f760f;
                bO bOVar = this.f782a;
                bVVar.m829a();
            }
            if (this.f782a.getChoiceMode() == 1) {
                this.f782a.f746L.onKey(this.f782a.f759e, 4, new KeyEvent(1, 4));
            }
        }
    }
}
