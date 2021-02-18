package com.example.design.create.single;

/**
 * 懒汉式 线程安全（效率很低，99% 情况下不需要同步。）
 * 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
public class SingleObject2 {

    private static SingleObject2 instance;

    private SingleObject2() {}

    private static synchronized SingleObject2 getInstance() {
        if (instance == null) {
            instance = new SingleObject2();
        }
        return instance;
    }
}
