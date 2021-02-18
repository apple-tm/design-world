package com.example.design.create.builder;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "可口可乐";
    }
}
