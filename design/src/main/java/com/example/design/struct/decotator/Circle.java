package com.example.design.struct.decotator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆圈");
    }
}
