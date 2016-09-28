package com.konylabs.api;

final class aj implements Runnable {
    private /* synthetic */ int f99a;
    private /* synthetic */ Object[] f100b;
    private /* synthetic */ ah f101c;

    aj(ah ahVar, int i, Object[] objArr) {
        this.f101c = ahVar;
        this.f99a = i;
        this.f100b = objArr;
    }

    public final void run() {
        this.f101c.m2325a(this.f99a, this.f100b);
    }
}
