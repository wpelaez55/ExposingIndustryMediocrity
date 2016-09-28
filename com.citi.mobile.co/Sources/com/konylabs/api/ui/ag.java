package com.konylabs.api.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ag implements AnimationListener {
    private /* synthetic */ af f525a;

    ag(af afVar) {
        this.f525a = afVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f525a.f521b.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
