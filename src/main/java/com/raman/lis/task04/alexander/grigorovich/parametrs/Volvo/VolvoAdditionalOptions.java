package com.raman.lis.task04.alexander.grigorovich.parametrs.Volvo;

public enum VolvoAdditionalOptions {

    AC_SOCKET("Ac socket"),
    LED_HEADLIGHTS("Led headlights"),
    COMBINED_SALON("Combined salon");

    private String volvoAdditionalOptions;

    VolvoAdditionalOptions(String volvoAdditionalOptions){
        this.volvoAdditionalOptions = volvoAdditionalOptions;
    }

    public String getVolvoAdditionalOptions() {
        return volvoAdditionalOptions;
    }

    @Override
    public String toString() {
        return "VolvoAdditionalOptions{" +
                "volvoAdditionalOptions='" + volvoAdditionalOptions + '\'' +
                '}';
    }
}
