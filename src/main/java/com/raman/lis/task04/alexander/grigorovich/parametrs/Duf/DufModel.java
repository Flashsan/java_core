package com.raman.lis.task04.alexander.grigorovich.parametrs.Duf;

public enum DufModel {

    DUF_XF_105("Duf XF 105"),
    DUF_XF_106("Duf XF 106"),
    DUF_XF_440("Duf XF 440");

    private String dufModel;

    DufModel(String dufModel) {
        this.dufModel = dufModel;
    }

    public String getDufModel() {
        return dufModel;
    }

    @Override
    public String toString() {
        return "DufModel{" +
                "dufModel='" + dufModel + '\'' +
                '}';
    }
}
