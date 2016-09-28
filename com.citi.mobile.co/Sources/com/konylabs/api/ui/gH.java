package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import ny0k.cr;

public final class gH extends LuaWidget {
    private static String f4085A;
    public static String f4086a;
    public static String f4087b;
    public static String f4088c;
    public static String f4089d;
    public static String f4090e;
    private static String f4091h;
    private static String f4092i;
    private static String f4093j;
    private static String f4094k;
    private static String f4095l;
    private static String f4096m;
    private static String f4097n;
    private static String f4098o;
    private static String f4099p;
    private static String f4100q;
    private static String f4101r;
    private static String f4102s;
    private static String f4103t;
    private static String f4104u;
    private static String f4105v;
    private static String f4106w;
    private static String f4107x;
    private static String f4108y;
    private static String f4109z;
    private bW f4110B;
    private Vector f4111C;
    private Vector f4112D;
    private Hashtable f4113P;
    private Vector f4114Q;
    private LuaTable f4115R;
    private boolean f4116S;
    private cg f4117T;
    private cb f4118U;
    private cf f4119V;
    private cc f4120W;
    private ce f4121X;
    private cd f4122Y;
    LuaTable f4123f;
    Object f4124g;

    static {
        f4091h = "viewforlocationcallout";
        f4086a = "onselection";
        f4092i = "provider";
        f4093j = "key";
        f4094k = "defaultpinimage";
        f4087b = "onpinclick";
        f4095l = "onpinselect";
        f4096m = "screenlevelwidget";
        f4088c = "onboundschanged";
        f4097n = "callouttemplate";
        f4098o = "widgetdatamapforcallout";
        f4099p = "calloutwidth";
        f4100q = "calloutdata";
        f4089d = "onclick";
        f4101r = "locationdata";
        f4102s = "address";
        f4103t = "showzoomcontrol";
        f4104u = "zoomlevel";
        f4105v = "mode";
        f4106w = "mapkey";
        f4107x = "id";
        f4108y = "startlocation";
        f4109z = "endlocation";
        f4085A = "grabtouchevents";
        if (KonyMain.m4057C()) {
            f4091h = "viewForLocationCallout";
            f4086a = "onSelection";
            f4094k = "defaultPinImage";
            f4087b = "onPinClick";
            f4088c = "onBoundsChanged";
            f4096m = "screenLevelWidget";
            f4101r = "locationData";
            f4104u = "zoomLevel";
            f4103t = "showZoomControl";
            f4106w = "mapKey";
            f4097n = "calloutTemplate";
            f4098o = "widgetDataMapForCallout";
            f4099p = "calloutWidth";
            f4100q = "calloutData";
            f4089d = "onClick";
            f4108y = "startLocation";
            f4109z = "endLocation";
            f4085A = "grabTouchEvents";
        }
    }

    public gH(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4111C = new Vector();
        this.f4112D = null;
        this.f4113P = new Hashtable();
        this.f4114Q = new Vector();
        this.f4115R = new LuaTable();
        this.f4123f = new LuaTable();
        this.f4117T = new cg(this);
        this.f4124g = null;
        this.f4118U = new cb(this);
        this.f4119V = new cf(this);
        this.f4120W = new cc(this);
        this.f4121X = new ce(this);
        this.f4122Y = new cd(this);
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(f4092i);
        if (table != LuaNil.nil) {
            super.setTable(f4092i, table);
        }
        table = luaTable.getTable(f4106w);
        if (table != LuaNil.nil) {
            super.setTable(f4106w, table);
        }
        table = luaTable.getTable(f4094k);
        if (table != LuaNil.nil) {
            super.setTable(f4094k, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4086a);
        if (table != LuaNil.nil) {
            super.setTable(f4086a, table);
        }
        table = luaTable.getTable(f4087b);
        if (table != LuaNil.nil) {
            super.setTable(f4087b, table);
        }
        table = luaTable.getTable(f4089d);
        if (table != LuaNil.nil) {
            super.setTable(f4089d, table);
        }
        table = luaTable.getTable(f4101r);
        if (table != LuaNil.nil) {
            super.setTable(f4101r, table);
        }
        table = luaTable.getTable(f4096m);
        if (table != LuaNil.nil) {
            super.setTable(f4096m, table);
            this.f4116S = ((Boolean) table).booleanValue();
        }
        Object table2 = luaTable.getTable(f4097n);
        if (table2 != LuaNil.nil) {
            m4505c(table2);
            super.setTable(f4097n, table2);
        }
        table = luaTable.getTable(f4098o);
        if (table != LuaNil.nil) {
            super.setTable(f4098o, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT, table);
                this.N = (float) ((Double) table).intValue();
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4104u);
            if (table != LuaNil.nil) {
                super.setTable(f4104u, table);
            } else {
                table = luaTable3.getTable("zoom");
                if (table != LuaNil.nil && (table instanceof Double)) {
                    super.setTable(f4104u, table);
                }
            }
            table = luaTable3.getTable(f4102s);
            if (table != LuaNil.nil) {
                super.setTable(f4102s, table);
            }
            table = luaTable3.getTable(f4105v);
            if (table != LuaNil.nil) {
                super.setTable(f4105v, table);
            }
            table = luaTable3.getTable(f4103t);
            if (table != LuaNil.nil) {
                super.setTable(f4103t, table);
                return;
            }
            table = luaTable3.getTable("zoom");
            if (table != LuaNil.nil && (table instanceof Boolean)) {
                super.setTable(f4103t, table);
            }
        }
    }

