package com.example.design.struct.decotator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
//        circle.draw();
    }
}
