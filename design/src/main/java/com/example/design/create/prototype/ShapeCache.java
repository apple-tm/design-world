package com.example.design.create.prototype;

import java.util.Hashtable;

public class ShapeCache {

    public static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String id) throws CloneNotSupportedException {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
         Circle circle = new Circle();
         circle.setId("1");
         shapeMap.put(circle.getId(), circle);

         Square square = new Square();
         square.setId("2");
         shapeMap.put(square.getId(), square);

         Rectangle rectangle = new Rectangle();
         rectangle.setId("3");
         shapeMap.put(rectangle.getId(), rectangle);
    }
}
