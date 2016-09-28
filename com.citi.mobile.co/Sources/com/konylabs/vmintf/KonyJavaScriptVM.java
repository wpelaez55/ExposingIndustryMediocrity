package com.konylabs.vmintf;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.C0128a;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0355d;
import com.konylabs.api.C0360i;
import com.konylabs.api.C0362k;
import com.konylabs.api.C0369u;
import com.konylabs.api.C0432b;
import com.konylabs.api.aF;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.js.api.C0376A;
import com.konylabs.js.api.C0377B;
import com.konylabs.js.api.C0378C;
import com.konylabs.js.api.C0379D;
import com.konylabs.js.api.C0380E;
import com.konylabs.js.api.C0381F;
import com.konylabs.js.api.C0382G;
import com.konylabs.js.api.C0383H;
import com.konylabs.js.api.C0384I;
import com.konylabs.js.api.C0385J;
import com.konylabs.js.api.C0386K;
import com.konylabs.js.api.C0387L;
import com.konylabs.js.api.C0388M;
import com.konylabs.js.api.C0389N;
import com.konylabs.js.api.C0390O;
import com.konylabs.js.api.C0391P;
import com.konylabs.js.api.C0392a;
import com.konylabs.js.api.C0393b;
import com.konylabs.js.api.C0394c;
import com.konylabs.js.api.C0395d;
import com.konylabs.js.api.C0396e;
import com.konylabs.js.api.C0397f;
import com.konylabs.js.api.C0398g;
import com.konylabs.js.api.C0399h;
import com.konylabs.js.api.C0400i;
import com.konylabs.js.api.C0401m;
import com.konylabs.js.api.C0402o;
import com.konylabs.js.api.C0403p;
import com.konylabs.js.api.C0404q;
import com.konylabs.js.api.C0405r;
import com.konylabs.js.api.C0406s;
import com.konylabs.js.api.C0407t;
import com.konylabs.js.api.C0408v;
import com.konylabs.js.api.C0409w;
import com.konylabs.js.api.C0410x;
import com.konylabs.js.api.C0411y;
import com.konylabs.js.api.C0412z;
import com.konylabs.js.api.C0437j;
import com.konylabs.js.api.C0438k;
import com.konylabs.js.api.C0439l;
import com.konylabs.js.api.C0440n;
import com.konylabs.js.api.C0441u;
import com.konylabs.js.api.KonyJSONString;
import com.konylabs.js.api.KonyJSObject;
import com.konylabs.js.debug.DebuggerWaitControl;
import com.konylabs.libintf.C0235a;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.libintf.Library;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.Function;
import com.konylabs.vm.KonyJSException;
import com.konylabs.vm.LuaError;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import ny0k.C0281O;
import ny0k.C0286W;
import ny0k.cN;

public final class KonyJavaScriptVM implements C0253a, C0254b {
    public static Library[] f3162a;
    private static long f3163b;
    private static String f3164c;
    private C0235a f3165d;
    private C0261i f3166e;

    static {
        f3163b = -1;
        f3164c = "KonyJavaScriptVM";
        f3162a = null;
    }

    public KonyJavaScriptVM() {
        this.f3165d = null;
    }

    public static void m3387a(String str, String[] strArr, C0261i c0261i) {
        if (KonyMain.m4059E() == 3) {
            ((KonyJavaScriptVM) KonyMain.m4143x()).m3393c(str, strArr, c0261i);
            return;
        }
        int appSourceLocation = KonyMain.getActContext().getAppSourceLocation();
        if (appSourceLocation == 2) {
            ((KonyJavaScriptVM) KonyMain.m4143x()).m3390b(str, strArr, c0261i);
        } else if (appSourceLocation == 1) {
            ((KonyJavaScriptVM) KonyMain.m4143x()).m3393c(str, strArr, c0261i);
        }
    }

    private synchronized void m3388a(byte[] bArr, String[] strArr, C0261i c0261i) {
        this.f3166e = c0261i;
        loadFilesToVM(bArr, KonyMain.f3656d, strArr);
    }

