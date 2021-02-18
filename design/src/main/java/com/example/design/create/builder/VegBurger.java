package com.example.design.create.builder;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "蔬菜汉堡";
    }
}
