package com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar;

public enum TruckVolumeEngine {

    SEVEN_AND_ZERO("SEVEN_AND_ZERO"),
    SEVEN_AND_SEVEN("SEVEN_AND_SEVEN");


    private String truckVolumeEngine;

    TruckVolumeEngine(String truckVolumeEngine) {
        this.truckVolumeEngine = truckVolumeEngine;
    }

    public String getTruckVolumeEngine() {
        return truckVolumeEngine;
    }

    @Override
    public String toString() {
        return "TruckVolumeEngine{" +
                "truckVolumeEngine=" + truckVolumeEngine +
                '}';
    }
}
