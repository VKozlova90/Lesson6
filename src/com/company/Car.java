package com.company;

public class Car extends Vehicle implements Costable{
    private int doorsCount;
    private static final String VENILKE_TYPE = "Машина";

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство:" + VENILKE_TYPE + "- Количество дверей:" + doorsCount +
                  "- Количество колёс:" +wheelCount + " " + getCost());
    }

   @Override
    public int getCost(int Cost) {
        return Cost = 100;
    }

}


