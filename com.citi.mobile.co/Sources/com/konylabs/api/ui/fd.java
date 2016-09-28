package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.konylabs.vmintf.KonyJSVM;
import ny0k.bU;

public final class fd extends eO {
    private static String f4553A;
    private static String f4554B;
    private boolean f4555C;
    private String f4556z;

    static {
        f4553A = "init";
        f4554B = "addWidgets";
    }

    public fd(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(luaTable, luaTable2, luaTable3);
        this.f4556z = "LuaTemplateBox";
        this.f4555C = false;
        this.f4555C = false;
    }

    protected final void m4838a(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super.m4207a(luaTable, luaTable2, luaTable3);
        LuaNil table = luaTable.getTable(f4553A);
        if (table != LuaNil.nil) {
            super.setTable(f4553A, table);
        }
        table = luaTable.getTable(f4554B);
        if (table != LuaNil.nil) {
            super.setTable(f4554B, table);
        }
    }

    public final LuaWidget createClone() {
        m4839q();
        LuaWidget fdVar = new fd(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        if (KonyMain.m4057C()) {
            fdVar.m4838a((LuaTable) KonyJSVM.getProperty(getJSObject(), "basicConfig"), (LuaTable) KonyJSVM.getProperty(getJSObject(), "layoutConfig"), (LuaTable) KonyJSVM.getProperty(getJSObject(), "pspConfig"));
        } else {
            fdVar.m4838a(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        }
        fdVar.f4555C = true;
        fdVar.copyProperties(this);
        fdVar.setSegUIWidgetType(bU.BOX);
        if (this.i.size() > 0) {
            Object[] objArr = new Object[(this.i.size() + 1)];
            for (int i = 0; i < this.i.size(); i++) {
                objArr[i + 1] = ((LuaWidget) this.i.get(i)).createClone();
            }
            fdVar.m4211a(objArr);
        }
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (!(table == LuaNil.nil || table == null)) {
            fdVar.setVisibility(((Boolean) table).booleanValue());
        }
        fdVar.y = this.y;
        if (m4232n()) {
            fdVar.u = fdVar;
            fdVar.t = this.t;
        }
        return fdVar;
    }

    public final Object getTable(Object obj) {
        if (obj == ATTR_WIDGET_ID) {
            return super.getTable(ATTR_WIDGET_ID).toString();
        }
        m4839q();
        return super.getTable(obj);
    }

    public final void m4839q() {
        if (!this.f4555C) {
            try {
                if (KonyMain.m4057C()) {
                    Object[] keys = getKeys();
                    Object[] hashValues = getHashValues();
                    Object property = KonyJSVM.getProperty(getJSObject(), "basicConfig");
                    Object property2 = KonyJSVM.getProperty(getJSObject(), "layoutConfig");
                    Object property3 = KonyJSVM.getProperty(getJSObject(), "pspConfig");
                    m4838a((LuaTable) property, property2 != null ? (LuaTable) property2 : null, property3 != null ? (LuaTable) property3 : null);
                    if (keys != null && hashValues != null && keys.length > 0 && hashValues.length > 0) {
                        for (int i = 0; i < keys.length; i++) {
                            super.setTable(keys[i], hashValues[i]);
                        }
                    }
                } else {
                    m4838a(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
                }
                LuaNil luaNil = LuaNil.nil;
                luaNil = LuaNil.nil;
                luaNil = super.getTable(f4554B);
                if (luaNil != LuaNil.nil) {
                    ((Function) luaNil).execute(new Object[]{this});
                }
                this.f4555C = true;
                luaNil = super.getTable(f4553A);
                if (luaNil != LuaNil.nil) {
                    ((Function) luaNil).execute(new Object[]{this});
                }
            } catch (Throwable e) {
                if (KonyMain.f3658f) {
                    Log.w(this.f4556z, "LuaBoxTemplate", e);
                }
                if (e instanceof LuaError) {
                    throw ((LuaError) e);
                }
                throw new LuaError("Error in BoxTemplate init callback." + e.getMessage(), 605);
            }
        }
    }

    public final void m4840r() {
        Object table = super.getTable(ATTR_WIDGET_ID);
        m4212a(this.i.toArray(), true);
        if (this.I instanceof fv) {
            ((fv) this.I).m4443b(this.r);
        }
        if (this.map != null) {
            this.map.clear();
        }
        super.setTable(ATTR_WIDGET_ID, table);
        cleanup();
        this.m = 0.0f;
        this.o = false;
        this.r = 0;
        this.i.clear();
        this.j.clear();
        this.f4555C = false;
    }
}
