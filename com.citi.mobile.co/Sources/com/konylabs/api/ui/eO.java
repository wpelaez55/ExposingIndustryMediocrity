package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import ny0k.bO;
import ny0k.bU;
import ny0k.cD;
import ny0k.cE;
import ny0k.cN;
import ny0k.cr;

public class eO extends LuaWidget implements cv, cE {
    private static String f3709A;
    public static String f3710a;
    public static String f3711b;
    public static String f3712c;
    public static String f3713d;
    public static String f3714e;
    public static String f3715f;
    private static String f3716z;
    private LuaTable f3717B;
    protected C0174B f3718g;
    Object[] f3719h;
    public ArrayList f3720i;
    ArrayList f3721j;
    boolean f3722k;
    protected boolean f3723l;
    protected float f3724m;
    int f3725n;
    protected boolean f3726o;
    Object f3727p;
    protected int f3728q;
    protected int f3729r;
    protected boolean f3730s;
    protected iq f3731t;
    protected eO f3732u;
    public OnClickListener f3733v;
    SparseArray f3734w;
    protected float f3735x;
    protected int f3736y;

    static {
        f3710a = "onclick";
        f3711b = "position";
        f3712c = "orientation";
        f3713d = "percent";
        f3714e = "layoutalignment";
        f3715f = "contextmenu";
        f3716z = "containerheightreference";
        f3709A = "containerheight";
        if (KonyMain.m4057C()) {
            f3710a = "onClick";
            f3714e = "layoutAlignment";
            f3715f = "contextMenu";
            f3716z = "containerHeightReference";
            f3709A = "containerHeight";
        }
    }

    public eO() {
        this.f3718g = null;
        this.f3720i = new ArrayList();
        this.f3721j = new ArrayList();
        this.f3723l = true;
        this.f3724m = 0.0f;
        this.f3726o = false;
        this.f3727p = null;
        this.f3730s = false;
        this.f3733v = new eY(this);
        this.f3734w = new SparseArray();
        this.f3735x = 1.0f;
    }

    public eO(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3718g = null;
        this.f3720i = new ArrayList();
        this.f3721j = new ArrayList();
        this.f3723l = true;
        this.f3724m = 0.0f;
        this.f3726o = false;
        this.f3727p = null;
        this.f3730s = false;
        this.f3733v = new eY(this);
        this.f3734w = new SparseArray();
        this.f3735x = 1.0f;
        this.mBasicConfig = luaTable;
        this.mLayoutConfig = luaTable2;
        this.mPspConfig = luaTable3;
        m4207a(luaTable, luaTable2, luaTable3);
    }

    private eO(Object[] objArr) {
        super(10, 2, false);
        this.f3718g = null;
        this.f3720i = new ArrayList();
        this.f3721j = new ArrayList();
        this.f3723l = true;
        this.f3724m = 0.0f;
        this.f3726o = false;
        this.f3727p = null;
        this.f3730s = false;
        this.f3733v = new eY(this);
        this.f3734w = new SparseArray();
        this.f3735x = 1.0f;
        this.f3719h = objArr;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(f3712c, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable("spacing", objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(f3714e, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[6]);
        }
        if (objArr.length > 7 && objArr[7] != null && objArr[7] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[7]);
            LuaNil table = ((LuaTable) objArr[7]).getTable(f3711b);
            if (table != LuaNil.nil) {
                super.setTable(f3711b, table);
                this.f3725n = ((Double) table).intValue();
            }
        }
    }

    private int m4187a(Object obj, int i) {
        LuaWidget luaWidget = (LuaWidget) obj;
        int size = this.f3720i.size();
        int a = cr.m2199a(i, 0);
        int i2 = a < 0 ? 0 : a > size ? size : a;
        LuaNil table = luaWidget.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
        if (!(table == LuaNil.nil || ((luaWidget instanceof eO) && (((eO) luaWidget).m4226h() || ((eO) luaWidget).m4227i())))) {
            this.f3724m = ((Double) table).floatValue() + this.f3724m;
        }
        this.f3720i.add(i2, luaWidget);
        luaWidget.setParent(this);
        if (luaWidget instanceof hg) {
            this.f3726o = ((hg) luaWidget).m4715b();
        } else if (luaWidget instanceof hP) {
            this.f3726o = ((hP) luaWidget).m4659b();
        } else if (luaWidget instanceof gH) {
            this.f3726o = ((gH) luaWidget).m4514b();
        } else if (luaWidget instanceof eO) {
            size = ((eO) luaWidget).f3729r;
            if (size > 0) {
                this.f3729r += size;
                if (this.I instanceof fv) {
                    ((fv) this.I).m4433a(size);
                }
            }
        } else if (luaWidget instanceof hD) {
            if (((hD) luaWidget).m4632b()) {
                this.f3729r++;
                if (this.I instanceof fv) {
                    ((fv) this.I).m4433a(1);
                }
            }
        } else if (luaWidget instanceof hJ) {
            if (((hJ) luaWidget).m4648b()) {
                this.f3729r++;
            }
            if (this.I instanceof fv) {
                ((fv) this.I).m4433a(1);
            }
        }
        m4197b(new Object[]{obj}, true);
        return i2;
    }

    private void m4189a(dB dBVar) {
        this.f3718g.m132b(dBVar);
        this.f3718g.m114a();
    }

    private void m4194a(String str, LuaWidget luaWidget) {
        this.f3721j.add(luaWidget);
        super.m3948c(str, luaWidget);
    }

    private void m4195a(String str, LuaTable luaTable) {
        this.f3721j.remove(luaTable);
        super.m3948c(str, null);
    }

    private void m4196b(dB dBVar) {
        this.f3718g.m122a(dBVar);
        this.f3718g.m114a();
    }

