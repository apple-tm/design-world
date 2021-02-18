package com.example.design.create.single;

/**
 * 饿汉式 线程安全（静态成员对象类加载就初始化，避免多线程问题）
 */
public class SingleObject3 {

    private static SingleObject3 instance = new SingleObject3();

    private SingleObject3() {}

    public static SingleObject3 getInstance() {
        return instance;
    }
}
