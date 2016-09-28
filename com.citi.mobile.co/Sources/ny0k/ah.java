package ny0k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

public final class ah implements CookieStore {
    private final ArrayList f2089a;
    private final Comparator f2090b;

    public ah() {
        this.f2089a = new ArrayList();
        this.f2090b = new ai(this);
    }

    public final synchronized void m1984a(Cookie[] cookieArr) {
        if (cookieArr != null) {
            for (Cookie addCookie : cookieArr) {
                addCookie(addCookie);
            }
        }
    }

    public final synchronized void addCookie(Cookie cookie) {
        if (cookie != null) {
            Iterator it = this.f2089a.iterator();
            while (it.hasNext()) {
                if (this.f2090b.compare(cookie, it.next()) == 0) {
                    it.remove();
                    break;
                }
            }
            if (!cookie.isExpired(new Date())) {
                this.f2089a.add(cookie);
            }
        }
    }

    public final synchronized void clear() {
        this.f2089a.clear();
    }

    public final synchronized boolean clearExpired(Date date) {
        boolean z = false;
        synchronized (this) {
            if (date != null) {
                Iterator it = this.f2089a.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if (((Cookie) it.next()).isExpired(date)) {
                        it.remove();
                        z2 = true;
                    }
                }
                z = z2;
            }
        }
        return z;
    }

    public final synchronized List getCookies() {
        return Collections.unmodifiableList(this.f2089a);
    }

    public final String toString() {
        return this.f2089a.toString();
    }
}
