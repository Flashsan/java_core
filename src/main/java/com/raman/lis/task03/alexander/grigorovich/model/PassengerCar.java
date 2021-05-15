package com.raman.lis.task03.alexander.grigorovich.model;


import java.util.ArrayList;

public class PassengerCar extends Car {

    public PassengerCar() {

    }

    public PassengerCar(String brand, String color, String model, int yearOfProduction,
                        int diameterOfWheels, double volumeOfEngine) {

        super(brand, color, model, yearOfProduction, diameterOfWheels,
                volumeOfEngine);
    }

    public PassengerCar(String brand, String color, String model, int yearOfProduction,
                        int diameterOfWheels, double volumeOfEngine,
                        ArrayList<String> additionalOptions) {

        super(brand, color, model, yearOfProduction, diameterOfWheels,
                volumeOfEngine, additionalOptions);
    }


    @Override
    public void info() {
        super.info();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
