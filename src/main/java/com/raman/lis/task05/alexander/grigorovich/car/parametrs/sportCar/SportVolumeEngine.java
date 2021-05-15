package com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar;

public enum SportVolumeEngine {
    FIVE_AND_ZERO("FIVE_AND_ZERO"),
    FIVE_AND_FOUR("FIVE_AND_FOUR");

    private String sportVolumeEngine;

    SportVolumeEngine(String sportVolumeEngine) {
        this.sportVolumeEngine = sportVolumeEngine;
    }

    public String getSportVolumeEngine() {
        return sportVolumeEngine;
    }

    @Override
    public String toString() {
        return "SportVolumeEngine{" +
                "sportVolumeEngine=" + sportVolumeEngine +
                '}';
    }
}
