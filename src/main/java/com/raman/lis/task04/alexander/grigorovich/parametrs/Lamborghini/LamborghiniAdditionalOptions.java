package com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini;

public enum LamborghiniAdditionalOptions {

    RAIN_SENSOR("Rain sensor");

    private String lamborghiniAdditionalOptions;

    LamborghiniAdditionalOptions(String lamborghiniAdditionalOptions) {
        this.lamborghiniAdditionalOptions = lamborghiniAdditionalOptions;
    }

    public String getLamborghiniAdditionalOptions() {
        return lamborghiniAdditionalOptions;
    }

    @Override
    public String toString() {
        return "LamborghiniAdditionalOptions{" +
                "lamborghiniAdditionalOptions='" + lamborghiniAdditionalOptions + '\'' +
                '}';
    }
}
