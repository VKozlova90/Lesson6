package com.company;

public abstract class Vehicle {

    protected int wheelCount;

    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    protected void  printInfo(){
        System.out.println("Информация о средстве передвижения");
    }





}