    private void m4197b(Object[] objArr, boolean z) {
        while (true) {
            for (int i = 0; i < objArr.length; i++) {
                LuaWidget luaWidget;
                if (objArr[i] != LuaNil.nil) {
                    LuaWidget luaWidget2 = (LuaWidget) objArr[i];
                    if (luaWidget2 != luaWidget) {
                        if (luaWidget.I != null && LuaWidget.m3936a(luaWidget2) && (luaWidget.I instanceof fv)) {
                            ((fv) luaWidget.I).m4435a((C0211m) luaWidget2);
                        }
                        if (luaWidget.I != null) {
                            luaWidget.I.m3948c(luaWidget2.getID(), luaWidget2);
                        }
                        if (!z) {
                            luaWidget.m4194a(luaWidget2.getID(), luaWidget2);
                        }
                        if (luaWidget2 instanceof eO) {
                            int i2;
                            LuaWidget luaWidget3;
                            eO eOVar = (eO) luaWidget2;
                            for (i2 = 0; i2 < eOVar.f3720i.size(); i2++) {
                                luaWidget3 = (LuaWidget) eOVar.f3720i.get(i2);
                                if (luaWidget.I != null) {
                                    if (LuaWidget.m3936a(luaWidget3) && (luaWidget.I instanceof fv)) {
                                        ((fv) luaWidget.I).m4435a((C0211m) luaWidget3);
                                    }
                                    luaWidget.I.m3948c(luaWidget3.getID(), luaWidget3);
                                }
                                luaWidget.m4194a(luaWidget3.getID(), luaWidget3);
                            }
                            if (!eOVar.f3721j.isEmpty()) {
                                for (i2 = 0; i2 < eOVar.f3721j.size(); i2++) {
                                    luaWidget3 = (LuaWidget) eOVar.f3721j.get(i2);
                                    if (luaWidget.I != null) {
                                        if (LuaWidget.m3936a(luaWidget3) && (luaWidget.I instanceof fv)) {
                                            ((fv) luaWidget.I).m4435a((C0211m) luaWidget3);
                                        }
                                        luaWidget.I.m3948c(luaWidget3.getID(), luaWidget3);
                                    }
                                    luaWidget.m4194a(luaWidget3.getID(), luaWidget3);
                                }
                            }
                        }
                    }
                }
            }
            if (luaWidget.I instanceof eO) {
                z = false;
                luaWidget = (eO) luaWidget.I;
            } else {
                return;
            }
        }
    }

    private void m4198c(LuaWidget luaWidget) {
        Integer valueOf = Integer.valueOf(m3947b(luaWidget));
        this.L.remove(valueOf);
        m3949d(valueOf.intValue());
        m4214b();
        this.f3718g.m119a(luaWidget.getWidget());
        luaWidget.cleanup();
    }

    private void m4199c(Object obj) {
        Object obj2 = (LuaWidget) obj;
        if (!this.f3720i.remove(obj2)) {
            LuaWidget parent = obj2.getParent();
            if (parent != null && (parent instanceof eO)) {
                ((eO) parent).m4217b(obj2, null);
                return;
            }
            return;
        }
        LuaNil table = obj2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
        if (table != LuaNil.nil) {
            this.f3724m -= ((Double) table).floatValue();
        }
        if (((obj2 instanceof hg) && ((hg) obj2).m4715b()) || (((obj2 instanceof hP) && ((hP) obj2).m4659b()) || ((obj2 instanceof gH) && ((gH) obj2).m4514b()))) {
            this.f3726o = false;
        } else if (obj2 instanceof hD) {
            if (((hD) obj2).m4632b() && this.f3729r > 0) {
                this.f3729r--;
                if (this.I instanceof fv) {
                    ((fv) this.I).m4443b(1);
                } else if (!(eH.m3988a().getTable(getTable(ATTR_WIDGET_ID)) == LuaNil.nil && eG.m3985a().getTable(getTable(ATTR_WIDGET_ID)) == LuaNil.nil)) {
                    fv.m4426o().m4443b(1);
                }
            }
        } else if (obj2 instanceof hJ) {
            if (((hJ) obj2).m4648b() && this.f3729r > 0) {
                this.f3729r--;
                if (this.I instanceof fv) {
                    ((fv) this.I).m4443b(1);
                } else if (!(eH.m3988a().getTable(getTable(ATTR_WIDGET_ID)) == LuaNil.nil && eG.m3985a().getTable(getTable(ATTR_WIDGET_ID)) == LuaNil.nil)) {
                    fv.m4426o().m4443b(1);
                }
            }
        } else if (obj2 instanceof eO) {
            int i = ((eO) obj2).f3729r;
            if (i > 0) {
                this.f3729r -= i;
                if (this.I instanceof fv) {
                    ((fv) this.I).m4433a(i);
                } else if (!(eH.m3988a().getTable(getTable(ATTR_WIDGET_ID)) == LuaNil.nil && eG.m3985a().getTable(getTable(ATTR_WIDGET_ID)) == LuaNil.nil)) {
                    fv.m4426o().m4443b(i);
                }
            }
        }
        obj2.setParent(null);
        super.m3948c(obj2.getID(), null);
        m4212a(new Object[]{obj}, true);
    }

