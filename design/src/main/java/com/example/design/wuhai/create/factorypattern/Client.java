package com.example.design.wuhai.create.factorypattern;

import sun.security.provider.SHA;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("O");
        shape1.draw();
        ShapeFactory shapeFactory1 = new ShapeFactory();
        Shape shape2 = shapeFactory1.getShape("三角形");
        shape2.draw();

    }
}
