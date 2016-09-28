package ny0k;

import android.database.Cursor;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Base64;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0369u;
import com.konylabs.api.C0373w;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.http.multipart.MultiPartHttpPost;
import com.konylabs.vm.LuaNil;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
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
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class az implements aT {
    private static String f3260n;
    private static ThreadSafeClientConnManager f3261o;
    private static boolean f3262p;
    private static boolean f3263q;
    HttpRequestBase f3264a;
    private int f3265b;
    private String f3266c;
    private int f3267d;
    private DefaultHttpClient f3268e;
    private HttpResponse f3269f;
    private List f3270g;
    private Hashtable f3271h;
    private String f3272i;
    private boolean f3273j;
    private af f3274k;
    private boolean f3275l;
    private Hashtable f3276m;
    private String f3277r;
    private boolean f3278s;
    private HttpParams f3279t;

    static {
        f3260n = "Apache-HttpClient/android";
        f3261o = null;
        f3262p = true;
        f3263q = true;
        ag.m1980a(KonyMain.getAppContext());
        StringBuilder append = new StringBuilder().append("Apache-HttpClient/android/");
        C0373w c0373w = new C0373w();
        f3260n = append.append(C0373w.m3363a()[0].toString()).toString();
        f3262p = cG.m2114e();
        f3263q = cG.m2121l();
    }

    public az(String str) {
        this.f3265b = 0;
        this.f3267d = 1000;
        this.f3270g = new ArrayList();
        this.f3271h = new Hashtable();
        this.f3279t = null;
        this.f3266c = str;
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", as.m1996a(), 443));
        this.f3268e = m3552a(schemeRegistry);
        this.f3268e.setCookieStore(aj.m1986a(str));
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4154a((aT) this);
        }
    }

    public az(String str, byte b) {
        this.f3265b = 0;
        this.f3267d = 1000;
        this.f3270g = new ArrayList();
        this.f3271h = new Hashtable();
        this.f3279t = null;
        this.f3266c = str;
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", as.m1996a(), 443));
        this.f3268e = m3552a(schemeRegistry);
        this.f3268e.setCookieStore(aj.m1986a(str));
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4154a((aT) this);
        }
    }

    public az(String str, boolean z) {
        this(str, (byte) 0);
        this.f3273j = true;
    }

    private DefaultHttpClient m3552a(SchemeRegistry schemeRegistry) {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, f3263q);
        HttpProtocolParams.setUserAgent(basicHttpParams, f3260n);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        this.f3279t = basicHttpParams;
        if (f3262p && f3261o == null) {
            int f = cG.m2115f();
            int g = cG.m2116g();
            this.f3279t.setParameter("http.conn-manager.max-total", Integer.valueOf(f));
            this.f3279t.setParameter("http.conn-manager.max-per-route", new ConnPerRouteBean(g));
            f3261o = new ThreadSafeClientConnManager(this.f3279t, schemeRegistry);
        }
        return f3261o != null ? new DefaultHttpClient(f3261o, this.f3279t) : new DefaultHttpClient(this.f3279t);
    }

    public static Object[] m3553a(az azVar) throws aE {
        String str;
        HashMap hashMap = null;
        if (azVar.m3567d()) {
            InputStream h = azVar.m3571h();
            if (h != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(h));
                    StringBuffer stringBuffer = new StringBuffer();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", Thread.currentThread() + ":" + new Date(currentTimeMillis).toGMTString() + "(" + currentTimeMillis + "):" + "Receiving Response From Service");
                    }
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        stringBuffer.append(readLine);
                    }
                    while (true) {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuffer.append(readLine);
                    }
                    str = new String(stringBuffer);
                    hashMap = azVar.m3557o();
                    h.close();
                    try {
                        h.close();
                    } catch (Throwable e) {
                        if (KonyMain.f3657e) {
                            Log.d("ServiceInvoker", BuildConfig.FLAVOR + e.getMessage(), e);
                        }
                    }
                } catch (Throwable e2) {
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", BuildConfig.FLAVOR + e2.getMessage(), e2);
                    }
                    throw new aE(1011, "Network error");
                } catch (Throwable th) {
                    try {
                        h.close();
                    } catch (Throwable e3) {
                        if (KonyMain.f3657e) {
                            Log.d("ServiceInvoker", BuildConfig.FLAVOR + e3.getMessage(), e3);
                        }
                    }
                }
            } else {
                str = null;
            }
        } else if (azVar.f3269f == null || azVar.f3269f.getStatusLine().getStatusCode() != 302) {
            aE aEVar = new aE(azVar.m3569f(), azVar.m3568e());
            aEVar.m1866a(azVar.m3557o());
            throw aEVar;
        } else {
            az azVar2 = new az((String) azVar.m3558p().get("Location"), (byte) 0);
            azVar2.f3265b = azVar.f3265b;
            azVar2.m3574k();
            Object[] a = m3553a(azVar2);
            str = (String) a[0];
            hashMap = (HashMap) a[1];
        }
        return new Object[]{str, hashMap};
    }

    public static void m3554c() {
        if (f3261o != null) {
            KonyMain.m4121f().post(new aA());
        }
    }

    private InputStream m3556n() {
        if (this.f3269f != null) {
            HttpEntity entity = this.f3269f.getEntity();
            if (entity != null) {
                try {
                    Header firstHeader = this.f3269f.getFirstHeader("Content-Encoding");
                    return (firstHeader == null || firstHeader.getValue() == null || !firstHeader.getValue().equalsIgnoreCase("gzip")) ? new BufferedHttpEntity(entity).getContent() : new GZIPInputStream(entity.getContent());
                } catch (IllegalStateException e) {
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", BuildConfig.FLAVOR + e.getMessage());
                    }
                } catch (IOException e2) {
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", BuildConfig.FLAVOR + e2.getMessage());
                    }
                }
            }
        }
        return null;
    }

    private HashMap m3557o() {
        Object d;
        HashMap p;
        HashMap hashMap = new HashMap();
        hashMap.put("cookies", m3559q());
        String str = "responsecode";
        if (this.f3269f != null) {
            StatusLine statusLine = this.f3269f.getStatusLine();
            if (statusLine != null) {
                d = new Double((double) statusLine.getStatusCode());
                hashMap.put(str, d);
                hashMap.put("url", this.f3266c);
                p = m3558p();
                if (p != null) {
                    hashMap.put("headers", p);
                }
                return hashMap;
            }
        }
        d = new Double((double) m3569f());
        hashMap.put(str, d);
        hashMap.put("url", this.f3266c);
        p = m3558p();
        if (p != null) {
            hashMap.put("headers", p);
        }
        return hashMap;
    }

    private HashMap m3558p() {
        if (this.f3269f != null) {
            Header[] allHeaders = this.f3269f.getAllHeaders();
            if (allHeaders != null) {
                HashMap hashMap = new HashMap();
                for (Header header : allHeaders) {
                    String name = header.getName();
                    String value = header.getValue();
                    if (!(name == null || value == null)) {
                        LuaNil luaNil = hashMap.get(name);
                        if (luaNil == null || luaNil == LuaNil.nil) {
                            hashMap.put(name, value);
                        } else {
                            hashMap.put(name, ((String) luaNil).concat(", " + value));
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    return hashMap;
                }
            }
        }
        return null;
    }

    private String m3559q() {
        if (!(this.f3269f == null || aj.m1986a(this.f3266c).getCookies() == null || this.f3277r == null)) {
            StringBuffer stringBuffer = new StringBuffer();
            List cookies = aj.m1986a(this.f3266c).getCookies();
            if (!cookies.isEmpty()) {
                int size = cookies.size();
                for (int i = 0; i < size; i++) {
                    Cookie cookie = (Cookie) cookies.get(i);
                    String domain = cookie.getDomain();
                    if (domain != null && domain.equalsIgnoreCase(this.f3277r)) {
                        stringBuffer.append(cookie.getName() + "=" + cookie.getValue());
                        if (i != size - 1) {
                            stringBuffer.append("; ");
                        }
                    }
                }
                if (stringBuffer.length() > 0) {
                    return new String(stringBuffer);
                }
            }
        }
        return null;
    }

    public final void m3560a() {
    }

    public final void m3561a(int i) {
        this.f3265b = i;
    }

    public final void m3562a(Object obj, Object obj2) {
        String str = null;
        if (KonyMain.f3657e) {
            Log.d("ServiceInvoker", "key is ---" + obj + "value is ---" + obj2);
        }
        String obj3 = obj.toString();
        if (obj3.startsWith("filename=")) {
            String string;
            this.f3275l = true;
            Uri parse = Uri.parse(obj2.toString());
            String path = parse.getPath();
            String[] strArr = new String[]{"_data"};
            KonyMain actContext = KonyMain.getActContext();
            Cursor query = actContext != null ? actContext.getContentResolver().query(parse, strArr, null, null, null) : null;
            if (query != null) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                query.moveToFirst();
                string = query.getString(columnIndexOrThrow);
                query.close();
            } else {
                string = null;
            }
            if (string != null) {
                str = string;
            } else if (path != null) {
                str = path;
            }
            this.f3270g.add(new BasicNameValuePair(obj3, str));
            return;
        }
        String str2 = obj2 instanceof String ? (String) obj2 : obj2 instanceof StringBuffer ? new String((StringBuffer) obj2) : obj2.toString();
        this.f3270g.add(new BasicNameValuePair(obj3, str2));
    }

    public final void m3563a(String str, String str2) {
        this.f3271h.put(str, str2);
    }

    public final void m3564a(Hashtable hashtable) {
        int parseDouble;
        this.f3276m = hashtable;
        int i = 180000;
        if (this.f3276m != null) {
            LuaNil luaNil;
            Object obj = this.f3276m.get("timeout");
            if (obj != null) {
                try {
                    parseDouble = ((int) Double.parseDouble(obj.toString())) * 1000;
                } catch (NumberFormatException e) {
                }
                luaNil = this.f3276m.get("method");
                if (luaNil != null && luaNil != LuaNil.nil && (luaNil instanceof String) && ((String) luaNil).equalsIgnoreCase("get")) {
                    this.f3265b = 1;
                }
            }
            parseDouble = i;
            luaNil = this.f3276m.get("method");
            this.f3265b = 1;
        } else {
            parseDouble = i;
        }
        HttpConnectionParams.setConnectionTimeout(this.f3279t, parseDouble);
        HttpConnectionParams.setSoTimeout(this.f3279t, parseDouble);
    }

    public final void m3565a(boolean z) {
        HttpClientParams.setRedirecting(this.f3279t, true);
    }

    public final void m3566b() {
        m3573j();
    }

    public final boolean m3567d() {
        if (this.f3274k != null) {
            return true;
        }
        if (this.f3269f == null) {
            return false;
        }
        int statusCode = this.f3269f.getStatusLine().getStatusCode();
        return statusCode == 200 || statusCode == 304;
    }

    public final String m3568e() {
        return !m3567d() ? this.f3272i != null ? this.f3272i : this.f3269f.getStatusLine().getReasonPhrase() : null;
    }

    public final int m3569f() {
        if (this.f3269f == null) {
            return this.f3267d;
        }
        int statusCode = this.f3269f.getStatusLine().getStatusCode();
        if (statusCode >= 300 && statusCode < 400) {
            this.f3272i = "Service unavailable. Please try later";
            return 1001;
        } else if (statusCode < 400 || statusCode > 500) {
            if (statusCode <= 500) {
                return statusCode;
            }
            this.f3272i = "Service unavailable. Please try later";
            return 1001;
        } else if (statusCode == 408) {
            this.f3272i = "Request Timed out";
            return 1014;
        } else if (statusCode == 405) {
            this.f3272i = "Invalid method provided";
            return 1007;
        } else if (statusCode == 500) {
            this.f3272i = "Unknown Error while connecting";
            return 1000;
        } else {
            this.f3272i = "Request Failed";
            return 1012;
        }
    }

    public final InputStream m3570g() {
        return this.f3274k != null ? this.f3274k.f2085f : m3556n();
    }

    public final InputStream m3571h() {
        if (this.f3269f != null) {
            HttpEntity entity = this.f3269f.getEntity();
            if (entity != null) {
                try {
                    InputStream content = entity.getContent();
                    Header firstHeader = this.f3269f.getFirstHeader("Content-Encoding");
                    return (firstHeader == null || firstHeader.getValue() == null || !firstHeader.getValue().equalsIgnoreCase("gzip")) ? content : new GZIPInputStream(content);
                } catch (IllegalStateException e) {
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", BuildConfig.FLAVOR + e.getMessage());
                    }
                } catch (IOException e2) {
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", BuildConfig.FLAVOR + e2.getMessage());
                    }
                }
            }
        }
        return null;
    }

    public final void m3572i() {
        if (!f3262p) {
            this.f3268e.getConnectionManager().shutdown();
        }
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4156b((aT) this);
        }
    }

    public final void m3573j() {
        if (Thread.currentThread() != KonyMain.m4061G().m1725a()) {
            KonyMain.m4121f().post(new aB(this));
        } else if (this.f3264a != null) {
            this.f3264a.abort();
        }
    }

    public final void m3574k() {
        af afVar = null;
        int i = 0;
        if (this.f3266c == null) {
            this.f3267d = 1005;
            this.f3272i = "Invalid input url";
            return;
        }
        af a;
        if (this.f3265b == 1) {
            if (this.f3273j) {
                a = ag.m1977a(this.f3266c);
                if (a == null) {
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", "Cache file not found for URL " + this.f3266c);
                    }
                    a = null;
                } else {
                    m3563a("if-none-match", a.f2081b);
                    if (a.f2082c != null && a.f2082c.length() > 0) {
                        m3563a("if-modified-since", a.f2082c);
                    }
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", "Cache file found for url " + this.f3266c);
                    }
                }
            } else {
                a = null;
            }
            this.f3274k = a;
        }
        if (C0369u.m2364a(3)) {
            int i2;
            String str;
            Header[] allHeaders;
            switch (this.f3265b) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    CharSequence stringBuffer = new StringBuffer(this.f3266c);
                    if (this.f3270g.size() > 0) {
                        stringBuffer.append('?');
                    }
                    for (i2 = 0; i2 < this.f3270g.size(); i2++) {
                        BasicNameValuePair basicNameValuePair = (BasicNameValuePair) this.f3270g.get(i2);
                        stringBuffer.append(basicNameValuePair.getName() + "=" + basicNameValuePair.getValue() + "&");
                    }
                    if (KonyMain.f3657e) {
                        Log.d("ServiceInvoker", BuildConfig.FLAVOR + stringBuffer.toString());
                    }
                    try {
                        URI uri = new URI(new String(stringBuffer));
                        HttpRequest httpGet = new HttpGet(uri);
                        this.f3264a = httpGet;
                        if (cG.m2120k()) {
                            httpGet.setHeader("Accept-Encoding", "gzip");
                        }
                        this.f3278s = false;
                        if (this.f3271h.size() > 0) {
                            Enumeration keys = this.f3271h.keys();
                            while (keys.hasMoreElements()) {
                                str = (String) keys.nextElement();
                                if (KonyMain.f3657e) {
                                    Log.d("ServiceInvoker", "Header Set is -- Name = " + str + " Value = " + ((String) this.f3271h.get(str)));
                                }
                                httpGet.setHeader(str, (String) this.f3271h.get(str));
                                if (str.equals("Cookie")) {
                                    this.f3278s = true;
                                }
                            }
                        }
                        try {
                            HttpHost httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
                            Matcher matcher = Pattern.compile("(http|https)://(\\S+):(\\S+)@(\\S+)?").matcher(stringBuffer);
                            if (matcher.matches()) {
                                httpGet.addHeader("Authorization", "Basic " + Base64.encodeToString((matcher.group(2) + ":" + matcher.group(3)).getBytes(), 2));
                            }
                            if (this.f3278s) {
                                aj.m1988a(httpHost);
                            }
                            try {
                                this.f3269f = this.f3268e.execute(httpHost, httpGet);
                                if (KonyMain.f3657e && this.f3269f != null) {
                                    allHeaders = this.f3269f.getAllHeaders();
                                    if (allHeaders != null) {
                                        i2 = allHeaders.length;
                                        while (i < i2) {
                                            Header header = allHeaders[i];
                                            if (!(header.getName() == null || header.getValue() == null)) {
                                                Log.d("ServiceInvoker", "Response Header - Name  = " + header.getName() + " Value = " + header.getValue());
                                            }
                                            i++;
                                        }
                                    }
                                }
                                HttpResponse httpResponse = this.f3269f;
                                af afVar2 = this.f3274k;
                                if (this.f3273j) {
                                    a = ag.m1978a(this.f3266c, httpResponse);
                                    if (a != null) {
                                        if (this.f3269f.getStatusLine().getStatusCode() != 304) {
                                            if (KonyMain.f3657e) {
                                                Log.d("ServiceInvoker", "Creating a cache file for URL " + this.f3266c);
                                            }
                                            ag.m1979a(a);
                                            ag.m1981a(a, m3556n());
                                            ag.m1982b(a);
                                        } else {
                                            if (afVar2 != null) {
                                                a.f2080a = afVar2.f2080a;
                                                a.f2084e = afVar2.f2084e;
                                                a.f2085f = afVar2.f2085f;
                                            }
                                            if (KonyMain.f3657e) {
                                                Log.d("ServiceInvoker", "Resource is not modified. Getting from cache");
                                            }
                                            ag.m1983c(a);
                                        }
                                        afVar = a;
                                    } else if (KonyMain.f3657e) {
                                        Log.d("ServiceInvoker", "Response doesn't have eTag");
                                    }
                                }
                                this.f3274k = afVar;
                                return;
                            } catch (ClientProtocolException e) {
                                if (KonyMain.f3657e) {
                                    Log.d("ServiceInvoker", BuildConfig.FLAVOR + e.getMessage());
                                }
                                this.f3267d = 1012;
                                this.f3272i = "Request Failed";
                                return;
                            } catch (Throwable e2) {
                                if (KonyMain.f3657e) {
                                    Log.d("ServiceInvoker", BuildConfig.FLAVOR + e2.getMessage(), e2);
                                }
                                this.f3267d = 1000;
                                this.f3272i = "Unknown Error while connecting";
                                return;
                            }
                        } catch (IllegalArgumentException e3) {
                            if (KonyMain.f3657e) {
                                Log.d("ServiceInvoker", BuildConfig.FLAVOR + e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } catch (URISyntaxException e4) {
                        if (KonyMain.f3657e) {
                            Log.d("ServiceInvoker", BuildConfig.FLAVOR + e4.getMessage());
                        }
                        this.f3267d = 1005;
                        this.f3272i = "Invalid input url";
                        return;
                    }
                default:
                    this.f3278s = false;
                    try {
                        URI uri2 = new URI(this.f3266c);
                        if (KonyMain.f3657e) {
                            Log.d("ServiceInvoker", "URL is -- " + this.f3266c);
                        }
                        HttpHost httpHost2 = new HttpHost(uri2.getHost(), uri2.getPort(), uri2.getScheme());
                        this.f3277r = httpHost2.getHostName();
                        HttpRequest httpPost = new HttpPost(uri2);
                        this.f3264a = httpPost;
                        if (cG.m2120k()) {
                            httpPost.setHeader("Accept-Encoding", "gzip");
                        }
                        if (this.f3271h.size() > 0) {
                            Enumeration keys2 = this.f3271h.keys();
                            while (keys2.hasMoreElements()) {
                                str = (String) keys2.nextElement();
                                if (KonyMain.f3657e) {
                                    Log.d("ServiceInvoker", "header set is --" + str + ((String) this.f3271h.get(str)));
                                }
                                httpPost.setHeader(str, (String) this.f3271h.get(str));
                                if (str.equals("Cookie")) {
                                    this.f3278s = true;
                                }
                            }
                        }
                        if (this.f3278s) {
                            aj.m1988a(httpHost2);
                        }
                        try {
                            if (this.f3275l) {
                                MultiPartHttpPost multiPartHttpPost = new MultiPartHttpPost(httpPost);
                                multiPartHttpPost.setNameValuePairs(this.f3270g);
                                httpPost = multiPartHttpPost.getMultiPartHttpPost();
                            } else if (this.f3270g.size() > 0) {
                                httpPost.setEntity(new UrlEncodedFormEntity(this.f3270g, "UTF-8"));
                            }
                            if (KonyMain.f3657e) {
                                List cookies = this.f3268e.getCookieStore().getCookies();
                                if (!cookies.isEmpty()) {
                                    int size = cookies.size();
                                    for (i2 = 0; i2 < size; i2++) {
                                        Cookie cookie = (Cookie) cookies.get(i2);
                                        String str2 = "ServiceInvoker";
                                        StringBuilder append = new StringBuilder().append("Request Cookie -- ");
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append(cookie.getName());
                                        stringBuilder.append("=");
                                        stringBuilder.append(cookie.getValue());
                                        if (cookie.getDomain() != null) {
                                            stringBuilder.append(";domain=");
                                            stringBuilder.append(cookie.getDomain());
                                        }
                                        if (cookie.getPath() != null) {
                                            stringBuilder.append(";path=");
                                            stringBuilder.append(cookie.getPath());
                                        }
                                        if (cookie.getExpiryDate() != null) {
                                            stringBuilder.append(";expires=");
                                            cookie.getExpiryDate();
                                        }
                                        if (cookie.isSecure()) {
                                            stringBuilder.append(";secure");
                                        }
                                        Log.d(str2, append.append(stringBuilder.toString()).toString());
                                    }
                                }
                                Header[] allHeaders2 = httpPost.getAllHeaders();
                                if (allHeaders2 != null) {
                                    for (Header header2 : allHeaders2) {
                                        if (!(header2.getName() == null || header2.getValue() == null)) {
                                            Log.d("ServiceInvoker", "Request Header - Name  = " + header2.getName() + " Value = " + header2.getValue());
                                        }
                                    }
                                }
                            }
                            this.f3269f = this.f3268e.execute(httpHost2, httpPost);
                            if (KonyMain.f3657e && this.f3269f != null) {
                                allHeaders = this.f3269f.getAllHeaders();
                                if (allHeaders != null) {
                                    i2 = allHeaders.length;
                                    while (i < i2) {
                                        Header header3 = allHeaders[i];
                                        if (!(header3.getName() == null || header3.getValue() == null)) {
                                            Log.d("ServiceInvoker", "Response Header - Name  = " + header3.getName() + " Value = " + header3.getValue());
                                        }
                                        i++;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Throwable e22) {
                            if (KonyMain.f3657e) {
                                Log.d("ServiceInvoker", BuildConfig.FLAVOR + e22.getMessage(), e22);
                            }
                            this.f3267d = 1012;
                            this.f3272i = "Request Failed";
                            return;
                        } catch (Throwable e222) {
                            if (KonyMain.f3657e) {
                                Log.d("ServiceInvoker", BuildConfig.FLAVOR + e222.getMessage(), e222);
                            }
                            this.f3267d = 1012;
                            this.f3272i = "Request Failed";
                            return;
                        } catch (Throwable e2222) {
                            if (KonyMain.f3657e) {
                                Log.d("ServiceInvoker", BuildConfig.FLAVOR + e2222.getMessage(), e2222);
                            }
                            this.f3267d = 1015;
                            this.f3272i = "Cannot find host";
                            return;
                        } catch (Throwable e22222) {
                            if (KonyMain.f3657e) {
                                Log.d("ServiceInvoker", BuildConfig.FLAVOR + e22222.getMessage(), e22222);
                            }
                            this.f3267d = 1016;
                            this.f3272i = "Cannot connect to host";
                            return;
                        } catch (Throwable e222222) {
                            if (KonyMain.f3657e) {
                                Log.d("ServiceInvoker", BuildConfig.FLAVOR + e222222.getMessage(), e222222);
                            }
                            this.f3267d = 1000;
                            this.f3272i = "Unknown Error while connecting";
                            return;
                        }
                    } catch (URISyntaxException e42) {
                        if (KonyMain.f3657e) {
                            Log.d("ServiceInvoker", BuildConfig.FLAVOR + e42.getMessage());
                        }
                        this.f3267d = 1005;
                        this.f3272i = "Invalid input url";
                        return;
                    } catch (Throwable e2222222) {
                        if (KonyMain.f3657e) {
                            Log.d("ServiceInvoker", BuildConfig.FLAVOR + e2222222.getMessage(), e2222222);
                        }
                        this.f3267d = 1005;
                        this.f3272i = "Invalid input url";
                        return;
                    }
            }
        }
        this.f3267d = 1011;
        this.f3272i = "Device has no WIFI or mobile connectivity. Please try the operation after establishing connectivity.";
        if (KonyMain.f3657e) {
            Log.d("ServiceInvoker", "Device has no WIFI or mobile connectivity");
        }
    }

    public final boolean m3575l() {
        return this.f3264a != null ? this.f3264a.isAborted() : false;
    }
}
