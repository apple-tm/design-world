package com.example.design.behavior.mediator;

/**
 * 中介者模式
 *
 * 1.MVC c 作为 MV 的中间人，解耦
 * 2.降低了类的复杂度，将一对多转化成了一对一
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
