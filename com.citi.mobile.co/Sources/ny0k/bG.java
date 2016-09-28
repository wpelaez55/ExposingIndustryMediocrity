package ny0k;

import android.util.Log;
import android.widget.BaseAdapter;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.eO;
import com.konylabs.api.ui.iq;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public abstract class bG extends bO {
    private static int al;
    public static int f4585d;
    protected static int f4586e;
    protected static int f4587f;
    protected static int f4588g;
    protected ArrayList f4589a;
    private BaseAdapter ak;
    private int am;
    private int an;
    private bH ao;
    protected ArrayList f4590b;
    protected cj f4591c;
    protected int f4592h;

    static {
        f4585d = 0;
        al = 1;
        f4586e = 1000;
        f4587f = 1001;
        f4588g = 1002;
    }

    public bG(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        super(luaTable, luaTable2, luaTable3, j);
        this.ak = null;
        this.f4589a = new ArrayList();
        this.f4590b = new ArrayList();
        this.f4592h = f4588g;
        this.am = 0;
        this.an = 1;
        this.Y = new Vector(1);
        this.f4591c = new cj(this.f4590b, this.Y);
        m4833i();
    }

    private int m4885a(Object obj) {
        int indexOf = this.f4589a.indexOf(obj);
        if (indexOf != -1) {
            return indexOf;
        }
        this.f4589a.add(obj);
        return this.f4589a.size() - 1;
    }

    private void m4886a(Vector vector, int i, int i2, bT bTVar) {
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
        int size2 = vector2.size();
        int i3 = i2 + 1;
        int i4 = 0;
        while (i4 < size) {
            int i5;
            LuaTable luaTable = (LuaTable) vector.elementAt(i4);
            if (luaTable.map.size() != 0) {
                Hashtable hashtable = luaTable.map;
                Object b = m4810b(hashtable);
                LuaTable a = bO.m4760a(hashtable, (eO) b);
                bH bHVar = new bH(this);
                bHVar.f2133b = i2;
                bHVar.f2134c = i;
                bHVar.f2135d = size2 + i4;
                bHVar.f2136e = m4885a(b);
                bI bIVar = new bI(this, b, luaTable, bHVar, m4831h(luaTable), a);
                bHVar.f2132a = bIVar;
                if (i2 == -1) {
                    this.f4590b.add(bHVar);
                    i5 = i3;
                } else {
                    this.f4590b.add(i3, bHVar);
                    i5 = i3 + 1;
                }
                vector2.add(bIVar);
            } else {
                i5 = i3;
            }
            i4++;
            i3 = i5;
        }
    }

    private void m4887a(bH bHVar, int i, int i2, int i3) {
        int b;
        Object obj = null;
        if (i3 == 0) {
            if (this.ab) {
                bHVar.f2133b = ((bJ) this.Y.get(i)).f3319a.f2133b;
            }
            b = this.f4591c.m2171b(i, i2);
            if (b >= 0 && b <= this.f4590b.size()) {
                this.f4590b.add(b, bHVar);
                b++;
            } else {
                return;
            }
        } else if (i3 == this.an) {
            b = this.f4591c.m2171b(i, i2);
            if (b >= 0 && b < this.f4590b.size() && this.f4590b.remove(b) != null) {
                obj = 1;
            }
            if (obj == null) {
                return;
            }
        } else {
            return;
        }
        int size = this.f4590b.size();
        for (int i4 = b; i4 < size; i4++) {
            bH bHVar2 = (bH) this.f4590b.get(i4);
            if (bHVar2.f2134c != i || bHVar2.f2135d < i2) {
                if (bHVar2.f2134c > i) {
                    if (i3 == 0) {
                        bHVar2.f2133b++;
                    } else if (i3 == this.an) {
                        bHVar2.f2133b--;
                    }
                }
            } else if (i3 == 0) {
                bHVar2.f2135d++;
            } else if (i3 == this.an) {
                bHVar2.f2135d--;
            }
        }
    }

    private void m4888c(int i, int i2) {
        int size = this.Y.size();
        while (i < size) {
            bJ bJVar = (bJ) this.Y.get(i);
            bH bHVar = bJVar.f3319a;
            bHVar.f2133b = i2;
            bHVar.f2134c = i;
            Vector vector = bJVar.g;
            int size2 = vector.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bH bHVar2 = ((bI) vector.get(i3)).f3317a;
                bHVar2.f2133b = i2;
                bHVar2.f2134c = i;
            }
            i2 += size2 + 1;
            i++;
        }
    }

    private void m4889h(int i) {
        e_();
        m4893a(i);
    }

    private void m4890l() {
        if (this.f4590b != null) {
            this.ao = null;
            ArrayList arrayList = this.f4590b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bH bHVar = (bH) arrayList.get(i);
                bHVar.f2137f = false;
                Object obj = bHVar.f2132a;
                if (obj instanceof bI) {
                    ci ciVar = ((bI) obj).f3318b;
                    if (ciVar != null) {
                        ciVar.f2279c = null;
                    }
                }
            }
        }
    }

    private void m4891m() {
        if (this.ah != null && !this.ah.isEmpty() && this.Y != null && !this.Y.isEmpty()) {
            HashMap hashMap = this.ah;
            Iterator it = hashMap.keySet().iterator();
            Integer num;
            bT bTVar;
            if (this.S == 1) {
                if (it.hasNext()) {
                    num = (Integer) it.next();
                    if (num.intValue() < this.Y.size()) {
                        Integer num2 = (Integer) hashMap.get(num);
                        if (num2 != null) {
                            bTVar = (bT) this.Y.get(num.intValue());
                            if (num2.intValue() < bTVar.f2147g.size()) {
                                bH bHVar = ((bI) bTVar.f2147g.get(num2.intValue())).f3317a;
                                bHVar.f2137f = true;
                                this.ao = bHVar;
                            }
                        }
                    }
                }
            } else if (this.S == 2) {
                Vector vector = this.Y;
                while (it.hasNext()) {
                    num = (Integer) it.next();
                    if (num.intValue() < vector.size()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(num);
                        if (arrayList != null) {
                            bTVar = (bT) vector.get(num.intValue());
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                Integer num3 = (Integer) arrayList.get(i);
                                if (num3.intValue() < bTVar.f2147g.size()) {
                                    ((bI) bTVar.f2147g.get(num3.intValue())).f3317a.f2137f = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void m4892n() {
        if (this.af != -1 && this.ag != -1 && this.Y != null && this.af < this.Y.size()) {
            bJ bJVar = (bJ) this.Y.get(this.af);
            if (this.ag < bJVar.g.size()) {
                bH bHVar = ((bI) bJVar.g.get(this.ag)).f3317a;
                bHVar.f2137f = true;
                this.ao = bHVar;
            }
        }
    }

    protected abstract void m4893a(int i);

    public final void m4894a(BaseAdapter baseAdapter) {
        this.ak = baseAdapter;
    }

    public final void m4895a(LuaTable luaTable, int i) {
        if (i >= 0) {
            bJ bJVar = null;
            int size = this.Y.size();
            int i2 = i < size ? i : size;
            size = this.f4590b.size();
            super.m4800a(luaTable, i);
            int abs = Math.abs(size - this.f4590b.size());
            int size2 = luaTable.list.size() + i;
            if (size2 < this.Y.size()) {
                bJ bJVar2 = (bJ) this.Y.get(size2 - 1);
                m4888c(size2, (bJVar2.g.size() + bJVar2.f3319a.f2133b) + 1);
                bJVar = bJVar2;
            }
            if (this.E == KONY_WIDGET_RESTORE) {
                size2 = f_();
                size = ((bH) this.f4590b.get(size2)).f2134c;
                if (bJVar != null) {
                    if (this.f4592h == f4586e) {
                        size2 = size >= i2 ? (abs - 1) + size2 : size2;
                    } else if (this.f4592h == f4587f) {
                        size2 = size >= i2 ? size2 + abs : size2 + 1;
                    } else if (size >= i2) {
                        size2 += abs;
                    }
                } else if (this.f4592h == f4587f) {
                    if (size > i2) {
                        size2 += abs;
                    } else if (size < i2) {
                        size2++;
                    }
                }
                m4889h(size2);
            }
        } else if (KonyMain.f3659g) {
            Log.d("LuaSegUI2", "Invalid sectionIndex: " + i + " to add section at");
        }
    }

    public final void m4896a(LuaTable luaTable, Vector vector, int i, int i2) {
        bH bHVar = new bH(this, i2, i);
        Hashtable hashtable = luaTable.map;
        Object b = m4810b(hashtable);
        if (b != this.X) {
            cr.m2212c(this, b);
        }
        LuaTable luaTable2 = luaTable;
        bI bIVar = new bI(this, b, luaTable2, bHVar, m4831h(luaTable), bO.m4760a(hashtable, (eO) b));
        bHVar.f2132a = bIVar;
        bHVar.f2136e = m4885a(b);
        if (i < vector.size()) {
            vector.add(i, bIVar);
        } else {
            vector.add(bIVar);
        }
        m4887a(bHVar, i2, i, 0);
        if (this.E == KONY_WIDGET_RESTORE) {
            int f_ = f_();
            if (this.f4592h == f4586e) {
                f_ = 0;
            } else if (f_ >= this.f4591c.m2171b(i2, i)) {
                f_++;
            }
            m4889h(f_);
        }
    }

    protected void m4897a(Object obj, Object obj2) {
        if (obj == P || obj == R || obj == C || obj == Q) {
            m4912e();
        }
        super.m4804a(obj, obj2);
        if (obj == k || obj == i || obj == j || obj == l || obj == p || obj == m) {
            m4889h(f_());
        } else if (obj == u || obj == t || obj == q) {
            m4912e();
        }
    }

    public final void m4898a(Vector vector) {
        super.m4805a(vector);
        if (this.E == KONY_WIDGET_RESTORE) {
            m4889h(0);
        }
    }

    protected void m4899a(Vector vector, int i) {
        int size = vector.size();
        this.Y.ensureCapacity(size);
        int size2 = this.Y.size();
        if (i == -1 || i >= size2) {
            i = size2;
        }
        if (this.Y == null || this.Y.isEmpty()) {
            size2 = 0;
        } else {
            size2 = this.Y.size();
            bJ bJVar;
            if (i >= size2) {
                bJVar = (bJ) this.Y.get(size2 - 1);
                size2 = bJVar.f3319a != null ? (bJVar.g.size() + bJVar.f3319a.f2133b) + 1 : 0;
            } else {
                bJVar = (bJ) this.Y.get(i);
                size2 = bJVar.f3319a != null ? bJVar.f3319a.f2133b : 0;
            }
        }
        int i2 = 0;
        int i3 = size2;
        while (i2 < size) {
            LuaTable luaTable = (LuaTable) vector.elementAt(i2);
            if (luaTable.list.size() != 0) {
                Object obj;
                bT bTVar;
                LuaNil luaNil = luaTable.list.get(0);
                if (luaNil != LuaNil.nil) {
                    bT bJVar2;
                    Object obj2;
                    Integer.valueOf(0);
                    bH bHVar = new bH(this);
                    if (luaNil instanceof String) {
                        String str = (String) luaNil;
                        LuaTable luaTable2 = null;
                        if (luaTable.list.size() > 2) {
                            obj = luaTable.list.get(2);
                            if (obj instanceof LuaTable) {
                                luaTable2 = (LuaTable) obj;
                            }
                        }
                        bJVar2 = new bJ(this, str, bHVar, 0, luaTable2);
                        obj2 = "title";
                    } else if (luaNil instanceof LuaTable) {
                        Hashtable hashtable = ((LuaTable) luaNil).map;
                        obj2 = m4797a(hashtable);
                        bJVar2 = new bJ(this, obj2, (LuaTable) luaNil, bHVar, al, bO.m4760a(hashtable, (eO) obj2));
                    } else {
                        bJVar2 = new bJ(this, " ", bHVar, 0, null);
                        obj2 = "title";
                    }
                    bHVar.f2133b = i3;
                    bHVar.f2134c = i;
                    bHVar.f2132a = bJVar2;
                    bHVar.f2136e = m4885a(obj2);
                    this.f4590b.add(i3, bHVar);
                    bTVar = bJVar2;
                } else {
                    bTVar = new bJ(this);
                }
                obj = luaTable.list.get(1);
                if (obj != null) {
                    m4886a(((LuaTable) obj).list, i, i3, bTVar);
                    size2 = (bTVar.g.size() + 1) + i3;
                } else {
                    size2 = i3;
                }
                this.Y.add(i, bTVar);
            } else {
                size2 = i3;
            }
            i++;
            i2++;
            i3 = size2;
        }
    }

    public final void m4900a(Vector vector, int i, int i2) {
        LuaWidget luaWidget = ((bI) vector.elementAt(i)).c;
        if (!(luaWidget == null || luaWidget == this.X)) {
            cr.m2209b((LuaWidget) this, luaWidget);
            if (this.ai != null) {
                this.ai.remove(luaWidget);
            }
        }
        int b = this.f4591c.m2171b(i2, i);
        m4887a(null, i2, i, this.an);
        vector.removeElementAt(i);
        if (this.E == KONY_WIDGET_RESTORE) {
            int f_ = f_();
            if (this.f4592h == f4586e) {
                f_ = 0;
            } else if ((this.f4592h == f4588g || this.f4592h == f4587f) && f_ >= b) {
                f_--;
            }
            m4889h(f_);
        }
    }

    protected final void m4901a(bS bSVar, LuaTable luaTable) {
        if (this.E == KONY_WIDGET_RESTORE) {
            m4912e();
        }
    }

    public final boolean m4902a(int i, int i2) {
        if (this.S == 1) {
            bH bHVar = ((bI) ((bT) this.Y.get(i)).f2147g.get(i2)).f3317a;
            if (!bHVar.f2137f) {
                if (this.ao != null) {
                    this.ao.f2137f = false;
                }
                bHVar.f2137f = true;
            }
            this.ao = bHVar;
            return true;
        } else if (this.S != 2) {
            return true;
        } else {
            bH bHVar2 = ((bI) ((bT) this.Y.get(i)).f2147g.get(i2)).f3317a;
            boolean z = !bHVar2.f2137f;
            bHVar2.f2137f = z;
            return z;
        }
    }

    public final void m4903b(int i) {
        if (this.Y != null && i >= 0 && i < this.Y.size()) {
            int size = ((bT) this.Y.get(i)).f2147g.size();
            if (size > 0) {
                bH bHVar = ((bI) ((bT) this.Y.get(i)).f2147g.get(size - 1)).f3317a;
                size = this.f4591c.m2171b(bHVar.f2134c, bHVar.f2135d);
            } else {
                size = -1;
            }
            super.m4812b(i);
            ArrayList arrayList = null;
            bJ bJVar = (bJ) this.Y.remove(i);
            eO eOVar = bJVar.d;
            if (!(eOVar == null || eOVar == this.Z)) {
                arrayList = new ArrayList();
                arrayList.add(eOVar);
                if (this.ai != null) {
                    this.ai.remove(eOVar);
                }
            }
            int i2 = bJVar.f3319a.f2133b;
            if (size == -1) {
                size = i2;
            }
            this.f4590b.remove(bJVar.f3319a);
            int size2 = bJVar.g.size();
            Vector vector = bJVar.g;
            ArrayList arrayList2 = arrayList;
            int i3 = 0;
            while (i3 < size2) {
                ArrayList arrayList3;
                bI bIVar = (bI) vector.get(i3);
                this.f4590b.remove(bIVar.f3317a);
                eO eOVar2 = bIVar.c;
                if (eOVar2 == null || eOVar2 == this.X) {
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList3.add(eOVar2);
                    if (this.ai != null) {
                        this.ai.remove(eOVar2);
                    }
                }
                i3++;
                arrayList2 = arrayList3;
            }
            if (arrayList2 != null) {
                cr.m2206a((LuaWidget) this, arrayList2);
            }
            m4888c(i, i2);
            if (this.E == KONY_WIDGET_RESTORE) {
                int f_ = f_();
                if (this.f4592h == f4586e) {
                    f_ = 0;
                } else if ((this.f4592h == f4588g || this.f4592h == f4587f) && f_ >= r1) {
                    f_ -= size2;
                }
                m4889h(f_);
            }
        }
    }

    public final void m4904b(LuaTable luaTable) {
        super.m4813b(luaTable);
        if (this.E == KONY_WIDGET_RESTORE) {
            int f_ = f_();
            if (this.f4592h == f4586e) {
                f_ = 0;
            } else if (this.f4592h == f4587f) {
                f_++;
            }
            m4889h(f_);
        }
    }

    public void m4905b(Vector vector) {
        int i;
        bT bJVar;
        int size = this.Y.size();
        if (size == 0) {
            i = 0;
            bJVar = new bJ(this);
            this.Y.add(bJVar);
        } else {
            i = size - 1;
            bJ bJVar2 = (bJ) this.Y.elementAt(i);
        }
        m4886a(vector, i, -1, bJVar);
    }

    public final boolean m4906b(int i, int i2) {
        return ((bI) ((bT) this.Y.get(i)).f2147g.get(i2)).f3317a.f2137f;
    }

    protected final void m4907c(int i) {
        if (this.S != i) {
            m4890l();
        }
        super.m4817c(i);
    }

    protected final void m4908c(LuaTable luaTable) {
        super.m4818c(luaTable);
        m4890l();
        m4891m();
    }

    public void cleanup() {
        super.cleanup();
        if (this.S == 1 || this.S == 2) {
            m4890l();
            this.V = null;
        }
        this.ak = null;
    }

    protected void m4909d() {
        if ((this.Y != null ? this.Y.size() : 0) == 0) {
            LuaNil table = super.getTable(r);
            if (!(table == LuaNil.nil || table == null)) {
                m4835j((LuaTable) table);
            }
        } else {
            e_();
        }
        if (this.S == 1 || this.S == 2) {
            m4891m();
        }
    }

    protected final void m4910d(LuaTable luaTable) {
        super.m4821d(luaTable);
        m4890l();
        if (this.S == 1) {
            m4892n();
        } else {
            m4891m();
        }
    }

    protected final bH m4911e(int i) {
        if (this.ab) {
            i = this.f4591c.m2169a(i, this.ab);
        }
        return (this.f4590b == null || i >= this.f4590b.size()) ? null : (bH) this.f4590b.get(i);
    }

    protected void m4912e() {
        if (this.ak != null) {
            this.ak.notifyDataSetChanged();
        }
    }

    protected final void m4913e(LuaTable luaTable) {
        super.m4823e(luaTable);
        m4890l();
        m4891m();
    }

    protected abstract void e_();

    public void m4914f() {
        if (this.f4590b != null) {
            this.f4590b.clear();
        }
        if (this.f4589a != null) {
            this.f4589a.clear();
        }
        super.m4824f();
        if (this.E == KONY_WIDGET_RESTORE) {
            m4912e();
        }
    }

    protected final void m4915f(LuaTable luaTable) {
        super.m4825f(luaTable);
        m4890l();
        if (this.S == 1) {
            m4892n();
        } else {
            m4891m();
        }
    }

    protected abstract int f_();

    protected final iq m4916g() {
        return new bK(this);
    }

    protected final void m4917g(LuaTable luaTable) {
        super.m4829g(luaTable);
        m4890l();
    }

    protected final bT m4918h() {
        return new bJ(this);
    }

    public void handleOrientationChange(int i) {
        super.handleOrientationChange(i);
        m4889h(f_());
    }
}
