package com.raman.lis.task02.alexander.grigorovich.task02;

public enum VolumeEngine {
    ONE_AND_FOUR(1.4),
    ONE_AND_SIX(1.6),
    ONE_AND_EIGHT(1.8),
    ONE_AND_NINE(1.9),
    ONE_AND_ZERO(2.0);

    private double volumeEngine;

    VolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public Double getVolumeEngine() {
        return volumeEngine;
    }

    @Override
    public String toString() {
        return "VolumeEngine{" +
                "volumeEngine=" + volumeEngine +
                '}';
    }
}
