package com.example.design.behavior.template;

/**
 * 模板模式
 *
 * 1.spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，比如开启事务、获取 Session、关闭 Session 等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。
 * 2. 封装不变部分，扩展可变部分。
 * 3.有多个子类共有的方法，且逻辑相同。 例如一个类的生命周期各自定义不同方法，具体子类各自实现
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
