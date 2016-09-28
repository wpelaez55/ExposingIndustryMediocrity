package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import ny0k.cN;
import ny0k.cr;

public final class fg extends LuaWidget {
    private static String f3829A;
    private static String f3830B;
    private static String f3831C;
    private static String f3832D;
    private static String f3833P;
    private static String f3834Q;
    private static String f3835R;
    private static String f3836S;
    private static String f3837T;
    private static String f3838U;
    private static String f3839V;
    private static String f3840W;
    private static String f3841X;
    private static String f3842Y;
    private static String f3843Z;
    public static String f3844a;
    public static String f3845b;
    private static String f3846c;
    private static String f3847d;
    private static String f3848e;
    private static String f3849f;
    private static String f3850g;
    private static String f3851h;
    private static String f3852i;
    private static String f3853j;
    private static String f3854k;
    private static String f3855l;
    private static String f3856m;
    private static String f3857n;
    private static String f3858o;
    private static String f3859p;
    private static String f3860q;
    private static String f3861r;
    private static String f3862s;
    private static String f3863t;
    private static String f3864u;
    private static String f3865v;
    private static String f3866w;
    private static String f3867x;
    private static String f3868y;
    private static String f3869z;
    private int aa;
    private C0212n ab;
    private Object ac;
    private Object[] ad;
    private Object[] ae;
    private boolean af;
    private LuaTable ag;
    private LuaTable ah;
    private LuaTable ai;
    private Object aj;
    private Boolean ak;
    private LuaTable al;
    private Object am;
    private ib an;
    private Vector ao;
    private Object ar;
    private Object as;
    private Hashtable at;
    private Hashtable au;
    private aU av;
    private aS aw;

    static {
        f3846c = "day";
        f3847d = "month";
        f3848e = "year";
        f3849f = "hour";
        f3850g = "minutes";
        f3851h = "seconds";
        f3852i = "datecomponents";
        f3853j = "dateformat";
        f3854k = "formatteddate";
        f3855l = "validstartdate";
        f3856m = "validenddate";
        f3857n = "viewtype";
        f3858o = "viewconfig";
        f3859p = "calendaricon";
        f3860q = "placeholder";
        f3861r = "onselection";
        f3862s = "contentalignment";
        f3863t = "hideMonthsHeader";
        f3864u = "hideDaysHeader";
        f3865v = "displayedMonth";
        f3866w = "dayTextAlignmentInCell";
        f3867x = "containerHeight";
        f3868y = "containerHeightReference";
        f3844a = "cellTemplate";
        f3845b = "widgetDataMapForCell";
        f3869z = "data";
        f3829A = "format";
        f3830B = "date";
        f3831C = "gridskin";
        f3832D = "gridcellskin";
        f3833P = "gridcellfocusskin";
        f3834Q = "gridcellselectedskin";
        f3835R = "gridcelltodayskin";
        f3836S = "gridcellweekendskin";
        f3837T = "gridcellinactivedaysskin";
        f3838U = "leftnavigationimage";
        f3839V = "rightnavigationimage";
        f3840W = "allowweekendselectable";
        f3841X = "gridconfig";
        f3842Y = "enableactivemonthonly";
        f3843Z = "enablenativecalendargridview";
        if (KonyMain.m4057C()) {
            f3852i = "dateComponents";
            f3853j = "dateFormat";
            f3854k = "formattedDate";
            f3855l = "validStartDate";
            f3856m = "validEndDate";
            f3857n = "viewType";
            f3858o = "viewConfig";
            f3859p = "calendarIcon";
            f3861r = "onSelection";
            f3862s = "contentAlignment";
            f3831C = "gridSkin";
            f3832D = "gridCellSkin";
            f3833P = "gridCellFocusSkin";
            f3834Q = "gridCellSelectedSkin";
            f3835R = "gridCellTodaySkin";
            f3836S = "gridCellWeekendSkin";
            f3837T = "gridCellInactiveDaysSkin";
            f3838U = "leftNavigationImage";
            f3839V = "rightNavigationImage";
            f3840W = "allowWeekendSelectable";
            f3841X = "gridConfig";
            f3842Y = "enableActiveMonthOnly";
            f3843Z = "enableNativeCalendarGridView";
        }
    }

