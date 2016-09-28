package com.konylabs.api.ui;

import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.chartinterface.IXYMultiSeriesDataSet;
import com.konylabs.chartinterface.IXYMultiSeriesRenderer;
import com.konylabs.chartinterface.IXYSeries;
import com.konylabs.chartinterface.IXYSeriesRenderer;
import com.konylabs.chartinterface.KonyChartInterface;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public final class fl extends LuaWidget {
    private C0193W f3911a;
    private Object[] f3912b;
    private boolean f3913c;
    private IXYMultiSeriesDataSet f3914d;
    private IXYMultiSeriesRenderer f3915e;
    private KonyChartInterface f3916f;

    public fl(Object[] objArr) {
        super(10, 2, false);
        this.f3911a = null;
        this.f3913c = true;
        this.f3912b = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable("focusskin", objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable("dataseriesparams", objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[5]);
        }
        if (objArr.length > 6 && objArr[6] != null && objArr[6] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[6]);
        }
    }

    protected final void m4331a(Object obj, Object obj2) {
        String intern = ((String) obj).intern();
        if (!(intern != "xaxis" || obj2 == null || obj2 == LuaNil.nil)) {
            super.setTable(intern, obj2);
        }
        if (intern == "yaxis" && obj2 != null && obj2 != LuaNil.nil) {
            super.setTable(intern, obj2);
        }
    }

    public final void cleanup() {
        if (this.f3911a != null) {
            C0193W c0193w = this.f3911a;
            C0193W.m315c();
        }
        this.f3911a = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget flVar = new fl(this.f3912b);
        flVar.setVisibility(this.f3913c);
        return flVar;
    }

    public final LuaWidget getChildWidget(String str) {
        return null;
    }

    public final ArrayList getChildWidgets() {
        return null;
    }

    public final String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public final LuaWidget getParent() {
        return this.I;
    }

    public final Hashtable getProperties() {
        return null;
    }

    public final Object getProperty(String str) {
        return null;
    }

    public final String getType() {
        return "Chart";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            LuaTable luaTable;
            int intValue;
            this.f3911a = new C0193W(KonyMain.getActContext());
            LuaNil table = super.getTable(ATTR_WIDGET_SKIN);
            if (!(table == LuaNil.nil || this.E != KONY_WIDGET_RESTORE || table == null)) {
                table = LuaNil.nil;
            }
            super.getTable("focusskin");
            table = LuaNil.nil;
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f3913c = ((Boolean) table).booleanValue();
                this.f3911a.m318a(m3942a(this.f3913c));
            }
            if (super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT) != LuaNil.nil) {
                super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            }
            table = super.getTable("dataseriesparams");
            if (table != LuaNil.nil) {
                this.f3916f = this.f3911a.m325d();
                this.f3914d = this.f3916f.getXYMultiSeriesDataSet();
                this.f3915e = this.f3916f.getXYMultiSeriesRenderer();
                Vector vector = ((LuaTable) table).list;
                for (int i = 0; i < vector.size(); i++) {
                    luaTable = (LuaTable) vector.elementAt(i);
                    IXYSeriesRenderer xYSeriesRenderer = this.f3916f.getXYSeriesRenderer();
                    if (luaTable.getTable("type") != LuaNil.nil) {
                        intValue = ((Double) luaTable.getTable("type")).intValue();
                        this.f3911a.m323b(intValue);
                        if (intValue == 1) {
                            xYSeriesRenderer.setFillBelowLine(false);
                        } else if (intValue == 2) {
                            xYSeriesRenderer.setFillBelowLine(true);
                        }
                    }
                    if (luaTable.getTable("color") != LuaNil.nil) {
                        intValue = hp.m3351b(luaTable.getTable("color").toString());
                        xYSeriesRenderer.setColor(intValue);
                        xYSeriesRenderer.setFillBelowLineColor(intValue);
                        xYSeriesRenderer.setFillPoints(true);
                    }
                    if (luaTable.getTable("data") != LuaNil.nil) {
                        luaTable = (LuaTable) luaTable.getTable("data");
                        IXYSeries xYSeriesDataSet = this.f3916f.getXYSeriesDataSet();
                        for (int i2 = 0; i2 < luaTable.list.size(); i2++) {
                            Object elementAt = luaTable.list.elementAt(i2);
                            if (elementAt instanceof LuaTable) {
                                LuaTable luaTable2 = (LuaTable) elementAt;
                                xYSeriesDataSet.add(((Double) luaTable2.list.elementAt(0)).doubleValue(), ((Double) luaTable2.list.elementAt(1)).doubleValue());
                            } else {
                                xYSeriesDataSet.add((double) i2, (double) ((Double) luaTable.list.elementAt(i2)).intValue());
                            }
                        }
                        xYSeriesDataSet.setTitle("Series" + (i + 1));
                        this.f3914d.addSeries(xYSeriesDataSet);
                    }
                    this.f3915e.addSeriesRenderer(xYSeriesRenderer);
                }
            }
            table = super.getTable("xaxis");
            if (table != LuaNil.nil) {
                luaTable = (LuaTable) table;
                if (luaTable.getTable("gridlinecolor") != LuaNil.nil) {
                    this.f3915e.setShowGrid(true);
                    this.f3915e.setXGridLineColor(hp.m3351b(luaTable.getTable("gridlinecolor").toString()));
                }
                if (luaTable.getTable("gridlinewidth") != LuaNil.nil) {
                    this.f3915e.setXGridLineWidth(((Double) luaTable.getTable("gridlinewidth")).intValue());
                }
                if (luaTable.getTable("linecolor") != LuaNil.nil) {
                    this.f3915e.setXAxisColor(hp.m3351b(luaTable.getTable("linecolor").toString()));
                }
                if (luaTable.getTable("linewidth") != LuaNil.nil) {
                    this.f3915e.setXAxisLineWidth(((Double) luaTable.getTable("linewidth")).intValue());
                }
                if (luaTable.getTable("min") != LuaNil.nil) {
                    this.f3915e.setXAxisMin((double) ((Double) luaTable.getTable("min")).intValue());
                }
                if (luaTable.getTable("max") != LuaNil.nil) {
                    this.f3915e.setXAxisMax((double) ((Double) luaTable.getTable("max")).intValue());
                }
                if (luaTable.getTable("plotlines") != LuaNil.nil) {
                    this.f3915e.setXPlotLines(((Double) luaTable.getTable("plotlines")).intValue());
                }
                if (luaTable.getTable("plotlinesabovecolor") != LuaNil.nil) {
                    this.f3915e.setXPlotLinesAboveColor(hp.m3351b(luaTable.getTable("plotlinesabovecolor").toString()));
                }
                if (luaTable.getTable("plotlinesbelowcolor") != LuaNil.nil) {
                    this.f3915e.setXPlotLinesBelowColor(hp.m3351b(luaTable.getTable("plotlinesbelowcolor").toString()));
                }
                if (luaTable.getTable("ticklength") != LuaNil.nil) {
                    this.f3915e.setXTickLength(((Double) luaTable.getTable("ticklength")).intValue());
                }
                if (luaTable.getTable("tickinterval") != LuaNil.nil) {
                    this.f3915e.setXTickInterval(((Double) luaTable.getTable("tickinterval")).intValue());
                }
                if (luaTable.getTable("minortickcolor") != LuaNil.nil) {
                    this.f3915e.setXMinorTickColor(hp.m3351b(luaTable.getTable("minortickcolor").toString()));
                }
                if (luaTable.getTable("minorticklength") != LuaNil.nil) {
                    this.f3915e.setXMinorTickLength(((Double) luaTable.getTable("minorticklength")).intValue());
                }
                if (luaTable.getTable("minortickinterval") != LuaNil.nil) {
                    this.f3915e.setXMinorTickInterval(((Double) luaTable.getTable("minortickinterval")).intValue());
                }
                if (luaTable.getTable("title") != LuaNil.nil) {
                    this.f3915e.setXTitle(luaTable.getTable("title").toString());
                }
                if (luaTable.getTable("categories") != LuaNil.nil) {
                    luaTable = (LuaTable) luaTable.getTable("categories");
                    for (intValue = 0; intValue < luaTable.list.size(); intValue++) {
                        this.f3915e.addXTextLabel((double) intValue, luaTable.list.get(intValue).toString());
                    }
                }
            }
            table = super.getTable("yaxis");
            if (table != LuaNil.nil) {
                luaTable = (LuaTable) table;
                if (luaTable.getTable("gridlinecolor") != LuaNil.nil) {
                    this.f3915e.setYGridLineColor(hp.m3351b(luaTable.getTable("gridlinecolor").toString()));
                    this.f3915e.setDisplayChartValues(true);
                    this.f3915e.setShowGrid(true);
                }
                if (luaTable.getTable("gridlinewidth") != LuaNil.nil) {
                    this.f3915e.setYGridLineWidth(((Double) luaTable.getTable("gridlinewidth")).intValue());
                }
                if (luaTable.getTable("linecolor") != LuaNil.nil) {
                    this.f3915e.setYAxisColor(hp.m3351b(luaTable.getTable("linecolor").toString()));
                }
                if (luaTable.getTable("linewidth") != LuaNil.nil) {
                    this.f3915e.setYAxisLineWidth(((Double) luaTable.getTable("linewidth")).intValue());
                }
                if (luaTable.getTable("min") != LuaNil.nil) {
                    this.f3915e.setYAxisMin((double) ((Double) luaTable.getTable("min")).intValue());
                }
                if (luaTable.getTable("max") != LuaNil.nil) {
                    this.f3915e.setYAxisMax((double) ((Double) luaTable.getTable("max")).intValue());
                }
                if (luaTable.getTable("plotlines") != LuaNil.nil) {
                    this.f3915e.setYPlotLines(((Double) luaTable.getTable("plotlines")).intValue());
                }
                if (luaTable.getTable("plotlinesabovecolor") != LuaNil.nil) {
                    this.f3915e.setYPlotLinesAboveColor(hp.m3351b(luaTable.getTable("plotlinesabovecolor").toString()));
                }
                if (luaTable.getTable("plotlinesbelowcolor") != LuaNil.nil) {
                    this.f3915e.setYPlotLinesBelowColor(hp.m3351b(luaTable.getTable("plotlinesbelowcolor").toString()));
                }
                if (luaTable.getTable("ticklength") != LuaNil.nil) {
                    this.f3915e.setYTickLength(((Double) luaTable.getTable("ticklength")).intValue());
                }
                if (luaTable.getTable("tickinterval") != LuaNil.nil) {
                    this.f3915e.setYTickInterval(((Double) luaTable.getTable("tickinterval")).intValue());
                }
                if (luaTable.getTable("minortickcolor") != LuaNil.nil) {
                    this.f3915e.setYMinorTickColor(hp.m3351b(luaTable.getTable("minortickcolor").toString()));
                }
                if (luaTable.getTable("minorticklength") != LuaNil.nil) {
                    this.f3915e.setYMinorTickLength(((Double) luaTable.getTable("minorticklength")).intValue());
                }
                if (luaTable.getTable("minortickinterval") != LuaNil.nil) {
                    this.f3915e.setYMinorTickInterval(((Double) luaTable.getTable("minortickinterval")).intValue());
                }
                if (luaTable.getTable("title") != LuaNil.nil) {
                    this.f3915e.setYTitle(luaTable.getTable("title").toString());
                }
                if (luaTable.getTable("categories") != LuaNil.nil) {
                    luaTable = (LuaTable) luaTable.getTable("categories");
                    for (intValue = 0; intValue < luaTable.list.size(); intValue++) {
                        this.f3915e.addYTextLabel((double) intValue, luaTable.list.get(intValue).toString());
                    }
                }
            }
            this.f3911a.m319a(this.f3914d);
            this.f3911a.m320a(this.f3915e);
            LuaNil table2 = super.getTable(ATTR_WIDGET_PLATFORMSPECIFIC);
            if (table2 != LuaNil.nil) {
                String[] split;
                if (((LuaTable) table2).getTable("margin") != LuaNil.nil) {
                    split = ((LuaTable) table2).getTable("margin").toString().split(",");
                    this.f3911a.m321a(new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3])});
                }
                if (((LuaTable) table2).getTable("padding") != LuaNil.nil) {
                    split = ((LuaTable) table2).getTable("padding").toString().split(",");
                    this.f3911a.m324b(new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3])});
                }
            }
            this.E = KONY_WIDGET_RESTORE;
        }
        this.f3911a.m317a();
        return this.f3911a.m322b();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3911a.setFocusableInTouchMode(true);
            this.f3911a.requestFocus();
            this.f3911a.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        m3950d(obj, obj2);
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        this.f3913c = z;
        this.f3911a.m318a(m3942a(z));
    }

    public final void setWeight() {
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaChart: " + getTable(ATTR_WIDGET_ID);
    }
}
