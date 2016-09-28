package com.konylabs.api.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

final class hW implements AnimationListener {
    private /* synthetic */ Object f1504a;
    private /* synthetic */ Object f1505b;
    private /* synthetic */ LuaWidget f1506c;

    hW(LuaWidget luaWidget, Object obj, Object obj2) {
        this.f1506c = luaWidget;
        this.f1504a = obj;
        this.f1505b = obj2;
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f1505b != null && this.f1505b != LuaNil.nil) {
            try {
                ((Function) this.f1505b).execute(new Object[]{this.f1506c});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (this.f1504a != null && this.f1504a != LuaNil.nil) {
            try {
                ((Function) this.f1504a).execute(new Object[]{this.f1506c});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
