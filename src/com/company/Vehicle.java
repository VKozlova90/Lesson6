package com.company;

public abstract class Vehicle {

    protected int wheelCount;

    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    protected String printInfo(){
        System.out.println();

    }

    public abstract String VehicleName();

}
