package com.company;

public class Train extends Vehicle implements Driving_and_stopping {


        @Override
        public void drive() {
        System.out.println(" driving");
    }
        @Override
        public void stopping() {
        System.out.println("not driving ");
    }
        @Override
        public void Starting_and_stopping_the_engine() {

    }
}