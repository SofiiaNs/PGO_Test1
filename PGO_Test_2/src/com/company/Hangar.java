package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hangar {

    static int HANGARMAXSPACE = 69;

    public List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    boolean allowStore;


    public Hangar() {
    }

            public void insertVehicle(Vehicle vehicle) throws CapacityExeption {
            checkCapacity();
            if (allowStore) {
            System.out.println("there is a space");
            vehicleList.add(vehicle);
        }   else {
            System.out.println("there is no space");
        }
    }

            private void checkCapacity() throws CapacityExeption {
            if (HANGARMAXSPACE > vehicleList.size()) {
            allowStore = true;
        }   else {
            allowStore = false;
            throw new CapacityExeption();
        }
    }

}