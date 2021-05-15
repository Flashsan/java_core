package com.raman.lis.task03.alexander.grigorovich.model;

import java.util.ArrayList;

public abstract class Car {
    private String brand;
    private String color;
    private String model;
    private int yearOfProduction;
    private int diameterOfWheels;
    private double volumeOfEngine;
    private ArrayList<String> additionalOptions = new ArrayList<>();

    public Car() {

    }

    public Car(String brand, String color, String model, int yearOfProduction,
               int diameterOfWheels, double volumeOfEngine) {

        this.brand = brand;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.diameterOfWheels = diameterOfWheels;
        this.volumeOfEngine = volumeOfEngine;
    }

    public Car(String brand, String color, String model,
               int yearOfProduction, int diameterOfWheels, double volumeOfEngine,
               ArrayList<String> additionalOptions) {

        this.brand = brand;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.diameterOfWheels = diameterOfWheels;
        this.volumeOfEngine = volumeOfEngine;
        this.additionalOptions = additionalOptions;
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

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
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

    public void setVolumeOfEngine(double volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    public ArrayList<String> getAdditionalOptions() {
        return additionalOptions;
    }

    public void setAdditionalOptions(ArrayList<String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void addOptions(String string) {
        additionalOptions.add(string);
    }

    public void removeOptions(String string) {
        additionalOptions.remove(string);
    }

    public void info() {
        System.out.println("Information about car: ");
        System.out.println(" brand = " + brand);
        System.out.println(" color = " + color);
        System.out.println(" model = " + model);
        System.out.println(" yearOfProduction = " + yearOfProduction);
        System.out.println(" diameterOfWheels = " + diameterOfWheels);
        System.out.println(" volumeOfEngine = " + volumeOfEngine);
        System.out.println(" additionalOptions = " + additionalOptions);
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
