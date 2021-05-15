package com.raman.lis.task05.alexander.grigorovich.car;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class AbstractCar implements Serializable {

    private final String model;
    private final int yearOfProduction;
    private final String volumeOfEngine;

    private String color;
    private String diameterOfWheels;
    private ArrayList<String> additionalOptions;

    public AbstractCar(String color, String model,
                       int yearOfProduction, String diameterOfWheels, String volumeOfEngine) {

        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.diameterOfWheels = diameterOfWheels;
        this.volumeOfEngine = volumeOfEngine;
    }

    public AbstractCar(String color, String model,
                       int yearOfProduction, String diameterOfWheels,
                       String volumeOfEngine, ArrayList<String> additionalOptions) {

        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.diameterOfWheels = diameterOfWheels;
        this.volumeOfEngine = volumeOfEngine;
        this.additionalOptions = additionalOptions;
    }

    public void addOptions(String option) {
        additionalOptions.add(option);
    }

    public void removeOptions(String option) {
        additionalOptions.remove(option);
    }

    public abstract void infoForPrint();

    @Override
    public String toString() {
        return "Car{" +
                "color='" + getColor() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", diameterOfWheels=" + getDiameterOfWheels() +
                ", volumeOfEngine=" + getVolumeOfEngine() +
                ", additionalOptions=" + getAdditionalOptions() +
                '}';
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

    public String getDiameterOfWheels() {
        return diameterOfWheels;
    }

    public void setDiameterOfWheels(String diameterOfWheels) {
        this.diameterOfWheels = diameterOfWheels;
    }

    public String getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public ArrayList<String> getAdditionalOptions() {
        return additionalOptions;
    }

    public void setAdditionalOptions(ArrayList<String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

}
