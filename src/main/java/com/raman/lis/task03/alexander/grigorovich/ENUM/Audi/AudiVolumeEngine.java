package com.raman.lis.task03.alexander.grigorovich.ENUM.Audi;

public enum AudiVolumeEngine {
    ONE_AND_FOUR(1.4),
    ONE_AND_SIX(1.6),
    ONE_AND_EIGHT(1.8),
    ONE_AND_NINE(1.9),
    TWO_AND_ZERO(2.0);

    private double audiVolumeEngine;

    AudiVolumeEngine(double audiVolumeEngine) {
        this.audiVolumeEngine = audiVolumeEngine;
    }

    public Double getAudiVolumeEngine() {
        return audiVolumeEngine;
    }

    @Override
    public String toString() {
        return "AudiVolumeEngine{" +
                "audiVolumeEngine=" + audiVolumeEngine +
                '}';
    }
}
