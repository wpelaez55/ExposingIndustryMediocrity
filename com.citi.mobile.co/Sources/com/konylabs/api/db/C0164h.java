package com.konylabs.api.db;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.ii;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.konylabs.api.db.h */
public final class C0164h implements Serializable {
    public C0245j f139a;
    private C0163f f140b;
    private Object f141c;
    private Object f142d;
    private Object f143e;
    private boolean f144f;
    private IKonySQLDatabase f145g;
    private String f146h;
    private Hashtable f147i;
    private Queue f148j;
    private byte f149k;
    private boolean f150l;

    public C0164h(C0163f c0163f, C0163f c0163f2, Object obj, Object obj2, Object obj3, boolean z) {
        this.f140b = null;
        this.f141c = null;
        this.f142d = null;
        this.f143e = null;
        this.f144f = false;
        this.f145g = null;
        this.f146h = null;
        this.f139a = null;
        this.f147i = null;
        this.f148j = null;
        this.f149k = (byte) 1;
        this.f150l = false;
        this.f140b = c0163f2;
        this.f141c = obj;
        this.f142d = obj2;
        this.f143e = obj3;
        this.f144f = z;
        this.f147i = new Hashtable();
        this.f148j = new LinkedList();
        this.f139a = KonyMain.m4061G();
    }

