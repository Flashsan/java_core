package com.raman.lis.task02.alexander.grigorovich.task02;

public enum Color {

    GREEN("Green"),
    BLUE("Blue"),
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    BLACK_GOLD("Black-Gold");

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
