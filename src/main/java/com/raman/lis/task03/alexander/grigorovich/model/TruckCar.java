package com.raman.lis.task03.alexander.grigorovich.model;

import java.util.ArrayList;

public class TruckCar extends Car {

    private int liftingCapacity;

    public TruckCar() {

    }

    public TruckCar(String brand,String color, String model, int yearOfProduction,
                    int diameterOfWheels, double volumeOfEngine, int liftingCapacity) {

        super(brand,color, model, yearOfProduction,
                diameterOfWheels, volumeOfEngine);
        this.liftingCapacity = liftingCapacity;
    }

    public TruckCar(String brand,String color, String model, int yearOfProduction,
                    int diameterOfWheels, double volumeOfEngine, int liftingCapacity,
                    ArrayList<String> additionalOptions) {

        super(brand,color, model, yearOfProduction, diameterOfWheels,
                volumeOfEngine, additionalOptions);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity() {
        this.liftingCapacity = liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("liftingCapacity = " + liftingCapacity);
    }

    @Override
    public String toString() {
        return "TruckCar{" +
                super.toString() +
                "liftingCapacity=" + liftingCapacity +
                '}';
    }
}
