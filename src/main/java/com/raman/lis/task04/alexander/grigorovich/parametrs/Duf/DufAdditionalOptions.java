package com.raman.lis.task04.alexander.grigorovich.parametrs.Duf;

public enum DufAdditionalOptions {

    AC_SOCKET("Ac socket"),
    LED_HEADLIGHTS("Led headlights");

    private String dufAdditionalOptions;

    DufAdditionalOptions(String dufAdditionalOptions){
        this.dufAdditionalOptions = dufAdditionalOptions;
    }

    public String getDufAdditionalOptions() {
        return dufAdditionalOptions;
    }

    @Override
    public String toString() {
        return "DufAdditionalOptions{" +
                "dufAdditionalOptions='" + dufAdditionalOptions + '\'' +
                '}';
    }
}
