package ny0k;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.DisplayMetrics;
import com.konylabs.android.KonyMain;

public final class cy extends BitmapDrawable {
    private static int f2320a;
    private int f2321b;
    private int f2322c;
    private cz f2323d;

    static {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setToDefaults();
        f2320a = (int) ((displayMetrics.density * 160.0f) + 0.5f);
    }

    public cy(Bitmap bitmap) {
        super(bitmap);
        this.f2321b = -1;
        this.f2322c = -1;
        this.f2323d = new cz(bitmap);
        this.f2321b = bitmap.getWidth();
        this.f2322c = bitmap.getHeight();
    }

    private static int m2213a(int i, int i2, int i3) {
        return 160 == i3 ? i : ((i * i3) + 80) / 160;
    }

    public final ConstantState m2214a() {
        this.f2323d.f2324a = super.getChangingConfigurations();
        return this.f2323d;
    }

    public final int getIntrinsicHeight() {
        return getBitmap() == null ? -1 : KonyMain.f3656d < 4 ? super.getIntrinsicHeight() : m2213a(this.f2322c, 160, f2320a);
    }

    public final int getIntrinsicWidth() {
        return getBitmap() == null ? -1 : KonyMain.f3656d < 4 ? super.getIntrinsicWidth() : m2213a(this.f2321b, 160, f2320a);
    }
}
