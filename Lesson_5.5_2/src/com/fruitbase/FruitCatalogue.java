package com.fruitbase;

import com.fruitbase.fruits.*;

import java.io.Serializable;
import java.util.Arrays;

public class FruitCatalogue implements Serializable {
    private static final long serialVersionUID = 1L;
    Fruit[] fruit = {new Apple(), new Banana(), new Orange(), new Pineapple()};

    FruitCatalogue() {
    }

    public Fruit findFruit(String fruitName) {
        for (Fruit f : fruit) {
            if (f.getName().equals(fruitName)) {
                return f;
            }
        }
        return null;
    }

    //для проверки значений сериализации и десериализации
    @Override
    public String toString() {
        return "FruitCatalogue{" +
                "fruit=" + Arrays.toString(fruit) +
                '}';
    }
}



