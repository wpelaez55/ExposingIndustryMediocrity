package ny0k;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.libintf.Library;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashMap;

/* renamed from: ny0k.R */
public final class C0424R implements Library {
    private static final String[] f3211a;
    private static final Object f3212b;
    private LinkedHashMap f3213c;
    private String[] f3214d;
    private SQLiteDatabase f3215e;

    static {
        f3211a = new String[]{"key", "getitem", "setitem", "removeitem", "clear", "length"};
        f3212b = null;
    }

    private Object m3478a(String str) {
        Object readObject;
        ObjectInputStream objectInputStream = null;
        Object obj = this.f3213c.get(str);
        if (obj != null) {
            return obj;
        }
        Cursor query = this.f3215e.query("localstorage", new String[]{"value"}, "key='" + str + "'", null, null, null, null);
        if (query.moveToFirst()) {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(query.getBlob(0)));
                try {
                    objectInputStream = objectInputStream2;
                    readObject = objectInputStream2.readObject();
                } catch (Exception e) {
                    readObject = e;
                    objectInputStream = objectInputStream2;
                    if (KonyMain.f3657e) {
                        Log.e("LocalStorageLib", "Error while reading luatable for key" + str);
                        Log.e("LocalStorageLib", BuildConfig.FLAVOR + readObject);
                    }
                    readObject = obj;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                    query.close();
                    return readObject;
                }
            } catch (Exception e3) {
                readObject = e3;
                if (KonyMain.f3657e) {
                    Log.e("LocalStorageLib", "Error while reading luatable for key" + str);
                    Log.e("LocalStorageLib", BuildConfig.FLAVOR + readObject);
                }
                readObject = obj;
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                query.close();
                return readObject;
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        } else {
            readObject = obj;
        }
        query.close();
        return readObject;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object[] execute(int r12, java.lang.Object[] r13) {
        /*
        r11 = this;
        r10 = 2;
        r4 = 1;
        r5 = 0;
        r3 = 0;
        monitor-enter(r11);
        r2 = r11.f3215e;	 Catch:{ all -> 0x004c }
        if (r2 != 0) goto L_0x001e;
    L_0x0009:
        r2 = com.konylabs.android.KonyMain.getAppContext();	 Catch:{ all -> 0x004c }
        r6 = "localstorage.db";
        r7 = 0;
        r8 = 0;
        r2 = r2.openOrCreateDatabase(r6, r7, r8);	 Catch:{ all -> 0x004c }
        r11.f3215e = r2;	 Catch:{ all -> 0x004c }
        r2 = r11.f3215e;	 Catch:{ all -> 0x004c }
        r6 = "CREATE TABLE IF NOT EXISTS localstorage (key TEXT PRIMARY KEY ON CONFLICT REPLACE, datatype INTEGER, value)";
        r2.execSQL(r6);	 Catch:{ all -> 0x004c }
    L_0x001e:
        r2 = r11.f3213c;	 Catch:{ all -> 0x004c }
        if (r2 != 0) goto L_0x0073;
    L_0x0022:
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x004c }
        r2.<init>();	 Catch:{ all -> 0x004c }
        r11.f3213c = r2;	 Catch:{ all -> 0x004c }
        r2 = r11.f3215e;	 Catch:{ all -> 0x004c }
        r6 = "SELECT * FROM localstorage";
        r7 = 0;
        r6 = r2.rawQuery(r6, r7);	 Catch:{ all -> 0x004c }
    L_0x0032:
        r2 = r6.moveToNext();	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x0070;
    L_0x0038:
        r2 = 0;
        r7 = r6.getString(r2);	 Catch:{ all -> 0x004c }
        r2 = 1;
        r2 = r6.getInt(r2);	 Catch:{ all -> 0x004c }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x0059;
            case 2: goto L_0x0045;
            case 3: goto L_0x005f;
            case 4: goto L_0x006e;
            default: goto L_0x0045;
        };	 Catch:{ all -> 0x004c }
    L_0x0045:
        r2 = r5;
    L_0x0046:
        r8 = r11.f3213c;	 Catch:{ all -> 0x004c }
        r8.put(r7, r2);	 Catch:{ all -> 0x004c }
        goto L_0x0032;
    L_0x004c:
        r2 = move-exception;
        monitor-exit(r11);
        throw r2;
    L_0x004f:
        r2 = 2;
        r8 = r6.getDouble(r2);	 Catch:{ all -> 0x004c }
        r2 = java.lang.Double.valueOf(r8);	 Catch:{ all -> 0x004c }
        goto L_0x0046;
    L_0x0059:
        r2 = 2;
        r2 = r6.getString(r2);	 Catch:{ all -> 0x004c }
        goto L_0x0046;
    L_0x005f:
        r2 = 2;
        r2 = r6.getInt(r2);	 Catch:{ all -> 0x004c }
        if (r2 != 0) goto L_0x006c;
    L_0x0066:
        r2 = r3;
    L_0x0067:
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x004c }
        goto L_0x0046;
    L_0x006c:
        r2 = r4;
        goto L_0x0067;
    L_0x006e:
        r2 = r5;
        goto L_0x0046;
    L_0x0070:
        r6.close();	 Catch:{ all -> 0x004c }
    L_0x0073:
        switch(r12) {
            case 0: goto L_0x0081;
            case 1: goto L_0x00e4;
            case 2: goto L_0x0113;
            case 3: goto L_0x0243;
            case 4: goto L_0x029b;
            case 5: goto L_0x02b3;
            default: goto L_0x0076;
        };	 Catch:{ all -> 0x004c }
    L_0x0076:
        r2 = r5;
    L_0x0077:
        if (r2 == 0) goto L_0x007f;
    L_0x0079:
        r3 = 1;
        r5 = new java.lang.Object[r3];	 Catch:{ all -> 0x004c }
        r3 = 0;
        r5[r3] = r2;	 Catch:{ all -> 0x004c }
    L_0x007f:
        monitor-exit(r11);
        return r5;
    L_0x0081:
        if (r13 == 0) goto L_0x0086;
    L_0x0083:
        r2 = r13.length;	 Catch:{ all -> 0x004c }
        if (r2 > 0) goto L_0x0092;
    L_0x0086:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = "Error";
        r5 = "Invalid number of arguments for kony.store.getKey()";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x0092:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = r2 instanceof java.lang.Double;	 Catch:{ all -> 0x004c }
        if (r2 != 0) goto L_0x00a5;
    L_0x0099:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 100;
        r4 = "Error";
        r5 = "Invalid type of argument for for kony.store.getKey(). Expected type is Number";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x00a5:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = (java.lang.Double) r2;	 Catch:{ all -> 0x004c }
        r2 = r2.intValue();	 Catch:{ all -> 0x004c }
        r3 = 0;
        r3 = ny0k.cr.m2199a(r2, r3);	 Catch:{ all -> 0x004c }
        if (r3 >= 0) goto L_0x00b7;
    L_0x00b5:
        r2 = r5;
        goto L_0x0077;
    L_0x00b7:
        r2 = r11.f3214d;	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x00c5;
    L_0x00bb:
        r2 = r11.f3214d;	 Catch:{ all -> 0x004c }
        r2 = r2.length;	 Catch:{ all -> 0x004c }
        if (r3 >= r2) goto L_0x00c5;
    L_0x00c0:
        r2 = r11.f3214d;	 Catch:{ all -> 0x004c }
        r2 = r2[r3];	 Catch:{ all -> 0x004c }
        goto L_0x0077;
    L_0x00c5:
        r2 = r11.f3213c;	 Catch:{ all -> 0x004c }
        r2 = r2.keySet();	 Catch:{ all -> 0x004c }
        r4 = r2.size();	 Catch:{ all -> 0x004c }
        if (r3 >= r4) goto L_0x02d2;
    L_0x00d1:
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x004c }
        r11.f3214d = r4;	 Catch:{ all -> 0x004c }
        r4 = r11.f3214d;	 Catch:{ all -> 0x004c }
        r2 = r2.toArray(r4);	 Catch:{ all -> 0x004c }
        r2 = (java.lang.String[]) r2;	 Catch:{ all -> 0x004c }
        r11.f3214d = r2;	 Catch:{ all -> 0x004c }
        r2 = r11.f3214d;	 Catch:{ all -> 0x004c }
        r2 = r2[r3];	 Catch:{ all -> 0x004c }
        goto L_0x0077;
    L_0x00e4:
        if (r13 == 0) goto L_0x00e9;
    L_0x00e6:
        r2 = r13.length;	 Catch:{ all -> 0x004c }
        if (r2 > 0) goto L_0x00f5;
    L_0x00e9:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = "Error";
        r5 = "Invalid number of arguments for kony.store.getItem()";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x00f5:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = r2 instanceof java.lang.String;	 Catch:{ all -> 0x004c }
        if (r2 != 0) goto L_0x0108;
    L_0x00fc:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 100;
        r4 = "Error";
        r5 = "Invalid type of argument for kony.store.getItem(). Expected type is String";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x0108:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x004c }
        r2 = r11.m3478a(r2);	 Catch:{ all -> 0x004c }
        goto L_0x0077;
    L_0x0113:
        if (r13 == 0) goto L_0x0118;
    L_0x0115:
        r2 = r13.length;	 Catch:{ all -> 0x004c }
        if (r2 >= r10) goto L_0x0124;
    L_0x0118:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = "Error";
        r5 = "Invalid number of arguments for kony.store.setItem()";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x0124:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = r2 instanceof java.lang.String;	 Catch:{ all -> 0x004c }
        if (r2 != 0) goto L_0x0137;
    L_0x012b:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 100;
        r4 = "Error";
        r5 = "Invalid Type of first argument for kony.store.setItem(). Expected type is String";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x0137:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x004c }
        r3 = 1;
        r4 = r13[r3];	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x0143;
    L_0x0141:
        if (r4 != 0) goto L_0x0146;
    L_0x0143:
        r2 = r5;
        goto L_0x0077;
    L_0x0146:
        r7 = new android.content.ContentValues;	 Catch:{ all -> 0x004c }
        r7.<init>();	 Catch:{ all -> 0x004c }
        r3 = "key";
        r7.put(r3, r2);	 Catch:{ all -> 0x004c }
        r3 = r4 instanceof java.lang.String;	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x0184;
    L_0x0154:
        r3 = "datatype";
        r6 = 1;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x004c }
        r7.put(r3, r6);	 Catch:{ all -> 0x004c }
        r6 = "value";
        r0 = r4;
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x004c }
        r3 = r0;
        r7.put(r6, r3);	 Catch:{ all -> 0x004c }
    L_0x0167:
        r3 = r11.f3215e;	 Catch:{ all -> 0x004c }
        r6 = "localstorage";
        r8 = "NULL";
        r6 = r3.insert(r6, r8, r7);	 Catch:{ all -> 0x004c }
        r8 = -1;
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r3 == 0) goto L_0x0217;
    L_0x0177:
        r3 = r4 instanceof com.konylabs.vm.LuaTable;	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x023d;
    L_0x017b:
        r3 = r11.f3213c;	 Catch:{ all -> 0x004c }
        r4 = 0;
        r3.put(r2, r4);	 Catch:{ all -> 0x004c }
        r2 = r5;
        goto L_0x0077;
    L_0x0184:
        r3 = r4 instanceof java.lang.Boolean;	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x019c;
    L_0x0188:
        r3 = "datatype";
        r6 = 3;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x004c }
        r7.put(r3, r6);	 Catch:{ all -> 0x004c }
        r6 = "value";
        r0 = r4;
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x004c }
        r3 = r0;
        r7.put(r6, r3);	 Catch:{ all -> 0x004c }
        goto L_0x0167;
    L_0x019c:
        r3 = r4 instanceof java.lang.Number;	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x01b4;
    L_0x01a0:
        r3 = "datatype";
        r6 = 0;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x004c }
        r7.put(r3, r6);	 Catch:{ all -> 0x004c }
        r6 = "value";
        r0 = r4;
        r0 = (java.lang.Double) r0;	 Catch:{ all -> 0x004c }
        r3 = r0;
        r7.put(r6, r3);	 Catch:{ all -> 0x004c }
        goto L_0x0167;
    L_0x01b4:
        r3 = r4 instanceof com.konylabs.vm.LuaTable;	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x0226;
    L_0x01b8:
        r3 = "datatype";
        r6 = 4;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x004c }
        r7.put(r3, r6);	 Catch:{ all -> 0x004c }
        r3 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x004c }
        r3.<init>();	 Catch:{ all -> 0x004c }
        r6 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x01dc, all -> 0x021e }
        r6.<init>(r3);	 Catch:{ IOException -> 0x01dc, all -> 0x021e }
        r6.writeObject(r4);	 Catch:{ IOException -> 0x02ce, all -> 0x02c7 }
        r3 = r3.toByteArray();	 Catch:{ IOException -> 0x02ce, all -> 0x02c7 }
        r6.close();	 Catch:{ IOException -> 0x02c1 }
    L_0x01d6:
        r6 = "value";
        r7.put(r6, r3);	 Catch:{ all -> 0x004c }
        goto L_0x0167;
    L_0x01dc:
        r3 = move-exception;
        r4 = r5;
    L_0x01de:
        r6 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x02cb }
        if (r6 == 0) goto L_0x0212;
    L_0x01e2:
        r6 = "LocalStorageLib";
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02cb }
        r7.<init>();	 Catch:{ all -> 0x02cb }
        r8 = "Error while writing luatable to database for key - ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x02cb }
        r2 = r7.append(r2);	 Catch:{ all -> 0x02cb }
        r2 = r2.toString();	 Catch:{ all -> 0x02cb }
        android.util.Log.e(r6, r2);	 Catch:{ all -> 0x02cb }
        r2 = "LocalStorageLib";
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02cb }
        r6.<init>();	 Catch:{ all -> 0x02cb }
        r7 = "";
        r6 = r6.append(r7);	 Catch:{ all -> 0x02cb }
        r3 = r6.append(r3);	 Catch:{ all -> 0x02cb }
        r3 = r3.toString();	 Catch:{ all -> 0x02cb }
        android.util.Log.d(r2, r3);	 Catch:{ all -> 0x02cb }
    L_0x0212:
        if (r4 == 0) goto L_0x021b;
    L_0x0214:
        r4.close();	 Catch:{ IOException -> 0x021a }
    L_0x0217:
        r2 = r5;
        goto L_0x0077;
    L_0x021a:
        r2 = move-exception;
    L_0x021b:
        r2 = r5;
        goto L_0x0077;
    L_0x021e:
        r2 = move-exception;
        r4 = r5;
    L_0x0220:
        if (r4 == 0) goto L_0x0225;
    L_0x0222:
        r4.close();	 Catch:{ IOException -> 0x02c4 }
    L_0x0225:
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x0226:
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x0231;
    L_0x022a:
        r2 = "LocalStorageLib";
        r3 = "Datatype of value is neither of number, string, boolean, luatable";
        android.util.Log.d(r2, r3);	 Catch:{ all -> 0x004c }
    L_0x0231:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 100;
        r4 = "Error";
        r5 = "Type of second argument invalid for kony.store.setItem()";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x023d:
        r3 = r11.f3213c;	 Catch:{ all -> 0x004c }
        r3.put(r2, r4);	 Catch:{ all -> 0x004c }
        goto L_0x0217;
    L_0x0243:
        if (r13 == 0) goto L_0x0248;
    L_0x0245:
        r2 = r13.length;	 Catch:{ all -> 0x004c }
        if (r2 > 0) goto L_0x0254;
    L_0x0248:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = "Error";
        r5 = "Invalid number of arguments for kony.store.removeItem()";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x0254:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = r2 instanceof java.lang.String;	 Catch:{ all -> 0x004c }
        if (r2 != 0) goto L_0x0267;
    L_0x025b:
        r2 = new com.konylabs.vm.LuaError;	 Catch:{ all -> 0x004c }
        r3 = 100;
        r4 = "Error";
        r5 = "Invalid type of argument for kony.store.removeItem(). Expected type is String";
        r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x0267:
        r2 = 0;
        r2 = r13[r2];	 Catch:{ all -> 0x004c }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x004c }
        r3 = r11.f3215e;	 Catch:{ all -> 0x004c }
        r4 = "localstorage";
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004c }
        r6.<init>();	 Catch:{ all -> 0x004c }
        r7 = "key='";
        r6 = r6.append(r7);	 Catch:{ all -> 0x004c }
        r6 = r6.append(r2);	 Catch:{ all -> 0x004c }
        r7 = "'";
        r6 = r6.append(r7);	 Catch:{ all -> 0x004c }
        r6 = r6.toString();	 Catch:{ all -> 0x004c }
        r7 = 0;
        r3 = r3.delete(r4, r6, r7);	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x0298;
    L_0x0290:
        r3 = r11.f3213c;	 Catch:{ all -> 0x004c }
        r3.remove(r2);	 Catch:{ all -> 0x004c }
        r2 = 0;
        r11.f3214d = r2;	 Catch:{ all -> 0x004c }
    L_0x0298:
        r2 = r5;
        goto L_0x0077;
    L_0x029b:
        r2 = r11.f3215e;	 Catch:{ all -> 0x004c }
        r3 = "localstorage";
        r4 = "1";
        r6 = 0;
        r2 = r2.delete(r3, r4, r6);	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x02b0;
    L_0x02a8:
        r2 = r11.f3213c;	 Catch:{ all -> 0x004c }
        r2.clear();	 Catch:{ all -> 0x004c }
        r2 = 0;
        r11.f3214d = r2;	 Catch:{ all -> 0x004c }
    L_0x02b0:
        r2 = r5;
        goto L_0x0077;
    L_0x02b3:
        r2 = new java.lang.Double;	 Catch:{ all -> 0x004c }
        r3 = r11.f3213c;	 Catch:{ all -> 0x004c }
        r3 = r3.size();	 Catch:{ all -> 0x004c }
        r6 = (double) r3;	 Catch:{ all -> 0x004c }
        r2.<init>(r6);	 Catch:{ all -> 0x004c }
        goto L_0x0077;
    L_0x02c1:
        r6 = move-exception;
        goto L_0x01d6;
    L_0x02c4:
        r3 = move-exception;
        goto L_0x0225;
    L_0x02c7:
        r2 = move-exception;
        r4 = r6;
        goto L_0x0220;
    L_0x02cb:
        r2 = move-exception;
        goto L_0x0220;
    L_0x02ce:
        r3 = move-exception;
        r4 = r6;
        goto L_0x01de;
    L_0x02d2:
        r2 = r5;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.R.execute(int, java.lang.Object[]):java.lang.Object[]");
    }

    protected final void finalize() throws Throwable {
        this.f3215e.close();
        super.finalize();
    }

    public final String[] getMethods() {
        return f3211a;
    }

    public final String getNameSpace() {
        return "localstorage";
    }
}
