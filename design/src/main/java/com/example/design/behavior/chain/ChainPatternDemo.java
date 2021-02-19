package com.example.design.behavior.chain;

/**
 * 责任链 （有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定）
 * 1.JS 中的事件冒泡
 * 2.在 JAVA WEB 中遇到很多应用。 chain
 */
public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger abstractLogger = getChainOfLoggers();
        abstractLogger.logMessage(AbstractLogger.ERROR, "This is an ");
    }

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