    private void m4200c(Object obj, int i, Object obj2) {
        if (obj != null && obj != LuaNil.nil) {
            LuaWidget luaWidget = (LuaWidget) obj;
            if (LuaWidget.m3939f(obj2)) {
                if (this.f3718g.getOrientation() == 0 && this.f3723l) {
                    luaWidget.setWeight();
                    m4214b();
                }
                long j = 0;
                Object a = cr.m2201a(((LuaTable) obj2).getTable(ATTR_WIDGET_ANIM_DELAY), 1);
                if (a != null) {
                    j = (long) (((Double) a).doubleValue() * 1000.0d);
                    ((LuaTable) obj2).setTable(ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
                }
                long j2 = j;
                setLayoutAnimator(luaWidget);
                this.f3718g.postDelayed(new eS(this, luaWidget, i, obj2), j2);
                return;
            }
            if (this.f3718g.getOrientation() == 0 && this.f3723l) {
                luaWidget.setWeight();
                m4214b();
            }
            m3945a(luaWidget, i);
            this.f3718g.m120a(luaWidget.getWidget(), getChildConvertedIndex(i));
        }
    }

    private void m4201e(Object obj, Object obj2) {
        if (obj != null && obj != LuaNil.nil) {
            LuaWidget luaWidget = (LuaWidget) obj;
            if (LuaWidget.m3939f(obj2)) {
                long j = 0;
                Object a = cr.m2201a(((LuaTable) obj2).getTable(ATTR_WIDGET_ANIM_DELAY), 1);
                if (a != null) {
                    j = (long) (((Double) a).doubleValue() * 1000.0d);
                    ((LuaTable) obj2).setTable(ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
                }
                long j2 = j;
                setLayoutAnimator(luaWidget);
                this.f3718g.postDelayed(new eV(this, luaWidget, obj2), j2);
                return;
            }
            m4198c(luaWidget);
        }
    }

    public final String m4202a(int i, Object obj, Object obj2) {
        LuaNil table;
        int intValue;
        aL aLVar;
        cD cDVar;
        int intValue2;
        LuaNil table2;
        if (obj != LuaNil.nil) {
            table = ((LuaTable) obj).getTable("fingers");
            if (table != LuaNil.nil) {
                intValue = ((Double) table).intValue();
                aLVar = (aL) this.f3734w.get(intValue);
                if (aLVar == null) {
                    cDVar = new cD();
                    cDVar.m2105a((LuaWidget) this);
                    aLVar = new aL(intValue, cDVar);
                    this.f3734w.append(intValue, aLVar);
                    if (this.E == KONY_WIDGET_RESTORE) {
                        this.f3718g.m118a(aLVar.f475a, aLVar.f477c);
                    }
                }
                cDVar = aLVar.f476b;
                if (i == 1) {
                    if (obj != LuaNil.nil) {
                        table = ((LuaTable) obj).getTable("taps");
                        if (table != LuaNil.nil) {
                            intValue2 = ((Double) table).intValue();
                            if (intValue2 != 1) {
                                cDVar.f2226a.put(new Integer(i - 1), obj2);
                                cDVar.f2227b.put(new Integer(i - 1), obj);
                                return intValue + "-" + cD.f2222c.toString();
                            }
                            cDVar.f2226a.put(new Integer(i), obj2);
                            cDVar.f2227b.put(new Integer(i), obj);
                            return intValue + "-" + cD.f2223d.toString();
                        }
                    }
                    intValue2 = 1;
                    if (intValue2 != 1) {
                        cDVar.f2226a.put(new Integer(i), obj2);
                        cDVar.f2227b.put(new Integer(i), obj);
                        return intValue + "-" + cD.f2223d.toString();
                    }
                    cDVar.f2226a.put(new Integer(i - 1), obj2);
                    cDVar.f2227b.put(new Integer(i - 1), obj);
                    return intValue + "-" + cD.f2222c.toString();
                } else if (i == 2) {
                    if (obj != LuaNil.nil) {
                        LuaTable luaTable = (LuaTable) obj;
                        table2 = luaTable.getTable("swipedistance");
                        if (table2 != LuaNil.nil) {
                            cDVar.m2104a(((Double) table2).intValue());
                        }
                        table = luaTable.getTable("swipevelocity");
                        if (table != LuaNil.nil) {
                            cDVar.m2107b(((Double) table).intValue());
                        }
                    }
                    cDVar.f2226a.put(new Integer(i), obj2);
                    cDVar.f2227b.put(new Integer(i), obj);
                    return intValue + "-" + cD.f2224e.toString();
                } else if (i == 3) {
                    return null;
                } else {
                    cDVar.f2226a.put(new Integer(i), obj2);
                    cDVar.f2227b.put(new Integer(i), obj);
                    return intValue + "-" + cD.f2225f.toString();
                }
            }
        }
        intValue = 1;
        aLVar = (aL) this.f3734w.get(intValue);
        if (aLVar == null) {
            cDVar = new cD();
            cDVar.m2105a((LuaWidget) this);
            aLVar = new aL(intValue, cDVar);
            this.f3734w.append(intValue, aLVar);
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f3718g.m118a(aLVar.f475a, aLVar.f477c);
            }
        }
        cDVar = aLVar.f476b;
        if (i == 1) {
            if (obj != LuaNil.nil) {
                table = ((LuaTable) obj).getTable("taps");
                if (table != LuaNil.nil) {
                    intValue2 = ((Double) table).intValue();
                    if (intValue2 != 1) {
                        cDVar.f2226a.put(new Integer(i - 1), obj2);
                        cDVar.f2227b.put(new Integer(i - 1), obj);
                        return intValue + "-" + cD.f2222c.toString();
                    }
                    cDVar.f2226a.put(new Integer(i), obj2);
                    cDVar.f2227b.put(new Integer(i), obj);
                    return intValue + "-" + cD.f2223d.toString();
                }
            }
            intValue2 = 1;
            if (intValue2 != 1) {
                cDVar.f2226a.put(new Integer(i), obj2);
                cDVar.f2227b.put(new Integer(i), obj);
                return intValue + "-" + cD.f2223d.toString();
            }
            cDVar.f2226a.put(new Integer(i - 1), obj2);
            cDVar.f2227b.put(new Integer(i - 1), obj);
            return intValue + "-" + cD.f2222c.toString();
        } else if (i == 2) {
            if (obj != LuaNil.nil) {
                LuaTable luaTable2 = (LuaTable) obj;
                table2 = luaTable2.getTable("swipedistance");
                if (table2 != LuaNil.nil) {
                    cDVar.m2104a(((Double) table2).intValue());
                }
                table = luaTable2.getTable("swipevelocity");
                if (table != LuaNil.nil) {
                    cDVar.m2107b(((Double) table).intValue());
                }
            }
            cDVar.f2226a.put(new Integer(i), obj2);
            cDVar.f2227b.put(new Integer(i), obj);
            return intValue + "-" + cD.f2224e.toString();
        } else if (i == 3) {
            return null;
        } else {
            cDVar.f2226a.put(new Integer(i), obj2);
            cDVar.f2227b.put(new Integer(i), obj);
            return intValue + "-" + cD.f2225f.toString();
        }
    }

    public void m4203a(int i) {
    }

    public final void m4204a(ViewGroup viewGroup) {
        if (this.E == KONY_WIDGET_RESTORE && this.f3718g.getParent() == viewGroup && viewGroup != null) {
            viewGroup.removeView(this.f3718g);
            cleanup();
        }
    }

    public final void m4205a(LuaWidget luaWidget, Object obj, int i, Object obj2) {
        if (luaWidget != null) {
            if (LuaWidget.m3939f(obj2)) {
                long j = 0;
                Object a = cr.m2201a(((LuaTable) obj2).getTable(ATTR_WIDGET_ANIM_DELAY), 1);
                if (a != null) {
                    j = (long) (((Double) a).doubleValue() * 1000.0d);
                    ((LuaTable) obj2).setTable(ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
                }
                long j2 = j;
                setLayoutAnimator(luaWidget);
                this.f3718g.postDelayed(new fa(this, obj2, luaWidget, obj, i), j2);
                return;
            }
            m4199c((Object) luaWidget);
            m4201e(luaWidget, null);
            m4200c(obj, m4187a(obj, i), null);
        }
    }

    public final void m4206a(cu cuVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = (Function) cuVar.f1030i;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", cuVar.f1028g);
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }

    protected void m4207a(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f3710a);
        if (table != LuaNil.nil) {
            super.setTable(f3710a, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f3711b);
        if (table != LuaNil.nil) {
            super.setTable(f3711b, table);
            this.f3725n = ((Double) table).intValue();
        }
        table = luaTable.getTable(f3712c);
        if (table != LuaNil.nil) {
            super.setTable(f3712c, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        table = luaTable.getTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS);
        if (table != LuaNil.nil) {
            super.setTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
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
            table = luaTable2.getTable(f3713d);
            if (table != LuaNil.nil) {
                super.setTable(f3713d, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(f3714e);
            if (table != LuaNil.nil) {
                super.setTable(f3714e, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_VEXPAND, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3715f);
            if (table != LuaNil.nil) {
                super.setTable(f3715f, table);
            }
            table = luaTable3.getTable(ATTR_WIDGET_ANIMATION);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ANIMATION, table);
            }
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, luaTable3);
        }
    }

    public final void m4208a(Object obj) {
        String[] split = obj.toString().split("-");
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            aL aLVar = (aL) this.f3734w.get(parseInt);
            if (aLVar != null) {
                cD cDVar = aLVar.f476b;
                if (cDVar != null) {
                    int parseDouble = (int) Double.parseDouble(split[1].toString());
                    if ((obj instanceof Double) && parseDouble == 1 && cDVar.f2226a.get(Integer.valueOf(parseDouble - 1)) != null) {
                        cDVar.f2226a.remove(Integer.valueOf(parseDouble - 1));
                        cDVar.f2227b.remove(Integer.valueOf(parseDouble - 1));
                    }
                    if (cDVar.f2226a.get(Integer.valueOf(parseDouble)) != null) {
                        cDVar.f2226a.remove(Integer.valueOf(parseDouble));
                        cDVar.f2227b.remove(Integer.valueOf(parseDouble));
                    }
                    if (cDVar.f2226a.isEmpty()) {
                        if (this.E == KONY_WIDGET_RESTORE) {
                            C0174B c0174b = this.f3718g;
                            GestureDetector gestureDetector = ((aL) this.f3734w.get(parseInt)).f475a;
                            c0174b.m158j(parseInt);
                        }
                        aLVar.f475a = null;
                        aLVar.f476b = null;
                        this.f3734w.delete(parseInt);
                    }
                }
            }
        }
    }

    public final synchronized void m4209a(Object obj, int i, Object obj2) {
        if (obj != null) {
            if (obj != LuaNil.nil) {
                int a = m4187a(obj, i);
                if (this.E == KONY_WIDGET_RESTORE) {
                    KonyMain.m4094a(new eR(this, obj, a, obj2));
                }
            }
        }
    }

    protected void m4210a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            dB a;
            if (intern != ATTR_WIDGET_SKIN || m4232n()) {
                if (intern == ATTR_WIDGET_FOCUS_SKIN && !m4232n()) {
                    if (obj2 != LuaNil.nil) {
                        a = cN.m2139a(obj2);
                        if (a != null) {
                            m4189a(a);
                        }
                    } else {
                        m4189a(null);
                    }
                }
            } else if (obj2 != LuaNil.nil) {
                a = cN.m2139a(obj2);
                if (a != null) {
                    m4196b(a);
                }
            } else {
                m4196b(null);
            }
            if (intern == f3715f && this.E == KONY_WIDGET_RESTORE) {
                if (obj2 != LuaNil.nil) {
                    a_((LuaTable) obj2);
                } else {
                    this.f3718g.m124a(null);
                    this.f3718g.m121a(null);
                }
            }
            if (intern == f3710a) {
                this.f3727p = obj2;
                this.f3718g.setClickable(true);
                this.f3718g.setOnClickListener(this.f3733v);
            }
            if (intern == ATTR_WIDGET_ISVISIBLE) {
                this.f3718g.m130b(m3942a(((Boolean) obj2).booleanValue()));
            }
            if (intern == ATTR_WIDGET_VEXPAND) {
                if (obj2 != LuaNil.nil) {
                    this.f3718g.m134b(((Boolean) obj2).booleanValue());
                    this.f3718g.m143e();
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f3718g.m127a(convertMarginsToPixels(obj2, this.I));
                this.f3718g.m140d();
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f3718g.m135b(convertPaddingToPixels(obj2, this.I));
                this.f3718g.m140d();
            } else if (this.E == KONY_WIDGET_RESTORE && intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil && this.G) {
                if (this.I instanceof eO) {
                    this.f3735x = ((eO) this.I).f3735x;
                    float floatValue = ((Double) obj2).floatValue();
                    if (((eO) this.I).f3728q == 0) {
                        this.f3735x = (this.f3735x * floatValue) / 100.0f;
                    }
                }
                setWeight();
                this.f3718g.m140d();
                ((eO) this.I).m4238t();
            } else if (intern == ATTR_WIDGET_ANIMATION) {
                setAnimation();
            } else if (intern == f3716z && obj2 != LuaNil.nil) {
                this.M = ((Double) obj2).intValue();
                C0174B c0174b = this.f3718g;
                int i = this.M;
                C0174B.m113j();
                m4234p();
            } else if (intern == f3709A && obj2 != LuaNil.nil) {
                this.N = ((Double) obj2).floatValue();
                m4234p();
                setHeight();
            } else if (intern == LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS) {
                boolean z = false;
                if (!(obj2 == null || obj2 == LuaNil.nil)) {
                    z = ((Boolean) obj2).booleanValue();
                }
                this.f3718g.m126a(z);
            } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
            } else {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f3718g.m133b(m3943a((LuaTable) obj2));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f3718g.m133b(BuildConfig.FLAVOR);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m4211a(java.lang.Object[] r8) {
        /*
        r7 = this;
        r1 = 1;
        monitor-enter(r7);
        if (r8 != 0) goto L_0x0006;
    L_0x0004:
        monitor-exit(r7);
        return;
    L_0x0006:
        r2 = r8.length;	 Catch:{ all -> 0x0073 }
        r2 = r2 + -1;
        r5 = new java.lang.Object[r2];	 Catch:{ all -> 0x0073 }
        r4 = r1;
    L_0x000c:
        r1 = r8.length;	 Catch:{ all -> 0x0073 }
        if (r4 >= r1) goto L_0x010b;
    L_0x000f:
        r1 = r8[r4];	 Catch:{ all -> 0x0073 }
        r2 = com.konylabs.vm.LuaNil.nil;	 Catch:{ all -> 0x0073 }
        if (r1 == r2) goto L_0x0062;
    L_0x0015:
        r1 = r4 + -1;
        r2 = r8[r4];	 Catch:{ all -> 0x0073 }
        r5[r1] = r2;	 Catch:{ all -> 0x0073 }
        r1 = r8[r4];	 Catch:{ all -> 0x0073 }
        r1 = (com.konylabs.api.ui.LuaWidget) r1;	 Catch:{ all -> 0x0073 }
        r2 = ATTR_WIDGET_CONTAINER_WEIGHT;	 Catch:{ all -> 0x0073 }
        r3 = r1.getTable(r2);	 Catch:{ all -> 0x0073 }
        r2 = com.konylabs.vm.LuaNil.nil;	 Catch:{ all -> 0x0073 }
        if (r3 == r2) goto L_0x004e;
    L_0x0029:
        r2 = r1 instanceof com.konylabs.api.ui.eO;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x0041;
    L_0x002d:
        r0 = r1;
        r0 = (com.konylabs.api.ui.eO) r0;	 Catch:{ all -> 0x0073 }
        r2 = r0;
        r2 = r2.m4226h();	 Catch:{ all -> 0x0073 }
        if (r2 != 0) goto L_0x004e;
    L_0x0037:
        r0 = r1;
        r0 = (com.konylabs.api.ui.eO) r0;	 Catch:{ all -> 0x0073 }
        r2 = r0;
        r2 = r2.m4227i();	 Catch:{ all -> 0x0073 }
        if (r2 != 0) goto L_0x004e;
    L_0x0041:
        r6 = r7.f3724m;	 Catch:{ all -> 0x0073 }
        r0 = r3;
        r0 = (java.lang.Double) r0;	 Catch:{ all -> 0x0073 }
        r2 = r0;
        r2 = r2.floatValue();	 Catch:{ all -> 0x0073 }
        r2 = r2 + r6;
        r7.f3724m = r2;	 Catch:{ all -> 0x0073 }
    L_0x004e:
        r2 = r7.f3720i;	 Catch:{ all -> 0x0073 }
        r2.add(r1);	 Catch:{ all -> 0x0073 }
        r1.setParent(r7);	 Catch:{ all -> 0x0073 }
        r2 = r1 instanceof com.konylabs.api.ui.hg;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x0066;
    L_0x005a:
        r1 = (com.konylabs.api.ui.hg) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4715b();	 Catch:{ all -> 0x0073 }
        r7.f3726o = r1;	 Catch:{ all -> 0x0073 }
    L_0x0062:
        r1 = r4 + 1;
        r4 = r1;
        goto L_0x000c;
    L_0x0066:
        r2 = r1 instanceof ny0k.bY;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x0076;
    L_0x006a:
        r1 = (ny0k.bY) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4836k();	 Catch:{ all -> 0x0073 }
        r7.f3726o = r1;	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x0073:
        r1 = move-exception;
        monitor-exit(r7);
        throw r1;
    L_0x0076:
        r2 = r1 instanceof ny0k.cb;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x0083;
    L_0x007a:
        r1 = (ny0k.cb) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4836k();	 Catch:{ all -> 0x0073 }
        r7.f3726o = r1;	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x0083:
        r2 = r1 instanceof ny0k.bV;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x0090;
    L_0x0087:
        r1 = (ny0k.bV) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4836k();	 Catch:{ all -> 0x0073 }
        r7.f3726o = r1;	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x0090:
        r2 = r1 instanceof com.konylabs.api.ui.hP;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x009d;
    L_0x0094:
        r1 = (com.konylabs.api.ui.hP) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4659b();	 Catch:{ all -> 0x0073 }
        r7.f3726o = r1;	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x009d:
        r2 = r1 instanceof com.konylabs.api.ui.gH;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x00aa;
    L_0x00a1:
        r1 = (com.konylabs.api.ui.gH) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4514b();	 Catch:{ all -> 0x0073 }
        r7.f3726o = r1;	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x00aa:
        r2 = r1 instanceof com.konylabs.api.ui.eO;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x00c7;
    L_0x00ae:
        r1 = (com.konylabs.api.ui.eO) r1;	 Catch:{ all -> 0x0073 }
        r2 = r1.f3729r;	 Catch:{ all -> 0x0073 }
        if (r2 <= 0) goto L_0x0062;
    L_0x00b4:
        r1 = r7.f3729r;	 Catch:{ all -> 0x0073 }
        r1 = r1 + r2;
        r7.f3729r = r1;	 Catch:{ all -> 0x0073 }
        r1 = r7.I;	 Catch:{ all -> 0x0073 }
        r1 = r1 instanceof com.konylabs.api.ui.fv;	 Catch:{ all -> 0x0073 }
        if (r1 == 0) goto L_0x0062;
    L_0x00bf:
        r1 = r7.I;	 Catch:{ all -> 0x0073 }
        r1 = (com.konylabs.api.ui.fv) r1;	 Catch:{ all -> 0x0073 }
        r1.m4433a(r2);	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x00c7:
        r2 = r1 instanceof com.konylabs.api.ui.hD;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x00e9;
    L_0x00cb:
        r1 = (com.konylabs.api.ui.hD) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4632b();	 Catch:{ all -> 0x0073 }
        if (r1 == 0) goto L_0x0062;
    L_0x00d3:
        r1 = r7.f3729r;	 Catch:{ all -> 0x0073 }
        r1 = r1 + 1;
        r7.f3729r = r1;	 Catch:{ all -> 0x0073 }
        r1 = r7.I;	 Catch:{ all -> 0x0073 }
        r1 = r1 instanceof com.konylabs.api.ui.fv;	 Catch:{ all -> 0x0073 }
        if (r1 == 0) goto L_0x0062;
    L_0x00df:
        r1 = r7.I;	 Catch:{ all -> 0x0073 }
        r1 = (com.konylabs.api.ui.fv) r1;	 Catch:{ all -> 0x0073 }
        r2 = 1;
        r1.m4433a(r2);	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x00e9:
        r2 = r1 instanceof com.konylabs.api.ui.hJ;	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x0062;
    L_0x00ed:
        r1 = (com.konylabs.api.ui.hJ) r1;	 Catch:{ all -> 0x0073 }
        r1 = r1.m4648b();	 Catch:{ all -> 0x0073 }
        if (r1 == 0) goto L_0x0062;
    L_0x00f5:
        r1 = r7.f3729r;	 Catch:{ all -> 0x0073 }
        r1 = r1 + 1;
        r7.f3729r = r1;	 Catch:{ all -> 0x0073 }
        r1 = r7.I;	 Catch:{ all -> 0x0073 }
        r1 = r1 instanceof com.konylabs.api.ui.fv;	 Catch:{ all -> 0x0073 }
        if (r1 == 0) goto L_0x0062;
    L_0x0101:
        r1 = r7.I;	 Catch:{ all -> 0x0073 }
        r1 = (com.konylabs.api.ui.fv) r1;	 Catch:{ all -> 0x0073 }
        r2 = 1;
        r1.m4433a(r2);	 Catch:{ all -> 0x0073 }
        goto L_0x0062;
    L_0x010b:
        r1 = 1;
        r7.m4197b(r5, r1);	 Catch:{ all -> 0x0073 }
        r1 = r7.E;	 Catch:{ all -> 0x0073 }
        r2 = KONY_WIDGET_RESTORE;	 Catch:{ all -> 0x0073 }
        if (r1 != r2) goto L_0x0004;
    L_0x0115:
        r1 = new com.konylabs.api.ui.eQ;	 Catch:{ all -> 0x0073 }
        r1.<init>(r7, r8);	 Catch:{ all -> 0x0073 }
        com.konylabs.android.KonyMain.m4094a(r1);	 Catch:{ all -> 0x0073 }
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.eO.a(java.lang.Object[]):void");
    }

    protected final void m4212a(Object[] objArr, boolean z) {
        if (this.I instanceof eO) {
            ((eO) this.I).m4212a(objArr, false);
        }
        int i = 0;
        while (i < objArr.length) {
            if (!(objArr[i] == LuaNil.nil || objArr[i] == null)) {
                LuaTable luaTable = (LuaWidget) objArr[i];
                if (luaTable != this) {
                    if (LuaWidget.m3936a((LuaWidget) luaTable) && (this.I instanceof fv)) {
                        ((fv) this.I).m4444b((C0211m) luaTable);
                    }
                    if (this.I != null) {
                        this.I.m3948c(luaTable.getID(), null);
                    }
                    if (!z) {
                        m4195a(luaTable.getID(), luaTable);
                    }
                    if (luaTable instanceof eO) {
                        int i2;
                        LuaTable luaTable2;
                        eO eOVar = (eO) luaTable;
                        for (i2 = 0; i2 < eOVar.f3720i.size(); i2++) {
                            luaTable2 = (LuaWidget) eOVar.f3720i.get(i2);
                            if (LuaWidget.m3936a((LuaWidget) luaTable2) && (this.I instanceof fv)) {
                                ((fv) this.I).m4444b((C0211m) luaTable2);
                            }
                            if (this.I != null) {
                                this.I.m3948c(luaTable2.getID(), null);
                            }
                            m4195a(luaTable2.getID(), luaTable2);
                        }
                        if (!eOVar.f3721j.isEmpty()) {
                            for (i2 = 0; i2 < eOVar.f3721j.size(); i2++) {
                                luaTable2 = (LuaWidget) eOVar.f3721j.get(i2);
                                if (LuaWidget.m3936a((LuaWidget) luaTable2) && (this.I instanceof fv)) {
                                    ((fv) this.I).m4444b((C0211m) luaTable2);
                                }
                                if (this.I != null) {
                                    this.I.m3948c(luaTable2.getID(), null);
                                }
                                m4195a(luaTable2.getID(), luaTable2);
                            }
                        }
                    }
                }
            }
            i++;
        }
    }

    public final synchronized Object[] m4213a(int i, Object obj) {
        Object[] objArr;
        int a = cr.m2199a(i, 0);
        int size = this.f3720i.size();
        if (a >= 0 && a < size) {
            Object obj2 = (LuaWidget) this.f3720i.get(a);
            if (obj2 != null) {
                m4217b(obj2, obj);
                objArr = new Object[]{obj2};
            }
        }
        objArr = null;
        return objArr;
    }

    protected final void a_(LuaTable luaTable) {
        if (luaTable != null) {
            Vector vector = luaTable.list;
            if (!vector.isEmpty()) {
                Vector vector2 = new Vector();
                Iterator it = vector.iterator();
                while (it.hasNext()) {
                    LuaTable luaTable2 = (LuaTable) it.next();
                    try {
                        vector2.add(new cu((String) luaTable2.list.elementAt(0), (String) luaTable2.list.elementAt(1), 0, luaTable2.list.elementAt(3)));
                    } catch (Exception e) {
                        if (KonyMain.f3657e) {
                            Log.d(BuildConfig.FLAVOR, BuildConfig.FLAVOR + e.getMessage());
                        }
                        throw new LuaError("Invalid Context menu item arguments for HBox/VBox widget", 605);
                    }
                }
                this.f3718g.m124a(vector2);
                this.f3718g.m121a((cv) this);
            }
        }
    }

    protected void m4214b() {
    }

    public void m4215b(int i) {
    }

    public void m4216b(Object obj) {
    }

    public synchronized void m4217b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj != LuaNil.nil) {
                m4199c(obj);
                if (this.E == KONY_WIDGET_RESTORE) {
                    KonyMain.m4094a(new eU(this, obj, obj2));
                }
            }
        }
    }

    protected void m4218b(Object[] objArr) {
        if (objArr != null) {
            int i = 1;
            while (i < objArr.length) {
                if (!(objArr[i] == null || objArr[i] == LuaNil.nil)) {
                    LuaWidget luaWidget = (LuaWidget) objArr[i];
                    if (this.f3718g.getOrientation() == 0 && this.f3723l) {
                        luaWidget.setWeight();
                        m4214b();
                    }
                    m3945a(luaWidget, this.J);
                    this.f3718g.m131b(luaWidget.getWidget());
                }
                i++;
            }
        }
    }

    public final synchronized Object[] m4219b(Object obj, int i, Object obj2) {
        Object[] objArr = null;
        synchronized (this) {
            if (obj != null) {
                if (obj != LuaNil.nil) {
                    int a = cr.m2199a(i, 0);
                    int size = this.f3720i.size();
                    if (a >= 0 && a < size) {
                        Object obj3 = (LuaWidget) this.f3720i.get(a);
                        if (obj3 != null) {
                            Object[] objArr2 = new Object[]{obj3};
                            if (this.E == KONY_WIDGET_RESTORE) {
                                KonyMain.m4094a(new eZ(this, obj3, obj, a, obj2));
                                objArr = objArr2;
                            } else {
                                m4199c(obj3);
                                m4187a(obj, a);
                                objArr = objArr2;
                            }
                        }
                    }
                }
            }
        }
        return objArr;
    }

    public final void m4220c(int i) {
        this.f3736y = i;
    }

    public final synchronized Object[] m4221c() {
        Object[] objArr;
        if (this.f3720i != null) {
            Collection arrayList = new ArrayList(this.f3720i);
            Collections.copy(arrayList, this.f3720i);
            Vector vector = new Vector(arrayList);
            new LuaTable().addAll(vector);
            objArr = new Object[]{r2};
        } else {
            objArr = null;
        }
        return objArr;
    }

    public void cleanup() {
        for (int i = 0; i < this.f3720i.size(); i++) {
            LuaWidget luaWidget = (LuaWidget) this.f3720i.get(i);
            if (luaWidget.getParent() == this) {
                luaWidget.cleanup();
            }
        }
        this.K = null;
        this.J = 0;
        this.L.clear();
        if (this.f3718g != null) {
            this.f3718g.m146f();
        }
        this.f3718g = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public LuaWidget createClone() {
        cE eOVar;
        int i = 0;
        if (this.f3719h != null) {
            eOVar = new eO(this.f3719h);
        } else {
            Object eOVar2 = new eO(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        }
        eOVar.copyProperties(this);
        eOVar.setSegUIWidgetType(bU.BOX);
        if (this.f3720i.size() > 0) {
            Object[] objArr = new Object[(this.f3720i.size() + 1)];
            for (int i2 = 0; i2 < this.f3720i.size(); i2++) {
                objArr[i2 + 1] = ((LuaWidget) this.f3720i.get(i2)).createClone();
            }
            eOVar.m4211a(objArr);
        }
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (!(table == LuaNil.nil || table == null)) {
            eOVar.setVisibility(((Boolean) table).booleanValue());
        }
        eOVar.f3736y = this.f3736y;
        SparseArray sparseArray = eOVar.f3734w;
        int size = this.f3734w.size();
        while (i < size) {
            aL aLVar = (aL) this.f3734w.valueAt(i);
            aL aLVar2 = new aL(aLVar.f477c, aLVar.f476b.m2103a((eO) eOVar));
            aLVar2.f476b.m2106a(eOVar);
            sparseArray.append(aLVar2.f477c, aLVar2);
            i++;
        }
        return eOVar;
    }

    public final int m4222d() {
        return this.f3729r;
    }

    protected final int d_() {
        return this.f3718g.getHeight();
    }

    public final boolean m4223e() {
        return this.f3726o;
    }

    public final C0174B m4224f() {
        return this.f3718g;
    }

    public final void m4225g() {
        this.f3730s = true;
    }

    public LuaWidget getChildWidget(String str) {
        Object table = super.getTable(str);
        return table instanceof LuaWidget ? (LuaWidget) table : null;
    }

    public ArrayList getChildWidgets() {
        ArrayList arrayList = new ArrayList(this.f3720i);
        Collections.copy(arrayList, this.f3720i);
        for (int i = 0; i < this.f3721j.size(); i++) {
            arrayList.add((LuaWidget) this.f3721j.get(i));
        }
        return arrayList;
    }

    public String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public LuaWidget getParent() {
        return this.I;
    }

    public Hashtable getProperties() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f3715f, "table");
        return hashtable;
    }

    public Object getProperty(String str) {
        return super.getTable(str);
    }

    public Object getTable(Object obj) {
        return super.getTable(obj);
    }

    public String getType() {
        return super.getTable(f3712c).toString().compareToIgnoreCase("vertical") == 0 ? "VBox" : "HBox";
    }

    public View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            Object table;
            dB a;
            C0174B c0174b;
            int intValue;
            int i;
            this.f3718g = new C0174B(KonyMain.getActContext());
            this.f3718g.m123a(getID());
            if (!m4232n()) {
                table = super.getTable(ATTR_WIDGET_SKIN);
                if (table != LuaNil.nil) {
                    a = cN.m2139a(table);
                    if (!(this.f3717B == null || this.f3717B.getTable(ATTR_WIDGET_SKIN) == LuaNil.nil)) {
                        this.f3718g.post(new eP(this));
                    }
                    this.f3718g.m122a(a);
                } else {
                    this.f3718g.m122a(null);
                }
            }
            LuaNil table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table2 != LuaNil.nil) {
                this.f3718g.m134b(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f3712c);
            if (table2 != LuaNil.nil) {
                if (((String) table2).compareToIgnoreCase("vertical") == 0) {
                    this.f3728q = C0174B.f182b;
                    this.f3718g.setOrientation(this.f3728q);
                    if (this.I instanceof eO) {
                        this.f3718g.m141d(-2);
                    }
                } else {
                    this.f3728q = 0;
                    this.f3718g.setOrientation(this.f3728q);
                }
            }
            table2 = super.getTable("spacing");
            if (table2 != LuaNil.nil && ((Double) table2).intValue() >= 0) {
                c0174b = this.f3718g;
                C0174B.m111c();
            }
            table2 = super.getTable(f3714e);
            if (table2 != LuaNil.nil) {
                intValue = ((Double) table2).intValue();
                if (intValue == 1) {
                    this.f3718g.m116a(C0174B.f183c);
                } else if (intValue == 2) {
                    this.f3718g.m116a(C0174B.f185e);
                } else if (intValue == 3) {
                    this.f3718g.m116a(C0174B.f184d);
                }
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f3718g.m130b(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(f3715f);
            if (table2 != LuaNil.nil) {
                a_((LuaTable) table2);
            } else {
                this.f3718g.m124a(null);
                this.f3718g.m121a(null);
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f3718g.m127a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f3718g.m135b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f3711b);
            if (table2 != LuaNil.nil) {
                intValue = ((Double) table2).intValue();
                if (intValue == 1) {
                    this.f3718g.m139c(true);
                } else if (intValue == 2) {
                    this.f3718g.m142d(true);
                } else if (intValue == 3) {
                    this.f3718g.m145e(true);
                } else if (intValue == 4) {
                    this.f3718g.m145e(true);
                }
            }
            table2 = super.getTable(f3713d);
            if (table2 != LuaNil.nil) {
                if (table2 instanceof Boolean) {
                    this.f3723l = ((Boolean) table2).booleanValue();
                } else if (table2 instanceof String) {
                    this.f3723l = ((String) table2).equalsIgnoreCase("true");
                }
                this.f3718g.m157i(this.f3723l);
            }
            table2 = super.getTable(f3710a);
            if (table2 != LuaNil.nil) {
                this.f3727p = table2;
                this.f3718g.setClickable(true);
                this.f3718g.setOnClickListener(this.f3733v);
            }
            if (!m4232n()) {
                table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
                if (table != LuaNil.nil) {
                    a = cN.m2139a(table);
                    if (a != null) {
                        this.f3718g.m132b(a);
                    }
                } else {
                    this.f3718g.m132b(null);
                }
            }
            table2 = super.getTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS);
            if (table2 != LuaNil.nil) {
                this.f3718g.m126a(((Boolean) table2).booleanValue());
            }
            LuaNil table3 = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table3 != LuaNil.nil && (this.I instanceof eO)) {
                this.f3735x = ((eO) this.I).f3735x;
                float floatValue = ((Double) table3).floatValue();
                if (((eO) this.I).f3728q == 0) {
                    this.f3735x = (this.f3735x * floatValue) / 100.0f;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3718g.m137c(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3718g.m137c(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3718g.m137c(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3718g.m137c(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3718g.m137c(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3718g.m137c(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3718g.m137c(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3718g.m137c(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3718g.m137c(85);
                        break;
                    default:
                        this.f3718g.m137c(17);
                        break;
                }
            }
            table2 = super.getTable(f3716z);
            if (table2 != LuaNil.nil) {
                this.M = ((Double) table2).intValue();
                c0174b = this.f3718g;
                intValue = this.M;
                C0174B.m113j();
            }
            table2 = super.getTable(f3709A);
            if (table2 != LuaNil.nil) {
                this.N = ((Double) table2).floatValue();
                m4234p();
            }
            synchronized (this) {
                this.E = KONY_WIDGET_RESTORE;
                for (i = 0; i < this.f3720i.size(); i++) {
                    LuaWidget luaWidget = (LuaWidget) this.f3720i.get(i);
                    if (this.f3718g.getOrientation() == 0 && this.f3723l) {
                        luaWidget.setWeight();
                    }
                    m3945a(luaWidget, this.J);
                    luaWidget.setParent(this);
                    this.f3718g.m131b(luaWidget.getWidget());
                }
            }
            if (this.G) {
                setWeight();
            }
            if (this.f3730s) {
                m4230l();
            }
            int size = this.f3734w.size();
            for (i = 0; i < size; i++) {
                aL aLVar = (aL) this.f3734w.valueAt(i);
                this.f3718g.m118a(aLVar.f475a, aLVar.f477c);
            }
            if (!this.F.booleanValue()) {
                setEnabled(this.F.booleanValue());
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                this.f3718g.m133b(m3943a((LuaTable) table2));
            }
        }
        this.f3718g.m143e();
        return this.f3718g.m155i();
    }

    public int getWidth() {
        return this.I.getWidth();
    }

    public final boolean m4226h() {
        return this.f3725n == 1;
    }

    public void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3718g.m135b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3718g.m127a(convertMarginsToPixels(table, this.I));
            }
            this.f3718g.m162l();
            Iterator it = this.f3720i.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
        }
    }

    public final boolean m4227i() {
        return this.f3725n == 2;
    }

    public final boolean m4228j() {
        return this.f3725n == 3;
    }

    public final boolean m4229k() {
        return this.f3725n == 4;
    }

    protected final void m4230l() {
        if (!this.f3730s) {
            return;
        }
        if (this.I instanceof eO) {
            ((eO) this.I).f3730s = true;
        } else if (this.I instanceof hq) {
            ((hq) this.I).m4733d();
        } else if (this.I instanceof fv) {
            ((fv) this.I).m4458l();
        }
    }

    public final float m4231m() {
        return this.f3735x;
    }

    public final boolean m4232n() {
        return this.f3736y == 101 || this.f3736y == 100;
    }

    public final boolean m4233o() {
        return this.f3736y == 101;
    }

    protected final void m4234p() {
        switch (this.M) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.N >= 0.0f) {
                    this.f3718g.m144e(O != -1 ? (int) ((((float) O) * this.N) / 100.0f) : (int) ((((float) (KonyMain.getActContext().m4167p() - KonyMain.f3663k)) * this.N) / 100.0f));
                } else if (!m4228j() && !m4229k()) {
                    this.f3718g.m144e(-2);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.N >= 0.0f) {
                    int o = KonyMain.getActContext().m4166o();
                    this.f3718g.m144e((int) ((((float) (this.I instanceof eO ? (int) (((eO) this.I).f3735x * ((float) o)) : o)) * this.N) / 100.0f));
                } else if (!m4228j() && !m4229k()) {
                    this.f3718g.m144e(-2);
                }
            default:
        }
    }

    public void m4235q() {
    }

    public void m4236r() {
    }

    public final Serializable m4237s() {
        if (this.f3731t == null || this.f3718g == null) {
            return null;
        }
        iq iqVar = this.f3731t;
        C0174B c0174b = this.f3718g;
        return iqVar.m1451a(this.f3732u);
    }

    public void setAnimation() {
        Iterator it = this.f3720i.iterator();
        while (it.hasNext()) {
            ((LuaWidget) it.next()).setAnimation();
        }
        super.setAnimation();
    }

    public void setEnabled(boolean z) {
        this.F = Boolean.valueOf(z);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3718g.setEnabled(z);
            if (z) {
                this.f3718g.setDescendantFocusability(AccessibilityNodeInfoCompat.ACTION_SET_SELECTION);
            } else {
                this.f3718g.setDescendantFocusability(393216);
            }
        }
    }

    public void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3718g.setFocusableInTouchMode(true);
            this.f3718g.requestFocus();
            this.f3718g.setFocusableInTouchMode(false);
        }
    }

    public void setFontColor(Object[] objArr) {
    }

    public void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3718g.m144e(i);
        }
    }

    public void setLayoutAnimator(LuaWidget luaWidget) {
        for (LuaWidget luaWidget2 : this.f3720i.toArray()) {
            if (luaWidget2 != luaWidget) {
                luaWidget2.setLayoutAnimator(luaWidget);
            }
        }
    }

    public void setParent(LuaWidget luaWidget) {
        super.setParent(luaWidget);
        if (luaWidget != null) {
            if ((luaWidget instanceof fv) || (luaWidget instanceof gL) || (luaWidget instanceof hq) || (luaWidget instanceof hg) || (luaWidget instanceof bO)) {
                C0211m c0211m;
                Iterator it = this.f3720i.iterator();
                while (it.hasNext()) {
                    c0211m = (LuaWidget) it.next();
                    if (LuaWidget.m3936a((LuaWidget) c0211m) && (luaWidget instanceof fv)) {
                        ((fv) luaWidget).m4435a(c0211m);
                    }
                    luaWidget.m3948c(c0211m.getID(), c0211m);
                }
                it = this.f3721j.iterator();
                while (it.hasNext()) {
                    c0211m = (LuaWidget) it.next();
                    if (LuaWidget.m3936a((LuaWidget) c0211m) && (luaWidget instanceof fv)) {
                        ((fv) luaWidget).m4435a(c0211m);
                    }
                    luaWidget.m3948c(c0211m.getID(), c0211m);
                }
            }
            if (this.f3720i.size() > 0 && this.f3730s) {
                m4230l();
            }
        }
    }

    public void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (obj.equals("overrideskinproperties")) {
            this.f3717B = (LuaTable) obj2;
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3718g.m130b(m3942a(z));
        }
    }

    public void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue >= 0.0f) {
                    if (floatValue > 100.0f) {
                        floatValue = 100.0f;
                    }
                    this.f3718g.m115a(floatValue / 100.0f);
                }
            }
        }
    }

    public void setWidgetInSegUIEventListener(iq iqVar, eO eOVar) {
        this.f3731t = iqVar;
        this.f3732u = eOVar;
    }

    public void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3718g.m141d(i);
        }
    }

    public final void m4238t() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3718g.m128b();
            if (this.f3718g instanceof cW) {
                float f = 0.0f;
                for (int i = 0; i < this.f3720i.size(); i++) {
                    LuaNil table = ((LuaWidget) this.f3720i.get(i)).getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                    if (table != LuaNil.nil) {
                        f += ((Double) table).floatValue();
                    }
                }
                if (this.f3724m != f) {
                    this.f3724m = f;
                    m4214b();
                }
            }
        }
    }

    public String toString() {
        return "LuaBox: " + super.getTable(ATTR_WIDGET_ID);
    }
}
