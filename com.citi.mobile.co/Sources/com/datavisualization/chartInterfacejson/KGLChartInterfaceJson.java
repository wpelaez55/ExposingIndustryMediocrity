package com.datavisualization.chartInterfacejson;

import android.content.Context;
import android.view.View;

public interface KGLChartInterfaceJson {
    void AddData(String str);

    void DeleteChartView();

    int GetChartHeight();

    void InitChartParams();

    void ReinitChartParamsWithObject();

    void RequestRender();

    void SetCallbackObject(KGLObserver kGLObserver);

    void SetData();

    void SetEvents(String str);

    void SetProperties();

    void SetWidgetID(String str);

    void cleanup();

    void contextLost();

    View getChartView(Context context);

    void pushData(String str);

    void pushEvent(String str);

    void pushProperties(String str);

    void setMetaData(String str);

    void setRenderToDirty();

    void stopRender();
}
