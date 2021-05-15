package com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini;

public enum LamborghiniModel {


    LAMBORGHINI_GALLARDO("Lamborghini Gallardo");

    private String lamborghiniModel;

    LamborghiniModel(String lamborghiniModel) {
        this.lamborghiniModel = lamborghiniModel;
    }

    public String getLamborghiniModel() {
        return lamborghiniModel;
    }

    @Override
    public String toString() {
        return "LamborghiniModel{" +
                "lamborghiniModel='" + lamborghiniModel + '\'' +
                '}';
    }
}
