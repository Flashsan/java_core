package com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini;

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
