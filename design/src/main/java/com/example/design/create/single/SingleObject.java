package com.example.design.create.single;

/**
 * 懒汉式（延迟加载，第一次使用时初始化对象），线程不安全
 * 不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 */
public class SingleObject {

    // 1.类加载时初始化一个本类静态成员对象（懒汉式）
    private static SingleObject singleObject;
    // 2.私有化唯一无惨构造函数
    private SingleObject() {}
    // 3.单实例访问接口方法
    public static SingleObject getInstance() {
        if (singleObject == null) {
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    private Integer count = 0;

    public Integer count() {
        return ++this.count;
    }

    public static void main(String[] args) {
        SingleObject single = SingleObject.getInstance();
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(single.count());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
