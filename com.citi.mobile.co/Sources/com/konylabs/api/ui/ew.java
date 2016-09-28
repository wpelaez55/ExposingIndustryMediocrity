package com.konylabs.api.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.MailTo;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;

final class ew extends WebViewClient {
    private /* synthetic */ KonyWeb f1331a;

    ew(KonyWeb konyWeb) {
        this.f1331a = konyWeb;
    }

    private static boolean m1340a(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            KonyMain.getActContext().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyWeb", BuildConfig.FLAVOR + e.getMessage());
            }
            if (KonyMain.f3657e) {
                Log.d("KonyWeb", "Activity not found to handle " + str);
            }
            return false;
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (KonyMain.f3657e) {
            Log.d("KonyWeb", "onLoadResource " + str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (KonyMain.f3657e) {
            Log.d("KonyWeb", "onPageFinished " + str);
        }
        KonyMain.getActContext().m4155b();
        if (!(this.f1331a.f257m || this.f1331a.f270z == null)) {
            this.f1331a.f270z.m1341a(true);
            this.f1331a.f257m = true;
        }
        super.onPageFinished(webView, str);
        this.f1331a.requestLayout();
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (KonyMain.f3657e) {
            Log.d("KonyWeb", "onPageStarted " + str);
        }
        if (this.f1331a.f263s) {
            KonyMain.getActContext().m4147a();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (KonyMain.f3657e) {
            Log.d("KonyWeb", "Failed to load URL " + str2 + "\n\tReason : " + str + "\n\tErrorCode : " + i);
        }
        if (!(this.f1331a.f257m || this.f1331a.f270z == null)) {
            this.f1331a.f270z.m1341a(false);
            this.f1331a.f257m = true;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String path;
        Object e;
        if (KonyMain.f3657e) {
            Log.d("KonyWeb", "shouldOverrideUrlLoading " + str);
        }
        try {
            path = new URI(str).getPath();
            try {
                if (KonyMain.f3657e) {
                    Log.d("KonyWeb", "URL Path " + path);
                }
            } catch (URISyntaxException e2) {
                e = e2;
                if (KonyMain.f3657e) {
                    Log.d("KonyWeb", BuildConfig.FLAVOR + e);
                }
                if (!str.equals("about:blank")) {
                    return true;
                }
                if (!str.startsWith("geo:0,0?q=")) {
                }
                return m1340a(str);
            }
        } catch (URISyntaxException e3) {
            URISyntaxException uRISyntaxException = e3;
            path = null;
            e = uRISyntaxException;
            if (KonyMain.f3657e) {
                Log.d("KonyWeb", BuildConfig.FLAVOR + e);
            }
            if (!str.equals("about:blank")) {
                return true;
            }
            if (str.startsWith("geo:0,0?q=")) {
            }
            return m1340a(str);
        }
        if (!str.equals("about:blank")) {
            return true;
        }
        if (str.startsWith("geo:0,0?q=") || str.startsWith("market")) {
            return m1340a(str);
        }
        if (path != null && (path.endsWith("mp4") || path.endsWith("3gp"))) {
            return m1340a(str);
        }
        if (str.startsWith("tel:")) {
            return this.f1331a.f256l ? m1340a(str) : false;
        } else {
            if (str.startsWith("mailto:")) {
                MailTo parse = MailTo.parse(str);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                if (parse.getTo() != null) {
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{parse.getTo()});
                }
                String subject = parse.getSubject();
                if (subject != null) {
                    intent.putExtra("android.intent.extra.SUBJECT", subject);
                }
                if (parse.getCc() != null) {
                    intent.putExtra("android.intent.extra.CC", new String[]{parse.getCc()});
                }
                subject = parse.getBody();
                if (subject != null) {
                    intent.putExtra("android.intent.extra.TEXT", subject);
                }
                if (((String) parse.getHeaders().get("bcc")) != null) {
                    intent.putExtra("android.intent.extra.BCC", new String[]{(String) parse.getHeaders().get("bcc")});
                }
                KonyMain.getActContext().startActivity(intent);
                return true;
            }
            if (str.contains("KonyCall") || str.contains("khparams")) {
                if (this.f1331a.f245A != null) {
                    return this.f1331a.f245A.m1342a(str);
                }
            } else if (this.f1331a.f245A != null) {
                return this.f1331a.f245A.m1342a(str);
            } else {
                if (!(str.startsWith("http") || str.startsWith("javascript") || str.startsWith("inline"))) {
                    return m1340a(str);
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
