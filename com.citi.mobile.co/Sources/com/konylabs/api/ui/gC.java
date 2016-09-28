package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.bU;
import ny0k.cN;

public final class gC extends LuaWidget {
    private bN f4039a;
    private Object[] f4040b;
    private boolean f4041c;
    private int f4042d;
    private LuaTable f4043e;
    private LuaTable f4044f;
    private LuaTable f4045g;

    public gC(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4039a = null;
        this.f4041c = true;
        this.f4042d = 1;
        this.f4043e = luaTable;
        this.f4044f = luaTable2;
        this.f4045g = luaTable3;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable("thickness");
            if (table != LuaNil.nil) {
                super.setTable("thickness", table);
            }
        }
    }

    private gC(Object[] objArr) {
        super(10, 2, false);
        this.f4039a = null;
        this.f4041c = true;
        this.f4042d = 1;
        this.f4040b = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable("orientation", objArr[3]);
        }
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable("thickness", objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable("color", objArr[2]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_HEXPAND, objArr[6]);
        }
        if (!(objArr[7] == null || objArr[7] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_VEXPAND, objArr[7]);
        }
        if (!(objArr[8] == null || objArr[8] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ALIGN, objArr[8]);
        }
        if (objArr.length > 9 && objArr[9] != null && objArr[9] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[9]);
        }
    }

    protected final void m4475a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (!(intern != ATTR_WIDGET_SKIN || obj2 == null || obj2 == LuaNil.nil)) {
                dB a = cN.m2139a(obj2);
                if (a != null) {
                    this.f4039a.m759a(a.m1167s());
                }
            }
            if (!(intern != ATTR_WIDGET_ISVISIBLE || obj2 == null || obj2 == LuaNil.nil)) {
                this.f4039a.m768e(m3942a(((Boolean) obj2).booleanValue()));
            }
            if (!(intern != "color" || obj2 == null || obj2 == LuaNil.nil)) {
                try {
                    this.f4039a.m758a(hp.m3351b(obj2));
                } catch (NumberFormatException e) {
                    if (KonyMain.f3657e) {
                        Log.d("LuaLine", BuildConfig.FLAVOR + e.getMessage());
                    }
                }
            }
            if (intern == "thickness") {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4039a.m767d(((Double) obj2).intValue());
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4039a.m761a(convertMarginsToPixels(obj2, this.I));
                this.f4039a.m757a();
            }
        }
    }

    public final void cleanup() {
        if (this.f4039a != null) {
            bN bNVar = this.f4039a;
            bN.m756d();
        }
        this.f4039a = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget gCVar = this.f4040b != null ? new gC(this.f4040b) : new gC(this.f4043e, this.f4044f, this.f4045g);
        gCVar.copyProperties(this);
        gCVar.setSegUIWidgetType(bU.LINE);
        gCVar.setVisibility(this.f4041c);
        return gCVar;
    }

    public final LuaWidget getChildWidget(String str) {
        return null;
    }

    public final ArrayList getChildWidgets() {
        return null;
    }

    public final String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public final LuaWidget getParent() {
        return this.I;
    }

    public final Hashtable getProperties() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final String getType() {
        return "Line";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            this.f4039a = new bN(KonyMain.getActContext());
            this.f4039a.m758a(-1);
            LuaNil table = super.getTable("orientation");
            if (table != LuaNil.nil) {
                if (((String) table).intern() != "h") {
                    this.f4039a.m763b(2);
                }
                this.f4039a.m763b(1);
            } else {
                if ((this.I instanceof eO) && ((eO) this.I).f3728q != C0174B.f182b) {
                    this.f4039a.m763b(2);
                }
                this.f4039a.m763b(1);
            }
            table = super.getTable("thickness");
            if (table != LuaNil.nil) {
                this.f4042d = ((Double) table).intValue();
            }
            this.f4039a.m767d(this.f4042d);
            table = super.getTable("color");
            if (table != LuaNil.nil) {
                try {
                    this.f4039a.m758a(hp.m3351b(table));
                } catch (NumberFormatException e) {
                    if (KonyMain.f3657e) {
                        Log.d("LuaLine", BuildConfig.FLAVOR + e.getMessage());
                    }
                }
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f4039a.m768e(m3942a(((Boolean) table).booleanValue()));
            }
            super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            table = LuaNil.nil;
            super.getTable(ATTR_WIDGET_HEXPAND);
            table = LuaNil.nil;
            super.getTable(ATTR_WIDGET_VEXPAND);
            table = LuaNil.nil;
            table = super.getTable(ATTR_WIDGET_ALIGN);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4039a.m769f(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4039a.m769f(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4039a.m769f(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4039a.m769f(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4039a.m769f(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4039a.m769f(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4039a.m769f(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4039a.m769f(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4039a.m769f(85);
                        break;
                    default:
                        this.f4039a.m769f(17);
                        break;
                }
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f4039a.m761a(convertMarginsToPixels(table, this.I));
            }
            Object table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                dB a = cN.m2139a(table2);
                if (a != null) {
                    this.f4039a.m759a(a.m1167s());
                }
            }
            this.E = KONY_WIDGET_RESTORE;
        }
        this.f4039a.m762b();
        return this.f4039a.m765c();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f4039a.m761a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4039a.setFocusableInTouchMode(true);
            this.f4039a.requestFocus();
            this.f4039a.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4039a.m764b(false);
            this.f4039a.m767d(i);
            this.f4039a.m757a();
        }
    }

    public final void setParent(LuaWidget luaWidget) {
        super.setParent(luaWidget);
        if (luaWidget != null && this.E != KONY_WIDGET_BACKUP) {
            if (!(luaWidget instanceof eO) || ((eO) luaWidget).f3728q == C0174B.f182b) {
                this.f4039a.m763b(1);
            } else {
                this.f4039a.m763b(2);
            }
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        this.f4041c = z;
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4039a.m768e(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4039a.m760a(false);
            this.f4039a.m767d(i);
            this.f4039a.m757a();
        }
    }

    public final String toString() {
        return "LuaLine: " + getTable(ATTR_WIDGET_ID);
    }
}
