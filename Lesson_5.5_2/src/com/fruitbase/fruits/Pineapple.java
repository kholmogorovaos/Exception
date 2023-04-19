package com.fruitbase.fruits;

import java.math.BigDecimal;
import java.io.Serializable;

public class Pineapple extends Fruit implements Serializable {
    private static final long serialVersionUID = 1L;

    public Pineapple() {
        this.name = "Pineapple";
        weight = 3;
        this.price = BigDecimal.valueOf(102.45);
        this.freshness = Freshness.SPOILED;
    }
}
