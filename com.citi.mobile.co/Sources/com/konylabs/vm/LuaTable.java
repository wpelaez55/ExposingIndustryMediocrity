package com.konylabs.vm;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class LuaTable implements Serializable {
    static final long serialVersionUID = 7748609846044439686L;
    public TableEnumeration enumeration;
    public Vector list;
    public Hashtable map;

    public LuaTable() {
        this(0, 0);
    }

    public LuaTable(int i, int i2) {
        this.map = new Hashtable(i2);
        this.list = new Vector(i);
        this.enumeration = new TableEnumeration(this);
    }

    public LuaTable(int i, int i2, float f, boolean z) {
        this.map = new Hashtable(i2, f);
        this.list = new Vector(i);
        if (z) {
            this.enumeration = new TableEnumeration(this);
        } else {
            this.enumeration = null;
        }
    }

    public LuaTable(int i, int i2, boolean z) {
        this.map = new Hashtable(i2);
        this.list = new Vector(i);
        if (z) {
            this.enumeration = new TableEnumeration(this);
        } else {
            this.enumeration = null;
        }
    }

    private String m1641a() {
        StringBuffer stringBuffer = new StringBuffer("{ ");
        if (this.list.size() > 0) {
            Iterator it = this.list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString()).append(", ");
            }
        }
        if (this.map.size() > 0) {
            Enumeration keys = this.map.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                stringBuffer.append(nextElement.toString()).append(" = ").append(this.map.get(nextElement).toString()).append(", ");
            }
        }
        return stringBuffer.append(" }").toString();
    }

    private void m1642a(int i) {
        if (this.enumeration != null) {
            boolean removeElement;
            do {
                i++;
                Double d = new Double((double) i);
                removeElement = this.enumeration.keys.removeElement(d);
                if (removeElement) {
                    Object obj = this.map.get(d);
                    this.map.remove(d);
                    this.list.addElement(obj);
                    continue;
                }
            } while (removeElement);
        }
    }

    private void m1643a(Object obj, Object obj2) {
        if (obj2 != LuaNil.nil) {
            if (!(this.map.containsKey(obj) || this.enumeration == null)) {
                this.enumeration.keys.addElement(obj);
            }
            this.map.put(obj, obj2);
            return;
        }
        if (this.map.containsKey(obj) && this.enumeration != null) {
            this.enumeration.keys.removeElement(obj);
        }
        this.map.remove(obj);
    }

    private void m1644a(String str) {
        Object next;
        Log.d(str, "<------Start LuaTable: " + hashCode() + "------>");
        if (this.list.size() > 0) {
            Iterator it = this.list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next instanceof LuaTable) {
                    ((LuaTable) next).m1644a(str);
                } else {
                    Log.d(str, next.toString());
                }
            }
        }
        if (this.map.size() > 0) {
            Enumeration keys = this.map.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                next = this.map.get(nextElement);
                if (next instanceof LuaTable) {
                    Log.d(str, nextElement + " = ");
                    ((LuaTable) next).m1644a(str);
                } else {
                    Log.d(str, nextElement + " = " + next);
                }
            }
        }
        Log.d(str, "<------End LuaTable: " + hashCode() + "------>");
    }

    private void m1645a(String str, StringBuffer stringBuffer) {
        Object next;
        if (this.list.size() > 0) {
            m1646a(str, stringBuffer, "[");
            Iterator it = this.list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next instanceof LuaTable) {
                    ((LuaTable) next).m1645a(str, stringBuffer);
                    m1646a(str, stringBuffer, ", ");
                } else {
                    m1646a(str, stringBuffer, next.toString() + ", ");
                }
            }
            m1646a(str, stringBuffer, "]");
        }
        if (this.map.size() > 0) {
            m1646a(str, stringBuffer, "{");
            Enumeration keys = this.map.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                next = this.map.get(nextElement);
                if (next instanceof LuaTable) {
                    m1646a(str, stringBuffer, nextElement + " : ");
                    ((LuaTable) next).m1645a(str, stringBuffer);
                    m1646a(str, stringBuffer, ", ");
                } else {
                    m1646a(str, stringBuffer, nextElement + " : " + next + ", ");
                }
            }
            m1646a(str, stringBuffer, "}");
        }
    }

    private static void m1646a(String str, StringBuffer stringBuffer, String str2) {
        int length = str2.length();
        int i = 0;
        while (length - i > 0) {
            int capacity = stringBuffer.capacity() - stringBuffer.length();
            if (capacity >= length - i) {
                stringBuffer.append(str2, i, length);
                return;
            }
            stringBuffer.append(str2, i, i + capacity);
            i += capacity;
            Log.d(str, stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    public void add(Object obj) {
        this.list.ensureCapacity(this.list.size() + 1);
        this.list.addElement(obj);
        m1642a(this.list.size());
    }

    public void addAll(Vector vector) {
        int size = vector.size();
        this.list.ensureCapacity(this.list.size() + size);
        for (int i = 0; i < size; i++) {
            this.list.addElement(vector.elementAt(i));
        }
        m1642a(this.list.size());
    }

    public int arraySize() {
        return this.list.size();
    }

    public LuaWidget createClone() {
        return null;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof LuaTable) ? false : ((LuaTable) obj).list.equals(this.list) && ((LuaTable) obj).map.equals(this.map);
    }

    public Object[] getArrayValues() {
        return this.list.size() > 0 ? this.list.toArray() : null;
    }

    public Object[] getHashValues() {
        return this.map.size() > 0 ? this.map.values().toArray() : null;
    }

    public Object[] getKeys() {
        if (this.map.size() <= 0) {
            return null;
        }
        Object[] objArr = new Object[this.map.size()];
        Enumeration keys = this.map.keys();
        int i = 0;
        while (keys.hasMoreElements()) {
            objArr[i] = keys.nextElement();
            i++;
        }
        return objArr;
    }

    public Object getTable(Object obj) {
        if (obj == null || obj == LuaNil.nil) {
            return LuaNil.nil;
        }
        Object elementAt;
        if (obj instanceof Double) {
            int doubleValue = ((int) ((Double) obj).doubleValue()) - 1;
            elementAt = (doubleValue < 0 || doubleValue >= this.list.size()) ? this.map.get(obj) : this.list.elementAt(doubleValue);
        } else {
            elementAt = obj instanceof String ? this.map.get(((String) obj).trim()) : this.map.get(obj);
        }
        if (elementAt == null) {
            LuaTable luaTable = (LuaTable) this.map.get("__index");
            elementAt = luaTable != null ? luaTable.getTable(obj) : null;
        }
        return elementAt == null ? LuaNil.nil : elementAt;
    }

    public int hashCode() {
        return this.list.hashCode() + this.map.hashCode();
    }

    public int hashSize() {
        return this.map.size();
    }

    public void insert(Object obj, Object obj2) {
        if (obj instanceof Double) {
            int doubleValue = ((int) ((Double) obj).doubleValue()) - 1;
            if (doubleValue < this.list.size() && doubleValue >= 0) {
                this.list.insertElementAt(obj2, doubleValue);
                m1642a(this.list.size());
                return;
            } else if (doubleValue == this.list.size()) {
                this.list.ensureCapacity(doubleValue + 20);
                this.list.addElement(obj2);
                m1642a(doubleValue + 1);
                return;
            } else {
                m1643a(obj, obj2);
                return;
            }
        }
        throw new LuaError("table.insert", 202);
    }

    public void print(String str) {
        if (KonyMain.m4057C()) {
            StringBuffer stringBuffer = new StringBuffer(64);
            Log.d(str, "<------Start JS Object: ------>");
            m1645a(str, stringBuffer);
            Log.d(str, stringBuffer.toString());
            Log.d(str, "<------End JS Object: ------>");
            return;
        }
        m1644a(str);
    }

    public void setTable(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null) {
                obj2 = LuaNil.nil;
            }
            if (obj instanceof Double) {
                int doubleValue = ((int) ((Double) obj).doubleValue()) - 1;
                if (doubleValue >= 0 && doubleValue < this.list.size()) {
                    this.list.setElementAt(obj2, doubleValue);
                } else if (doubleValue == this.list.size()) {
                    this.list.ensureCapacity(doubleValue + 20);
                    this.list.addElement(obj2);
                    m1642a(doubleValue + 1);
                } else {
                    m1643a(obj, obj2);
                }
            } else if (obj instanceof String) {
                m1643a(((String) obj).trim(), obj2);
            } else {
                m1643a(obj, obj2);
            }
        }
    }

    public int size() {
        return this.list.size();
    }

    public String toString() {
        if (!KonyMain.m4057C()) {
            return m1641a();
        }
        StringBuffer stringBuffer = new StringBuffer(BuildConfig.FLAVOR);
        if (this.list.size() > 0) {
            stringBuffer.append(" [ ");
            Iterator it = this.list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString()).append(", ");
            }
            stringBuffer.append(" ] ");
        }
        if (this.map.size() > 0) {
            stringBuffer.append(" { ");
            Enumeration keys = this.map.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                stringBuffer.append(nextElement.toString()).append(" : ").append(this.map.get(nextElement).toString()).append(", ");
            }
            stringBuffer.append(" } ");
        }
        return stringBuffer.toString();
    }
}
