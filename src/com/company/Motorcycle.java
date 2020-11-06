package com.company;

public class Motorcycle extends Vehicle{

    private int maxSpeed;
    private static final String VENILKE_TYPE = "Мотоцикл";

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство:" + VENILKE_TYPE + "Количество колёс:" + wheelCount
                + "Макс скорость:" + maxSpeed);
    }

}