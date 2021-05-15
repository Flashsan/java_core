package com.raman.lis.task02.alexander.grigorovich.task02;

public enum Model {

    AUDI_A3("Audi A3"),
    AUDI_A4("Audi A4"),
    AUDI_A5("Audi A5"),
    AUDI_A6("Audi A6");

    private String model;

    Model(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                '}';
    }
}
