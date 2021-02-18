package com.example.design.create.builder;

public class Pepsi extends ColdDrink
{
    public String name() {
        return "百世可乐";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}
