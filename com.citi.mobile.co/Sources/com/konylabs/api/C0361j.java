package com.konylabs.api;

import android.content.Context;
import android.support.v4.media.TransportMediator;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.cert.X509Certificate;
import net.sourceforge.zbar.Config;
import ny0k.C0278K;
import ny0k.cn;
import ny0k.cq;

/* renamed from: com.konylabs.api.j */
public final class C0361j implements Library {
    private static String[] f2421d;
    private Integer f2422a;
    private String f2423b;
    private Context f2424c;
    private byte[] f2425e;
    private byte[] f2426f;

    static {
        f2421d = new String[]{"retrievepublickey", "createhash", "newkey", "encrypt", "decrypt", "savekey", "readkey", "deletekey"};
    }

    public C0361j(Context context) {
        this.f2422a = Integer.valueOf(0);
        this.f2423b = BuildConfig.FLAVOR;
        this.f2425e = new byte[8];
        this.f2426f = new byte[16];
        this.f2424c = context;
        Object bytes = "26bd52087559fde8".getBytes();
        System.arraycopy(bytes, 0, this.f2425e, 0, 8);
        System.arraycopy(bytes, 0, this.f2426f, 0, 16);
    }

    private byte[] m2346a(String str, byte[] bArr) {
        Object obj;
        if (str.equalsIgnoreCase("tripledes")) {
            if (bArr == null) {
                return this.f2425e;
            }
            if (bArr.length <= 8) {
                return bArr;
            }
            obj = new byte[8];
            System.arraycopy(bArr, 0, obj, 0, 8);
            return obj;
        } else if (!str.equalsIgnoreCase("aes")) {
            return null;
        } else {
            if (bArr == null) {
                return this.f2426f;
            }
            if (bArr.length <= 16) {
                return bArr;
            }
            obj = new byte[16];
            System.arraycopy(bArr, 0, obj, 0, 16);
            return obj;
        }
    }

