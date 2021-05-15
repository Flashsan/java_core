package com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar;

public enum SportDiameterWheels {
    TWENTY_FIRST("TWENTY_FIRST");

    private String sportDiameterWheels;

    SportDiameterWheels(String sportDiameterWheels) {
        this.sportDiameterWheels = sportDiameterWheels;
    }

    public String getSportDiameterWheels() {
        return sportDiameterWheels;
    }

    @Override
    public String toString() {
        return "SportDiameterWheels{" +
                "sportDiameterWheels=" + sportDiameterWheels +
                '}';
    }
}
