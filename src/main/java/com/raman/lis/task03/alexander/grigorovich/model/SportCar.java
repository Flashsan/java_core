package com.raman.lis.task03.alexander.grigorovich.model;

import com.raman.lis.task03.alexander.grigorovich.model.Car;

import java.util.ArrayList;

public class SportCar extends Car {

    private int numberOfSeats;
    private int weightSportCar;

    public SportCar() {

    }

    public SportCar(String brand, String color, String model, int yearOfProduction,
                    int diameterOfWheels, double volumeOfEngine,
                    int numberOfSeats, int weightSportCar) {

        super(brand, color, model, yearOfProduction,
                diameterOfWheels, volumeOfEngine);
        this.numberOfSeats = numberOfSeats;
        this.weightSportCar = weightSportCar;
    }

    public SportCar(String brand, String color, String model, int yearOfProduction,
                    int diameterOfWheels, double volumeOfEngine,
                    int numberOfSeats, int weightSportCar, ArrayList<String> additionalOptions) {

        super(brand, color, model, yearOfProduction, diameterOfWheels,
                volumeOfEngine, additionalOptions);
        this.numberOfSeats = numberOfSeats;
        this.weightSportCar = weightSportCar;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getWeightSportCar() {
        return weightSportCar;
    }

    public void setWeightSportCar(int weightSportCar) {
        this.weightSportCar = weightSportCar;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("numberOfSeats = " + numberOfSeats);
        System.out.println("weightSportCar = " + weightSportCar);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                super.toString() +
                "numberOfSeats=" + numberOfSeats +
                ", weightSportCar=" + weightSportCar +
                '}';
    }
}
