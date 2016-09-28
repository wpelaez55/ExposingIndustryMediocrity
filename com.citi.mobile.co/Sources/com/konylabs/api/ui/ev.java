package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class ev implements OnCancelListener, OnClickListener, OnCheckedChangeListener {
    private String f1328a;
    private Callback f1329b;
    private boolean f1330c;

    public ev(et etVar, String str, Callback callback) {
        this.f1330c = false;
        this.f1328a = str;
        this.f1329b = callback;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f1329b.invoke(this.f1328a, false, false);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f1330c = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.f1329b.invoke(this.f1328a, true, this.f1330c);
        } else {
            this.f1329b.invoke(this.f1328a, false, this.f1330c);
        }
    }
}
