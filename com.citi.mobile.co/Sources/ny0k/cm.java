package ny0k;

import android.support.v4.widget.ViewDragHelper;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;

public final class cm {
    static {
    }

    public static Animation m2172a(int i, boolean z) {
        Animation a;
        Animation animationSet;
        Animation c0429v;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                a = m2173a("slide_in_top");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                a = m2173a("right_in");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                a = m2173a("left_in");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                a = m2173a("right_out");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                a = m2173a("left_out");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                a = m2173a("grow_fade_from_center");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                a = m2173a("grow_fade_from_topright");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                a = m2173a("grow_fade_from_bottomleft");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                a = m2173a("fancy_anim");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                a = m2173a("slide_in_down");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                a = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 2, 0.5f, 2, 0.5f);
                c0429v = new C0429v(0, 90);
                animationSet.addAnimation(a);
                animationSet.addAnimation(c0429v);
                animationSet.setDuration(400);
                if (!z) {
                    a = animationSet;
                    break;
                }
                animationSet.setStartOffset(400);
                a = animationSet;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                a = new ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f, 2, 0.5f, 2, 0.5f);
                c0429v = new C0429v(-90, 0);
                animationSet.addAnimation(a);
                animationSet.addAnimation(c0429v);
                animationSet.setDuration(400);
                if (!z) {
                    animationSet.setStartOffset(400);
                    a = animationSet;
                    break;
                }
                a = animationSet;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                a = m2173a("grow_from_center");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_FUNCTION /*14*/:
                c0429v = new C0307z(!z);
                c0429v.setDuration(m2173a("split_out").getDuration());
                a = c0429v;
                break;
            case ViewDragHelper.EDGE_ALL /*15*/:
                a = new C0307z(z);
                a.setDuration(m2173a("split_in").getDuration());
                break;
            default:
                a = null;
                break;
        }
        if (a == null) {
            return m2173a("still");
        }
        if (!z) {
            return a;
        }
        a.setInterpolator(new C0305u(a.getInterpolator()));
        return a;
    }

    private static Animation m2173a(String str) {
        int identifier = KonyMain.getAppContext().getResources().getIdentifier(str, "anim", KonyMain.getAppContext().getPackageName());
        return identifier > 0 ? AnimationUtils.loadAnimation(KonyMain.getAppContext(), identifier) : null;
    }

    public static boolean m2174a(int i) {
        return (i == 0 || i == -1) ? false : true;
    }
}
