package com.example.design.create.abstractfactory;

import com.example.design.create.factorypattern.Shape;

/**
 * 工厂模式是需要 new 工厂的，而抽象工厂吧工厂的 new 都工厂化了，要先从抽象工厂获得工厂，然后工厂获得实例
 * 工厂有多个，使用抽象工厂类和工厂生成器实现对工厂的初始化封装
 *
 * mybatis 使用
 * 1.SqlSessionFactory 工厂
 * 2.openSession获得 SqlSession 对象
 */
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
