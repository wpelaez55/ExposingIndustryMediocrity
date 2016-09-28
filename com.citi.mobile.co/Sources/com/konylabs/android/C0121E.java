package com.konylabs.android;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.fv;
import com.konylabs.api.ui.gZ;
import ny0k.C0307z;

/* renamed from: com.konylabs.android.E */
final class C0121E implements AnimationListener {
    public int f4a;
    public int f5b;
    public boolean f6c;
    final /* synthetic */ KonyMain f7d;
    private int f8e;

    C0121E(KonyMain konyMain) {
        this.f7d = konyMain;
    }

    public final void m10a(int i) {
        this.f8e = i;
    }

    public final void m11a(Animation animation) {
        if (animation instanceof C0307z) {
            fv b = fv.m4395b(this.f7d.ar);
            if (!this.f6c && this.f5b == 14) {
                View d = this.f7d.f3688u.m464d();
                float d2 = this.f7d.ac;
                LuaWidget A = b.m4429A();
                View view = null;
                if (A != null) {
                    view = A instanceof gZ ? ((gZ) A).m4854u() : A.getWidget();
                }
                if (A instanceof gZ) {
                    ((gZ) A).m4855v();
                }
                ((C0307z) animation).m2233a(d, view, d2);
            }
        }
    }

    public final void onAnimationEnd(Animation animation) {
        this.f7d.f3685Z.post(new C0122F(this, animation));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (animation instanceof C0307z) {
            fv b = fv.m4395b(KonyMain.f3653a);
            if (b != null) {
                View d = this.f7d.f3687t.m464d();
                LuaWidget A = fv.m4395b(KonyMain.f3653a).m4429A();
                View view = null;
                if (A != null) {
                    view = A instanceof gZ ? ((gZ) A).m4854u() : A.getWidget();
                }
                float z = b.m4468z();
                if (A instanceof gZ) {
                    ((gZ) A).m4856w();
                }
                ((C0307z) animation).m2233a(d, view, z);
            }
        }
    }
}
