package com.raman.lis.task05.alexander.grigorovich.car.parametrs;

public enum AdditionalOptions {
    AC_SOCKET("Ac socket"),
    COMBINED_SALON("Combined salon"),
    LED_HEADLIGHTS("Led headlights"),
    RAIN_SENSOR("Rain sensor");

    private String additionalOptions;

    AdditionalOptions(String additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    public String getAdditionalOptions() {
        return additionalOptions;
    }

    @Override
    public String toString() {
        return "AdditionalOptions{" +
                "additionalOptions='" + additionalOptions + '\'' +
                '}';
    }
}
