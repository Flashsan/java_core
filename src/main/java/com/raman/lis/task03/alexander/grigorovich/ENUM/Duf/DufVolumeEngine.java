package com.raman.lis.task03.alexander.grigorovich.ENUM.Duf;

public enum DufVolumeEngine {
    FOUR_AND_THREE(4.3),
    FIVE_AND_NINE(5.9),
    TWELVE(12);

    private double dufVolumeEngine;

    DufVolumeEngine(double dufVolumeEngine) {
        this.dufVolumeEngine = dufVolumeEngine;
    }

    public Double getDufVolumeEngine() {
        return dufVolumeEngine;
    }

    @Override
    public String toString() {
        return "DufVolumeEngine{" +
                "dufVolumeEngine=" + dufVolumeEngine +
                '}';
    }
}
