package com.konylabs.chartinterface;

public interface IXYSeriesRenderer {
    int getColor();

    int getFillBelowLineColor();

    float getLineWidth();

    boolean isFillBelowLine();

    boolean isFillPoints();

    void setColor(int i);

    void setFillBelowLine(boolean z);

    void setFillBelowLineColor(int i);

    void setFillPoints(boolean z);

    void setLineWidth(float f);
}
