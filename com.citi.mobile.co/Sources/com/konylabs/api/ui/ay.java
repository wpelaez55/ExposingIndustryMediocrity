package com.konylabs.api.ui;

public final class ay {
    aA f626a;
    private az f627b;
    private String f628c;
    private int f629d;
    private String f630e;
    private int f631f;

    public ay(av avVar, az azVar) {
        if (azVar == null) {
            throw new RuntimeException("ColumnInfo type can not be empty");
        }
        this.f627b = azVar;
    }

    public final String m643a() {
        return this.f628c;
    }

    public final void m644a(int i) {
        this.f629d = i;
    }

    public final void m645a(String str) {
        this.f628c = str;
    }

    public final int m646b() {
        return this.f629d;
    }

    public final void m647b(int i) {
        this.f631f = i;
    }

    public final void m648b(String str) {
        this.f630e = str;
    }

    public final int m649c() {
        return this.f631f;
    }
}
