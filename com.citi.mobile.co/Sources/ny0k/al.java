package ny0k;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0373w;
import com.konylabs.api.ui.ii;
import com.konylabs.js.api.KonyJSONString;
import com.konylabs.js.api.KonyJSObject;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.konylabs.vmintf.KonyJSVM;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class al extends KonyJSObject implements Runnable, aT {
    private static String f3594a;
    private static String f3595b;
    private static String f3596c;
    private static String f3597d;
    private static String f3598e;
    private static String f3599f;
    private static String f3600g;
    private static String f3601l;
    private static ThreadSafeClientConnManager f3602m;
    private static boolean f3603n;
    private static HttpParams f3604o;
    private String f3605A;
    private String f3606B;
    private URL f3607C;
    private boolean f3608D;
    private C0444X f3609E;
    private boolean f3610F;
    private C0245j f3611G;
    private DefaultHttpClient f3612h;
    private HttpResponse f3613i;
    private Hashtable f3614j;
    private List f3615k;
    private String f3616p;
    private String f3617q;
    private Boolean f3618r;
    private HttpRequestBase f3619s;
    private boolean f3620t;
    private String f3621u;
    private int f3622v;
    private KonyJSONString f3623w;
    private ak f3624x;
    private String f3625y;
    private int f3626z;

    static {
        f3594a = "timeout";
        f3595b = NotificationCompatApi21.CATEGORY_STATUS;
        f3596c = "statustext";
        f3597d = "responsetype";
        f3598e = "response";
        f3599f = "readystate";
        f3600g = "onreadystatechange";
        if (KonyMain.m4057C()) {
            f3594a = "timeout";
            f3595b = NotificationCompatApi21.CATEGORY_STATUS;
            f3596c = "statusText";
            f3597d = "responseType";
            f3598e = "response";
            f3599f = "readyState";
            f3600g = "onReadyStateChange";
        }
        f3601l = "Apache-HttpClient/android";
        f3602m = null;
        f3603n = true;
        f3604o = null;
        StringBuilder append = new StringBuilder().append("Apache-HttpClient/android/");
        C0373w c0373w = new C0373w();
        f3601l = append.append(C0373w.m3363a()[0].toString()).toString();
    }

    public al(long j) {
        this.f3614j = new Hashtable();
        this.f3615k = new ArrayList();
        this.f3618r = Boolean.valueOf(true);
        this.f3622v = 0;
        this.f3608D = false;
        this.f3610F = false;
        this.f3611G = null;
        this.f3611G = KonyMain.m4061G();
        this.ap = KonyJSVM.createPersistent(j);
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4154a((aT) this);
        }
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        if (f3604o == null) {
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
            HttpProtocolParams.setUseExpectContinue(basicHttpParams, true);
            HttpProtocolParams.setUserAgent(basicHttpParams, f3601l);
            HttpClientParams.setRedirecting(basicHttpParams, false);
            f3604o = basicHttpParams;
        }
        if (f3603n && f3602m == null) {
            int f = cG.m2115f();
            int g = cG.m2116g();
            f3604o.setParameter("http.conn-manager.max-total", Integer.valueOf(f));
            f3604o.setParameter("http.conn-manager.max-per-route", new ConnPerRouteBean(g));
            f3602m = new ThreadSafeClientConnManager(f3604o, schemeRegistry);
        }
        this.f3612h = f3602m != null ? new DefaultHttpClient(f3602m, f3604o) : new DefaultHttpClient(f3604o);
        this.f3622v = 0;
        m4030g();
    }

    private void m4024b(ak akVar) {
        if (this.f3617q != null) {
            String str;
            if (this.f3616p.intern() == "GET") {
                StringBuffer stringBuffer = new StringBuffer(this.f3617q);
                if (KonyMain.f3657e) {
                    Log.d("KonyHttpRequest", BuildConfig.FLAVOR + stringBuffer.toString());
                }
                try {
                    URI uri = new URI(stringBuffer.toString());
                    HttpRequest httpGet = new HttpGet(uri);
                    this.f3619s = httpGet;
                    if (!(this.f3606B == null || this.f3605A == null)) {
                        this.f3612h.getCredentialsProvider().setCredentials(new AuthScope(uri.getHost(), -1), new UsernamePasswordCredentials(this.f3606B, this.f3605A));
                    }
                    if (cG.m2120k()) {
                        httpGet.setHeader("Accept-Encoding", "gzip");
                    }
                    this.f3620t = false;
                    if (this.f3614j.size() > 0) {
                        Enumeration keys = this.f3614j.keys();
                        while (keys.hasMoreElements()) {
                            str = (String) keys.nextElement();
                            if (KonyMain.f3657e) {
                                Log.d("KonyHttpRequest", "Header Set is -- Name = " + str + " Value = " + ((String) this.f3614j.get(str)));
                            }
                            httpGet.setHeader(str, (String) this.f3614j.get(str));
                            if (str.equals("Cookie")) {
                                this.f3620t = true;
                            }
                        }
                    }
                    try {
                        HttpHost httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
                        if (this.f3620t) {
                            aj.m1988a(httpHost);
                        }
                        if (this.f3608D) {
                            this.f3613i = this.f3612h.execute(httpHost, httpGet);
                            m4033j();
                            if (KonyMain.f3657e && this.f3613i != null) {
                                Header[] allHeaders = this.f3613i.getAllHeaders();
                                if (allHeaders != null) {
                                    for (Header header : allHeaders) {
                                        if (!(header.getName() == null || header.getValue() == null)) {
                                            Log.d("KonyHttpRequest", "Response Header - Name  = " + header.getName() + " Value = " + header.getValue());
                                        }
                                    }
                                }
                            }
                            if (this.f3622v != 4) {
                                this.f3622v = 4;
                                m4030g();
                                if (this.f3622v == 4 && this.ap != 0) {
                                    this.f3611G.m1728a(new ap(this));
                                    m4031h();
                                }
                            }
                        } else if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new ap(this));
                                m4031h();
                            }
                        }
                    } catch (ClientProtocolException e) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e.getMessage());
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new ap(this));
                                m4031h();
                            }
                        }
                    } catch (IOException e2) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e2.getMessage());
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new ap(this));
                                m4031h();
                            }
                        }
                    } catch (IllegalArgumentException e3) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e3.getMessage());
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new ap(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new ap(this));
                                m4031h();
                            }
                        }
                    }
                } catch (URISyntaxException e4) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e4.getMessage());
                    }
                }
            } else if (this.f3616p.intern() == "POST") {
                this.f3620t = false;
                try {
                    URI uri2 = new URI(this.f3617q);
                    try {
                        HttpHost httpHost2 = new HttpHost(uri2.getHost(), uri2.getPort(), uri2.getScheme());
                        HttpRequest httpPost = new HttpPost(uri2.getPath());
                        this.f3619s = httpPost;
                        if (!(this.f3606B == null || this.f3605A == null)) {
                            this.f3612h.getCredentialsProvider().setCredentials(new AuthScope(uri2.getHost(), -1), new UsernamePasswordCredentials(this.f3606B, this.f3605A));
                        }
                        if (cG.m2120k()) {
                            httpPost.setHeader("Accept-Encoding", "gzip");
                        }
                        if (this.f3614j.size() > 0) {
                            Enumeration keys2 = this.f3614j.keys();
                            while (keys2.hasMoreElements()) {
                                str = (String) keys2.nextElement();
                                if (KonyMain.f3657e) {
                                    Log.d("KonyHttpRequest", "header set is -- " + str + ((String) this.f3614j.get(str)));
                                }
                                httpPost.setHeader(str, (String) this.f3614j.get(str));
                                if (str.equals("Cookie")) {
                                    this.f3620t = true;
                                }
                            }
                        }
                        if (this.f3620t) {
                            aj.m1988a(httpHost2);
                        }
                        if (akVar != null) {
                            this.f3615k = akVar.m1994a();
                        }
                        if (this.f3615k.size() > 0) {
                            httpPost.setEntity(new UrlEncodedFormEntity(this.f3615k, "UTF-8"));
                        }
                        if (this.f3608D) {
                            this.f3613i = this.f3612h.execute(httpHost2, httpPost);
                            m4033j();
                            if (this.f3622v != 4) {
                                this.f3622v = 4;
                                m4030g();
                                if (this.f3622v == 4 && this.ap != 0) {
                                    this.f3611G.m1728a(new aq(this));
                                    m4031h();
                                }
                            }
                        } else if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable e5) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e5.getMessage(), e5);
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable e52) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e52.getMessage(), e52);
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable e522) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e522.getMessage(), e522);
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable e5222) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e5222.getMessage(), e5222);
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable e52222) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e52222.getMessage(), e52222);
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable e522222) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e522222.getMessage(), e522222);
                        }
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    } catch (Throwable th2) {
                        if (this.f3622v != 4) {
                            this.f3622v = 4;
                            m4030g();
                            if (this.f3622v == 4 && this.ap != 0) {
                                this.f3611G.m1728a(new aq(this));
                                m4031h();
                            }
                        }
                    }
                } catch (URISyntaxException e42) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e42.getMessage());
                    }
                }
            }
        }
    }

    public static void m4027c() {
        if (f3602m != null) {
            KonyMain.m4121f().post(new an());
        }
    }

    private void m4030g() {
        LuaNil table = getTable(f3600g);
        if (table == LuaNil.nil) {
            return;
        }
        if (Thread.currentThread() != this.f3611G.m1725a()) {
            Runnable iiVar = new ii(new am(this, table));
            this.f3611G.m1728a(iiVar);
            iiVar.m1406a();
            return;
        }
        try {
            ((Function) table).execute(new Object[]{this});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m4031h() {
        if (!f3603n) {
            this.f3612h.getConnectionManager().shutdown();
        }
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4156b((aT) this);
        }
    }

    private InputStream m4032i() {
        if (this.f3613i != null) {
            HttpEntity entity = this.f3613i.getEntity();
            if (entity != null) {
                try {
                    InputStream content = entity.getContent();
                    Header firstHeader = this.f3613i.getFirstHeader("Content-Encoding");
                    return (firstHeader == null || firstHeader.getValue() == null || !firstHeader.getValue().equalsIgnoreCase("gzip")) ? content : new GZIPInputStream(content);
                } catch (IllegalStateException e) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e.getMessage());
                    }
                } catch (IOException e2) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyHttpRequest", BuildConfig.FLAVOR + e2.getMessage());
                    }
                }
            }
        }
        return null;
    }

    private void m4033j() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x00b8 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:58)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r8 = this;
        r4 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r7 = 4;
        r2 = 3;
        r6 = 0;
        r5 = 0;
        r0 = r8.f3613i;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = r8.f3613i;
        r0 = r0.getStatusLine();
        r0 = r0.getStatusCode();
        r8.f3626z = r0;
        r0 = r8.f3626z;
        r1 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r0 == r1) goto L_0x002d;
    L_0x001d:
        r0 = r8.f3626z;
        r1 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        if (r0 == r1) goto L_0x002d;
    L_0x0023:
        r0 = r8.f3626z;
        if (r0 == r4) goto L_0x002d;
    L_0x0027:
        r0 = r8.f3626z;
        r1 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        if (r0 != r1) goto L_0x008f;
    L_0x002d:
        r0 = r8.m4041e();
        r1 = "Location";
        r0 = r0.getTable(r1);
        r0 = (java.lang.String) r0;
        r1 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x004e }
        r1.<init>(r0);	 Catch:{ MalformedURLException -> 0x004e }
    L_0x003e:
        r8.f3617q = r0;
        r0 = r8.f3626z;
        if (r0 != r4) goto L_0x0048;
    L_0x0044:
        r0 = "GET";
        r8.f3616p = r0;
    L_0x0048:
        r0 = r8.f3624x;
        r8.m4024b(r0);
        goto L_0x000a;
    L_0x004e:
        r1 = move-exception;
        r1 = r8.f3607C;
        r1 = r1.getPath();
        r2 = "";
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x007b;
    L_0x005d:
        r2 = r8.f3617q;
        r1 = r2.indexOf(r1);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r8.f3617q;
        r1 = r3.substring(r6, r1);
        r1 = r2.append(r1);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x003e;
    L_0x007b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r8.f3617q;
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x003e;
    L_0x008f:
        r0 = r8.f3618r;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x009d;
    L_0x0097:
        r0 = 2;
        r8.f3622v = r0;
        r8.m4030g();
    L_0x009d:
        r0 = r8.f3613i;
        if (r0 != 0) goto L_0x00cf;
    L_0x00a1:
        r0 = "";
    L_0x00a3:
        r8.f3621u = r0;
        r0 = r8.f3621u;
        r1 = "rawdata";
        if (r0 != r1) goto L_0x0123;
    L_0x00ab:
        r0 = r8.f3618r;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00b8;
    L_0x00b3:
        r8.f3622v = r2;
        r8.m4030g();
    L_0x00b8:
        r0 = r8.f3608D;
        if (r0 != 0) goto L_0x01fa;
    L_0x00bc:
        r8.f3613i = r5;
        r8.f3625y = r5;
        r0 = r8.f3609E;
        if (r0 == 0) goto L_0x000a;
    L_0x00c4:
        r0 = r8.f3609E;
        r0.m4012d();
        r8.f3609E = r5;
        r8.f3610F = r6;
        goto L_0x000a;
    L_0x00cf:
        r0 = r8.f3613i;
        r0 = r0.getEntity();
        r0 = r0.getContentType();
        if (r0 != 0) goto L_0x00de;
    L_0x00db:
        r0 = "rawdata";
        goto L_0x00a3;
    L_0x00de:
        r0 = r0.getValue();
        if (r0 != 0) goto L_0x00e7;
    L_0x00e4:
        r0 = "rawdata";
        goto L_0x00a3;
    L_0x00e7:
        r1 = "application/text";
        r1 = r0.contains(r1);
        if (r1 != 0) goto L_0x00f7;
    L_0x00ef:
        r1 = "text/plain";
        r1 = r0.contains(r1);
        if (r1 == 0) goto L_0x00fa;
    L_0x00f7:
        r0 = "text";
        goto L_0x00a3;
    L_0x00fa:
        r1 = "application/json";
        r1 = r0.contains(r1);
        if (r1 == 0) goto L_0x0105;
    L_0x0102:
        r0 = "json";
        goto L_0x00a3;
    L_0x0105:
        r1 = "application/xml";
        r1 = r0.contains(r1);
        if (r1 != 0) goto L_0x011d;
    L_0x010d:
        r1 = "text/xml";
        r1 = r0.contains(r1);
        if (r1 != 0) goto L_0x011d;
    L_0x0115:
        r1 = "text/html";
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0120;
    L_0x011d:
        r0 = "document";
        goto L_0x00a3;
    L_0x0120:
        r0 = "rawdata";
        goto L_0x00a3;
    L_0x0123:
        r1 = r8.m4032i();
        if (r1 == 0) goto L_0x000a;
    L_0x0129:
        r0 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r2 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r2 = new java.lang.StringBuffer;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r2.<init>();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r3 = r0.readLine();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        if (r3 == 0) goto L_0x0141;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
    L_0x013e:
        r2.append(r3);	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
    L_0x0141:
        r3 = r8.f3618r;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r3 = r3.booleanValue();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        if (r3 == 0) goto L_0x014f;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
    L_0x0149:
        r3 = 3;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r8.f3622v = r3;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r8.m4030g();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
    L_0x014f:
        r3 = r0.readLine();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        if (r3 == 0) goto L_0x01a2;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
    L_0x0155:
        r2.append(r3);	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        goto L_0x014f;
    L_0x0159:
        r0 = move-exception;
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        if (r2 == 0) goto L_0x017a;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
    L_0x015e:
        r2 = "KonyHttpRequest";	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r3.<init>();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r4 = "";	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r4 = r0.getMessage();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        android.util.Log.d(r2, r3, r0);	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
    L_0x017a:
        r1.close();
        goto L_0x00b8;
    L_0x017f:
        r0 = move-exception;
        r1 = com.konylabs.android.KonyMain.f3657e;
        if (r1 == 0) goto L_0x00b8;
    L_0x0184:
        r1 = "KonyHttpRequest";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        r2 = r2.append(r3);
        r3 = r0.getMessage();
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.d(r1, r2, r0);
        goto L_0x00b8;
    L_0x01a2:
        r0 = r2.toString();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r8.f3625y = r0;	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r1.close();	 Catch:{ IOException -> 0x0159, all -> 0x01d3 }
        r1.close();	 Catch:{ IOException -> 0x01b0 }
        goto L_0x00b8;
    L_0x01b0:
        r0 = move-exception;
        r1 = com.konylabs.android.KonyMain.f3657e;
        if (r1 == 0) goto L_0x00b8;
    L_0x01b5:
        r1 = "KonyHttpRequest";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        r2 = r2.append(r3);
        r3 = r0.getMessage();
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.d(r1, r2, r0);
        goto L_0x00b8;
    L_0x01d3:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x01d8 }
    L_0x01d7:
        throw r0;
    L_0x01d8:
        r1 = move-exception;
        r2 = com.konylabs.android.KonyMain.f3657e;
        if (r2 == 0) goto L_0x01d7;
    L_0x01dd:
        r2 = "KonyHttpRequest";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "";
        r3 = r3.append(r4);
        r4 = r1.getMessage();
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.d(r2, r3, r1);
        goto L_0x01d7;
    L_0x01fa:
        r8.f3622v = r7;
        r8.m4030g();
        r0 = r8.f3622v;
        if (r0 != r7) goto L_0x000a;
    L_0x0203:
        r0 = r8.ap;
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x000a;
    L_0x020b:
        r0 = r8.f3611G;
        r1 = new ny0k.ar;
        r1.<init>(r8);
        r0.m1728a(r1);
        r8.m4031h();
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.al.j():void");
    }

    public final String m4034a(String str) {
        String str2 = null;
        if (this.f3613i != null) {
            Header[] allHeaders = this.f3613i.getAllHeaders();
            if (allHeaders != null) {
                for (Header header : allHeaders) {
                    String name = header.getName();
                    if (name != null && name.equals(str)) {
                        str2 = str2 != null ? str2.concat(", " + header.getValue()) : header.getValue();
                    }
                }
            }
        }
        return str2;
    }

    public final void m4035a() {
    }

    public final void m4036a(String str, String str2) {
        if (this.f3622v != 1) {
            throw new LuaError(0, "InvalidStateError", "HttpRequest's setRequestHeader() called before HttpRequest's open()");
        }
        Object obj;
        String str3 = (String) this.f3614j.get(str);
        if (str3 != null) {
            obj = str3 + ", " + str2;
        }
        this.f3614j.put(str, obj);
    }

    public final void m4037a(String str, String str2, Boolean bool, String str3, String str4) {
        m4040d();
        this.f3613i = null;
        this.f3625y = null;
        this.f3623w = null;
        if (this.f3609E != null) {
            this.f3609E.m4012d();
            this.f3609E = null;
            this.f3610F = false;
        }
        this.f3616p = str;
        this.f3617q = str2;
        try {
            this.f3607C = new URL(this.f3617q);
            this.f3618r = bool;
            this.f3606B = str3;
            this.f3605A = str4;
            this.f3612h.setCookieStore(aj.m1986a(str2));
            this.f3622v = 1;
            m4030g();
        } catch (MalformedURLException e) {
            throw new LuaError(0, "Syntax Error", "Invalid Url for HttpRequest.open()");
        }
    }

    public final void m4038a(ak akVar) {
        if (this.f3622v != 1) {
            throw new LuaError(0, "InvalidStateError", "HttpRequest's send method called before HttpRequest's open");
        } else if (this.f3608D) {
            throw new LuaError(0, "InvalidStateError", "HttpRequest's send method called without HttpRequest's open");
        } else {
            if (this.f3609E != null) {
                this.f3609E.m4012d();
                this.f3609E = null;
                this.f3610F = false;
            }
            this.f3624x = akVar;
            this.f3608D = true;
            if (this.f3618r.booleanValue()) {
                new Thread(this).start();
            } else {
                m4024b(akVar);
            }
        }
    }

    public final void m4039b() {
        m4040d();
    }

    public final void m4040d() {
        if (this.f3618r.booleanValue()) {
            if (Thread.currentThread() != KonyMain.m4121f().getLooper().getThread()) {
                KonyMain.m4121f().post(new ao(this));
            } else if (this.f3619s != null) {
                this.f3619s.abort();
            }
            this.f3608D = false;
        }
    }

    public final LuaTable m4041e() {
        if (this.f3613i == null) {
            return null;
        }
        Header[] allHeaders = this.f3613i.getAllHeaders();
        if (allHeaders == null) {
            return null;
        }
        LuaTable luaTable = new LuaTable();
        for (Header header : allHeaders) {
            String name = header.getName();
            String value = header.getValue();
            if (!(name == null || value == null)) {
                LuaNil table = luaTable.getTable(name);
                if (table == LuaNil.nil || table == null) {
                    luaTable.setTable(name, value);
                } else {
                    luaTable.setTable(name, ((String) table).concat(", " + value));
                }
            }
        }
        return luaTable;
    }

    public final Object getTable(Object obj) {
        int i = 0;
        String intern = ((String) obj).intern();
        if (intern == f3595b) {
            if (this.f3613i != null) {
                i = this.f3613i.getStatusLine().getStatusCode();
                super.setTable(f3595b, Integer.valueOf(i));
            }
            return Integer.valueOf(i);
        } else if (intern == f3596c) {
            return this.f3613i != null ? this.f3613i.getStatusLine().getReasonPhrase() : BuildConfig.FLAVOR;
        } else {
            if (intern == f3597d) {
                return this.f3621u;
            }
            if (intern != f3598e) {
                return intern == f3599f ? Integer.valueOf(this.f3622v) : super.getTable(intern);
            } else {
                if (this.f3613i == null) {
                    return null;
                }
                if (this.f3621u == "json") {
                    if (this.f3623w == null && this.f3625y != null) {
                        this.f3623w = new KonyJSONString(this.f3625y, null);
                    }
                    return this.f3623w;
                } else if (this.f3621u != "rawdata") {
                    return this.f3625y;
                } else {
                    if (this.f3609E == null) {
                        if (m4032i() == null) {
                            return null;
                        }
                        this.f3609E = (C0444X) KonyJSVM.createJSObject("kony.types.RawBytes", new Object[]{m4032i()});
                        this.f3610F = true;
                    }
                    return this.f3609E;
                }
            }
        }
    }

    public final void run() {
        m4024b(this.f3624x);
    }

    public final void setJSObject(long j) {
        super.setJSObject(j);
        try {
            if (this.f3613i != null && this.f3621u == "rawdata" && !this.f3610F) {
                HttpEntity entity = this.f3613i.getEntity();
                if (entity != null) {
                    InputStream content = entity.getContent();
                    if (content != null) {
                        content.close();
                    }
                }
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        String intern = ((String) obj).intern();
        if (this.f3612h != null && intern == f3594a) {
            int i = 180000;
            LuaNil table = super.getTable(f3594a);
            if (!(table == null || table == LuaNil.nil)) {
                try {
                    i = ((int) Double.parseDouble(table.toString())) * 1000;
                } catch (NumberFormatException e) {
                }
            }
            HttpConnectionParams.setConnectionTimeout(f3604o, i);
            HttpConnectionParams.setSoTimeout(f3604o, i);
        }
    }
}
