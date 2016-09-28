package com.konylabs.api;

final class az implements Runnable {
    private /* synthetic */ int f126a;
    private /* synthetic */ Object[] f127b;
    private /* synthetic */ ay f128c;

    az(ay ayVar, int i, Object[] objArr) {
        this.f128c = ayVar;
        this.f126a = i;
        this.f127b = objArr;
    }

    public final void run() {
        ay.m2344a(this.f128c, ay.m2343a(this.f128c, this.f126a, this.f127b));
    }
}
