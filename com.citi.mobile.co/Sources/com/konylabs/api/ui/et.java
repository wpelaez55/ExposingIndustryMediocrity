package com.konylabs.api.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;

final class et extends WebChromeClient {
    private AlertDialog f1325a;
    private Function f1326b;
    private /* synthetic */ KonyWeb f1327c;

    et(KonyWeb konyWeb) {
        this.f1327c = konyWeb;
        this.f1325a = null;
        this.f1326b = new eu(this);
    }

    public final View getVideoLoadingProgressView() {
        if (this.f1327c.f267w == null) {
            this.f1327c.f267w = new ProgressBar(this.f1327c.f247c, null, 16842874);
            ((ProgressBar) this.f1327c.f267w).setIndeterminate(true);
            this.f1327c.f267w.setVisibility(0);
        }
        return this.f1327c.f267w;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        if (this.f1325a != null) {
            this.f1325a.cancel();
            this.f1325a = null;
        }
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        Object evVar = new ev(this, str, callback);
        Builder builder = new Builder(KonyMain.getActivityContext());
        builder.setTitle("Location");
        View linearLayout = new LinearLayout(KonyMain.getActivityContext());
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        View textView = new TextView(this.f1327c.f247c);
        textView.setText(str + " wants to know your location");
        View checkBox = new CheckBox(KonyMain.getActivityContext());
        checkBox.setText(" Remember Preference");
        checkBox.setOnCheckedChangeListener(evVar);
        linearLayout.addView(textView);
        linearLayout.addView(checkBox);
        builder.setView(linearLayout);
        builder.setPositiveButton("Show Location", evVar);
        builder.setNegativeButton("Decline", evVar);
        builder.setOnCancelListener(evVar);
        this.f1325a = builder.create();
        this.f1325a.show();
    }

    public final void onHideCustomView() {
        KonyMain.getActivityContext().m4152a(null);
        this.f1327c.m241f();
        if (this.f1327c.f266v != null) {
            this.f1327c.f266v.onCustomViewHidden();
            this.f1327c.f266v = null;
        }
        super.onHideCustomView();
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        if (!this.f1327c.f264t) {
            super.onShowCustomView(view, customViewCallback);
        } else if (view != null) {
            if (this.f1327c.f266v != null) {
                this.f1327c.f266v.onCustomViewHidden();
            }
            this.f1327c.m241f();
            KonyMain.getActivityContext().m4152a(this.f1326b);
            this.f1327c.f265u = new FrameLayout(this.f1327c.f247c);
            this.f1327c.f265u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f1327c.f265u.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.f1327c.f265u.setClickable(true);
            this.f1327c.f265u.addView(view);
            this.f1327c.f266v = customViewCallback;
            Fragment esVar = new es(this.f1327c);
            FragmentTransaction beginTransaction = KonyMain.getActivityContext().getSupportFragmentManager().beginTransaction();
            beginTransaction.add(16908290, esVar, this.f1327c.f268x);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
