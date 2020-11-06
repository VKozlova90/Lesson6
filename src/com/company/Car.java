package com.company;

public class Car extends Vehicle{
    private int doorsCount;
    private static final String VENILKE_TYPE = "Машина";

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    protected String printInfo() {
        return "Транспортное средство:" + VENILKE_TYPE + "- Количество дверей:" + doorsCount + "- Количество колёс:" +wheelCount;
    }


}


