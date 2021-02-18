package com.example.design.struct.bridge.extend;

/**
 * 父类存在非默认构造方法，子类也要有,并且需要调用 super 传递参数
 * 也就是初始化子类构造方法最先执行的代码必须是 super(...)先初始化父类构造器
 */
public class Child extends Parent {

    public Child(String name) {
        super(name);
    }
}
