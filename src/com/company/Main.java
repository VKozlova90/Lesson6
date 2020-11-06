package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[4];
        vehicle[0] = new Car(4,5);
        vehicle[1] = new Car(4,3);
        vehicle[2] = new Motorcycle(2,180);
        vehicle[3] = new Motorcycle(2,230);

        for (Vehicle Vehicle:vehicle){

            Vehicle.printInfo();
            }
        }

    }

