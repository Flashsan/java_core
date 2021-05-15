package com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo;

public enum VolvoDiameterWheel {

    SIXTEENTH(16),
    SEVENTEENTH(17),
    EIGHTEENTH(18),
    NINETEENTH(19);

    private int volvoDiameterWheel;

    VolvoDiameterWheel(int volvoDiameterWheel) {
        this.volvoDiameterWheel = volvoDiameterWheel;
    }

    public int getVolvoDiameterWheel() {
        return volvoDiameterWheel;
    }

    @Override
    public String toString() {
        return "VolvoDiameterWheel{" +
                "volvoDiameterWheel=" + volvoDiameterWheel +
                '}';
    }
}
