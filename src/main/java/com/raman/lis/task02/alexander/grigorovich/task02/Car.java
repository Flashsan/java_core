package com.raman.lis.task02.alexander.grigorovich.task02;

import java.util.Arrays;
import java.util.Objects;

public class Car {

    private String color;
    private String model;
    private int productionYear;
    private int diameterWheel;
    private double volumeEngine;
    private String[] additionalOptions;

    public Car() {

    }

    public Car(String color, String model,int productionYear, int diameterWheel,
               double volumeEngine) {
        this.color = color;
        this.model = model;
        this.productionYear = productionYear;
        this.diameterWheel = diameterWheel;
        this.volumeEngine = volumeEngine;

    }

    public Car(String color, String model,int productionYear, int diameterWheel,
               double volumeEngine, String... additionalOptions) {
        this.color = color;
        this.model = model;
        this.productionYear = productionYear;
        this.diameterWheel = diameterWheel;
        this.volumeEngine = volumeEngine;
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

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getDiameterWheel() {
        return diameterWheel;
    }

    public void setDiameterWheel(int diameterWheel) {
        this.diameterWheel = diameterWheel;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public String[] getAdditionalOptions() {
        return additionalOptions;
    }

    public void setAdditionalOptions(String[] additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    void addAdditionalOption(String addOption) {
        String[] array = Arrays.copyOf(additionalOptions, additionalOptions.length + 1);
        additionalOptions = array;
        additionalOptions[additionalOptions.length - 1] = addOption;
    }

    void removeAdditionalOption(String removeOption) {
        for (int i = 0; i < additionalOptions.length; i++) {
            if (additionalOptions[i].equalsIgnoreCase(removeOption)) {
                for (int j = 0; j < additionalOptions.length - 1; j++) {
                    additionalOptions[j] = additionalOptions[j + 1];
                }
                String[] array = Arrays.copyOf(additionalOptions, additionalOptions.length - 1);
                additionalOptions = array;

            }
        }

    }

    void printInfoAboutCar() {
        System.out.println("Info about car: ");
        System.out.println("color: " + color +
                ", model=" + model +
                ", productionYear=" + productionYear +
                ", diameterWheel=" + diameterWheel +
                ", volumeEngine=" + volumeEngine +
                ", additionalOptions=" + Arrays.toString(additionalOptions));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear
                && diameterWheel == car.diameterWheel
                && Double.compare(car.volumeEngine, volumeEngine) == 0
                && Objects.equals(color, car.color)
                && Objects.equals(model, car.model)
                && Arrays.equals(additionalOptions, car.additionalOptions);
    }

}
