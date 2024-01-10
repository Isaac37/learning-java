package com.vision3.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicObject rectangle = new Rectangle();
        rectangle.resize();
        rectangle.draw();
    }
}
