package com.konylabs.api.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class gP implements AnimationListener {
    private /* synthetic */ gL f1459a;

    gP(gL gLVar, gL gLVar2) {
        this.f1459a = gLVar2;
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f1459a != null) {
            this.f1459a.cleanup();
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
