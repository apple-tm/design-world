package com.example.design.behavior.memento;

/**
 * 备忘录模式
 *
 * 1.后悔药--在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 2.Windows 里的 ctri + z，IE 中的后退，数据库的事务管理
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        // 保存 1
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        // 保存 2
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
