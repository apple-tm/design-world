package com.example.design.behavior.strategy;

/**
 * 策略模式
 *
 * 1.定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 2.使用 if...else 所带来的复杂和难以维护。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

    }
}
