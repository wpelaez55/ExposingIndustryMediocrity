package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.js.api.KonyJSObject;
import com.konylabs.vmintf.KonyJSVM;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: ny0k.U */
public final class C0442U extends KonyJSObject {
    private File f3583a;

    public C0442U(File file, long j) {
        this.f3583a = file;
        this.ap = j;
    }

    public C0442U(String str, long j) {
        this.f3583a = new File(str);
        this.ap = j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File m3992a(java.io.File r10, java.io.File r11, java.lang.String r12) {
        /*
        r9 = this;
        r7 = 0;
        r0 = r11.isFile();
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r7;
    L_0x0008:
        r0 = r10.isFile();
        if (r0 == 0) goto L_0x00ae;
    L_0x000e:
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0045, all -> 0x00a0 }
        r0.<init>(r10);	 Catch:{ IOException -> 0x0045, all -> 0x00a0 }
        r1 = r0.getChannel();	 Catch:{ IOException -> 0x0045, all -> 0x00a0 }
        r6 = new java.io.File;	 Catch:{ IOException -> 0x0111, all -> 0x0105 }
        if (r12 == 0) goto L_0x003d;
    L_0x001b:
        r6.<init>(r11, r12);	 Catch:{ IOException -> 0x0111, all -> 0x0105 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0117, all -> 0x0105 }
        r0.<init>(r6);	 Catch:{ IOException -> 0x0117, all -> 0x0105 }
        r0 = r0.getChannel();	 Catch:{ IOException -> 0x0117, all -> 0x0105 }
        r2 = 0;
        r4 = r1.size();	 Catch:{ IOException -> 0x011c, all -> 0x0109 }
        r0.transferFrom(r1, r2, r4);	 Catch:{ IOException -> 0x011c, all -> 0x0109 }
        if (r1 == 0) goto L_0x0035;
    L_0x0032:
        r1.close();	 Catch:{ IOException -> 0x0042 }
    L_0x0035:
        if (r0 == 0) goto L_0x003a;
    L_0x0037:
        r0.close();	 Catch:{ IOException -> 0x0042 }
    L_0x003a:
        r0 = r6;
    L_0x003b:
        r7 = r0;
        goto L_0x0007;
    L_0x003d:
        r12 = r10.getName();	 Catch:{ IOException -> 0x0111, all -> 0x0105 }
        goto L_0x001b;
    L_0x0042:
        r0 = move-exception;
        r0 = r6;
        goto L_0x003b;
    L_0x0045:
        r0 = move-exception;
        r1 = r7;
        r2 = r7;
        r6 = r7;
    L_0x0049:
        r3 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x010f }
        if (r3 == 0) goto L_0x0091;
    L_0x004d:
        if (r6 == 0) goto L_0x0079;
    L_0x004f:
        r3 = "KonyFile";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010f }
        r4.<init>();	 Catch:{ all -> 0x010f }
        r5 = "Failed to copy ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x010f }
        r5 = r10.getAbsolutePath();	 Catch:{ all -> 0x010f }
        r4 = r4.append(r5);	 Catch:{ all -> 0x010f }
        r5 = " to ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x010f }
        r5 = r6.getAbsolutePath();	 Catch:{ all -> 0x010f }
        r4 = r4.append(r5);	 Catch:{ all -> 0x010f }
        r4 = r4.toString();	 Catch:{ all -> 0x010f }
        android.util.Log.d(r3, r4);	 Catch:{ all -> 0x010f }
    L_0x0079:
        r3 = "KonyFile";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010f }
        r4.<init>();	 Catch:{ all -> 0x010f }
        r5 = "";
        r4 = r4.append(r5);	 Catch:{ all -> 0x010f }
        r0 = r4.append(r0);	 Catch:{ all -> 0x010f }
        r0 = r0.toString();	 Catch:{ all -> 0x010f }
        android.util.Log.d(r3, r0);	 Catch:{ all -> 0x010f }
    L_0x0091:
        if (r2 == 0) goto L_0x0096;
    L_0x0093:
        r2.close();	 Catch:{ IOException -> 0x009d }
    L_0x0096:
        if (r1 == 0) goto L_0x009b;
    L_0x0098:
        r1.close();	 Catch:{ IOException -> 0x009d }
    L_0x009b:
        r0 = r7;
        goto L_0x003b;
    L_0x009d:
        r0 = move-exception;
        r0 = r7;
        goto L_0x003b;
    L_0x00a0:
        r0 = move-exception;
        r1 = r7;
        r2 = r7;
    L_0x00a3:
        if (r2 == 0) goto L_0x00a8;
    L_0x00a5:
        r2.close();	 Catch:{ IOException -> 0x0103 }
    L_0x00a8:
        if (r1 == 0) goto L_0x00ad;
    L_0x00aa:
        r1.close();	 Catch:{ IOException -> 0x0103 }
    L_0x00ad:
        throw r0;
    L_0x00ae:
        r0 = new java.io.File;
        if (r12 == 0) goto L_0x00cd;
    L_0x00b2:
        r0.<init>(r11, r12);
        r1 = r0.mkdir();
        if (r1 == 0) goto L_0x00d2;
    L_0x00bb:
        r2 = r10.listFiles();
        if (r2 == 0) goto L_0x003b;
    L_0x00c1:
        r3 = r2.length;
        r1 = 0;
    L_0x00c3:
        if (r1 >= r3) goto L_0x003b;
    L_0x00c5:
        r4 = r2[r1];
        r9.m3992a(r4, r0, r7);
        r1 = r1 + 1;
        goto L_0x00c3;
    L_0x00cd:
        r12 = r10.getName();
        goto L_0x00b2;
    L_0x00d2:
        r1 = com.konylabs.android.KonyMain.f3657e;
        if (r1 == 0) goto L_0x0100;
    L_0x00d6:
        r1 = "KonyFile";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Failed to copy ";
        r2 = r2.append(r3);
        r3 = r10.getAbsolutePath();
        r2 = r2.append(r3);
        r3 = " to ";
        r2 = r2.append(r3);
        r0 = r0.getAbsolutePath();
        r0 = r2.append(r0);
        r0 = r0.toString();
        android.util.Log.d(r1, r0);
    L_0x0100:
        r0 = r7;
        goto L_0x003b;
    L_0x0103:
        r1 = move-exception;
        goto L_0x00ad;
    L_0x0105:
        r0 = move-exception;
        r2 = r1;
        r1 = r7;
        goto L_0x00a3;
    L_0x0109:
        r2 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x00a3;
    L_0x010f:
        r0 = move-exception;
        goto L_0x00a3;
    L_0x0111:
        r0 = move-exception;
        r2 = r1;
        r6 = r7;
        r1 = r7;
        goto L_0x0049;
    L_0x0117:
        r0 = move-exception;
        r2 = r1;
        r1 = r7;
        goto L_0x0049;
    L_0x011c:
        r2 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.U.a(java.io.File, java.io.File, java.lang.String):java.io.File");
    }

    private void m3993a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                m3993a(a);
            }
        }
        file.delete();
    }

    private boolean m3994a(InputStream inputStream, boolean z) {
        FileChannel channel;
        FileChannel fileChannel;
        Object obj;
        Throwable th;
        Object obj2;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream = null;
        if (inputStream instanceof FileInputStream) {
            try {
                channel = ((FileInputStream) inputStream).getChannel();
                try {
                    FileChannel channel2 = new FileOutputStream(this.f3583a, z).getChannel();
                    try {
                        channel2.transferFrom(channel, 0, channel.size());
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e) {
                                return true;
                            }
                        }
                        if (channel2 != null) {
                            channel2.close();
                        }
                        return true;
                    } catch (IOException e2) {
                        IOException iOException = e2;
                        fileChannel = channel;
                        channel = channel2;
                        IOException iOException2 = iOException;
                        try {
                            if (KonyMain.f3657e) {
                                Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                                Log.d("KonyFile", BuildConfig.FLAVOR + obj);
                            }
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (IOException e3) {
                                    return false;
                                }
                            }
                            if (channel != null) {
                                channel.close();
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (IOException e4) {
                                    throw th;
                                }
                            }
                            if (channel != null) {
                                channel.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        fileChannel = channel;
                        channel = channel2;
                        th = th4;
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (channel != null) {
                            channel.close();
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    obj = e5;
                    fileChannel = channel;
                    obj2 = null;
                    if (KonyMain.f3657e) {
                        Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                        Log.d("KonyFile", BuildConfig.FLAVOR + obj);
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return false;
                } catch (Throwable th5) {
                    th = th5;
                    fileChannel = channel;
                    obj2 = null;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                obj = e6;
                channel = null;
                if (KonyMain.f3657e) {
                    Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                    Log.d("KonyFile", BuildConfig.FLAVOR + obj);
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (channel != null) {
                    channel.close();
                }
                return false;
            } catch (Throwable th6) {
                th = th6;
                channel = null;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (channel != null) {
                    channel.close();
                }
                throw th;
            }
        }
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(this.f3583a, z));
                try {
                    byte[] bArr = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                    while (true) {
                        int read = bufferedInputStream2.read(bArr, 0, MobileAPI.MAX_CUSTOM_STRING_LENGTH);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            try {
                                bufferedInputStream2.close();
                                bufferedOutputStream2.close();
                                return true;
                            } catch (IOException e7) {
                                return true;
                            }
                        }
                    }
                } catch (IOException e8) {
                    obj = e8;
                    bufferedOutputStream = bufferedOutputStream2;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        if (KonyMain.f3657e) {
                            Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                            Log.d("KonyFile", BuildConfig.FLAVOR + obj);
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e9) {
                                return false;
                            }
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th7) {
                        th = th7;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e10) {
                                throw th;
                            }
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    bufferedOutputStream = bufferedOutputStream2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e11) {
                obj = e11;
                bufferedInputStream = bufferedInputStream2;
                if (KonyMain.f3657e) {
                    Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                    Log.d("KonyFile", BuildConfig.FLAVOR + obj);
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                return false;
            } catch (Throwable th9) {
                th = th9;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e12) {
            obj = e12;
            bufferedInputStream = null;
            if (KonyMain.f3657e) {
                Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                Log.d("KonyFile", BuildConfig.FLAVOR + obj);
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            return false;
        } catch (Throwable th10) {
            th = th10;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }

    private boolean m3995a(String str, boolean z) {
        Object e;
        Throwable th;
        boolean z2 = true;
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(this.f3583a, z));
            try {
                bufferedWriter.write(str);
                try {
                    bufferedWriter.close();
                } catch (IOException e2) {
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    if (KonyMain.f3657e) {
                        Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                        Log.d("KonyFile", BuildConfig.FLAVOR + e);
                    }
                    z2 = false;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e4) {
                        }
                    }
                    return z2;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e5) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e6) {
            e = e6;
            bufferedWriter = null;
            if (KonyMain.f3657e) {
                Log.d("KonyFile", "Failed to write data to " + this.f3583a.getAbsolutePath());
                Log.d("KonyFile", BuildConfig.FLAVOR + e);
            }
            z2 = false;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            return z2;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            throw th;
        }
        return z2;
    }

    public final C0442U m3996a(String str, String str2) {
        if (str == null || str.length() == 0 || m3992a(this.f3583a, new File(str), str2) == null) {
            return null;
        }
        return (C0442U) KonyJSVM.createJSObject("kony.io.File", new Object[]{m3992a(this.f3583a, new File(str), str2)});
    }

    public final void m3997a(boolean z) {
        if (this.f3583a.isFile()) {
            this.f3583a.delete();
        } else if (!this.f3583a.isDirectory()) {
        } else {
            if (z) {
                m3993a(this.f3583a);
            } else {
                this.f3583a.delete();
            }
        }
    }

    public final boolean m3998a() {
        try {
            return this.f3583a.createNewFile();
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyFile", "Failed to create file " + this.f3583a.getAbsolutePath());
                Log.d("KonyFile", BuildConfig.FLAVOR + e);
            }
            return false;
        }
    }

    public final boolean m3999a(Object obj, boolean z) {
        if (obj instanceof String) {
            return m3995a((String) obj, z);
        }
        if (!(obj instanceof C0444X)) {
            return true;
        }
        C0444X c0444x = (C0444X) obj;
        int a = c0444x.m4009a();
        return a == 1000 ? m3995a(c0444x.m4010b(), z) : a == 1001 ? m3994a(c0444x.m4011c(), z) : true;
    }

    public final boolean m4000a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return this.f3583a.renameTo(new File(this.f3583a.getParent(), str));
    }

    public final C0442U m4001b(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str2 == null) {
            str2 = this.f3583a.getName();
        }
        if (!this.f3583a.renameTo(new File(str, str2))) {
            return null;
        }
        return (C0442U) KonyJSVM.createJSObject("kony.io.File", new Object[]{new File(str, str2)});
    }

    public final boolean m4002b() {
        return this.f3583a.mkdir();
    }

    public final boolean m4003c() {
        return this.f3583a.exists();
    }

    public final C0443V m4004d() {
        if (!this.f3583a.isDirectory() || this.f3583a.listFiles() == null) {
            return null;
        }
        return (C0443V) KonyJSVM.createJSObject("kony.io.FileList", new Object[]{this.f3583a.listFiles()});
    }

    public final boolean m4005e() {
        return this.f3583a.isFile();
    }

    public final boolean m4006f() {
        return this.f3583a.isDirectory();
    }

    public final C0444X m4007g() {
        if (!this.f3583a.exists() || !this.f3583a.canRead() || !this.f3583a.isFile()) {
            return null;
        }
        return (C0444X) KonyJSVM.createJSObject("kony.types.RawBytes", new Object[]{this.f3583a});
    }

    public final Object getTable(Object obj) {
        if (this.f3583a == null) {
            return null;
        }
        String intern = ((String) obj).intern();
        if (intern == "name") {
            return this.f3583a.getName();
        }
        if (intern == "fullPath") {
            return this.f3583a.getAbsolutePath();
        }
        if (intern == "parent") {
            return this.f3583a.getParent();
        }
        if (intern == "readable") {
            return Boolean.valueOf(this.f3583a.canRead());
        }
        if (intern == "writable") {
            return Boolean.valueOf(this.f3583a.canWrite());
        }
        if (intern != "modificationTime") {
            return intern == "size" ? Long.valueOf(this.f3583a.length()) : null;
        } else {
            Calendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(this.f3583a.lastModified());
            return gregorianCalendar.getTime().toString();
        }
    }
}
