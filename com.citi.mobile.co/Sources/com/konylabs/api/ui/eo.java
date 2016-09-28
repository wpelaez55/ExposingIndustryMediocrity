package com.konylabs.api.ui;

final class eo implements Runnable {
    private /* synthetic */ String f1316a;
    private /* synthetic */ String f1317b;
    private /* synthetic */ String f1318c;
    private /* synthetic */ String f1319d;
    private /* synthetic */ KonyWeb f1320e;

    eo(KonyWeb konyWeb, String str, String str2, String str3, String str4) {
        this.f1320e = konyWeb;
        this.f1316a = str;
        this.f1317b = str2;
        this.f1318c = str3;
        this.f1319d = str4;
    }

    public final void run() {
        if (this.f1316a != null) {
            this.f1320e.loadDataWithBaseURL(this.f1316a, this.f1317b, this.f1318c, this.f1319d, null);
        } else {
            this.f1320e.loadData(this.f1317b, this.f1318c, this.f1319d);
        }
    }
}
