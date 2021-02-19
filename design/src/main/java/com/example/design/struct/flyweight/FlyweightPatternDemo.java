package com.example.design.struct.flyweight;

/**
 * 享元模式
 * 1.重用现有的同类对象，如果未找到匹配的对象，则创建新对象（延迟加载）。
 * 2.共享技术有效地支持大量细粒度的对象。
 * 3.用 HashMap 存储这些对象。
 * 4.缓冲池的场景
 * 5.类必须有一个工厂对象加以控制
 */
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        System.out.println(ShapeFactory.circleMap.size());
    }

    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
