package com.konylabs.api.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.C0300p;

final class hZ implements AnimatorListener {
    final /* synthetic */ LuaWidget f1511a;
    private /* synthetic */ C0300p f1512b;
    private /* synthetic */ LuaTable f1513c;

    hZ(LuaWidget luaWidget, C0300p c0300p, LuaTable luaTable) {
        this.f1511a = luaWidget;
        this.f1512b = c0300p;
        this.f1513c = luaTable;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        LuaNil table = this.f1513c.getTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS);
        table = table != LuaNil.nil ? ((LuaTable) table).getTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED) : null;
        if (!(table == null || table == LuaNil.nil || this.f1511a.f3530E != LuaWidget.KONY_WIDGET_RESTORE)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1511a);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
        this.f1511a.getWidget().post(new ia(this));
        if (this.f1512b != null) {
            this.f1512b.m2215a();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f1512b != null) {
            C0300p c0300p = this.f1512b;
        }
        LuaNil table = this.f1513c.getTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS);
        table = table != LuaNil.nil ? ((LuaTable) table).getTable(LuaWidget.ATTR_WIDGET_ANIM_STARTED) : null;
        if (table != null && table != LuaNil.nil && this.f1511a.f3530E == LuaWidget.KONY_WIDGET_RESTORE) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1511a);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
