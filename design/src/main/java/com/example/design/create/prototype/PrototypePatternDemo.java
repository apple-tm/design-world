package com.example.design.create.prototype;

/**
 * prototype
 * 1.类初始化消耗资源较多；
 * 2.使用new 生成一个对象需要非常繁琐的过程（数据准备访问权限等）
 * 3.构造函数比较复杂；
 * 4.在循环体中产生大量对象；
 * 5.在spring中用到的原型模式有：scope="prototype" ，还有常用的JSON.parseObject()也是一种原型模式
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape shape1 = (Shape)  ShapeCache.getShape("1");
        Shape shape2 = (Shape)  ShapeCache.getShape("1");

        System.out.println(shape1.type);

        System.out.println(shape1);
        System.out.println(shape2);
    }
}
