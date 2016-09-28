package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eO;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public abstract class bL extends bO {
    private bf f4593a;

    public bL(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        super(luaTable, luaTable2, luaTable3, j);
        this.Y = new Vector(1);
    }

    private void m4919a(Vector vector, int i, bT bTVar) {
        Vector vector2;
        int size = vector.size();
        Vector vector3 = bTVar.f2147g;
        if (vector3 == null) {
            vector3 = new Vector(size);
            bTVar.f2147g = vector3;
            vector2 = vector3;
        } else {
            vector2 = vector3;
        }
        for (int i2 = 0; i2 < size; i2++) {
            LuaTable luaTable = (LuaTable) vector.elementAt(i2);
            if (luaTable.map.size() != 0) {
                Hashtable hashtable = luaTable.map;
                eO b = m4810b(hashtable);
                LuaTable a = bO.m4760a(hashtable, b);
                eO eOVar = null;
                if (this.E == KONY_WIDGET_RESTORE) {
                    eO eOVar2 = (eO) b.createClone();
                    eOVar2.setTable(ATTR_WIDGET_PADDING, super.getTable(ATTR_WIDGET_PADDING));
                    eOVar2.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, super.getTable(ATTR_WIDGET_PADDING_IN_PIXEL));
                    eOVar2.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, a);
                    m4799a(eOVar2, luaTable.map);
                    this.f4593a.m2047a(eOVar2.getWidget(), i, m4831h(luaTable));
                    eOVar = eOVar2;
                }
                vector2.add(new bM(this, b, eOVar, luaTable, a));
            }
        }
    }

    abstract void m4920a(eO eOVar, int i, dB dBVar);

    public void m4921a(LuaTable luaTable, Vector vector, int i, int i2) {
        Hashtable hashtable = luaTable.map;
        LuaWidget b = m4810b(hashtable);
        if (b != this.X) {
            cr.m2212c(this, b);
        }
        LuaTable a = bO.m4760a(hashtable, (eO) b);
        eO eOVar = null;
        if (this.E == KONY_WIDGET_RESTORE) {
            eO eOVar2 = (eO) b.createClone();
            eOVar2.setTable(ATTR_WIDGET_PADDING, super.getTable(ATTR_WIDGET_PADDING));
            eOVar2.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, super.getTable(ATTR_WIDGET_PADDING_IN_PIXEL));
            eOVar2.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, a);
            m4799a(eOVar2, luaTable.map);
            eOVar = eOVar2;
        }
        if (i < vector.size()) {
            vector.add(i, new bM(this, b, eOVar, luaTable, a));
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f4593a.m2046a(eOVar.getWidget(), i, i2, m4831h(luaTable));
                return;
            }
            return;
        }
        vector.add(new bM(this, b, eOVar, luaTable, a));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4593a.m2047a(eOVar.getWidget(), i2, m4831h(luaTable));
        }
    }

    abstract void m4922a(String str, int i, String str2);

    protected final void m4923a(Vector vector, int i) {
        int size = vector.size();
        this.Y.ensureCapacity(size);
        int size2 = this.Y.size();
        if (i == -1 || i >= size2) {
            i = size2;
        }
        for (int i2 = 0; i2 < size; i2++) {
            LuaTable luaTable = (LuaTable) vector.elementAt(i2);
            if (luaTable.list.size() != 0) {
                Object obj;
                bT bTVar;
                LuaNil luaNil = luaTable.list.get(0);
                if (luaNil != LuaNil.nil) {
                    if (luaNil instanceof String) {
                        LuaTable luaTable2;
                        bT bNVar;
                        String obj2 = luaNil.toString();
                        String str = obj2.equals(BuildConfig.FLAVOR) ? null : obj2;
                        if (KonyMain.f3657e) {
                            Log.d("LuaNonAdapterSegUI", "Section header is = " + str);
                        }
                        if (luaTable.list.size() > 2) {
                            obj = luaTable.list.get(2);
                            if (obj instanceof LuaTable) {
                                luaTable2 = (LuaTable) obj;
                                bNVar = new bN(this, str, luaTable2);
                                if (this.E == KONY_WIDGET_RESTORE && str != null) {
                                    m4922a(str, i, m3944a(luaTable2, str));
                                }
                                bTVar = bNVar;
                            }
                        }
                        luaTable2 = null;
                        bNVar = new bN(this, str, luaTable2);
                        m4922a(str, i, m3944a(luaTable2, str));
                        bTVar = bNVar;
                    } else if (luaNil instanceof LuaTable) {
                        eO eOVar;
                        Hashtable hashtable = ((LuaTable) luaNil).map;
                        eO a = m4797a(hashtable);
                        LuaTable a2 = bO.m4760a(hashtable, a);
                        if (this.E != KONY_WIDGET_RESTORE || a == null) {
                            eOVar = null;
                        } else {
                            eO eOVar2 = (eO) a.createClone();
                            eOVar2.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, a2);
                            m4799a(eOVar2, ((LuaTable) luaNil).map);
                            m4920a(eOVar2, i, m4832i((LuaTable) luaNil));
                            eOVar = eOVar2;
                        }
                        bTVar = new bN(this, a, eOVar, (LuaTable) luaNil, a2);
                    }
                    obj = luaTable.list.get(1);
                    if (obj != null) {
                        m4919a(((LuaTable) obj).list, i, bTVar);
                    }
                    this.Y.add(i, bTVar);
                }
                bTVar = null;
                obj = luaTable.list.get(1);
                if (obj != null) {
                    m4919a(((LuaTable) obj).list, i, bTVar);
                }
                this.Y.add(i, bTVar);
            }
            i++;
        }
    }

    public void m4924a(Vector vector, int i, int i2) {
        bM bMVar = (bM) vector.elementAt(i);
        ArrayList arrayList = null;
        eO eOVar = bMVar.c;
        if (!(eOVar == null || eOVar == this.X)) {
            arrayList = new ArrayList(1);
            arrayList.add(eOVar);
            if (this.ai != null) {
                this.ai.remove(eOVar);
            }
        }
        eO eOVar2 = bMVar.f3321a;
        if (eOVar2 != null) {
            eOVar2.cleanup();
            if (eOVar2.isJsObjectCloneCreated()) {
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                }
                arrayList.add(eOVar2);
            }
        }
        if (arrayList != null) {
            cr.m2206a((LuaWidget) this, arrayList);
        }
        vector.removeElementAt(i);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4593a.m2045a(i, i2);
        }
    }

    protected final void m4925a(bS bSVar, LuaTable luaTable) {
        if (this.aa == null || this.aa.map.size() == 0) {
            throw new LuaError(D + " is not set for the Segment widget " + toString(), 9999);
        } else if (this.E == KONY_WIDGET_RESTORE) {
            eO eOVar = ((bM) bSVar).f3321a;
            eOVar.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, bO.m4760a(luaTable.map, eOVar));
            m4799a(eOVar, luaTable.map);
        }
    }

    public final void m4926a(bf bfVar) {
        this.f4593a = bfVar;
    }

    protected void m4927b() {
        if (KonyMain.f3657e) {
            Log.d("LuaNonAdapterSegUI", "Enter createKonyWidget()");
        }
        m4809a((bg) this.f4593a);
        super.m4811b();
    }

    public void m4928b(int i) {
        if (this.Y != null && i >= 0 && i < this.Y.size()) {
            ArrayList arrayList;
            ArrayList arrayList2;
            super.m4812b(i);
            bN bNVar = (bN) this.Y.get(i);
            eO eOVar = bNVar.d;
            if (eOVar == null || eOVar == this.Z) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                arrayList.add(eOVar);
                if (this.ai != null) {
                    this.ai.remove(eOVar);
                }
            }
            eOVar = bNVar.f3322a;
            if (eOVar != null) {
                eOVar.cleanup();
                if (eOVar.isJsObjectCloneCreated()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(eOVar);
                }
                bNVar.f3322a = null;
            }
            Vector vector = bNVar.g;
            if (vector != null) {
                int size = vector.size();
                arrayList2 = arrayList;
                for (int i2 = 0; i2 < size; i2++) {
                    bM bMVar = (bM) vector.get(i2);
                    eO eOVar2 = bMVar.c;
                    if (!(eOVar2 == null || eOVar2 == this.X)) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(eOVar2);
                        if (this.ai != null) {
                            this.ai.remove(eOVar2);
                        }
                    }
                    eO eOVar3 = bMVar.f3321a;
                    if (eOVar3 != null) {
                        eOVar3.cleanup();
                        if (eOVar3.isJsObjectCloneCreated()) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(eOVar3);
                        }
                    }
                }
                bNVar.g = null;
            } else {
                arrayList2 = arrayList;
            }
            this.Y.remove(i);
            if (arrayList2 != null) {
                cr.m2206a((LuaWidget) this, arrayList2);
            }
        }
    }

    protected final void m4929b(Vector vector) {
        int i;
        bT bNVar;
        int size = this.Y.size();
        if (size == 0) {
            i = 0;
            bNVar = new bN(this);
            this.Y.add(bNVar);
        } else {
            i = size - 1;
            bN bNVar2 = (bN) this.Y.elementAt(i);
        }
        m4919a(vector, i, bNVar);
    }

    protected final void m4930c() {
        if (this.Y != null) {
            int size = this.Y.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                bN bNVar = (bN) this.Y.elementAt(i);
                if (bNVar != null) {
                    eO eOVar = bNVar.f3322a;
                    if (eOVar != null) {
                        eOVar.cleanup();
                        if (eOVar.isJsObjectCloneCreated()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(eOVar);
                        }
                        bNVar.f3322a = null;
                    }
                    Vector vector = bNVar.g;
                    if (vector != null) {
                        int size2 = vector.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            bM bMVar = (bM) vector.elementAt(i2);
                            eO eOVar2 = bMVar.f3321a;
                            if (eOVar2 != null) {
                                eOVar2.cleanup();
                                if (eOVar2.isJsObjectCloneCreated()) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(eOVar2);
                                }
                            }
                            bMVar.f3321a = null;
                        }
                    }
                }
            }
            if (arrayList != null) {
                cr.m2206a((LuaWidget) this, arrayList);
            }
        }
    }

    public void cleanup() {
        this.f4593a = null;
        super.cleanup();
    }

    protected final void m4931d() {
        if (KonyMain.f3657e) {
            Log.d("LuaNonAdapterSegUI", "Enter populateData()");
        }
        if (this.aa == null || this.aa.map.size() == 0) {
            throw new LuaError(D + " is not set for the Segment widget " + toString(), 9999);
        }
        int size = this.Y != null ? this.Y.size() : 0;
        if (size == 0) {
            LuaNil table = super.getTable(r);
            if (table != LuaNil.nil && table != null) {
                m4835j((LuaTable) table);
                return;
            }
            return;
        }
        for (int i = 0; i < size; i++) {
            eO eOVar;
            bN bNVar = (bN) this.Y.elementAt(i);
            String str = bNVar.c;
            if (str != null) {
                m4922a(str, i, m3944a(bNVar.f, bNVar.c));
            } else if (bNVar.e != null) {
                Hashtable hashtable = bNVar.e.map;
                eOVar = bNVar.f3322a;
                if (eOVar == null && bNVar.d != null) {
                    eOVar = (eO) bNVar.d.createClone();
                    bNVar.f3322a = eOVar;
                }
                if (eOVar != null) {
                    eOVar.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, bNVar.f);
                    m4799a(eOVar, hashtable);
                    m4920a(eOVar, i, m4832i(bNVar.e));
                }
            }
            Vector vector = bNVar.g;
            int size2 = vector.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bM bMVar = (bM) vector.elementAt(i2);
                LuaTable luaTable = bMVar.d;
                eOVar = bMVar.f3321a;
                if (eOVar == null) {
                    eOVar = (eO) bMVar.c.createClone();
                    eOVar.setTable(ATTR_WIDGET_PADDING, super.getTable(ATTR_WIDGET_PADDING));
                    eOVar.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, super.getTable(ATTR_WIDGET_PADDING_IN_PIXEL));
                    bMVar.f3321a = eOVar;
                }
                eOVar.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, bMVar.e);
                m4799a(eOVar, luaTable.map);
                this.f4593a.m2047a(eOVar.getWidget(), i, m4831h(luaTable));
            }
        }
    }

    public final void m4932f() {
        if (KonyMain.f3657e) {
            Log.d("LuaNonAdapterSegUI", "Enter removeAll()");
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4593a.m2044a();
        }
        super.m4824f();
    }

    protected final bT m4933h() {
        return new bN(this);
    }

    public void handleOrientationChange(int i) {
        int size = this.Y.size();
        for (int i2 = 0; i2 < size; i2++) {
            bN bNVar = (bN) this.Y.elementAt(i2);
            if (bNVar != null) {
                eO eOVar = bNVar.f3322a;
                if (eOVar != null) {
                    eOVar.handleOrientationChange(i);
                }
                Vector vector = bNVar.g;
                if (vector != null) {
                    int size2 = vector.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        eO eOVar2 = ((bM) vector.elementAt(i3)).f3321a;
                        if (eOVar2 != null) {
                            eOVar2.handleOrientationChange(i);
                        }
                    }
                }
            }
        }
        super.handleOrientationChange(i);
    }
}
