package com.raman.lis.task03.alexander.grigorovich.ENUM.Lamborghini;

public enum LamborghiniVolumeEngine {

    FIVE_AND_ZERO(5.0),
    FIVE_AND_FOUR(5.4);

    private double lamborghiniVolumeEngine;

    LamborghiniVolumeEngine(double lamborghiniVolumeEngine) {
        this.lamborghiniVolumeEngine = lamborghiniVolumeEngine;
    }

    public Double getLamborghiniVolumeEngine() {
        return lamborghiniVolumeEngine;
    }

    @Override
    public String toString() {
        return "LamborghiniVolumeEngine{" +
                "lamborghiniVolumeEngine=" + lamborghiniVolumeEngine +
                '}';
    }
}
