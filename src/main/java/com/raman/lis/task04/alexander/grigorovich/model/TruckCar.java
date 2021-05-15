package com.raman.lis.task04.alexander.grigorovich.model;

import java.util.ArrayList;

public class TruckCar extends Car {

    private int liftingCapacity;

    public TruckCar(String brand, String color, String model, int yearOfProduction,
                    int diameterOfWheels, double volumeOfEngine, int liftingCapacity) {

        super(brand, color, model, yearOfProduction,
                diameterOfWheels, volumeOfEngine);
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
                .append("liftingCapacity: ")
                .append(liftingCapacity)
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
        return "PassengerCar{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", diameterOfWheels=" + getDiameterOfWheels() +
                ", volumeOfEngine=" + getVolumeOfEngine() +
                ", liftingCapacity: " + liftingCapacity +
                ", additionalOptions=" + getAdditionalOptions() +
                '}';
    }
}
