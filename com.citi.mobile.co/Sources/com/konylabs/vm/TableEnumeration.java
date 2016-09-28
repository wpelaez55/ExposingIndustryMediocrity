package com.konylabs.vm;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class TableEnumeration implements Serializable, Enumeration {
    static final long serialVersionUID = 8980316118785864039L;
    public int index;
    public Vector keys;
    public LuaTable table;

    public TableEnumeration(LuaTable luaTable) {
        this.index = 1;
        this.keys = new Vector(10);
        this.table = luaTable;
    }

    public boolean hasMoreElements() {
        return this.index <= this.table.size() + this.keys.size();
    }

    public Object nextElement() throws NoSuchElementException {
        if (this.index <= this.table.list.size()) {
            int i = this.index;
            this.index = i + 1;
            return new Double((double) i);
        }
        int size = this.index - this.table.list.size();
        this.index++;
        if (size <= this.keys.size()) {
            return this.keys.elementAt(size - 1);
        }
        throw new NoSuchElementException();
    }

    public void reset() {
        this.index = 1;
    }
}
