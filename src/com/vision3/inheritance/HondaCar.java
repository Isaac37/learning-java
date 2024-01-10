package com.vision3.inheritance;

public class HondaCar extends Car {
    public String make;

    public HondaCar(String model, int speed, int gear, String make) {
        super(model, speed, gear);
        this.make = make;
    }
}
