package com.konylabs.api.ui;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;

public final class af {
    private boolean f520a;
    private C0174B f521b;
    private dM f522c;
    private ah f523d;
    private LayoutAnimationController f524e;

    public af(ad adVar, ah ahVar) {
        this.f520a = false;
        this.f523d = ahVar;
    }

    public final View m516a() {
        return this.f521b;
    }

    public final void m517a(C0174B c0174b) {
        this.f521b = c0174b;
        Animation animationSet = new AnimationSet(true);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        animationSet.addAnimation(alphaAnimation);
        Animation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
        translateAnimation.setDuration(500);
        animationSet.addAnimation(translateAnimation);
        this.f524e = new LayoutAnimationController(animationSet, 0.5f);
        animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -1.0f);
        translateAnimation.setAnimationListener(new ag(this));
        translateAnimation.setDuration(500);
        animationSet.addAnimation(translateAnimation);
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animationSet, 0.5f);
    }

    public final void m518a(dM dMVar) {
        this.f522c = dMVar;
    }

    public final void m519a(boolean z) {
        if (!this.f520a) {
            if (this.f522c != null) {
                this.f522c.m1189a(this.f523d);
            }
            this.f520a = true;
        }
        if (z) {
            this.f521b.setLayoutAnimation(this.f524e);
            this.f521b.setVisibility(0);
            return;
        }
        this.f521b.setVisibility(8);
    }

    public final void m520b() {
        this.f521b.m146f();
        this.f521b = null;
    }
}
