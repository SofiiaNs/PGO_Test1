package com.company;

public class Plane extends Vehicle implements Flying {
    double HighSpeed;
    boolean Flying;


    @Override
    public void flying() {
        if (isEngine()) {
            boolean flying = true;
        } else {
            boolean flying = false;
        }
    }


    public void checkFlying() {
        if (Flying) {
            System.out.println("flying with max speed: " + HighSpeed);
        } else {
            System.out.println("is not flying  ");
        }
    }

    @Override
    public void Starting_and_stopping_the_engine() {

    }

}