package com.raman.lis.task04.alexander.grigorovich.model;

import java.util.ArrayList;

public class SportCar extends Car {

    private int numberOfSeats;
    private int weightSportCar;

    public SportCar(String brand, String color, String model,
                    int yearOfProduction, int diameterOfWheels,
                    double volumeOfEngine, int numberOfSeats,
                    int weightSportCar) {

        super(brand, color, model, yearOfProduction,
                diameterOfWheels, volumeOfEngine);
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
        stringBuffer.append("Information about car:\n")
                .append("brand: ")
                .append(getBrand())
                .append(",\n")
                .append("color: ")
                .append(getColor())
                .append(",\n")
                .append("yearOfProduction: ")
                .append(getYearOfProduction())
                .append(",\n")
                .append("volumeOfEngine: ")
                .append(getVolumeOfEngine())
                .append(",\n")
                .append("numberOfSeats: ")
                .append(numberOfSeats)
                .append(",\n")
                .append("weightSportCar: ")
                .append(weightSportCar)
                .append(",\n");
        if (getAdditionalOptions().size() > 0) {
            stringBuffer.append("additionalOptions: ")
                    .append(getAdditionalOptions())
                    .append(",\n");
        } else {
            stringBuffer.append("Car don't have additional options. ")
                    .append("\n");
        }

        System.out.println(stringBuffer);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", diameterOfWheels=" + getDiameterOfWheels() +
                ", volumeOfEngine=" + getVolumeOfEngine() +
                ", numberOfSeats=" + numberOfSeats +
                ", weightSportCar=" + weightSportCar +
                ", additionalOptions=" + getAdditionalOptions() +
                '}';
    }

}
