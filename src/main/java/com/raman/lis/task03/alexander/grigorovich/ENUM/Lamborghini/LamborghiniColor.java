package com.raman.lis.task03.alexander.grigorovich.ENUM.Lamborghini;

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
