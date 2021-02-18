package com.example.design.create.prototype.clone;

/**
 * 克隆
 * 1.Object 方法
 * 2.克隆需要强制类型转换，检查型异常
 * 3.测试得出 entity、entity1内部属性对象相同，为浅克隆
 * 4.实体必须实现 Cloneable 接口，否则会报异常
 * 5.使用 IO 对象序列化实现深克隆，实体必须实现可序列化接口，测试entity、entity1内部属性对象不相同
 * 6.深克隆会破坏单例，其实防御方式很简单，单例类不要实现Cloneable接口即可。
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Entity entity = new Entity();
        Entity entity1 = (Entity) entity.clone();
        System.out.println();
    }
}
