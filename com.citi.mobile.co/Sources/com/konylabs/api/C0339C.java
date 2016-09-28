package com.konylabs.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.C0243h;
import com.konylabs.vm.C0252r;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ny0k.C0444X;
import ny0k.cn;
import ny0k.cq;

/* renamed from: com.konylabs.api.C */
public final class C0339C implements Library {
    private static String[] f2378a;
    private static LuaTable f2379b;

    static {
        f2378a = new String[]{"print", "assert", "type", "pairs", "_pairs", "ipairs", "_ipairs", "unpack", "setmetatable", "getmetatable", "exit", "appreset", "converttobase64", "registerforidletimeout", "unregisterforidletimeout", "performupgrade", "pvtEnablePreview", "pvtDownloadBytecode", "executeJS", "readfrombase64", "setapplicationcallbacks", "setapplicationinitializationevents", "converttorawbytes", "convertrawbytes", "setapplicationbehaviors"};
    }

    public C0339C(Context context) {
    }

    public static Object m2240a(Object obj) {
        return (f2379b == null || obj == null) ? null : f2379b.getTable(obj);
    }

    private static Object[] m2241a(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[1];
            if (objArr.length == 1) {
                if (objArr[0] instanceof Double) {
                    objArr2[0] = "number";
                } else if (objArr[0] instanceof String) {
                    objArr2[0] = "string";
                } else if (objArr[0] instanceof LuaWidget) {
                    if (KonyMain.m4057C()) {
                        objArr2[0] = "kony.ui." + ((LuaWidget) objArr[0]).getType();
                    } else {
                        objArr2[0] = ((LuaWidget) objArr[0]).getType();
                    }
                } else if (objArr[0] instanceof LuaTable) {
                    if (KonyMain.m4057C()) {
                        objArr2[0] = "object";
                    } else {
                        objArr2[0] = "table";
                    }
                } else if (objArr[0] instanceof Function) {
                    objArr2[0] = "function";
                } else if (objArr[0] instanceof LuaNil) {
                    if (KonyMain.m4057C()) {
                        objArr2[0] = "null";
                    } else {
                        objArr2[0] = "nil";
                    }
                } else if (objArr[0] instanceof Boolean) {
                    objArr2[0] = "boolean";
                } else {
                    objArr2[0] = "userdata";
                }
                return objArr2;
            }
            throw new LuaError("Invalid number of arguments for kony.type()", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib type :", e);
            }
            throw new LuaError("Invalid type of arguments for kony.type()" + e.getMessage(), 302);
        } catch (Throwable e2) {
            if (KonyMain.f3657e) {
                Log.d("StandardLib", "StnadardLib type :", e2);
            }
            throw new LuaError("Invalid type of arguments for kony.type()" + e2.getMessage(), 309);
        }
    }

    private static Object[] m2242b(Object[] objArr) {
        try {
            boolean a;
            String str;
            Object[] objArr2 = new Object[]{LuaNil.nil};
            if (objArr.length == 1) {
                a = C0252r.m1767a(objArr[0]);
                str = " ";
            } else if (objArr.length == 2) {
                boolean a2 = C0252r.m1767a(objArr[0]);
                str = (String) objArr[1];
                a = a2;
            } else {
                throw new LuaError("StandardLib.assert", 301);
            }
            if (!a) {
                if (KonyMain.f3657e) {
                    Log.d("StandardLib", "assert failed: ");
                    Log.d("StandardLib", "\t" + str);
                }
                System.exit(-1);
            }
            return objArr2;
        } catch (ClassCastException e) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib assert1 :" + e);
            }
            throw new LuaError("StandardLib.assert", 302);
        } catch (Exception e2) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib assert1 :" + e2);
            }
            throw new LuaError("StandardLib.assert", 309);
        }
    }

    private Object[] m2243c(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[3];
            if (objArr.length == 1) {
                LuaTable luaTable = (LuaTable) objArr[0];
                luaTable.enumeration.reset();
                objArr2[0] = new Function(new C0243h(this, 4), false);
                objArr2[1] = luaTable;
                objArr2[2] = new Double(0.0d);
                return objArr2;
            }
            throw new LuaError("pairs", 201);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib pairs :", e);
            }
            throw new LuaError("pairs", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib pairs :", e2);
            }
            throw new LuaError("pairs", 203);
        }
    }

    private Object[] m2244d(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[3];
            if (objArr.length == 1) {
                LuaTable luaTable = (LuaTable) objArr[0];
                luaTable.enumeration.reset();
                objArr2[0] = new Function(new C0243h(this, 6), false);
                objArr2[1] = luaTable;
                objArr2[2] = new Double(0.0d);
                return objArr2;
            }
            throw new LuaError("ipairs", 201);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib ipairs :", e);
            }
            throw new LuaError("ipairs", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib ipairs :", e2);
            }
            throw new LuaError("ipairs", 203);
        }
    }

    private static Object[] m2245e(Object[] objArr) {
        int i = 0;
        try {
            LuaTable luaTable;
            Object[] objArr2;
            if (objArr.length == 1) {
                luaTable = (LuaTable) objArr[0];
                objArr2 = new Object[luaTable.list.size()];
                luaTable.list.copyInto(objArr2);
                return objArr2;
            } else if (objArr.length == 2) {
                luaTable = (LuaTable) objArr[0];
                r3 = (int) ((Double) objArr[1]).doubleValue();
                objArr2 = new Object[((luaTable.list.size() - r3) + 1)];
                int i2 = r3;
                r3 = 0;
                for (i = i2; i <= luaTable.list.size(); i++) {
                    objArr2[r3] = luaTable.list.elementAt(i - 1);
                    r3++;
                }
                return objArr2;
            } else if (objArr.length == 3) {
                luaTable = (LuaTable) objArr[0];
                r3 = (int) ((Double) objArr[1]).doubleValue();
                int doubleValue = (int) ((Double) objArr[2]).doubleValue();
                objArr2 = new Object[((doubleValue - r3) + 1)];
                while (r3 <= doubleValue) {
                    objArr2[i] = luaTable.getTable(new Double((double) r3));
                    i++;
                    r3++;
                }
                return objArr2;
            } else {
                throw new LuaError("Table.unpack", 201);
            }
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib unpack :", e);
            }
            throw new LuaError("Table.unpack", 202);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StandardLib", "StnadardLib unpack :", e2);
            }
            if (KonyMain.f3657e) {
                Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
            }
            throw new LuaError("Table.unpack", 203);
        }
    }

    private static Object[] m2246f(Object[] objArr) {
        InputStream openContactPhotoInputStream;
        FileNotFoundException e;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        IOException e2;
        if (objArr == null || objArr.length <= 0) {
            throw new LuaError(101, "Error", "Invalid number of arguments for kony.convertToBase64()");
        }
        Object obj = objArr[0];
        int i;
        Object obj2;
        Object[] objArr2;
        if (obj instanceof String) {
            Uri parse = Uri.parse((String) obj);
            try {
                openContactPhotoInputStream = ((String) obj).startsWith(Contacts.CONTENT_URI.toString()) ? Contacts.openContactPhotoInputStream(KonyMain.getAppContext().getContentResolver(), parse) : KonyMain.getAppContext().getContentResolver().openInputStream(parse);
                if (openContactPhotoInputStream == null) {
                    try {
                        if (KonyMain.f3657e) {
                            Log.d("StandardLib", "convertToBase64 : input stream is null");
                        }
                        if (openContactPhotoInputStream != null) {
                            try {
                                openContactPhotoInputStream.close();
                            } catch (IOException e3) {
                            }
                        }
                        return null;
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        bufferedInputStream = null;
                        try {
                            if (KonyMain.f3657e) {
                                Log.d("StandardLib", BuildConfig.FLAVOR + e.getMessage());
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e5) {
                                }
                            }
                            if (openContactPhotoInputStream != null) {
                                openContactPhotoInputStream.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e6) {
                                    throw th;
                                }
                            }
                            if (openContactPhotoInputStream != null) {
                                openContactPhotoInputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e7) {
                        e2 = e7;
                        bufferedInputStream = null;
                        if (KonyMain.f3657e) {
                            Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e8) {
                            }
                        }
                        if (openContactPhotoInputStream != null) {
                            openContactPhotoInputStream.close();
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = null;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (openContactPhotoInputStream != null) {
                            openContactPhotoInputStream.close();
                        }
                        throw th;
                    }
                }
                bufferedInputStream = new BufferedInputStream(openContactPhotoInputStream);
                try {
                    Object obj3 = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                    Object obj4 = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                    int available = openContactPhotoInputStream.available();
                    byte[] bArr = obj3;
                    i = 0;
                    while (true) {
                        int read = bufferedInputStream.read(obj4);
                        if (read == -1) {
                            break;
                        }
                        if (bArr.length < i + read) {
                            int available2 = available == 0 ? openContactPhotoInputStream.available() : available;
                            available = (available2 == 0 || i * 2 <= Math.abs(available2 - i)) ? i * 2 : Math.abs(available2 - i);
                            obj2 = new byte[(available == 0 ? i + read : (available + bArr.length) + read)];
                            System.arraycopy(bArr, 0, obj2, 0, bArr.length);
                            bArr = obj2;
                            available = available2;
                        }
                        System.arraycopy(obj4, 0, bArr, i, read);
                        i += read;
                    }
                    if (i != 0) {
                        objArr2 = new Object[]{cn.m2175a(bArr)};
                        try {
                            bufferedInputStream.close();
                            if (openContactPhotoInputStream == null) {
                                return objArr2;
                            }
                            openContactPhotoInputStream.close();
                            return objArr2;
                        } catch (IOException e9) {
                            return objArr2;
                        }
                    }
                    try {
                        bufferedInputStream.close();
                        if (openContactPhotoInputStream != null) {
                            openContactPhotoInputStream.close();
                        }
                    } catch (IOException e10) {
                    }
                    return null;
                } catch (FileNotFoundException e11) {
                    e = e11;
                    if (KonyMain.f3657e) {
                        Log.d("StandardLib", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (openContactPhotoInputStream != null) {
                        openContactPhotoInputStream.close();
                    }
                    return null;
                } catch (IOException e12) {
                    e2 = e12;
                    if (KonyMain.f3657e) {
                        Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (openContactPhotoInputStream != null) {
                        openContactPhotoInputStream.close();
                    }
                    return null;
                }
            } catch (FileNotFoundException e13) {
                e = e13;
                bufferedInputStream = null;
                openContactPhotoInputStream = null;
                if (KonyMain.f3657e) {
                    Log.d("StandardLib", BuildConfig.FLAVOR + e.getMessage());
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (openContactPhotoInputStream != null) {
                    openContactPhotoInputStream.close();
                }
                return null;
            } catch (IOException e14) {
                e2 = e14;
                bufferedInputStream = null;
                openContactPhotoInputStream = null;
                if (KonyMain.f3657e) {
                    Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (openContactPhotoInputStream != null) {
                    openContactPhotoInputStream.close();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
                openContactPhotoInputStream = null;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (openContactPhotoInputStream != null) {
                    openContactPhotoInputStream.close();
                }
                throw th;
            }
        } else if (obj instanceof cq) {
            obj2 = ((cq) obj).m2197a();
            if (obj2 != null) {
                byte[] toByteArray;
                if (obj2 instanceof Bitmap) {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) obj2).compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                    toByteArray = byteArrayOutputStream.toByteArray();
                } else {
                    toByteArray = (byte[]) obj2;
                }
                if (toByteArray == null || toByteArray.length <= 0) {
                    return new Object[]{LuaNil.nil};
                }
                String a = cn.m2175a(toByteArray);
                return new Object[]{a};
            }
            return new Object[]{LuaNil.nil};
        } else if (obj instanceof byte[]) {
            return new Object[]{cn.m2175a((byte[]) obj)};
        } else if (obj instanceof C0444X) {
            try {
                openContactPhotoInputStream = ((C0444X) obj).m4011c();
                if (openContactPhotoInputStream == null) {
                    if (openContactPhotoInputStream != null) {
                        try {
                            openContactPhotoInputStream.close();
                        } catch (IOException e15) {
                        }
                    }
                    return null;
                }
                try {
                    bufferedInputStream = new BufferedInputStream(openContactPhotoInputStream);
                    try {
                        Object obj5 = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                        i = 0;
                        Object obj6 = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                        while (true) {
                            int read2 = bufferedInputStream.read(obj5);
                            if (read2 == -1) {
                                break;
                            }
                            if (obj6.length < i + read2) {
                                obj2 = new byte[((i + read2) + 5120)];
                                System.arraycopy(obj6, 0, obj2, 0, i);
                            } else {
                                obj2 = obj6;
                            }
                            System.arraycopy(obj5, 0, obj2, i, read2);
                            i += read2;
                            obj6 = obj2;
                        }
                        objArr2 = new Object[]{cn.m2175a((byte[]) obj6)};
                        try {
                            bufferedInputStream.close();
                            if (openContactPhotoInputStream == null) {
                                return objArr2;
                            }
                            openContactPhotoInputStream.close();
                            return objArr2;
                        } catch (IOException e16) {
                            return objArr2;
                        }
                    } catch (FileNotFoundException e17) {
                        e = e17;
                        try {
                            if (KonyMain.f3657e) {
                                Log.d("StandardLib", BuildConfig.FLAVOR + e.getMessage());
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e18) {
                                }
                            }
                            if (openContactPhotoInputStream != null) {
                                openContactPhotoInputStream.close();
                            }
                            return null;
                        } catch (Throwable th5) {
                            th = th5;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e19) {
                                    throw th;
                                }
                            }
                            if (openContactPhotoInputStream != null) {
                                openContactPhotoInputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e20) {
                        e2 = e20;
                        if (KonyMain.f3657e) {
                            Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e21) {
                            }
                        }
                        if (openContactPhotoInputStream != null) {
                            openContactPhotoInputStream.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException e22) {
                    e = e22;
                    bufferedInputStream = null;
                    if (KonyMain.f3657e) {
                        Log.d("StandardLib", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (openContactPhotoInputStream != null) {
                        openContactPhotoInputStream.close();
                    }
                    return null;
                } catch (IOException e23) {
                    e2 = e23;
                    bufferedInputStream = null;
                    if (KonyMain.f3657e) {
                        Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (openContactPhotoInputStream != null) {
                        openContactPhotoInputStream.close();
                    }
                    return null;
                } catch (Throwable th6) {
                    th = th6;
                    bufferedInputStream = null;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (openContactPhotoInputStream != null) {
                        openContactPhotoInputStream.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e24) {
                e = e24;
                bufferedInputStream = null;
                openContactPhotoInputStream = null;
                if (KonyMain.f3657e) {
                    Log.d("StandardLib", BuildConfig.FLAVOR + e.getMessage());
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (openContactPhotoInputStream != null) {
                    openContactPhotoInputStream.close();
                }
                return null;
            } catch (IOException e25) {
                e2 = e25;
                bufferedInputStream = null;
                openContactPhotoInputStream = null;
                if (KonyMain.f3657e) {
                    Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (openContactPhotoInputStream != null) {
                    openContactPhotoInputStream.close();
                }
                return null;
            } catch (Throwable th7) {
                th = th7;
                bufferedInputStream = null;
                openContactPhotoInputStream = null;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (openContactPhotoInputStream != null) {
                    openContactPhotoInputStream.close();
                }
                throw th;
            }
        } else {
            LuaError luaError = new LuaError(100, "Error", "Invalid type of arguments for kony.convertToBase64()");
            return null;
        }
    }

    private static Object[] m2247g(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            throw new LuaError(101, "Error", "Invalid number of arguments for readfrombase64");
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            try {
                byte[] a = cn.m2178a((String) obj);
                return new Object[]{new cq(a)};
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.e("StandardLib", "Error converting to rawbytes: " + e);
                }
                return new Object[]{LuaNil.nil};
            }
        }
        LuaError luaError = new LuaError(100, "Error", "Invalid type of arguments for readfrombase64");
        return null;
    }

    private static Object[] m2248h(Object[] objArr) {
        InputStream openInputStream;
        Bitmap decodeStream;
        IOException e;
        FileNotFoundException e2;
        Bitmap bitmap;
        String str;
        FileOutputStream openFileOutput;
        boolean compress;
        File file;
        FileInputStream fileInputStream;
        int read;
        Object[] objArr2;
        FileOutputStream fileOutputStream;
        Throwable th;
        if (objArr == null || objArr.length != 5 || objArr[0] == LuaNil.nil || objArr[0] == null) {
            return null;
        }
        int intValue;
        byte[] bArr;
        int i;
        CompressFormat compressFormat = CompressFormat.JPEG;
        if (!(objArr[2] == LuaNil.nil || objArr[2] == null)) {
            intValue = ((Double) objArr[2]).intValue();
            if (intValue == 2) {
                compressFormat = CompressFormat.JPEG;
            } else if (intValue == 1) {
                compressFormat = CompressFormat.PNG;
            }
        }
        int intValue2 = (objArr[3] == LuaNil.nil || objArr[3] == null) ? 100 : 100 - ((Double) objArr[3]).intValue();
        if (objArr[4] == LuaNil.nil || objArr[4] == null) {
            intValue = 100;
        } else {
            intValue = ((Double) objArr[4]).intValue();
            if (intValue <= 0) {
                intValue = 1;
            } else if (intValue > 100) {
                intValue = 100;
            }
        }
        Options options = new Options();
        options.inSampleSize = 100 / intValue;
        if (objArr[0] instanceof String) {
            try {
                openInputStream = KonyMain.getAppContext().getContentResolver().openInputStream(Uri.parse((String) objArr[0]));
                try {
                    decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                    if (decodeStream == null) {
                        try {
                            if (KonyMain.f3657e) {
                                Log.d("StandardLib", "Unable to decode Stream");
                            }
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (IOException e3) {
                                    if (KonyMain.f3657e) {
                                        Log.d("StandardLib", BuildConfig.FLAVOR + e3.getMessage());
                                    }
                                }
                            }
                            return null;
                        } catch (FileNotFoundException e4) {
                            e2 = e4;
                            try {
                                if (KonyMain.f3657e) {
                                    Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                                }
                                if (openInputStream != null) {
                                    try {
                                        openInputStream.close();
                                    } catch (IOException e32) {
                                        if (KonyMain.f3657e) {
                                            Log.d("StandardLib", BuildConfig.FLAVOR + e32.getMessage());
                                        }
                                        bitmap = decodeStream;
                                    }
                                }
                                bitmap = decodeStream;
                                if (bitmap != null) {
                                    try {
                                        str = "image";
                                        openFileOutput = KonyMain.getAppContext().openFileOutput(str, 0);
                                        try {
                                            compress = bitmap.compress(compressFormat, intValue2, openFileOutput);
                                            bitmap.recycle();
                                            if (!compress) {
                                                System.gc();
                                                file = new File(KonyMain.getAppContext().getFilesDir(), str);
                                                intValue2 = (int) file.length();
                                                fileInputStream = new FileInputStream(file);
                                                try {
                                                    bArr = new byte[intValue2];
                                                    intValue = intValue2;
                                                    i = 0;
                                                    while (true) {
                                                        read = fileInputStream.read(bArr, i, intValue);
                                                        if (read != -1) {
                                                        }
                                                        break;
                                                        objArr2 = new Object[]{new cq(bArr)};
                                                        if (openFileOutput != null) {
                                                            try {
                                                                openFileOutput.close();
                                                            } catch (IOException e5) {
                                                                if (!KonyMain.f3657e) {
                                                                    return objArr2;
                                                                }
                                                                Log.d("StandardLib", BuildConfig.FLAVOR + e5.getMessage());
                                                                return objArr2;
                                                            }
                                                        }
                                                        fileInputStream.close();
                                                        return objArr2;
                                                        i += read;
                                                        intValue -= i;
                                                    }
                                                } catch (FileNotFoundException e6) {
                                                    e2 = e6;
                                                    fileOutputStream = openFileOutput;
                                                    try {
                                                        if (KonyMain.f3657e) {
                                                            Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                                                        }
                                                        if (fileOutputStream != null) {
                                                            try {
                                                                fileOutputStream.close();
                                                            } catch (IOException e322) {
                                                                if (KonyMain.f3657e) {
                                                                    Log.d("StandardLib", BuildConfig.FLAVOR + e322.getMessage());
                                                                }
                                                            }
                                                        }
                                                        if (fileInputStream != null) {
                                                            fileInputStream.close();
                                                        }
                                                        return null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        openFileOutput = fileOutputStream;
                                                        if (openFileOutput != null) {
                                                            try {
                                                                openFileOutput.close();
                                                            } catch (IOException e52) {
                                                                if (KonyMain.f3657e) {
                                                                    Log.d("StandardLib", BuildConfig.FLAVOR + e52.getMessage());
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (fileInputStream != null) {
                                                            fileInputStream.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (IOException e7) {
                                                    e322 = e7;
                                                    try {
                                                        if (KonyMain.f3657e) {
                                                            Log.d("StandardLib", BuildConfig.FLAVOR + e322.getMessage());
                                                        }
                                                        if (openFileOutput != null) {
                                                            try {
                                                                openFileOutput.close();
                                                            } catch (IOException e3222) {
                                                                if (KonyMain.f3657e) {
                                                                    Log.d("StandardLib", BuildConfig.FLAVOR + e3222.getMessage());
                                                                }
                                                            }
                                                        }
                                                        if (fileInputStream != null) {
                                                            fileInputStream.close();
                                                        }
                                                        return null;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        if (openFileOutput != null) {
                                                            openFileOutput.close();
                                                        }
                                                        if (fileInputStream != null) {
                                                            fileInputStream.close();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } else if (openFileOutput != null) {
                                                try {
                                                    openFileOutput.close();
                                                } catch (IOException e32222) {
                                                    if (KonyMain.f3657e) {
                                                        Log.d("StandardLib", BuildConfig.FLAVOR + e32222.getMessage());
                                                    }
                                                }
                                            }
                                        } catch (FileNotFoundException e8) {
                                            e2 = e8;
                                            fileInputStream = null;
                                            fileOutputStream = openFileOutput;
                                            if (KonyMain.f3657e) {
                                                Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                            return null;
                                        } catch (IOException e9) {
                                            e32222 = e9;
                                            fileInputStream = null;
                                            if (KonyMain.f3657e) {
                                                Log.d("StandardLib", BuildConfig.FLAVOR + e32222.getMessage());
                                            }
                                            if (openFileOutput != null) {
                                                openFileOutput.close();
                                            }
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                            return null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fileInputStream = null;
                                            if (openFileOutput != null) {
                                                openFileOutput.close();
                                            }
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e10) {
                                        e2 = e10;
                                        fileInputStream = null;
                                        fileOutputStream = null;
                                        if (KonyMain.f3657e) {
                                            Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        return null;
                                    } catch (IOException e11) {
                                        e32222 = e11;
                                        fileInputStream = null;
                                        openFileOutput = null;
                                        if (KonyMain.f3657e) {
                                            Log.d("StandardLib", BuildConfig.FLAVOR + e32222.getMessage());
                                        }
                                        if (openFileOutput != null) {
                                            openFileOutput.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        return null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fileInputStream = null;
                                        openFileOutput = null;
                                        if (openFileOutput != null) {
                                            openFileOutput.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                                return null;
                            } catch (Throwable th6) {
                                th = th6;
                                if (openInputStream != null) {
                                    try {
                                        openInputStream.close();
                                    } catch (IOException e522) {
                                        if (KonyMain.f3657e) {
                                            Log.d("StandardLib", BuildConfig.FLAVOR + e522.getMessage());
                                        }
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e12) {
                            e32222 = e12;
                            if (KonyMain.f3657e) {
                                Log.d("StandardLib", BuildConfig.FLAVOR + e32222.getMessage());
                            }
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (IOException e322222) {
                                    if (KonyMain.f3657e) {
                                        Log.d("StandardLib", BuildConfig.FLAVOR + e322222.getMessage());
                                    }
                                    bitmap = decodeStream;
                                }
                            }
                            bitmap = decodeStream;
                            if (bitmap != null) {
                                str = "image";
                                openFileOutput = KonyMain.getAppContext().openFileOutput(str, 0);
                                compress = bitmap.compress(compressFormat, intValue2, openFileOutput);
                                bitmap.recycle();
                                if (!compress) {
                                    System.gc();
                                    file = new File(KonyMain.getAppContext().getFilesDir(), str);
                                    intValue2 = (int) file.length();
                                    fileInputStream = new FileInputStream(file);
                                    bArr = new byte[intValue2];
                                    intValue = intValue2;
                                    i = 0;
                                    while (true) {
                                        read = fileInputStream.read(bArr, i, intValue);
                                        if (read != -1) {
                                        }
                                        break;
                                        objArr2 = new Object[]{new cq(bArr)};
                                        if (openFileOutput != null) {
                                            openFileOutput.close();
                                        }
                                        fileInputStream.close();
                                        return objArr2;
                                        i += read;
                                        intValue -= i;
                                    }
                                } else if (openFileOutput != null) {
                                    openFileOutput.close();
                                }
                            }
                            return null;
                        }
                    }
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (IOException e3222222) {
                            if (KonyMain.f3657e) {
                                Log.d("StandardLib", BuildConfig.FLAVOR + e3222222.getMessage());
                            }
                            bitmap = decodeStream;
                        }
                    }
                    bitmap = decodeStream;
                } catch (FileNotFoundException e13) {
                    e2 = e13;
                    decodeStream = null;
                    if (KonyMain.f3657e) {
                        Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                    }
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    bitmap = decodeStream;
                    if (bitmap != null) {
                        str = "image";
                        openFileOutput = KonyMain.getAppContext().openFileOutput(str, 0);
                        compress = bitmap.compress(compressFormat, intValue2, openFileOutput);
                        bitmap.recycle();
                        if (!compress) {
                            System.gc();
                            file = new File(KonyMain.getAppContext().getFilesDir(), str);
                            intValue2 = (int) file.length();
                            fileInputStream = new FileInputStream(file);
                            bArr = new byte[intValue2];
                            intValue = intValue2;
                            i = 0;
                            while (true) {
                                read = fileInputStream.read(bArr, i, intValue);
                                if (read != -1) {
                                }
                                break;
                                objArr2 = new Object[]{new cq(bArr)};
                                if (openFileOutput != null) {
                                    openFileOutput.close();
                                }
                                fileInputStream.close();
                                return objArr2;
                                i += read;
                                intValue -= i;
                            }
                        } else if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                    }
                    return null;
                } catch (IOException e14) {
                    e3222222 = e14;
                    decodeStream = null;
                    if (KonyMain.f3657e) {
                        Log.d("StandardLib", BuildConfig.FLAVOR + e3222222.getMessage());
                    }
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    bitmap = decodeStream;
                    if (bitmap != null) {
                        str = "image";
                        openFileOutput = KonyMain.getAppContext().openFileOutput(str, 0);
                        compress = bitmap.compress(compressFormat, intValue2, openFileOutput);
                        bitmap.recycle();
                        if (!compress) {
                            System.gc();
                            file = new File(KonyMain.getAppContext().getFilesDir(), str);
                            intValue2 = (int) file.length();
                            fileInputStream = new FileInputStream(file);
                            bArr = new byte[intValue2];
                            intValue = intValue2;
                            i = 0;
                            while (true) {
                                read = fileInputStream.read(bArr, i, intValue);
                                if (read != -1) {
                                }
                                break;
                                objArr2 = new Object[]{new cq(bArr)};
                                if (openFileOutput != null) {
                                    openFileOutput.close();
                                }
                                fileInputStream.close();
                                return objArr2;
                                i += read;
                                intValue -= i;
                            }
                        } else if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                    }
                    return null;
                }
            } catch (FileNotFoundException e15) {
                e2 = e15;
                decodeStream = null;
                openInputStream = null;
                if (KonyMain.f3657e) {
                    Log.d("StandardLib", BuildConfig.FLAVOR + e2.getMessage());
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
                bitmap = decodeStream;
                if (bitmap != null) {
                    str = "image";
                    openFileOutput = KonyMain.getAppContext().openFileOutput(str, 0);
                    compress = bitmap.compress(compressFormat, intValue2, openFileOutput);
                    bitmap.recycle();
                    if (!compress) {
                        System.gc();
                        file = new File(KonyMain.getAppContext().getFilesDir(), str);
                        intValue2 = (int) file.length();
                        fileInputStream = new FileInputStream(file);
                        bArr = new byte[intValue2];
                        intValue = intValue2;
                        i = 0;
                        while (true) {
                            read = fileInputStream.read(bArr, i, intValue);
                            if (read != -1) {
                            }
                            break;
                            objArr2 = new Object[]{new cq(bArr)};
                            if (openFileOutput != null) {
                                openFileOutput.close();
                            }
                            fileInputStream.close();
                            return objArr2;
                            i += read;
                            intValue -= i;
                        }
                    } else if (openFileOutput != null) {
                        openFileOutput.close();
                    }
                }
                return null;
            } catch (IOException e16) {
                e3222222 = e16;
                decodeStream = null;
                openInputStream = null;
                if (KonyMain.f3657e) {
                    Log.d("StandardLib", BuildConfig.FLAVOR + e3222222.getMessage());
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
                bitmap = decodeStream;
                if (bitmap != null) {
                    str = "image";
                    openFileOutput = KonyMain.getAppContext().openFileOutput(str, 0);
                    compress = bitmap.compress(compressFormat, intValue2, openFileOutput);
                    bitmap.recycle();
                    if (!compress) {
                        System.gc();
                        file = new File(KonyMain.getAppContext().getFilesDir(), str);
                        intValue2 = (int) file.length();
                        fileInputStream = new FileInputStream(file);
                        bArr = new byte[intValue2];
                        intValue = intValue2;
                        i = 0;
                        while (true) {
                            read = fileInputStream.read(bArr, i, intValue);
                            if (read != -1) {
                            }
                            break;
                            objArr2 = new Object[]{new cq(bArr)};
                            if (openFileOutput != null) {
                                openFileOutput.close();
                            }
                            fileInputStream.close();
                            return objArr2;
                            i += read;
                            intValue -= i;
                        }
                    } else if (openFileOutput != null) {
                        openFileOutput.close();
                    }
                }
                return null;
            } catch (Throwable th7) {
                th = th7;
                openInputStream = null;
                if (openInputStream != null) {
                    openInputStream.close();
                }
                throw th;
            }
        }
        if ((objArr[0] instanceof cq) || (objArr[0] instanceof byte[])) {
            byte[] bArr2 = objArr[0] instanceof cq ? (byte[]) ((cq) objArr[0]).m2197a() : objArr[0] instanceof byte[] ? (byte[]) objArr[0] : null;
            if (bArr2 != null && bArr2.length > 0) {
                decodeStream = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
                if (decodeStream == null) {
                    if (KonyMain.f3657e) {
                        Log.d("StandardLib", "Unable to decode byte[]");
                    }
                    return null;
                }
                bitmap = decodeStream;
            }
        }
        bitmap = null;
        if (bitmap != null) {
            str = "image";
            openFileOutput = KonyMain.getAppContext().openFileOutput(str, 0);
            compress = bitmap.compress(compressFormat, intValue2, openFileOutput);
            bitmap.recycle();
            if (!compress) {
                System.gc();
                file = new File(KonyMain.getAppContext().getFilesDir(), str);
                intValue2 = (int) file.length();
                fileInputStream = new FileInputStream(file);
                bArr = new byte[intValue2];
                intValue = intValue2;
                i = 0;
                while (true) {
                    read = fileInputStream.read(bArr, i, intValue);
                    if (read != -1 || i == intValue2) {
                        break;
                    }
                    i += read;
                    intValue -= i;
                }
                objArr2 = new Object[]{new cq(bArr)};
                if (openFileOutput != null) {
                    openFileOutput.close();
                }
                fileInputStream.close();
                return objArr2;
            } else if (openFileOutput != null) {
                openFileOutput.close();
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] execute(int r13, java.lang.Object[] r14) {
        /*
        r12 = this;
        r5 = 2;
        r3 = 0;
        r4 = 1;
        r2 = 0;
        switch(r13) {
            case 0: goto L_0x0011;
            case 1: goto L_0x0114;
            case 2: goto L_0x0119;
            case 3: goto L_0x011e;
            case 4: goto L_0x0123;
            case 5: goto L_0x0146;
            case 6: goto L_0x014b;
            case 7: goto L_0x017b;
            case 8: goto L_0x0180;
            case 9: goto L_0x018c;
            case 10: goto L_0x019c;
            case 11: goto L_0x01b1;
            case 12: goto L_0x01b6;
            case 13: goto L_0x01bc;
            case 14: goto L_0x01dd;
            case 15: goto L_0x01e2;
            case 16: goto L_0x010b;
            case 17: goto L_0x010b;
            case 18: goto L_0x0232;
            case 19: goto L_0x024c;
            case 20: goto L_0x0252;
            case 21: goto L_0x028b;
            case 22: goto L_0x029f;
            case 23: goto L_0x02a5;
            case 24: goto L_0x02ab;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = new com.konylabs.vm.LuaError;
        r1 = "No such smethod error";
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r0.<init>(r1, r2);
        throw r0;
    L_0x0011:
        r3 = new java.lang.Object[r4];
        r0 = com.konylabs.vm.LuaNil.nil;
        r3[r2] = r0;
        r5 = new java.lang.StringBuffer;
        r0 = "213 ";
        r5.<init>(r0);
        if (r14 == 0) goto L_0x010c;
    L_0x0020:
        r1 = r2;
    L_0x0021:
        r0 = r14.length;
        if (r1 >= r0) goto L_0x00f3;
    L_0x0024:
        r0 = r14[r1];
        if (r0 == 0) goto L_0x00e5;
    L_0x0028:
        r0 = r14[r1];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x00e5;
    L_0x002e:
        r0 = r14[r1];
        r0 = r0 instanceof java.lang.Double;
        if (r0 == 0) goto L_0x008b;
    L_0x0034:
        r0 = r14[r1];
        r0 = (java.lang.Double) r0;
        r6 = r0.doubleValue();
        r6 = (long) r6;
        r8 = r0.doubleValue();
        r10 = (double) r6;
        r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x006f;
    L_0x0046:
        r5.append(r6);
        r0 = "StandardLib";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2 = r2.append(r6);
        r6 = "\t";
        r2 = r2.append(r6);
        r2 = r2.toString();
        android.util.Log.d(r0, r2);
    L_0x0061:
        r0 = r14.length;
        r0 = r0 + -1;
        if (r1 == r0) goto L_0x006b;
    L_0x0066:
        r0 = "\t";
        r5.append(r0);
    L_0x006b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0021;
    L_0x006f:
        r5.append(r8);
        r0 = "StandardLib";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2 = r2.append(r8);
        r6 = "\t";
        r2 = r2.append(r6);
        r2 = r2.toString();
        android.util.Log.d(r0, r2);
        goto L_0x0061;
    L_0x008b:
        r0 = r14[r1];
        r0 = r0 instanceof com.konylabs.api.ui.LuaWidget;
        if (r0 == 0) goto L_0x00ac;
    L_0x0091:
        r0 = com.konylabs.android.KonyMain.m4057C();
        if (r0 == 0) goto L_0x00ac;
    L_0x0097:
        r0 = r14[r1];
        r0 = (com.konylabs.api.ui.LuaWidget) r0;
        r0 = r0.getPropertiesInfo();
        r5.append(r0);
        r0 = r14[r1];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r2 = "StandardLib";
        r0.print(r2);
        goto L_0x0061;
    L_0x00ac:
        r0 = r14[r1];
        r0 = r0.toString();
        r5.append(r0);
        r0 = r14[r1];
        r0 = r0 instanceof com.konylabs.vm.LuaTable;
        if (r0 == 0) goto L_0x00c5;
    L_0x00bb:
        r0 = r14[r1];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r2 = "StandardLib";
        r0.print(r2);
        goto L_0x0061;
    L_0x00c5:
        r0 = "StandardLib";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = r14[r1];
        r6 = r6.toString();
        r2 = r2.append(r6);
        r6 = "\t ";
        r2 = r2.append(r6);
        r2 = r2.toString();
        android.util.Log.d(r0, r2);
        goto L_0x0061;
    L_0x00e5:
        r0 = "nil";
        r5.append(r0);
        r0 = "StandardLib";
        r2 = "nil";
        android.util.Log.d(r0, r2);
        goto L_0x0061;
    L_0x00f3:
        r0 = "StandardLib";
        r1 = "";
        android.util.Log.d(r0, r1);
    L_0x00fa:
        r0 = com.konylabs.vm.C0237a.m1647a();
        r1 = r0.m1672b();
        if (r1 == 0) goto L_0x010b;
    L_0x0104:
        r1 = r5.toString();
        r0.m1669a(r1, r4);
    L_0x010b:
        return r3;
    L_0x010c:
        r0 = "StandardLib";
        r1 = "nil";
        android.util.Log.d(r0, r1);
        goto L_0x00fa;
    L_0x0114:
        r3 = com.konylabs.api.C0339C.m2242b(r14);
        goto L_0x010b;
    L_0x0119:
        r3 = com.konylabs.api.C0339C.m2241a(r14);
        goto L_0x010b;
    L_0x011e:
        r3 = r12.m2243c(r14);
        goto L_0x010b;
    L_0x0123:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = new java.lang.Object[r5];
        r5 = r0.enumeration;
        r6 = r5.hasMoreElements();
        if (r6 == 0) goto L_0x0141;
    L_0x0131:
        r3 = r5.nextElement();
        r1[r2] = r3;
        r2 = r1[r2];
        r0 = r0.getTable(r2);
        r1[r4] = r0;
    L_0x013f:
        r3 = r1;
        goto L_0x010b;
    L_0x0141:
        r1[r2] = r3;
        r1[r4] = r3;
        goto L_0x013f;
    L_0x0146:
        r3 = r12.m2244d(r14);
        goto L_0x010b;
    L_0x014b:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r5 = new java.lang.Object[r5];
        r1 = r14[r4];
        r1 = (java.lang.Double) r1;
        r6 = new java.lang.Double;
        r8 = r1.doubleValue();
        r10 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r8 = r8 + r10;
        r6.<init>(r8);
        r8 = r6.doubleValue();
        r1 = (int) r8;
        r7 = r0.arraySize();
        if (r1 <= r7) goto L_0x0172;
    L_0x016c:
        r5[r2] = r3;
        r5[r4] = r3;
    L_0x0170:
        r3 = r5;
        goto L_0x010b;
    L_0x0172:
        r5[r2] = r6;
        r0 = r0.getTable(r6);
        r5[r4] = r0;
        goto L_0x0170;
    L_0x017b:
        r3 = com.konylabs.api.C0339C.m2245e(r14);
        goto L_0x010b;
    L_0x0180:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = "__index";
        r2 = r14[r4];
        r0.setTable(r1, r2);
        goto L_0x010b;
    L_0x018c:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = "__index";
        r0 = r0.getTable(r1);
        r3 = new java.lang.Object[r4];
        r3[r2] = r0;
        goto L_0x010b;
    L_0x019c:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x01a7;
    L_0x01a0:
        r0 = "StandardLib";
        r1 = "Exiting the application";
        android.util.Log.d(r0, r1);
    L_0x01a7:
        r0 = new com.konylabs.api.D;
        r0.<init>(r12);
        com.konylabs.android.KonyMain.m4094a(r0);
        goto L_0x010b;
    L_0x01b1:
        com.konylabs.api.ui.fv.m4425j();
        goto L_0x010b;
    L_0x01b6:
        r3 = com.konylabs.api.C0339C.m2246f(r14);
        goto L_0x010b;
    L_0x01bc:
        r0 = r14[r2];
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r0 = (long) r0;
        r6 = 0;
        r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x010b;
    L_0x01cb:
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r6 = r6 * r0;
        r0 = r14[r4];
        r0 = (com.konylabs.vm.Function) r0;
        r1 = new com.konylabs.api.E;
        r1.<init>(r12, r0);
        com.konylabs.android.KonyMain.m4088a(r6, r1);
        goto L_0x010b;
    L_0x01dd:
        com.konylabs.android.KonyMain.m4129h();
        goto L_0x010b;
    L_0x01e2:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = "type";
        r1 = r0.getTable(r1);
        r1 = (java.lang.Double) r1;
        r1 = r1.intValue();
        r2 = "url";
        r0 = r0.getTable(r2);
        r2 = r0.toString();
        if (r1 != r4) goto L_0x0203;
    L_0x01fe:
        com.konylabs.android.KonyMain.m4120e(r2);
        goto L_0x010b;
    L_0x0203:
        if (r1 != r5) goto L_0x010b;
    L_0x0205:
        r0 = r14[r4];
        r0 = (com.konylabs.vm.Function) r0;
        r1 = new com.konylabs.android.h;
        r4 = com.konylabs.android.KonyMain.getAppContext();
        r1.<init>(r4);
        r1.m64a(r2, r0);
        r0 = r1.m65b();
        r2 = com.konylabs.android.C0135h.f33a;
        if (r0 != r2) goto L_0x010b;
    L_0x021d:
        r1.m69f();
        r0 = r1.m65b();
        r1 = com.konylabs.android.C0135h.f34b;
        if (r0 != r1) goto L_0x010b;
    L_0x0228:
        r0 = new com.konylabs.api.F;
        r0.<init>(r12);
        com.konylabs.android.KonyMain.m4094a(r0);
        goto L_0x010b;
    L_0x0232:
        if (r14 == 0) goto L_0x010b;
    L_0x0234:
        r0 = r14.length;
        if (r0 == 0) goto L_0x010b;
    L_0x0237:
        r0 = r14[r2];
        if (r0 == 0) goto L_0x010b;
    L_0x023b:
        r0 = r14[r4];
        if (r0 == 0) goto L_0x010b;
    L_0x023f:
        r0 = r14[r2];
        r0 = (com.konylabs.api.ui.hP) r0;
        r1 = r14[r4];
        r1 = (java.lang.String) r1;
        r0.m4656a(r1);
        goto L_0x010b;
    L_0x024c:
        r3 = com.konylabs.api.C0339C.m2247g(r14);
        goto L_0x010b;
    L_0x0252:
        if (r14 == 0) goto L_0x010b;
    L_0x0254:
        r0 = r14.length;
        if (r0 <= 0) goto L_0x010b;
    L_0x0257:
        r0 = r14[r2];
        r0 = r0 instanceof com.konylabs.vm.LuaTable;
        if (r0 == 0) goto L_0x010b;
    L_0x025d:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = "onbackground";
        r1 = r0.getTable(r1);
        r2 = r1 instanceof com.konylabs.vm.Function;
        if (r2 == 0) goto L_0x0394;
    L_0x026b:
        r1 = (com.konylabs.vm.Function) r1;
        r2 = r1;
    L_0x026e:
        r1 = "onforeground";
        r1 = r0.getTable(r1);
        r4 = r1 instanceof com.konylabs.vm.Function;
        if (r4 == 0) goto L_0x0391;
    L_0x0278:
        r1 = (com.konylabs.vm.Function) r1;
    L_0x027a:
        r4 = "onlowmemory";
        r0 = r0.getTable(r4);
        r4 = r0 instanceof com.konylabs.vm.Function;
        if (r4 == 0) goto L_0x038e;
    L_0x0284:
        r0 = (com.konylabs.vm.Function) r0;
    L_0x0286:
        com.konylabs.android.KonyMain.m4093a(r2, r1, r0);
        goto L_0x010b;
    L_0x028b:
        if (r14 == 0) goto L_0x010b;
    L_0x028d:
        r0 = r14.length;
        if (r0 <= 0) goto L_0x010b;
    L_0x0290:
        r0 = r14[r2];
        if (r0 == 0) goto L_0x010b;
    L_0x0294:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r0 = r0.map;
        com.konylabs.android.C0133f.m43a(r0);
        goto L_0x010b;
    L_0x029f:
        r3 = com.konylabs.api.C0339C.m2247g(r14);
        goto L_0x010b;
    L_0x02a5:
        r3 = com.konylabs.api.C0339C.m2248h(r14);
        goto L_0x010b;
    L_0x02ab:
        if (r14 == 0) goto L_0x010b;
    L_0x02ad:
        r0 = r14.length;
        if (r0 <= 0) goto L_0x010b;
    L_0x02b0:
        r0 = r14[r2];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x010b;
    L_0x02b6:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x02d2;
    L_0x02ba:
        r0 = "StandardLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r5 = "setApplicationBehaviors : ";
        r1 = r1.append(r5);
        r1 = r1.append(r14);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x02d2:
        r0 = r14[r2];
        r0 = (com.konylabs.vm.LuaTable) r0;
        f2379b = r0;
        r1 = "hidedefaultloadingindicator";
        r0 = r0.getTable(r1);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 != r1) goto L_0x02ee;
    L_0x02e2:
        r0 = f2379b;
        r1 = "hideDefaultLoadingIndicator";
        r0 = r0.getTable(r1);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x02f6;
    L_0x02ee:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        com.konylabs.android.KonyMain.f3662j = r0;
    L_0x02f6:
        r0 = f2379b;
        r1 = "defaultIndicatorColor";
        r0 = r0.getTable(r1);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 != r1) goto L_0x030e;
    L_0x0302:
        r0 = f2379b;
        r1 = "defaultindicatorcolor";
        r0 = r0.getTable(r1);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x0321;
    L_0x030e:
        r1 = r0.toString();
        r5 = "Gray";
        r1 = r1.equalsIgnoreCase(r5);
        if (r1 == 0) goto L_0x0359;
    L_0x031a:
        com.konylabs.api.ui.fv.f4026y = r4;
        r0 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        com.konylabs.api.ui.fv.f4025x = r0;
    L_0x0321:
        r0 = f2379b;
        r1 = "retainSpaceOnHide";
        r0 = r0.getTable(r1);
        if (r0 == 0) goto L_0x033f;
    L_0x032b:
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x033f;
    L_0x032f:
        r1 = r0 instanceof java.lang.Boolean;
        if (r1 == 0) goto L_0x033f;
    L_0x0333:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x033c;
    L_0x033b:
        r2 = r4;
    L_0x033c:
        com.konylabs.api.ui.LuaWidget.setRetainSpaceOnHide(r2);
    L_0x033f:
        r0 = f2379b;
        r1 = "marginsIncludedInWidgetContainerWeight";
        r0 = r0.getTable(r1);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x010b;
    L_0x034b:
        r1 = r0 instanceof java.lang.Boolean;
        if (r1 == 0) goto L_0x010b;
    L_0x034f:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        com.konylabs.api.ui.ez.f1333a = r0;
        goto L_0x010b;
    L_0x0359:
        r1 = r0.toString();
        r5 = "White";
        r1 = r1.equalsIgnoreCase(r5);
        if (r1 == 0) goto L_0x036b;
    L_0x0365:
        com.konylabs.api.ui.fv.f4026y = r4;
        r0 = -1;
        com.konylabs.api.ui.fv.f4025x = r0;
        goto L_0x0321;
    L_0x036b:
        r1 = "^([A-Fa-f0-9]{8})$";
        r1 = java.util.regex.Pattern.compile(r1);	 Catch:{ PatternSyntaxException -> 0x0389 }
        r5 = r0.toString();	 Catch:{ PatternSyntaxException -> 0x0389 }
        r1 = r1.matcher(r5);	 Catch:{ PatternSyntaxException -> 0x0389 }
        r1 = r1.matches();	 Catch:{ PatternSyntaxException -> 0x0389 }
        if (r1 == 0) goto L_0x0321;
    L_0x037f:
        r0 = com.konylabs.api.ui.hp.m3351b(r0);	 Catch:{ PatternSyntaxException -> 0x0389 }
        com.konylabs.api.ui.fv.f4025x = r0;	 Catch:{ PatternSyntaxException -> 0x0389 }
        r0 = 1;
        com.konylabs.api.ui.fv.f4026y = r0;	 Catch:{ PatternSyntaxException -> 0x0389 }
        goto L_0x0321;
    L_0x0389:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0321;
    L_0x038e:
        r0 = r3;
        goto L_0x0286;
    L_0x0391:
        r1 = r3;
        goto L_0x027a;
    L_0x0394:
        r2 = r3;
        goto L_0x026e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.C.execute(int, java.lang.Object[]):java.lang.Object[]");
    }

    public final String[] getMethods() {
        return f2378a;
    }

    public final String getNameSpace() {
        return null;
    }
}
