package ny0k;

import android.content.Context;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* renamed from: ny0k.K */
public class C0278K {
    public String f1899a;
    private Context f1900b;

    public C0278K(Context context) {
        this.f1900b = context;
    }

    public final Object m1803a(String str) {
        Object obj = null;
        this.f1899a = obj;
        if (KonyMain.f3657e) {
            Log.d("KonyDataSource", "Reading the table by the name: " + str);
        }
        if (str == null || str.trim().length() <= 0) {
            this.f1899a = "Invalid key";
        } else {
            try {
                if (new File(this.f1900b.getFilesDir().getAbsolutePath() + "/" + str + ".kds").exists()) {
                    obj = new C0279L(this.f1900b.openFileInput(str + ".kds")).readObject();
                } else if (KonyMain.f3657e) {
                    Log.d("KonyDataSource", "File not found: " + str);
                }
            } catch (Throwable e) {
                if (KonyMain.f3658f) {
                    Log.w("KonyDataSource", "read", e);
                }
            } catch (Throwable e2) {
                if (KonyMain.f3658f) {
                    Log.w("KonyDataSource", "read", e2);
                }
            } catch (Throwable e22) {
                if (KonyMain.f3658f) {
                    Log.w("KonyDataSource", "read", e22);
                }
            }
        }
        return obj;
    }

    public final boolean m1804a(String str, Object obj) {
        if (str == null || str.trim().length() <= 0) {
            this.f1899a = "Invalid key";
            return false;
        } else if (obj instanceof Serializable) {
            try {
                OutputStream openFileOutput = this.f1900b.openFileOutput(str + ".kds", 0);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(openFileOutput);
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                objectOutputStream.close();
                openFileOutput.close();
                return true;
            } catch (FileNotFoundException e) {
                if (KonyMain.f3657e) {
                    Log.d("KonyDataSource", BuildConfig.FLAVOR + e.getMessage());
                }
                this.f1899a = "Data source error";
                return false;
            } catch (IOException e2) {
                if (KonyMain.f3657e) {
                    Log.d("KonyDataSource", BuildConfig.FLAVOR + e2.getMessage());
                }
                this.f1899a = "Data source error";
                return false;
            }
        } else {
            this.f1899a = "Object is not serializable";
            return false;
        }
    }

    public final boolean m1805b(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonyDataSource", "Deleting the table by the name: " + str);
        }
        if (str != null && str.trim().length() > 0) {
            return this.f1900b.deleteFile(str + ".kds");
        }
        this.f1899a = "Invalid key";
        return false;
    }
}
