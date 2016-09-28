package ny0k;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eO;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;
import java.util.HashMap;

public final class cD extends SimpleOnGestureListener {
    public static final Integer f2222c;
    public static final Integer f2223d;
    public static final Integer f2224e;
    public static final Integer f2225f;
    public HashMap f2226a;
    public HashMap f2227b;
    private int f2228g;
    private int f2229h;
    private LuaWidget f2230i;
    private cE f2231j;

    static {
        f2222c = Integer.valueOf(0);
        f2223d = Integer.valueOf(1);
        f2224e = Integer.valueOf(2);
        f2225f = Integer.valueOf(3);
    }

    public cD() {
        this.f2226a = new HashMap();
        this.f2227b = new HashMap();
        this.f2228g = 50;
        this.f2229h = 75;
        this.f2230i = null;
    }

    public final cD m2103a(eO eOVar) {
        cD cDVar = new cD();
        cDVar.f2226a = new HashMap(this.f2226a);
        cDVar.f2227b = new HashMap(this.f2227b);
        cDVar.f2228g = this.f2228g;
        cDVar.f2229h = this.f2229h;
        cDVar.f2230i = eOVar;
        return cDVar;
    }

    public final void m2104a(int i) {
        this.f2228g = i;
    }

    public final void m2105a(LuaWidget luaWidget) {
        this.f2230i = luaWidget;
    }

    public final void m2106a(cE cEVar) {
        this.f2231j = cEVar;
    }

    public final void m2107b(int i) {
        this.f2229h = i;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f2226a.get(Integer.valueOf(1)) == null) {
            return false;
        }
        if (KonyMain.f3657e) {
            Log.d("GestureListenerUtil", "NA:: onDoubleTap********");
        }
        Serializable luaTable = new LuaTable();
        luaTable.setTable("gestureType", new Double(1.0d));
        LuaNil luaNil = this.f2227b.get(Integer.valueOf(1));
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            luaTable.setTable("gesturesetUpParams", luaNil);
        }
        luaTable.setTable("gestureX", new Double((double) motionEvent.getX()));
        luaTable.setTable("gestureY", new Double((double) motionEvent.getY()));
        View widget = this.f2230i.getWidget();
        luaTable.setTable("widgetWidth", Integer.valueOf(widget.getWidth()));
        luaTable.setTable("widgetHeight", Integer.valueOf(widget.getHeight()));
        Serializable serializable = null;
        if (this.f2231j != null) {
            serializable = this.f2231j.m2108s();
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f2226a.get(Integer.valueOf(1));
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", this.f2230i);
        bundle.putSerializable("key1", luaTable);
        bundle.putSerializable("key2", serializable);
        obtain.setData(bundle);
        KonyMain.m4121f().sendMessage(obtain);
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f2226a.get(Integer.valueOf(2)) == null) {
            return false;
        }
        if (KonyMain.f3657e) {
            Log.d("GestureListenerUtil", "NA:: onFling********");
        }
        Log.d("GestureListenerUtil", "NA:: onFling********" + this.f2228g + ":" + this.f2229h);
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        int r = dB.m1116r(this.f2228g);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float x2 = motionEvent2.getX();
        float y2 = motionEvent2.getY();
        float abs = Math.abs(x - x2);
        float abs2 = Math.abs(y - y2);
        float abs3 = Math.abs(f);
        float abs4 = Math.abs(f2);
        int i = 0;
        if (abs3 > ((float) this.f2229h) && abs > ((float) r)) {
            i = x > x2 ? 1 : 2;
        } else if (abs4 > ((float) this.f2229h) && abs2 > ((float) r)) {
            i = y > y2 ? 3 : 4;
        }
        Serializable luaTable = new LuaTable();
        luaTable.setTable("gestureType", new Double(2.0d));
        LuaNil luaNil = this.f2227b.get(Integer.valueOf(2));
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            luaTable.setTable("gesturesetUpParams", luaNil);
        }
        luaTable.setTable("swipeDirection", new Double((double) i));
        Serializable serializable = null;
        if (this.f2231j != null) {
            serializable = this.f2231j.m2108s();
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f2226a.get(Integer.valueOf(2));
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", this.f2230i);
        bundle.putSerializable("key1", luaTable);
        bundle.putSerializable("key2", serializable);
        obtain.setData(bundle);
        KonyMain.m4121f().sendMessage(obtain);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (this.f2226a.get(Integer.valueOf(3)) != null) {
            if (KonyMain.f3657e) {
                Log.d("GestureListenerUtil", "NA:: onLongPress********");
            }
            Serializable luaTable = new LuaTable();
            luaTable.setTable("gestureType", new Double(3.0d));
            LuaNil luaNil = this.f2227b.get(Integer.valueOf(3));
            if (!(luaNil == null || luaNil == LuaNil.nil)) {
                luaTable.setTable("gesturesetUpParams", luaNil);
            }
            luaTable.setTable("gestureX", new Double((double) motionEvent.getX()));
            luaTable.setTable("gestureY", new Double((double) motionEvent.getY()));
            View widget = this.f2230i.getWidget();
            luaTable.setTable("widgetWidth", Integer.valueOf(widget.getWidth()));
            luaTable.setTable("widgetHeight", Integer.valueOf(widget.getHeight()));
            Serializable serializable = null;
            if (this.f2231j != null) {
                serializable = this.f2231j.m2108s();
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f2226a.get(Integer.valueOf(3));
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f2230i);
            bundle.putSerializable("key1", luaTable);
            bundle.putSerializable("key2", serializable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f2226a.get(Integer.valueOf(0)) == null) {
            return false;
        }
        if (KonyMain.f3657e) {
            Log.d("GestureListenerUtil", "NA:: onSingleTapUp********");
        }
        Serializable luaTable = new LuaTable();
        luaTable.setTable("gestureType", new Double(1.0d));
        LuaNil luaNil = this.f2227b.get(Integer.valueOf(0));
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            luaTable.setTable("gesturesetUpParams", luaNil);
        }
        luaTable.setTable("gestureX", new Double((double) motionEvent.getX()));
        luaTable.setTable("gestureY", new Double((double) motionEvent.getY()));
        View widget = this.f2230i.getWidget();
        luaTable.setTable("widgetWidth", Integer.valueOf(widget.getWidth()));
        luaTable.setTable("widgetHeight", Integer.valueOf(widget.getHeight()));
        Serializable serializable = null;
        if (this.f2231j != null) {
            serializable = this.f2231j.m2108s();
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f2226a.get(Integer.valueOf(0));
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", this.f2230i);
        bundle.putSerializable("key1", luaTable);
        bundle.putSerializable("key2", serializable);
        obtain.setData(bundle);
        KonyMain.m4121f().sendMessage(obtain);
        return true;
    }
}
