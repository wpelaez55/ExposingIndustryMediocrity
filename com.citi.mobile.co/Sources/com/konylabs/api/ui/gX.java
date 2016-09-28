package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.bU;
import ny0k.cN;

public final class gX extends LuaWidget {
    public static String f4192a;
    private static String f4193b;
    private static String f4194c;
    private cP f4195d;
    private Object[] f4196e;
    private Object[] f4197f;
    private cU f4198g;
    private OnClickListener f4199h;
    private iq f4200i;
    private eO f4201j;

    static {
        f4193b = "linkskin";
        f4192a = "onclick";
        f4194c = "contentalignment";
        if (KonyMain.m4057C()) {
            f4193b = "linkSkin";
            f4192a = "onClick";
            f4194c = "contentAlignment";
        }
    }

    public gX(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4195d = null;
        this.f4198g = new cU(this);
        this.f4199h = new gY(this);
        this.mBasicConfig = luaTable;
        this.mLayoutConfig = luaTable2;
        this.mPspConfig = luaTable3;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(f4193b);
        if (table != LuaNil.nil) {
            super.setTable(f4193b, table);
        }
        table = luaTable.getTable(f4192a);
        if (table != LuaNil.nil) {
            super.setTable(f4192a, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_LABEL);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_LABEL, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(f4194c);
            if (table != LuaNil.nil) {
                super.setTable(f4194c, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_VEXPAND, table);
            }
        }
    }

