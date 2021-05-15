package com.raman.lis.task04.alexander.grigorovich.parametrs.Duf;

public enum DufColor {

    GREEN("Green"),
    WHITE("White"),
    BLACK("Black");

    private String dufColor;

    DufColor(String dufColor) {
        this.dufColor = dufColor;
    }

    public String getDufColor() {
        return dufColor;
    }

    @Override
    public String toString() {
        return "DufColor{" +
                "dufColor='" + dufColor + '\'' +
                '}';
    }
}
