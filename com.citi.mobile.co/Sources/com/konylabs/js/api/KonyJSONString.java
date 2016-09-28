package com.konylabs.js.api;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.C0244i;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.LuaTable;

public class KonyJSONString {
    private String f1673a;
    private LuaTable f1674b;
    private long f1675c;
    private C0245j f1676d;

    public KonyJSONString(String str, LuaTable luaTable) {
        this.f1673a = null;
        this.f1674b = null;
        this.f1676d = null;
        this.f1673a = str;
        this.f1674b = luaTable;
        this.f1675c = 0;
        this.f1676d = KonyMain.m4061G();
    }

    public void cleanup() {
        KonyMain.m4143x().m1781b(this);
        this.f1675c = 0;
    }

    protected void finalize() throws Throwable {
        if (this.f1675c != 0) {
            this.f1676d.m1728a(new C0244i(this.f1675c));
        }
    }

    public String getContent() {
        return this.f1673a;
    }

    public long getJSObject() {
        return this.f1675c;
    }

    public LuaTable getMetaData() {
        return this.f1674b;
    }

    public boolean parse() {
        return KonyMain.m4143x().m1778a(this);
    }

    public void setJSObject(long j) {
        this.f1675c = j;
    }

    public String toString() {
        return this.f1673a;
    }
}
