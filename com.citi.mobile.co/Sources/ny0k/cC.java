package ny0k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;

public final class cC extends Drawable implements Runnable {
    private Drawable f2220a;
    private int f2221b;

    public cC(Drawable drawable, Drawable drawable2, Drawable drawable3, int i) {
        Drawable drawable4;
        this.f2221b = i;
        if (drawable instanceof LayerDrawable) {
            drawable4 = (LayerDrawable) drawable;
        } else if (drawable instanceof cC) {
            r0 = (LayerDrawable) ((cC) drawable).f2220a;
        } else {
            if (drawable instanceof StateListDrawable) {
                Drawable[] children = ((DrawableContainerState) ((StateListDrawable) drawable).getConstantState()).getChildren();
                if (children != null && children.length > 0) {
                    for (int i2 = 0; i2 < children.length; i2++) {
                        if (children[i2] instanceof LayerDrawable) {
                            r0 = (LayerDrawable) children[i2];
                            break;
                        }
                    }
                }
            }
            drawable4 = null;
        }
        if (drawable4 != null) {
            this.f2220a = drawable4;
            if (drawable2 != null) {
                Rect bounds = drawable4.findDrawableByLayerId(16908301).getBounds();
                Drawable clipDrawable = new ClipDrawable(drawable2, 3, 1);
                clipDrawable.setBounds(bounds);
                drawable4.setDrawableByLayerId(16908301, clipDrawable);
                drawable4.setDrawableByLayerId(16908303, clipDrawable);
            }
            if (drawable3 != null) {
                drawable3.setBounds(drawable4.findDrawableByLayerId(16908288).getBounds());
                drawable4.setDrawableByLayerId(16908288, drawable3);
            }
        }
    }

    public final void draw(Canvas canvas) {
        this.f2220a.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        LayerDrawable layerDrawable = (LayerDrawable) this.f2220a;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            layerDrawable.findDrawableByLayerId(layerDrawable.getId(i));
            int abs = (Math.abs(rect.height()) - this.f2221b) / 2;
            layerDrawable.setLayerInset(i, 0, abs, 0, abs);
        }
        this.f2220a.setBounds(rect);
    }

    protected final boolean onLevelChange(int i) {
        return this.f2220a.setLevel(i);
    }

    protected final boolean onStateChange(int[] iArr) {
        invalidateSelf();
        return false;
    }

    public final void run() {
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
