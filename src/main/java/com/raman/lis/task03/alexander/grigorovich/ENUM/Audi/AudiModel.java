package com.raman.lis.task03.alexander.grigorovich.ENUM.Audi;

public enum AudiModel {

    AUDI_A3("Audi A3"),
    AUDI_A4("Audi A4"),
    AUDI_A5("Audi A5"),
    AUDI_A6("Audi A6");

    private String audiModel;

    AudiModel(String audiModel) {
        this.audiModel = audiModel;
    }

    public String getAudiModel() {
        return audiModel;
    }

    @Override
    public String toString() {
        return "AudiModel{" +
                "audiModel='" + audiModel + '\'' +
                '}';
    }
}
