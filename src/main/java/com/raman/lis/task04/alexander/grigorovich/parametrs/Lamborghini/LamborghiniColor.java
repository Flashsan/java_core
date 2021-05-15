package com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini;

public enum LamborghiniColor {

    RED("Red");

    private String lamborghiniColor;

    LamborghiniColor(String lamborghiniColor) {
        this.lamborghiniColor = lamborghiniColor;
    }

    public String getLamborghiniColor() {
        return lamborghiniColor;
    }

    @Override
    public String toString() {
        return "LamborghiniColor{" +
                "lamborghiniColor='" + lamborghiniColor + '\'' +
                '}';
    }
}
