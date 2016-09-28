package com.konylabs.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.konylabs.api.ui.eI;
import com.konylabs.nativecodegen.api.AccelerometerSensor;
import com.konylabs.nativecodegen.api.App;
import com.konylabs.nativecodegen.api.AppMenu;
import com.konylabs.nativecodegen.api.Camera;
import com.konylabs.nativecodegen.api.Contacts;
import com.konylabs.nativecodegen.api.Crypto;
import com.konylabs.nativecodegen.api.DataStore;
import com.konylabs.nativecodegen.api.GeoLocation;
import com.konylabs.nativecodegen.api.Hybrid;
import com.konylabs.nativecodegen.api.I18n;
import com.konylabs.nativecodegen.api.JSON;
import com.konylabs.nativecodegen.api.LocalStorage;
import com.konylabs.nativecodegen.api.Map;
import com.konylabs.nativecodegen.api.MathLib;
import com.konylabs.nativecodegen.api.Net;
import com.konylabs.nativecodegen.api.OS;
import com.konylabs.nativecodegen.api.Phone;
import com.konylabs.nativecodegen.api.Push;
import com.konylabs.nativecodegen.api.Standard;
import com.konylabs.nativecodegen.api.Streaming;
import com.konylabs.nativecodegen.api.StringLib;
import com.konylabs.nativecodegen.api.Table;
import com.konylabs.nativecodegen.api.Themes;
import com.konylabs.nativecodegen.api.Timer;
import com.konylabs.nativecodegen.api.Window;
import com.konylabs.vm.Function;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.IOException;
import ny0k.C0284S;
import ny0k.cN;

/* renamed from: com.konylabs.android.K */
final class C0126K extends Handler {
    private /* synthetic */ C0125J f15a;

    C0126K(C0125J c0125j) {
        this.f15a = c0125j;
    }

    public final void handleMessage(Message message) {
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            boolean z;
            Bundle data = message.getData();
            if (data != null) {
                if (!data.containsKey("hideProgress")) {
                    z = true;
                } else if (!((Boolean) data.get("hideProgress")).booleanValue()) {
                    z = true;
                }
                if (z) {
                    actContext.m4147a();
                }
            }
            z = false;
            if (z) {
                actContext.m4147a();
            }
        }
        if (message.what == 0) {
            this.f15a.f14b = new C0135h(actContext);
            if (KonyMain.f3655c.m2133a()) {
                if (KonyMain.f3657e) {
                    Log.d(KonyMain.f3665n, "First run.... loading packaged I18N resources");
                }
                try {
                    String[] list = actContext.getAssets().list(BuildConfig.FLAVOR);
                    C0284S a = C0284S.m1823a((Context) actContext);
                    for (String str : list) {
                        if (str.endsWith(".prop")) {
                            if (KonyMain.f3657e) {
                                Log.d(KonyMain.f3665n, "loading i18n prop :" + str);
                            }
                            a.m1838a(actContext.getAssets().open(str), str.substring(0, str.indexOf(".prop")));
                        }
                    }
                } catch (IOException e) {
                    if (KonyMain.f3657e) {
                        Log.d(KonyMain.f3665n, BuildConfig.FLAVOR + e.getMessage());
                    }
                }
                KonyMain.f3655c.m2132a("AppFirstRun", false);
            }
            if (this.f15a.f14b.m67d()) {
                if (KonyMain.f3657e) {
                    Log.d(KonyMain.f3665n, "Download available");
                }
                KonyMain.f3638B.sendEmptyMessage(99992);
                return;
            }
            if (actContext != null) {
                Function startupMethod = actContext.getStartupMethod();
                if (startupMethod != null) {
                    try {
                        App.initialize();
                        AppMenu.initialize();
                        Contacts.initialize();
                        Camera.initialize();
                        Crypto.initialize();
                        DataStore.initialize();
                        I18n.initialize();
                        JSON.initialize();
                        MathLib.initialize();
                        Net.initialize();
                        OS.initialize();
                        Phone.initialize();
                        Standard.initialize();
                        Streaming.initialize();
                        StringLib.initialize();
                        Table.initialize();
                        Timer.initialize();
                        Push.initialize();
                        Window.initialize();
                        LocalStorage.initialize();
                        GeoLocation.initialize();
                        Hybrid.initialize();
                        Themes.initialize();
                        Map.initialize();
                        AccelerometerSensor.initialize();
                        startupMethod.execute(null);
                        KonyMain.f3638B.sendEmptyMessage(99990);
                    } catch (Exception e2) {
                        if (KonyMain.f3659g) {
                            Log.e(KonyMain.f3665n, "Unable to execute Startup Method");
                        }
                        e2.printStackTrace();
                    }
                } else if (!actContext.showPreview()) {
                    KonyMain.f3668q.m1783b();
                }
            }
            if (KonyMain.f3647R) {
                KonyMain.f3638B.sendEmptyMessage(99990);
            }
        } else if (message.what == 6) {
            this.f15a.f13a.removeMessages(1, message.obj);
        } else if (message.what == 1 || message.what == 7) {
            Boolean valueOf = Boolean.valueOf(false);
            if (actContext != null) {
                Bundle data2 = message.getData();
                if (data2 != null) {
                    if (!data2.containsKey("keepVKBOpen")) {
                        actContext.m4168q();
                    }
                    if (data2.containsKey("DropMultipleTaps") && message.what == 1) {
                        valueOf = Boolean.valueOf(true);
                    }
                }
                if (!(message.what == 7 && data2 != null && data2.containsKey("hideProgress"))) {
                    actContext.m4169v();
                }
            }
            KonyMain.f3668q.m1772a(message);
            if (valueOf.booleanValue()) {
                Message obtain = Message.obtain();
                obtain.what = 6;
                obtain.obj = message.obj;
                this.f15a.f13a.sendMessageAtFrontOfQueue(obtain);
            }
        } else if (message.what == 2) {
            this.f15a.f14b.m68e();
            if (this.f15a.f14b.m65b() == C0135h.f33a) {
                this.f15a.f14b.m69f();
                if (this.f15a.f14b.m65b() == C0135h.f34b) {
                    KonyMain.f3655c.m2131a(1);
                }
            }
            KonyMain.f3668q.m1783b();
        } else if (message.what == 3) {
            this.f15a.f14b.m63a();
            KonyMain.f3668q.m1783b();
        } else if (message.what == 4) {
            actContext.f3687t = null;
            KonyMain.f3653a = null;
            KonyMain.f3671v = null;
            KonyMain.f3669r = null;
            KonyMain.f3670s = null;
            KonyMain.f3673x = null;
            KonyMain.m4094a(new C0127L(this, actContext));
            eI.m3275a().m3291d();
            cN.m2151d();
            KonyMain.f3668q.m1783b();
        }
        if (actContext != null) {
            actContext.m4155b();
        }
        if (this.f15a.f14b != null) {
            this.f15a.f14b.m63a();
        }
    }
}
