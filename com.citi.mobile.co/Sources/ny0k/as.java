package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

public final class as implements LayeredSocketFactory, SocketFactory {
    public static int f2104a;
    public static int f2105b;
    public static int f2106c;
    private static String f2107d;
    private static int f2108f;
    private SSLContext f2109e;

    static {
        f2107d = "KonySSLSocketFactory";
        f2104a = 0;
        f2105b = 1;
        f2106c = 2;
        f2108f = 0;
    }

    public as() {
        this.f2109e = null;
    }

    public static SocketFactory m1996a() {
        return f2108f == 0 ? new au() : new as();
    }

    public static void m1997a(int i) {
        f2108f = i;
    }

    private static SSLContext m1998b() throws IOException {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, m1999c(), null);
            return instance;
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    private static TrustManager[] m1999c() {
        TrustManager[] trustManagerArr = null;
        if (f2108f == f2105b) {
            if (KonyMain.f3656d >= 11) {
                try {
                    TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    instance.init(m2001e());
                    return instance.getTrustManagers();
                } catch (NoSuchAlgorithmException e) {
                    if (!KonyMain.f3657e) {
                        return trustManagerArr;
                    }
                    Log.d(f2107d, BuildConfig.FLAVOR + e.getMessage());
                    return trustManagerArr;
                } catch (KeyStoreException e2) {
                    if (!KonyMain.f3657e) {
                        return trustManagerArr;
                    }
                    Log.d(f2107d, BuildConfig.FLAVOR + e2.getMessage());
                    return trustManagerArr;
                }
            }
            av avVar;
            try {
                avVar = new av(m2001e());
            } catch (NoSuchAlgorithmException e3) {
                if (KonyMain.f3657e) {
                    Log.d(f2107d, BuildConfig.FLAVOR + e3.getMessage());
                }
                avVar = trustManagerArr;
            } catch (KeyStoreException e22) {
                if (KonyMain.f3657e) {
                    Log.d(f2107d, BuildConfig.FLAVOR + e22.getMessage());
                }
                avVar = trustManagerArr;
            }
            return new TrustManager[]{avVar};
        } else if (f2108f != f2106c) {
            return trustManagerArr;
        } else {
            return new TrustManager[]{new at()};
        }
    }

    private SSLContext m2000d() throws IOException {
        if (this.f2109e == null) {
            this.f2109e = m1998b();
        }
        return this.f2109e;
    }

    private static KeyStore m2001e() {
        KeyStore instance;
        CertificateException e;
        IOException e2;
        NoSuchAlgorithmException e3;
        KeyStoreException e4;
        try {
            instance = KeyStore.getInstance(KeyStore.getDefaultType());
            InputStream bufferedInputStream;
            try {
                instance.load(null, null);
                CertificateFactory instance2 = CertificateFactory.getInstance("X.509");
                String[] list = KonyMain.getAppContext().getAssets().list("certs");
                for (int i = 0; i < list.length; i++) {
                    bufferedInputStream = new BufferedInputStream(KonyMain.getAppContext().getAssets().open("certs/" + list[i]));
                    Certificate generateCertificate = instance2.generateCertificate(bufferedInputStream);
                    bufferedInputStream.close();
                    instance.setCertificateEntry("ca" + i, generateCertificate);
                }
            } catch (CertificateException e5) {
                e = e5;
            } catch (IOException e6) {
                e2 = e6;
            } catch (NoSuchAlgorithmException e7) {
                e3 = e7;
            } catch (KeyStoreException e8) {
                e4 = e8;
            } catch (Throwable th) {
                bufferedInputStream.close();
            }
        } catch (CertificateException e9) {
            CertificateException certificateException = e9;
            instance = null;
            e = certificateException;
            if (KonyMain.f3657e) {
                Log.d(f2107d, BuildConfig.FLAVOR + e.getMessage());
            }
            return instance;
        } catch (IOException e10) {
            IOException iOException = e10;
            instance = null;
            e2 = iOException;
            if (KonyMain.f3657e) {
                Log.d(f2107d, BuildConfig.FLAVOR + e2.getMessage());
            }
            return instance;
        } catch (NoSuchAlgorithmException e11) {
            NoSuchAlgorithmException noSuchAlgorithmException = e11;
            instance = null;
            e3 = noSuchAlgorithmException;
            if (KonyMain.f3657e) {
                Log.d(f2107d, BuildConfig.FLAVOR + e3.getMessage());
            }
            return instance;
        } catch (KeyStoreException e12) {
            KeyStoreException keyStoreException = e12;
            instance = null;
            e4 = keyStoreException;
            if (KonyMain.f3657e) {
                Log.d(f2107d, BuildConfig.FLAVOR + e4.getMessage());
            }
            return instance;
        }
        return instance;
    }

    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws IOException, UnknownHostException, ConnectTimeoutException {
        return socket;
    }

    public final Socket createSocket() throws IOException {
        return m2000d().getSocketFactory().createSocket();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        try {
            Field declaredField = InetAddress.class.getDeclaredField("hostName");
            declaredField.setAccessible(true);
            declaredField.set(socket.getInetAddress(), str);
        } catch (Exception e) {
        }
        return m2000d().getSocketFactory().createSocket(socket, str, i, z);
    }

    public final boolean isSecure(Socket socket) throws IllegalArgumentException {
        return true;
    }
}
