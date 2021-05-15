package com.raman.lis.task04.alexander.grigorovich.model;

import java.util.ArrayList;

public abstract class Car {

    private final String brand;
    private String color;
    private final String model;
    private final int yearOfProduction;
    private int diameterOfWheels;
    private final double volumeOfEngine;
    private ArrayList<String> additionalOptions = new ArrayList<>();

    StringBuffer stringBuffer = new StringBuffer();

    public Car(String brand, String color, String model,
               int yearOfProduction, int diameterOfWheels, double volumeOfEngine) {

        this.brand = brand;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.diameterOfWheels = diameterOfWheels;
        this.volumeOfEngine = volumeOfEngine;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getDiameterOfWheels() {
        return diameterOfWheels;
    }

    public void setDiameterOfWheels(int diameterOfWheels) {
        this.diameterOfWheels = diameterOfWheels;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public ArrayList<String> getAdditionalOptions() {
        return additionalOptions;
    }

    public void setAdditionalOptions(ArrayList<String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    public void addOptions(String option) {
        additionalOptions.add(option);
    }

    public void removeOptions(String option) {
        additionalOptions.remove(option);
    }

    public void info() {
                        stringBuffer.append("Information about car:\n")
                        .append("brand: ")
                        .append(brand)
                        .append(",\n")
                        .append("color: ")
                        .append(color)
                        .append(",\n")
                        .append("yearOfProduction: ")
                        .append(yearOfProduction)
                        .append(",\n")
                        .append("volumeOfEngine: ")
                        .append(volumeOfEngine)
                        .append(",\n");
        if (additionalOptions.size() > 0) {
                    stringBuffer.append("additionalOptions: ")
                            .append(additionalOptions)
                            .append(",\n");
        } else {
                    stringBuffer.append("Car don't have additional options: ")
                            .append(",\n");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", diameterOfWheels=" + diameterOfWheels +
                ", volumeOfEngine=" + volumeOfEngine +
                ", additionalOptions=" + additionalOptions +
                '}';
    }

}
