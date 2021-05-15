package com.raman.lis.task02.alexander.grigorovich.task02;

public enum AdditionalOptions {

    AC_SOCKET("Ac socket"),
    LED_HEADLIGHTS("Led headlights"),
    TOWBAR("Towbar"),
    RAIN_SENSOR("Rain sensor"),
    BLUETOOTH("Bluetooth"),
    PARKTRONIC("Parktronic"),
    COMBINED_SALON("Combined salon");

    private String additionalOptions;

    AdditionalOptions (String additionalOptions){
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
