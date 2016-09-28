package ny0k;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.util.SparseArray;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

/* renamed from: ny0k.d */
final class C0290d implements AnimatorListener {
    final /* synthetic */ SparseArray f2326a;
    final /* synthetic */ C0426c f2327b;

    C0290d(C0426c c0426c, SparseArray sparseArray) {
        this.f2327b = c0426c;
        this.f2326a = sparseArray;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2327b.a.getWidget().post(new C0292f(this));
        if (this.f2327b.f3448h != null && this.f2327b.f3448h != LuaNil.nil) {
            try {
                ((Function) this.f2327b.f3448h).execute(new Object[]{this.f2327b});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        if (this.f2327b.f3449i != null && this.f2327b.f3449i != LuaNil.nil) {
            try {
                ((Function) this.f2327b.f3449i).execute(new Object[]{this.f2327b});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f2327b.a.getWidget().post(new C0291e(this));
        if (this.f2327b.f3447g != null && this.f2327b.f3447g != LuaNil.nil) {
            try {
                ((Function) this.f2327b.f3447g).execute(new Object[]{this.f2327b});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