    static /* synthetic */ View m4494a(gH gHVar, Hashtable hashtable) {
        View view = null;
        if (hashtable != null) {
            eO eOVar;
            Object obj;
            eO eOVar2;
            Object obj2 = hashtable.get("template");
            if (obj2 instanceof eO) {
                eOVar = (eO) obj2;
            } else {
                obj = null;
            }
            LuaNil table = super.getTable(f4098o);
            Hashtable hashtable2 = table != LuaNil.nil ? ((LuaTable) table).map : null;
            table = super.getTable(f4097n);
            if (table == LuaNil.nil || !(table instanceof eO)) {
                eOVar2 = eOVar;
                obj = null;
            } else {
                eO eOVar3 = (eO) table;
                if (eOVar == null) {
                    eOVar = eOVar3;
                    eOVar2 = eOVar3;
                } else {
                    eOVar2 = eOVar;
                    eOVar = eOVar3;
                }
            }
            if (!(eOVar2 == null || hashtable2 == null)) {
                if (gHVar.f4112D == null) {
                    gHVar.f4112D = new Vector();
                }
                LuaWidget luaWidget = (eO) eOVar2.createClone();
                if (!gHVar.f4112D.contains(luaWidget)) {
                    gHVar.f4112D.add(luaWidget);
                }
                if ((eOVar2 instanceof fd) || eOVar2 != r1) {
                    gHVar.m4498a((eO) luaWidget, hashtable2, hashtable);
                } else {
                    Iterator it = gHVar.f4111C.iterator();
                    while (it.hasNext()) {
                        gHVar.m4503a((String) it.next(), luaWidget, hashtable2, hashtable);
                    }
                }
                view = luaWidget.getWidget();
                Double valueOf = Double.valueOf(80.0d);
                LuaNil table2 = super.getTable(f4099p);
                if (table2 != LuaNil.nil) {
                    valueOf = Double.valueOf(Double.parseDouble(table2.toString()));
                }
                if (valueOf.doubleValue() < 1.0d || valueOf.doubleValue() > 100.0d) {
                    valueOf = Double.valueOf(80.0d);
                }
                int floatValue = (int) ((valueOf.floatValue() / 100.0f) * ((float) gHVar.f4110B.getMeasuredWidth()));
                view.setMinimumWidth(floatValue);
                if (floatValue == 0) {
                    view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                } else {
                    view.measure(MeasureSpec.makeMeasureSpec(floatValue, ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(0, 0));
                }
                if (!luaWidget.isJsObjectCloneCreated()) {
                    cr.m2204a(luaWidget, (LuaWidget) gHVar);
                }
            }
        }
        return view;
    }

    private Object m4496a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f4104u && this.E == KONY_WIDGET_RESTORE) {
            Double valueOf = Double.valueOf((double) this.f4110B.m857c());
            if (valueOf.doubleValue() != -1.0d) {
                return valueOf;
            }
        }
        return super.getTable(intern);
    }

    private void m4497a(eO eOVar) {
        for (int i = 0; i < eOVar.f3720i.size(); i++) {
            LuaTable luaTable = (LuaTable) eOVar.f3720i.get(i);
            if (luaTable instanceof eO) {
                m4497a((eO) luaTable);
            }
            this.f4111C.add(luaTable.getTable(ATTR_WIDGET_ID).toString());
        }
    }

    private void m4498a(eO eOVar, Hashtable hashtable, Hashtable hashtable2) {
        for (int i = 0; i < eOVar.f3720i.size(); i++) {
            LuaTable luaTable = (LuaTable) eOVar.f3720i.get(i);
            if (luaTable instanceof eO) {
                m4498a((eO) luaTable, hashtable, hashtable2);
            }
            m4503a(luaTable.getTable(ATTR_WIDGET_ID).toString(), eOVar, hashtable, hashtable2);
        }
    }

    static /* synthetic */ void m4500a(gH gHVar, Object obj, int i) {
        if (obj != LuaNil.nil) {
            Serializable serializable;
            LuaTable luaTable = gHVar.f4115R;
            if (luaTable != LuaNil.nil) {
                serializable = (LuaTable) luaTable.list.elementAt(i);
                if (serializable.getTable("addressFromLocationName") != LuaNil.nil) {
                    if (KonyMain.f3657e) {
                        Log.w("LuaMap", "clicked location is address = " + serializable.getTable("addressFromLocationName"));
                    }
                    serializable = (LuaTable) gHVar.getTable(f4102s);
                }
            } else {
                serializable = null;
            }
            if (KonyMain.f3657e) {
                Log.w("LuaMap", " clicked location = " + serializable);
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = obj;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", gHVar);
            bundle.putSerializable("key1", serializable);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    private void m4501a(LuaTable luaTable, Boolean bool) {
        LuaNil table = luaTable.getTable(f4107x);
        if (table != LuaNil.nil) {
            this.f4113P.put((String) table, luaTable);
        }
        if (this.E != KONY_WIDGET_BACKUP && table != LuaNil.nil) {
            LuaNil table2 = luaTable.getTable(f4108y);
            table = luaTable.getTable(f4109z);
            if (table2 != LuaNil.nil) {
                this.f4114Q.add((LuaTable) table2);
            }
            if (table != LuaNil.nil) {
                this.f4114Q.add((LuaTable) table);
            }
            m4502a(bool);
            this.f4110B.m844a(luaTable, bool);
        }
    }

    private void m4502a(Boolean bool) {
        Collection d;
        ArrayList arrayList = new ArrayList();
        this.f4115R = new LuaTable();
        if (!(this.f4123f == LuaNil.nil || this.f4123f == null)) {
            if (this.f4123f.list.size() > 0) {
                this.f4115R.addAll(this.f4123f.list);
            }
            d = m4506d(this.f4123f);
            if (d != null) {
                arrayList.addAll(d);
            }
        }
        if (this.f4114Q.size() > 0) {
            LuaTable luaTable = new LuaTable();
            luaTable.addAll(this.f4114Q);
            this.f4115R.addAll(luaTable.list);
            d = m4506d(luaTable);
            if (d != null) {
                arrayList.addAll(d);
            }
        }
        if (arrayList.size() > 0) {
            this.f4110B.m847a(arrayList, bool);
        } else {
            this.f4110B.m847a(null, bool);
        }
    }

    private void m4503a(String str, eO eOVar, Hashtable hashtable, Hashtable hashtable2) {
        LuaNil table = eOVar.getTable(str);
        if (table != null && table != LuaNil.nil) {
            LuaTable luaTable = (LuaTable) table;
            Object obj = hashtable.get(str);
            if (obj != null) {
                Object obj2 = hashtable2.get(obj);
                if (obj2 instanceof LuaTable) {
                    if (((luaTable instanceof gA) || (luaTable instanceof gD) || (luaTable instanceof gX) || (luaTable instanceof fe) || (luaTable instanceof gs) || (luaTable instanceof gt)) && (obj2 instanceof LuaTable)) {
                        Set keySet = ((LuaTable) obj2).map.keySet();
                        Hashtable hashtable3 = ((LuaTable) obj2).map;
                        for (Object next : keySet) {
                            luaTable.setTable(next, hashtable3.get(next));
                        }
                    }
                } else if (obj2 != null) {
                    if ((luaTable instanceof gA) || (luaTable instanceof gD) || (luaTable instanceof gX) || (luaTable instanceof fe)) {
                        luaTable.setTable(ATTR_WIDGET_LABEL, obj2);
                    } else if ((luaTable instanceof gs) || (luaTable instanceof gt)) {
                        luaTable.setTable(gs.f4202a, obj2);
                    }
                }
                if (luaTable instanceof gs) {
                    luaTable.setTable("downloadmode", Integer.valueOf(1));
                }
                if (luaTable instanceof gt) {
                    luaTable.setTable("downloadmode", Integer.valueOf(1));
                }
            }
        } else if (KonyMain.f3657e) {
            Log.w("LuaMap", "Invalid key(" + str + ") passed in calloutdata on map : " + super.getTable(ATTR_WIDGET_ID));
        }
    }

    private void m4504b(Object obj) {
        if (obj != LuaNil.nil) {
            this.f4110B.m859c(((LuaTable) obj).map.get("location").toString());
            return;
        }
        this.f4110B.m859c(null);
    }

    private void m4505c(Object obj) {
        LuaNil table = super.getTable(f4097n);
        if (!(table == LuaNil.nil || table == obj)) {
            cr.m2209b((LuaWidget) this, (LuaWidget) table);
        }
        cr.m2211b((LuaWidget) this, new ArrayList(Arrays.asList(new LuaWidget[]{(LuaWidget) obj})));
    }

    private ArrayList m4506d(LuaTable luaTable) {
        if (luaTable == LuaNil.nil || luaTable.list.size() <= 0) {
            return null;
        }
        Vector vector = luaTable.list;
        int size = vector.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(m4507e((LuaTable) vector.elementAt(i)));
        }
        return arrayList;
    }

    private ch m4507e(LuaTable luaTable) {
        ch chVar;
        Hashtable hashtable = null;
        float floatValue;
        float floatValue2;
        LuaNil elementAt;
        String obj;
        String obj2;
        String obj3;
        bW bWVar;
        ch chVar2;
        if (luaTable != null && luaTable.list.size() > 0) {
            Vector vector = luaTable.list;
            int size = vector.size();
            floatValue = new Double(vector.elementAt(0).toString()).floatValue();
            floatValue2 = new Double(vector.elementAt(1).toString()).floatValue();
            elementAt = vector.elementAt(2);
            obj = elementAt != LuaNil.nil ? elementAt.toString() : null;
            elementAt = vector.elementAt(3);
            obj2 = elementAt != LuaNil.nil ? elementAt.toString() : null;
            elementAt = vector.elementAt(4);
            obj3 = elementAt != LuaNil.nil ? elementAt.toString() : null;
            elementAt = size > 6 ? vector.elementAt(6) : LuaNil.nil;
            hashtable = (elementAt == LuaNil.nil || elementAt == null) ? null : ((LuaTable) elementAt).map;
            bWVar = this.f4110B;
            bWVar.getClass();
            chVar2 = new ch(bWVar, floatValue, floatValue2, obj, obj2, true, hashtable);
            chVar2.m1029a(obj3);
            chVar = chVar2;
        } else if (luaTable == null || luaTable.map.size() <= 0) {
            chVar = null;
        } else {
            Map map = luaTable.map;
            floatValue = new Double(map.get("lat").toString()).floatValue();
            floatValue2 = new Double(map.get("lon").toString()).floatValue();
            elementAt = map.get("name");
            obj = (elementAt == LuaNil.nil || elementAt == null) ? null : elementAt.toString();
            elementAt = map.get("desc");
            obj2 = (elementAt == LuaNil.nil || elementAt == null) ? null : elementAt.toString();
            elementAt = map.get("image");
            obj3 = (elementAt == LuaNil.nil || elementAt == null) ? null : elementAt.toString();
            elementAt = map.get("showcallout");
            boolean booleanValue = (elementAt == LuaNil.nil || elementAt == null) ? true : ((Boolean) elementAt).booleanValue();
            elementAt = map.get(f4100q);
            hashtable = (elementAt == LuaNil.nil || elementAt == null) ? null : ((LuaTable) elementAt).map;
            bWVar = this.f4110B;
            bWVar.getClass();
            chVar2 = new ch(bWVar, floatValue, floatValue2, obj, obj2, booleanValue, hashtable);
            chVar2.m1029a(obj3);
            chVar = chVar2;
        }
        if (hashtable != null) {
            if (hashtable.get("template") instanceof eO) {
                cr.m2211b((LuaWidget) this, new ArrayList(Arrays.asList(new LuaWidget[]{(LuaWidget) hashtable.get("template")})));
            }
        }
        return chVar;
    }

    private void m4508e() {
        Enumeration keys = this.f4113P.keys();
        while (keys.hasMoreElements()) {
            m4501a((LuaTable) this.f4113P.get((String) keys.nextElement()), Boolean.valueOf(!keys.hasMoreElements()));
        }
    }

    public final void m4509a(int i, boolean z) {
        if (this.E == KONY_WIDGET_BACKUP) {
            LuaTable luaTable = new LuaTable();
            luaTable.setTable("arg1", Integer.valueOf(i));
            luaTable.setTable("arg2", Boolean.valueOf(z));
            super.setTable("navigateTo", luaTable);
            super.setTable("navigateToLocation", LuaNil.nil);
            return;
        }
        this.f4110B.m834a(cr.m2199a(i, 0), z);
    }

    public final void m4510a(LuaTable luaTable, boolean z, boolean z2) {
        if (this.E == KONY_WIDGET_BACKUP) {
            LuaTable luaTable2 = new LuaTable();
            luaTable2.setTable("arg1", luaTable);
            luaTable2.setTable("arg2", Boolean.valueOf(z));
            luaTable2.setTable("arg3", Boolean.valueOf(z2));
            super.setTable("navigateToLocation", luaTable2);
            super.setTable("navigateTo", LuaNil.nil);
            return;
        }
        ch e = m4507e(luaTable);
        e.f985h = z2;
        if (z2 || z) {
            this.f4115R.add(luaTable);
        }
        this.f4110B.m842a(e, z, z2);
    }

    protected final void m4511a(Object obj, Object obj2) {
        String intern = ((String) obj).intern();
        if (intern == f4101r) {
            if (obj2 == LuaNil.nil) {
                this.f4123f = new LuaTable();
            } else {
                this.f4123f = (LuaTable) obj2;
            }
            m4502a(Boolean.valueOf(true));
            super.setTable(f4102s, LuaNil.nil);
        } else if (intern == f4102s) {
            this.f4110B.m835a(this.f4118U);
            m4504b(obj2);
            super.setTable(f4101r, LuaNil.nil);
        } else if (intern == f4104u || intern == "zoom") {
            if ((obj2 instanceof Double) && obj2 != LuaNil.nil) {
                this.f4110B.m858c(((Double) obj2).intValue());
            }
        } else if (intern == f4105v) {
            if (obj2 != LuaNil.nil) {
                if (obj2 instanceof String) {
                    this.f4110B.m855b(((String) obj2).intern());
                } else {
                    this.f4110B.m862d(((Double) obj2).intValue());
                }
                this.f4110B.invalidate();
            }
        } else if (intern == f4087b) {
            if (obj2 != LuaNil.nil) {
                this.f4110B.m839a(this.f4119V);
            }
        } else if (intern == f4086a) {
            if (obj2 != LuaNil.nil) {
                this.f4110B.m840a(this.f4117T);
            }
        } else if (intern == f4091h) {
            if (obj2 != LuaNil.nil) {
                this.f4110B.m836a(this.f4120W);
            }
        } else if (intern == f4094k) {
            if (obj2 != LuaNil.nil) {
                this.f4110B.m846a(obj2.toString());
                this.f4110B.m845a(Boolean.valueOf(true));
                this.f4110B.invalidate();
            }
        } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
            if (obj2 != LuaNil.nil && this.G) {
                setWeight();
                this.f4110B.m831a();
                ((eO) this.I).m4238t();
            }
        } else if (intern == ATTR_WIDGET_ISVISIBLE) {
            if (obj2 != LuaNil.nil) {
                setVisibility(((Boolean) obj2).booleanValue());
            }
        } else if (intern == ATTR_WIDGET_MARGIN) {
            if (obj2 != null && obj2 != LuaNil.nil) {
                this.f4110B.m849a(convertMarginsToPixels(obj2, this.I));
            }
        } else if (intern == f4089d) {
            if (obj2 != LuaNil.nil) {
                this.f4110B.m838a(this.f4121X);
            }
        } else if (intern == f4085A) {
            if (obj2 != null && obj2 != LuaNil.nil) {
                this.f4110B.m854b(Boolean.valueOf(((Boolean) obj2).booleanValue()));
            }
        } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE) {
            r0 = cr.m2201a(obj2, 1);
            if (r0 != null && r0 != LuaNil.nil) {
                this.M = ((Double) r0).intValue();
                m4518p();
            }
        } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT) {
            r0 = cr.m2201a(obj2, 1);
            if (r0 != null && r0 != LuaNil.nil) {
                this.N = ((Double) r0).floatValue();
                m4518p();
            }
        } else if (intern == f4088c && obj2 != LuaNil.nil) {
            this.f4110B.m837a(this.f4122Y);
        }
    }

    public final void m4512a(String str) {
        LuaTable luaTable = (LuaTable) this.f4113P.remove(str);
        if (luaTable != null && str != null) {
            LuaNil table = luaTable.getTable(f4108y);
            LuaNil table2 = luaTable.getTable(f4109z);
            if (table != LuaNil.nil) {
                this.f4114Q.remove(table);
            }
            if (table2 != LuaNil.nil) {
                this.f4114Q.remove(table2);
            }
            if (this.E != KONY_WIDGET_BACKUP) {
                this.f4110B.m866e(str);
                if (table != LuaNil.nil || table2 != LuaNil.nil) {
                    m4502a(Boolean.valueOf(false));
                }
            }
        }
    }

    public final void m4513b(LuaTable luaTable) {
        LuaNil table = luaTable.getTable(f4107x);
        if (table != LuaNil.nil) {
            m4512a((String) table);
        }
        m4501a(luaTable, Boolean.valueOf(true));
    }

    public final boolean m4514b() {
        return this.N != -1.0f ? false : this.f4116S;
    }

    public final LuaTable m4515c() {
        return this.E == KONY_WIDGET_RESTORE ? this.f4110B.m861d() : null;
    }

    public final void m4516c(LuaTable luaTable) {
        if (this.E != KONY_WIDGET_RESTORE) {
            return;
        }
        if (luaTable == null || luaTable.getTable("location") == LuaNil.nil) {
            this.f4110B.m853b(m4507e(luaTable));
        }
    }

    public final void cleanup() {
        this.f4114Q.clear();
        if (this.f4110B != null) {
            super.setTable(f4104u, Double.valueOf((double) this.f4110B.m857c()));
            this.f4110B.m867f();
            this.f4110B.removeAllViews();
        }
        this.f4110B = null;
        this.E = KONY_WIDGET_BACKUP;
        if (this.f4112D != null) {
            Iterator it = this.f4112D.iterator();
            while (it.hasNext()) {
                LuaWidget luaWidget = (eO) it.next();
                cr.m2209b((LuaWidget) this, luaWidget);
                luaWidget.cleanup();
            }
            this.f4112D.clear();
            this.f4112D = null;
        }
    }

    public final LuaWidget createClone() {
        return null;
    }

    public final void m4517d() {
        setTable(f4101r, LuaNil.nil);
        this.f4113P.clear();
        this.f4114Q.clear();
        if (this.E != KONY_WIDGET_BACKUP) {
            this.f4110B.m864e();
        }
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
        hashtable.put(f4101r, "table");
        hashtable.put(f4102s, "table");
        hashtable.put(f4104u, "number");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4496a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4124g = null;
            iiVar = new ii(new gI(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4124g;
            this.f4124g = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "Map";
    }

    public final View getWidget() {
        LuaNil table;
        if (this.E == KONY_WIDGET_BACKUP) {
            int i;
            Object table2;
            Boolean.valueOf(false);
            Boolean h = bW.m830h();
            LuaNil table3 = super.getTable(f4106w);
            if (table3 != LuaNil.nil) {
                f4090e = table3.toString();
            }
            if (KonyMain.f3656d >= 8) {
                if (h.booleanValue()) {
                    i = 2;
                    if (KonyMain.f3657e) {
                        Log.d("LuaMap", "createKonyWidget creating MapVersion" + i);
                    }
                    if (i == 2) {
                        this.f4110B = new cn(KonyMain.getActContext());
                    } else if (i == 1) {
                        this.f4110B = new ci(KonyMain.getActContext());
                    }
                    table = super.getTable(ATTR_WIDGET_ID);
                    if (table != LuaNil.nil) {
                        this.f4110B.m863d((String) table);
                    }
                    if (super.getTable(f4086a) != LuaNil.nil) {
                        this.f4110B.m840a(this.f4117T);
                    }
                    if (super.getTable(f4089d) != LuaNil.nil) {
                        this.f4110B.m838a(this.f4121X);
                    }
                    table = super.getTable(f4094k);
                    if (table != LuaNil.nil) {
                        this.f4110B.m846a(table.toString());
                    }
                    table = super.getTable(ATTR_WIDGET_ISVISIBLE);
                    if (table != LuaNil.nil) {
                        this.f4110B.m833a(m3942a(((Boolean) table).booleanValue()));
                    }
                    if (super.getTable(f4088c) != LuaNil.nil) {
                        this.f4110B.m837a(this.f4122Y);
                    }
                    table = super.getTable(f4101r);
                    if (table == LuaNil.nil) {
                        this.f4123f = (LuaTable) table;
                        m4502a(Boolean.valueOf(true));
                    } else {
                        table2 = super.getTable(f4102s);
                        if (table2 != LuaNil.nil) {
                            this.f4110B.m835a(this.f4118U);
                            m4504b(table2);
                        }
                    }
                    table = super.getTable(f4104u);
                    if (table != LuaNil.nil) {
                        this.f4110B.m858c((int) Double.parseDouble(table.toString()));
                    }
                    table = super.getTable(f4105v);
                    if (table != LuaNil.nil) {
                        if (table instanceof String) {
                            this.f4110B.m862d(((Double) table).intValue());
                        } else {
                            this.f4110B.m855b(((String) table).intern());
                        }
                    }
                    table = super.getTable(f4103t);
                    if (table != LuaNil.nil) {
                        this.f4110B.m856b(((Boolean) table).booleanValue());
                    }
                    table = super.getTable(f4096m);
                    if (table != LuaNil.nil) {
                        this.f4116S = ((Boolean) table).booleanValue();
                        this.f4110B.m860c(this.f4116S);
                    }
                    table = super.getTable(ATTR_WIDGET_MARGIN);
                    if (table != LuaNil.nil) {
                        this.f4110B.m849a(convertMarginsToPixels(table, this.I));
                    }
                    if (super.getTable(f4087b) != LuaNil.nil) {
                        this.f4110B.m839a(this.f4119V);
                    }
                    table = super.getTable(f4097n);
                    if (table != LuaNil.nil && (table instanceof eO)) {
                        this.f4111C.clear();
                        m4497a((eO) table);
                    }
                    table = super.getTable(f4085A);
                    if (table == LuaNil.nil) {
                        this.f4110B.m854b(Boolean.valueOf(((Boolean) table).booleanValue()));
                    } else {
                        this.f4110B.m854b(Boolean.valueOf(true));
                    }
                    table2 = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
                    if (table2 != LuaNil.nil) {
                        table2 = cr.m2201a(table2, 1);
                        if (table2 != null) {
                            this.M = ((Double) table2).intValue();
                        }
                    }
                    table2 = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
                    if (table2 != LuaNil.nil) {
                        table2 = cr.m2201a(table2, 1);
                        if (table2 != null) {
                            this.N = ((Double) table2).floatValue();
                            m4518p();
                        }
                    }
                    this.f4110B.m836a(this.f4120W);
                    this.E = KONY_WIDGET_RESTORE;
                    if (this.G) {
                        setWeight();
                    }
                    setEnabled(this.F.booleanValue());
                } else {
                    String str = f4090e;
                }
            }
            i = 1;
            if (KonyMain.f3657e) {
                Log.d("LuaMap", "createKonyWidget creating MapVersion" + i);
            }
            if (i == 2) {
                this.f4110B = new cn(KonyMain.getActContext());
            } else if (i == 1) {
                this.f4110B = new ci(KonyMain.getActContext());
            }
            table = super.getTable(ATTR_WIDGET_ID);
            if (table != LuaNil.nil) {
                this.f4110B.m863d((String) table);
            }
            if (super.getTable(f4086a) != LuaNil.nil) {
                this.f4110B.m840a(this.f4117T);
            }
            if (super.getTable(f4089d) != LuaNil.nil) {
                this.f4110B.m838a(this.f4121X);
            }
            table = super.getTable(f4094k);
            if (table != LuaNil.nil) {
                this.f4110B.m846a(table.toString());
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f4110B.m833a(m3942a(((Boolean) table).booleanValue()));
            }
            if (super.getTable(f4088c) != LuaNil.nil) {
                this.f4110B.m837a(this.f4122Y);
            }
            table = super.getTable(f4101r);
            if (table == LuaNil.nil) {
                table2 = super.getTable(f4102s);
                if (table2 != LuaNil.nil) {
                    this.f4110B.m835a(this.f4118U);
                    m4504b(table2);
                }
            } else {
                this.f4123f = (LuaTable) table;
                m4502a(Boolean.valueOf(true));
            }
            table = super.getTable(f4104u);
            if (table != LuaNil.nil) {
                this.f4110B.m858c((int) Double.parseDouble(table.toString()));
            }
            table = super.getTable(f4105v);
            if (table != LuaNil.nil) {
                if (table instanceof String) {
                    this.f4110B.m862d(((Double) table).intValue());
                } else {
                    this.f4110B.m855b(((String) table).intern());
                }
            }
            table = super.getTable(f4103t);
            if (table != LuaNil.nil) {
                this.f4110B.m856b(((Boolean) table).booleanValue());
            }
            table = super.getTable(f4096m);
            if (table != LuaNil.nil) {
                this.f4116S = ((Boolean) table).booleanValue();
                this.f4110B.m860c(this.f4116S);
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f4110B.m849a(convertMarginsToPixels(table, this.I));
            }
            if (super.getTable(f4087b) != LuaNil.nil) {
                this.f4110B.m839a(this.f4119V);
            }
            table = super.getTable(f4097n);
            this.f4111C.clear();
            m4497a((eO) table);
            table = super.getTable(f4085A);
            if (table == LuaNil.nil) {
                this.f4110B.m854b(Boolean.valueOf(true));
            } else {
                this.f4110B.m854b(Boolean.valueOf(((Boolean) table).booleanValue()));
            }
            table2 = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
            if (table2 != LuaNil.nil) {
                table2 = cr.m2201a(table2, 1);
                if (table2 != null) {
                    this.M = ((Double) table2).intValue();
                }
            }
            table2 = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
            if (table2 != LuaNil.nil) {
                table2 = cr.m2201a(table2, 1);
                if (table2 != null) {
                    this.N = ((Double) table2).floatValue();
                    m4518p();
                }
            }
            this.f4110B.m836a(this.f4120W);
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
            setEnabled(this.F.booleanValue());
        }
        this.f4110B.m831a();
        View b = this.f4110B.m851b();
        m4508e();
        table = super.getTable("navigateTo");
        LuaTable luaTable;
        if (table != LuaNil.nil) {
            luaTable = (LuaTable) table;
            m4509a(((Integer) luaTable.getTable("arg1")).intValue(), ((Boolean) luaTable.getTable("arg2")).booleanValue());
        } else {
            table = super.getTable("navigateToLocation");
            if (table != LuaNil.nil) {
                luaTable = (LuaTable) table;
                m4510a((LuaTable) luaTable.getTable("arg1"), ((Boolean) luaTable.getTable("arg2")).booleanValue(), ((Boolean) luaTable.getTable("arg3")).booleanValue());
            }
        }
        super.setTable("navigateTo", LuaNil.nil);
        super.setTable("navigateToLocation", LuaNil.nil);
        return b;
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f4110B.m849a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    protected final void m4518p() {
        switch (this.M) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.N >= 0.0f) {
                    this.f4110B.m852b(O != -1 ? (int) ((((float) O) * this.N) / 100.0f) : (int) ((((float) KonyMain.getActContext().m4167p()) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4514b()) {
                    this.f4110B.m852b((KonyMain.getActContext().m4167p() * 3) / 4);
                } else {
                    this.f4110B.m852b(-1);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.N >= 0.0f) {
                    int o = KonyMain.getActContext().m4166o();
                    this.f4110B.m852b((int) ((((float) (this.I instanceof eO ? (int) (((eO) this.I).m4231m() * ((float) o)) : o)) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4514b()) {
                    this.f4110B.m852b((KonyMain.getActContext().m4167p() * 3) / 4);
                } else {
                    this.f4110B.m852b(-1);
                }
            default:
        }
    }

    public final void setEnabled(boolean z) {
        this.F = Boolean.valueOf(z);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4110B.setEnabled(z);
            if (z) {
                this.f4110B.setDescendantFocusability(AccessibilityNodeInfoCompat.ACTION_SET_SELECTION);
            } else {
                this.f4110B.setDescendantFocusability(393216);
            }
        }
    }

    public final void setFocus() {
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4110B.m852b(i);
            this.f4110B.m831a();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        String intern = ((String) obj).intern();
        String str = intern == f4095l ? f4087b : intern;
        if (str == f4097n && (obj2 instanceof eO)) {
            m4505c(obj2);
        }
        super.setTable(str, obj2);
        if (str == f4101r) {
            super.setTable(f4102s, LuaNil.nil);
            super.setTable("navigateTo", LuaNil.nil);
        } else if (str == f4102s) {
            super.setTable(f4101r, LuaNil.nil);
            super.setTable("navigateTo", LuaNil.nil);
        } else if (str == f4097n && (obj2 instanceof eO)) {
            this.f4111C.clear();
            m4497a((eO) obj2);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(str, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4110B.m833a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4110B.m832a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4110B.m848a(false);
            this.f4110B.m865e(i);
            this.f4110B.m831a();
        }
    }

    public final String toString() {
        return "LuaMap: " + getTable(ATTR_WIDGET_ID);
    }
}
