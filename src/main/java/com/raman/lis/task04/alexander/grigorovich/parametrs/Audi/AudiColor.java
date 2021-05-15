package com.raman.lis.task04.alexander.grigorovich.parametrs.Audi;

public enum AudiColor {

    BLACK("Black"),
    WHITE("White"),
    BLACK_GOLD("Black-Gold");

    private String audiColor;

    AudiColor(String audiColor) {
        this.audiColor = audiColor;
    }

    public String getAudiColor() {
        return audiColor;
    }

    @Override
    public String toString() {
        return "AudiColor{" +
                "audiColor='" + audiColor + '\'' +
                '}';
    }
}
