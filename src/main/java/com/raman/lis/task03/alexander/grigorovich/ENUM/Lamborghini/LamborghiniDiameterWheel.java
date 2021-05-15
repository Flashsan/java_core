package com.raman.lis.task03.alexander.grigorovich.ENUM.Lamborghini;

public enum LamborghiniDiameterWheel {

    TWENTY_FIRST(19);

    private int lamborghiniDiameterWheel;

    LamborghiniDiameterWheel(int lamborghiniDiameterWheel) {
        this.lamborghiniDiameterWheel = lamborghiniDiameterWheel;
    }

    public int getLamborghiniDiameter() {
        return lamborghiniDiameterWheel;
    }

    @Override
    public String toString() {
        return "LamborghiniDiameterWheel{" +
                "lamborghiniDiameterWheel=" + lamborghiniDiameterWheel +
                '}';
    }
}
