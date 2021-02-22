package com.example.design.behavior.observer;

public abstract class Observer {
    public abstract void update();
    protected Subject subject;
}
