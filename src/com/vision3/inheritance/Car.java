package com.vision3.inheritance;

public class Car {
    protected String model;
    protected int speed;
    protected int gear;

    public Car(String model, int speed, int gear) {
        this.model = model;
        this.speed = speed;
        this.gear = gear;
    }

    public void speedUp(int increment) {
        speed += increment;
     }

     public void applyBreak(int decrement){
        speed = speed - decrement;
     }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
