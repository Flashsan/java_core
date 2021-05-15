package com.raman.lis.task04.alexander.grigorovich.service;

import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;


public class ChangeColorService extends Service implements ChangeColorServiceInterface {

    @Override
    public void changeColor(AbstractCar abstractCar, String color) throws CarException {
        if (abstractCar == null) {
            throw new CarException("Car not found");
        } else {
            abstractCar.setColor(color);
        }
    }




}
