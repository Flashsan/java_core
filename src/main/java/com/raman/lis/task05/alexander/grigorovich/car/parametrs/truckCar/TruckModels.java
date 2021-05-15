package com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar;

public enum TruckModels {
    VOLVO_FN("Volvo Fn");

    private String truckModels;

    TruckModels(String truckModels) {
        this.truckModels = truckModels;
    }

    public String getTruckModels() {
        return truckModels;
    }

    @Override
    public String toString() {
        return "TruckModels{" +
                "truckModels='" + truckModels + '\'' +
                '}';
    }
}