    public fg(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.aa = 1;
        this.ab = null;
        this.ac = null;
        this.af = true;
        this.ak = Boolean.valueOf(false);
        this.an = null;
        this.ao = new Vector();
        this.as = null;
        this.at = new Hashtable();
        this.au = new Hashtable();
        this.av = new aU(this);
        this.aw = new aS(this);
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f3846c);
        if (table != LuaNil.nil) {
            super.setTable(f3846c, table);
        }
        table = luaTable.getTable(f3847d);
        if (table != LuaNil.nil) {
            super.setTable(f3847d, table);
        }
        table = luaTable.getTable(f3848e);
        if (table != LuaNil.nil) {
            super.setTable(f3848e, table);
        }
        table = luaTable.getTable(f3849f);
        if (table != LuaNil.nil) {
            super.setTable(f3849f, table);
        }
        table = luaTable.getTable(f3850g);
        if (table != LuaNil.nil) {
            super.setTable(f3850g, table);
        }
        table = luaTable.getTable(f3851h);
        if (table != LuaNil.nil) {
            super.setTable(f3851h, table);
        }
        table = luaTable.getTable(f3852i);
        if (table != LuaNil.nil) {
            super.setTable(f3852i, table);
        }
        table = luaTable.getTable(f3853j);
        if (table != LuaNil.nil) {
            super.setTable(f3853j, table);
        }
        table = luaTable.getTable(f3854k);
        if (table != LuaNil.nil) {
            super.setTable(f3854k, table);
        }
        table = luaTable.getTable(f3855l);
        if (table != LuaNil.nil) {
            super.setTable(f3855l, table);
        }
        table = luaTable.getTable(f3856m);
        if (table != LuaNil.nil) {
            super.setTable(f3856m, table);
        }
        table = luaTable.getTable(f3857n);
        if (table != LuaNil.nil) {
            super.setTable(f3857n, table);
        }
        table = luaTable.getTable(f3858o);
        if (table != LuaNil.nil) {
            super.setTable(f3858o, table);
        }
        table = luaTable.getTable(f3859p);
        if (table != LuaNil.nil) {
            super.setTable(f3859p, table);
        }
        table = luaTable.getTable(f3860q);
        if (table != LuaNil.nil) {
            super.setTable(f3860q, table);
        }
        table = luaTable.getTable(f3861r);
        if (table != LuaNil.nil) {
            super.setTable(f3861r, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable.getTable(ATTR_WIDGET_PROP_DEPRECATED) != LuaNil.nil) {
            LuaTable luaTable4 = (LuaTable) luaTable.getTable(ATTR_WIDGET_PROP_DEPRECATED);
            LuaNil table2 = luaTable4.getTable(f3829A);
            if (table2 != LuaNil.nil) {
                super.setTable(f3853j, table2);
            }
            table = luaTable4.getTable(f3830B);
            if (table != LuaNil.nil) {
                super.setTable(f3852i, table);
            }
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(f3862s);
            if (table != LuaNil.nil) {
                super.setTable(f3862s, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
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
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3843Z);
            if (table != LuaNil.nil) {
                super.setTable(f3843Z, table);
            }
            table = luaTable3.getTable(f3863t);
            if (table != LuaNil.nil) {
                super.setTable(f3863t, table);
            }
            table = luaTable3.getTable(f3864u);
            if (table != LuaNil.nil) {
                super.setTable(f3864u, table);
            }
            table = luaTable3.getTable(f3865v);
            if (table != LuaNil.nil) {
                super.setTable(f3865v, table);
            }
            table = luaTable3.getTable(f3866w);
            if (table != LuaNil.nil) {
                super.setTable(f3866w, table);
            }
            table = luaTable3.getTable(f3867x);
            if (table != LuaNil.nil) {
                super.setTable(f3867x, table);
            }
            table = luaTable3.getTable(f3868y);
            if (table != LuaNil.nil) {
                super.setTable(f3868y, table);
            }
            Object table3 = luaTable3.getTable(f3844a);
            if (table3 != LuaNil.nil) {
                super.setTable(f3844a, table3);
                m4289b(table3);
            }
            table = luaTable3.getTable(f3845b);
            if (table != LuaNil.nil) {
                super.setTable(f3845b, table);
            }
            table = luaTable3.getTable(f3869z);
            if (table != LuaNil.nil) {
                super.setTable(f3869z, table);
            }
        }
    }

    private fg(Object[] objArr) {
        super(10, 2, false);
        this.aa = 1;
        this.ab = null;
        this.ac = null;
        this.af = true;
        this.ak = Boolean.valueOf(false);
        this.an = null;
        this.ao = new Vector();
        this.as = null;
        this.at = new Hashtable();
        this.au = new Hashtable();
        this.av = new aU(this);
        this.aw = new aS(this);
        this.ad = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable(f3829A, objArr[3]);
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

    static /* synthetic */ View m4280a(fg fgVar, eO eOVar, Hashtable hashtable, Hashtable hashtable2, GregorianCalendar gregorianCalendar) {
        eO eOVar2;
        LuaTable luaTable = new LuaTable(0, 2);
        Object obj = hashtable2.get("template");
        if (obj instanceof eO) {
            eO eOVar3 = (eO) obj;
            cr.m2212c(fgVar, eOVar3);
            luaTable.setTable("template", obj);
            eOVar2 = eOVar3;
        } else {
            eOVar2 = eOVar;
        }
        LuaWidget luaWidget = (eO) eOVar2.createClone();
        if ((eOVar2 instanceof fd) || eOVar2 != eOVar) {
            fgVar.m4284a((eO) luaWidget, hashtable, hashtable2);
        } else {
            Iterator it = fgVar.ao.iterator();
            while (it.hasNext()) {
                fgVar.m4285a((String) it.next(), (eO) luaWidget, hashtable, hashtable2);
            }
        }
        View widget = luaWidget.getWidget();
        cr.m2204a(luaWidget, (LuaWidget) fgVar);
        luaTable.setTable("CloneBox", luaWidget);
        fgVar.au.put(gregorianCalendar, luaTable);
        return widget;
    }

    private void m4283a(eO eOVar) {
        int size = eOVar.f3720i.size();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable = (LuaTable) eOVar.f3720i.get(i);
            if (luaTable instanceof eO) {
                m4283a((eO) luaTable);
            }
            this.ao.add(luaTable.getTable(ATTR_WIDGET_ID).toString());
        }
    }

    private void m4284a(eO eOVar, Hashtable hashtable, Hashtable hashtable2) {
        int size = eOVar.f3720i.size();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable = (LuaTable) eOVar.f3720i.get(i);
            if (luaTable instanceof eO) {
                m4284a((eO) luaTable, hashtable, hashtable2);
            }
            m4285a(luaTable.getTable(ATTR_WIDGET_ID).toString(), eOVar, hashtable, hashtable2);
        }
    }

    private void m4285a(String str, eO eOVar, Hashtable hashtable, Hashtable hashtable2) {
        LuaNil table = eOVar.getTable(str);
        if (table != LuaNil.nil && table != null) {
            LuaTable luaTable = (LuaTable) table;
            Object obj = hashtable.get(str);
            if (obj != null) {
                Object obj2 = hashtable2.get(obj);
                if (obj2 instanceof LuaTable) {
                    if ((luaTable instanceof gA) || (luaTable instanceof eO) || (luaTable instanceof fe) || (luaTable instanceof gt)) {
                        Set keySet = ((LuaTable) obj2).map.keySet();
                        Hashtable hashtable3 = ((LuaTable) obj2).map;
                        for (Object next : keySet) {
                            luaTable.setTable(next, hashtable3.get(next));
                        }
                    }
                } else if (obj2 != null) {
                    if ((luaTable instanceof gA) || (luaTable instanceof fe)) {
                        luaTable.setTable(ATTR_WIDGET_LABEL, obj2);
                    } else if (luaTable instanceof gt) {
                        luaTable.setTable(gs.f4202a, obj2);
                    }
                }
                if (luaTable instanceof gt) {
                    luaTable.setTable("downloadmode", Integer.valueOf(1));
                }
            }
        } else if (KonyMain.f3657e) {
            Log.w("LuaCalendar", "Invalid key(" + str + ") passed in cellData to calendar : " + super.getTable(ATTR_WIDGET_ID));
        }
    }