    private static long[] m3389a(ArrayList arrayList) {
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((LuaWidget) arrayList.get(i)).getJSObject();
        }
        return jArr;
    }

    private synchronized void m3390b(String str, String[] strArr, C0261i c0261i) {
        InputStream open;
        Object e;
        Throwable th;
        byte[] bArr = null;
        synchronized (this) {
            ByteArrayOutputStream byteArrayOutputStream;
            try {
                open = KonyMain.getAppContext().getAssets().open("js/" + str);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                        while (true) {
                            int read = open.read(bArr2, 0, bArr2.length);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        bArr = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                        }
                        if (open != null) {
                            try {
                                open.close();
                            } catch (IOException e3) {
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        try {
                            if (KonyMain.f3657e) {
                                Log.d(f3164c, "Error while reading module file: " + str + e);
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e5) {
                                }
                            }
                            if (open != null) {
                                try {
                                    open.close();
                                } catch (IOException e6) {
                                }
                            }
                            m3388a(bArr, strArr, c0261i);
                        } catch (Throwable th2) {
                            th = th2;
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e7) {
                                }
                            }
                            if (open != null) {
                                try {
                                    open.close();
                                } catch (IOException e8) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e9) {
                    e = e9;
                    byteArrayOutputStream = bArr;
                    if (KonyMain.f3657e) {
                        Log.d(f3164c, "Error while reading module file: " + str + e);
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    if (open != null) {
                        open.close();
                    }
                    m3388a(bArr, strArr, c0261i);
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = bArr;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    if (open != null) {
                        open.close();
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                open = bArr;
                byteArrayOutputStream = bArr;
                if (KonyMain.f3657e) {
                    Log.d(f3164c, "Error while reading module file: " + str + e);
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (open != null) {
                    open.close();
                }
                m3388a(bArr, strArr, c0261i);
            } catch (Throwable th4) {
                th = th4;
                open = bArr;
                byteArrayOutputStream = bArr;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (open != null) {
                    open.close();
                }
                throw th;
            }
            m3388a(bArr, strArr, c0261i);
        }
    }

    private boolean m3391b(String str) {
        ZipInputStream zipInputStream;
        ByteBuffer allocate;
        boolean z = true;
        boolean z2 = false;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            InputStream open = KonyMain.getAppContext().getAssets().open(str);
            int D = KonyMain.m4058D();
            if (D == 0) {
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                String str2 = new String(bArr);
                if (KonyMain.f3657e) {
                    Log.d(f3164c, "************** Compiling Script file : " + str);
                }
                KonyJSException compileScript = compileScript(str2, str);
                if (compileScript != null) {
                    this.f3165d.m1620a(605, compileScript.getMessage());
                    z = false;
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                if (D == 2) {
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                    while (true) {
                        int read = open.read(bArr2, 0, bArr2.length);
                        if (read != -1) {
                            byteArrayOutputStream3.write(bArr2, 0, read);
                        } else {
                            byteArrayOutputStream3.flush();
                            loadFilesToVM(byteArrayOutputStream3.toByteArray(), KonyMain.f3656d, null);
                            return true;
                        }
                    }
                }
                zipInputStream = new ZipInputStream(open);
                allocate = ByteBuffer.allocate(204800);
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        break;
                    } else if (nextEntry.getName().endsWith(".js")) {
                        while (true) {
                            int read2 = zipInputStream.read(allocate.array());
                            if (read2 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(allocate.array(), 0, read2);
                        }
                        KonyJSException compileScript2 = compileScript(byteArrayOutputStream.toString(), nextEntry.getName());
                        if (compileScript2 != null) {
                            this.f3165d.m1620a(605, compileScript2.getMessage());
                            z = false;
                        }
                        byteArrayOutputStream.reset();
                    }
                }
                zipInputStream.close();
                byteArrayOutputStream.close();
                allocate.clear();
            }
            open.close();
            z2 = z;
        } catch (Exception e) {
            this.f3165d.m1620a(605, e.getMessage());
        } catch (Throwable th) {
            this.f3165d.m1620a(605, th.getMessage());
        }
        return z2;
    }

    public static long m3392c() {
        return f3163b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m3393c(java.lang.String r19, java.lang.String[] r20, com.konylabs.vmintf.C0261i r21) {
        /*
        r18 = this;
        monitor-enter(r18);
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r5 = 0;
        r3 = 0;
        r2 = 0;
        r9 = 1;
        r1 = com.konylabs.android.KonyMain.m4143x();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r1 = (com.konylabs.vmintf.KonyJavaScriptVM) r1;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        if (r20 == 0) goto L_0x0192;
    L_0x0010:
        r4 = com.konylabs.android.KonyMain.getAppContext();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r0 = r19;
        r4 = r4.getFileStreamPath(r0);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = com.konylabs.android.KonyMain.m4059E();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        if (r10 != 0) goto L_0x00fa;
    L_0x0020:
        r10 = r4.exists();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        if (r10 == 0) goto L_0x002c;
    L_0x0026:
        r10 = r4.isFile();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        if (r10 != 0) goto L_0x00bf;
    L_0x002c:
        r10 = new java.io.BufferedInputStream;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = com.konylabs.android.KonyMain.getAppContext();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = r11.getAssets();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r12 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r12.<init>();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r13 = "js/";
        r12 = r12.append(r13);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r0 = r19;
        r12 = r12.append(r0);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r12 = r12.toString();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = r11.open(r12);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10.<init>(r11);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = new java.io.BufferedOutputStream;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r12 = com.konylabs.android.KonyMain.getAppContext();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r13 = 0;
        r0 = r19;
        r12 = r12.openFileOutput(r0, r13);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11.<init>(r12);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r12 = 5120; // 0x1400 float:7.175E-42 double:2.5296E-320;
        r12 = new byte[r12];	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
    L_0x0066:
        r13 = r10.read(r12);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r14 = -1;
        if (r13 == r14) goto L_0x00b9;
    L_0x006d:
        r14 = 0;
        r11.write(r12, r14, r13);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        goto L_0x0066;
    L_0x0072:
        r1 = move-exception;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
    L_0x0077:
        r8 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x02a1 }
        if (r8 == 0) goto L_0x0096;
    L_0x007b:
        r8 = f3164c;	 Catch:{ all -> 0x02a1 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a1 }
        r9.<init>();	 Catch:{ all -> 0x02a1 }
        r10 = "Failed to unzip and compile: ";
        r9 = r9.append(r10);	 Catch:{ all -> 0x02a1 }
        r9 = r9.append(r1);	 Catch:{ all -> 0x02a1 }
        r9 = r9.toString();	 Catch:{ all -> 0x02a1 }
        android.util.Log.d(r8, r9);	 Catch:{ all -> 0x02a1 }
        r1.printStackTrace();	 Catch:{ all -> 0x02a1 }
    L_0x0096:
        r1 = 0;
        if (r4 == 0) goto L_0x009c;
    L_0x0099:
        r4.close();	 Catch:{ IOException -> 0x0275 }
    L_0x009c:
        if (r3 == 0) goto L_0x00a1;
    L_0x009e:
        r3.close();	 Catch:{ IOException -> 0x0278 }
    L_0x00a1:
        if (r2 == 0) goto L_0x02e4;
    L_0x00a3:
        r2.close();	 Catch:{ IOException -> 0x025b }
        r3 = r1;
        r2 = r6;
        r1 = r5;
    L_0x00a9:
        if (r7 == 0) goto L_0x00b0;
    L_0x00ab:
        r1 = 1;
        r2 = r7.getMessage();	 Catch:{ all -> 0x0132 }
    L_0x00b0:
        if (r21 == 0) goto L_0x00b7;
    L_0x00b2:
        r0 = r21;
        r0.m1784a(r2, r1, r7);	 Catch:{ all -> 0x0132 }
    L_0x00b7:
        monitor-exit(r18);
        return r3;
    L_0x00b9:
        r10.close();	 Catch:{ Exception -> 0x0261, all -> 0x0121 }
    L_0x00bc:
        r11.close();	 Catch:{ Exception -> 0x0264, all -> 0x0121 }
    L_0x00bf:
        r11 = new java.util.zip.ZipFile;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11.<init>(r4);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r0 = r20;
        r12 = r0.length;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r4 = 0;
        r10 = r4;
    L_0x00c9:
        if (r10 >= r12) goto L_0x0301;
    L_0x00cb:
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x02a5, all -> 0x0121 }
        r4.<init>();	 Catch:{ Exception -> 0x02a5, all -> 0x0121 }
        r5 = r20[r10];	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        r5 = r11.getEntry(r5);	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        if (r5 != 0) goto L_0x0135;
    L_0x00d8:
        r7 = r20[r10];	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        r6 = 2;
        r5 = r6;
        r6 = r7;
        r7 = r8;
    L_0x00de:
        r11.close();	 Catch:{ Exception -> 0x02ac, all -> 0x0284 }
        r16 = r2;
        r2 = r4;
        r4 = r3;
        r3 = r16;
    L_0x00e7:
        if (r2 == 0) goto L_0x00ec;
    L_0x00e9:
        r2.close();	 Catch:{ IOException -> 0x026f }
    L_0x00ec:
        if (r4 == 0) goto L_0x00f1;
    L_0x00ee:
        r4.close();	 Catch:{ IOException -> 0x0272 }
    L_0x00f1:
        if (r3 == 0) goto L_0x02e9;
    L_0x00f3:
        r3.close();	 Catch:{ IOException -> 0x0255 }
        r3 = r9;
        r1 = r5;
        r2 = r6;
        goto L_0x00a9;
    L_0x00fa:
        r4 = new java.io.File;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10.<init>();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = com.konylabs.android.C0128a.m16a();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = r11.m26b();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = "/";
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r0 = r19;
        r10 = r10.append(r0);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = r10.toString();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r4.<init>(r10);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        goto L_0x00bf;
    L_0x0121:
        r1 = move-exception;
    L_0x0122:
        if (r5 == 0) goto L_0x0127;
    L_0x0124:
        r5.close();	 Catch:{ IOException -> 0x027b }
    L_0x0127:
        if (r3 == 0) goto L_0x012c;
    L_0x0129:
        r3.close();	 Catch:{ IOException -> 0x027e }
    L_0x012c:
        if (r2 == 0) goto L_0x0131;
    L_0x012e:
        r2.close();	 Catch:{ IOException -> 0x0281 }
    L_0x0131:
        throw r1;	 Catch:{ all -> 0x0132 }
    L_0x0132:
        r1 = move-exception;
        monitor-exit(r18);
        throw r1;
    L_0x0135:
        r3 = r11.getInputStream(r5);	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        r5 = 204800; // 0x32000 float:2.86986E-40 double:1.011846E-318;
        r5 = java.nio.ByteBuffer.allocate(r5);	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
    L_0x0140:
        r13 = r5.array();	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        r13 = r3.read(r13);	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        r14 = -1;
        if (r13 == r14) goto L_0x015a;
    L_0x014b:
        r14 = r5.array();	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        r15 = 0;
        r4.write(r14, r15, r13);	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        goto L_0x0140;
    L_0x0154:
        r1 = move-exception;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x0077;
    L_0x015a:
        r5 = r4.toString();	 Catch:{ Exception -> 0x0154, all -> 0x0284 }
        r4.close();	 Catch:{ Exception -> 0x0267, all -> 0x0284 }
    L_0x0161:
        r4 = 0;
        r3.close();	 Catch:{ Exception -> 0x026a, all -> 0x0288 }
    L_0x0165:
        r3 = 0;
        r13 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        if (r13 == 0) goto L_0x0184;
    L_0x016a:
        r13 = f3164c;	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        r14 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        r14.<init>();	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        r15 = "Compiling....... ";
        r14 = r14.append(r15);	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        r15 = r20[r10];	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        r14 = r14.append(r15);	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        r14 = r14.toString();	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        android.util.Log.d(r13, r14);	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
    L_0x0184:
        r13 = r20[r10];	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        r8 = r1.compileScript(r5, r13);	 Catch:{ Exception -> 0x0154, all -> 0x0288 }
        if (r8 != 0) goto L_0x02fc;
    L_0x018c:
        r5 = r10 + 1;
        r10 = r5;
        r5 = r4;
        goto L_0x00c9;
    L_0x0192:
        r4 = com.konylabs.android.KonyMain.m4059E();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = 3;
        if (r4 != r10) goto L_0x0202;
    L_0x0199:
        r4 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10.<init>();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = com.konylabs.android.C0128a.m16a();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = r11.m26b();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = "/";
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r0 = r19;
        r10 = r10.append(r0);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = r10.toString();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r4.<init>(r10);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
    L_0x01bf:
        r3 = new java.util.zip.ZipInputStream;	 Catch:{ Exception -> 0x02af, all -> 0x028c }
        r3.<init>(r4);	 Catch:{ Exception -> 0x02af, all -> 0x028c }
        r2 = 204800; // 0x32000 float:2.86986E-40 double:1.011846E-318;
        r10 = java.nio.ByteBuffer.allocate(r2);	 Catch:{ Exception -> 0x02b7, all -> 0x0290 }
    L_0x01cb:
        r2 = r3.getNextEntry();	 Catch:{ Exception -> 0x02cf, all -> 0x0290 }
        if (r2 == 0) goto L_0x02f6;
    L_0x01d1:
        r11 = r2.getName();	 Catch:{ Exception -> 0x02cf, all -> 0x0290 }
        r2 = "workerthreads/";
        r2 = r11.startsWith(r2);	 Catch:{ Exception -> 0x02cf, all -> 0x0290 }
        if (r2 != 0) goto L_0x01cb;
    L_0x01dd:
        r2 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x02cf, all -> 0x0290 }
        r2.<init>();	 Catch:{ Exception -> 0x02cf, all -> 0x0290 }
    L_0x01e2:
        r5 = r10.array();	 Catch:{ Exception -> 0x01f6, all -> 0x029b }
        r5 = r3.read(r5);	 Catch:{ Exception -> 0x01f6, all -> 0x029b }
        r12 = -1;
        if (r5 == r12) goto L_0x0224;
    L_0x01ed:
        r12 = r10.array();	 Catch:{ Exception -> 0x01f6, all -> 0x029b }
        r13 = 0;
        r2.write(r12, r13, r5);	 Catch:{ Exception -> 0x01f6, all -> 0x029b }
        goto L_0x01e2;
    L_0x01f6:
        r1 = move-exception;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r16 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x0077;
    L_0x0202:
        r4 = com.konylabs.android.KonyMain.getAppContext();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r4 = r4.getAssets();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10.<init>();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r11 = "js/";
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r0 = r19;
        r10 = r10.append(r0);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r10 = r10.toString();	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        r4 = r4.open(r10);	 Catch:{ Exception -> 0x0072, all -> 0x0121 }
        goto L_0x01bf;
    L_0x0224:
        r5 = r2.toString();	 Catch:{ Exception -> 0x01f6, all -> 0x029b }
        r2.close();	 Catch:{ Exception -> 0x026d, all -> 0x029b }
    L_0x022b:
        r2 = 0;
        r12 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        if (r12 == 0) goto L_0x0248;
    L_0x0230:
        r12 = f3164c;	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        r13 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        r13.<init>();	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        r14 = "Compiling....... ";
        r13 = r13.append(r14);	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        r13 = r13.append(r11);	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        r13 = r13.toString();	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        android.util.Log.d(r12, r13);	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
    L_0x0248:
        r5 = r1.compileScript(r5, r11);	 Catch:{ Exception -> 0x02d8, all -> 0x0295 }
        if (r5 != 0) goto L_0x02ee;
    L_0x024e:
        r3.closeEntry();	 Catch:{ Exception -> 0x02c0, all -> 0x0295 }
        r8 = r5;
        r5 = r2;
        goto L_0x01cb;
    L_0x0255:
        r1 = move-exception;
        r3 = r9;
        r1 = r5;
        r2 = r6;
        goto L_0x00a9;
    L_0x025b:
        r2 = move-exception;
        r3 = r1;
        r2 = r6;
        r1 = r5;
        goto L_0x00a9;
    L_0x0261:
        r10 = move-exception;
        goto L_0x00bc;
    L_0x0264:
        r10 = move-exception;
        goto L_0x00bf;
    L_0x0267:
        r4 = move-exception;
        goto L_0x0161;
    L_0x026a:
        r3 = move-exception;
        goto L_0x0165;
    L_0x026d:
        r2 = move-exception;
        goto L_0x022b;
    L_0x026f:
        r1 = move-exception;
        goto L_0x00ec;
    L_0x0272:
        r1 = move-exception;
        goto L_0x00f1;
    L_0x0275:
        r4 = move-exception;
        goto L_0x009c;
    L_0x0278:
        r3 = move-exception;
        goto L_0x00a1;
    L_0x027b:
        r4 = move-exception;
        goto L_0x0127;
    L_0x027e:
        r3 = move-exception;
        goto L_0x012c;
    L_0x0281:
        r2 = move-exception;
        goto L_0x0131;
    L_0x0284:
        r1 = move-exception;
        r5 = r4;
        goto L_0x0122;
    L_0x0288:
        r1 = move-exception;
        r5 = r4;
        goto L_0x0122;
    L_0x028c:
        r1 = move-exception;
        r3 = r4;
        goto L_0x0122;
    L_0x0290:
        r1 = move-exception;
        r2 = r3;
        r3 = r4;
        goto L_0x0122;
    L_0x0295:
        r1 = move-exception;
        r5 = r2;
        r2 = r3;
        r3 = r4;
        goto L_0x0122;
    L_0x029b:
        r1 = move-exception;
        r5 = r2;
        r2 = r3;
        r3 = r4;
        goto L_0x0122;
    L_0x02a1:
        r1 = move-exception;
        r5 = r4;
        goto L_0x0122;
    L_0x02a5:
        r1 = move-exception;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x0077;
    L_0x02ac:
        r1 = move-exception;
        goto L_0x0077;
    L_0x02af:
        r1 = move-exception;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x0077;
    L_0x02b7:
        r1 = move-exception;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x0077;
    L_0x02c0:
        r1 = move-exception;
        r16 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r16;
        r17 = r6;
        r6 = r7;
        r7 = r5;
        r5 = r17;
        goto L_0x0077;
    L_0x02cf:
        r1 = move-exception;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x0077;
    L_0x02d8:
        r1 = move-exception;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r16 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x0077;
    L_0x02e4:
        r3 = r1;
        r2 = r6;
        r1 = r5;
        goto L_0x00a9;
    L_0x02e9:
        r3 = r9;
        r1 = r5;
        r2 = r6;
        goto L_0x00a9;
    L_0x02ee:
        r16 = r6;
        r6 = r7;
        r7 = r5;
        r5 = r16;
        goto L_0x00e7;
    L_0x02f6:
        r2 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x00e7;
    L_0x02fc:
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x00de;
    L_0x0301:
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        goto L_0x00de;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.vmintf.KonyJavaScriptVM.c(java.lang.String, java.lang.String[], com.konylabs.vmintf.i):boolean");
    }

    private static boolean m3394d() {
        return KonyMain.f3655c.m2134b() != 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3395e() {
        /*
        r7 = this;
        r2 = 1;
        r1 = 0;
        r0 = "com.konylabs.js.appsrc.PaaSLicenseSource";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r0 = (com.konylabs.js.appsrc.KonyJavaScriptSource) r0;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r3 = "license.js";
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        if (r4 == 0) goto L_0x002c;
    L_0x0014:
        r4 = f3164c;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r5 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r5.<init>();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r6 = "************** Compiling Script file : ";
        r5 = r5.append(r6);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r5 = r5.append(r3);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r5 = r5.toString();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        android.util.Log.d(r4, r5);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
    L_0x002c:
        r4 = r0.getSource();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        if (r4 == 0) goto L_0x0037;
    L_0x0032:
        if (r4 == 0) goto L_0x005a;
    L_0x0034:
        r0 = r4.length;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        if (r0 != 0) goto L_0x005a;
    L_0x0037:
        r0 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        if (r0 == 0) goto L_0x0059;
    L_0x003b:
        r0 = f3164c;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r4 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r4.<init>();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r5 = "************** PaaS ";
        r4 = r4.append(r5);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r3 = r4.append(r3);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r4 = " file is empty";
        r3 = r3.append(r4);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r3 = r3.toString();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        android.util.Log.d(r0, r3);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
    L_0x0059:
        return r2;
    L_0x005a:
        r5 = new java.lang.StringBuffer;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r5.<init>();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r0 = r1;
    L_0x0060:
        r6 = r4.length;	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        if (r0 >= r6) goto L_0x006f;
    L_0x0063:
        r6 = r4[r0];	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        if (r6 == 0) goto L_0x006c;
    L_0x0067:
        r6 = r4[r0];	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r5.append(r6);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
    L_0x006c:
        r0 = r0 + 1;
        goto L_0x0060;
    L_0x006f:
        r0 = r5.toString();	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r0 = r7.compileScript(r0, r3);	 Catch:{ ClassNotFoundException -> 0x0088, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        if (r0 == 0) goto L_0x00a2;
    L_0x0079:
        r2 = r7.f3165d;	 Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r3 = 605; // 0x25d float:8.48E-43 double:2.99E-321;
        r0 = r0.getMessage();	 Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r2.m1620a(r3, r0);	 Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x0096, InstantiationException -> 0x009b }
        r0 = r1;
    L_0x0085:
        r1 = r0;
    L_0x0086:
        r2 = r1;
        goto L_0x0059;
    L_0x0088:
        r0 = move-exception;
        r1 = r2;
    L_0x008a:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0086;
    L_0x008e:
        r0 = f3164c;
        r2 = "************** PaaS license.js not found *************";
        android.util.Log.d(r0, r2);
        goto L_0x0086;
    L_0x0096:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0086;
    L_0x009b:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0086;
    L_0x00a0:
        r0 = move-exception;
        goto L_0x008a;
    L_0x00a2:
        r0 = r2;
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.vmintf.KonyJavaScriptVM.e():boolean");
    }

    public final long m3396a(LuaWidget luaWidget, String str, boolean z) {
        if (KonyMain.f3657e) {
            Log.d(f3164c, "++++++++++++++++++++++++++++++++++ Cloning js object: " + str);
        }
        return cloneJSObject(luaWidget, luaWidget.getJSObject(), str, z);
    }

    public final Function m3397a(String str) {
        long jSFunction = getJSFunction(f3163b, str);
        return jSFunction != 0 ? new Function(jSFunction, null, 0) : null;
    }

    public final void m3398a() {
        KonyMain.m4121f().post(new C0256d(this));
    }

    public final void m3399a(int i) {
        KonyMain.m4121f().post(new C0255c(this, i));
    }

    public final void m3400a(Message message) {
        if (message.obj != null) {
            try {
                Bundle data = message.getData();
                if (data == null || data.size() <= 0) {
                    ((Function) message.obj).execute(null);
                    return;
                }
                Object[] objArr = new Object[data.size()];
                for (int i = 0; i < data.size(); i++) {
                    objArr[i] = data.get("key" + i);
                }
                Serializable serializable = data.getSerializable("this");
                if (serializable == null || !(serializable instanceof KonyJSObject)) {
                    ((Function) message.obj).execute(objArr);
                } else {
                    ((Function) message.obj).m1637a(objArr, (KonyJSObject) serializable);
                }
            } catch (Throwable e) {
                if (KonyMain.f3657e) {
                    Log.d(f3164c, BuildConfig.FLAVOR + e.getMessage(), e);
                }
                if (e instanceof LuaError) {
                    throw ((LuaError) e);
                }
                throw new LuaError("Error in JavaScript callback invocation at " + e.getMessage(), 605);
            }
        }
    }

    public final void m3401a(LuaWidget luaWidget, LuaWidget luaWidget2) {
        if (KonyMain.f3657e) {
            Log.d(f3164c, "++++++++++++++++++++++++++++++++++ Adding native clone to parent scope: " + luaWidget2.getID());
        }
        addToParentScope(luaWidget.getJSObject(), new long[]{luaWidget2.getJSObject()});
    }

    public final void m3402a(LuaWidget luaWidget, ArrayList arrayList) {
        if (KonyMain.f3657e) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Log.d(f3164c, "++++++++++++++++++++++++++++++++++ Adding native clone to parent scope: " + ((LuaWidget) arrayList.get(i)).getID());
            }
        }
        addToParentScope(luaWidget.getJSObject(), m3389a(arrayList));
    }

    public final void m3403a(Library library, int i) {
        if (library != null) {
            String[] split = library.getNameSpace().split("\\.");
            if (i == 1) {
                registerFFILibrary(f3163b, split, library, ((JSLibrary) library).getClasses());
            } else if (i == 2) {
                registerCustomWidgetLibrary(f3163b, split, library, ((JSLibrary) library).getClasses());
            }
        }
    }

    public final void m3404a(C0235a c0235a) {
        this.f3165d = c0235a;
    }

    public final void m3405a(C0245j c0245j) {
        if (c0245j != null) {
            c0245j.m1728a(new C0257e(this));
        } else {
            KonyMain.m4121f().post(new C0258f(this));
        }
    }

    public final boolean m3406a(KonyJSONString konyJSONString) {
        return parseJSONString(konyJSONString);
    }

    public final native void addToParentScope(long j, long[] jArr);

    public final void m3407b(LuaWidget luaWidget, LuaWidget luaWidget2) {
        if (KonyMain.f3657e) {
            Log.d(f3164c, "------------------------- Removing native clone from parent scope: " + luaWidget2.getID());
        }
        removeFromParentScope(luaWidget.getJSObject(), new long[]{luaWidget2.getJSObject()});
    }

    public final void m3408b(LuaWidget luaWidget, ArrayList arrayList) {
        if (KonyMain.f3657e) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Log.d(f3164c, "---------------------- Removing native clone from parent scope: " + ((LuaWidget) arrayList.get(i)).getID());
            }
        }
        removeFromParentScope(luaWidget.getJSObject(), m3389a(arrayList));
    }

    public final void m3409b(KonyJSONString konyJSONString) {
        cleanupJSONObject(konyJSONString);
    }

    public final void m3410b(C0245j c0245j) {
        if (Thread.currentThread() == KonyMain.m4121f().getLooper().getThread() || (c0245j != null && c0245j.m1725a() == Thread.currentThread())) {
            notifyV8GC();
        } else if (c0245j != null) {
            c0245j.m1728a(new C0259g(this));
        } else {
            KonyMain.m4121f().post(new C0260h(this));
        }
    }

    public final boolean m3411b() {
        if (!KonyMain.f3657e || KonyMain.f3661i || m3394d() || KonyMain.m4059E() != 0) {
            m3412b(0);
        } else {
            DebuggerWaitControl.show(this);
        }
        return true;
    }

    public final boolean m3412b(int i) {
        int i2 = 0;
        if (f3162a == null) {
            f3162a = new Library[]{new C0412z(), new C0393b(), new C0394c(), new C0402o(), new C0404q(), new C0409w(), new C0376A(), new C0369u(KonyMain.getAppContext()), new C0387L(), new C0391P(), new C0405r(), new C0398g(), new C0400i(), new C0378C(), new C0379D(), new C0382G(), new C0385J(), null, new C0388M(), new C0390O(), new C0377B(), new C0411y(), new C0381F(), new C0383H(), new C0395d(), new C0406s(), new C0407t(), new C0410x(), new C0384I(), new C0389N(), new C0392a(), new C0396e(), new C0380E(), new C0386K(), new C0408v(), new C0399h(), new C0432b(), new C0360i(KonyMain.getAppContext()), new C0362k(KonyMain.getAppContext()), new C0397f(), new C0441u(), new C0440n(), new C0355d(), new C0401m(), new C0437j(), new C0438k(), new C0439l(), new C0403p(), new aF()};
            System.loadLibrary("konyjsvm");
        }
        long initVM = initVM(f3162a, i);
        f3163b = initVM;
        if (initVM != -1) {
            HashMap c = C0286W.m1855c();
            KonyJSVM.InstallRuntimeConstants(f3163b, c.keySet().toArray(), c.values().toArray());
        }
        cN.m2154e();
        if (m3394d()) {
            try {
                InputStream openFileInput = KonyMain.getAppContext().openFileInput("preview.js");
                byte[] bArr = new byte[openFileInput.available()];
                openFileInput.read(bArr);
                String str = new String(bArr);
                Log.d(f3164c, "Compiling Preview JS Script file : preview.js");
                KonyJSException compileScript = compileScript(str, "preview.js");
                if (compileScript != null) {
                    this.f3165d.m1620a(605, compileScript.getMessage());
                }
                openFileInput.close();
            } catch (Exception e) {
                this.f3165d.m1620a(605, e.getMessage());
            }
        } else if (KonyMain.m4059E() == 3) {
            C0128a.m16a();
            if (C0128a.m16a() != null) {
                m3393c("src.zip", new String[]{"konylibrary.js", "require.js"}, null);
                if (!C0281O.m1812a()) {
                    m3393c("src.zip", null, null);
                } else if (!C0281O.m1815b()) {
                    this.f3165d.m1620a(1251, "Unable to load startup module");
                }
            }
        } else {
            if (KonyMain.f3657e) {
                Log.d(f3164c, "************** Loading JavaScript source from Assets *************");
            }
            if (m3395e()) {
                m3387a("common-jslibs.kfm", null, null);
                if (!C0281O.m1812a()) {
                    try {
                        String[] list = KonyMain.getAppContext().getAssets().list("js");
                        int i3 = 0;
                        boolean z = true;
                        while (i3 < list.length) {
                            if (list[i3].endsWith(".js") || list[i3].endsWith(".mp3")) {
                                String str2 = "js/" + list[i3];
                                if (list[i3].equals("startup.js")) {
                                    i2 = 1;
                                } else {
                                    z = m3391b(str2);
                                    if (!z) {
                                        break;
                                    }
                                }
                            }
                            i3++;
                        }
                        if (z && r0 != 0) {
                            m3391b("js/startup.js");
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } else if (!C0281O.m1815b()) {
                    this.f3165d.m1620a(1251, "Unable to load startup module");
                }
            }
        }
        return true;
    }

    public final native void cleanupJSONObject(KonyJSONString konyJSONString);

    public final native long cloneJSObject(Object obj, long j, String str, boolean z);

    public final native KonyJSException compileScript(String str, String str2);

    public final native void exitVM(long j);

    public final native long getJSFunction(long j, String str);

    public final native long initVM(Library[] libraryArr, int i);

    public final native long initWorkerVM(Library[] libraryArr);

    public final void loadFiles(String str, int i, KonyJSException konyJSException) {
        if (KonyMain.f3657e) {
            Log.d(f3164c, "************** Compiling Script file : " + str + "value" + i);
        }
        if (konyJSException != null && KonyMain.f3657e) {
            Log.d(f3164c, "************** error is  : " + konyJSException.toString());
        }
        if (this.f3166e != null) {
            this.f3166e.m1784a(str, i, konyJSException);
        }
        this.f3166e = null;
    }

    public final native void loadFilesToVM(byte[] bArr, int i, Object[] objArr);

    public final native synchronized void notifyV8GC();

    public final native boolean parseJSONString(KonyJSONString konyJSONString);

    public final native void registerCustomWidgetLibrary(long j, Object[] objArr, Library library, Object[] objArr2);

    public final native void registerFFILibrary(long j, Object[] objArr, Library library, Object[] objArr2);

    public final native void removeFromParentScope(long j, long[] jArr);

    public final native synchronized void v8GC();
}
