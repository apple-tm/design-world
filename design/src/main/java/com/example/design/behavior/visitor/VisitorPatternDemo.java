package com.example.design.behavior.visitor;

/**
 * 访问者
 *
 * 1.将数据结构与数据操作分离。新增了一个组件，调用逻辑不变
 * 2.对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
