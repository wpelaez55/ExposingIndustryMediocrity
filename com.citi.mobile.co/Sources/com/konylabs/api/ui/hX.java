package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.C0300p;

final class hX implements AnimationListener {
    final /* synthetic */ LuaWidget f1507a;
    private /* synthetic */ C0300p f1508b;
    private /* synthetic */ LuaTable f1509c;

    hX(LuaWidget luaWidget, C0300p c0300p, LuaTable luaTable) {
        this.f1507a = luaWidget;
        this.f1508b = c0300p;
        this.f1509c = luaTable;
    }

    public final void onAnimationEnd(Animation animation) {
        LuaNil table = this.f1509c.getTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS);
        table = table != LuaNil.nil ? ((LuaTable) table).getTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED) : null;
        if (!(table == null || table == LuaNil.nil || this.f1507a.f3530E != LuaWidget.KONY_WIDGET_RESTORE)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1507a);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
        if (this.f1508b != null) {
            this.f1508b.m2215a();
        }
        this.f1507a.getWidget().post(new hY(this));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (this.f1508b != null) {
            C0300p c0300p = this.f1508b;
        }
        LuaNil table = this.f1509c.getTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS);
        table = table != LuaNil.nil ? ((LuaTable) table).getTable(LuaWidget.ATTR_WIDGET_ANIM_STARTED) : null;
        if (table != null && table != LuaNil.nil && this.f1507a.f3530E == LuaWidget.KONY_WIDGET_RESTORE) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1507a);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
