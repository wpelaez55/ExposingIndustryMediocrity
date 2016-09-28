package ny0k;

import android.support.v4.media.session.PlaybackStateCompat;
import com.konylabs.js.api.KonyJSObject;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ny0k.X */
public final class C0444X extends KonyJSObject {
    private static final String[] f3585c;
    private File f3586a;
    private InputStream f3587b;
    private int f3588d;

    static {
        f3585c = new String[]{BuildConfig.FLAVOR, "txt", "json", "html", "htm", "xml"};
    }

    public C0444X(File file, long j) {
        this.f3586a = file;
        this.ap = j;
        String name = this.f3586a.getName();
        int indexOf = name.indexOf(".");
        name = indexOf != -1 ? name.substring(indexOf + 1).intern() : BuildConfig.FLAVOR.intern();
        this.f3588d = 1001;
        for (String str : f3585c) {
            if (name == str) {
                this.f3588d = 1000;
                return;
            }
        }
    }

    public C0444X(InputStream inputStream, long j) {
        this.f3587b = inputStream;
        this.ap = j;
        this.f3588d = 1001;
    }

    public final int m4009a() {
        return this.f3588d;
    }

    public final String m4010b() {
        BufferedReader bufferedReader;
        Throwable th;
        if (this.f3588d == 1001 || this.f3586a.isDirectory()) {
            return null;
        }
        long length = this.f3586a.length();
        if (length == 0) {
            return BuildConfig.FLAVOR;
        }
        if (length >= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
            length = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        BufferedReader bufferedReader2;
        try {
            bufferedReader2 = new BufferedReader(new FileReader(this.f3586a), (int) length);
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        stringBuffer.append(readLine);
                    } else {
                        String stringBuffer2 = stringBuffer.toString();
                        try {
                            bufferedReader2.close();
                            return stringBuffer2;
                        } catch (IOException e) {
                            return stringBuffer2;
                        }
                    }
                }
            } catch (FileNotFoundException e2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                    }
                }
                return null;
            } catch (IOException e4) {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e5) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e7) {
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return null;
        } catch (IOException e8) {
            bufferedReader2 = null;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = null;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public final InputStream m4011c() {
        if (this.f3586a != null) {
            try {
                return new FileInputStream(this.f3586a);
            } catch (FileNotFoundException e) {
                return null;
            }
        } else if (this.f3587b == null) {
            return null;
        } else {
            InputStream inputStream = this.f3587b;
            this.f3587b = null;
            return inputStream;
        }
    }

    public final void m4012d() {
        if (this.f3587b != null) {
            try {
                this.f3587b.close();
                this.f3587b = null;
            } catch (IOException e) {
            }
        }
    }

    public final Object getTable(Object obj) {
        return ((String) obj).intern() == "text" ? m4010b() : null;
    }

    public final void setJSObject(long j) {
        super.setJSObject(j);
        if (j == 0) {
            m4012d();
        }
    }
}
