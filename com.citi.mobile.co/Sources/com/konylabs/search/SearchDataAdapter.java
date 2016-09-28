package com.konylabs.search;

import android.app.SearchManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.hJ;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Vector;

public class SearchDataAdapter {
    private static SearchDataAdapter f1770a;
    private static final String[] f1771k;
    private Function f1772b;
    private Function f1773c;
    private Function f1774d;
    private Function f1775e;
    private SearchManager f1776f;
    private MatrixCursor f1777g;
    private String f1778h;
    private LuaWidget f1779i;
    private SortedMap f1780j;

    static {
        f1770a = null;
        String[] strArr = new String[]{"_id", "suggest_text_1", "suggest_intent_query"};
        f1771k = new String[]{"_id", "suggest_text_1", "suggest_text_2", "suggest_intent_query", "suggest_intent_extra_data"};
    }

    private SearchDataAdapter() {
        this.f1779i = null;
        this.f1780j = new TreeMap();
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            this.f1776f = (SearchManager) actContext.getSystemService("search");
            this.f1776f.setOnCancelListener(new C0236a(this));
        }
    }

    public static SearchDataAdapter getInstance() {
        if (f1770a == null) {
            f1770a = new SearchDataAdapter();
        }
        return f1770a;
    }

    public void cleanLuaWidget(LuaWidget luaWidget) {
        if (this.f1779i == luaWidget) {
            this.f1779i = null;
        }
    }

    public synchronized void clearBuffer() {
        this.f1780j.clear();
    }

    public synchronized Cursor getDataCursor(String str) {
        this.f1778h = str;
        this.f1777g = new MatrixCursor(f1771k);
        updateDataCursor();
        return this.f1777g;
    }

    public void raiseOnDismissCallback() {
        if (this.f1773c != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1773c;
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public void raiseOnDoneCallback(String str, String str2) {
        clearBuffer();
        if (this.f1774d != null) {
            Serializable serializable;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1774d;
            if (this.f1779i != null) {
                this.f1779i.setTable(hJ.f4296a, str);
            }
            Bundle bundle = new Bundle(4);
            bundle.putSerializable("key0", str.toString());
            String str3 = "key1";
            if (str2 == null) {
                serializable = BuildConfig.FLAVOR;
            }
            bundle.putSerializable(str3, serializable);
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public void raiseOnSelectCallback() {
        if (this.f1775e != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1775e;
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public void raiseOnTextChangeCallback(String str) {
        if (this.f1772b != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1772b;
            Bundle bundle = new Bundle(3);
            bundle.putSerializable("key0", str.toString());
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public synchronized void setData(LuaTable luaTable) {
        Vector vector = luaTable.list;
        for (int i = 0; i < vector.size(); i++) {
            LuaTable luaTable2 = (LuaTable) vector.get(i);
            String str = (String) luaTable2.list.get(0);
            String str2 = (String) luaTable2.list.get(1);
            Iterable arrayList = new ArrayList(5);
            arrayList.add(Integer.valueOf(0));
            arrayList.add(str);
            arrayList.add(str2);
            arrayList.add(str);
            arrayList.add(str2);
            if (!(this.f1777g == null || !str.startsWith(this.f1778h) || this.f1780j.containsKey(str + str2))) {
                arrayList.set(0, Integer.valueOf(this.f1777g.getCount()));
                this.f1777g.addRow(arrayList);
            }
            this.f1780j.put(str + str2, arrayList);
        }
    }

    public void setLuaWidget(LuaWidget luaWidget) {
        this.f1779i = luaWidget;
    }

    public void setOnDismissCallback(Function function) {
        this.f1773c = function;
    }

    public void setOnDoneCallback(Function function) {
        this.f1774d = function;
    }

    public void setOnSelectCallback(Function function) {
        this.f1775e = function;
    }

    public void setOnTextChangedCallback(Function function) {
        this.f1772b = function;
    }

    public synchronized void updateDataCursor() {
        int i = 0;
        synchronized (this) {
            for (String str : this.f1780j.keySet()) {
                int i2;
                if (str.startsWith(this.f1778h)) {
                    ArrayList arrayList = (ArrayList) this.f1780j.get(str);
                    arrayList.set(0, Integer.valueOf(i));
                    this.f1777g.addRow(arrayList);
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                i = i2;
            }
        }
    }
}
