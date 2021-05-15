package com.raman.lis.task03.alexander.grigorovich.ENUM.Audi;

public enum AudiAdditionalOptions {

    AC_SOCKET("Ac socket"),
    COMBINED_SALON("Combined salon");

    private String audiAdditionalOptions;

    AudiAdditionalOptions(String audiAdditionalOptions) {
        this.audiAdditionalOptions = audiAdditionalOptions;
    }

    public String getAudiAdditionalOptions() {

        return audiAdditionalOptions;
    }

    @Override
    public String toString() {
        return "AudiAdditionalOptions{" +
                "audiAdditionalOptions='" + audiAdditionalOptions + '\'' +
                '}';
    }
}
