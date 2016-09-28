package com.konylabs.api;

final class ag implements Runnable {
    private /* synthetic */ int f93a;
    private /* synthetic */ Object[] f94b;
    private /* synthetic */ af f95c;

    ag(af afVar, int i, Object[] objArr) {
        this.f95c = afVar;
        this.f93a = i;
        this.f94b = objArr;
    }

    public final void run() {
        af.m2324a(this.f95c, this.f93a, this.f94b);
    }
}
