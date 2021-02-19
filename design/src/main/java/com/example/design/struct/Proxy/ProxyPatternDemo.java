package com.example.design.struct.Proxy;

/**
 * 代理模式  （对代理对象进行控制、装饰器是增强）
 *
 * 1.创建具有现有对象的对象，以便向外界提供功能接口。
 * 2.为其他对象提供一种代理以控制对这个对象的访问。
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        // 不用代理，直接执行
        Image image = new RealImage("mp3");
        image.display();

        System.out.println("-----------------");

        Image image2 = new ProxyImage("mp3");
        image2.display();
        System.out.println("");
        System.out.println("第二次播放无需加载直接播放");
        image2.display();
    }
}
