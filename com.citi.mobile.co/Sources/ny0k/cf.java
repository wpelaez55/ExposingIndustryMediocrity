package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0174B;
import com.konylabs.api.ui.cu;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eO;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Iterator;
import java.util.Vector;

public final class cf extends bL {
    private bA f4594a;
    private bi f4595b;

    public cf(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        super(luaTable, luaTable2, luaTable3, j);
    }

    private void m4971k(LuaTable luaTable) {
        this.f4594a.m3624d();
        if (luaTable == null) {
            this.f4595b = null;
            return;
        }
        if (this.f4595b == null) {
            this.f4595b = new bi();
        }
        this.f4594a.m3610a(this.f4595b);
        Iterator it = luaTable.list.iterator();
        while (it.hasNext()) {
            LuaTable luaTable2 = (LuaTable) it.next();
            try {
                this.f4594a.m3605a(new cu((String) luaTable2.list.elementAt(0), (String) luaTable2.list.elementAt(1), 0, luaTable2.list.elementAt(3)));
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d("LuaSegUITableView", BuildConfig.FLAVOR + e);
                }
                throw new LuaError("Invalid menu item arguments for Segment widget", 605);
            }
        }
    }

    final void m4972a(eO eOVar, int i, dB dBVar) {
        this.f4594a.m3604a((C0174B) eOVar.getWidget(), i, dBVar);
    }

    public final void m4973a(LuaTable luaTable, int i) {
        super.m4800a(luaTable, i);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4594a.m3627e(i, luaTable.list.size());
        }
    }

    public final void m4974a(LuaTable luaTable, Vector vector, int i, int i2) {
        super.m4921a(luaTable, vector, i, i2);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4594a.m3599a(i2);
        }
    }

    protected final void m4975a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            if (obj == n) {
                m4971k(obj2 != LuaNil.nil ? (LuaTable) obj2 : null);
            } else {
                super.m4804a(obj, obj2);
            }
        }
    }

    final void m4976a(String str, int i, String str2) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUITableView", "Enter setSectionTitle() - " + str);
        }
        this.f4594a.m3608a(str, i, str2);
    }

    public final void m4977a(Vector vector, int i, int i2) {
        super.m4924a(vector, i, i2);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4594a.m3599a(i2);
        }
    }

    protected final void m4978b() {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUITableView", "Enter createKonyWidget()");
        }
        this.f4594a = new bA(KonyMain.getActContext());
        m4926a(this.f4594a);
        LuaNil table = super.getTable(v);
        if (table != LuaNil.nil) {
            this.f4594a.m3619b(((Boolean) table).booleanValue());
        }
        table = super.getTable(n);
        if (table != LuaNil.nil) {
            m4971k((LuaTable) table);
        }
        super.m4927b();
    }

    public final void m4979b(int i) {
        super.m4928b(i);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4594a.m3614b(i);
        }
    }

    public final void m4980b(LuaTable luaTable) {
        super.m4813b(luaTable);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4594a.m3621c();
        }
    }

    public final void cleanup() {
        this.f4594a = null;
        super.cleanup();
    }

    public final void m4981j(LuaTable luaTable) {
        super.m4835j(luaTable);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4594a.m3621c();
        }
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4594a.m3629f(i);
            this.f4594a.m3613b();
        }
    }

    public final void setWidth(int i) {
    }
}
