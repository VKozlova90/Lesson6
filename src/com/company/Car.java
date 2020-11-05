package com.company;

public class Car extends Vehicle{
    private int doorsCount;

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }


}
