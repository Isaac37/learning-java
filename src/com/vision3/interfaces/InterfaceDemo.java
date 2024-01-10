package com.vision3.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(10,1,20);
        System.out.println("Gear is " + mountainBike.getGear());
        System.out.println("Seat height is " + mountainBike.getSeatHeight());
        System.out.println("Bike Speed is " + mountainBike.getSpeed());


        mountainBike.speedUp(5);
        System.out.println("Bike speed after increasing speed " + mountainBike.getSpeed());

        mountainBike.applyBreaks(15);
        System.out.println("Bike speed after breaks applies is " + mountainBike.getSpeed());

    }
}
