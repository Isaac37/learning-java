package com.vision3.interfaces;

 class MountainBike implements  Bicycle{
     private  int seatHeight;
     private  int gear;
     private  int speed;

     public MountainBike(int seatHeight, int gear, int speed) {
         this.seatHeight = seatHeight;
         this.gear = gear;
         this.speed = speed;
     }

     @Override
     public void applyBreaks(int decrement) {
         speed = speed - decrement;
     }

     @Override
     public void speedUp(int increment) {
         speed = speed + increment;
     }

     public int getSeatHeight() {
         return seatHeight;
     }

     public void setSeatHeight(int seatHeight) {
         this.seatHeight = seatHeight;
     }

     public int getGear() {
         return gear;
     }

     public void setGear(int gear) {
         this.gear = gear;
     }

     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }
 }
