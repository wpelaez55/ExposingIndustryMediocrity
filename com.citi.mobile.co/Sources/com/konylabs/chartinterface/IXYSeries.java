package com.konylabs.chartinterface;

public interface IXYSeries {
    void add(double d, double d2);

    void clear();

    int getItemCount();

    double getMaxX();

    double getMaxY();

    double getMinX();

    double getMinY();

    String getTitle();

    double getX(int i);

    double getY(int i);

    void remove(int i);

    void setTitle(String str);
}
