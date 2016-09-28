package ny0k;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;

final class au implements LayeredSocketFactory {
    private SSLSocketFactory f2110a;

    au() {
        this.f2110a = SSLSocketFactory.getSocketFactory();
    }

    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws IOException {
        return this.f2110a.connectSocket(socket, str, i, inetAddress, i2, httpParams);
    }

    public final Socket createSocket() throws IOException {
        return this.f2110a.createSocket();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        try {
            Field declaredField = InetAddress.class.getDeclaredField("hostName");
            declaredField.setAccessible(true);
            declaredField.set(socket.getInetAddress(), str);
        } catch (Exception e) {
        }
        return this.f2110a.createSocket(socket, str, i, z);
    }

    public final boolean isSecure(Socket socket) throws IllegalArgumentException {
        return this.f2110a.isSecure(socket);
    }
}
