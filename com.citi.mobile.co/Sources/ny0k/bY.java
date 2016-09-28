package ny0k;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eO;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.Iterator;
import java.util.Vector;

public final class bY extends bG {
    private static String aA;
    private static String aB;
    public static String ak;
    public static String al;
    public static String am;
    public static String an;
    public static String ao;
    private static String aw;
    private static String ax;
    private static String ay;
    private static String az;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private bu aG;
    private aG aH;
    private bq ar;
    private Vector as;
    private Vector at;
    private ca au;
    private boolean av;

    static {
        ak = "scrollingevents";
        al = "onreachingbegining";
        am = "onreachingend";
        an = "onpull";
        ao = "onpush";
        aw = "pulltorefreshi18nkey";
        ax = "releasetopullrefreshi18nkey";
        ay = "pushtorefreshi18nkey";
        az = "releasetopushrefreshi18nkey";
        aA = "pulltorefreshskin";
        aB = "pushtorefreshskin";
        if (KonyMain.m4057C()) {
            ak = "scrollingEvents";
            al = "onReachingBegining";
            am = "onReachingEnd";
            an = "onPull";
            ao = "onPush";
            aw = "pullToRefreshI18NKey";
            ax = "releaseToPullRefreshI18NKey";
            ay = "pushToRefreshI18NKey";
            az = "releaseToPushRefreshI18NKey";
            aA = "pullToRefreshSkin";
            aB = "pushToRefreshSkin";
        }
    }

    public bY(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        super(luaTable, luaTable2, luaTable3, j);
        this.av = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aF = false;
        this.aH = new bZ(this);
        LuaNil table = luaTable.getTable(ak);
        if (table != LuaNil.nil) {
            super.setTable(ak, table);
        }
        table = luaTable.getTable(aw);
        if (table != LuaNil.nil) {
            super.setTable(aw, table);
        }
        table = luaTable.getTable(ax);
        if (table != LuaNil.nil) {
            super.setTable(ax, table);
        }
        table = luaTable.getTable(ay);
        if (table != LuaNil.nil) {
            super.setTable(ay, table);
        }
        table = luaTable.getTable(az);
        if (table != LuaNil.nil) {
            super.setTable(az, table);
        }
        table = luaTable.getTable(aA);
        if (table != LuaNil.nil) {
            super.setTable(aA, table);
        }
        table = luaTable.getTable(aB);
        if (table != LuaNil.nil) {
            super.setTable(aB, table);
        }
    }

    private void m4948l() {
        this.ar.m3712B();
        this.ar.m3723a(null);
        this.aG = null;
    }

    private void m4949m() {
        if (this.aG == null) {
            this.aG = new bu(this);
        }
        this.ar.m3723a(this.aG);
        this.ar.m3711A();
    }

    public final View m4950a(bJ bJVar) {
        TextView textView = new TextView(this.ar.getContext());
        textView.setLayoutParams(new LayoutParams(-1, -2));
        this.ar.m3718a(textView);
        textView.setText(bJVar.c);
        textView.setContentDescription(m3944a(bJVar.f, bJVar.c));
        textView.setBackgroundDrawable(this.ar.m3777y());
        return textView;
    }

