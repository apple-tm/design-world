package com.example.design.create.abstractfactory;

import com.example.design.create.factorypattern.Shape;

public class Client {

    public static void main(String[] args) {
        // 1.使用工厂生成器获取工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        // 2.使用具体工厂获取实例对象
        Shape circleShape = shapeFactory.getShape("circle");
        // 3.实例对象调用
        circleShape.draw();

    }
}
