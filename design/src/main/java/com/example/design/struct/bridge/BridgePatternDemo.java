package com.example.design.struct.bridge;

/**
 * 桥接器
 * 1.行为接口作为属性传递到抽象实体中
 * 2.行为和实体分开发展，解耦
 * 3.抽象实体的行为在子类中使用行为接口封装行为
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
