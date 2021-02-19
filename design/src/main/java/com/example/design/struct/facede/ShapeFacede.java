package com.example.design.struct.facede;

public class ShapeFacede {

    private Shape square;
    private Shape circle;

    public ShapeFacede() {
        square = new Square();
        circle = new Circle();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }
}
