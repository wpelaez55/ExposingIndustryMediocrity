package ny0k;

import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.http.cookie.Cookie;

final class ai implements Serializable, Comparator {
    ai(ah ahVar) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String domain;
        String domain2;
        Cookie cookie = (Cookie) obj;
        Cookie cookie2 = (Cookie) obj2;
        int compareTo = cookie.getName().compareTo(cookie2.getName());
        if (compareTo == 0) {
            domain = cookie.getDomain();
            if (domain == null) {
                domain = BuildConfig.FLAVOR;
            }
            domain2 = cookie2.getDomain();
            if (domain2 == null) {
                domain2 = BuildConfig.FLAVOR;
            }
            compareTo = domain.compareToIgnoreCase(domain2);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        domain = cookie.getPath();
        if (domain == null) {
            domain = "/";
        }
        domain2 = cookie2.getPath();
        if (domain2 == null) {
            domain2 = "/";
        }
        return domain.compareTo(domain2);
    }
}
