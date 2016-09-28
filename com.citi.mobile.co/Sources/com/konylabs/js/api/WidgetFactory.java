package com.konylabs.js.api;

import com.konylabs.api.ui.eA;
import com.konylabs.api.ui.eO;
import com.konylabs.api.ui.fT;
import com.konylabs.api.ui.fX;
import com.konylabs.api.ui.fd;
import com.konylabs.api.ui.fe;
import com.konylabs.api.ui.fg;
import com.konylabs.api.ui.fi;
import com.konylabs.api.ui.fm;
import com.konylabs.api.ui.fn;
import com.konylabs.api.ui.fp;
import com.konylabs.api.ui.fs;
import com.konylabs.api.ui.fv;
import com.konylabs.api.ui.gA;
import com.konylabs.api.ui.gC;
import com.konylabs.api.ui.gD;
import com.konylabs.api.ui.gF;
import com.konylabs.api.ui.gH;
import com.konylabs.api.ui.gJ;
import com.konylabs.api.ui.gL;
import com.konylabs.api.ui.gU;
import com.konylabs.api.ui.gX;
import com.konylabs.api.ui.gZ;
import com.konylabs.api.ui.gs;
import com.konylabs.api.ui.gt;
import com.konylabs.api.ui.gu;
import com.konylabs.api.ui.gx;
import com.konylabs.api.ui.hD;
import com.konylabs.api.ui.hJ;
import com.konylabs.api.ui.hP;
import com.konylabs.api.ui.hd;
import com.konylabs.api.ui.hg;
import com.konylabs.api.ui.hq;
import com.konylabs.api.ui.ht;
import com.konylabs.api.ui.hy;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import ny0k.bO;

public class WidgetFactory {
    public static LuaTable createWidget(String str, long j, LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        if (luaTable == null) {
            throw new LuaError(1102, "WidgetError", "Widget cannot be created due to invalid input data");
        }
        LuaTable luaTable4 = null;
        String intern = str.intern();
        if (intern == "Form") {
            luaTable4 = fv.m4394b(luaTable, luaTable2, luaTable3, 0);
        } else if (intern == "Form2") {
            luaTable4 = fv.m4394b(luaTable, luaTable2, luaTable3, 1);
        } else if (intern == "Box") {
            luaTable4 = new eO(luaTable, luaTable2, luaTable3);
        } else if (intern == "BoxTemplate") {
            luaTable4 = new fd(luaTable, luaTable2, luaTable3);
        } else if (intern == "Button") {
            luaTable4 = new fe(luaTable, luaTable2, luaTable3);
        } else if (intern == "Label") {
            luaTable4 = new gA(luaTable, luaTable2, luaTable3);
        } else if (intern == "Image") {
            luaTable4 = new gs(luaTable, luaTable2, luaTable3);
        } else if (intern == "Image2") {
            luaTable4 = new gt(luaTable, luaTable2, luaTable3);
        } else if (intern == "TextBox") {
            luaTable4 = new hD(luaTable, luaTable2, luaTable3);
        } else if (intern == "TextBox2") {
            luaTable4 = new hJ(luaTable, luaTable2, luaTable3);
        } else if (intern == "TextArea") {
            luaTable4 = new ht(luaTable, luaTable2, luaTable3);
        } else if (intern == "TextArea2") {
            luaTable4 = new hy(luaTable, luaTable2, luaTable3);
        } else if (intern == "CheckBoxGroup") {
            luaTable4 = new fn(luaTable, luaTable2, luaTable3);
        } else if (intern == "RadioButtonGroup") {
            luaTable4 = new gU(luaTable, luaTable2, luaTable3);
        } else if (intern == "ScrollBox") {
            luaTable4 = new gZ(luaTable, luaTable2, luaTable3);
        } else if (intern == "ListBox") {
            luaTable4 = new gF(luaTable, luaTable2, luaTable3);
        } else if (intern == "ComboBox") {
            luaTable4 = new fp(luaTable, luaTable2, luaTable3);
        } else if (intern == "Line") {
            luaTable4 = new gC(luaTable, luaTable2, luaTable3);
        } else if (intern == "Alert") {
            luaTable4 = new eA(luaTable, luaTable3);
        } else if (intern == "Browser") {
            luaTable4 = new hP(luaTable, luaTable2, luaTable3);
        } else if (intern == "Map") {
            luaTable4 = new gH(luaTable, luaTable2, luaTable3);
        } else if (intern == "ImageGallery") {
            luaTable4 = new gu(luaTable, luaTable2, luaTable3);
        } else if (intern == "SegmentedUI2") {
            luaTable4 = bO.m4762a(luaTable, luaTable2, luaTable3, j);
        } else if (intern == "SegmentedUI") {
            luaTable4 = new hg(luaTable, luaTable2, luaTable3, j);
        } else if (intern == "Popup") {
            luaTable4 = new gL(luaTable, luaTable2, luaTable3);
        } else if (intern == "Calendar") {
            luaTable4 = new fg(luaTable, luaTable2, luaTable3);
        } else if (intern == "HorizontalImageStrip") {
            luaTable4 = new fT(luaTable, luaTable2, luaTable3);
        } else if (intern == "RichText") {
            luaTable4 = new gX(luaTable, luaTable2, luaTable3);
        } else if (intern == "HorizontalImageStrip2") {
            luaTable4 = new fX(luaTable, luaTable2, luaTable3);
        } else if (intern == "ImageGallery2") {
            luaTable4 = new gx(luaTable, luaTable2, luaTable3);
        } else if (intern == "Camera") {
            luaTable4 = new fi(luaTable, luaTable2, luaTable3);
        } else if (intern == "Link") {
            luaTable4 = new gD(luaTable, luaTable2, luaTable3);
        } else if (intern == "PickerView") {
            luaTable4 = new gJ(luaTable, luaTable2, luaTable3);
        } else if (intern == "Slider") {
            luaTable4 = new hd(luaTable, luaTable2, luaTable3);
        } else if (intern == "TabPane") {
            luaTable4 = new hq(luaTable, luaTable2, luaTable3);
        } else if (intern == "DataGrid") {
            luaTable4 = new fs(luaTable, luaTable2, luaTable3);
        } else if (intern == "Chart2D3D") {
            luaTable4 = new fm(luaTable, luaTable2, luaTable3);
        }
        if (luaTable4 != null) {
            luaTable4.setJSObject(j);
        }
        return luaTable4;
    }
}
