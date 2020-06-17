package com.company;

public class Dron extends Vehicle implements Flying_and_stopping {
    boolean Driver;
    boolean Flyer;
    boolean Stop;
    int CoordinateX;
    int CoordinateY;


        public void drive() {
        Driver = true;
        Flyer = false;
        Stop = false;
    }

        public void stopping() {
        Driver = false;
        Flyer = false;
        Stop = true;
    }
        public void fly() {
        Driver = false;
        Stop = false;
        Flyer = true;
    }

    public void displayInfo() {
        if (Flyer == true) {
            System.out.println(" flying");
        } else if (Driver == true) {
            System.out.println(" driving");
        } else {
            System.out.println("nothing");
        }
    }

    public void setTarget(int CoordinateX, int CoordinateY) throws TargetExeption {
        if (CoordinateX <= 0 && CoordinateY <= 0) {
            throw new TargetExeption();
        } else {
            this.CoordinateX = CoordinateX;
            this.CoordinateY = CoordinateY;
        }
    }

    public void setDrive(boolean drive) {
        this.Driver = drive;
    }

    public void setFly(boolean fly) {
        this.Flyer = fly;
    }

    public void setStop(boolean stop) {
        this.Stop = stop;
    }


    @Override
    public void Starting_and_stopping_the_engine() {

    }
}