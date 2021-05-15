package com.raman.lis.task05.alexander.grigorovich.car.parametrs;

public enum Color {
    BLACK("BLACK"),
    WHITE("WHITE"),
    RED("RED"),
    GOLD("GOLD");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
