package com.example.design.create.single;

/**
 * double-checked locking
 * 1.volatile
 * 2.sychronized
 * 3.推荐枚举
 */
public class SingleObject4 {

    private volatile static SingleObject4 instance;

    private SingleObject4() {}

    public static SingleObject4 getInstance() {
        // first checked
        if (instance == null) {
            synchronized (SingleObject4.class) {
                // second checked 避免加锁的过程中其他线程创建了实例
                if (instance == null) {
                    instance = new SingleObject4();
                }
            }
        }

        return instance;
    }
}