    private Object[] m2347a(Object[] objArr) {
        SecretKeySpec secretKeySpec = null;
        if (objArr.length < 3) {
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "Inside crypto.newkey:params.length < 3");
            }
            throw new LuaError("Invalid number of arguments for kony.crypto.newKey()", 100);
        } else if (objArr[0] == LuaNil.nil || objArr[2] == LuaNil.nil) {
            return null;
        } else {
            LuaTable luaTable;
            LuaTable luaTable2;
            String str;
            if (objArr.length > 2) {
                luaTable = (LuaTable) objArr[2];
                if (luaTable.map.get("subalgo") != LuaNil.nil) {
                    luaTable2 = luaTable;
                    str = (String) luaTable.map.get("subalgo");
                } else {
                    luaTable2 = luaTable;
                    str = null;
                }
            } else {
                luaTable2 = null;
                str = null;
            }
            if (str == null) {
                if (KonyMain.f3657e) {
                    Log.d("CryptoLib", "Inside Sub Agorithm Mandatory");
                }
                throw new LuaError("Subalgo parameter is mandatory for kony.crypto.newKey()", 105);
            }
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "Generating new Key using Algorithm " + str);
            }
            String str2 = (String) objArr[0];
            int intValue = objArr[1] != LuaNil.nil ? ((Double) objArr[1]).intValue() : 0;
            if (intValue == TransportMediator.FLAG_KEY_MEDIA_NEXT || intValue == 192 || intValue == Config.X_DENSITY) {
                String str3 = str.equalsIgnoreCase("tripledes") ? "DESede" : str;
                try {
                    SecureRandom instance;
                    KeyGenerator instance2 = KeyGenerator.getInstance(str3);
                    try {
                        instance = KonyMain.f3656d >= 17 ? SecureRandom.getInstance("SHA1PRNG", "Crypto") : SecureRandom.getInstance("SHA1PRNG");
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                        instance = null;
                    } catch (NoSuchProviderException e2) {
                        e2.printStackTrace();
                        instance = null;
                    }
                    if (str2.equals("securerandom") || str2.equals("random")) {
                        instance2.init(intValue, instance);
                        str2 = null;
                    } else {
                        if (str2.equals("passphrase") && luaTable2 != null) {
                            if (KonyMain.f3657e) {
                                Log.d("CryptoLib", luaTable2.toString());
                            }
                            luaTable = (LuaTable) luaTable2.map.get("passphrasetext");
                            if (luaTable != null) {
                                str = BuildConfig.FLAVOR;
                                int size = luaTable.list.size();
                                for (int i = 0; i < size; i++) {
                                    str = str + luaTable.list.get(i);
                                }
                                str2 = str;
                            }
                        }
                        str2 = null;
                    }
                    if (str3.equals("aes")) {
                        if (str2 != null) {
                            instance.setSeed(str2.getBytes());
                            instance2.init(intValue, instance);
                        } else {
                            instance2.init(intValue);
                        }
                        secretKeySpec = new SecretKeySpec(instance2.generateKey().getEncoded(), str3);
                    } else if (str3.equals("DESede")) {
                        if (str2 != null) {
                            byte[] bArr;
                            Object bytes = str2.getBytes();
                            if (bytes.length > 24) {
                                bArr = new byte[24];
                                System.arraycopy(bytes, 0, bArr, 0, 24);
                            } else {
                                Object obj = bytes;
                            }
                            secretKeySpec = new SecretKeySpec(bArr, str3);
                        } else {
                            instance2.init(intValue);
                            secretKeySpec = new SecretKeySpec(instance2.generateKey().getEncoded(), str3);
                        }
                    }
                    return new Object[]{secretKeySpec, this.f2422a, this.f2423b};
                } catch (NoSuchAlgorithmException e3) {
                    e3.printStackTrace();
                    this.f2422a = new Integer(101);
                    this.f2423b = "Unsupported algorithm";
                    return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
                }
            }
            this.f2422a = new Integer(104);
            this.f2423b = "Invalid Keystrength ";
            return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
        }
    }

    private Object[] m2348b(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length < 3) {
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "Inside crypto.encrypt:params.length < 3");
            }
            throw new LuaError("Invalid number of arguments for kony.crypto.encrypt()", 100);
        } else if (objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil || objArr[2] == LuaNil.nil) {
            return null;
        } else {
            String str;
            String str2;
            Key key;
            Key key2;
            String str3 = (String) objArr[0];
            String str4 = (String) objArr[2];
            String str5 = null;
            byte[] bArr = null;
            if (objArr.length <= 3 || objArr[3] == LuaNil.nil) {
                str = null;
            } else {
                LuaTable luaTable = (LuaTable) objArr[3];
                Object obj = luaTable.map.get("padding");
                if (obj != null) {
                    str2 = (String) obj;
                    str5 = str2.equals("none") ? "no" : str2;
                }
                obj = luaTable.map.get("mode");
                str2 = obj != null ? (String) obj : null;
                Object obj2 = luaTable.map.get("initializationvector");
                if (obj2 != null) {
                    bArr = ((String) obj2).getBytes();
                    str = str2;
                } else {
                    str = str2;
                }
            }
            str2 = str == null ? str3.equalsIgnoreCase("rsa") ? "ECB" : "CBC" : str;
            if (str3.equalsIgnoreCase("rsa")) {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) objArr[1];
                RSAPublicKey rSAPublicKey2;
                if (str5 == null) {
                    key = null;
                    rSAPublicKey2 = rSAPublicKey;
                    str = "PKCS1";
                    key2 = rSAPublicKey2;
                } else {
                    key = null;
                    rSAPublicKey2 = rSAPublicKey;
                    str = str5;
                    Object obj3 = rSAPublicKey2;
                }
            } else {
                SecretKeySpec secretKeySpec = (SecretKeySpec) objArr[1];
                Object obj4;
                if (str5 == null) {
                    obj4 = secretKeySpec;
                    str = "PKCS5";
                    key2 = null;
                } else {
                    obj4 = secretKeySpec;
                    str = str5;
                    key2 = null;
                }
            }
            str = ((str3.equalsIgnoreCase("tripledes") ? "DESede" : str3) + "/" + str2 + "/" + str + "padding").toUpperCase();
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "-----------------------------------------   " + str + " : Bytes:" + str4.getBytes().length);
            }
            try {
                Cipher instance = Cipher.getInstance(str);
                if (str3.equalsIgnoreCase("rsa")) {
                    instance.init(1, key2);
                } else if (str2.equalsIgnoreCase("CBC")) {
                    instance.init(1, key, new IvParameterSpec(m2346a(str3, bArr)));
                } else if (str2.equalsIgnoreCase("ECB")) {
                    instance.init(1, key);
                }
                if (instance.doFinal(str4.getBytes()) != null) {
                    return new Object[]{instance.doFinal(str4.getBytes()), this.f2422a, this.f2423b};
                }
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                this.f2422a = new Integer(101);
                this.f2423b = "Unsupported algorithm";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (NoSuchPaddingException e2) {
                e2.printStackTrace();
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (InvalidKeyException e3) {
                e3.printStackTrace();
                this.f2422a = new Integer(100);
                this.f2423b = "Invalid Input parameters";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (IllegalBlockSizeException e4) {
                e4.printStackTrace();
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (InvalidAlgorithmParameterException e6) {
                e6.printStackTrace();
                this.f2422a = new Integer(100);
                this.f2423b = "Invalid Input parameters";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            }
        }
    }

    private Object[] m2349c(Object[] objArr) {
        byte[] bArr = null;
        if (objArr == null) {
            return null;
        }
        if (objArr.length < 3) {
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "Inside crypto.decrypt:params.length < 3");
            }
            throw new LuaError("Invalid number of arguments for kony.crypto.decrypt()", 100);
        } else if (objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil || objArr[2] == LuaNil.nil) {
            return null;
        } else {
            String str;
            String str2;
            String str3;
            String str4 = (String) objArr[0];
            SecretKeySpec secretKeySpec = (SecretKeySpec) objArr[1];
            byte[] bArr2 = objArr[2] instanceof cq ? (byte[]) ((cq) objArr[2]).m2197a() : (byte[]) objArr[2];
            if (objArr.length <= 3 || objArr[3] == LuaNil.nil) {
                str = null;
                str2 = null;
            } else {
                LuaTable luaTable = (LuaTable) objArr[3];
                Object obj = luaTable.map.get("padding");
                if (obj != null) {
                    str = (String) obj;
                    str3 = str.equals("none") ? "no" : str;
                } else {
                    str3 = null;
                }
                obj = luaTable.map.get("mode");
                str = obj != null ? (String) obj : null;
                Object obj2 = luaTable.map.get("initializationvector");
                if (obj2 != null) {
                    bArr = ((String) obj2).getBytes();
                    str2 = str3;
                } else {
                    str2 = str3;
                }
            }
            str3 = str == null ? str4.equalsIgnoreCase("rsa") ? "ECB" : "CBC" : str;
            if (str2 == null) {
                str2 = str4.equalsIgnoreCase("rsa") ? "PKCS1" : "PKCS5";
            }
            str2 = (str4.equalsIgnoreCase("tripledes") ? "DESede" : str4) + "/" + str3 + "/" + str2 + "padding";
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "-----------------------------------------   " + str2);
            }
            try {
                Cipher instance = Cipher.getInstance(str2);
                if (str3.equalsIgnoreCase("CBC")) {
                    instance.init(2, secretKeySpec, new IvParameterSpec(m2346a(str4, bArr)));
                } else if (str3.equalsIgnoreCase("ECB")) {
                    instance.init(2, secretKeySpec);
                }
                return new Object[]{new String(instance.doFinal(bArr2)), this.f2422a, this.f2423b};
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                this.f2422a = new Integer(101);
                this.f2423b = "Unsupported algorithm";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (NoSuchPaddingException e2) {
                e2.printStackTrace();
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (InvalidKeyException e3) {
                e3.printStackTrace();
                this.f2422a = new Integer(100);
                this.f2423b = "Invalid Input parameters";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (IllegalBlockSizeException e4) {
                e4.printStackTrace();
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (InvalidAlgorithmParameterException e6) {
                e6.printStackTrace();
                this.f2422a = new Integer(100);
                this.f2423b = "Invalid Input parameters";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            }
        }
    }

    private Object[] m2350d(Object[] objArr) {
        if (objArr.length < 3) {
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "Inside crypto.retrievepublickey:params.length < 3");
            }
            throw new LuaError("Invalid number of arguments for kony.crypto.retrievePublicKey()", 100);
        } else if (objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil || objArr[2] == LuaNil.nil) {
            return null;
        } else {
            Object publicKey;
            if (((Boolean) objArr[2]).booleanValue()) {
                try {
                    InputStream open = KonyMain.getAppContext().getAssets().open((String) objArr[1]);
                    Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(open);
                    open.close();
                    publicKey = generateCertificate.getPublicKey();
                } catch (FileNotFoundException e) {
                    this.f2422a = new Integer(101);
                    this.f2423b = "Unsupported algorithm";
                    return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
                } catch (CertificateException e2) {
                    this.f2422a = new Integer(102);
                    this.f2423b = "Unknown error";
                    return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
                } catch (IOException e3) {
                    this.f2422a = new Integer(102);
                    this.f2423b = "Unknown error";
                    return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
                }
            }
            try {
                PublicKey publicKey2 = X509Certificate.getInstance(cn.m2178a(objArr[1].toString())).getPublicKey();
            } catch (IOException e4) {
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            } catch (javax.security.cert.CertificateException e5) {
                this.f2422a = new Integer(102);
                this.f2423b = "Unknown error";
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            }
            if (publicKey == null) {
                return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
            }
            return new Object[]{publicKey, this.f2422a, this.f2423b};
        }
    }

    private Object[] m2351e(Object[] objArr) {
        if (objArr.length != 2) {
            if (KonyMain.f3657e) {
                Log.d("CryptoLib", "Inside crypto.createhash:params.length != 2");
            }
            throw new LuaError("Invalid Number of arguments for kony.crypto.createHash()", 100);
        }
        String str = (String) objArr[1];
        try {
            MessageDigest instance = MessageDigest.getInstance((String) objArr[0]);
            instance.update(str.getBytes("UTF-8"));
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                int i2 = (digest[i] >>> 4) & 15;
                int i3 = 0;
                while (true) {
                    if (i2 < 0 || i2 > 9) {
                        stringBuffer.append((char) ((i2 - 10) + 97));
                    } else {
                        stringBuffer.append((char) (i2 + 48));
                    }
                    int i4 = digest[i] & 15;
                    i2 = i3 + 1;
                    if (i3 > 0) {
                        break;
                    }
                    i3 = i2;
                    i2 = i4;
                }
            }
            return new Object[]{stringBuffer.toString(), this.f2422a, this.f2423b};
        } catch (NoSuchAlgorithmException e) {
            this.f2422a = new Integer(101);
            this.f2423b = "Unsupported algorithm";
            e.printStackTrace();
            return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
        } catch (UnsupportedEncodingException e2) {
            this.f2422a = new Integer(102);
            this.f2423b = "Unknown error";
            e2.printStackTrace();
            return new Object[]{LuaNil.nil, this.f2422a, this.f2423b};
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        C0278K c0278k;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m2350d(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return m2351e(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return m2347a(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return m2348b(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return m2349c(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (KonyMain.f3657e) {
                    Log.d("CryptoLib", "Executing the save table for KonyDataSource");
                }
                if (objArr.length < 2) {
                    throw new LuaError("Invalid parameters for kony.crypto.saveKey()", 100);
                } else if (!(objArr[0] instanceof String)) {
                    return new Object[]{LuaNil.nil, new Integer(100), "Invalid Input parameters"};
                } else if (objArr[1] instanceof Object) {
                    String str = (String) objArr[0];
                    String str2 = str + ("androidunique" + str).hashCode();
                    c0278k = new C0278K(this.f2424c);
                    if (c0278k.m1804a(str2, objArr[1])) {
                        return new Object[]{str2, LuaNil.nil, LuaNil.nil};
                    }
                    if (KonyMain.f3658f) {
                        Log.w("CryptoLib", "Failed to save the object : " + c0278k.f1899a);
                    }
                    throw new LuaError("Failed to save the object with kony.crypto.saveKey()", 102);
                } else {
                    return new Object[]{LuaNil.nil, new Integer(100), "Invalid Input parameters"};
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (objArr.length <= 0) {
                    throw new LuaError("Invalid parameters for kony.crypto.readKey()", 100);
                } else if (objArr[0] instanceof String) {
                    c0278k = new C0278K(this.f2424c);
                    if (c0278k.m1803a(objArr[0].toString()) != null || c0278k.f1899a == null) {
                        return new Object[]{r1, LuaNil.nil, LuaNil.nil};
                    }
                    return new Object[]{LuaNil.nil, new Integer(109), "The specified item could not be found"};
                } else {
                    return new Object[]{LuaNil.nil, new Integer(100), "Invalid Input parameters"};
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (objArr.length <= 0) {
                    throw new LuaError("Invalid parameters for kony.crypto.deleteKey()", 100);
                } else if (!(objArr[0] instanceof String)) {
                    return new Object[]{new Integer(100), "Invalid Input parameters"};
                } else if (new C0278K(this.f2424c).m1805b(objArr[0].toString())) {
                    return new Object[]{LuaNil.nil, LuaNil.nil};
                } else {
                    return new Object[]{new Integer(109), "The specified item could not be found"};
                }
            default:
                throw new LuaError("kony.crypto namespace has no such method", 108);
        }
    }

    public final String[] getMethods() {
        return f2421d;
    }

    public final String getNameSpace() {
        return "crypto";
    }
}
