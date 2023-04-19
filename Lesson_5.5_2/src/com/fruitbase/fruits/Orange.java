package com.fruitbase.fruits;

import java.math.BigDecimal;
import java.io.Serializable;

public class Orange extends Fruit implements Serializable {
    private static final long serialVersionUID = 1L;

    public Orange() {
        this.name = "Orange";
        weight = 15.5;
        price = BigDecimal.valueOf(78.65);
        this.freshness = Freshness.FRESH;
    }

}
