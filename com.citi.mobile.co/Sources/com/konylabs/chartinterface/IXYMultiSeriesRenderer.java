package com.konylabs.chartinterface;

public interface IXYMultiSeriesRenderer {
    void addSeriesRenderer(IXYSeriesRenderer iXYSeriesRenderer);

    void addXTextLabel(double d, String str);

    void addYTextLabel(double d, String str);

    int getAxesColor();

    float getAxisTitleTextSize();

    int getBackgroundColor();

    String getChartTitle();

    float getChartTitleTextSize();

    float getChartValuesTextSize();

    int getLabelsColor();

    float getLabelsTextSize();

    float getLegendTextSize();

    IXYSeriesRenderer getSeriesRendererAt(int i);

    int getSeriesRendererCount();

    IXYSeriesRenderer[] getSeriesRenderers();

    String getTextTypefaceName();

    int getTextTypefaceStyle();

    int getXAxisColor();

    int getXAxisLineWidth();

    double getXAxisMax();

    double getXAxisMin();

    int getXGridLineColor();

    int getXGridLineWidth();

    int getXLabels();

    int getXMinorTickColor();

    int getXMinorTickInterval();

    int getXMinorTickLength();

    int getXPlotLines();

    int getXPlotLinesAboveColor();

    int getXPlotLinesBelowColor();

    String getXTextLabel(Double d);

    Double[] getXTextLabelLocations();

    int getXTickInterval();

    int getXTickLength();

    String getXTitle();

    int getYAxisColor();

    int getYAxisLineWidth();

    double getYAxisMax();

    double getYAxisMin();

    int getYGridLineColor();

    int getYGridLineWidth();

    int getYLabels();

    int getYMinorTickColor();

    int getYMinorTickInterval();

    int getYMinorTickLength();

    int getYPlotLines();

    int getYPlotLinesAboveColor();

    int getYPlotLinesBelowColor();

    String getYTextLabel(Double d);

    Double[] getYTextLabelLocations();

    int getYTickInterval();

    int getYTickLength();

    String getYTitle();

    boolean isAntialiasing();

    boolean isApplyBackgroundColor();

    boolean isDisplayChartValues();

    boolean isMaxXSet();

    boolean isMaxYSet();

    boolean isMinXSet();

    boolean isMinYSet();

    boolean isShowAxes();

    boolean isShowGrid();

    boolean isShowLabels();

    boolean isShowLegend();

    void removeSeriesRenderer(IXYSeriesRenderer iXYSeriesRenderer);

    void setAntialiasing(boolean z);

    void setApplyBackgroundColor(boolean z);

    void setAxesColor(int i);

    void setAxisTitleTextSize(float f);

    void setBackgroundColor(int i);

    void setChartTitle(String str);

    void setChartTitleTextSize(float f);

    void setChartValuesTextSize(float f);

    void setDisplayChartValues(boolean z);

    void setLabelsColor(int i);

    void setLabelsTextSize(float f);

    void setLegendTextSize(float f);

    void setShowAxes(boolean z);

    void setShowGrid(boolean z);

    void setShowLabels(boolean z);

    void setShowLegend(boolean z);

    void setTextTypeface(String str, int i);

    void setXAxisColor(int i);

    void setXAxisLineWidth(int i);

    void setXAxisMax(double d);

    void setXAxisMin(double d);

    void setXGridLineColor(int i);

    void setXGridLineWidth(int i);

    void setXLabels(int i);

    void setXMinorTickColor(int i);

    void setXMinorTickInterval(int i);

    void setXMinorTickLength(int i);

    void setXPlotLines(int i);

    void setXPlotLinesAboveColor(int i);

    void setXPlotLinesBelowColor(int i);

    void setXTickInterval(int i);

    void setXTickLength(int i);

    void setXTitle(String str);

    void setYAxisColor(int i);

    void setYAxisLineWidth(int i);

    void setYAxisMax(double d);

    void setYAxisMin(double d);

    void setYGridLineColor(int i);

    void setYGridLineWidth(int i);

    void setYLabels(int i);

    void setYMinorTickColor(int i);

    void setYMinorTickInterval(int i);

    void setYMinorTickLength(int i);

    void setYPlotLines(int i);

    void setYPlotLinesAboveColor(int i);

    void setYPlotLinesBelowColor(int i);

    void setYTickInterval(int i);

    void setYTickLength(int i);

    void setYTitle(String str);
}
