package com.raman.lis.task05.alexander.grigorovich.exception;

public class CarException extends Exception {

    private String abstractCar;

    public CarException(String abstractCar) {
        this.abstractCar = abstractCar;
    }

    @Override
    public String toString() {
        return "AbstractCar[" + abstractCar + "]";
    }
}
