package com.example.design.create.abstractfactory;

import com.example.design.create.factorypattern.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if ("shape".equalsIgnoreCase(factoryType)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        }
        return null;
    }
}
