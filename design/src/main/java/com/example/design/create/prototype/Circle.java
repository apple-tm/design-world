package com.example.design.create.prototype;

public class Circle extends Shape {

    public Circle() {
        type = "圆形";
    }

    @Override
    void draw() {
        System.out.println("画一个圆形");
    }
}
