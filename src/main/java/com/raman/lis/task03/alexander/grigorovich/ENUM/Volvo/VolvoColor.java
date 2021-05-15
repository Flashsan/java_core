package com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo;

public enum VolvoColor {

    WHITE("White"),
    BLACK("Black");

    private String volvoColor;

    VolvoColor(String volvoColor) {
        this.volvoColor = volvoColor;
    }

    public String getVolvoColor() {
        return volvoColor;
    }

    @Override
    public String toString() {
        return "VolvoColor{" +
                "volvoColor='" + volvoColor + '\'' +
                '}';
    }
}
