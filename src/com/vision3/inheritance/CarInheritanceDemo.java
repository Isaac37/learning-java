package com.vision3.inheritance;

public class CarInheritanceDemo {
    public static void main(String[] args) {
        HondaCar hondaCar = new HondaCar("Honda", 220,3, "German");
        System.out.println("The car model is " + hondaCar.model);
        System.out.println("The car speed " + hondaCar.speed);
        System.out.println("The car make is " + hondaCar.make);

        hondaCar.applyBreak(5);
        System.out.println("speed now is " + hondaCar.getSpeed());
    }
}
