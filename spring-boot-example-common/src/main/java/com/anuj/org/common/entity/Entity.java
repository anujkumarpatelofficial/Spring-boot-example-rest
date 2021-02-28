package com.anuj.org.common.entity;

import java.io.Serializable;

public interface Entity extends Serializable, Identifiable {
    boolean isPersisted();
}
