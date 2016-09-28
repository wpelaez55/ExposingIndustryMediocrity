package com.konylabs.api.ui;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

/* renamed from: com.konylabs.api.ui.H */
final class C0178H implements OnDateSetListener {
    private /* synthetic */ C0371G f239a;

    C0178H(C0371G c0371g) {
        this.f239a = c0371g;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (C0371G.m2374d(i3, i2, i)) {
            this.f239a.f2455k = i;
            this.f239a.f2456l = i2;
            this.f239a.f2457m = i3;
            this.f239a.m2407j();
            if (this.f239a.f2443B != null) {
                this.f239a.f2443B.m1401a(true);
            }
        }
    }
}