    private static int[] m4286a(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        Calendar instance = Calendar.getInstance();
        try {
            simpleDateFormat.setLenient(false);
            instance.setTime(simpleDateFormat.parse(str));
            int i = instance.get(5);
            int i2 = instance.get(2);
            int i3 = instance.get(1);
            return new int[]{i, i2, i3};
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("LuaCalendar", "Parsing failed for date = " + str);
            }
            return null;
        }
    }

    private void m4289b(Object obj) {
        if (obj != this.as && (this.as instanceof LuaWidget)) {
            cr.m2209b((LuaWidget) this, (LuaWidget) this.as);
        }
        cr.m2212c(this, (LuaWidget) obj);
        this.as = obj;
    }

    private int[] m4290b(LuaTable luaTable) {
        int i = -1;
        if (!luaTable.list.isEmpty()) {
            LuaNil luaNil = luaTable.list.get(0);
            LuaNil luaNil2 = luaTable.list.get(1);
            LuaNil luaNil3 = luaTable.list.get(2);
            if (luaNil == LuaNil.nil || luaNil2 == LuaNil.nil || luaNil3 == LuaNil.nil) {
                return null;
            }
            int e;
            int parseInt;
            if (luaNil2 instanceof String) {
                e = C0371G.m2375e(luaNil2.toString());
                if (e == i) {
                    try {
                        e = Integer.parseInt(luaNil2.toString()) - 1;
                    } catch (NumberFormatException e2) {
                        if (KonyMain.f3657e) {
                            e2.printStackTrace();
                            throw new LuaError("Calendar widget. Invalid month value " + luaNil2 + " for widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                        }
                    }
                }
            }
            e = luaNil2 instanceof Double ? ((Double) luaNil2).intValue() - 1 : i;
            if (luaNil instanceof String) {
                try {
                    parseInt = Integer.parseInt(luaNil.toString());
                } catch (NumberFormatException e3) {
                    if (KonyMain.f3657e) {
                        e3.printStackTrace();
                        throw new LuaError("Calendar widget. Invalid day value " + luaNil + " for widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                    }
                    parseInt = i;
                }
            } else {
                parseInt = ((Double) luaNil).intValue();
            }
            if (luaNil3 instanceof String) {
                try {
                    i = Integer.parseInt(luaNil3.toString());
                } catch (NumberFormatException e32) {
                    if (KonyMain.f3657e) {
                        e32.printStackTrace();
                        throw new LuaError("Calendar widget. Invalid day value " + luaNil3 + " widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                    }
                }
            }
            i = ((Double) luaNil3).intValue();
            if (C0371G.m2374d(parseInt, e, i)) {
                return new int[]{parseInt, e, i};
            }
        }
        return null;
    }

    private void m4293c(LuaTable luaTable) {
        int i = -1;
        if (luaTable.list.isEmpty()) {
            setTable(f3852i, LuaNil.nil);
            super.setTable("dateret", LuaNil.nil);
            super.setTable(f3846c, LuaNil.nil);
            super.setTable(f3847d, LuaNil.nil);
            super.setTable(f3848e, LuaNil.nil);
            return;
        }
        LuaNil luaNil = luaTable.list.get(0);
        LuaNil luaNil2 = luaTable.list.get(1);
        LuaNil luaNil3 = luaTable.list.get(2);
        if (luaNil != LuaNil.nil && luaNil2 != LuaNil.nil && luaNil3 != LuaNil.nil) {
            int e;
            int parseInt;
            if (luaNil2 instanceof String) {
                e = C0371G.m2375e(luaNil2.toString());
                if (e == i) {
                    try {
                        e = Integer.parseInt(luaNil2.toString()) - 1;
                    } catch (NumberFormatException e2) {
                        if (KonyMain.f3657e) {
                            e2.printStackTrace();
                            throw new LuaError("Calendar widget. Invalid month value " + luaNil2 + " set for widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                        }
                    }
                }
            }
            e = luaNil2 instanceof Double ? ((Double) luaNil2).intValue() - 1 : i;
            if (luaNil instanceof String) {
                try {
                    parseInt = Integer.parseInt(luaNil.toString());
                } catch (NumberFormatException e3) {
                    if (KonyMain.f3657e) {
                        e3.printStackTrace();
                        throw new LuaError("Calendar widget. Invalid day value " + luaNil + " set for widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                    }
                    parseInt = i;
                }
            } else {
                parseInt = ((Double) luaNil).intValue();
            }
            if (luaNil3 instanceof String) {
                try {
                    i = Integer.parseInt(luaNil3.toString());
                } catch (NumberFormatException e32) {
                    if (KonyMain.f3657e) {
                        e32.printStackTrace();
                        throw new LuaError("Calendar widget. Invalid year value " + luaNil3 + " set for widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                    }
                }
            }
            i = ((Double) luaNil3).intValue();
            if (C0371G.m2374d(parseInt, e, i)) {
                this.ab.m1464a(parseInt, e, i);
            }
        }
    }

    private void m4294d(LuaTable luaTable) {
        int i = -1;
        if (!luaTable.list.isEmpty()) {
            LuaNil luaNil = luaTable.list.get(0);
            LuaNil luaNil2 = luaTable.list.get(1);
            if (luaNil != LuaNil.nil && luaNil2 != LuaNil.nil) {
                int e;
                if (luaNil instanceof String) {
                    e = C0371G.m2375e(luaNil.toString());
                    if (e == i) {
                        try {
                            e = Integer.parseInt(luaNil.toString()) - 1;
                        } catch (NumberFormatException e2) {
                            if (KonyMain.f3657e) {
                                e2.printStackTrace();
                                throw new LuaError("Calendar widget. Invalid month value " + luaNil + " set for widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                            }
                        }
                    }
                }
                e = luaNil instanceof Double ? ((Double) luaNil).intValue() - 1 : luaNil instanceof Integer ? ((Integer) luaNil).intValue() - 1 : i;
                if (luaNil2 instanceof String) {
                    try {
                        i = Integer.parseInt(luaNil2.toString());
                    } catch (NumberFormatException e3) {
                        if (KonyMain.f3657e) {
                            e3.printStackTrace();
                            throw new LuaError("Calendar widget. Invalid year value " + luaNil2 + " set for widgetid = " + super.getTable(LuaWidget.ATTR_WIDGET_ID), 100);
                        }
                    }
                } else if (luaNil2 instanceof Double) {
                    i = ((Double) luaNil2).intValue();
                } else if (luaNil2 instanceof Integer) {
                    i = ((Integer) luaNil2).intValue();
                }
                if (C0371G.m2374d(1, e, i)) {
                    ((aO) this.ab).m2447b(e, i);
                }
            }
        }
    }

    private void m4295e(LuaTable luaTable) {
        if (luaTable != null) {
            Object table = luaTable.getTable("CloneBox");
            if (table instanceof eO) {
                cr.m2209b((LuaWidget) this, (LuaWidget) table);
            }
            table = luaTable.getTable("template");
            if (table instanceof eO) {
                cr.m2209b((LuaWidget) this, (LuaWidget) table);
            }
        }
    }

    private void m4296g() {
        int intValue;
        dB a;
        int[] b;
        LuaNil table = super.getTable(f3857n);
        if (table != LuaNil.nil) {
            intValue = ((Double) table).intValue();
            if (intValue == 2) {
                this.aa = 2;
            } else if (intValue == 3) {
                this.aa = 3;
            } else if (intValue == 1) {
                this.aa = 1;
            }
        }
        intValue = this.aa;
        C0212n aOVar = intValue == 2 ? new aO(KonyMain.getActContext()) : intValue == 3 ? new cH(KonyMain.getActContext()) : new C0371G(KonyMain.getActContext());
        this.ab = aOVar;
        Object table2 = super.getTable(ATTR_WIDGET_SKIN);
        if (table2 != LuaNil.nil) {
            a = cN.m2139a(table2);
            if (a != null) {
                this.ab.m1465a(a);
            }
        } else {
            this.ab.m1465a(new hp().m3352a());
        }
        table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table2 != LuaNil.nil) {
            a = cN.m2139a(table2);
            if (a != null) {
                this.ab.m1473b(a);
            }
        }
        LuaNil table3 = super.getTable(f3853j);
        if (table3 != LuaNil.nil && C0371G.m2376f((String) table3)) {
            this.ab.m1467a((String) table3);
        }
        table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            this.ab.m1463a(H, m4301a(((Boolean) table).booleanValue()));
        }
        if (m3941K()) {
            table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (!(table == LuaNil.nil || ((Double) table).intValue() == 0)) {
                table = super.getTable(ATTR_WIDGET_HEXPAND);
                if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                    this.ab.m1468a(true);
                }
            }
        }
        table = super.getTable(ATTR_WIDGET_VEXPAND);
        if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
            aOVar = this.ab;
        }
        table = super.getTable(ATTR_WIDGET_ALIGNMENT);
        if (table != LuaNil.nil) {
            switch (((Double) table).intValue()) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    this.ab.m1462a(51);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    this.ab.m1462a(49);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    this.ab.m1462a(53);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    this.ab.m1462a(19);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    this.ab.m1462a(17);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    this.ab.m1462a(21);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                    this.ab.m1462a(83);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                    this.ab.m1462a(81);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                    this.ab.m1462a(85);
                    break;
                default:
                    this.ab.m1462a(17);
                    break;
            }
        }
        table = super.getTable(f3862s);
        if (table != LuaNil.nil) {
            switch (((Double) table).intValue()) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    this.ab.m1471b(51);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    this.ab.m1471b(49);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    this.ab.m1471b(53);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    this.ab.m1471b(19);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    this.ab.m1471b(17);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    this.ab.m1471b(21);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                    this.ab.m1471b(83);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                    this.ab.m1471b(81);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                    this.ab.m1471b(85);
                    break;
                default:
                    this.ab.m1471b(17);
                    break;
            }
        }
        table = super.getTable(ATTR_WIDGET_MARGIN);
        if (table != LuaNil.nil) {
            this.ab.m1469a(convertMarginsToPixels(table, this.I));
        }
        table = super.getTable(ATTR_WIDGET_PADDING);
        if (table != LuaNil.nil) {
            this.ab.m1476b(convertPaddingToPixels(table, this.I));
        }
        if (this.aa != 2) {
            table = super.getTable(f3859p);
            if (table != LuaNil.nil) {
                this.ab.m1474b(table.toString());
            }
            table = super.getTable(f3860q);
            if (table != LuaNil.nil) {
                this.ab.m1479c(table.toString());
            }
        }
        if (this.aa != 1) {
            aO aOVar2 = (aO) this.ab;
            table3 = super.getTable(f3858o);
            if (table3 != LuaNil.nil) {
                table3 = ((LuaTable) table3).getTable(f3841X);
                if (table3 != LuaNil.nil) {
                    dB a2;
                    LuaTable luaTable = (LuaTable) table3;
                    LuaNil table4 = luaTable.getTable(f3838U);
                    if (table4 != LuaNil.nil) {
                        aOVar2.m2465e(table4.toString());
                    }
                    table4 = luaTable.getTable(f3839V);
                    if (table4 != LuaNil.nil) {
                        aOVar2.m2469f(table4.toString());
                    }
                    Object table5 = luaTable.getTable(f3831C);
                    if (table5 != LuaNil.nil) {
                        a2 = cN.m2139a(table5);
                        if (a2 != null) {
                            aOVar2.m2479i(a2);
                        }
                    }
                    table5 = luaTable.getTable(f3832D);
                    if (table5 != LuaNil.nil) {
                        a2 = cN.m2139a(table5);
                        if (a2 != null) {
                            aOVar2.m2456c(a2);
                        }
                    }
                    table5 = luaTable.getTable(f3833P);
                    if (table5 != LuaNil.nil) {
                        a2 = cN.m2139a(table5);
                        if (a2 != null) {
                            aOVar2.m2460d(a2);
                        }
                    }
                    table5 = luaTable.getTable(f3834Q);
                    if (table5 != LuaNil.nil) {
                        a2 = cN.m2139a(table5);
                        if (a2 != null) {
                            aOVar2.m2464e(a2);
                        }
                    }
                    table5 = luaTable.getTable(f3836S);
                    if (table5 != LuaNil.nil) {
                        a2 = cN.m2139a(table5);
                        if (a2 != null) {
                            aOVar2.m2472g(a2);
                        }
                    }
                    table5 = luaTable.getTable(f3837T);
                    if (table5 != LuaNil.nil) {
                        a2 = cN.m2139a(table5);
                        if (a2 != null) {
                            aOVar2.m2468f(a2);
                        }
                    }
                    table5 = luaTable.getTable(f3835R);
                    if (table5 != LuaNil.nil) {
                        a2 = cN.m2139a(table5);
                        if (a2 != null) {
                            aOVar2.m2476h(a2);
                        }
                    }
                    table3 = luaTable.getTable(f3840W);
                    if (table3 != LuaNil.nil) {
                        aOVar2.m2462d(((Boolean) table3).booleanValue());
                    }
                }
            }
            table3 = super.getTable(f3842Y);
            if (table3 != LuaNil.nil) {
                aOVar2.m2466e(((Boolean) table3).booleanValue());
            }
        } else {
            table3 = super.getTable(f3843Z);
            if (table3 != LuaNil.nil) {
                ((C0371G) this.ab).m2385a((Boolean) table3);
            }
        }
        table = super.getTable(f3855l);
        if (table != LuaNil.nil && (table instanceof LuaTable)) {
            b = m4290b((LuaTable) table);
            if (b != null) {
                this.ab.m1472b(b[0], b[1], b[2]);
            }
        }
        table = super.getTable(f3856m);
        if (table != LuaNil.nil && (table instanceof LuaTable)) {
            b = m4290b((LuaTable) table);
            if (b != null) {
                this.ab.m1478c(b[0], b[1], b[2]);
            }
        }
        table = super.getTable(f3861r);
        if (table != LuaNil.nil) {
            this.ac = table;
            this.an = new ib(this);
            this.ab.m1466a(this.an);
        }
        if (super.getTable("dateret") != LuaNil.nil) {
            int intValue2 = ((Double) super.getTable(f3846c)).intValue();
            int intValue3 = ((Double) super.getTable(f3847d)).intValue() - 1;
            intValue = ((Double) super.getTable(f3848e)).intValue();
            if (C0371G.m2374d(intValue2, intValue3, intValue)) {
                this.ab.m1464a(intValue2, intValue3, intValue);
            }
        } else {
            table = super.getTable(f3852i);
            if (table != LuaNil.nil && (table instanceof LuaTable)) {
                m4293c((LuaTable) table);
            }
        }
        table = super.getTable(ATTR_WIDGET_SET_ENABLED);
        if (table != LuaNil.nil) {
            this.ab.m1480c(((Boolean) table).booleanValue());
        }
        table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil && (table instanceof LuaTable)) {
            this.ab.m1482d(m4303a((LuaTable) table, null));
        }
        this.E = KONY_WIDGET_RESTORE;
        if (this.aa != 1) {
            if (this.al != null) {
                m4305a(this.al, this.am);
            }
            if (this.ag != null) {
                m4306a(this.ag, this.aj, this.ak);
            } else if (!(this.ah == null || this.ai == null)) {
                m4304a(this.ah, this.ai, this.aj, this.ak);
            }
            table3 = super.getTable(f3863t);
            if (table3 != LuaNil.nil) {
                ((aO) this.ab).m2470f(((Boolean) table3).booleanValue());
            }
            table3 = super.getTable(f3864u);
            if (table3 != LuaNil.nil) {
                ((aO) this.ab).m2474g(((Boolean) table3).booleanValue());
            }
            table = super.getTable(f3865v);
            if (table != LuaNil.nil && (table instanceof LuaTable)) {
                m4294d((LuaTable) table);
            }
            table2 = super.getTable(f3844a);
            if (table2 != LuaNil.nil && (table2 instanceof eO)) {
                m4289b(table2);
                this.ao.clear();
                m4283a((eO) table2);
            }
            if (super.getTable(f3869z) != LuaNil.nil) {
                m4298i();
            }
            table3 = super.getTable(f3866w);
            if (table3 != LuaNil.nil && (table3 instanceof Double)) {
                ((aO) this.ab).m2454c(((Double) table3).intValue());
            }
            ((aO) this.ab).m2435a(this.aw);
            ((aO) this.ab).m2436a(this.av);
        }
        if (this.G) {
            setWeight();
        }
    }

    private String m4297h() {
        return this.ab.m1481d() == -1 ? null : this.ab.m1486h();
    }

    private void m4298i() {
        m4300k();
        this.at.clear();
        LuaNil table = super.getTable(f3869z);
        if (table != LuaNil.nil && table != null && (table instanceof LuaTable)) {
            LuaTable luaTable = (LuaTable) table;
            if (this.aa != 1 && luaTable.map.size() > 0) {
                Enumeration keys = luaTable.map.keys();
                while (keys.hasMoreElements()) {
                    Object nextElement = keys.nextElement();
                    if (nextElement instanceof String) {
                        int[] a = m4286a((String) nextElement, "dd/MM/yyyy");
                        if (a != null) {
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(a[2], a[1], a[0]);
                            Object table2 = luaTable.getTable(nextElement);
                            if (table2 instanceof LuaTable) {
                                this.at.put(gregorianCalendar, (LuaTable) table2);
                            }
                        }
                    }
                }
            }
        }
    }

    private int m4299j() {
        LuaNil table = super.getTable(f3857n);
        if (table != LuaNil.nil) {
            int intValue = ((Double) table).intValue();
            if (intValue == 2) {
                this.aa = 2;
            } else if (intValue == 3) {
                this.aa = 3;
            } else if (intValue == 1) {
                this.aa = 1;
            }
        }
        return this.aa;
    }

    private void m4300k() {
        if (this.au != null) {
            for (GregorianCalendar gregorianCalendar : this.au.keySet()) {
                m4295e((LuaTable) this.au.get(gregorianCalendar));
            }
            this.au.clear();
            KonyMain.m4143x().m1782b(KonyMain.m4061G());
        }
    }

    protected final int m4301a(boolean z) {
        int a = super.m3942a(z);
        return (this.G && !z && H == -1) ? 4 : a;
    }

    public final Object m4302a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f3854k || intern == f3830B) {
            if (this.E == KONY_WIDGET_RESTORE) {
                return m4297h();
            }
            if (KonyMain.f3658f) {
                Log.w("LuaCalendar", "WARNING!!! ATTR_CAL_DATE called when form is not active");
            }
            return super.getTable("dateret");
        } else if (intern != f3852i) {
            if (intern == f3846c) {
                if (this.E == KONY_WIDGET_RESTORE) {
                    return this.ab.m1481d() == -1 ? null : new Double((double) this.ab.m1481d());
                } else {
                    if (KonyMain.f3658f) {
                        Log.w("LuaCalendar", "WARNING!!! ATTR_CAL_DAY called when form is not active");
                    }
                    if (super.getTable(f3846c) == LuaNil.nil && super.getTable(f3852i) != LuaNil.nil) {
                        return new Double((double) ((Double) ((LuaTable) super.getTable(f3852i)).list.get(0)).intValue());
                    }
                }
            } else if (intern == f3847d) {
                if (this.E == KONY_WIDGET_RESTORE) {
                    return this.ab.m1483e() == -1 ? null : new Double((double) (this.ab.m1483e() + 1));
                } else {
                    if (KonyMain.f3658f) {
                        Log.w("LuaCalendar", "WARNING!!! ATTR_CAL_MONTH called when form is not active");
                    }
                    if (super.getTable(f3847d) == LuaNil.nil && super.getTable(f3852i) != LuaNil.nil) {
                        return new Double((double) ((Double) ((LuaTable) super.getTable(f3852i)).list.get(1)).intValue());
                    }
                }
            } else if (intern == f3848e) {
                if (this.E == KONY_WIDGET_RESTORE) {
                    return this.ab.m1484f() == -1 ? null : new Double((double) this.ab.m1484f());
                } else {
                    if (KonyMain.f3658f) {
                        Log.w("LuaCalendar", "WARNING!!! ATTR_CAL_YEAR called when form is not active");
                    }
                    if (super.getTable(f3848e) == LuaNil.nil && super.getTable(f3852i) != LuaNil.nil) {
                        return new Double((double) ((Double) ((LuaTable) super.getTable(f3852i)).list.get(2)).intValue());
                    }
                }
            } else if (intern == f3855l || intern == f3856m) {
                if (this.aa != 1) {
                    return super.getTable(intern);
                }
            } else if (intern == f3865v) {
                if (m4299j() != 1) {
                    if (this.E == KONY_WIDGET_RESTORE) {
                        return ((aO) this.ab).m2429F();
                    }
                    if (KonyMain.f3658f) {
                        Log.w("LuaCalendar", "WARNING!!! ATTR_CAL_DISPLAYED_MONTH called when form is not active");
                    }
                    LuaNil table = super.getTable(f3865v);
                    if (table != LuaNil.nil) {
                        return (LuaTable) table;
                    }
                    Object obj2;
                    Object obj3;
                    table = super.getTable(f3852i);
                    if (table != LuaNil.nil) {
                        r0 = (LuaTable) table;
                        obj2 = (Double) r0.list.get(1);
                        obj3 = (Double) r0.list.get(2);
                    } else {
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(System.currentTimeMillis());
                        obj2 = new Double((double) instance.get(2));
                        obj3 = new Double((double) instance.get(1));
                    }
                    LuaTable luaTable = new LuaTable(2, 0);
                    luaTable.list.add(obj2);
                    luaTable.list.add(obj3);
                    return luaTable;
                }
            } else if ((intern == f3863t || intern == f3864u) && m4299j() != 1 && super.getTable(intern) == LuaNil.nil) {
                return Boolean.valueOf(false);
            }
            return super.getTable(intern);
        } else if (this.E == KONY_WIDGET_RESTORE) {
            r0 = new LuaTable(6, 0);
            r0.list.add(new Double((double) this.ab.m1481d()));
            r0.list.add(Double.valueOf(new Double((double) this.ab.m1483e()).doubleValue() + 1.0d));
            r0.list.add(new Double((double) this.ab.m1484f()));
            r0.list.add(new Double(0.0d));
            r0.list.add(new Double(0.0d));
            r0.list.add(new Double(0.0d));
            return r0;
        } else {
            if (KonyMain.f3658f) {
                Log.w("LuaCalendar", "WARNING!!! ATTR_CAL_DATE_COMPONENTS called when form is not active");
            }
            return super.getTable(f3852i);
        }
    }

    protected final String m4303a(LuaTable luaTable, String str) {
        String str2 = BuildConfig.FLAVOR;
        if (luaTable == null) {
            return str2;
        }
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
        if (table != LuaNil.nil) {
            return str2 + ((String) table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN);
        if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
            return null;
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL);
        if (table != LuaNil.nil) {
            str2 = str2 + ((String) table);
        } else if (str != null) {
            str2 = str2 + str;
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HINT);
        return table != LuaNil.nil ? str2 + ((String) table) : str2;
    }

    public final void m4304a(LuaTable luaTable, LuaTable luaTable2, Object obj, Boolean bool) {
        this.ag = null;
        this.ah = luaTable;
        this.ai = luaTable2;
        this.aj = obj;
        this.ak = bool;
        if (this.E != KONY_WIDGET_BACKUP && this.aa != 1 && luaTable != null && luaTable != LuaNil.nil && luaTable2 != null && luaTable2 != LuaNil.nil) {
            int[] b = m4290b(luaTable);
            int[] b2 = m4290b(luaTable2);
            if (!new GregorianCalendar(b2[2], b2[1], b2[0]).before(new GregorianCalendar(b[2], b[1], b[0]))) {
                GregorianCalendar[] gregorianCalendarArr = new GregorianCalendar[]{new GregorianCalendar(b[2], b[1], b[0]), new GregorianCalendar(b2[2], b2[1], b2[0])};
                dB a = (obj == null || obj == LuaNil.nil) ? null : cN.m2139a(obj);
                ((aO) this.ab).m2444a(gregorianCalendarArr, a, bool.booleanValue());
                if (this.aa == 3 && !((aO) this.ab).m2427D()) {
                    this.ab.m1464a(-1, -1, -1);
                }
            }
        }
    }

    public final void m4305a(LuaTable luaTable, Object obj) {
        this.al = luaTable;
        this.am = obj;
        if (this.E != KONY_WIDGET_BACKUP && this.aa != 1 && luaTable != null && luaTable != LuaNil.nil) {
            ArrayList arrayList;
            dB a;
            if (!(obj == null || obj == LuaNil.nil)) {
                int size = luaTable.list.size();
                if (size > 0) {
                    ArrayList arrayList2 = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        int[] b = m4290b((LuaTable) luaTable.list.get(i));
                        arrayList2.add(new GregorianCalendar(b[2], b[1], b[0]));
                    }
                    arrayList = arrayList2;
                    a = cN.m2139a(obj);
                    ((aO) this.ab).m2440a(arrayList, a);
                }
            }
            a = null;
            arrayList = null;
            ((aO) this.ab).m2440a(arrayList, a);
        }
    }

    public final void m4306a(LuaTable luaTable, Object obj, Boolean bool) {
        dB dBVar = null;
        this.ah = null;
        this.ai = null;
        this.ag = luaTable;
        this.aj = obj;
        this.ak = bool;
        if (this.E != KONY_WIDGET_BACKUP && this.aa != 1 && luaTable != null && luaTable != LuaNil.nil) {
            int size = luaTable.list.size();
            if (size > 0) {
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    LuaTable luaTable2 = (LuaTable) luaTable.list.get(i);
                    if (!(luaTable2 == null || luaTable2 == LuaNil.nil)) {
                        int[] b = m4290b(luaTable2);
                        arrayList.add(new GregorianCalendar(b[2], b[1], b[0]));
                    }
                }
                if (!(obj == null || obj == LuaNil.nil)) {
                    dBVar = cN.m2139a(obj);
                }
                ((aO) this.ab).m2441a(arrayList, dBVar, bool.booleanValue());
                if (this.aa == 3 && !((aO) this.ab).m2427D()) {
                    this.ab.m1464a(-1, -1, -1);
                }
            }
        }
    }

    protected final void m4307a(Object obj, Object obj2) {
        boolean z = false;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.ab.m1463a(H, m4301a(((Boolean) obj2).booleanValue()));
                }
            } else if (intern == f3852i || intern == f3830B) {
                if (obj2 == LuaNil.nil || obj2 == null || !(obj2 instanceof LuaTable)) {
                    this.ab.m1485g();
                } else {
                    m4293c((LuaTable) obj2);
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.ab.m1465a(r0);
                        if (!this.ab.isFocused()) {
                            this.ab.m1475b(false);
                        }
                    }
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.ab.m1473b(r0);
                        if (this.ab.isFocused()) {
                            this.ab.m1475b(true);
                        }
                    }
                }
            } else if (intern == f3855l) {
                if (obj2 != null && obj2 != LuaNil.nil && (obj2 instanceof LuaTable)) {
                    r0 = m4290b((LuaTable) obj2);
                    if (r0 != null) {
                        this.ab.m1472b(r0[0], r0[1], r0[2]);
                        if (this.aa != 1) {
                            ((aO) this.ab).m2480j();
                        }
                    }
                }
            } else if (intern == f3856m) {
                if (obj2 != null && obj2 != LuaNil.nil && (obj2 instanceof LuaTable)) {
                    r0 = m4290b((LuaTable) obj2);
                    if (r0 != null) {
                        this.ab.m1478c(r0[0], r0[1], r0[2]);
                        if (this.aa != 1) {
                            ((aO) this.ab).m2480j();
                        }
                    }
                }
            } else if (intern == f3860q) {
                if (this.aa == 2) {
                    return;
                }
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.ab.m1479c(null);
                } else {
                    this.ab.m1479c(obj2.toString());
                }
            } else if (intern == f3858o) {
                if (this.aa != 1 && obj2 != null && obj2 != LuaNil.nil && obj2 != null && obj2 != LuaNil.nil) {
                    LuaNil table = ((LuaTable) obj2).getTable(f3841X);
                    if (table != LuaNil.nil) {
                        dB a;
                        aO aOVar = (aO) this.ab;
                        LuaTable luaTable = (LuaTable) table;
                        LuaNil table2 = luaTable.getTable(f3838U);
                        if (table2 != LuaNil.nil) {
                            aOVar.m2473g(table2.toString());
                        }
                        table2 = luaTable.getTable(f3839V);
                        if (table2 != LuaNil.nil) {
                            aOVar.m2477h(table2.toString());
                        }
                        Object table3 = luaTable.getTable(f3831C);
                        if (table3 != LuaNil.nil) {
                            a = cN.m2139a(table3);
                            if (a != null) {
                                aOVar.m2479i(a);
                                aOVar.m2481k();
                            }
                        }
                        table3 = luaTable.getTable(f3832D);
                        if (table3 != LuaNil.nil) {
                            a = cN.m2139a(table3);
                            if (a != null) {
                                aOVar.m2456c(a);
                                z = true;
                            }
                        }
                        table3 = luaTable.getTable(f3833P);
                        if (table3 != LuaNil.nil) {
                            a = cN.m2139a(table3);
                            if (a != null) {
                                aOVar.m2460d(a);
                                z = true;
                            }
                        }
                        table3 = luaTable.getTable(f3834Q);
                        if (table3 != LuaNil.nil) {
                            a = cN.m2139a(table3);
                            if (a != null) {
                                aOVar.m2464e(a);
                                z = true;
                            }
                        }
                        table3 = luaTable.getTable(f3836S);
                        if (table3 != LuaNil.nil) {
                            a = cN.m2139a(table3);
                            if (a != null) {
                                aOVar.m2472g(a);
                                z = true;
                            }
                        }
                        table3 = luaTable.getTable(f3837T);
                        if (table3 != LuaNil.nil) {
                            a = cN.m2139a(table3);
                            if (a != null) {
                                aOVar.m2468f(a);
                                z = true;
                            }
                        }
                        table3 = luaTable.getTable(f3835R);
                        if (table3 != LuaNil.nil) {
                            a = cN.m2139a(table3);
                            if (a != null) {
                                aOVar.m2476h(a);
                                z = true;
                            }
                        }
                        table = luaTable.getTable(f3840W);
                        if (table != LuaNil.nil) {
                            aOVar.m2462d(((Boolean) table).booleanValue());
                        }
                        if (z) {
                            aOVar.m2428E();
                        }
                    }
                }
            } else if (intern == f3859p) {
                if (this.aa != 2 && obj2 != null && obj2 != LuaNil.nil) {
                    this.ab.m1474b((String) obj2);
                }
            } else if (intern == f3853j) {
                if (obj2 != LuaNil.nil && obj2 != null) {
                    this.ab.m1467a((String) obj2);
                    if (this.aa == 1) {
                        ((C0371G) this.ab).m2407j();
                    } else {
                        ((aO) this.ab).m2484n();
                    }
                }
            } else if (intern == f3857n) {
                if (obj2 != LuaNil.nil && obj2 != null) {
                    int intValue = ((Double) obj2).intValue();
                    if (intValue != this.aa) {
                        this.aa = intValue;
                        View b = this.ab.m1470b();
                        ViewGroup viewGroup = (ViewGroup) b.getParent();
                        int indexOfChild = viewGroup.indexOfChild(b);
                        cleanup();
                        m4296g();
                        this.ab.m1460a();
                        viewGroup.removeView(b);
                        viewGroup.addView(this.ab.m1470b(), indexOfChild);
                    }
                }
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.ab.m1476b(convertPaddingToPixels(obj2, this.I));
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.ab.m1469a(convertMarginsToPixels(obj2, this.I));
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil && this.G) {
                setWeight();
                ((eO) this.I).m4238t();
            } else if (intern == f3862s && obj2 != LuaNil.nil) {
                switch (((Double) obj2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.ab.m1471b(51);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.ab.m1471b(49);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.ab.m1471b(53);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.ab.m1471b(19);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.ab.m1471b(17);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.ab.m1471b(21);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.ab.m1471b(83);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.ab.m1471b(81);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.ab.m1471b(85);
                    default:
                        this.ab.m1471b(17);
                }
            } else if (intern == f3861r) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.ac = obj2;
                    if (this.an == null) {
                        this.an = new ib(this);
                    }
                    this.ab.m1466a(this.an);
                }
            } else if (intern == f3842Y) {
                if (this.aa != 1 && obj2 != null && obj2 != LuaNil.nil) {
                    ((aO) this.ab).m2466e(((Boolean) obj2).booleanValue());
                }
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 != LuaNil.nil && (obj2 instanceof LuaTable)) {
                    this.ab.m1482d(m4303a((LuaTable) obj2, null));
                }
            } else if (intern == f3843Z && this.aa == 1) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    ((C0371G) this.ab).m2385a((Boolean) obj2);
                }
            } else if (this.aa == 1) {
            } else {
                if (intern == f3863t && obj2 != null && obj2 != LuaNil.nil) {
                    ((aO) this.ab).m2470f(((Boolean) obj2).booleanValue());
                } else if (intern == f3864u && obj2 != null && obj2 != LuaNil.nil) {
                    ((aO) this.ab).m2474g(((Boolean) obj2).booleanValue());
                } else if (intern == f3865v && (obj2 instanceof LuaTable)) {
                    m4294d((LuaTable) obj2);
                } else if (intern == f3844a && (obj2 instanceof eO)) {
                    m4289b(obj2);
                    this.ao.clear();
                    m4283a((eO) obj2);
                    ((aO) this.ab).m2487q();
                } else if (intern == f3869z && (obj2 instanceof LuaTable)) {
                    m4298i();
                    ((aO) this.ab).m2487q();
                } else if (intern == f3866w && (obj2 instanceof Double)) {
                    ((aO) this.ab).m2454c(((Double) obj2).intValue());
                    ((aO) this.ab).m2487q();
                }
            }
        }
    }

    public final void m4308a(String str) {
        if (m4299j() != 1) {
            int[] a = m4286a(str, "dd/MM/yyyy");
            if (a != null) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(a[2], a[1], a[0]);
                LuaNil table = super.getTable(f3869z);
                if (table != LuaNil.nil && table != null && (table instanceof LuaTable)) {
                    int i;
                    LuaTable luaTable = (LuaTable) table;
                    if (luaTable.map.size() > 0) {
                        Enumeration keys = luaTable.map.keys();
                        while (keys.hasMoreElements()) {
                            Object nextElement = keys.nextElement();
                            if (nextElement instanceof String) {
                                int[] a2 = m4286a((String) nextElement, "dd/MM/yyyy");
                                if (a2 != null && gregorianCalendar.equals(new GregorianCalendar(a2[2], a2[1], a2[0]))) {
                                    luaTable.map.remove(nextElement);
                                    i = 1;
                                    break;
                                }
                            }
                        }
                    }
                    i = 0;
                    if (i != 0) {
                        super.setTable(f3869z, luaTable);
                    }
                    if (this.E == KONY_WIDGET_RESTORE && i != 0) {
                        this.at.remove(gregorianCalendar);
                        m4295e((LuaTable) this.au.remove(gregorianCalendar));
                        ((aO) this.ab).m2487q();
                    }
                }
            }
        }
    }

    public final void m4309a(String str, LuaTable luaTable) {
        if (m4299j() != 1) {
            int[] a = m4286a(str, "dd/MM/yyyy");
            if (a != null) {
                Object luaTable2;
                GregorianCalendar gregorianCalendar = new GregorianCalendar(a[2], a[1], a[0]);
                LuaNil table = super.getTable(f3869z);
                if (table == LuaNil.nil || table == null || !(table instanceof LuaTable)) {
                    luaTable2 = new LuaTable();
                    luaTable2.setTable(str, luaTable);
                } else {
                    LuaTable luaTable3 = (LuaTable) table;
                    if (luaTable3.map.size() > 0) {
                        Enumeration keys = luaTable3.map.keys();
                        while (keys.hasMoreElements()) {
                            Object nextElement = keys.nextElement();
                            if (nextElement instanceof String) {
                                int[] a2 = m4286a((String) nextElement, "dd/MM/yyyy");
                                if (a2 != null && gregorianCalendar.equals(new GregorianCalendar(a2[2], a2[1], a2[0]))) {
                                    luaTable3.map.remove(nextElement);
                                    break;
                                }
                            }
                        }
                    }
                    luaTable3.map.put(str, luaTable);
                }
                super.setTable(f3869z, luaTable2);
                if (this.E == KONY_WIDGET_RESTORE) {
                    this.at.put(gregorianCalendar, luaTable);
                    m4295e((LuaTable) this.au.remove(gregorianCalendar));
                    table = super.getTable(f3845b);
                    if (table != LuaNil.nil && (table instanceof LuaTable)) {
                        Hashtable hashtable = ((LuaTable) table).map;
                        table = super.getTable(f3844a);
                        if (table != LuaNil.nil && (table instanceof eO)) {
                            ((aO) this.ab).m2487q();
                        }
                    }
                }
            }
        }
    }

    public final void m4310b() {
        if (this.ab != null) {
            this.ab.m1485g();
        }
    }

    public final void b_(LuaTable luaTable) {
        if (m4299j() != 1) {
            super.setTable(f3869z, luaTable);
            if (this.E == KONY_WIDGET_RESTORE) {
                m4298i();
                ((aO) this.ab).m2487q();
            }
        }
    }

    public final void m4311c() {
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = Boolean.valueOf(false);
        if (this.E == KONY_WIDGET_RESTORE && this.aa != 1) {
            ((aO) this.ab).m2424A();
        }
    }

    public final void cleanup() {
        if (this.ab != null) {
            String h = m4297h();
            if (h != null) {
                super.setTable("dateret", h);
            } else {
                super.setTable("dateret", LuaNil.nil);
            }
            if (this.ab.m1481d() != -1) {
                super.setTable(f3846c, new Double((double) this.ab.m1481d()));
            } else {
                super.setTable(f3846c, LuaNil.nil);
            }
            if (this.ab.m1483e() != -1) {
                super.setTable(f3847d, new Double((double) (this.ab.m1483e() + 1)));
            } else {
                super.setTable(f3847d, LuaNil.nil);
            }
            if (this.ab.m1484f() != -1) {
                super.setTable(f3848e, new Double((double) this.ab.m1484f()));
            } else {
                super.setTable(f3848e, LuaNil.nil);
            }
            if (!(this.aa == 1 || super.getTable(f3865v) == LuaNil.nil)) {
                super.setTable(f3865v, ((aO) this.ab).m2429F());
            }
            this.an = null;
            this.ab.m1477c();
            this.ab = null;
        }
        m4300k();
        this.at.clear();
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget fgVar = new fg(this.ad);
        fgVar.ae = this.ae;
        fgVar.setVisibility(this.af);
        return fgVar;
    }

    public final void m4312d() {
        super.setTable(f3869z, null);
        if (this.E == KONY_WIDGET_RESTORE) {
            m4300k();
            this.at.clear();
            if (m4299j() != 1) {
                ((aO) this.ab).m2487q();
            }
        }
    }

    protected final int d_() {
        return this.ab.m1470b().getHeight();
    }

    public final void m4313e() {
        if (this.E == KONY_WIDGET_RESTORE && m4299j() != 1) {
            ((aO) this.ab).m2486p();
        }
    }

    public final void m4314f() {
        if (this.E == KONY_WIDGET_RESTORE && m4299j() != 1) {
            ((aO) this.ab).m2485o();
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
        hashtable.put(f3830B, "table");
        hashtable.put(f3855l, "table");
        hashtable.put(f3856m, "table");
        hashtable.put(f3846c, "number");
        hashtable.put(f3847d, "number");
        hashtable.put(f3848e, "number");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4302a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.ar = null;
            iiVar = new ii(new fh(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.ar;
            this.ar = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "Calendar";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            m4296g();
        }
        this.ab.m1460a();
        return this.ab.m1470b();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.ab.m1476b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.ab.m1469a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.ab.m1480c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.ab.m1487i();
        }
    }

    public final void setFontColor(Object[] objArr) {
        this.ae = objArr;
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.ab.setHeight(i);
        }
    }

    public final void setTable(Object obj, Object obj2) {
        String intern = ((String) obj).intern();
        if (intern == f3853j) {
            if (C0371G.m2376f((String) obj2)) {
                super.setTable(f3853j, obj2);
            } else {
                return;
            }
        } else if (intern == f3830B) {
            super.setTable(f3852i, obj2);
        } else {
            super.setTable(obj, obj2);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
            return;
        }
        intern = ((String) obj).intern();
        if (intern == f3830B || intern == f3852i) {
            super.setTable("dateret", LuaNil.nil);
        }
    }

    public final void setVisibility(boolean z) {
        this.af = z;
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.ab.m1463a(H, m4301a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.ab.m1461a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaCalendar: " + getTable(ATTR_WIDGET_ID);
    }
}
