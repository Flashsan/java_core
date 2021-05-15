package com.raman.lis.task02.alexander.grigorovich.task02;

public enum DiameterWheel {
    THIRTEENTH(13),
    FOURTEENTH(14),
    FIFTEENTH(15),
    SIXTEENTH(16),
    SEVENTEENTH(17),
    EIGHTEENTH(18),
    NINETEENTH(19);

    private int diameterWheel;

    DiameterWheel(int diameterWheel) {
        this.diameterWheel = diameterWheel;
    }

    public int getDiameterWheel() {
        return diameterWheel;
    }

    @Override
    public String toString() {
        return "DiameterWheel{" +
                "diameterWheel=" + diameterWheel +
                '}';
    }
}