    private boolean m79a(Function function, String str, String str2) {
        if (function != null) {
            LuaTable luaTable = new LuaTable();
            luaTable.setTable("code", str);
            luaTable.setTable("message", str2);
            this.f146h = str2;
            try {
                Object[] a = m80a(function, new Object[]{new Double((double) hashCode()), luaTable});
                if (a != null && a.length > 0) {
                    return ((Boolean) a[0]).booleanValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private Object[] m80a(Function function, Object[] objArr) throws Exception {
        if (this.f140b.f135b) {
            return function.execute(objArr);
        }
        Object[][] objArr2 = new Object[1][];
        Exception[] exceptionArr = new Exception[]{null};
        Runnable iiVar = new ii(new C0165i(this, objArr2, function, objArr, exceptionArr));
        this.f139a.m1728a(iiVar);
        iiVar.m1406a();
        if (exceptionArr[0] == null) {
            return objArr2[0];
        }
        throw exceptionArr[0];
    }

    public final void m81a(Object[] objArr) {
        if (this.f150l) {
            Log.d("queueExecuteSQL", "Tried Queing ExecuteSQL on a completed Transaction throwing INVALID_STATE_ERR");
            throw new C0358d("INVALID_STATE_ERR");
        } else if (this.f149k != null) {
            this.f148j.add(objArr);
        }
    }

    public final boolean m82a() {
        return this.f140b.f135b;
    }

    public final C0433g m83b(Object[] objArr) {
        if (this.f150l) {
            Log.d("queueExecuteSQL", "Tried ExecuteSQL on a completed Transaction throwing INVALID_STATE_ERR");
            throw new C0358d("INVALID_STATE_ERR");
        }
        if (this.f149k != null) {
            try {
                String obj = objArr[1].toString();
                IKonySQLStatement iKonySQLStatement = (IKonySQLStatement) this.f147i.get(obj);
                if (iKonySQLStatement == null) {
                    iKonySQLStatement = this.f145g.compileStatement(obj);
                    this.f147i.put(obj, iKonySQLStatement);
                }
                if (KonyMain.f3657e) {
                    Log.d(C0163f.f132e, "SQL Query compiled successfully = " + obj);
                }
                int i = C0163f.f130c + 1;
                C0163f.f130c = i;
                if (i % 1000 == 0) {
                    KonyMain.m4143x().m1777a(this.f139a);
                    C0163f.f130c = 0;
                }
                C0433g a = this.f140b.m77a(this.f145g, objArr, iKonySQLStatement);
                if (this.f140b.f135b) {
                    return a;
                }
                if (!(objArr.length <= 3 || objArr[3] == null || objArr[3] == LuaNil.nil)) {
                    try {
                        m80a((Function) objArr[3], new Object[]{new Double((double) hashCode()), a});
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (IllegalStateException e2) {
                r1 = e2;
                IllegalStateException illegalStateException;
                if (!this.f140b.f135b) {
                    if (objArr.length <= 4 || objArr[4] == null || objArr[4] == LuaNil.nil) {
                        this.f149k = (byte) 0;
                    } else if (m79a((Function) objArr[4], "DATABASE_ERR", illegalStateException.getMessage())) {
                        this.f149k = (byte) 0;
                    } else {
                        this.f149k = (byte) 1;
                    }
                    if (this.f149k == null) {
                        this.f148j.clear();
                        this.f148j = null;
                    }
                } else if (objArr.length <= 3 || objArr[3] == null || objArr[3] == LuaNil.nil) {
                    this.f149k = (byte) 0;
                } else if (m79a((Function) objArr[3], "DATABASE_ERR", illegalStateException.getMessage())) {
                    this.f149k = (byte) 0;
                } else {
                    this.f149k = (byte) 1;
                }
            } catch (IKonySQLException e3) {
                r1 = e3;
                IKonySQLException iKonySQLException;
                if (!this.f140b.f135b) {
                    if (objArr.length <= 4 || objArr[4] == null || objArr[4] == LuaNil.nil) {
                        this.f149k = (byte) 0;
                    } else if (m79a((Function) objArr[4], "DATABASE_ERR", iKonySQLException.getMessage())) {
                        this.f149k = (byte) 0;
                    } else {
                        this.f149k = (byte) 1;
                    }
                    if (this.f149k == null) {
                        this.f148j.clear();
                        this.f148j = null;
                    }
                } else if (objArr.length <= 3 || objArr[3] == null || objArr[3] == LuaNil.nil) {
                    this.f149k = (byte) 0;
                } else if (m79a((Function) objArr[3], "DATABASE_ERR", iKonySQLException.getMessage())) {
                    this.f149k = (byte) 0;
                } else {
                    this.f149k = (byte) 1;
                }
            }
        }
        return null;
    }

    public final void m84b() {
        Exception e;
        Object obj;
        try {
            this.f145g = C0163f.m70a(this.f140b, this.f144f);
            if (!this.f144f) {
                this.f145g.beginTransaction();
            }
            m80a((Function) this.f141c, new Object[]{new Double((double) hashCode())});
            while (this.f148j != null && !this.f148j.isEmpty()) {
                m83b((Object[]) this.f148j.remove());
            }
            this.f147i = null;
            this.f150l = true;
            Log.d("WebSQL.Transaction.run", "Transaction completed and Marked as stale ");
            if (this.f149k != null) {
                if (!this.f144f) {
                    this.f145g.setTransactionSuccessful();
                }
                if (this.f143e != null) {
                    try {
                        m80a((Function) this.f143e, null);
                    } catch (Exception e2) {
                        e = e2;
                        int i = 1;
                        try {
                            if (KonyMain.f3657e) {
                                Log.d("WebSQL.Transaction.run", "Exception = " + e.getMessage());
                            }
                            e.printStackTrace();
                            if (obj != null && this.f142d != null) {
                                this.f150l = true;
                                LuaTable luaTable = new LuaTable();
                                luaTable.setTable("code", "Exception");
                                luaTable.setTable("message", e.getMessage());
                                m80a((Function) this.f142d, new Object[]{new Double((double) hashCode()), luaTable});
                            } else if (this.f150l) {
                                if (e instanceof LuaError) {
                                    throw new LuaError("Error in database transaction execution. " + e.getMessage(), 12004);
                                }
                                throw ((LuaError) e);
                            }
                            if (!this.f144f) {
                                this.f145g.endTransaction();
                            }
                            try {
                                this.f145g.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            this.f145g = null;
                            C0163f.f129a.remove(Double.valueOf((double) hashCode()));
                        } catch (Exception e32) {
                            e32.printStackTrace();
                            if (KonyMain.f3657e) {
                                Log.d("WebSQL.Transaction.run", "transactionErrorCallback Exception = " + e32.getMessage());
                            }
                            if (e32 instanceof LuaError) {
                                throw ((LuaError) e);
                            }
                            throw new LuaError("Error in database transaction execution. " + e32.getMessage(), 12004);
                        } catch (Throwable th) {
                            if (!this.f144f) {
                                this.f145g.endTransaction();
                            }
                            try {
                                this.f145g.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                            this.f145g = null;
                            C0163f.f129a.remove(Double.valueOf((double) hashCode()));
                        }
                    }
                }
            } else if (this.f142d != null) {
                LuaTable luaTable2 = new LuaTable();
                luaTable2.setTable("code", "DATABASE_ERR");
                luaTable2.setTable("message", this.f146h);
                m80a((Function) this.f142d, new Object[]{new Double((double) hashCode()), luaTable2});
            }
            if (!this.f144f) {
                this.f145g.endTransaction();
            }
            try {
                this.f145g.close();
            } catch (Exception e322) {
                e322.printStackTrace();
            }
            this.f145g = null;
            C0163f.f129a.remove(Double.valueOf((double) hashCode()));
        } catch (Exception e5) {
            e4 = e5;
            obj = null;
            if (KonyMain.f3657e) {
                Log.d("WebSQL.Transaction.run", "Exception = " + e4.getMessage());
            }
            e4.printStackTrace();
            if (obj != null) {
            }
            if (this.f150l) {
                if (e4 instanceof LuaError) {
                    throw new LuaError("Error in database transaction execution. " + e4.getMessage(), 12004);
                }
                throw ((LuaError) e4);
            }
            if (this.f144f) {
                this.f145g.endTransaction();
            }
            this.f145g.close();
            this.f145g = null;
            C0163f.f129a.remove(Double.valueOf((double) hashCode()));
        }
    }
}
