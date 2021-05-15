package com.raman.lis.task05.alexander.grigorovich.car.service;

import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.service.serviceInterface.ChangeColorServiceInterface;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

public class ChangeColorService extends Service implements ChangeColorServiceInterface {


    @Override
    public void infoAboutService() {
        System.out.println("Address color service.");
    }

    @Override
    public AbstractCar changeColor(AbstractCar abstractCar, String color) throws CarException {
        if (abstractCar == null) {
            throw new CarException("Car not found");
        } else {
            abstractCar.setColor(color);
            return abstractCar;
        }

    }

}
