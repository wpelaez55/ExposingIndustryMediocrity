package com.konylabs.js.api;

import com.konylabs.vm.LuaTable;

public class KonyJSObject extends LuaTable {
    private int f3072a;
    protected long ap;
    protected boolean aq;

    public KonyJSObject() {
        this.ap = 0;
        this.aq = false;
        this.f3072a = 0;
    }

    public KonyJSObject(int i, int i2) {
        super(i, i2);
        this.ap = 0;
        this.aq = false;
        this.f3072a = 0;
    }

    public KonyJSObject(int i, int i2, float f, boolean z) {
        super(i, i2, f, z);
        this.ap = 0;
        this.aq = false;
        this.f3072a = 0;
    }

    public KonyJSObject(int i, int i2, boolean z) {
        super(i, i2, z);
        this.ap = 0;
        this.aq = false;
        this.f3072a = 0;
    }

    public void decreaseReferenceCount() {
        if (this.f3072a > 0) {
            this.f3072a--;
        }
    }

    public long getJSObject() {
        return this.ap;
    }

    public int getReferenceCount() {
        return this.f3072a;
    }

    public void increaseReferenceCount() {
        this.f3072a++;
    }

    public boolean isJsObjectCloneCreated() {
        return this.aq;
    }

    public void jsObjectCloneCreated() {
        this.aq = true;
    }

    public void setJSObject(long j) {
        this.ap = j;
    }
}
