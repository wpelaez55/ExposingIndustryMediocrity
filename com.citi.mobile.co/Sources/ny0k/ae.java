package ny0k;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils.InsertHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;

public class ae {
    private static ae f2072b;
    private Context f2073a;
    private SQLiteDatabase f2074c;
    private InsertHelper f2075d;
    private int f2076e;
    private int f2077f;
    private int f2078g;
    private int f2079h;

    private ae(Context context) {
        this.f2073a = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1971a(byte[] r10) {
        /*
        r9 = 8;
        r3 = 1;
        r8 = 4;
        r7 = 2;
        r1 = 0;
        if (r10 != 0) goto L_0x0009;
    L_0x0008:
        return r1;
    L_0x0009:
        r0 = r1;
    L_0x000a:
        r2 = r0 + 3;
        r4 = r10.length;
        if (r2 >= r4) goto L_0x00e5;
    L_0x000f:
        r2 = r0 + 1;
        r0 = r10[r0];
        r0 = r0 & 255;
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 != r4) goto L_0x00ec;
    L_0x0019:
        r0 = r10[r2];
        r4 = r0 & 255;
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r4 == r0) goto L_0x00e9;
    L_0x0021:
        r0 = r2 + 1;
        r2 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        if (r4 == r2) goto L_0x000a;
    L_0x0027:
        if (r4 == r3) goto L_0x000a;
    L_0x0029:
        r2 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        if (r4 == r2) goto L_0x00e5;
    L_0x002d:
        r2 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        if (r4 == r2) goto L_0x00e5;
    L_0x0031:
        r5 = m1972a(r10, r0, r7, r1);
        if (r5 < r7) goto L_0x003c;
    L_0x0037:
        r2 = r0 + r5;
        r6 = r10.length;
        if (r2 <= r6) goto L_0x0044;
    L_0x003c:
        r0 = "CameraExif";
        r2 = "Invalid length";
        android.util.Log.e(r0, r2);
        goto L_0x0008;
    L_0x0044:
        r2 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        if (r4 != r2) goto L_0x007b;
    L_0x0048:
        if (r5 < r9) goto L_0x007b;
    L_0x004a:
        r2 = r0 + 2;
        r2 = m1972a(r10, r2, r8, r1);
        r4 = 1165519206; // 0x45786966 float:3974.5874 double:5.758429993E-315;
        if (r2 != r4) goto L_0x007b;
    L_0x0055:
        r2 = r0 + 6;
        r2 = m1972a(r10, r2, r7, r1);
        if (r2 != 0) goto L_0x007b;
    L_0x005d:
        r2 = r0 + 8;
        r0 = r5 + -8;
        r4 = r2;
        r2 = r0;
    L_0x0063:
        if (r2 <= r9) goto L_0x00dc;
    L_0x0065:
        r0 = m1972a(r10, r4, r8, r1);
        r5 = 1229531648; // 0x49492a00 float:823968.0 double:6.074693478E-315;
        if (r0 == r5) goto L_0x007d;
    L_0x006e:
        r5 = 1296891946; // 0x4d4d002a float:2.14958752E8 double:6.40749757E-315;
        if (r0 == r5) goto L_0x007d;
    L_0x0073:
        r0 = "CameraExif";
        r2 = "Invalid byte order";
        android.util.Log.e(r0, r2);
        goto L_0x0008;
    L_0x007b:
        r0 = r0 + r5;
        goto L_0x000a;
    L_0x007d:
        r5 = 1229531648; // 0x49492a00 float:823968.0 double:6.074693478E-315;
        if (r0 != r5) goto L_0x009a;
    L_0x0082:
        r0 = r3;
    L_0x0083:
        r3 = r4 + 4;
        r3 = m1972a(r10, r3, r8, r0);
        r3 = r3 + 2;
        r5 = 10;
        if (r3 < r5) goto L_0x0091;
    L_0x008f:
        if (r3 <= r2) goto L_0x009c;
    L_0x0091:
        r0 = "CameraExif";
        r2 = "Invalid offset";
        android.util.Log.e(r0, r2);
        goto L_0x0008;
    L_0x009a:
        r0 = r1;
        goto L_0x0083;
    L_0x009c:
        r4 = r4 + r3;
        r3 = r2 - r3;
        r2 = r4 + -2;
        r2 = m1972a(r10, r2, r7, r0);
        r5 = r4;
        r4 = r3;
    L_0x00a7:
        r3 = r2 + -1;
        if (r2 <= 0) goto L_0x00dc;
    L_0x00ab:
        r2 = 12;
        if (r4 < r2) goto L_0x00dc;
    L_0x00af:
        r2 = m1972a(r10, r5, r7, r0);
        r6 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        if (r2 != r6) goto L_0x00d5;
    L_0x00b7:
        r2 = r5 + 8;
        r0 = m1972a(r10, r2, r7, r0);
        switch(r0) {
            case 1: goto L_0x0008;
            case 2: goto L_0x00c0;
            case 3: goto L_0x00c9;
            case 4: goto L_0x00c0;
            case 5: goto L_0x00c0;
            case 6: goto L_0x00cd;
            case 7: goto L_0x00c0;
            case 8: goto L_0x00d1;
            default: goto L_0x00c0;
        };
    L_0x00c0:
        r0 = "CameraExif";
        r2 = "Unsupported orientation";
        android.util.Log.i(r0, r2);
        goto L_0x0008;
    L_0x00c9:
        r1 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x0008;
    L_0x00cd:
        r1 = 90;
        goto L_0x0008;
    L_0x00d1:
        r1 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x0008;
    L_0x00d5:
        r5 = r5 + 12;
        r2 = r4 + -12;
        r4 = r2;
        r2 = r3;
        goto L_0x00a7;
    L_0x00dc:
        r0 = "CameraExif";
        r2 = "Orientation not found";
        android.util.Log.i(r0, r2);
        goto L_0x0008;
    L_0x00e5:
        r2 = r1;
        r4 = r0;
        goto L_0x0063;
    L_0x00e9:
        r0 = r2;
        goto L_0x000a;
    L_0x00ec:
        r4 = r2;
        r2 = r1;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.ae.a(byte[]):int");
    }

    private static int m1972a(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (i4 << 8) | (bArr[i] & MotionEventCompat.ACTION_MASK);
            i += i3;
            i2 = i5;
        }
    }

    public static ae m1973a(Context context) {
        if (f2072b == null) {
            ae aeVar = new ae(context);
            f2072b = aeVar;
            try {
                aeVar.f2074c = aeVar.f2073a.openOrCreateDatabase("etagcache.db", 0, null);
                if (!(aeVar.f2074c == null || aeVar.f2074c.getVersion() == 1)) {
                    aeVar.f2074c.beginTransaction();
                    try {
                        aeVar.f2074c.execSQL("DROP TABLE IF EXISTS etagcache");
                        aeVar.f2074c.setVersion(1);
                        aeVar.f2074c.execSQL("CREATE TABLE etagcache (_id INTEGER PRIMARY KEY, resurl TEXT, filename TEXT, lastmodify TEXT, etag TEXT,  UNIQUE (resurl) ON CONFLICT REPLACE);");
                        aeVar.f2074c.execSQL("CREATE INDEX cacheUrlIndex ON etagcache (resurl)");
                        aeVar.f2074c.setTransactionSuccessful();
                    } finally {
                        aeVar = aeVar.f2074c;
                        aeVar.endTransaction();
                    }
                }
                if (aeVar.f2074c != null) {
                    aeVar.f2075d = new InsertHelper(aeVar.f2074c, "etagcache");
                    aeVar.f2076e = aeVar.f2075d.getColumnIndex("resurl");
                    aeVar.f2077f = aeVar.f2075d.getColumnIndex("filename");
                    aeVar.f2078g = aeVar.f2075d.getColumnIndex("lastmodify");
                    aeVar.f2079h = aeVar.f2075d.getColumnIndex("etag");
                }
            } catch (SQLiteException e) {
                throw new LuaError("Error in creating database for ETagCache." + e.getMessage(), 1800);
            }
        }
        return f2072b;
    }

    public final void m1974a(String str) {
        if (str != null && this.f2074c != null) {
            this.f2074c.execSQL("DELETE FROM etagcache WHERE resurl = ?", new String[]{str});
        }
    }

    public final void m1975a(af afVar) {
        if (afVar != null && afVar.f2083d != null && this.f2074c != null) {
            synchronized (this) {
                this.f2075d.prepareForInsert();
                this.f2075d.bind(this.f2076e, afVar.f2083d);
                this.f2075d.bind(this.f2077f, afVar.f2080a);
                this.f2075d.bind(this.f2078g, afVar.f2082c);
                this.f2075d.bind(this.f2079h, afVar.f2081b);
                this.f2075d.execute();
            }
        }
    }

    public final af m1976b(String str) {
        Cursor rawQuery;
        Throwable e;
        if (str == null || this.f2074c == null) {
            return null;
        }
        synchronized (this) {
            try {
                rawQuery = this.f2074c.rawQuery("SELECT etag, filename, lastmodify, resurl FROM etagcache WHERE resurl = ?", new String[]{str});
                try {
                    if (rawQuery.moveToFirst()) {
                        af afVar = new af(this);
                        afVar.f2081b = rawQuery.getString(0);
                        afVar.f2080a = rawQuery.getString(1);
                        afVar.f2082c = rawQuery.getString(2);
                        afVar.f2083d = rawQuery.getString(3);
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        return afVar;
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return null;
                } catch (IllegalStateException e2) {
                    e = e2;
                    try {
                        if (KonyMain.f3659g) {
                            Log.e("ETag Cache", "getCache", e);
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        e = th;
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        throw e;
                    }
                }
            } catch (IllegalStateException e3) {
                e = e3;
                rawQuery = null;
                if (KonyMain.f3659g) {
                    Log.e("ETag Cache", "getCache", e);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                e = th2;
                rawQuery = null;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw e;
            }
        }
    }
}
