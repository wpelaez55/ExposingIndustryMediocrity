package ny0k;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class at implements X509TrustManager {
    at() {
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
