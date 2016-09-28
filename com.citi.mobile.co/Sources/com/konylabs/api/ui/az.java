package com.konylabs.api.ui;

public enum az {
    TEXT,
    IMAGE;

    static {
        TEXT = new az("TEXT", 0);
        IMAGE = new az("IMAGE", 1);
        az[] azVarArr = new az[]{TEXT, IMAGE};
    }
}
