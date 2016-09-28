package com.konylabs.android;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

/* renamed from: com.konylabs.android.o */
final class C0142o implements OnDateSetListener {
    private /* synthetic */ KonyMain f47a;

    C0142o(KonyMain konyMain) {
        this.f47a = konyMain;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        KonyMain.m4081a(this.f47a, i);
        KonyMain.m4104b(this.f47a, i2);
        KonyMain.m4112c(this.f47a, i3);
        if (null != null) {
            null.onDateSet(datePicker, i, i2, i3);
        }
    }
}
