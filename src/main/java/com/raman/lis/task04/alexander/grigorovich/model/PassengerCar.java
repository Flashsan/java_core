package com.raman.lis.task04.alexander.grigorovich.model;


import java.util.ArrayList;

public class PassengerCar extends Car {

    public PassengerCar(String brand, String color, String model, int yearOfProduction,
                        int diameterOfWheels, double volumeOfEngine) {

        super(brand, color, model, yearOfProduction, diameterOfWheels,
                volumeOfEngine);
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
                ", additionalOptions=" + getAdditionalOptions() +
                '}';
    }

}
