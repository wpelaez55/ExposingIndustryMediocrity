package com.konylabs.api.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public abstract class KonyCustomWidget extends LuaWidget {
    public static final int NATIVE_DATA_TYPE_FUNCTION = 14;
    public static final int NATIVE_DATA_TYPE_HASHTABLE = 13;
    public static final int NATIVE_DATA_TYPE_OBJECT = 12;
    public static final int NATIVE_DATA_TYPE_OBJ_BOOLEAN = 9;
    public static final int NATIVE_DATA_TYPE_OBJ_DOUBLE = 8;
    public static final int NATIVE_DATA_TYPE_OBJ_FLOAT = 7;
    public static final int NATIVE_DATA_TYPE_OBJ_INTEGER = 5;
    public static final int NATIVE_DATA_TYPE_OBJ_LONG = 6;
    public static final int NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN = 4;
    public static final int NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE = 3;
    public static final int NATIVE_DATA_TYPE_PRIMITIVE_FLOAT = 2;
    public static final int NATIVE_DATA_TYPE_PRIMITIVE_INT = 0;
    public static final int NATIVE_DATA_TYPE_PRIMITIVE_LONG = 1;
    public static final int NATIVE_DATA_TYPE_STRING = 10;
    public static final int NATIVE_DATA_TYPE_VECTOR = 11;
    Object f3690a;
    private View f3691b;
    private LuaWidget f3692c;
    private boolean f3693d;
    private LayoutParams f3694e;
    private LinearLayout f3695f;
    private Hashtable f3696g;

    public KonyCustomWidget() {
        this.f3694e = null;
        this.f3696g = null;
        this.f3690a = null;
    }

    private static Object m4172a(Object obj) {
        return (obj == LuaNil.nil || obj == null) ? obj : obj instanceof Integer ? Double.valueOf((double) ((Integer) obj).intValue()) : obj instanceof Float ? Double.valueOf((double) ((Float) obj).floatValue()) : obj instanceof Long ? Double.valueOf((double) ((Long) obj).longValue()) : obj;
    }

    private void m4173a(int[] iArr) {
        ez.m1344a(iArr, this.f3695f, this.f3694e);
    }

    private Object m4174b(Object obj) {
        LuaNil table = super.getTable(obj);
        if (table == LuaNil.nil) {
            return null;
        }
        Integer num = (Integer) this.f3696g.get(obj);
        if (num == null) {
            return table;
        }
        switch (num.intValue()) {
            case NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
            case NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return table instanceof Double ? Integer.valueOf(((Double) table).intValue()) : table;
            case NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
            case NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return table instanceof Double ? Long.valueOf(((Double) table).longValue()) : table;
            case NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
            case NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return table instanceof Double ? Float.valueOf(((Double) table).floatValue()) : table;
            case NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
            case NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return table instanceof Double ? Double.valueOf(((Double) table).doubleValue()) : table;
            case NATIVE_DATA_TYPE_VECTOR /*11*/:
                return table instanceof LuaTable ? TableLib.convertToList((LuaTable) table) : table;
            case NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                return table instanceof LuaTable ? TableLib.convertToHash((LuaTable) table) : table;
            default:
                return table;
        }
    }

    protected final void m4175a(Object obj, Object obj2) {
        String intern = ((String) obj).intern();
        if (intern == ATTR_WIDGET_SET_ENABLED && obj2 != null && obj2 != LuaNil.nil) {
            this.f3691b.setEnabled(((Boolean) obj2).booleanValue());
        } else if (intern == ATTR_WIDGET_MARGIN) {
            if (obj2 != null && obj2 != LuaNil.nil) {
                m4173a(convertMarginsToPixels(obj2, this.f3692c));
                this.f3695f.setLayoutParams(this.f3694e);
            }
        } else if (intern != ATTR_WIDGET_ISVISIBLE || obj2 == null || obj2 == LuaNil.nil) {
            onPropertySet(this.f3691b, obj, m4174b(obj));
        } else {
            setVisibility(((Boolean) obj2).booleanValue());
        }
    }

    public final void cleanup() {
        onDestroyView(this.f3691b);
        this.f3691b = null;
        this.E = KONY_WIDGET_BACKUP;
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
        return this.f3692c;
    }

    public final Hashtable getProperties() {
        return null;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getPropertyFromModel(String str) {
        return m4174b(str);
    }

    public final Object getTable(Object obj) {
        if (this.E == KONY_WIDGET_BACKUP) {
            return m4172a(super.getTable(obj));
        }
        Object onPropertyGet;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            onPropertyGet = onPropertyGet(this.f3691b, obj);
        } else {
            synchronized (this) {
                this.f3690a = null;
                onPropertyGet = new ii(new au(this, obj));
                new Handler(Looper.getMainLooper()).post(onPropertyGet);
                onPropertyGet.m1406a();
                onPropertyGet = this.f3690a;
                this.f3690a = null;
            }
        }
        return m4172a(onPropertyGet);
    }

    public final String getType() {
        return "KonyCustomWidget";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            this.f3691b = onCreateView(KonyMain.getActivityContext());
            this.E = KONY_WIDGET_RESTORE;
            this.f3695f = new LinearLayout(KonyMain.getActivityContext());
            this.f3694e = new LayoutParams(-2, -2);
            this.f3695f.setLayoutParams(this.f3694e);
            this.f3695f.addView(this.f3691b);
            LuaNil table = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table != LuaNil.nil) {
                this.f3691b.setEnabled(((Boolean) table).booleanValue());
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                m4173a(convertMarginsToPixels(table, this.f3692c));
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                setVisibility(((Boolean) table).booleanValue());
            }
            if (this.f3693d) {
                setWeight();
            }
        }
        return this.f3695f;
    }

    public final int getWidth() {
        return NATIVE_DATA_TYPE_PRIMITIVE_INT;
    }

    public final void handleOrientationChange(int i) {
        onOrientationChanged(i);
    }

    public final void initProperties(Object[] objArr, long j, Hashtable hashtable) {
        setJSObject(j);
        this.f3696g = hashtable;
        if (objArr != null) {
            LuaTable luaTable;
            Iterator it;
            Object next;
            if (objArr.length > 0 && (objArr[NATIVE_DATA_TYPE_PRIMITIVE_INT] instanceof LuaTable)) {
                luaTable = (LuaTable) objArr[NATIVE_DATA_TYPE_PRIMITIVE_INT];
                it = luaTable.enumeration.keys.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    super.setTable(next, luaTable.getTable(next));
                }
            }
            if (objArr.length > NATIVE_DATA_TYPE_PRIMITIVE_LONG && (objArr[NATIVE_DATA_TYPE_PRIMITIVE_LONG] instanceof LuaTable)) {
                luaTable = (LuaTable) objArr[NATIVE_DATA_TYPE_PRIMITIVE_LONG];
                it = luaTable.enumeration.keys.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    super.setTable(next, luaTable.getTable(next));
                }
            }
            if (objArr.length > NATIVE_DATA_TYPE_PRIMITIVE_FLOAT && (objArr[NATIVE_DATA_TYPE_PRIMITIVE_FLOAT] instanceof LuaTable)) {
                luaTable = (LuaTable) objArr[NATIVE_DATA_TYPE_PRIMITIVE_FLOAT];
                it = luaTable.enumeration.keys.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    super.setTable(next, luaTable.getTable(next));
                }
            }
        }
    }

    public abstract View onCreateView(Context context);

    public abstract void onDestroyView(View view);

    public void onOrientationChanged(int i) {
    }

    public Object onPropertyGet(View view, Object obj) {
        return null;
    }

    public void onPropertySet(View view, Object obj, Object obj2) {
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3691b.setEnabled(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3691b.setFocusableInTouchMode(true);
            this.f3691b.requestFocus();
            this.f3691b.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setParent(LuaWidget luaWidget) {
        this.f3692c = luaWidget;
        if (luaWidget != null) {
            luaWidget.setTable(super.getTable(LuaWidget.ATTR_WIDGET_ID), this);
        }
    }

    public final void setPropertyToModel(String str, Object obj) {
        super.setTable(str, obj);
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            KonyMain.m4094a(new at(this, obj, obj2));
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            int a = m3942a(z);
            this.f3691b.setVisibility(a);
            this.f3695f.setVisibility(a);
        }
    }

    public final void setWeight() {
        this.f3693d = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3694e.width = NATIVE_DATA_TYPE_PRIMITIVE_INT;
                    this.f3694e.weight = floatValue / 100.0f;
                }
            }
        }
    }
}
