package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Datagrid {
    private static Library f1705a;
    private static HashMap f1706b;

    private Datagrid() {
    }

    static void m1625a() {
        if (f1705a == null) {
            Library e = C0349R.m2286e();
            f1705a = e;
            f1706b = cr.m2202a(e);
        }
    }

    public static void addAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "Executing DataGrid.addAll()");
        }
        f1705a.execute(((Integer) f1706b.get("addall")).intValue(), objArr);
    }

    public static void addAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "DataGrid.addAt()");
        }
        f1705a.execute(((Integer) f1706b.get("addat")).intValue(), objArr);
    }

    public static void applyCellSkin(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "DataGrid.applyCellSkin()");
        }
        f1705a.execute(((Integer) f1706b.get("applycellskin")).intValue(), objArr);
    }

    public static void removeAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "Executing DataGrid.removeAll()");
        }
        f1705a.execute(((Integer) f1706b.get("removeall")).intValue(), objArr);
    }

    public static void removeAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "Executing DataGrid.addAll()");
        }
        f1705a.execute(((Integer) f1706b.get("removeat")).intValue(), objArr);
    }

    public static void selectAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "DataGrid.selectAll()");
        }
        f1705a.execute(((Integer) f1706b.get("selectall")).intValue(), objArr);
    }

    public static void setCellData(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "DataGrid.setcelldata()");
        }
        f1705a.execute(((Integer) f1706b.get("setcelldata")).intValue(), objArr);
    }

    public static void setData(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "DataGrid.removeAt()");
        }
        f1705a.execute(((Integer) f1706b.get("setdata")).intValue(), objArr);
    }

    public static void setDataAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("DataGridNative", "DataGrid.setDataAt()");
        }
        f1705a.execute(((Integer) f1706b.get("setdataat")).intValue(), objArr);
    }
}
