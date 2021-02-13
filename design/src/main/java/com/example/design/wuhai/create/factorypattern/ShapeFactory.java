package com.example.design.wuhai.create.factorypattern;

public class ShapeFactory {
    public Shape getShape(String shapeStr){
        if (shapeStr.equals("O")){
            return new Circle();
        }else if (shapeStr.equals("口")){
            return new Square();
        }else if (shapeStr.equals("三角形")){
            return new Rectangle();
        }
        return null;
    }
}
