package com.konylabs.chartinterface;

public interface IXYMultiSeriesDataSet {
    void addSeries(IXYSeries iXYSeries);

    IXYSeries[] getSeries();

    IXYSeries getSeriesAt(int i);

    int getSeriesCount();

    void removeSeries(int i);

    void removeSeries(IXYSeries iXYSeries);
}
