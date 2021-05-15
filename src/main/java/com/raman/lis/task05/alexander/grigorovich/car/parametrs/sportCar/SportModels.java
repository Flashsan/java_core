package com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar;

public enum SportModels {
    AUDI_R8("AUDI_R8"),
    LAMBORGHINI_GALLARDO("LAMBORGHINI_GALLARDO");

    private String sportModels;

    SportModels(String sportModels) {
        this.sportModels = sportModels;
    }

    public String getSportModels() {
        return sportModels;
    }

    @Override
    public String toString() {
        return "SportModels{" +
                "sportModels='" + sportModels + '\'' +
                '}';
    }
}
