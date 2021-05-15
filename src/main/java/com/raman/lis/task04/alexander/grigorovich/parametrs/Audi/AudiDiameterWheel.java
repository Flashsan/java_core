package com.raman.lis.task04.alexander.grigorovich.parametrs.Audi;

public enum AudiDiameterWheel {

    SIXTEENTH(16),
    SEVENTEENTH(17),
    EIGHTEENTH(18),
    NINETEENTH(19);

    private int audiDiameterWheel;

    AudiDiameterWheel(int  audiDiameterWheel) {
        this. audiDiameterWheel =  audiDiameterWheel;
    }

    public int getAudiDiameterWheel() {
        return  audiDiameterWheel;
    }

    @Override
    public String toString() {
        return "AudiDiameterWheel{" +
                "audiDiameterWheel=" + audiDiameterWheel +
                '}';
    }
}
