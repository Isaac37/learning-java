package com.vision3.abstraction;

public class Rectangle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    void resize() {
        System.out.println("resizing a Rectangle");
    }
}
