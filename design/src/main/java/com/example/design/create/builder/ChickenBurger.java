package com.example.design.create.builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "鸡肉汉堡";
    }
}
