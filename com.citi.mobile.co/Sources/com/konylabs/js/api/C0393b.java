package com.konylabs.js.api;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ViewDragHelper;
import com.konylabs.android.C0128a;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0339C;
import com.konylabs.api.C0349R;
import com.konylabs.api.C0373w;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import net.sourceforge.zbar.Symbol;
import ny0k.cr;

/* renamed from: com.konylabs.js.api.b */
public final class C0393b implements Library {
    private static String[] f3091a;
    private static Library f3092b;
    private static HashMap f3093c;
    private static Library f3094d;
    private static HashMap f3095e;
    private static Library f3096f;
    private static HashMap f3097g;
    private static Library f3098h;
    private static HashMap f3099i;
    private static Library f3100j;
    private static HashMap f3101k;
    private static Library f3102l;
    private static HashMap f3103m;
    private static Library f3104n;
    private static HashMap f3105o;
    private static Library f3106p;
    private static HashMap f3107q;

    static {
        f3091a = new String[]{"appReset", "setAppMenu", "createAppMenu", "setCurrentAppMenu", "getCurrentAppMenu", "setAppMenuFocusIndex", "setAppMenuFocusByID", "showAppMenuItems", "hideAppMenuItems", "addAppMenuItemAt", "removeAppMenuItemAt", "registerForIdleTimeout", "unregisterForIdleTimeout", "setAppHeaders", "setAppFooters", "setApplicationCallbacks", "setApplicationInitilizationEvents", "exit", "getCurrentForm", "getPreviousForm", "setApplicationMode", "getApplicationMode", "setGesturerecognizerForAllForms", "removeGestureRecognizerForAllForms", "showLoadingScreen", "dismissLoadingScreen", "openURL", "setApplicationBehaviors", "openMediaURL", "getCurrentPopup", "announceAccessibilityHint"};
    }

    public C0393b() {
        Library c0339c = new C0339C(KonyMain.getAppContext());
        f3092b = c0339c;
        f3093c = cr.m2202a(c0339c);
        c0339c = new C0373w();
        f3100j = c0339c;
        f3101k = cr.m2202a(c0339c);
        c0339c = C0349R.m2283b();
        f3094d = c0339c;
        f3095e = cr.m2202a(c0339c);
        c0339c = C0349R.m2290i();
        f3096f = c0339c;
        f3097g = cr.m2202a(c0339c);
        c0339c = C0349R.m2289h();
        f3098h = c0339c;
        f3099i = cr.m2202a(c0339c);
        c0339c = new C0349R(KonyMain.getActContext());
        f3102l = c0339c;
        f3103m = cr.m2202a(c0339c);
        c0339c = C0349R.m2282a();
        f3104n = c0339c;
        f3105o = cr.m2202a(c0339c);
        c0339c = C0349R.m2291j();
        f3106p = c0339c;
        f3107q = cr.m2202a(c0339c);
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return f3092b.execute(((Integer) f3093c.get("appreset")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return f3098h.execute(((Integer) f3099i.get("setappmenu")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return f3098h.execute(((Integer) f3099i.get("createappmenu")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return f3098h.execute(((Integer) f3099i.get("setcurrentappmenu")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return f3098h.execute(((Integer) f3099i.get("getcurrentappmenu")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return f3098h.execute(((Integer) f3099i.get("setappmenufocusindex")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return f3098h.execute(((Integer) f3099i.get("setappmenufocusbyid")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return f3098h.execute(((Integer) f3099i.get("showappmenuitems")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return f3098h.execute(((Integer) f3099i.get("hideappmenuitems")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return f3098h.execute(((Integer) f3099i.get("addappmenuitemat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                return f3098h.execute(((Integer) f3099i.get("removeappmenuitemat")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                return f3092b.execute(((Integer) f3093c.get("registerforidletimeout")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                return f3092b.execute(((Integer) f3093c.get("unregisterforidletimeout")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                return f3096f.execute(((Integer) f3097g.get("setappheaders")).intValue(), objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_FUNCTION /*14*/:
                return f3096f.execute(((Integer) f3097g.get("setappfooters")).intValue(), objArr);
            case ViewDragHelper.EDGE_ALL /*15*/:
                return f3092b.execute(((Integer) f3093c.get("setapplicationcallbacks")).intValue(), objArr);
            case TransportMediator.FLAG_KEY_MEDIA_PAUSE /*16*/:
                return f3092b.execute(((Integer) f3093c.get("setapplicationinitializationevents")).intValue(), objArr);
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_CENTER /*17*/:
                return f3092b.execute(((Integer) f3093c.get("exit")).intValue(), objArr);
            case MotionEventCompat.AXIS_RTRIGGER /*18*/:
                return f3094d.execute(((Integer) f3095e.get("getcurrentform")).intValue(), objArr);
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_LEFT /*19*/:
                return f3094d.execute(((Integer) f3095e.get("getpreviousform")).intValue(), objArr);
            case MotionEventCompat.AXIS_RUDDER /*20*/:
                return f3100j.execute(((Integer) f3101k.get("setapplicationmode")).intValue(), objArr);
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_RIGHT /*21*/:
                return f3100j.execute(((Integer) f3101k.get("getapplicationmode")).intValue(), objArr);
            case MotionEventCompat.AXIS_GAS /*22*/:
                return f3104n.execute(((Integer) f3105o.get("setgesturerecognizerforallforms")).intValue(), objArr);
            case MotionEventCompat.AXIS_BRAKE /*23*/:
                return f3104n.execute(((Integer) f3105o.get("removegesturerecognizerforallforms")).intValue(), objArr);
            case MotionEventCompat.AXIS_DISTANCE /*24*/:
                return f3102l.execute(((Integer) f3103m.get("showloadingscreen")).intValue(), objArr);
            case Symbol.I25 /*25*/:
                return f3102l.execute(((Integer) f3103m.get("dismissloadingscreen")).intValue(), objArr);
            case 26:
                return f3102l.execute(((Integer) f3103m.get("openurl")).intValue(), objArr);
            case 27:
                return f3092b.execute(((Integer) f3093c.get("setapplicationbehaviors")).intValue(), objArr);
            case 28:
                return f3102l.execute(((Integer) f3103m.get("openmediaurl")).intValue(), objArr);
            case 29:
                return f3106p.execute(((Integer) f3107q.get("getcurrentpopup")).intValue(), objArr);
            case 30:
                C0128a.m18a(objArr);
                return null;
            case 31:
                return f3100j.execute(((Integer) f3101k.get("announceaccessibilityhint")).intValue(), objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f3091a;
    }

    public final String getNameSpace() {
        return "kony.application";
    }
}
