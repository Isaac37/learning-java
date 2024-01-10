package com.vision3.abstraction;

public class Circle extends GraphicObject {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void resize() {
        System.out.println("resizing a circle");
    }
}
