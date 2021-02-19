package com.example.design.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    public final static Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }

        return circle;
    }
}
