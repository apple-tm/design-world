package com.example.design.create.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "三角形";
    }

    @Override
    void draw() {
        System.out.println("画一个三角形");
    }
}
