package com.example.design.create.prototype;

public class Square extends Shape {

    public Square() {
        type = "矩形";
    }

    @Override
    void draw() {
        System.out.println("画一个矩形");
    }
}
