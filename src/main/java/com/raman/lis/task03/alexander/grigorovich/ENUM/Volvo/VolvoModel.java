package com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo;

public enum VolvoModel {

    VOLVO_S60("Volvo s60"),
    VOLVO_S80("Volvo s80"),
    VOLVO_V70("Volvo v70"),
    VOLVO_FN("Volvo Fn");

    private String volvoModel;

    VolvoModel(String volvoModel) {
        this.volvoModel = volvoModel;
    }

    public String getVolvoModel() {
        return volvoModel;
    }

    @Override
    public String toString() {
        return "VolvoModel{" +
                "volvoModel='" + volvoModel + '\'' +
                '}';
    }
}
