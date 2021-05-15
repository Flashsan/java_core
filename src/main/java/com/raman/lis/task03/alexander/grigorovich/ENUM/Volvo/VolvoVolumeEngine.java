package com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo;

public enum VolvoVolumeEngine {

    TWO_AND_THREE(2.3),
    TWO_AND_FOUR(2.4),
    TWO_AND_FIVE(2.5);

    private double volvoVolumeEngine;

    VolvoVolumeEngine(double volvoVolumeEngine) {
        this.volvoVolumeEngine = volvoVolumeEngine;
    }

    public Double getVolvoVolumeEngine() {
        return volvoVolumeEngine;
    }

    @Override
    public String toString() {
        return "VolvoVolumeEngine{" +
                "volvoVolumeEngine=" + volvoVolumeEngine +
                '}';
    }
}
