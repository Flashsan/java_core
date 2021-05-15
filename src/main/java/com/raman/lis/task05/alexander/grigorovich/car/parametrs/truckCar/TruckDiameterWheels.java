package com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar;

public enum TruckDiameterWheels {
    TWENTY_FOUR("TWENTY_FOUR");

    private String truckDiameterWheels;

    TruckDiameterWheels(String truckDiameterWheels) {
        this.truckDiameterWheels = truckDiameterWheels;
    }

    public String getTruckDiameterWheels() {
        return truckDiameterWheels;
    }

    @Override
    public String toString() {
        return "TruckDiameterWheels{" +
                "truckDiameterWheels=" + truckDiameterWheels +
                '}';
    }
}