    private gX(Object[] objArr) {
        super(0, 11, 1.0f, false);
        this.f4195d = null;
        this.f4198g = new cU(this);
        this.f4199h = new gY(this);
        this.f4196e = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_LABEL, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_HEXPAND, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_VEXPAND, objArr[6]);
        }
        if (!(objArr[7] == null || objArr[7] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ALIGN, objArr[7]);
        }
        if (!(objArr[8] == null || objArr[8] == LuaNil.nil)) {
            super.setTable(f4192a, objArr[8]);
        }
        if (objArr.length > 9 && objArr[9] != null && objArr[9] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[9]);
        }
    }

    private void m4581a(dB dBVar) {
        this.f4195d.m1005a(dBVar);
        this.f4195d.m1000a();
    }

    private void m4582a(Object obj) {
        switch (((Double) obj).intValue()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f4195d.m1012b(51);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f4195d.m1012b(49);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f4195d.m1012b(53);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                this.f4195d.m1012b(19);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                this.f4195d.m1012b(17);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f4195d.m1012b(21);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                this.f4195d.m1012b(83);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                this.f4195d.m1012b(81);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                this.f4195d.m1012b(85);
            default:
                this.f4195d.m1012b(17);
        }
    }

    private String m4584b() {
        LuaNil table = super.getTable(ATTR_WIDGET_LABEL);
        return table != LuaNil.nil ? table instanceof String ? (String) table : table.toString() : null;
    }

    protected final int m4585a(boolean z) {
        switch (H) {
            case LuaWidget.RETAIN_SPACE_UNSET /*-1*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return this.G ? z ? (m4584b() == null || m4584b().equals(BuildConfig.FLAVOR)) ? 4 : 0 : 4 : z ? (m4584b() == null || m4584b().equals(BuildConfig.FLAVOR)) ? 8 : 0 : 8;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return z ? (m4584b() == null || m4584b().equals(BuildConfig.FLAVOR)) ? 8 : 0 : 8;
            default:
                return 0;
        }
    }

    protected final void m4586a(Object obj, Object obj2) {
        boolean z = true;
        int i = -1;
        boolean z2 = false;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4195d.m1003a(H, m4585a(((Boolean) obj2).booleanValue()));
                }
            } else if (intern == ATTR_WIDGET_LABEL) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4195d.m1006a(BuildConfig.FLAVOR);
                } else {
                    this.f4195d.m1006a((String) obj2);
                }
                r0 = super.getTable(ATTR_WIDGET_ISVISIBLE);
                if (r0 != LuaNil.nil) {
                    z2 = ((Boolean) r0).booleanValue();
                }
                if (obj2 == null || obj2 == LuaNil.nil || obj2.equals(BuildConfig.FLAVOR)) {
                    this.f4195d.m1003a(H, m4585a(z2));
                } else {
                    this.f4195d.m1003a(H, m4585a(z2));
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (obj2 != null && obj2 != LuaNil.nil && this.G) {
                    setWeight();
                    this.f4195d.m1011b();
                    ((eO) this.I).m4238t();
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4581a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4581a(r0);
                }
            } else if (intern == f4193b) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4195d.m1013b(r0);
                    }
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4195d.m1010a(convertMarginsToPixels(obj2, this.I));
                this.f4195d.m1011b();
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f4195d.m1015b(convertPaddingToPixels(obj2, this.I));
                this.f4195d.m1011b();
            } else if (intern == f4194c && obj2 != LuaNil.nil) {
                m4582a(obj2);
            } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
            } else {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    r0 = ((LuaTable) obj2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN);
                    if (r0 != LuaNil.nil) {
                        i = ((Boolean) r0).booleanValue() ? 0 : 1;
                    }
                    if (((LuaTable) obj2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL) == LuaNil.nil) {
                        z = false;
                    }
                    this.f4195d.m1007a(m3944a((LuaTable) obj2, this.f4195d.getText().toString()), i, z);
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4195d.m1007a(BuildConfig.FLAVOR, -1, false);
                }
            }
        }
    }

    public final void cleanup() {
        if (this.f4195d != null) {
            this.f4195d.m1020e();
            this.f4195d = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget gXVar = this.f4196e != null ? new gX(this.f4196e) : new gX(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        gXVar.copyProperties(this);
        gXVar.setSegUIWidgetType(bU.RICHTEXT);
        gXVar.f4197f = this.f4197f;
        gXVar.setVisibility(((Boolean) super.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue());
        return gXVar;
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
        hashtable.put(ATTR_WIDGET_LABEL, "string");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final String getType() {
        return "RichText";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            LuaNil table;
            String str;
            this.f4195d = new cP(KonyMain.getActContext());
            Object table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                if (table2 != null) {
                    a = cN.m2139a(table2);
                    if (a != null) {
                        this.f4195d.m1005a(a);
                    }
                } else {
                    this.f4195d.m1005a(null);
                }
            }
            this.f4195d.m1004a(this.f4198g);
            this.f4195d.setOnClickListener(this.f4199h);
            LuaNil table3 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table3 != LuaNil.nil && (table3 instanceof LuaTable)) {
                table = ((LuaTable) table3).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN);
                int i = -1;
                if (table != LuaNil.nil) {
                    i = ((Boolean) table).booleanValue() ? 0 : 1;
                }
                this.f4195d.m1007a(m3944a((LuaTable) table3, null), i, ((LuaTable) table3).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL) != LuaNil.nil);
            }
            table = super.getTable(ATTR_WIDGET_LABEL);
            if (table != LuaNil.nil) {
                String str2 = (String) table;
                this.f4195d.m1006a(str2);
                str = str2;
            } else {
                str = null;
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            boolean booleanValue = table != LuaNil.nil ? ((Boolean) table).booleanValue() : false;
            if (str == null || str.equals(BuildConfig.FLAVOR) || !booleanValue) {
                this.f4195d.m1003a(H, m4585a(booleanValue));
            } else {
                this.f4195d.m1003a(H, 0);
            }
            if (m3941K()) {
                table = super.getTable(ATTR_WIDGET_HEXPAND);
                if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                    this.f4195d.m1009a(true);
                }
            }
            table = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                this.f4195d.m1014b(true);
            }
            table = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4195d.m1002a(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4195d.m1002a(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4195d.m1002a(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4195d.m1002a(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4195d.m1002a(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4195d.m1002a(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4195d.m1002a(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4195d.m1002a(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4195d.m1002a(85);
                        break;
                    default:
                        this.f4195d.m1002a(17);
                        break;
                }
            }
            table2 = super.getTable(f4194c);
            if (table2 != LuaNil.nil) {
                m4582a(table2);
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f4195d.m1010a(convertMarginsToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                this.f4195d.m1015b(convertPaddingToPixels(table, this.I));
            }
            table2 = super.getTable(f4193b);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4195d.m1013b(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table != LuaNil.nil) {
                this.f4195d.m1018c(((Boolean) table).booleanValue());
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4195d.m1016c();
        return this.f4195d.m1019d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4195d.m1015b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4195d.m1010a(convertMarginsToPixels(table, this.I));
            }
            this.f4195d.m1021f();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4195d.m1018c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4195d.setFocusableInTouchMode(true);
            this.f4195d.requestFocus();
            this.f4195d.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
        this.f4197f = objArr;
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4195d.m1014b(false);
            this.f4195d.setHeight(i);
            this.f4195d.m1011b();
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
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(gA.ATTR_WIDGET_LABEL);
            if (table == null || table == LuaNil.nil || table.equals(BuildConfig.FLAVOR)) {
                this.f4195d.m1003a(H, m4585a(z));
            } else {
                this.f4195d.m1003a(H, m4585a(z));
            }
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4195d.m1001a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidgetInSegUIEventListener(iq iqVar, eO eOVar) {
        this.f4200i = iqVar;
        this.f4201j = eOVar;
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4195d.m1009a(false);
            this.f4195d.setWidth(i);
            this.f4195d.m1011b();
        }
    }

    public final String toString() {
        return "LuaLabel: " + getTable(ATTR_WIDGET_ID);
    }
}
