package ny0k;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

final class av implements X509TrustManager {
    private final TrustManager[] f2111a;
    private final KeyStore f2112b;

    public av(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        this.f2112b = keyStore;
        TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
        instance.init(keyStore);
        this.f2111a = instance.getTrustManagers();
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkServerTrusted(java.security.cert.X509Certificate[] r13, java.lang.String r14) throws java.security.cert.CertificateException {
        /*
        r12 = this;
        r5 = 0;
        r3 = 0;
        r2 = r12.f2111a;	 Catch:{ CertificateException -> 0x0013 }
        r4 = r2.length;	 Catch:{ CertificateException -> 0x0013 }
        r1 = r3;
    L_0x0006:
        if (r1 >= r4) goto L_0x0091;
    L_0x0008:
        r0 = r2[r1];	 Catch:{ CertificateException -> 0x0013 }
        r0 = (javax.net.ssl.X509TrustManager) r0;	 Catch:{ CertificateException -> 0x0013 }
        r0.checkServerTrusted(r13, r14);	 Catch:{ CertificateException -> 0x0013 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0006;
    L_0x0013:
        r0 = move-exception;
        r2 = r0;
        r0 = r13.length;	 Catch:{ Exception -> 0x00a9 }
        r6 = new java.security.cert.X509Certificate[r0];	 Catch:{ Exception -> 0x00a9 }
        r7 = java.util.Arrays.asList(r13);	 Catch:{ Exception -> 0x00a9 }
        r0 = r13.length;	 Catch:{ Exception -> 0x00a9 }
        r4 = r0 + -1;
        r8 = r7.iterator();	 Catch:{ Exception -> 0x00a9 }
    L_0x0023:
        r0 = r8.hasNext();	 Catch:{ Exception -> 0x00a9 }
        if (r0 == 0) goto L_0x00b2;
    L_0x0029:
        r0 = r8.next();	 Catch:{ Exception -> 0x00a9 }
        r0 = (java.security.cert.X509Certificate) r0;	 Catch:{ Exception -> 0x00a9 }
        r9 = r7.iterator();	 Catch:{ Exception -> 0x00a9 }
    L_0x0033:
        r1 = r9.hasNext();	 Catch:{ Exception -> 0x00a9 }
        if (r1 == 0) goto L_0x00b0;
    L_0x0039:
        r1 = r9.next();	 Catch:{ Exception -> 0x00a9 }
        r1 = (java.security.cert.X509Certificate) r1;	 Catch:{ Exception -> 0x00a9 }
        r10 = r1.getSubjectDN();	 Catch:{ Exception -> 0x00a9 }
        r11 = r0.getIssuerDN();	 Catch:{ Exception -> 0x00a9 }
        r10 = r10.equals(r11);	 Catch:{ Exception -> 0x00a9 }
        if (r10 == 0) goto L_0x0033;
    L_0x004d:
        if (r1 == 0) goto L_0x0055;
    L_0x004f:
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x00a9 }
        if (r1 == 0) goto L_0x0023;
    L_0x0055:
        r6[r4] = r0;	 Catch:{ Exception -> 0x00a9 }
        r1 = r4;
        r4 = r0;
    L_0x0059:
        r8 = r7.iterator();	 Catch:{ Exception -> 0x00a9 }
    L_0x005d:
        r0 = r8.hasNext();	 Catch:{ Exception -> 0x00a9 }
        if (r0 == 0) goto L_0x00ae;
    L_0x0063:
        r0 = r8.next();	 Catch:{ Exception -> 0x00a9 }
        r0 = (java.security.cert.X509Certificate) r0;	 Catch:{ Exception -> 0x00a9 }
        r9 = r4.getSubjectDN();	 Catch:{ Exception -> 0x00a9 }
        r10 = r0.getIssuerDN();	 Catch:{ Exception -> 0x00a9 }
        r9 = r10.equals(r9);	 Catch:{ Exception -> 0x00a9 }
        if (r9 == 0) goto L_0x005d;
    L_0x0077:
        r9 = r0.equals(r4);	 Catch:{ Exception -> 0x00a9 }
        if (r9 != 0) goto L_0x005d;
    L_0x007d:
        r4 = r0;
    L_0x007e:
        if (r4 == 0) goto L_0x0088;
    L_0x0080:
        if (r1 <= 0) goto L_0x0088;
    L_0x0082:
        r0 = r1 + -1;
        r6[r0] = r4;	 Catch:{ Exception -> 0x00a9 }
        r1 = r0;
        goto L_0x0059;
    L_0x0088:
        r0 = java.util.Arrays.equals(r13, r6);	 Catch:{ Exception -> 0x00a9 }
        if (r0 != 0) goto L_0x0092;
    L_0x008e:
        r12.checkServerTrusted(r6, r14);	 Catch:{ Exception -> 0x00a9 }
    L_0x0091:
        return;
    L_0x0092:
        r0 = r3;
    L_0x0093:
        r1 = r13.length;	 Catch:{ Exception -> 0x00a9 }
        if (r0 >= r1) goto L_0x00a8;
    L_0x0096:
        r1 = r6[r0];	 Catch:{ Exception -> 0x00a9 }
        r4 = r12.f2112b;	 Catch:{ Exception -> 0x00a9 }
        r1 = r4.getCertificateAlias(r1);	 Catch:{ Exception -> 0x00a9 }
        if (r1 == 0) goto L_0x00a6;
    L_0x00a0:
        r1 = 1;
    L_0x00a1:
        if (r1 != 0) goto L_0x0091;
    L_0x00a3:
        r0 = r0 + 1;
        goto L_0x0093;
    L_0x00a6:
        r1 = r3;
        goto L_0x00a1;
    L_0x00a8:
        throw r2;	 Catch:{ Exception -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        r0.printStackTrace();
        throw r2;
    L_0x00ae:
        r4 = r5;
        goto L_0x007e;
    L_0x00b0:
        r1 = r5;
        goto L_0x004d;
    L_0x00b2:
        r0 = r5;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.av.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
