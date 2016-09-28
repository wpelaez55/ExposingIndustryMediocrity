package com.konylabs.api.ui;

import android.content.Context;
import android.widget.RelativeLayout;

final class ai extends RelativeLayout {
    private /* synthetic */ ah f551a;

    ai(ah ahVar, Context context) {
        this.f551a = ahVar;
        super(context);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() || isFocused()) {
            if (this.f551a.f539n != null) {
                this.f551a.f539n.m1129b(this.f551a.f533h);
            } else {
                this.f551a.f527b.m1129b(this.f551a.f533h);
            }
        } else if (this.f551a.f544s) {
            if (this.f551a.f538m != null) {
                this.f551a.f538m.m1129b(this.f551a.f533h);
            } else {
                this.f551a.f527b.m1129b(this.f551a.f533h);
            }
        } else if (this.f551a.f540o != null) {
            this.f551a.f540o.m1129b(this.f551a.f533h);
        } else {
            this.f551a.f527b.m1129b(this.f551a.f533h);
        }
    }
}
