package ny0k;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cz extends ConstantState {
    int f2324a;
    private Bitmap f2325b;

    cz(Bitmap bitmap) {
        this.f2325b = bitmap;
    }

    public final int getChangingConfigurations() {
        return this.f2324a;
    }

    public final Drawable newDrawable() {
        return new cy(this.f2325b);
    }
}
