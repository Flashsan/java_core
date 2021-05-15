package com.raman.lis.task03.alexander.grigorovich.ENUM.Duf;

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
