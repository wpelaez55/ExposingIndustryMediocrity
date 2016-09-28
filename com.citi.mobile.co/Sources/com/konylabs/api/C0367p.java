package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Stack;

/* renamed from: com.konylabs.api.p */
public final class C0367p implements Library {
    private static String[] f2434a;
    private Stack f2435b;

    static {
        f2434a = new String[]{"parse"};
    }

    public C0367p() {
        this.f2435b = new Stack();
    }

    private LuaTable m2354a(C0171q c0171q) {
        LuaTable luaTable = new LuaTable();
        this.f2435b.push("{");
        if (c0171q.m102c() != '{') {
            throw new LuaError("Not a valid JSON String: should start with either { ", 999);
        }
        if (c0171q.m102c() == '}') {
            if (c0171q.m101b() && c0171q.m102c() != ',') {
                c0171q.m100a();
            }
            this.f2435b.pop();
        } else {
            c0171q.m100a();
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String b = C0367p.m2357b(c0171q.m99a(":"));
                c0171q.m102c();
                char c = c0171q.m102c();
                if (c == '\u0000') {
                    break;
                } else if (c == '{') {
                    c0171q.m100a();
                    luaTable.setTable(b, m2354a(c0171q));
                    if (m2358c(c0171q)) {
                        break;
                    }
                    c0171q.m100a();
                } else if (c == '[') {
                    c0171q.m100a();
                    luaTable.setTable(b, m2356b(c0171q));
                    if (m2358c(c0171q)) {
                        break;
                    }
                    c0171q.m100a();
                } else {
                    c0171q.m100a();
                    Object a = m2355a(c0171q.m99a(",}"));
                    if (a != null) {
                        luaTable.setTable(b, a);
                    } else {
                        luaTable.setTable(b, BuildConfig.FLAVOR);
                    }
                    if (m2358c(c0171q)) {
                        break;
                    }
                }
            }
        }
        return luaTable;
    }

    private Object m2355a(String str) {
        String trim = str.trim();
        if (trim.equals(BuildConfig.FLAVOR)) {
            return null;
        }
        if (trim.equals("true")) {
            return Boolean.TRUE;
        }
        if (trim.equals("false")) {
            return Boolean.FALSE;
        }
        if (trim.equals("nil")) {
            return LuaNil.nil;
        }
        try {
            return (trim.charAt(0) == '\"' && trim.charAt(trim.length() - 1) == '\"') ? C0367p.m2357b(trim) : new Double(Double.parseDouble(trim));
        } catch (NumberFormatException e) {
            if (KonyMain.f3657e) {
                Log.d("JSONLib", "JSONLib-getLuaObject :" + e.getMessage());
            }
            return C0367p.m2357b(trim);
        }
    }

    private LuaTable m2356b(C0171q c0171q) {
        LuaTable luaTable = new LuaTable();
        this.f2435b.push("[");
        if (c0171q.m102c() != '[') {
            throw new LuaError("Not a valid JSON String: should start with either [ ", 999);
        }
        if (c0171q.m102c() == ']') {
            if (c0171q.m101b() && c0171q.m102c() != ',') {
                c0171q.m100a();
            }
            this.f2435b.pop();
        } else {
            c0171q.m100a();
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                char c = c0171q.m102c();
                if (c == '\u0000') {
                    break;
                } else if (c == '{') {
                    c0171q.m100a();
                    luaTable.list.addElement(m2354a(c0171q));
                    if (m2359d(c0171q)) {
                        break;
                    }
                    c0171q.m100a();
                } else if (c == '[') {
                    c0171q.m100a();
                    luaTable.list.addElement(m2356b(c0171q));
                    if (m2359d(c0171q)) {
                        break;
                    }
                    c0171q.m100a();
                } else {
                    c0171q.m100a();
                    Object a = m2355a(c0171q.m99a(",]"));
                    if (a != null) {
                        luaTable.list.addElement(a);
                    }
                    if (m2359d(c0171q)) {
                        break;
                    }
                }
            }
        }
        return luaTable;
    }

    private static String m2357b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') {
            return str;
        }
        char[] toCharArray = str.toCharArray();
        for (int i = 1; i < toCharArray.length - 1; i++) {
            stringBuffer.append(toCharArray[i]);
        }
        return stringBuffer.toString();
    }

    private boolean m2358c(C0171q c0171q) {
        if (c0171q.m102c() != '}') {
            return false;
        }
        this.f2435b.pop();
        if (c0171q.m101b() && c0171q.m102c() != ',') {
            c0171q.m100a();
        }
        return true;
    }

    private boolean m2359d(C0171q c0171q) {
        if (c0171q.m102c() != ']') {
            return false;
        }
        this.f2435b.pop();
        if (c0171q.m101b() && c0171q.m102c() != ',') {
            c0171q.m100a();
        }
        return true;
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                C0171q c0171q = new C0171q((String) objArr[0]);
                LuaTable luaTable = new LuaTable();
                switch (c0171q.m102c()) {
                    case '[':
                        c0171q.m100a();
                        luaTable = m2356b(c0171q);
                        break;
                    case '{':
                        c0171q.m100a();
                        luaTable = m2354a(c0171q);
                        break;
                    default:
                        throw new LuaError("Not a JSON valid String for json.parse(): should start with either { or [", 999);
                }
                return new Object[]{luaTable};
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f2434a;
    }

    public final String getNameSpace() {
        return "json";
    }
}
