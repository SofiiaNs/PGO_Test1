package com.company;

public abstract class Vehicle implements Starting_and_stopping_the_engine, Adding_items {
    double Capacity;
    double LoadingSpace;
    double Cargo;
    boolean Engine = false;


    public void start() throws StartEngineExeption {
        if (Engine == true) {

            throw new StartEngineExeption();

        } else {
            Engine = true;
            System.out.println("engine is on");
        }
    }

    @Override
    public void stop() {
        boolean Engine = false;
        System.out.println("engine is off");
    }

    @Override
    public void load() throws Too_much_cargo_exeption {
        if (LoadingSpace < Cargo) {
            throw new Too_much_cargo_exeption();
        } else {
            LoadingSpace = LoadingSpace + Cargo;
        }

    }

    public boolean isEngine() {
        return Engine;
    }
}