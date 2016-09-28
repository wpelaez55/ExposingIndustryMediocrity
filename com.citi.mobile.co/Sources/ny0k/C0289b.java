package ny0k;

import android.util.SparseArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;

/* renamed from: ny0k.b */
public class C0289b {
    protected LuaWidget f2118a;

    protected static int m2009a(String str) {
        return str == "forwards" ? 0 : str == "backwards" ? 1 : str == "both" ? 2 : str == "none" ? 3 : 0;
    }

    protected static Interpolator m2010a(int i) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return new AccelerateDecelerateInterpolator();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return new LinearInterpolator();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return new AccelerateInterpolator();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return new DecelerateInterpolator();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return new AccelerateDecelerateInterpolator();
            default:
                return new LinearInterpolator();
        }
    }

    protected static int m2011b(String str) {
        return str == "normal" ? 0 : str == "reverse" ? 1 : str == "alternate" ? 2 : str == "alternate-reverse" ? 3 : 0;
    }

    public void m2012a(SparseArray sparseArray, boolean z, Object obj, Object obj2) {
    }
}
