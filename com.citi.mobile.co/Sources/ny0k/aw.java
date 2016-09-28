package ny0k;

import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.C0245j;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

public final class aw {
    private static aw f2113a;
    private Vector f2114b;
    private Boolean f2115c;

    private aw() {
        this.f2114b = new Vector();
        this.f2115c = Boolean.valueOf(false);
    }

    public static aw m2002a() {
        if (f2113a == null) {
            f2113a = new aw();
        }
        return f2113a;
    }

    private synchronized void m2003b(aC aCVar) {
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.runOnUiThread(new ax(this, actContext));
        }
        this.f2114b.add(aCVar);
    }

    public final aC m2004a(String str, Iterator it, Iterator it2, Hashtable hashtable, C0245j c0245j, aD aDVar) {
        az azVar = new az(str, (byte) 0);
        azVar.m3564a(hashtable);
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!(entry.getKey().equals("httpheaders") || entry.getKey().equals("httpconfig"))) {
                azVar.m3562a(entry.getKey(), entry.getValue());
            }
        }
        if (it2 != null) {
            while (it2.hasNext()) {
                entry = (Entry) it2.next();
                azVar.m3563a(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        aC aCVar = new aC(azVar, c0245j, aDVar);
        aCVar.m3509a(this);
        aCVar.start();
        m2003b(aCVar);
        return aCVar;
    }

    public final synchronized void m2005a(aC aCVar) {
        this.f2114b.remove(aCVar);
        if (!m2007b()) {
            KonyMain actContext = KonyMain.getActContext();
            if (actContext != null) {
                actContext.runOnUiThread(new ay(this, actContext));
            }
        }
    }

    public final Object[] m2006a(String str, Iterator it, Iterator it2, Hashtable hashtable) throws aE {
        Message obtain;
        az azVar = new az(str, (byte) 0);
        azVar.m3564a(hashtable);
        while (it.hasNext()) {
            Entry entry;
            try {
                entry = (Entry) it.next();
                if (!(entry.getKey().equals("httpheaders") || entry.getKey().equals("httpconfig"))) {
                    azVar.m3562a(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                azVar.m3572i();
                synchronized (this.f2115c) {
                }
                this.f2115c = Boolean.valueOf(false);
                obtain = Message.obtain();
                obtain.what = 6;
                KonyMain.m4061G().m1727a(obtain);
            }
        }
        if (it2 != null) {
            while (it2.hasNext()) {
                entry = (Entry) it2.next();
                azVar.m3563a(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        synchronized (this.f2115c) {
            this.f2115c = Boolean.valueOf(true);
        }
        azVar.m3574k();
        Object[] a = az.m3553a(azVar);
        azVar.m3572i();
        synchronized (this.f2115c) {
            this.f2115c = Boolean.valueOf(false);
        }
        obtain = Message.obtain();
        obtain.what = 6;
        KonyMain.m4061G().m1727a(obtain);
        return a;
    }

    public final boolean m2007b() {
        return this.f2114b.size() > 0;
    }

    public final boolean m2008c() {
        if (this.f2114b.size() > 0) {
            return true;
        }
        boolean booleanValue;
        synchronized (this.f2115c) {
            booleanValue = this.f2115c.booleanValue();
        }
        return booleanValue;
    }
}
