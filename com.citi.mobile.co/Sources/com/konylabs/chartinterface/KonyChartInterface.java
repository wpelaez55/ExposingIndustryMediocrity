package com.konylabs.chartinterface;

import android.content.Context;
import android.view.View;

public interface KonyChartInterface {
    void draw();

    View getChartView(Context context, IXYMultiSeriesDataSet iXYMultiSeriesDataSet, IXYMultiSeriesRenderer iXYMultiSeriesRenderer, int i);

    IXYMultiSeriesDataSet getXYMultiSeriesDataSet();

    IXYMultiSeriesRenderer getXYMultiSeriesRenderer();

    IXYSeries getXYSeriesDataSet();

    IXYSeriesRenderer getXYSeriesRenderer();
}
