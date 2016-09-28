package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.konylabs.vm.TableEnumeration;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class TableLib implements Library {
    private static String[] f2398a;

    static {
        LuaTable luaTable = new LuaTable(0, 10);
        f2398a = new String[]{"insert", "remove", "sort", "concat", "append", "contains", "get", "map", "mapnew", "filter", "removeall"};
    }

    private static Object[] m2301a(Object[] objArr) {
        String str = BuildConfig.FLAVOR;
        try {
            Double d;
            Double d2;
            LuaTable luaTable;
            LuaTable luaTable2;
            LuaTable luaTable3;
            if (objArr.length == 4) {
                luaTable2 = (LuaTable) objArr[0];
                if (objArr[1] instanceof String) {
                    str = (String) objArr[1];
                } else if (objArr[1] instanceof Double) {
                    str = BuildConfig.FLAVOR + ((Double) objArr[1]).intValue();
                }
                luaTable3 = luaTable2;
                d = (Double) objArr[2];
                d2 = (Double) objArr[3];
                luaTable = luaTable3;
            } else if (objArr.length == 3) {
                luaTable2 = (LuaTable) objArr[0];
                if (objArr[1] instanceof String) {
                    str = (String) objArr[1];
                } else if (objArr[1] instanceof Double) {
                    str = BuildConfig.FLAVOR + ((Double) objArr[1]).intValue();
                }
                luaTable3 = luaTable2;
                d = (Double) objArr[2];
                d2 = new Double((double) luaTable2.size());
                luaTable = luaTable3;
            } else if (objArr.length == 2) {
                luaTable2 = (LuaTable) objArr[0];
                if (objArr[1] instanceof String) {
                    str = (String) objArr[1];
                } else if (objArr[1] instanceof Double) {
                    str = BuildConfig.FLAVOR + ((Double) objArr[1]).intValue();
                }
                luaTable3 = luaTable2;
                d = new Double(1.0d);
                d2 = new Double((double) luaTable2.size());
                luaTable = luaTable3;
            } else if (objArr.length == 1) {
                luaTable2 = (LuaTable) objArr[0];
                str = BuildConfig.FLAVOR;
                luaTable3 = luaTable2;
                d = new Double(1.0d);
                d2 = new Double((double) luaTable2.size());
                luaTable = luaTable3;
            } else {
                throw new LuaError("Table.concat", 201);
            }
            StringBuffer stringBuffer = new StringBuffer(BuildConfig.FLAVOR);
            str = str.toString();
            int doubleValue = (int) d.doubleValue();
            int doubleValue2 = (int) d2.doubleValue();
            if (doubleValue2 < doubleValue) {
                return new Object[]{BuildConfig.FLAVOR};
            }
            if (doubleValue > 0 && doubleValue2 > 0) {
                if (doubleValue2 <= luaTable.size()) {
                    for (int i = doubleValue; i <= doubleValue2; i++) {
                        if (i > luaTable.list.size()) {
                            break;
                        }
                        LuaNil elementAt = luaTable.list.elementAt(i - 1);
                        if (elementAt == LuaNil.nil || elementAt == null || (elementAt instanceof LuaTable)) {
                            return new Object[]{LuaNil.nil, new Double(100.0d)};
                        }
                        if (elementAt instanceof Double) {
                            d = (Double) elementAt;
                            long doubleValue3 = (long) d.doubleValue();
                            double doubleValue4 = d.doubleValue();
                            if (((double) doubleValue3) == doubleValue4) {
                                stringBuffer.append(doubleValue3);
                            } else {
                                stringBuffer.append(doubleValue4);
                            }
                        } else {
                            stringBuffer.append(elementAt);
                        }
                        stringBuffer.append(str);
                    }
                    doubleValue = stringBuffer.length();
                    if (doubleValue <= 0) {
                        return new Object[0];
                    }
                    stringBuffer.delete(doubleValue - str.length(), doubleValue);
                    return new Object[]{stringBuffer.toString()};
                }
            }
            return new Object[]{LuaNil.nil, new Double(100.0d)};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib concat: ", e);
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", BuildConfig.FLAVOR + e.getMessage());
            }
            throw new LuaError("Table.concat", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib concat: ", e2);
            }
            throw new LuaError("Table.concat", 203);
        }
    }

    private static Object[] m2302a(Object[] objArr, boolean z) {
        if (objArr == null || objArr.length < 2 || objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil) {
            return new Object[0];
        }
        LuaTable luaTable = new LuaTable();
        try {
            LuaTable luaTable2 = (LuaTable) objArr[0];
            Object obj = objArr[1];
            int size = luaTable2.size();
            int hashSize = luaTable2.hashSize();
            if (KonyMain.f3657e) {
                Log.d("TableLib", "append() Input callBack = " + obj + " isMapNew = " + z + " Dest Table sizes = " + luaTable2.size() + " " + luaTable2.hashSize());
            }
            if (size > 0 || hashSize > 0) {
                TableEnumeration tableEnumeration = luaTable2.enumeration;
                while (tableEnumeration.hasMoreElements()) {
                    Object nextElement = tableEnumeration.nextElement();
                    LuaNil table = luaTable2.getTable(nextElement);
                    if (!(table instanceof LuaTable) && table != LuaNil.nil) {
                        Object obj2 = nextElement instanceof String ? 1 : null;
                        Object[] execute = ((Function) obj).execute(new Object[]{nextElement, table});
                        if (execute != null && execute.length >= 2) {
                            if (KonyMain.f3657e) {
                                Log.d("TableLib", "append() callBack return Key = " + execute[0] + " Value = " + execute[1]);
                            }
                            if (size <= 0 || obj2 != null) {
                                luaTable.setTable(execute[0], execute[1]);
                            } else {
                                luaTable.add(execute[1]);
                            }
                        } else if (z) {
                            return new Object[]{LuaNil.nil, new Double(100.0d)};
                        } else {
                            return new Object[]{new Double(100.0d)};
                        }
                    } else if (z) {
                        return new Object[]{LuaNil.nil, new Double(100.0d)};
                    } else {
                        return new Object[]{new Double(100.0d)};
                    }
                }
                if (!z) {
                    TableEnumeration tableEnumeration2 = luaTable.enumeration;
                    while (tableEnumeration2.hasMoreElements()) {
                        obj = tableEnumeration2.nextElement();
                        luaTable2.setTable(obj, luaTable.getTable(obj));
                    }
                }
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", "append() Input Source Table sizes = " + luaTable2.size() + " " + luaTable2.hashSize() + " retTable sizes = " + luaTable.size() + " " + luaTable.hashSize());
            }
            return new Object[]{luaTable};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib append: ", e);
            }
            if (z) {
                return new Object[]{LuaNil.nil, new Double(100.0d)};
            }
            return new Object[]{new Double(100.0d)};
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib append: ", e2);
            }
            if (z) {
                return new Object[]{LuaNil.nil, new Double(100.0d)};
            }
            return new Object[]{new Double(100.0d)};
        }
    }

    private static Object m2303b(Object[] objArr) {
        if (objArr == null || objArr.length < 2 || objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil) {
            return LuaNil.nil;
        }
        LuaNil luaNil = LuaNil.nil;
        try {
            LuaTable luaTable = (LuaTable) objArr[0];
            Object obj = objArr[1];
            if (KonyMain.f3657e) {
                Log.d("TableLib", "getKeyValue() Input Source Table sizes = " + luaTable.size() + " " + luaTable.hashSize() + " key = " + obj);
            }
            Object table = luaTable.getTable(obj);
            if (KonyMain.f3657e) {
                Log.d("TableLib", "getKeyValue() Input Source Table sizes = " + luaTable.size() + " " + luaTable.hashSize() + " key = " + obj + " ret = " + table);
            }
            return table;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib getKeyValue()", e);
            }
            return LuaNil.nil;
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib getKeyValue()", e2);
            }
            return LuaNil.nil;
        }
    }

    private static Object[] m2304c(Object[] objArr) {
        if (objArr == null || objArr.length < 2 || objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil) {
            return new Object[0];
        }
        try {
            LuaTable luaTable = (LuaTable) objArr[0];
            LuaTable luaTable2 = (LuaTable) objArr[1];
            if (KonyMain.f3657e) {
                Log.d("TableLib", "Before append() Input Source Table sizes = " + luaTable2.size() + " " + luaTable2.hashSize() + " Dest Table sizes = " + luaTable.size() + " " + luaTable.hashSize());
            }
            luaTable.addAll(luaTable2.list);
            Object[] objArr2 = new Object[2];
            Enumeration keys = luaTable2.map.keys();
            while (keys.hasMoreElements()) {
                objArr2[0] = keys.nextElement();
                objArr2[1] = luaTable2.map.get(objArr2[0]);
                luaTable.setTable(objArr2[0], objArr2[1]);
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", "After append() Input Source Table sizes = " + luaTable2.size() + " " + luaTable2.hashSize() + " Dest Table sizes = " + luaTable.size() + " " + luaTable.hashSize());
            }
            return new Object[]{luaTable};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib append: ", e);
            }
            return new Object[]{LuaNil.nil};
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib append: ", e2);
            }
            return new Object[]{LuaNil.nil};
        }
    }

    public static final Hashtable convertToHash(LuaTable luaTable) {
        if (luaTable == null) {
            return null;
        }
        try {
            Hashtable hashtable = new Hashtable();
            for (Object next : luaTable.map.keySet()) {
                Object obj = luaTable.map.get(next);
                if (obj instanceof LuaTable) {
                    if (((LuaTable) obj).map.isEmpty()) {
                        if (((LuaTable) obj).list.isEmpty()) {
                            hashtable.put(next, new Hashtable());
                        } else {
                            hashtable.put(next, convertToList((LuaTable) obj));
                        }
                    } else {
                        hashtable.put(next, convertToHash((LuaTable) obj));
                    }
                } else {
                    hashtable.put(next, luaTable.map.get(next));
                }
            }
            return hashtable;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToHash: ", e);
            }
            throw new LuaError("Table.convertToHash", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToHash: ", e2);
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", BuildConfig.FLAVOR + e2.getMessage());
            }
            throw new LuaError("Table.convertToHash", 203);
        }
    }

    public static final Vector convertToList(LuaTable luaTable) {
        if (luaTable == null) {
            return null;
        }
        try {
            Vector vector = new Vector();
            Iterator it = luaTable.list.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof LuaTable) {
                    if (((LuaTable) next).list.isEmpty()) {
                        if (((LuaTable) next).map.isEmpty()) {
                            vector.add(new Vector());
                        } else {
                            vector.add(convertToHash((LuaTable) next));
                        }
                    } else {
                        vector.add(convertToList((LuaTable) next));
                    }
                } else {
                    vector.add(next);
                }
            }
            return vector;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToList: ", e);
            }
            throw new LuaError("Table.convertToList", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToList: ", e2);
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", BuildConfig.FLAVOR + e2.getMessage());
            }
            throw new LuaError("Table.convertToList", 203);
        }
    }

    public static final LuaTable convertToLuaTable(Hashtable hashtable) {
        if (hashtable == null) {
            return null;
        }
        try {
            LuaTable luaTable = new LuaTable();
            for (Object next : hashtable.keySet()) {
                Object obj = hashtable.get(next);
                if (obj instanceof Hashtable) {
                    luaTable.setTable(next, convertToLuaTable((Hashtable) obj));
                } else {
                    luaTable.setTable(next, obj);
                }
            }
            return luaTable;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToLuaTable: ", e);
            }
            throw new LuaError("Table.convertToLuaTable", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToLuaTable: ", e2);
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", BuildConfig.FLAVOR + e2.getMessage());
            }
            throw new LuaError("Table.convertToLuaTable", 203);
        }
    }

    public static final LuaTable convertToLuaTable(Vector vector) {
        if (vector == null) {
            return null;
        }
        try {
            LuaTable luaTable = new LuaTable();
            for (int i = 0; i < vector.size(); i++) {
                Object obj = vector.get(i);
                if (obj instanceof Vector) {
                    luaTable.list.add(convertToLuaTable((Vector) obj));
                } else {
                    luaTable.list.add(obj);
                }
            }
            return luaTable;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToLuaTable: ", e);
            }
            throw new LuaError("Table.convertToLuaTable", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib convertToLuaTable: ", e2);
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", BuildConfig.FLAVOR + e2.getMessage());
            }
            throw new LuaError("Table.convertToLuaTable", 203);
        }
    }

    private static Object[] m2305d(Object[] objArr) {
        try {
            LuaTable luaTable;
            Object[] objArr2;
            int i;
            if (objArr.length == 2 && (objArr[1] instanceof Function)) {
                luaTable = (LuaTable) objArr[0];
                Function function = (Function) objArr[1];
                objArr2 = new Object[luaTable.list.size()];
                luaTable.list.copyInto(objArr2);
                C0171q.m90a(objArr2, function);
                for (i = 0; i < objArr2.length; i++) {
                    luaTable.list.setElementAt(objArr2[i], i);
                }
                return new Object[]{luaTable};
            } else if (objArr.length == 2 && (objArr[1] instanceof String)) {
                luaTable = (LuaTable) objArr[0];
                String obj = objArr[1].toString();
                if (((LuaTable) luaTable.list.elementAt(0)).getTable(obj) == LuaNil.nil) {
                    return new Object[0];
                }
                Object[] objArr3 = new Object[luaTable.list.size()];
                if (KonyMain.f3657e) {
                    Log.d("TableLib", "Input tb.list.size() = " + luaTable.list.size() + " tb hashSize = " + luaTable.map.size());
                }
                int size = luaTable.list.size();
                for (i = 0; i < size; i++) {
                    objArr3[i] = luaTable.list.elementAt(i);
                }
                C0171q.m92a(objArr3, obj);
                if (KonyMain.f3657e) {
                    Log.d("TableLib", "Sorted Array");
                }
                for (i = 0; i < size; i++) {
                    luaTable.list.setElementAt(objArr3[i], i);
                }
                return new Object[]{luaTable};
            } else if (objArr.length != 1 && (objArr.length != 2 || objArr[1] != LuaNil.nil)) {
                return new Object[0];
            } else {
                luaTable = (LuaTable) objArr[0];
                if (luaTable.list.size() == 0) {
                    return new Object[]{new Double(100.0d)};
                } else if (luaTable.list.elementAt(0) instanceof Number) {
                    objArr2 = new Object[luaTable.list.size()];
                    luaTable.list.copyInto(objArr2);
                    i = 0;
                    while (i < objArr2.length) {
                        if ((objArr2[i] instanceof LuaNil) || !(objArr2[i] instanceof Number)) {
                            return new Object[]{new Double(100.0d)};
                        }
                        i++;
                    }
                    C0171q.m87a(objArr2);
                    for (i = 0; i < objArr2.length; i++) {
                        luaTable.list.setElementAt(objArr2[i], i);
                    }
                    return new Object[]{luaTable};
                } else if (!(luaTable.list.elementAt(0) instanceof String)) {
                    return new Object[0];
                } else {
                    objArr2 = new Object[luaTable.list.size()];
                    luaTable.list.copyInto(objArr2);
                    i = 0;
                    while (i < objArr2.length) {
                        if ((objArr2[i] instanceof LuaNil) || !(objArr2[i] instanceof String)) {
                            return new Object[]{new Double(100.0d)};
                        }
                        i++;
                    }
                    C0171q.m87a(objArr2);
                    for (i = 0; i < objArr2.length; i++) {
                        luaTable.list.setElementAt(objArr2[i], i);
                    }
                    return new Object[]{luaTable};
                }
            }
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib sort: ", e);
            }
            return new Object[0];
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib sort: ", e2);
            }
            return new Object[0];
        }
    }

    private static Object[] m2306e(Object[] objArr) {
        Object[] objArr2 = new Object[1];
        try {
            LuaTable luaTable;
            if (objArr.length == 2) {
                luaTable = (LuaTable) objArr[0];
                if (objArr[1] instanceof String) {
                    return new Object[]{LuaNil.nil, new Double(100.0d)};
                }
                int doubleValue = objArr[1] != LuaNil.nil ? (int) ((Double) objArr[1]).doubleValue() : luaTable.list.size();
                if (doubleValue > luaTable.list.size() || doubleValue <= 0) {
                    return new Object[]{LuaNil.nil};
                }
                int size = doubleValue >= luaTable.list.size() ? luaTable.list.size() : doubleValue;
                objArr2[0] = size != 0 ? luaTable.list.elementAt(size - 1) : LuaNil.nil;
                if (size != 0) {
                    luaTable.list.removeElementAt(size - 1);
                }
            } else if (objArr.length == 1) {
                luaTable = (LuaTable) objArr[0];
                objArr2[0] = luaTable.size() != 0 ? luaTable.list.elementAt(luaTable.size() - 1) : LuaNil.nil;
                if (luaTable.size() != 0) {
                    luaTable.list.removeElementAt(luaTable.size() - 1);
                }
            } else {
                throw new LuaError("Table.remove", 201);
            }
            return objArr2;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib remove: ", e);
            }
            throw new LuaError("Table.remove", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib remove: ", e2);
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", BuildConfig.FLAVOR + e2.getMessage());
            }
            throw new LuaError("Table.remove", 203);
        }
    }

    private static Object[] m2307f(Object[] objArr) {
        if (objArr == null || objArr.length < 2 || objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d("TableLib", "filter() params = " + objArr);
            }
            return new Object[0];
        }
        LuaTable luaTable = new LuaTable();
        try {
            LuaTable luaTable2 = (LuaTable) objArr[0];
            Object obj = objArr[1];
            int size = luaTable2.size();
            int hashSize = luaTable2.hashSize();
            if (size > 0 || hashSize > 0) {
                TableEnumeration tableEnumeration = luaTable2.enumeration;
                tableEnumeration.reset();
                while (tableEnumeration.hasMoreElements()) {
                    Object nextElement = tableEnumeration.nextElement();
                    LuaNil table = luaTable2.getTable(nextElement);
                    if (table == LuaNil.nil) {
                        return new Object[]{LuaNil.nil, new Double(100.0d)};
                    }
                    Object obj2 = nextElement instanceof String ? 1 : null;
                    Object[] execute = ((Function) obj).execute(new Object[]{nextElement, table});
                    if (KonyMain.f3657e) {
                        Log.d("TableLib", "filter() callBack return value = " + execute[0]);
                    }
                    if (execute != null && execute[0] != LuaNil.nil && (execute[0] instanceof Boolean) && ((Boolean) execute[0]).booleanValue()) {
                        if (size <= 0 || obj2 != null) {
                            luaTable.setTable(nextElement, table);
                        } else {
                            luaTable.add(table);
                        }
                    }
                }
            }
            if (KonyMain.f3657e) {
                Log.d("TableLib", "filter() Input Source Table sizes = " + luaTable2.size() + " " + luaTable2.hashSize() + " retTable sizes = " + luaTable.size() + " " + luaTable.hashSize());
            }
            return new Object[]{luaTable};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib filter: ", e);
            }
            return new Object[]{LuaNil.nil, new Double(100.0d)};
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib filter: ", e2);
            }
            return new Object[]{LuaNil.nil, new Double(100.0d)};
        }
    }

    private static Object[] m2308g(Object[] objArr) {
        try {
            LuaTable luaTable = (LuaTable) objArr[0];
            if (objArr.length == 3) {
                if (objArr[1] instanceof Double) {
                    luaTable.insert((Double) objArr[1], objArr[2]);
                } else {
                    return new Object[]{new Double(100.0d)};
                }
            } else if (objArr.length == 2) {
                luaTable.insert(new Double((double) (luaTable.size() + 1)), objArr[1]);
            } else {
                throw new LuaError("Table.insert", 201);
            }
            return new Object[]{luaTable};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib insert: ", e);
            }
            throw new LuaError("Table.insert", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("TableLib", "TableLib insert: ", e2);
            }
            throw new LuaError("Table.insert", 203);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        LuaTable luaTable;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m2308g(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return m2306e(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return m2305d(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return m2301a(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return m2304c(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr == null || objArr.length < 2 || objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil) {
                    return new Object[]{LuaNil.nil, new Double(100.0d)};
                }
                luaTable = (LuaTable) objArr[0];
                Object obj = objArr[1];
                if (obj instanceof Double) {
                    int doubleValue = ((int) ((Double) obj).doubleValue()) - 1;
                    if (doubleValue < 0 || doubleValue >= luaTable.list.size()) {
                        return new Object[]{new Boolean(false)};
                    }
                    return new Object[]{new Boolean(true)};
                } else if (obj instanceof String) {
                    Object obj2 = luaTable.map.get(((String) obj).trim());
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = new Boolean(obj2 != null);
                    return objArr2;
                } else {
                    return new Object[]{LuaNil.nil, new Double(100.0d)};
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return new Object[]{m2303b(objArr)};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return m2302a(objArr, false);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return m2302a(objArr, true);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return m2307f(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                try {
                    if (objArr.length != 1 || objArr[0] == LuaNil.nil) {
                        throw new LuaError("Table.removeall", 201);
                    }
                    luaTable = (LuaTable) objArr[0];
                    luaTable.list.removeAllElements();
                    luaTable.map.clear();
                    return null;
                } catch (Throwable e) {
                    if (KonyMain.f3658f) {
                        Log.w("TableLib", "TableLib removeall: ", e);
                    }
                    throw new LuaError("Table.removeall", 202);
                } catch (Throwable e2) {
                    if (KonyMain.f3658f) {
                        Log.w("TableLib", "TableLib removeall: ", e2);
                    }
                    if (KonyMain.f3657e) {
                        Log.d("TableLib", BuildConfig.FLAVOR + e2.getMessage());
                    }
                    throw new LuaError("Table.removeall", 203);
                }
            default:
                throw new LuaError("Table namespace", 208);
        }
    }

    public String[] getMethods() {
        return f2398a;
    }

    public String getNameSpace() {
        return "table";
    }
}