    protected final void m4951a(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            this.ar.setSelection(i);
        }
    }

    protected final void m4952a(Object obj, Object obj2) {
        dB dBVar = null;
        if (this.E != KONY_WIDGET_BACKUP) {
            if (obj == o) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4948l();
                    return;
                }
                this.av = ((Boolean) obj2).booleanValue();
                if (!this.av) {
                    m4948l();
                }
                m4959d();
            } else if (obj == ak) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    int f_ = f_();
                    boolean z = this.aC;
                    View k = this.ar.m3763k();
                    ViewGroup viewGroup = (ViewGroup) k.getParent();
                    int indexOfChild = viewGroup.indexOfChild(k);
                    viewGroup.removeView(k);
                    cleanup();
                    viewGroup.addView(getWidget(), indexOfChild);
                    boolean z2 = this.aC;
                    int i = (!z || z2) ? (z || !z2) ? f_ : f_ + 1 : f_ - 1;
                    m4951a(i);
                }
            } else if (obj == A || obj == B) {
                if (this.au != null) {
                    this.au.m2083a();
                }
                m4912e();
            } else if (obj == aw) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.ar.m3740c(null);
                } else {
                    this.ar.m3740c((String) obj2);
                }
            } else if (obj == ax) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.ar.m3749e(null);
                } else {
                    this.ar.m3749e((String) obj2);
                }
            } else if (obj == ay) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.ar.m3746d(null);
                } else {
                    this.ar.m3746d((String) obj2);
                }
            } else if (obj == az) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.ar.m3752f(null);
                } else {
                    this.ar.m3752f((String) obj2);
                }
            } else if (obj == aA) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.ar.m3755g(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                r2 = this.ar;
                if (r0 == null) {
                    r0 = null;
                }
                r2.m3755g(r0);
            } else if (obj != aB) {
                super.m4897a(obj, obj2);
            } else if (obj2 == null || obj2 == LuaNil.nil) {
                this.ar.m3759h(null);
            } else {
                r0 = cN.m2139a(obj2);
                r2 = this.ar;
                if (r0 != null) {
                    dBVar = r0;
                }
                r2.m3759h(dBVar);
            }
        }
    }

    protected final void m4953a(Vector vector, int i) {
        super.m4899a(vector, i);
        if (this.E == KONY_WIDGET_RESTORE && this.av) {
            m4948l();
            m4949m();
        }
    }

    public final View m4954b(bJ bJVar) {
        if (bJVar.d == null) {
            bJVar.d = this.Z;
        }
        eO eOVar = bJVar.d;
        if (eOVar != null) {
            eOVar = (eO) eOVar.createClone();
            eOVar.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, bJVar.f);
            m4799a(eOVar, bJVar.e.map);
            View widget = eOVar.getWidget();
            dB i = m4832i(bJVar.e);
            if (i == null) {
                widget.setBackgroundDrawable(this.ar.m3777y());
            } else {
                widget.setBackgroundDrawable(i.m1117a());
            }
            widget.setTag(eOVar);
            return widget;
        }
        eO eOVar2 = new eO();
        View widget2 = eOVar2.getWidget();
        widget2.setVisibility(8);
        widget2.setTag(eOVar2);
        return widget2;
    }

    protected final void m4955b() {
        dB a;
        this.ar = new bq(KonyMain.getActContext());
        m4809a(this.ar);
        this.ar.m3725a(this.c);
        LuaNil table = super.getTable(v);
        if (table != LuaNil.nil) {
            this.ar.m3733b(((Boolean) table).booleanValue());
        }
        table = super.getTable(s);
        if (table != LuaNil.nil) {
            if (((Boolean) table).booleanValue()) {
                table = super.getTable(u);
                if (table != LuaNil.nil) {
                    int intValue = ((Double) table).intValue();
                    if (intValue >= 0) {
                        this.ar.m3737c(intValue, -1618442104);
                    }
                }
            } else {
                this.ar.m3737c(0, -1618442104);
            }
        }
        table = super.getTable(o);
        if (table != LuaNil.nil) {
            this.av = ((Boolean) table).booleanValue();
        }
        table = super.getTable(ak);
        if (table != LuaNil.nil) {
            LuaTable luaTable = (LuaTable) table;
            if (luaTable.getTable(al) != LuaNil.nil) {
                this.aE = true;
            } else {
                this.aE = false;
            }
            if (luaTable.getTable(am) != LuaNil.nil) {
                this.aF = true;
            } else {
                this.aF = false;
            }
            if (luaTable.getTable(an) != LuaNil.nil) {
                this.aC = true;
            } else {
                this.aC = false;
            }
            if (luaTable.getTable(ao) != LuaNil.nil) {
                this.aD = true;
            } else {
                this.aD = false;
            }
            this.ar.m3722a(this.aH);
        }
        table = super.getTable(aw);
        if (table != LuaNil.nil) {
            this.ar.m3740c(table instanceof String ? (String) table : null);
        }
        table = super.getTable(ax);
        if (table != LuaNil.nil) {
            this.ar.m3749e(table instanceof String ? (String) table : null);
        }
        table = super.getTable(ay);
        if (table != LuaNil.nil) {
            this.ar.m3746d(table instanceof String ? (String) table : null);
        }
        table = super.getTable(az);
        if (table != LuaNil.nil) {
            this.ar.m3752f(table instanceof String ? (String) table : null);
        }
        Object table2 = super.getTable(aA);
        if (table2 != LuaNil.nil) {
            a = cN.m2139a(table2);
            if (a != null) {
                this.ar.m3755g(a);
            }
        }
        table2 = super.getTable(aB);
        if (table2 != LuaNil.nil) {
            a = cN.m2139a(table2);
            if (a != null) {
                this.ar.m3759h(a);
            }
        }
        super.m4811b();
    }

    public final void m4956b(Vector vector) {
        super.m4905b(vector);
        if (this.E == KONY_WIDGET_RESTORE && this.au != null) {
            if (this.av) {
                m4948l();
            }
            this.au.notifyDataSetChanged();
        }
    }

    protected final void m4957c() {
        if (this.au != null) {
            this.au.m2086b();
        }
    }

    public final void m4958c(Vector vector) {
        if (vector != null) {
            this.as = vector;
            if (this.E == KONY_WIDGET_RESTORE) {
                Iterator it = this.as.iterator();
                while (it.hasNext()) {
                    View widget = ((eO) it.next()).getWidget();
                    widget.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                    this.ar.m3738c(widget);
                }
                if (this.av) {
                    this.ar.m3758h(this.as.size());
                }
            }
        }
    }

    public final void cleanup() {
        Iterator it;
        super.cleanup();
        if (this.ar != null) {
            this.ar.m3717a(null);
        }
        if (this.as != null) {
            it = this.as.iterator();
            while (it.hasNext()) {
                ((eO) it.next()).cleanup();
            }
        }
        if (this.at != null) {
            it = this.at.iterator();
            while (it.hasNext()) {
                ((eO) it.next()).cleanup();
            }
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    protected final void m4959d() {
        Iterator it;
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI2", "Enter populateData()");
        }
        bq bqVar = this.ar;
        if (this.aH != null && this.aH.m1889g()) {
            bqVar.m3772t();
        }
        if (this.as != null) {
            it = this.as.iterator();
            while (it.hasNext()) {
                View widget = ((eO) it.next()).getWidget();
                widget.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                bqVar.m3738c(widget);
            }
            if (this.av) {
                bqVar.m3758h(this.as.size());
            }
        }
        if (this.at != null) {
            it = this.at.iterator();
            while (it.hasNext()) {
                widget = ((eO) it.next()).getWidget();
                widget.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                bqVar.m3744d(widget);
            }
        }
        if (this.aH != null && this.aH.m1890h()) {
            bqVar.m3773u();
        }
        super.m4909d();
        if (this.ab && this.av) {
            m4949m();
        }
    }

    public final void m4960d(Vector vector) {
        if (vector != null) {
            this.at = vector;
            if (this.E == KONY_WIDGET_RESTORE) {
                Iterator it = this.at.iterator();
                while (it.hasNext()) {
                    View widget = ((eO) it.next()).getWidget();
                    widget.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                    this.ar.m3744d(widget);
                }
            }
        }
    }

    protected final void e_() {
        if (this.au != null) {
            this.au.m2086b();
        }
        this.au = new ca(this);
        m4894a(this.au);
        this.ar.m3717a(this.au);
    }

    protected final int f_() {
        return this.E == KONY_WIDGET_RESTORE ? this.ar.getFirstVisiblePosition() : -1;
    }

    public final void setHeight(int i) {
    }

    public final void setWidth(int i) {
    }
}
