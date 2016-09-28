package com.konylabs.libintf;

import java.io.Serializable;

public interface Library extends Serializable {
    Object[] execute(int i, Object[] objArr);

    String[] getMethods();

    String getNameSpace();
}
