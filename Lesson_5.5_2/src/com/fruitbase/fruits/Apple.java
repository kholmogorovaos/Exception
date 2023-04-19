package com.fruitbase.fruits;

import java.math.BigDecimal;
import java.io.Serializable;

public class Apple extends Fruit implements Serializable {
    private static final long serialVersionUID = 1L;

    public Apple() {
        this.name = "Apple";
        weight = 6;
        price = BigDecimal.valueOf(80);
        this.freshness = Freshness.FRESH;
    }
}
