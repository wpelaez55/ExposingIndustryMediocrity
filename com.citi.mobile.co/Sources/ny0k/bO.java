package ny0k;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eO;
import com.konylabs.api.ui.fe;
import com.konylabs.api.ui.gA;
import com.konylabs.api.ui.gC;
import com.konylabs.api.ui.gD;
import com.konylabs.api.ui.gX;
import com.konylabs.api.ui.gs;
import com.konylabs.api.ui.gt;
import com.konylabs.api.ui.hJ;
import com.konylabs.api.ui.hp;
import com.konylabs.api.ui.ii;
import com.konylabs.api.ui.iq;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public abstract class bO extends LuaWidget {
    public static String f4512A;
    public static String f4513B;
    public static String f4514C;
    public static String f4515D;
    public static String f4516P;
    public static String f4517Q;
    public static String f4518R;
    private static String f4519a;
    private static String ak;
    private static String al;
    private static String am;
    private static String f4520b;
    private static String f4521c;
    private static String f4522d;
    private static String f4523e;
    private static String f4524f;
    private static String f4525g;
    private static String f4526h;
    public static String f4527i;
    public static String f4528j;
    public static String f4529k;
    public static String f4530l;
    public static String f4531m;
    public static String f4532n;
    public static String f4533o;
    public static String f4534p;
    public static String f4535q;
    public static String f4536r;
    public static String f4537s;
    public static String f4538t;
    public static String f4539u;
    public static String f4540v;
    public static String f4541w;
    public static String f4542x;
    public static String f4543y;
    public static String f4544z;
    protected int f4545S;
    protected Object f4546T;
    protected Object f4547U;
    ImageView f4548V;
    protected boolean f4549W;
    protected eO f4550X;
    protected Vector f4551Y;
    protected eO f4552Z;
    protected LuaTable aa;
    protected boolean ab;
    protected boolean ac;
    protected int ad;
    protected int ae;
    protected int af;
    protected int ag;
    protected LinkedHashMap ah;
    protected ArrayList ai;
    Function aj;
    private Map an;
    private String ao;
    private bg ar;
    private LinkedHashSet as;
    private Object at;
    private cg au;
    private iq av;
    private ch aw;

    static {
        f4527i = "widgetskin";
        f4528j = "rowskin";
        f4529k = "rowfocusskin";
        f4530l = "alternaterowskin";
        f4531m = "sectionheaderskin";
        f4519a = "rowtemplate";
        f4520b = "sectionheadertemplate";
        f4521c = "onrowclick";
        f4532n = "contextmenu";
        f4522d = "screenlevelwidget";
        f4533o = "docksectionheaders";
        f4534p = "pressedskin";
        f4535q = "retainselection";
        f4536r = "data";
        f4537s = "separatorrequired";
        f4538t = "separatorcolor";
        f4539u = "separatorthickness";
        f4540v = "groupcells";
        f4541w = "needpageindicator";
        f4542x = "pageondotimage";
        f4543y = "pageoffdotimage";
        f4544z = "onswipe";
        f4512A = "selectionbehavior";
        f4513B = "selectionbehaviorconfig";
        f4523e = "selectedstateimage";
        f4524f = "unselectedstateimage";
        f4525g = "imageidentifier";
        f4526h = "selecteditems";
        ak = "selectedrowitems";
        f4514C = "selectedindex";
        al = "focusedindex";
        f4515D = "widgetdatamap";
        am = "viewtype";
        f4516P = "selectedindices";
        f4517Q = "selectedrowindex";
        f4518R = "selectedrowindices";
        if (KonyMain.m4057C()) {
            f4527i = "widgetSkin";
            f4528j = "rowSkin";
            f4529k = "rowFocusSkin";
            f4530l = "alternateRowSkin";
            f4531m = "sectionHeaderSkin";
            f4519a = "rowTemplate";
            f4520b = "sectionHeaderTemplate";
            f4521c = "onRowClick";
            f4532n = "contextMenu";
            f4522d = "screenLevelWidget";
            f4533o = "dockSectionHeaders";
            f4534p = "pressedSkin";
            f4535q = "retainSelection";
            f4537s = "separatorRequired";
            f4538t = "separatorColor";
            f4539u = "separatorThickness";
            f4540v = "groupCells";
            f4541w = "needPageIndicator";
            f4542x = "pageOnDotImage";
            f4543y = "pageOffDotImage";
            f4544z = "onSwipe";
            f4512A = "selectionBehavior";
            f4513B = "selectionBehaviorConfig";
            f4523e = "selectedStateImage";
            f4524f = "unselectedStateImage";
            f4525g = "imageIdentifier";
            f4526h = "selectedItems";
            f4514C = "selectedIndex";
            al = "focusedIndex";
            f4515D = "widgetDataMap";
            am = "viewType";
            f4516P = "selectedIndices";
            f4517Q = "selectedRowIndex";
            f4518R = "selectedRowIndices";
            ak = "selectedRowItems";
        }
    }

    public bO(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        boolean z = false;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.an = null;
        this.f4545S = 0;
        this.f4546T = null;
        this.f4547U = null;
        this.ar = null;
        this.f4550X = null;
        this.as = new LinkedHashSet();
        this.ad = -1;
        this.ae = -1;
        this.af = -1;
        this.ag = -1;
        this.au = new cg(this);
        this.aj = new bR(this);
        this.ap = j;
        this.av = m4827g();
        this.aw = new ch(this);
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(f4527i);
        if (table != LuaNil.nil) {
            super.setTable(f4527i, table);
        }
        table = luaTable.getTable(f4528j);
        if (table != LuaNil.nil) {
            super.setTable(f4528j, table);
        }
        table = luaTable.getTable(f4529k);
        if (table != LuaNil.nil) {
            super.setTable(f4529k, table);
        }
        table = luaTable.getTable(f4530l);
        if (table != LuaNil.nil) {
            super.setTable(f4530l, table);
        }
        table = luaTable.getTable(f4531m);
        if (table != LuaNil.nil) {
            super.setTable(f4531m, table);
        }
        table = luaTable.getTable(f4515D);
        if (table != LuaNil.nil) {
            this.aa = (LuaTable) table;
        }
        table = luaTable.getTable(f4519a);
        if (table != LuaNil.nil) {
            m4766a((eO) table, null);
        }
        table = luaTable.getTable(f4520b);
        if (table != LuaNil.nil) {
            m4774b((eO) table, null);
        }
        table = luaTable.getTable(f4536r);
        if (table != LuaNil.nil) {
            super.setTable(f4536r, table);
        }
        table = luaTable.getTable(f4537s);
        if (table != LuaNil.nil) {
            super.setTable(f4537s, table);
        }
        table = luaTable.getTable(f4539u);
        if (table != LuaNil.nil) {
            super.setTable(f4539u, table);
        }
        table = luaTable.getTable(f4538t);
        if (table != LuaNil.nil) {
            super.setTable(f4538t, table);
        }
        table = luaTable.getTable(am);
        if (table != LuaNil.nil) {
            super.setTable(am, table);
        }
        table = luaTable.getTable(f4521c);
        if (table != LuaNil.nil) {
            this.at = table;
        }
        table = luaTable.getTable(f4522d);
        if (table != LuaNil.nil) {
            super.setTable(f4522d, table);
            if (table != LuaNil.nil) {
                z = ((Boolean) table).booleanValue();
            }
            this.f4549W = z;
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4540v);
        if (table != LuaNil.nil) {
            super.setTable(f4540v, table);
        }
        table = luaTable.getTable(f4535q);
        if (table != LuaNil.nil) {
            this.ac = ((Boolean) table).booleanValue();
        }
        table = luaTable.getTable(f4541w);
        if (table != LuaNil.nil) {
            super.setTable(f4541w, table);
        }
        table = luaTable.getTable(f4542x);
        if (table != LuaNil.nil) {
            super.setTable(f4542x, table);
        }
        table = luaTable.getTable(f4543y);
        if (table != LuaNil.nil) {
            super.setTable(f4543y, table);
        }
        table = luaTable.getTable(f4544z);
        if (table != LuaNil.nil) {
            super.setTable(f4544z, table);
        }
        table = luaTable.getTable(f4512A);
        if (table != LuaNil.nil) {
            this.f4545S = ((Double) table).intValue();
        }
        table = luaTable.getTable(f4513B);
        if (table != LuaNil.nil) {
            m4829g((LuaTable) table);
        }
        table = luaTable.getTable(f4514C);
        if (table != LuaNil.nil) {
            super.setTable(f4514C, table);
        }
        table = luaTable.getTable(f4516P);
        if (table != LuaNil.nil) {
            super.setTable(f4516P, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            Object table2 = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT, table2);
                table2 = cr.m2201a(table2, 1);
                if (table2 != null) {
                    this.N = ((Double) table2).floatValue();
                }
                this.bRegisterForHeightChange = true;
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4532n);
            if (table != LuaNil.nil) {
                super.setTable(f4532n, table);
            }
            table = luaTable3.getTable(f4534p);
            if (table != LuaNil.nil) {
                super.setTable(f4534p, table);
            }
            table = luaTable3.getTable(f4533o);
            if (table != LuaNil.nil) {
                super.setTable(f4533o, table);
            }
        }
    }

    public static LuaTable m4760a(Hashtable hashtable, eO eOVar) {
        Object obj = hashtable.get(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (obj != null && (obj instanceof LuaTable)) {
            return (LuaTable) obj;
        }
        LuaNil table = eOVar.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        return (table == LuaNil.nil || !(table instanceof LuaTable)) ? null : (LuaTable) table;
    }

    public static bO m4762a(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        LuaNil table = luaTable.getTable(am);
        if (table == LuaNil.nil || table == null) {
            return new cf(luaTable, luaTable2, luaTable3, j);
        }
        int intValue = ((Double) table).intValue();
        table = luaTable.getTable(f4522d);
        boolean booleanValue = (table == null || table == LuaNil.nil) ? false : ((Boolean) table).booleanValue();
        table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
        float floatValue = (table == null || table == LuaNil.nil) ? -1.0f : ((Double) table).floatValue();
        switch (intValue) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return (booleanValue || floatValue != -1.0f) ? new bY(luaTable, luaTable2, luaTable3, j) : new cf(luaTable, luaTable2, luaTable3, j);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return new cb(luaTable, luaTable2, luaTable3, j);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return new bV(luaTable, luaTable2, luaTable3, j);
            default:
                return new cf(luaTable, luaTable2, luaTable3, j);
        }
    }

    private void m4763a(int i, int i2) {
        if (this.ad == i) {
            if (this.ae == i2) {
                this.ae = -1;
                this.ad = -1;
            } else if (this.ae > i2) {
                this.ae--;
            }
        }
        if (this.af == i) {
            if (this.ag == i2) {
                this.ag = -1;
                this.af = -1;
            } else if (this.ag > i2) {
                this.ag--;
            }
        }
        if (this.ah != null && !this.ah.isEmpty()) {
            if (this.f4545S == 2) {
                ArrayList arrayList = (ArrayList) this.ah.get(Integer.valueOf(i));
                if (arrayList != null) {
                    arrayList.remove(Integer.valueOf(i2));
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue = ((Integer) arrayList.get(i3)).intValue();
                        if (intValue > i2) {
                            arrayList.remove(i3);
                            arrayList.add(i3, Integer.valueOf(intValue - 1));
                        }
                    }
                }
            } else if (this.f4545S == 1) {
                Integer num = (Integer) this.ah.get(Integer.valueOf(i));
                if (num == null) {
                    return;
                }
                if (num.intValue() == i2) {
                    this.ah.remove(Integer.valueOf(i));
                } else if (num.intValue() > i2) {
                    this.ah.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                }
            }
        }
    }

    private void m4764a(dB dBVar) {
        this.ar.m2060c(dBVar);
        this.ar.m2070n();
    }

    private void m4765a(eO eOVar) {
        ArrayList arrayList = eOVar.f3720i;
        int size = eOVar.f3720i.size();
        for (int i = 0; i < size; i++) {
            LuaWidget luaWidget = (LuaWidget) arrayList.get(i);
            if (luaWidget instanceof eO) {
                m4765a((eO) luaWidget);
            }
            bU bUVar = null;
            if (luaWidget instanceof eO) {
                bUVar = bU.BOX;
            } else if (luaWidget instanceof gA) {
                bUVar = bU.LABEL;
            } else if (luaWidget instanceof fe) {
                bUVar = bU.BUTTON;
            } else if (luaWidget instanceof gs) {
                bUVar = bU.IMAGE;
            } else if (luaWidget instanceof gt) {
                bUVar = bU.IMAGE2;
            } else if (luaWidget instanceof gD) {
                bUVar = bU.LINK;
            } else if (luaWidget instanceof gX) {
                bUVar = bU.RICHTEXT;
            } else if (luaWidget instanceof hJ) {
                bUVar = bU.TEXTFIELD2;
            } else if (luaWidget instanceof gC) {
                bUVar = bU.LINE;
            }
            luaWidget.setSegUIWidgetType(bUVar);
            this.as.add(luaWidget.getTable(ATTR_WIDGET_ID).toString());
        }
    }

    private void m4766a(eO eOVar, eO eOVar2) {
        KonyMain.m4143x().m1773a((LuaWidget) this, (LuaWidget) eOVar);
        this.f4550X = eOVar;
        this.f4550X.m4220c(101);
        if (eOVar2 != null) {
            KonyMain.m4143x().m1779b((LuaWidget) this, (LuaWidget) eOVar2);
        }
    }

    private static void m4767a(LuaTable luaTable, LuaTable luaTable2) {
        Enumeration keys = luaTable2.map.keys();
        while (keys.hasMoreElements()) {
            String intern = ((String) keys.nextElement()).intern();
            if (intern == ATTR_WIDGET_VISIBLE) {
                luaTable.setTable(ATTR_WIDGET_ISVISIBLE, luaTable2.getTable(intern));
            } else if (intern == ATTR_WIDGET_ENABLE) {
                luaTable.setTable(ATTR_WIDGET_SET_ENABLED, luaTable2.getTable(intern));
            } else if (intern == ATTR_WIDGET_Label_I18NKEY) {
                luaTable.setTable(ATTR_WIDGET_LABEL, C0284S.m1823a(KonyMain.getActContext()).m1849g(new Object[]{luaTable2.getTable(intern)}));
            } else {
                luaTable.setTable(intern, luaTable2.getTable(intern));
            }
        }
    }

    static /* synthetic */ void m4768a(bO bOVar, int i, int i2, boolean z) {
        bOVar.ad = i;
        bOVar.af = i;
        bOVar.ae = i2;
        bOVar.ag = i2;
        if (bOVar.f4545S == 1 || bOVar.f4545S == 2) {
            if (bOVar.ah == null) {
                bOVar.ah = new LinkedHashMap();
            }
            if (bOVar.f4545S == 1) {
                bOVar.ah.clear();
                if (z) {
                    bOVar.ah.put(Integer.valueOf(i), Integer.valueOf(i2));
                }
            } else if (bOVar.f4545S == 2) {
                ArrayList arrayList = (ArrayList) bOVar.ah.get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    bOVar.ah.put(Integer.valueOf(i), arrayList);
                }
                if (z) {
                    arrayList.add(Integer.valueOf(i2));
                } else {
                    arrayList.remove(Integer.valueOf(i2));
                }
            }
        }
    }

    private void m4769a(bU bUVar, String str) {
        if (this.an != null) {
            HashSet hashSet = (HashSet) this.an.get(bUVar);
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            if (str.equals(ATTR_WIDGET_VISIBLE)) {
                hashSet.add(ATTR_WIDGET_ISVISIBLE);
            }
            hashSet.add(str);
            this.an.put(bUVar, hashSet);
        }
    }

    private void m4771b(int i, int i2) {
        if (this.ad == i && this.ae >= i2) {
            this.ae++;
        }
        if (this.af == i && this.ag >= i2) {
            this.ag++;
        }
        if (this.ah != null && !this.ah.isEmpty()) {
            if (this.f4545S == 2) {
                ArrayList arrayList = (ArrayList) this.ah.get(Integer.valueOf(i));
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue = ((Integer) arrayList.get(i3)).intValue();
                        if (intValue >= i2) {
                            arrayList.remove(i3);
                            arrayList.add(i3, Integer.valueOf(intValue + 1));
                        }
                    }
                }
            } else if (this.f4545S == 1) {
                Integer num = (Integer) this.ah.get(Integer.valueOf(i));
                if (num != null && num.intValue() >= i2) {
                    this.ah.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
                }
            }
        }
    }

    private void m4772b(dB dBVar) {
        bg bgVar = this.ar;
        if (dBVar == null) {
            dBVar = null;
        }
        bgVar.m2049a(dBVar);
    }

    private void m4773b(eO eOVar) {
        this.as.clear();
        int size = this.f4551Y != null ? this.f4551Y.size() : 0;
        for (int i = 0; i < size; i++) {
            bT bTVar = (bT) this.f4551Y.elementAt(i);
            if (!(bTVar.f2144d == null || bTVar.f2144d == this.f4552Z)) {
                m4765a(bTVar.f2144d);
            }
            Vector vector = bTVar.f2147g;
            int size2 = vector.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bS bSVar = (bS) vector.elementAt(i2);
                if (bSVar.f2140c == this.f4550X) {
                    bSVar.f2140c = null;
                } else if (bSVar.f2140c != null) {
                    m4765a(bSVar.f2140c);
                }
            }
        }
        m4766a(eOVar, this.f4550X);
        m4765a(this.f4550X);
        if (this.f4552Z != null) {
            m4765a(this.f4552Z);
        }
    }

    private void m4774b(eO eOVar, eO eOVar2) {
        KonyMain.m4143x().m1773a((LuaWidget) this, (LuaWidget) eOVar);
        this.f4552Z = eOVar;
        this.f4552Z.m4220c(100);
        if (eOVar2 != null) {
            KonyMain.m4143x().m1779b((LuaWidget) this, (LuaWidget) eOVar2);
        }
    }

    private void m4775b(eO eOVar, Hashtable hashtable) {
        while (this.an != null) {
            Hashtable hashtable2 = this.aa.map;
            if (this.as.isEmpty()) {
                m4788l();
                if (this.as.isEmpty()) {
                    return;
                }
            } else {
                Iterator it = this.as.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    LuaNil table = eOVar.getTable(str);
                    if (!(table == null || table == LuaNil.nil)) {
                        Object obj = hashtable2.get(str);
                        bU segUIWidgetType = ((LuaWidget) table).getSegUIWidgetType();
                        Object obj2 = obj != null ? hashtable.get(obj) : null;
                        if (obj2 instanceof LuaTable) {
                            Enumeration keys = ((LuaTable) obj2).map.keys();
                            while (keys.hasMoreElements()) {
                                m4769a(segUIWidgetType, ((String) keys.nextElement()).intern());
                            }
                        } else {
                            m4769a(segUIWidgetType, ATTR_WIDGET_VISIBLE);
                            if (!(segUIWidgetType == bU.BOX || segUIWidgetType == bU.LINE)) {
                                m4769a(segUIWidgetType, ATTR_WIDGET_LABEL);
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    private void m4776b(LuaTable luaTable, int i, int i2) {
        Vector vector = ((bT) this.f4551Y.elementAt(i2)).f2147g;
        if (i < vector.size()) {
            bS bSVar = (bS) vector.elementAt(i);
            eO eOVar = (eO) luaTable.map.get("template");
            if (eOVar == null || bSVar.f2140c == eOVar) {
                bSVar.f2141d = luaTable;
                LuaNil table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                if (table != LuaNil.nil && (table instanceof LuaTable)) {
                    bSVar.f2142e = (LuaTable) table;
                }
                m4808a(bSVar, luaTable);
                return;
            }
            m4798a(i, i2, true);
            m4802a(luaTable, i, i2, true);
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI2", "Invalid row index to set data at " + i + " in section " + i2 + " in segment " + super.getTable(ATTR_WIDGET_ID));
        }
    }

    private boolean m4777b(Vector vector, int i) {
        do {
            LuaTable luaTable = (LuaTable) vector.elementAt(i);
            if (luaTable.list.size() > 0) {
                return true;
            }
            if (luaTable.map.size() > 0) {
                return false;
            }
            i++;
        } while (i < vector.size());
        return false;
    }

    private void m4778c(int i, int i2) {
        if (this.ad >= i) {
            this.ad += i2;
        }
        if (this.af >= i) {
            this.af += i2;
        }
        if (this.ah != null && !this.ah.isEmpty() && this.f4551Y != null && !this.f4551Y.isEmpty()) {
            int size;
            if (this.f4545S == 2) {
                for (size = this.f4551Y.size() - 1; size >= i; size--) {
                    ArrayList arrayList = (ArrayList) this.ah.remove(Integer.valueOf(size));
                    if (arrayList != null) {
                        this.ah.put(Integer.valueOf(size + i2), arrayList);
                    }
                }
            } else if (this.f4545S == 1) {
                size = this.f4551Y.size();
                while (i < size) {
                    Integer num = (Integer) this.ah.remove(Integer.valueOf(i));
                    if (num != null) {
                        this.ah.put(Integer.valueOf(i + i2), num);
                        return;
                    }
                    i++;
                }
            }
        }
    }

    private void m4779c(dB dBVar) {
        bg bgVar = this.ar;
        if (dBVar == null) {
            dBVar = null;
        }
        bgVar.m2056b(dBVar);
        this.ar.m2070n();
    }

    private void m4780c(eO eOVar) {
        this.as.clear();
        int size = this.f4551Y != null ? this.f4551Y.size() : 0;
        for (int i = 0; i < size; i++) {
            bT bTVar = (bT) this.f4551Y.elementAt(i);
            if (bTVar.f2144d != null) {
                if (bTVar.f2144d == this.f4552Z) {
                    bTVar.f2144d = null;
                } else if (bTVar.f2144d != null) {
                    m4765a(bTVar.f2144d);
                }
            }
            Vector vector = bTVar.f2147g;
            int size2 = vector.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bS bSVar = (bS) vector.elementAt(i2);
                if (!(bSVar.f2140c == null || bSVar.f2140c == this.f4550X)) {
                    m4765a(bSVar.f2140c);
                }
            }
        }
        m4774b(eOVar, this.f4552Z);
        m4765a(this.f4552Z);
        m4765a(this.f4550X);
    }

    private void m4781c(Vector vector) {
        if (this.ab) {
            m4806a(vector, -1);
        } else {
            m4815b(vector);
        }
        if (this.ai != null && !this.ai.isEmpty()) {
            cr.m2211b((LuaWidget) this, this.ai);
        }
    }

    private void m4782d(dB dBVar) {
        bg bgVar = this.ar;
        if (dBVar == null) {
            dBVar = null;
        }
        bgVar.m2062d(dBVar);
        this.ar.m2070n();
    }

    private void m4783d(Vector vector) {
        if (this.ah == null) {
            this.ah = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.ah;
        int size = vector.size();
        Vector vector2 = this.f4551Y;
        int size2 = vector2.size();
        for (int i = 0; i < size; i++) {
            Vector vector3 = ((LuaTable) vector.get(i)).list;
            if (vector3.size() >= 2) {
                int a = cr.m2199a(((Double) vector3.get(0)).intValue(), 0);
                List list = ((LuaTable) vector3.get(1)).list;
                if (!list.isEmpty() && a < size2) {
                    ArrayList arrayList;
                    ArrayList arrayList2 = (ArrayList) linkedHashMap.get(Integer.valueOf(a));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(Integer.valueOf(a), arrayList2);
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                    }
                    arrayList.clear();
                    List<Integer> a2 = cr.m2203a(list);
                    a = ((bT) vector2.get(a)).f2147g.size();
                    for (Integer num : a2) {
                        if (num.intValue() < a) {
                            arrayList.add(num);
                        }
                    }
                }
            }
        }
    }

    private int m4784e() {
        LuaNil table = super.getTable(f4538t);
        return table != LuaNil.nil ? hp.m3351b(((String) table).trim()) : -1618442104;
    }

    private void m4785e(dB dBVar) {
        bg bgVar = this.ar;
        if (dBVar == null) {
            dBVar = null;
        }
        bgVar.m2065f(dBVar);
        this.ar.m2070n();
    }

    private void m4786f(dB dBVar) {
        bg bgVar = this.ar;
        if (dBVar == null) {
            dBVar = null;
        }
        bgVar.m2063e(dBVar);
        this.ar.m2070n();
    }

    private dB m4787k(LuaTable luaTable) {
        Object obj = luaTable.map.get("template");
        obj = (obj != null ? (eO) obj : this.f4550X).getTable(ATTR_WIDGET_SKIN);
        return obj != LuaNil.nil ? cN.m2139a(obj) : null;
    }

    private void m4788l() {
        if (this.f4550X != null) {
            m4765a(this.f4550X);
        }
        if (this.f4552Z != null) {
            m4765a(this.f4552Z);
        }
    }

    private void m4789l(LuaTable luaTable) {
        if (luaTable != null) {
            Vector vector = luaTable.list;
            if (!vector.isEmpty()) {
                int a = cr.m2199a(((Double) vector.get(0)).intValue(), 0);
                int a2 = cr.m2199a(((Double) vector.get(1)).intValue(), 0);
                if (a < this.f4551Y.size() && a2 < ((bT) this.f4551Y.get(a)).f2147g.size()) {
                    this.ad = a;
                    this.ae = a2;
                }
            }
        } else {
            this.ad = -1;
            this.ae = -1;
        }
        super.setTable(al, LuaNil.nil);
    }

    private void m4790m() {
        this.ar.m2069m();
        m4816c();
        m4820d();
    }

    private LuaTable m4791n() {
        if (this.ad == -1 || this.ae == -1) {
            return null;
        }
        LuaTable luaTable = new LuaTable(2, 0);
        int a = cr.m2199a(this.ad, 1);
        int a2 = cr.m2199a(this.ae, 1);
        luaTable.add(cr.m2200a(a));
        luaTable.add(cr.m2200a(a2));
        return luaTable;
    }

    private LuaTable m4792o() {
        LuaTable luaTable = null;
        LinkedHashMap linkedHashMap = this.ah;
        if (!(linkedHashMap == null || linkedHashMap.isEmpty())) {
            for (Integer intValue : linkedHashMap.keySet()) {
                int intValue2 = intValue.intValue();
                ArrayList arrayList = (ArrayList) linkedHashMap.get(Integer.valueOf(intValue2));
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 0) {
                        if (luaTable == null) {
                            luaTable = new LuaTable();
                        }
                        Vector vector = this.f4551Y;
                        for (int i = 0; i < size; i++) {
                            luaTable.add(((bS) ((bT) vector.get(intValue2)).f2147g.get(((Integer) arrayList.get(i)).intValue())).f2141d);
                        }
                    }
                }
            }
        }
        return luaTable;
    }

    private void m4793q() {
        this.ad = -1;
        this.ae = -1;
        super.setTable(al, LuaNil.nil);
    }

    private void m4794r() {
        this.af = -1;
        this.ag = -1;
        super.setTable(f4517Q, LuaNil.nil);
    }

    private void m4795s() {
        m4793q();
        m4796t();
        m4794r();
    }

    private void m4796t() {
        if (!(this.ah == null || this.ah.isEmpty() || (this.f4545S != 1 && this.f4545S != 2))) {
            this.ah.clear();
        }
        super.setTable(f4514C, LuaNil.nil);
        super.setTable(f4516P, LuaNil.nil);
        super.setTable(f4518R, LuaNil.nil);
    }

    public final eO m4797a(Hashtable hashtable) {
        eO eOVar;
        LuaNil luaNil = hashtable.get("template");
        if (luaNil == LuaNil.nil || luaNil == null || !(luaNil instanceof eO)) {
            eOVar = this.f4552Z;
        } else {
            eOVar = (eO) luaNil;
            if (this.ai == null) {
                this.ai = new ArrayList();
            }
            this.ai.add(eOVar);
            eOVar.m4220c(100);
            m4765a(eOVar);
        }
        if (!(this.an == null || eOVar == null)) {
            m4775b(eOVar, hashtable);
        }
        return eOVar;
    }

    public final void m4798a(int i, int i2, boolean z) {
        if (this.f4551Y != null) {
            int a = cr.m2199a(i, 0);
            if (a >= 0) {
                int a2 = cr.m2199a(i2, 0);
                if (a2 < 0) {
                    if (KonyMain.f3659g) {
                        Log.e("LuaSegUI2", "Invalid section index " + a2 + " to remove row at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
                    }
                } else if (a2 < this.f4551Y.size()) {
                    Vector vector = ((bT) this.f4551Y.elementAt(a2)).f2147g;
                    if (a < vector.size()) {
                        m4807a(vector, a, a2);
                    } else if (KonyMain.f3659g) {
                        Log.e("LuaSegUI2", "Invalid index to remove row at: " + a + " in  section " + a2 + " in segment " + super.getTable(ATTR_WIDGET_ID));
                        return;
                    }
                    if (!this.ab && vector.size() == 0) {
                        this.f4551Y.clear();
                    }
                    if (!z) {
                        m4763a(a2, a);
                    }
                } else if (KonyMain.f3659g) {
                    Log.e("LuaSegUI2", "Invalid section index " + a2 + " in segment " + super.getTable(ATTR_WIDGET_ID));
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI2", "Invalid index to remove row at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI2", "Segment is empty");
        }
    }

    protected final void m4799a(eO eOVar, Hashtable hashtable) {
        eOVar.setWidgetInSegUIEventListener(this.av, eOVar);
        Hashtable hashtable2 = this.aa.map;
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LuaNil table = eOVar.getTable(str);
            if (table != null && table != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) table;
                LuaWidget luaWidget = (LuaWidget) luaTable;
                if (this.an != null) {
                    luaWidget.resetWidget((HashSet) this.an.get(luaWidget.getSegUIWidgetType()));
                }
                Object obj = hashtable2.get(str);
                if (obj != null) {
                    if (luaTable instanceof hJ) {
                        ((hJ) luaTable).m4647a(this.aw, new cl(eOVar, obj));
                    } else {
                        luaWidget.setWidgetInSegUIEventListener(this.av, eOVar);
                    }
                    LuaNil luaNil = hashtable.get(obj);
                    if (luaNil == null || luaNil == LuaNil.nil) {
                        if (!((luaTable instanceof gC) || (luaTable instanceof eO) || !((Boolean) luaTable.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue())) {
                            luaWidget.setVisibility(false);
                        }
                    } else if (luaNil instanceof LuaTable) {
                        m4767a(luaTable, (LuaTable) luaNil);
                        if ((this.f4545S == 2 || this.f4545S == 1) && luaTable.getTable(ATTR_WIDGET_ID).equals(this.ao)) {
                            luaTable.setTable(gs.f4202a, this.f4547U);
                            if (luaTable instanceof gs) {
                                this.f4548V = ((gs) luaTable).m4589b();
                            } else {
                                this.f4548V = ((gt) luaTable).m4598b();
                            }
                            this.f4548V.setTag(bg.f2189b);
                        }
                    } else {
                        if ((luaTable instanceof gA) || (luaTable instanceof gD) || (luaTable instanceof gX) || (luaTable instanceof fe) || (luaTable instanceof hJ)) {
                            luaTable.setTable(ATTR_WIDGET_LABEL, luaNil);
                        } else if ((luaTable instanceof gs) || (luaTable instanceof gt)) {
                            if ((this.f4545S == 2 || this.f4545S == 1) && luaTable.getTable(ATTR_WIDGET_ID).equals(this.ao)) {
                                luaTable.setTable(gs.f4202a, this.f4547U);
                                if (luaTable instanceof gs) {
                                    this.f4548V = ((gs) luaTable).m4589b();
                                } else {
                                    this.f4548V = ((gt) luaTable).m4598b();
                                }
                                this.f4548V.setTag(bg.f2189b);
                            } else {
                                luaTable.setTable(gs.f4202a, luaNil);
                            }
                        }
                        if (((Boolean) luaTable.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue()) {
                            if (luaNil.equals(BuildConfig.FLAVOR)) {
                                luaWidget.setVisibility(false);
                            } else {
                                luaWidget.setVisibility(true);
                            }
                        }
                    }
                }
                if (luaTable instanceof eO) {
                    boolean z;
                    eO eOVar2 = (eO) luaTable;
                    Iterator it2 = eOVar2.f3720i.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) ((LuaWidget) it2.next()).getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    if (z && ((Boolean) eOVar2.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue()) {
                        eOVar2.setWidgetInSegUIEventListener(this.av, eOVar);
                        eOVar2.setVisibility(true);
                    } else {
                        eOVar2.setVisibility(false);
                    }
                }
                if (luaTable instanceof fe) {
                    ((fe) luaTable).setWidgetInSegUIEventListener(this.av, eOVar);
                } else if (luaTable instanceof gD) {
                    ((gD) luaTable).setWidgetInSegUIEventListener(this.av, eOVar);
                } else if (luaTable instanceof gX) {
                    ((gX) luaTable).setWidgetInSegUIEventListener(this.av, eOVar);
                }
            } else if (KonyMain.f3657e) {
                Log.w("LuaSegUI2", "Invalid key(" + str + ") passed in setData on segment : " + super.getTable(ATTR_WIDGET_ID));
            }
        }
    }

    public void m4800a(LuaTable luaTable, int i) {
        int i2 = 0;
        if (i < 0) {
            if (KonyMain.f3659g) {
                Log.d("LuaSegUI2", "Invalid sectionIndex: " + i + " to add section at");
            }
        } else if (this.aa == null || this.aa.map.size() == 0) {
            throw new LuaError(f4515D + " is not set for the Segment widget " + toString(), 9999);
        } else if (this.ab || this.f4551Y.size() <= 0) {
            if (this.as.isEmpty()) {
                m4788l();
            }
            this.ab = true;
            int size = this.ai != null ? this.ai.size() : 0;
            m4806a(luaTable.list, i);
            if (this.ai != null) {
                i2 = this.ai.size();
            }
            if (!(size == i2 || this.ai == null || this.ai.isEmpty())) {
                cr.m2211b((LuaWidget) this, new ArrayList(this.ai.subList(size, this.ai.size())));
            }
            m4778c(i, luaTable.list.size());
        } else {
            throw new LuaError("calling addSectionAt() on SegmentedUI2 having id '" + super.getTable(ATTR_WIDGET_ID) + "' is invalid" + " if it is already set with data having no sections", 9999);
        }
    }

    public final void m4801a(LuaTable luaTable, int i, int i2) {
        if (this.f4551Y != null && this.f4551Y.size() != 0) {
            int a = cr.m2199a(i, 0);
            if (a >= 0) {
                if (this.as.isEmpty()) {
                    m4788l();
                }
                int a2 = cr.m2199a(i2, 0);
                if (a2 < 0) {
                    if (KonyMain.f3659g) {
                        Log.e("LuaSegUI2", "Invalid section index to set data at: " + a2 + " in segment " + super.getTable(ATTR_WIDGET_ID));
                    }
                } else if (this.aa == null || this.aa.map.size() == 0) {
                    throw new LuaError(f4515D + " is not set for the Segment widget " + toString(), 9999);
                } else if (a2 < this.f4551Y.size()) {
                    m4776b(luaTable, a, a2);
                } else if (KonyMain.f3659g) {
                    Log.e("LuaSegUI2", "Invalid section index " + a2 + " in segment " + super.getTable(ATTR_WIDGET_ID));
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI2", "Invalid row index to set data at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI2", "Segment is empty");
        }
    }

    public final void m4802a(LuaTable luaTable, int i, int i2, boolean z) {
        int a = cr.m2199a(i, 0);
        if (a >= 0) {
            int a2 = cr.m2199a(i2, 0);
            if (a2 >= 0) {
                if (this.as.isEmpty()) {
                    m4788l();
                }
                if (this.f4551Y.size() == 0) {
                    bT h = m4830h();
                    h.f2147g = new Vector();
                    this.f4551Y.add(h);
                    this.ab = false;
                }
                if (a2 < this.f4551Y.size()) {
                    Vector vector = ((bT) this.f4551Y.get(a2)).f2147g;
                    int size = a >= vector.size() ? vector.size() : a;
                    m4803a(luaTable, vector, size, a2);
                    if (!z) {
                        m4771b(a2, size);
                    }
                } else if (KonyMain.f3659g) {
                    Log.e("LuaSegUI2", "Invalid section index " + a2 + " in segment " + super.getTable(ATTR_WIDGET_ID));
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI2", "Invalid section index to add data at: " + a2 + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI2", "Invalid row index to add data at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
        }
    }

    protected abstract void m4803a(LuaTable luaTable, Vector vector, int i, int i2);

    protected void m4804a(Object obj, Object obj2) {
        int i = 0;
        if (this.E != KONY_WIDGET_BACKUP) {
            if (obj == al) {
                if (KonyMain.f3657e) {
                    Log.d("LuaSegUI2", "Setting SEGUI SELECTED INDEX as : " + obj2);
                }
                this.ar.m2054b(this.ad, this.ae);
            } else if (obj == f4517Q) {
                if (obj2 != LuaNil.nil) {
                    this.ar.m2061d(this.af, this.ag);
                } else if (this.f4545S == 1) {
                    this.ar.m2073q();
                }
            } else if (obj == f4518R) {
                if (obj2 == LuaNil.nil) {
                    this.ar.m2073q();
                } else if (this.f4545S == 0 || this.f4545S == 1) {
                    this.ar.m2061d(this.af, this.ag);
                } else {
                    this.ar.m2051a(this.ah);
                }
            } else if (obj == f4516P || obj == f4514C) {
                if (this.f4545S == 0) {
                    this.ar.m2054b(this.ad, this.ae);
                } else if (obj2 == LuaNil.nil) {
                    this.ar.m2073q();
                } else {
                    this.ar.m2051a(this.ah);
                }
            } else if (obj == f4527i) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4772b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4772b(r0);
                }
            } else if (obj == f4528j) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4779c(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4779c(r0);
                }
            } else if (obj == f4529k) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4764a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4764a(r0);
                }
            } else if (obj == f4530l) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4782d(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4782d(r0);
                }
            } else if (obj == f4534p) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4785e(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4785e(r0);
                }
            } else if (obj == f4531m) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4786f(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4786f(r0);
                }
            } else if (obj == ATTR_WIDGET_ISVISIBLE && obj2 != LuaNil.nil) {
                this.ar.e_(m3942a(((Boolean) obj2).booleanValue()));
            } else if (obj == f4539u) {
                this.ar.m2059c(obj2 != LuaNil.nil ? ((Double) obj2).intValue() : 0, m4784e());
            } else if (obj == f4538t) {
                String str = obj2 != LuaNil.nil ? (String) obj2 : null;
                int b = str != null ? hp.m3351b(str.trim()) : -1618442104;
                r0 = super.getTable(f4539u);
                if (r0 != LuaNil.nil) {
                    i = ((Double) r0).intValue();
                }
                this.ar.m2059c(i, b);
            } else if (obj == f4535q && obj2 != LuaNil.nil) {
                this.ar.b_(((Boolean) obj2).booleanValue());
            } else if (obj == f4512A) {
                if (obj2 != null && obj2 != LuaNil.nil && this.f4545S != this.ar.m2075s()) {
                    this.ar.m2066g(this.f4545S);
                    m4790m();
                }
            } else if (obj == f4513B) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.ar.m2050a((String) this.f4546T);
                    this.ar.m2057b((String) this.f4547U);
                    m4790m();
                }
            } else if (obj == ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE) {
                r0 = cr.m2201a(obj2, 1);
                if (r0 != null && r0 != LuaNil.nil) {
                    this.M = ((Double) r0).intValue();
                    m4837p();
                }
            } else if (obj == ATTR_WIDGET_CONTAINER_HEIGHT) {
                r0 = cr.m2201a(obj2, 1);
                if (r0 != null && r0 != LuaNil.nil) {
                    this.N = ((Double) r0).floatValue();
                    m4837p();
                }
            }
        }
    }

    public void m4805a(Vector vector) {
        m4781c(vector);
    }

    protected abstract void m4806a(Vector vector, int i);

    protected abstract void m4807a(Vector vector, int i, int i2);

    protected abstract void m4808a(bS bSVar, LuaTable luaTable);

    public final void m4809a(bg bgVar) {
        this.ar = bgVar;
    }

    public final eO m4810b(Hashtable hashtable) {
        eO eOVar;
        LuaNil luaNil = hashtable.get("template");
        if (luaNil == LuaNil.nil || luaNil == null || !(luaNil instanceof eO)) {
            eOVar = this.f4550X;
        } else {
            eOVar = (eO) luaNil;
            if (this.ai == null) {
                this.ai = new ArrayList();
            }
            this.ai.add(eOVar);
            eOVar.m4220c(101);
            m4765a(eOVar);
        }
        if (!(this.an == null || eOVar == null)) {
            m4775b(eOVar, hashtable);
        }
        return eOVar;
    }

    protected void m4811b() {
        dB a;
        if (this.as.isEmpty()) {
            m4788l();
        }
        Object table = super.getTable(f4527i);
        if (table != LuaNil.nil) {
            a = cN.m2139a(table);
            if (a != null) {
                this.ar.m2049a(a);
            }
        }
        table = super.getTable(f4528j);
        if (table != LuaNil.nil) {
            a = cN.m2139a(table);
            if (a != null) {
                this.ar.m2056b(a);
            }
        }
        table = super.getTable(f4529k);
        if (table != LuaNil.nil) {
            a = cN.m2139a(table);
            if (a != null) {
                this.ar.m2060c(a);
            }
        }
        table = super.getTable(f4531m);
        if (table != LuaNil.nil) {
            a = cN.m2139a(table);
            if (a != null) {
                this.ar.m2063e(a);
            }
        }
        this.ar.m2052a(this.au);
        LuaNil table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table2 != LuaNil.nil) {
            this.ar.e_(m3942a(((Boolean) table2).booleanValue()));
        }
        table2 = super.getTable(ATTR_WIDGET_MARGIN);
        if (table2 != LuaNil.nil) {
            this.ar.m2053a(convertMarginsToPixels(table2, this.I));
        }
        table2 = super.getTable(ATTR_WIDGET_PADDING);
        if (table2 != LuaNil.nil) {
            this.ar.m2058b(convertPaddingToPixels(table2, this.I));
        }
        table = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
        if (table != LuaNil.nil) {
            table = cr.m2201a(table, 1);
            if (table != null) {
                this.M = ((Double) table).intValue();
            }
        }
        table = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
        if (table != LuaNil.nil) {
            table = cr.m2201a(table, 1);
            if (table != null) {
                this.N = ((Double) table).floatValue();
                m4837p();
            }
        }
        table = super.getTable(f4530l);
        if (table != LuaNil.nil) {
            a = cN.m2139a(table);
            if (a != null) {
                this.ar.m2062d(a);
            }
        }
        this.ar.m2066g(this.f4545S);
        if (this.f4546T != null) {
            this.ar.m2050a((String) this.f4546T);
        }
        if (this.f4547U != null) {
            this.ar.m2057b((String) this.f4547U);
        }
        table = super.getTable(f4534p);
        if (table != LuaNil.nil) {
            a = cN.m2139a(table);
            if (a != null) {
                this.ar.m2065f(a);
            }
        }
        table2 = super.getTable(f4537s);
        if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
            table2 = super.getTable(f4539u);
            if (table2 != LuaNil.nil) {
                int intValue = ((Double) table2).intValue();
                if (intValue >= 0) {
                    this.ar.m2059c(intValue, m4784e());
                }
            }
        }
        this.ar.b_(this.ac);
        this.E = KONY_WIDGET_RESTORE;
        m4820d();
        table2 = super.getTable(f4517Q);
        if (table2 != LuaNil.nil) {
            m4825f((LuaTable) table2);
        } else {
            table2 = super.getTable(f4514C);
            if (table2 != LuaNil.nil) {
                m4823e((LuaTable) table2);
            }
        }
        table2 = super.getTable(f4518R);
        if (table2 != LuaNil.nil) {
            m4821d((LuaTable) table2);
        } else {
            table2 = super.getTable(f4516P);
            if (table2 != LuaNil.nil) {
                m4818c(table2 != LuaNil.nil ? (LuaTable) table2 : null);
            }
        }
        if (!(this.ah == null || this.ah.isEmpty())) {
            this.ar.m2051a(this.ah);
        }
        if (this.af != -1 && this.ag != -1) {
            this.ar.m2061d(this.af, this.ag);
        } else if (this.ad != -1 && this.ae != -1) {
            this.ar.m2054b(this.ad, this.ae);
        }
    }

    public void m4812b(int i) {
        if (this.ad == i) {
            this.ad = -1;
            this.ae = -1;
        } else if (this.ad > i) {
            this.ad--;
        }
        if (this.af == i) {
            this.af = -1;
            this.ag = -1;
        } else if (this.af > i) {
            this.af--;
        }
        if (this.ah != null && !this.ah.isEmpty() && this.f4551Y != null && !this.f4551Y.isEmpty()) {
            int size;
            int i2;
            if (this.f4545S == 2) {
                size = this.f4551Y.size();
                for (i2 = i; i2 < size; i2++) {
                    if (i2 == i) {
                        this.ah.remove(Integer.valueOf(i2));
                    } else {
                        ArrayList arrayList = (ArrayList) this.ah.remove(Integer.valueOf(i2));
                        if (arrayList != null) {
                            this.ah.put(Integer.valueOf(i2 - 1), arrayList);
                        }
                    }
                }
            } else if (this.f4545S == 1) {
                size = this.f4551Y.size();
                for (i2 = i; i2 < size; i2++) {
                    if (i2 != i) {
                        Integer num = (Integer) this.ah.remove(Integer.valueOf(i2));
                        if (num != null) {
                            this.ah.put(Integer.valueOf(i2 - 1), num);
                            return;
                        }
                    } else if (this.ah.remove(Integer.valueOf(i)) != null) {
                        return;
                    }
                }
            }
        }
    }

    public void m4813b(LuaTable luaTable) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI2", "Enter addAll()");
        }
        if (this.aa == null || this.aa.map.size() == 0) {
            throw new LuaError(f4515D + " is not set for the Segment widget " + toString(), 9999);
        }
        Vector vector = luaTable.list;
        if (vector.size() > 0) {
            if (this.as.isEmpty()) {
                m4788l();
            }
            boolean b = m4777b(vector, 0);
            if ((this.ab && b) || (!this.ab && !b)) {
                m4781c(vector);
            } else if (this.f4551Y.size() == 0) {
                this.ab = b;
                m4781c(vector);
            } else {
                throw new LuaError("The format of data set for SegmentedUI2 having id '" + super.getTable(ATTR_WIDGET_ID) + "' through addAll() is not " + "in sync with the format of existing data", 9999);
            }
        }
    }

    public final void m4814b(LuaTable luaTable, int i) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI2", "Enter setDataAt()");
        }
        if (this.f4551Y != null && this.f4551Y.size() != 0) {
            int a = cr.m2199a(i, 0);
            if (a >= 0) {
                if (this.as.isEmpty()) {
                    m4788l();
                }
                int[] f = m4826f(a);
                if (f != null) {
                    m4776b(luaTable, f[0], f[1]);
                } else if (KonyMain.f3659g) {
                    Log.e("LuaSegUI2", "Invalid index to set data at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI2", "Invalid index to set data at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI2", "Segment is empty");
        }
    }

    protected abstract void m4815b(Vector vector);

    protected abstract void m4816c();

    protected void m4817c(int i) {
        if (this.f4545S != i) {
            m4795s();
            if (this.ah != null) {
                this.ah.clear();
            }
            this.f4545S = i;
        }
    }

    protected void m4818c(LuaTable luaTable) {
        if (luaTable != null) {
            if (this.f4551Y != null && !this.f4551Y.isEmpty()) {
                Vector vector = luaTable.list;
                if (!vector.isEmpty()) {
                    if (this.f4545S == 2) {
                        m4783d(vector);
                    } else if (this.f4545S == 1) {
                        if (this.ah == null) {
                            this.ah = new LinkedHashMap();
                        }
                        r1 = ((LuaTable) vector.get(0)).list;
                        if (!r1.isEmpty()) {
                            r2 = cr.m2199a(((Double) r1.get(0)).intValue(), 0);
                            if (r2 < this.f4551Y.size()) {
                                vector = ((LuaTable) r1.get(1)).list;
                                if (!vector.isEmpty()) {
                                    r1 = cr.m2199a(((Double) vector.get(0)).intValue(), 0);
                                    if (r1 < ((bT) this.f4551Y.get(r2)).f2147g.size()) {
                                        this.ah.clear();
                                        this.ah.put(Integer.valueOf(r2), Integer.valueOf(r1));
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (this.f4545S == 0) {
                        r1 = ((LuaTable) vector.get(0)).list;
                        r2 = cr.m2199a(((Double) r1.get(0)).intValue(), 0);
                        if (r2 < this.f4551Y.size()) {
                            vector = ((LuaTable) r1.get(1)).list;
                            if (!vector.isEmpty()) {
                                r1 = cr.m2199a(((Double) vector.get(0)).intValue(), 0);
                                if (r1 < ((bT) this.f4551Y.get(r2)).f2147g.size()) {
                                    this.ad = r2;
                                    this.ae = r1;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            return;
        } else if (this.f4545S == 0) {
            m4793q();
        } else {
            m4796t();
        }
        super.setTable(f4516P, LuaNil.nil);
    }

    public final void m4819c(LuaTable luaTable, int i) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI2", "Enter addAt()");
        }
        if (luaTable.list.size() > 0) {
            throw new LuaError("While calling addDataAt() on segmentedUI2 having id '" + super.getTable(ATTR_WIDGET_ID) + "', the data parameter " + "should contain only rows & no section information", 9999);
        } else if (this.aa == null || this.aa.map.size() == 0) {
            throw new LuaError(f4515D + " is not set for the Segment widget " + toString(), 9999);
        } else {
            int a = cr.m2199a(i, 0);
            if (a >= 0) {
                int i2;
                int i3;
                Vector vector;
                if (this.as.isEmpty()) {
                    m4788l();
                }
                if (this.f4551Y.size() == 0) {
                    bT h = m4830h();
                    h.f2147g = new Vector();
                    this.f4551Y.add(h);
                    this.ab = false;
                }
                int[] f = m4826f(a);
                if (f != null) {
                    i2 = f[0];
                    i3 = f[1];
                    vector = ((bT) this.f4551Y.elementAt(i3)).f2147g;
                } else {
                    i3 = this.f4551Y.size() - 1;
                    vector = ((bT) this.f4551Y.elementAt(i3)).f2147g;
                    i2 = vector.size();
                }
                m4803a(luaTable, vector, i2, i3);
                m4771b(i3, i2);
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI2", "Invalid index to add data at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        }
    }

    public void cleanup() {
        if (this.E != KONY_WIDGET_BACKUP) {
            if (this.ar != null) {
                this.ar.m2069m();
                this.ar = null;
            }
            m4816c();
            this.E = KONY_WIDGET_BACKUP;
        }
    }

    public LuaWidget createClone() {
        return null;
    }

    protected abstract void m4820d();

    protected void m4821d(LuaTable luaTable) {
        if (luaTable != null) {
            if (this.f4551Y != null && !this.f4551Y.isEmpty()) {
                Vector vector = luaTable.list;
                if (!vector.isEmpty()) {
                    if (this.f4545S == 2) {
                        m4783d(vector);
                    } else if (this.f4545S == 1 || this.f4545S == 0) {
                        Vector vector2 = ((LuaTable) vector.get(0)).list;
                        if (!vector2.isEmpty() && vector2.size() >= 2) {
                            int a = cr.m2199a(((Double) vector2.get(0)).intValue(), 0);
                            if (a < this.f4551Y.size()) {
                                vector = ((LuaTable) vector2.get(1)).list;
                                if (!vector.isEmpty()) {
                                    int a2 = cr.m2199a(((Double) vector.get(0)).intValue(), 0);
                                    if (a2 < ((bT) this.f4551Y.get(a)).f2147g.size()) {
                                        this.af = a;
                                        this.ag = a2;
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            return;
        } else if (this.f4545S == 2) {
            m4796t();
        } else {
            m4794r();
        }
        super.setTable(f4518R, LuaNil.nil);
    }

    public final void m4822d(LuaTable luaTable, int i) {
        if (i < 0 || i >= this.f4551Y.size()) {
            if (KonyMain.f3659g) {
                Log.d("LuaSegUI2", "Invalid sectionIndex: " + i + " to set section at");
            }
        } else if (this.ab || this.f4551Y.size() <= 0) {
            if (this.as.isEmpty()) {
                m4788l();
            }
            LuaTable luaTable2 = new LuaTable(1, 0);
            luaTable2.list.add(luaTable);
            m4812b(i);
            m4800a(luaTable2, i);
        } else {
            throw new LuaError("calling setSectionAt() on SegmentedUI2 having id '" + super.getTable(ATTR_WIDGET_ID) + "' is invalid" + " if it is already set with data having no sections", 9999);
        }
    }

    protected final int d_() {
        return this.ar.m2067k().getHeight();
    }

    protected void m4823e(LuaTable luaTable) {
        if (this.f4545S == 0) {
            m4789l(luaTable);
        } else if (this.f4545S == 1) {
            if (this.ah != null) {
                this.ah.clear();
            }
            if (luaTable != null) {
                if (this.ah == null) {
                    this.ah = new LinkedHashMap();
                }
                r1 = luaTable.list;
                if (!r1.isEmpty()) {
                    r2 = Integer.valueOf(cr.m2199a(((Double) r1.get(0)).intValue(), 0));
                    r1 = Integer.valueOf(cr.m2199a(((Double) r1.get(1)).intValue(), 0));
                    if (r2.intValue() < this.f4551Y.size() && r1.intValue() < ((bT) this.f4551Y.get(r2.intValue())).f2147g.size()) {
                        this.ah.put(r2, r1);
                    }
                }
            } else {
                m4796t();
            }
        } else if (this.f4545S == 2) {
            if (luaTable != null) {
                if (this.ah == null) {
                    this.ah = new LinkedHashMap();
                }
                r1 = luaTable.list;
                if (!r1.isEmpty()) {
                    r2 = Integer.valueOf(cr.m2199a(((Double) r1.get(0)).intValue(), 0));
                    r1 = Integer.valueOf(cr.m2199a(((Double) r1.get(1)).intValue(), 0));
                    if (r2.intValue() < this.f4551Y.size() && r1.intValue() < ((bT) this.f4551Y.get(r2.intValue())).f2147g.size()) {
                        ArrayList arrayList = (ArrayList) this.ah.get(r2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.ah.put(r2, arrayList);
                            arrayList.add(r1);
                        } else if (!arrayList.contains(r1)) {
                            arrayList.add(r1);
                        }
                    }
                }
            } else {
                m4796t();
            }
        }
        super.setTable(f4514C, LuaNil.nil);
    }

    public void m4824f() {
        this.as.clear();
        if (!(this.ai == null || this.ai.isEmpty())) {
            cr.m2206a((LuaWidget) this, this.ai);
            this.ai.clear();
        }
        m4816c();
        if (!(this.f4551Y == null || this.f4551Y.isEmpty())) {
            this.f4551Y.clear();
            m4795s();
        }
        this.ab = false;
    }

    protected void m4825f(LuaTable luaTable) {
        if (luaTable != null) {
            Vector vector = luaTable.list;
            if (!vector.isEmpty()) {
                int a = cr.m2199a(((Double) vector.get(0)).intValue(), 0);
                int a2 = cr.m2199a(((Double) vector.get(1)).intValue(), 0);
                if (a < this.f4551Y.size() && a2 < ((bT) this.f4551Y.get(a)).f2147g.size()) {
                    this.af = a;
                    this.ag = a2;
                }
            }
        } else {
            this.af = -1;
            this.ag = -1;
        }
        super.setTable(f4517Q, LuaNil.nil);
    }

    public final int[] m4826f(int i) {
        if (i < 0) {
            return null;
        }
        int size;
        int size2 = this.f4551Y.size() - 1;
        Iterator it = this.f4551Y.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            i2++;
            size = ((bT) it.next()).f2147g.size();
            if (i < size) {
                size = 1;
                break;
            }
            i -= size;
            if (i == 0 && i2 == size2) {
                size = 0;
                break;
            }
        }
        size = 0;
        if (size == 0) {
            return null;
        }
        return new int[]{i, i2};
    }

    protected iq m4827g() {
        return new bQ(this);
    }

    public final void m4828g(int i) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI2", "Enter removeAt()");
        }
        if (this.f4551Y != null) {
            int a = cr.m2199a(i, 0);
            if (a >= 0) {
                int[] f = m4826f(a);
                if (f != null) {
                    int i2 = f[0];
                    int i3 = f[1];
                    Vector vector = ((bT) this.f4551Y.elementAt(i3)).f2147g;
                    m4807a(vector, i2, i3);
                    if (!this.ab && vector.size() == 0) {
                        this.f4551Y.clear();
                    }
                    m4763a(i3, i2);
                } else if (KonyMain.f3659g) {
                    Log.e("LuaSegUI2", "Invalid index to remove at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI2", "Invalid index to remove at: " + a + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI2", "Segment is empty");
        }
    }

    protected void m4829g(LuaTable luaTable) {
        if (luaTable != null && luaTable.hashSize() > 0) {
            this.ao = (String) luaTable.getTable(f4525g);
            this.f4546T = luaTable.getTable(f4523e);
            this.f4547U = luaTable.getTable(f4524f);
        }
        super.setTable(f4525g, null);
        super.setTable(f4523e, null);
        super.setTable(f4524f, null);
    }

    public LuaWidget getChildWidget(String str) {
        return null;
    }

    public ArrayList getChildWidgets() {
        return null;
    }

    public String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public LuaWidget getParent() {
        return this.I;
    }

    public Hashtable getProperties() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(f4526h, "table");
        hashtable.put(f4514C, "number");
        hashtable.put(f4516P, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f4530l, "table");
        hashtable.put(f4529k, "table");
        hashtable.put(f4531m, "table");
        hashtable.put(f4532n, "table");
        return hashtable;
    }

    public Object getProperty(String str) {
        return super.getTable(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getTable(java.lang.Object r14) {
        /*
        r13 = this;
        r1 = -1;
        r11 = 2;
        r2 = 0;
        r9 = 1;
        r3 = 0;
        r14 = (java.lang.String) r14;
        r5 = r14.intern();
        r0 = f4517Q;
        if (r5 != r0) goto L_0x003f;
    L_0x000f:
        r0 = r13.af;
        if (r0 == r1) goto L_0x0017;
    L_0x0013:
        r0 = r13.ag;
        if (r0 != r1) goto L_0x001f;
    L_0x0017:
        r0 = r2;
    L_0x0018:
        if (r0 == 0) goto L_0x044a;
    L_0x001a:
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x044a;
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = new com.konylabs.vm.LuaTable;
        r0.<init>(r11, r3);
        r1 = r13.af;
        r1 = ny0k.cr.m2199a(r1, r9);
        r2 = r13.ag;
        r2 = ny0k.cr.m2199a(r2, r9);
        r1 = ny0k.cr.m2200a(r1);
        r0.add(r1);
        r1 = ny0k.cr.m2200a(r2);
        r0.add(r1);
        goto L_0x0018;
    L_0x003f:
        r0 = f4518R;
        if (r5 != r0) goto L_0x00e6;
    L_0x0043:
        r0 = r13.f4545S;
        if (r0 != r11) goto L_0x00a5;
    L_0x0047:
        r4 = r13.ah;
        if (r4 == 0) goto L_0x0051;
    L_0x004b:
        r0 = r4.isEmpty();
        if (r0 == 0) goto L_0x0053;
    L_0x0051:
        r0 = r2;
        goto L_0x0018;
    L_0x0053:
        r6 = r4.keySet();
        r7 = r6.iterator();
        r1 = r2;
    L_0x005c:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00a3;
    L_0x0062:
        r0 = r7.next();
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        r0 = java.lang.Integer.valueOf(r2);
        r0 = r4.get(r0);
        r0 = (java.util.ArrayList) r0;
        r8 = r0.isEmpty();
        if (r8 != 0) goto L_0x0466;
    L_0x007c:
        r8 = new com.konylabs.vm.LuaTable;
        r8.<init>(r11, r3);
        r2 = ny0k.cr.m2199a(r2, r9);
        r2 = ny0k.cr.m2200a(r2);
        r8.add(r2);
        r0 = ny0k.cr.m2207b(r0);
        r8.add(r0);
        if (r1 != 0) goto L_0x0463;
    L_0x0095:
        r0 = new com.konylabs.vm.LuaTable;
        r1 = r6.size();
        r0.<init>(r1, r3);
    L_0x009e:
        r0.add(r8);
    L_0x00a1:
        r1 = r0;
        goto L_0x005c;
    L_0x00a3:
        r2 = r1;
        goto L_0x0051;
    L_0x00a5:
        r0 = r13.f4545S;
        if (r0 == r9) goto L_0x00ad;
    L_0x00a9:
        r0 = r13.f4545S;
        if (r0 != 0) goto L_0x0051;
    L_0x00ad:
        r0 = r13.af;
        if (r0 == r1) goto L_0x0051;
    L_0x00b1:
        r0 = r13.ag;
        if (r0 == r1) goto L_0x0051;
    L_0x00b5:
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r9, r3);
        r0 = new com.konylabs.vm.LuaTable;
        r0.<init>(r11, r3);
        r1 = r13.af;
        r1 = ny0k.cr.m2199a(r1, r9);
        r1 = ny0k.cr.m2200a(r1);
        r0.add(r1);
        r1 = new com.konylabs.vm.LuaTable;
        r1.<init>(r9, r3);
        r3 = r13.ag;
        r3 = ny0k.cr.m2199a(r3, r9);
        r3 = ny0k.cr.m2200a(r3);
        r1.add(r3);
        r0.add(r1);
        r2.add(r0);
        goto L_0x0051;
    L_0x00e6:
        r0 = al;
        if (r5 != r0) goto L_0x00f1;
    L_0x00ea:
        r2 = r13.m4791n();
        r0 = r2;
        goto L_0x0018;
    L_0x00f1:
        r0 = f4514C;
        if (r5 != r0) goto L_0x0198;
    L_0x00f5:
        r0 = r13.f4545S;
        if (r0 != 0) goto L_0x0100;
    L_0x00f9:
        r2 = r13.m4791n();
    L_0x00fd:
        r0 = r2;
        goto L_0x0018;
    L_0x0100:
        r0 = r13.f4545S;
        if (r0 == r11) goto L_0x0108;
    L_0x0104:
        r0 = r13.f4545S;
        if (r0 != r9) goto L_0x00fd;
    L_0x0108:
        r6 = r13.ah;
        if (r6 == 0) goto L_0x00fd;
    L_0x010c:
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x00fd;
    L_0x0112:
        r0 = r13.f4545S;
        if (r0 != r9) goto L_0x0157;
    L_0x0116:
        r0 = r6.keySet();
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00fd;
    L_0x0124:
        r0 = r0.next();
        r0 = (java.lang.Integer) r0;
        r1 = r6.get(r0);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r0 = r0.intValue();
        r12 = r1;
        r1 = r0;
        r0 = r12;
    L_0x013b:
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r11, r3);
        r1 = ny0k.cr.m2199a(r1, r9);
        r0 = ny0k.cr.m2199a(r0, r9);
        r1 = ny0k.cr.m2200a(r1);
        r2.add(r1);
        r0 = ny0k.cr.m2200a(r0);
        r2.add(r0);
        goto L_0x00fd;
    L_0x0157:
        r0 = r13.f4545S;
        if (r0 != r11) goto L_0x045f;
    L_0x015b:
        r0 = r6.keySet();
        r7 = r0.iterator();
        r0 = r2;
        r4 = r2;
    L_0x0165:
        if (r4 == 0) goto L_0x016d;
    L_0x0167:
        r1 = r4.isEmpty();
        if (r1 == 0) goto L_0x0181;
    L_0x016d:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x0181;
    L_0x0173:
        r0 = r7.next();
        r0 = (java.lang.Integer) r0;
        r1 = r6.get(r0);
        r1 = (java.util.ArrayList) r1;
        r4 = r1;
        goto L_0x0165;
    L_0x0181:
        r1 = r0.intValue();
        if (r4 == 0) goto L_0x00fd;
    L_0x0187:
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x00fd;
    L_0x018d:
        r0 = r4.get(r3);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        goto L_0x013b;
    L_0x0198:
        r0 = f4516P;
        if (r5 != r0) goto L_0x0299;
    L_0x019c:
        r0 = r13.f4545S;
        if (r0 != r11) goto L_0x01ff;
    L_0x01a0:
        r4 = r13.ah;
        if (r4 == 0) goto L_0x01aa;
    L_0x01a4:
        r0 = r4.isEmpty();
        if (r0 == 0) goto L_0x01ad;
    L_0x01aa:
        r0 = r2;
        goto L_0x0018;
    L_0x01ad:
        r6 = r4.keySet();
        r7 = r6.iterator();
        r1 = r2;
    L_0x01b6:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x01fd;
    L_0x01bc:
        r0 = r7.next();
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        r0 = java.lang.Integer.valueOf(r2);
        r0 = r4.get(r0);
        r0 = (java.util.ArrayList) r0;
        r8 = r0.isEmpty();
        if (r8 != 0) goto L_0x045c;
    L_0x01d6:
        r8 = new com.konylabs.vm.LuaTable;
        r8.<init>(r11, r3);
        r2 = ny0k.cr.m2199a(r2, r9);
        r2 = ny0k.cr.m2200a(r2);
        r8.add(r2);
        r0 = ny0k.cr.m2207b(r0);
        r8.add(r0);
        if (r1 != 0) goto L_0x0459;
    L_0x01ef:
        r0 = new com.konylabs.vm.LuaTable;
        r1 = r6.size();
        r0.<init>(r1, r3);
    L_0x01f8:
        r0.add(r8);
    L_0x01fb:
        r1 = r0;
        goto L_0x01b6;
    L_0x01fd:
        r2 = r1;
        goto L_0x01aa;
    L_0x01ff:
        r0 = r13.f4545S;
        if (r0 != r9) goto L_0x025c;
    L_0x0203:
        r1 = r13.ah;
        if (r1 == 0) goto L_0x01aa;
    L_0x0207:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x01aa;
    L_0x020d:
        r0 = r1.keySet();
        r0 = r0.iterator();
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x01aa;
    L_0x021b:
        r0 = r0.next();
        r0 = (java.lang.Integer) r0;
        r4 = new com.konylabs.vm.LuaTable;
        r4.<init>(r11, r3);
        r2 = r0.intValue();
        r2 = ny0k.cr.m2199a(r2, r9);
        r2 = ny0k.cr.m2200a(r2);
        r4.add(r2);
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r9, r3);
        r0 = r1.get(r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = ny0k.cr.m2199a(r0, r9);
        r0 = ny0k.cr.m2200a(r0);
        r2.add(r0);
        r4.add(r2);
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r9, r3);
        r2.add(r4);
        goto L_0x01aa;
    L_0x025c:
        r0 = r13.f4545S;
        if (r0 != 0) goto L_0x01aa;
    L_0x0260:
        r0 = r13.ad;
        if (r0 == r1) goto L_0x01aa;
    L_0x0264:
        r0 = r13.ae;
        if (r0 == r1) goto L_0x01aa;
    L_0x0268:
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r9, r3);
        r0 = new com.konylabs.vm.LuaTable;
        r0.<init>(r11, r3);
        r1 = r13.ad;
        r1 = ny0k.cr.m2199a(r1, r9);
        r1 = ny0k.cr.m2200a(r1);
        r0.add(r1);
        r1 = new com.konylabs.vm.LuaTable;
        r1.<init>(r9, r3);
        r3 = r13.ae;
        r3 = ny0k.cr.m2199a(r3, r9);
        r3 = ny0k.cr.m2200a(r3);
        r1.add(r3);
        r0.add(r1);
        r2.add(r0);
        goto L_0x01aa;
    L_0x0299:
        r0 = f4536r;
        if (r5 != r0) goto L_0x032c;
    L_0x029d:
        r0 = r13.f4551Y;
        if (r0 == 0) goto L_0x02a9;
    L_0x02a1:
        r0 = r13.f4551Y;
        r0 = r0.size();
        if (r0 != 0) goto L_0x02ac;
    L_0x02a9:
        r0 = r2;
        goto L_0x0018;
    L_0x02ac:
        r0 = r13.ab;
        if (r0 == 0) goto L_0x02fe;
    L_0x02b0:
        r0 = r13.f4551Y;
        r6 = r0.size();
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r6, r3);
        r4 = r3;
    L_0x02bc:
        if (r4 >= r6) goto L_0x02fb;
    L_0x02be:
        r0 = r13.f4551Y;
        r0 = r0.get(r4);
        r0 = (ny0k.bT) r0;
        r1 = r0.f2143c;
        if (r1 != 0) goto L_0x02cc;
    L_0x02ca:
        r1 = r0.f2145e;
    L_0x02cc:
        r7 = new com.konylabs.vm.LuaTable;
        r7.<init>(r11, r3);
        r7.add(r1);
        r8 = r0.f2147g;
        r9 = r8.size();
        r10 = new com.konylabs.vm.LuaTable;
        r10.<init>(r9, r3);
        r1 = r3;
    L_0x02e0:
        if (r1 >= r9) goto L_0x02f1;
    L_0x02e2:
        r0 = r8.get(r1);
        r0 = (ny0k.bS) r0;
        r0 = r0.f2141d;
        r10.add(r0);
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x02e0;
    L_0x02f1:
        r7.add(r10);
        r2.add(r7);
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x02bc;
    L_0x02fb:
        r0 = r2;
        goto L_0x0018;
    L_0x02fe:
        r0 = r13.f4551Y;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0456;
    L_0x0306:
        r0 = r13.f4551Y;
        r0 = r0.get(r3);
        r0 = (ny0k.bT) r0;
        r2 = r0.f2147g;
        r0 = r2.size();
        r1 = r0;
    L_0x0315:
        r4 = new com.konylabs.vm.LuaTable;
        r4.<init>(r1, r3);
        if (r2 == 0) goto L_0x0453;
    L_0x031c:
        if (r3 >= r1) goto L_0x0453;
    L_0x031e:
        r0 = r2.get(r3);
        r0 = (ny0k.bS) r0;
        r0 = r0.f2141d;
        r4.add(r0);
        r3 = r3 + 1;
        goto L_0x031c;
    L_0x032c:
        r0 = ak;
        if (r5 != r0) goto L_0x0366;
    L_0x0330:
        r0 = r13.f4545S;
        if (r0 == 0) goto L_0x0338;
    L_0x0334:
        r0 = r13.f4545S;
        if (r0 != r9) goto L_0x0361;
    L_0x0338:
        r0 = r13.af;
        if (r0 == r1) goto L_0x035e;
    L_0x033c:
        r0 = r13.ag;
        if (r0 == r1) goto L_0x035e;
    L_0x0340:
        r0 = r13.f4551Y;
        r1 = r13.af;
        r0 = r0.get(r1);
        r0 = (ny0k.bT) r0;
        r0 = r0.f2147g;
        r1 = r13.ag;
        r0 = r0.get(r1);
        r0 = (ny0k.bS) r0;
        r2 = r0.f2141d;
        r0 = new com.konylabs.vm.LuaTable;
        r0.<init>(r9, r3);
        r0.add(r2);
    L_0x035e:
        r0 = r2;
        goto L_0x0018;
    L_0x0361:
        r2 = r13.m4792o();
        goto L_0x035e;
    L_0x0366:
        r0 = f4526h;
        if (r5 != r0) goto L_0x03ef;
    L_0x036a:
        r0 = r13.f4545S;
        if (r0 != 0) goto L_0x039b;
    L_0x036e:
        r0 = r13.ad;
        if (r0 == r1) goto L_0x0376;
    L_0x0372:
        r0 = r13.ae;
        if (r0 != r1) goto L_0x0384;
    L_0x0376:
        r0 = r2;
    L_0x0377:
        if (r0 == 0) goto L_0x0381;
    L_0x0379:
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r9, r3);
        r2.add(r0);
    L_0x0381:
        r0 = r2;
        goto L_0x0018;
    L_0x0384:
        r0 = r13.f4551Y;
        r1 = r13.ad;
        r0 = r0.get(r1);
        r0 = (ny0k.bT) r0;
        r0 = r0.f2147g;
        r1 = r13.ae;
        r0 = r0.get(r1);
        r0 = (ny0k.bS) r0;
        r0 = r0.f2141d;
        goto L_0x0377;
    L_0x039b:
        r0 = r13.f4545S;
        if (r0 != r11) goto L_0x03a4;
    L_0x039f:
        r2 = r13.m4792o();
        goto L_0x0381;
    L_0x03a4:
        r0 = r13.f4545S;
        if (r0 != r9) goto L_0x0381;
    L_0x03a8:
        r1 = r13.ah;
        if (r1 == 0) goto L_0x0381;
    L_0x03ac:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x0381;
    L_0x03b2:
        r0 = r1.keySet();
        r0 = r0.iterator();
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x0381;
    L_0x03c0:
        r2 = new com.konylabs.vm.LuaTable;
        r2.<init>(r9, r3);
        r0 = r0.next();
        r0 = (java.lang.Integer) r0;
        r1 = r1.get(r0);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r3 = r13.f4551Y;
        r0 = r0.intValue();
        r0 = r3.get(r0);
        r0 = (ny0k.bT) r0;
        r0 = r0.f2147g;
        r0 = r0.get(r1);
        r0 = (ny0k.bS) r0;
        r0 = r0.f2141d;
        r2.add(r0);
        goto L_0x0381;
    L_0x03ef:
        r0 = f4515D;
        if (r5 != r0) goto L_0x03f8;
    L_0x03f3:
        r2 = r13.aa;
        r0 = r2;
        goto L_0x0018;
    L_0x03f8:
        r0 = f4519a;
        if (r5 != r0) goto L_0x0401;
    L_0x03fc:
        r2 = r13.f4550X;
        r0 = r2;
        goto L_0x0018;
    L_0x0401:
        r0 = f4520b;
        if (r5 != r0) goto L_0x040a;
    L_0x0405:
        r2 = r13.f4552Z;
        r0 = r2;
        goto L_0x0018;
    L_0x040a:
        r0 = f4521c;
        if (r5 != r0) goto L_0x0413;
    L_0x040e:
        r2 = r13.at;
        r0 = r2;
        goto L_0x0018;
    L_0x0413:
        r0 = f4512A;
        if (r5 != r0) goto L_0x0422;
    L_0x0417:
        r2 = new java.lang.Double;
        r0 = r13.f4545S;
        r0 = (double) r0;
        r2.<init>(r0);
        r0 = r2;
        goto L_0x0018;
    L_0x0422:
        r0 = f4535q;
        if (r5 != r0) goto L_0x042f;
    L_0x0426:
        r0 = r13.ac;
        r2 = java.lang.Boolean.valueOf(r0);
        r0 = r2;
        goto L_0x0018;
    L_0x042f:
        r0 = f4525g;
        if (r5 != r0) goto L_0x0438;
    L_0x0433:
        r2 = r13.ao;
        r0 = r2;
        goto L_0x0018;
    L_0x0438:
        r0 = f4523e;
        if (r5 != r0) goto L_0x0441;
    L_0x043c:
        r2 = r13.f4546T;
        r0 = r2;
        goto L_0x0018;
    L_0x0441:
        r0 = f4524f;
        if (r5 != r0) goto L_0x0450;
    L_0x0445:
        r2 = r13.f4547U;
        r0 = r2;
        goto L_0x0018;
    L_0x044a:
        r0 = super.getTable(r5);
        goto L_0x001e;
    L_0x0450:
        r0 = r2;
        goto L_0x0018;
    L_0x0453:
        r0 = r4;
        goto L_0x0018;
    L_0x0456:
        r1 = r3;
        goto L_0x0315;
    L_0x0459:
        r0 = r1;
        goto L_0x01f8;
    L_0x045c:
        r0 = r1;
        goto L_0x01fb;
    L_0x045f:
        r0 = r3;
        r1 = r3;
        goto L_0x013b;
    L_0x0463:
        r0 = r1;
        goto L_0x009e;
    L_0x0466:
        r0 = r1;
        goto L_0x00a1;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.bO.getTable(java.lang.Object):java.lang.Object");
    }

    public String getType() {
        return "SegmentUI2";
    }

    public View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            m4811b();
        }
        this.ar.m2068l();
        return this.ar.m2067k();
    }

    public int getWidth() {
        return 0;
    }

    protected abstract bT m4830h();

    protected final ci m4831h(LuaTable luaTable) {
        LuaNil table = luaTable.getTable("metainfo");
        if (table == LuaNil.nil) {
            table = luaTable.getTable("metaInfo");
        }
        if (table == LuaNil.nil) {
            dB k = m4787k(luaTable);
            ci ciVar;
            if (this.f4545S == 0) {
                if (k == null) {
                    return null;
                }
                ciVar = new ci();
                ciVar.f2277a = true;
                ciVar.f2278b = k;
                return ciVar;
            } else if (this.f4545S != 1 && this.f4545S != 2) {
                return null;
            } else {
                ciVar = new ci();
                ciVar.f2277a = true;
                ciVar.f2279c = this.f4548V;
                ciVar.f2278b = k;
                return ciVar;
            }
        } else if (table instanceof LuaTable) {
            LuaTable luaTable2 = (LuaTable) table;
            LuaTable luaTable3 = luaTable2.hashSize() == 0 ? (LuaTable) luaTable2.getTable(new Double(1.0d)) : luaTable2;
            ci ciVar2 = new ci();
            ciVar2.f2277a = true;
            table = luaTable3.getTable("clickable");
            if (table != LuaNil.nil) {
                if (table instanceof String) {
                    ciVar2.f2277a = ((String) table).equalsIgnoreCase("true");
                } else {
                    ciVar2.f2277a = ((Boolean) table).booleanValue();
                }
            }
            Object table2 = luaTable3.getTable("skin");
            if (table2 != LuaNil.nil) {
                ciVar2.f2278b = cN.m2139a(table2);
            } else {
                ciVar2.f2278b = m4787k(luaTable);
            }
            if (this.f4545S == 1 || this.f4545S == 2) {
                ciVar2.f2279c = this.f4548V;
            }
            return ciVar2;
        } else {
            throw new LuaError("SegmentUI metainfo value should be a LuaTable", 9999);
        }
    }

    public void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.ar.m2058b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.ar.m2053a(convertMarginsToPixels(table, this.I));
            }
            m4837p();
            if (!(this.ah == null || this.ah.isEmpty())) {
                this.ar.m2051a(this.ah);
            }
            setHeight();
            this.ar.m2074r();
        }
    }

    protected final dB m4832i(LuaTable luaTable) {
        Object obj = luaTable.map.get("template");
        obj = (obj != null ? (eO) obj : this.f4552Z).getTable(ATTR_WIDGET_SKIN);
        return obj != LuaNil.nil ? cN.m2139a(obj) : null;
    }

    protected final void m4833i() {
        this.an = new HashMap();
    }

    public final eO m4834j() {
        return this.f4550X;
    }

    public void m4835j(LuaTable luaTable) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI2", "Setting data at SetData()");
        }
        if (this.aa == null || this.aa.map.size() == 0) {
            throw new LuaError(f4515D + " is not set for the Segment widget " + toString(), 9999);
        }
        m4824f();
        if (luaTable != null) {
            Vector vector = luaTable.list;
            if (vector.size() > 0) {
                this.ab = m4777b(vector, 0);
                if (this.as.isEmpty()) {
                    m4788l();
                }
                m4805a(vector);
            } else {
                return;
            }
        }
        super.setTable(f4536r, LuaNil.nil);
    }

    public final boolean m4836k() {
        return this.N != -1.0f ? false : this.f4549W;
    }

    protected final void m4837p() {
        switch (this.M) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.N >= 0.0f) {
                    this.ar.m2064f(O != -1 ? (int) ((((float) O) * this.N) / 100.0f) : (int) ((((float) KonyMain.getActContext().m4167p()) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4836k()) {
                    this.ar.m2064f(-2);
                } else {
                    this.ar.m2064f(-1);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.N >= 0.0f) {
                    int o = KonyMain.getActContext().m4166o();
                    this.ar.m2064f((int) ((((float) (this.I instanceof eO ? (int) (((eO) this.I).m4231m() * ((float) o)) : o)) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4836k()) {
                    this.ar.m2064f(-2);
                } else {
                    this.ar.m2064f(-1);
                }
            default:
        }
    }

    public void setEnabled(boolean z) {
    }

    public void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.ar.m2071o();
        }
    }

    public void setFontColor(Object[] objArr) {
    }

    public void setTable(Object obj, Object obj2) {
        Object obj3 = null;
        String intern = ((String) obj).intern();
        if (intern == f4536r) {
            obj3 = new ii(new bP(this, obj2));
            new Handler(Looper.getMainLooper()).post(obj3);
            obj3.m1406a();
        } else if (intern == f4517Q) {
            if (obj2 != LuaNil.nil) {
                r0 = (LuaTable) obj2;
            }
            m4825f(r0);
        } else if (intern == f4518R) {
            if (obj2 != LuaNil.nil) {
                r0 = (LuaTable) obj2;
            }
            m4821d(r0);
        } else if (intern == al) {
            m4789l((LuaTable) obj2);
        } else if (intern == f4514C) {
            if (obj2 != LuaNil.nil) {
                r0 = (LuaTable) obj2;
            }
            m4823e(r0);
        } else if (intern == f4516P) {
            if (obj2 != LuaNil.nil) {
                r0 = (LuaTable) obj2;
            }
            m4818c(r0);
        } else if (intern == f4515D) {
            if (obj2 == null || obj2 == LuaNil.nil) {
                this.aa = null;
            } else {
                this.aa = (LuaTable) obj2;
            }
        } else if (intern == f4519a) {
            if (obj2 != null && obj2 != LuaNil.nil) {
                m4773b((eO) obj2);
                m4795s();
            } else {
                return;
            }
        } else if (intern == f4520b) {
            if (obj2 != null && obj2 != LuaNil.nil) {
                m4780c((eO) obj2);
                m4795s();
            } else {
                return;
            }
        } else if (intern == f4521c) {
            if (!(obj2 == null || obj2 == LuaNil.nil)) {
                obj3 = obj2;
            }
            this.at = obj3;
        } else if (intern == f4535q) {
            boolean booleanValue = (obj2 == null || obj2 == LuaNil.nil) ? false : ((Boolean) obj2).booleanValue();
            this.ac = booleanValue;
        } else {
            if (intern == f4538t || intern == f4539u) {
                LuaNil table = super.getTable(f4537s);
                if (table == LuaNil.nil || !((Boolean) table).booleanValue()) {
                    return;
                }
            } else if (intern == f4512A) {
                if (!(obj2 == null || obj2 == LuaNil.nil)) {
                    m4817c(((Double) obj2).intValue());
                }
            } else if (!(intern != f4513B || obj2 == null || obj2 == LuaNil.nil)) {
                m4795s();
                m4829g((LuaTable) obj2);
            }
            super.setTable(intern, obj2);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(intern, obj2);
        }
    }

    public void setVisibility(boolean z) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.ar.e_(m3942a(z));
        }
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
    }

    public void setWeight() {
    }

    public String toString() {
        return "SegmentedUI2: " + super.getTable(ATTR_WIDGET_ID);
    }
}
