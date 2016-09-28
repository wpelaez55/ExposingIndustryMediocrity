package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

final class aY extends Thread {
    private volatile boolean f2025a;
    private String f2026b;
    private az f2027c;
    private String f2028d;
    private int f2029e;
    private Hashtable f2030f;
    private Hashtable f2031g;
    private String f2032h;
    private aV f2033i;
    private aW f2034j;
    private /* synthetic */ aX f2035k;

    private aY(aX aXVar, byte b) {
        this.f2035k = aXVar;
        this.f2025a = true;
        this.f2026b = "HttpReader";
        this.f2029e = 0;
        this.f2032h = BuildConfig.FLAVOR;
    }

    public final void m1938a() {
        this.f2025a = false;
    }

    public final synchronized void m1939a(aV aVVar, aW aWVar) {
        this.f2033i = aVVar;
        this.f2034j = aWVar;
    }

    public final boolean m1940a(Hashtable hashtable, aV aVVar, aW aWVar) {
        LuaNil luaNil = hashtable.get("url");
        if (luaNil == null || luaNil == LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d(this.f2026b, "Invalid Streaming URL : " + this.f2028d);
            }
            return false;
        }
        this.f2028d = (String) luaNil;
        luaNil = hashtable.get("cookie");
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            Hashtable hashtable2 = ((LuaTable) luaNil).map;
            if (hashtable2 != null && hashtable2.size() > 0) {
                Enumeration keys = hashtable2.keys();
                this.f2032h = BuildConfig.FLAVOR;
                while (true) {
                    String str = (String) keys.nextElement();
                    this.f2032h += str + "=" + ((String) hashtable2.get(str));
                    if (!keys.hasMoreElements()) {
                        break;
                    }
                    this.f2032h += ";";
                }
                if (KonyMain.f3657e) {
                    Log.d(this.f2026b, "Streaming cookie String : " + this.f2032h);
                }
            }
        }
        luaNil = hashtable.get("headers");
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            this.f2030f = ((LuaTable) luaNil).map;
        }
        luaNil = hashtable.get("params");
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            this.f2031g = ((LuaTable) luaNil).map;
        }
        luaNil = hashtable.get("method");
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            str = (String) luaNil;
            if (KonyMain.f3657e) {
                Log.d(this.f2026b, "callType : " + str);
            }
            if (str.equalsIgnoreCase("get")) {
                this.f2029e = 1;
            }
        }
        this.f2033i = aVVar;
        this.f2034j = aWVar;
        return true;
    }

    public final void run() {
        Enumeration keys;
        InputStream h;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable e;
        InputStream inputStream;
        IOException e2;
        InputStreamReader inputStreamReader2 = null;
        this.f2027c = new az(this.f2028d, (byte) 0);
        if (KonyMain.f3657e) {
            Log.d(this.f2026b, "Opening Via HttpNewReader to " + this.f2028d);
        }
        if (this.f2030f != null && this.f2030f.size() > 0) {
            keys = this.f2030f.keys();
            while (keys.hasMoreElements()) {
                String str = (String) keys.nextElement();
                this.f2027c.m3563a(str, (String) this.f2030f.get(str));
            }
        }
        this.f2027c.m3563a("Cookie", this.f2032h);
        if (this.f2031g != null && this.f2031g.size() > 0) {
            keys = this.f2031g.keys();
            while (keys.hasMoreElements()) {
                Object obj = (String) keys.nextElement();
                this.f2027c.m3562a(obj, (String) this.f2031g.get(obj));
            }
        }
        try {
            BufferedReader bufferedReader2;
            this.f2027c.m3561a(this.f2029e);
            this.f2027c.m3574k();
            if (this.f2027c.m3567d()) {
                h = this.f2027c.m3571h();
                if (h != null) {
                    try {
                        inputStreamReader = new InputStreamReader(h, "UTF-8");
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                        } catch (IOException e3) {
                            e = e3;
                            bufferedReader = null;
                            inputStreamReader2 = inputStreamReader;
                            inputStream = h;
                            try {
                                if (KonyMain.f3657e) {
                                    Log.e(this.f2026b, "HttpReader run() IOException", e);
                                }
                                if (this.f2033i != null) {
                                    this.f2033i.m1936a(1002, e.getMessage(), this.f2027c.m3569f());
                                }
                                if (KonyMain.f3657e) {
                                    Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
                                }
                                this.f2027c.m3572i();
                                this.f2025a = false;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        e2 = e4;
                                        e2.printStackTrace();
                                    }
                                }
                                if (inputStreamReader2 != null) {
                                    inputStreamReader2.close();
                                }
                                if (inputStream == null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th) {
                                e = th;
                                h = inputStream;
                                if (KonyMain.f3657e) {
                                    Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
                                }
                                this.f2027c.m3572i();
                                this.f2025a = false;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                        throw e;
                                    }
                                }
                                if (inputStreamReader2 != null) {
                                    inputStreamReader2.close();
                                }
                                if (h != null) {
                                    h.close();
                                }
                                throw e;
                            }
                        } catch (Throwable th2) {
                            e = th2;
                            bufferedReader = null;
                            inputStreamReader2 = inputStreamReader;
                            if (KonyMain.f3657e) {
                                Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
                            }
                            this.f2027c.m3572i();
                            this.f2025a = false;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (inputStreamReader2 != null) {
                                inputStreamReader2.close();
                            }
                            if (h != null) {
                                h.close();
                            }
                            throw e;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        bufferedReader = null;
                        inputStream = h;
                        if (KonyMain.f3657e) {
                            Log.e(this.f2026b, "HttpReader run() IOException", e);
                        }
                        if (this.f2033i != null) {
                            this.f2033i.m1936a(1002, e.getMessage(), this.f2027c.m3569f());
                        }
                        if (KonyMain.f3657e) {
                            Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
                        }
                        this.f2027c.m3572i();
                        this.f2025a = false;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                        if (inputStream == null) {
                            inputStream.close();
                        }
                    } catch (Throwable th3) {
                        e = th3;
                        bufferedReader = null;
                        if (KonyMain.f3657e) {
                            Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
                        }
                        this.f2027c.m3572i();
                        this.f2025a = false;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                        if (h != null) {
                            h.close();
                        }
                        throw e;
                    }
                    try {
                        if (KonyMain.f3657e) {
                            Log.d(this.f2026b, "opened InputStreamReader Via HttpNewReader to " + this.f2028d);
                        }
                        System.currentTimeMillis();
                        while (this.f2025a) {
                            obj = bufferedReader.readLine();
                            if (obj == null) {
                                break;
                            } else if (this.f2034j != null) {
                                aW aWVar = this.f2034j;
                                if (this.f2035k.f3589a == 1) {
                                    obj = aH.m1892a((String) obj);
                                }
                                aWVar.m1937a(0, obj);
                            }
                        }
                        bufferedReader2 = bufferedReader;
                    } catch (IOException e7) {
                        e = e7;
                        inputStreamReader2 = inputStreamReader;
                        inputStream = h;
                        if (KonyMain.f3657e) {
                            Log.e(this.f2026b, "HttpReader run() IOException", e);
                        }
                        if (this.f2033i != null) {
                            this.f2033i.m1936a(1002, e.getMessage(), this.f2027c.m3569f());
                        }
                        if (KonyMain.f3657e) {
                            Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
                        }
                        this.f2027c.m3572i();
                        this.f2025a = false;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                        if (inputStream == null) {
                            inputStream.close();
                        }
                    } catch (Throwable th4) {
                        e = th4;
                        inputStreamReader2 = inputStreamReader;
                        if (KonyMain.f3657e) {
                            Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
                        }
                        this.f2027c.m3572i();
                        this.f2025a = false;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                        if (h != null) {
                            h.close();
                        }
                        throw e;
                    }
                } else if (this.f2033i != null) {
                    this.f2033i.m1936a(1015, this.f2027c.m3568e(), this.f2027c.m3569f());
                    inputStreamReader = null;
                } else {
                    inputStreamReader = null;
                }
            } else {
                if (this.f2033i != null) {
                    this.f2033i.m1936a(1012, this.f2027c.m3568e(), this.f2027c.m3569f());
                }
                inputStreamReader = null;
                h = null;
            }
            if (KonyMain.f3657e) {
                Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
            }
            this.f2027c.m3572i();
            this.f2025a = false;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e8) {
                    e2 = e8;
                    e2.printStackTrace();
                }
            }
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e9) {
                    e2 = e9;
                    e2.printStackTrace();
                }
            }
            if (h != null) {
                try {
                    h.close();
                } catch (IOException e10) {
                    e2 = e10;
                    e2.printStackTrace();
                }
            }
        } catch (IOException e11) {
            e = e11;
            bufferedReader = null;
            inputStream = null;
            if (KonyMain.f3657e) {
                Log.e(this.f2026b, "HttpReader run() IOException", e);
            }
            if (this.f2033i != null) {
                this.f2033i.m1936a(1002, e.getMessage(), this.f2027c.m3569f());
            }
            if (KonyMain.f3657e) {
                Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
            }
            this.f2027c.m3572i();
            this.f2025a = false;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (inputStream == null) {
                inputStream.close();
            }
        } catch (Throwable th5) {
            e = th5;
            bufferedReader = null;
            h = null;
            if (KonyMain.f3657e) {
                Log.d(this.f2026b, "disconnecting Via HttpNewReader to " + this.f2028d);
            }
            this.f2027c.m3572i();
            this.f2025a = false;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (h != null) {
                h.close();
            }
            throw e;
        }
    }
}
