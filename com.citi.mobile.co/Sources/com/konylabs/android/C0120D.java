package com.konylabs.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import java.util.Iterator;
import ny0k.aT;

/* renamed from: com.konylabs.android.D */
final class C0120D extends BroadcastReceiver {
    private /* synthetic */ KonyMain f3a;

    private C0120D(KonyMain konyMain, byte b) {
        this.f3a = konyMain;
    }

    public final void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f3a.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null ? networkInfo.getType() == activeNetworkInfo.getType() : false;
            State state = networkInfo.getState();
            aT aTVar;
            if (z && state == State.CONNECTED) {
                Iterator it = this.f3a.f3679H.iterator();
                while (it.hasNext()) {
                    aTVar = (aT) it.next();
                    if (aTVar != null) {
                        if (networkInfo == null || networkInfo.getType() != 1) {
                            networkInfo.getType();
                            aTVar.m1934a();
                        } else if (KonyMain.af != networkInfo.isConnected()) {
                            networkInfo.getType();
                            aTVar.m1934a();
                            KonyMain.af = true;
                        }
                    }
                }
            } else if (!z || state == State.DISCONNECTED) {
                Iterator it2 = this.f3a.f3679H.iterator();
                while (it2.hasNext()) {
                    aTVar = (aT) it2.next();
                    if (aTVar != null) {
                        if (networkInfo == null || networkInfo.getType() != 1) {
                            aTVar.m1935b();
                        } else if (KonyMain.af != networkInfo.isConnected()) {
                            aTVar.m1935b();
                            KonyMain.af = false;
                        }
                    }
                }
            }
        }
    }
}
