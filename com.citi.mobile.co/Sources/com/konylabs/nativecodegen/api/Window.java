package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class Window {
    private static C0349R f1768a;
    private static HashMap f1769b;

    private Window() {
    }

    public static LuaTable createAlert(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create createAlert - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Alert")).intValue(), objArr)[0];
    }

    public static LuaTable createBox(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create createBox - " + objArr[0]);
        }
        Box.m1622a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Box")).intValue(), objArr)[0];
    }

    public static LuaTable createButton(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Button - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Button")).intValue(), objArr)[0];
    }

    public static LuaTable createCalendar(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Creating the calendar widget - " + objArr[0]);
        }
        Calendar.m1623a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Calendar")).intValue(), objArr)[0];
    }

    public static LuaTable createCamera(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create create Camera - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Camera")).intValue(), objArr)[0];
    }

    public static LuaTable createChart(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling create Chart - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Chart")).intValue(), objArr)[0];
    }

    public static LuaTable createChart2D3D(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling create Chart2D3D - " + objArr[0]);
        }
        Chart2D3D.m1624a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Chart2D3D")).intValue(), objArr)[0];
    }

    public static LuaTable createCheckboxGroup(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create CheckBoxGroup - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("CheckBoxGroup")).intValue(), objArr)[0];
    }

    public static LuaTable createComboBox(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create combobox - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("ComboBox")).intValue(), objArr)[0];
    }

    public static LuaTable createDataGrid(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling create DataGrid - " + objArr[0]);
        }
        Datagrid.m1625a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("DataGrid")).intValue(), objArr)[0];
    }

    public static LuaTable createForm(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Form - " + objArr[0]);
        }
        Form.m1626a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Form")).intValue(), objArr)[0];
    }

    public static LuaTable createGallery(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Image Strip - " + objArr[0]);
        }
        Gallery.m1627a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Gallery")).intValue(), objArr)[0];
    }

    public static LuaTable createHorizontalImageStrip(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Image Strip - " + objArr[0]);
        }
        ImageStrip.m1628a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("HorizontalImageStrip")).intValue(), objArr)[0];
    }

    public static LuaTable createImage(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create create Image - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Image")).intValue(), objArr)[0];
    }

    public static LuaTable createLabel(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create createLabel - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Label")).intValue(), objArr)[0];
    }

    public static LuaTable createLine(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Creating the line widget widget - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Line")).intValue(), objArr)[0];
    }

    public static LuaTable createLink(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Link - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Link")).intValue(), objArr)[0];
    }

    public static LuaTable createListBox(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create createList - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("ListBox")).intValue(), objArr)[0];
    }

    public static LuaTable createMap(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Map - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Map")).intValue(), objArr)[0];
    }

    public static LuaTable createPickerView(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling create PickerView - " + objArr[0]);
        }
        PickerView.m1629a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("PickerView")).intValue(), objArr)[0];
    }

    public static LuaTable createPopUp(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling create PopUp - " + objArr[0]);
        }
        Popup.m1630a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Popup")).intValue(), objArr)[0];
    }

    public static LuaTable createRadioGroup(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Radio Button Group - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("RadioButtonGroup")).intValue(), objArr)[0];
    }

    public static LuaTable createRichText(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Rich text - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("RichText")).intValue(), objArr)[0];
    }

    public static LuaTable createSegUI(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create Segmented UI - " + objArr[0]);
        }
        Segui.m1631a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("SegmentedUI")).intValue(), objArr)[0];
    }

    public static LuaTable createSkin(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create KonySkin - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Skin")).intValue(), objArr)[0];
    }

    public static LuaTable createSlider(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling create Slider - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Slider")).intValue(), objArr)[0];
    }

    public static LuaTable createTabWidget(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Creating the tabwidget container - " + objArr[0]);
        }
        Tabwidget.m1632a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("TabWidget")).intValue(), objArr)[0];
    }

    public static LuaTable createTextArea(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create TextArea - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("TextArea")).intValue(), objArr)[0];
    }

    public static LuaTable createTextField(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling Create createTextField - " + objArr[0]);
        }
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("TextField")).intValue(), objArr)[0];
    }

    public static LuaTable createWeb(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Calling create Web - " + objArr[0]);
        }
        WebWidget.m1633a();
        return (LuaTable) f1768a.execute(((Integer) f1769b.get("Web")).intValue(), objArr)[0];
    }

    public static void dismissLoadingScreen(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Dismissing loading screen - " + objArr[0]);
        }
        f1768a.execute(((Integer) f1769b.get("dismissloadingscreen")).intValue(), objArr);
    }

    public static void initialize() {
        if (f1768a == null) {
            Library c0349r = new C0349R(KonyMain.getActContext());
            f1768a = c0349r;
            f1769b = cr.m2202a(c0349r);
            Widget.m1634a();
        }
    }

    public static Double openMediaUrl(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Openign the url : " + objArr[0]);
        }
        return (Double) f1768a.execute(((Integer) f1769b.get("openmediaurl")).intValue(), objArr)[0];
    }

    public static Double openUrl(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "opening the url : " + objArr[0]);
        }
        return (Double) f1768a.execute(((Integer) f1769b.get("openurl")).intValue(), objArr)[0];
    }

    public static void showLoadingScreen(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowNative", "Showing loading screen - " + objArr[0]);
        }
        f1768a.execute(((Integer) f1769b.get("showloadingscreen")).intValue(), objArr);
    }
}
