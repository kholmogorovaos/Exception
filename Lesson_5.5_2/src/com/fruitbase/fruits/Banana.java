package com.fruitbase.fruits;

import java.math.BigDecimal;
import java.io.Serializable;

public class Banana extends Fruit implements Serializable {
    private static final long serialVersionUID = 1L;

    public Banana() {
        this.name = "Banana";
        weight = 11.4;
        price = BigDecimal.valueOf(26.35);
        this.freshness = Freshness.OVERRIPED;
    }
}
