package ny0k;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.apache.http.HttpHost;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

public final class aj {
    private static ah f2091a;
    private static CookieManager f2092b;
    private static String f2093c;
    private static int f2094d;
    private static String f2095e;
    private static String f2096f;

    static {
        f2093c = "KonyCookieSyncManager";
        f2091a = new ah();
        CookieSyncManager.createInstance(KonyMain.getAppContext());
        CookieManager.getInstance().removeSessionCookie();
        f2095e = ".";
        f2096f = "/";
    }

    private static String m1985a(Cookie cookie) {
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
        return stringBuilder.toString();
    }

    public static CookieStore m1986a(String str) {
        if (f2094d != 1) {
            URI uri;
            try {
                uri = new URI(str.toString());
            } catch (URISyntaxException e) {
                if (KonyMain.f3657e) {
                    e.printStackTrace();
                }
                uri = null;
            }
            List<String> c = m1991c(uri.getHost());
            List d = m1993d(uri.getPath());
            List arrayList = new ArrayList();
            int size = d.size();
            for (String str2 : c) {
                for (int i = size - 1; i >= 0; i--) {
                    String str3 = (String) d.get(i);
                    String cookie = CookieManager.getInstance().getCookie(uri.getScheme() + "://" + str2 + str3);
                    if (!(cookie == null || cookie.equals(BuildConfig.FLAVOR))) {
                        String[] split = cookie.split("; ");
                        for (int i2 = 0; i2 < split.length; i2++) {
                            if (!arrayList.contains(split[i2])) {
                                arrayList.add(split[i2]);
                                String[] split2 = split[i2].split("=");
                                Cookie basicClientCookie = split2.length > 1 ? new BasicClientCookie(split2[0], split2[1]) : new BasicClientCookie(split2[0], null);
                                basicClientCookie.setPath(str3);
                                basicClientCookie.setDomain(str2);
                                if (uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("https")) {
                                    basicClientCookie.setSecure(true);
                                }
                                f2091a.addCookie(basicClientCookie);
                            }
                        }
                    }
                }
            }
        }
        f2094d = 1;
        return f2091a;
    }

    public static void m1987a() {
        if (f2094d != 2) {
            f2092b = CookieManager.getInstance();
            List<Cookie> cookies = f2091a.getCookies();
            if (!cookies.isEmpty()) {
                for (Cookie cookie : cookies) {
                    f2092b.setCookie(cookie.getDomain(), m1985a(cookie));
                }
            }
        }
        f2094d = 2;
    }

    public static void m1988a(HttpHost httpHost) {
        List cookies = f2091a.getCookies();
        ArrayList arrayList = new ArrayList();
        if (!cookies.isEmpty()) {
            int size = cookies.size();
            String hostName = httpHost.getHostName();
            if (KonyMain.f3657e) {
                Log.d(f2093c, "Updating Cookie for Host -- " + hostName);
            }
            for (int i = 0; i < size; i++) {
                Cookie cookie = (Cookie) cookies.get(i);
                String domain = cookie.getDomain();
                if (KonyMain.f3657e) {
                    Log.d(f2093c, "Cookie " + m1985a(cookie));
                }
                if (!hostName.endsWith(domain)) {
                    if (KonyMain.f3657e) {
                        Log.d(f2093c, "Found Matching host cookie");
                    }
                    arrayList.add(cookie);
                }
            }
        } else if (KonyMain.f3657e) {
            Log.d(f2093c, "No Cookies present");
        }
        if (KonyMain.f3657e) {
            Log.d(f2093c, "Cookies List size :" + arrayList.size());
        }
        if (arrayList.size() > 0) {
            Cookie[] cookieArr = new Cookie[arrayList.size()];
            arrayList.toArray(cookieArr);
            f2091a.clear();
            f2091a.m1984a(cookieArr);
        }
    }

    public static Object m1989b(String str) {
        if (f2094d == 1) {
            m1987a();
        }
        String cookie = CookieManager.getInstance().getCookie(str);
        Object[] split = (cookie == null || cookie.equals(BuildConfig.FLAVOR)) ? null : cookie.split("; ");
        if (split == null) {
            return null;
        }
        Vector vector = new Vector();
        vector.addAll(Arrays.asList(split));
        return vector;
    }

    public static void m1990b() {
        f2091a.clear();
        CookieManager.getInstance().removeAllCookie();
    }

    private static List m1991c(String str) {
        List arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
            int indexOf = str.indexOf(f2095e);
            int lastIndexOf = str.lastIndexOf(f2095e);
            while (indexOf < lastIndexOf) {
                int i = indexOf + 1;
                indexOf = str.indexOf(f2095e, i);
                if (i >= 0 && i <= str.length()) {
                    arrayList.add(str.substring(i));
                }
            }
        }
        return arrayList;
    }

    public static void m1992c() {
        f2092b.removeSessionCookie();
    }

    private static List m1993d(String str) {
        List arrayList = new ArrayList();
        if (str != null) {
            int length = str.length();
            int lastIndexOf = str.lastIndexOf(f2096f);
            int indexOf = str.indexOf(f2096f);
            if (indexOf >= 0 && indexOf <= str.length() && length <= str.length()) {
                arrayList.add(str.substring(indexOf, length));
            }
            while (lastIndexOf > indexOf) {
                if (indexOf >= 0 && indexOf <= str.length() && lastIndexOf <= str.length()) {
                    arrayList.add(str.substring(indexOf, lastIndexOf));
                }
                lastIndexOf = str.lastIndexOf(f2096f, lastIndexOf - 1);
            }
        }
        arrayList.add(f2096f);
        return arrayList;
    }
}
