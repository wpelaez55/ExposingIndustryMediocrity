package com.konylabs.api;

final class at implements Runnable {
    private /* synthetic */ int f117a;
    private /* synthetic */ Object[] f118b;
    private /* synthetic */ as f119c;

    at(as asVar, int i, Object[] objArr) {
        this.f119c = asVar;
        this.f117a = i;
        this.f118b = objArr;
    }

    public final void run() {
        this.f119c.f2410a = as.m2336a(this.f117a, this.f118b);
    }
}
